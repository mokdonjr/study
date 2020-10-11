class FizzBuzz {
    enum FizzBuzzState {
        NONE, FIZZ, BUZZ, FIZZBUZZ;
    }

    private int n;
    private FizzBuzzState[] states;
    private Object lock = new Object();
    private int seq = 0;

    public FizzBuzz(int n) {
        this.n = n;

        states = new FizzBuzzState[n];

        for (int i = 0; i < n; i++) {

            int number = i + 1;
            boolean isFizz = number % 3 == 0;
            boolean isBuzz = number % 5 == 0;

            if (isFizz && isBuzz) {
                states[i] = FizzBuzzState.FIZZBUZZ;
            } else if (isFizz) {
                states[i] = FizzBuzzState.FIZZ;
            } else if (isBuzz) {
                states[i] = FizzBuzzState.BUZZ;
            } else {
                states[i] = FizzBuzzState.NONE;
            }
        }
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        while (seq < n) {
            synchronized(lock) {
                while (states[seq] != FizzBuzzState.FIZZ) {
                    lock.wait();
                    if (seq >= n)
                        return;
                }

                printFizz.run();
                seq++;

                lock.notifyAll();
            }
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        while (seq < n) {
            synchronized(lock) {
                while (states[seq] != FizzBuzzState.BUZZ) {
                    lock.wait();
                    if (seq >= n)
                        return;
                }

                printBuzz.run();
                seq++;

                lock.notifyAll();
            }
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while (seq < n) {
            synchronized(lock) {
                while (states[seq] != FizzBuzzState.FIZZBUZZ) {
                    lock.wait();
                    if (seq >= n)
                        return;
                }

                printFizzBuzz.run();
                seq++;

                lock.notifyAll();
            }
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        while (seq < n) {
            synchronized(lock) {
                while (states[seq] != FizzBuzzState.NONE) {
                    lock.wait();
                    if (seq >= n)
                        return;
                }

                printNumber.accept(seq + 1);
                seq++;

                lock.notifyAll();
            }
        }
    }
}