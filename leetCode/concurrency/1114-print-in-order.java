class Foo {

    boolean isFirstCalled = false;
    boolean isSecondCalled = false;
    boolean isThirdCalled = false;

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        isFirstCalled = true;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (!isFirstCalled);
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        isSecondCalled = true;
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (!isSecondCalled || !isFirstCalled);
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
        isThirdCalled = true;
    }
}