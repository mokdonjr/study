class ZeroEvenOdd {
    private int n;
    private int seq = 0;

    private boolean isZeroExecuted = false;
    private boolean isEvenExecuted = false;
    private boolean isOddExecuted = false;

    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            synchronized(this) {
                while (isZeroExecuted) {
                    wait();
                }

                printNumber.accept(0);
                isZeroExecuted = true;

                notifyAll();
            }
        }
    }

    public synchronized void even(IntConsumer printNumber) throws InterruptedException {
        for (int i = 2; i <= n; i += 2) {
            synchronized(this) {
                while (!isZeroExecuted || isEvenExecuted || !isOddExecuted) {
                    wait();
                }

                printNumber.accept(i);
                isEvenExecuted = true;
                isZeroExecuted = false;
                isOddExecuted = false;

                notifyAll();
            }
        }
    }

    public synchronized void odd(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i += 2) {
            synchronized(this) {
                while (!isZeroExecuted || isOddExecuted) {
                    wait();
                }

                printNumber.accept(i);
                isOddExecuted = true;
                isZeroExecuted = false;
                isEvenExecuted = false;

                notifyAll();
            }
        }
    }
}
