class FooBar {
    private int n;
    private boolean isFooExecuted = false;

    public FooBar(int n) {
        this.n = n;
    }

    public synchronized void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {

            while (isFooExecuted) {
                wait();
            }
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            isFooExecuted = true;
            notifyAll();
        }
    }

    public synchronized void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {

            while (!isFooExecuted) {
                wait();
            }
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            isFooExecuted = false;
            notifyAll();
        }
    }
}