class H2O {

    private int oCount = 0;
    private int hCount = 0;
    private Object lock = new Object();

    public H2O() {

    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        synchronized(lock) {
            while (hCount >= 2) {
                lock.wait();
            }

            // releaseHydrogen.run() outputs "H". Do not change or remove this line.
            releaseHydrogen.run();
            hCount++;

            lock.notifyAll();
        }
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        synchronized(lock) {
            while (oCount > 0 || hCount < 2) {
                lock.wait();
            }

            // releaseOxygen.run() outputs "O". Do not change or remove this line.
            releaseOxygen.run();
            oCount++;

            if (hCount == 2 && oCount == 1) {
                hCount = 0;
                oCount = 0;
            }

            lock.notifyAll();
        }
    }
}