import java.util.*;

class DiningPhilosophers {

    // K : forkNum
    // V : locking philosoper's id
    private Map<Integer, Integer> lockMap;
    private Object instanceLock = new Object();

    public DiningPhilosophers() {
        lockMap = new HashMap<>();
    }

    // call the run() method of any runnable to execute its code
    public void wantsToEat(int philosopher,
                           Runnable pickLeftFork,
                           Runnable pickRightFork,
                           Runnable eat,
                           Runnable putLeftFork,
                           Runnable putRightFork) throws InterruptedException {

        synchronized(instanceLock) {
            int forkNumLeft = getForkNumLeft(philosopher);
            Integer lockingPhilosopherLeft = lockMap.get(forkNumLeft);

            int forkNumRight = getForkNumRight(philosopher);
            Integer lockingPhilosopherRight = lockMap.get(forkNumRight);

            if (lockingPhilosopherLeft == null && lockingPhilosopherRight == null) {
                lockMap.put(forkNumLeft, philosopher);
                pickLeftFork.run();
                lockMap.put(forkNumRight, philosopher);
                pickRightFork.run();
                eat.run();
                putLeftFork.run();
                lockMap.remove(forkNumLeft);
                putRightFork.run();
                lockMap.remove(forkNumRight);
                instanceLock.notifyAll();
            } else {
                instanceLock.wait();
            }
        }

    }

    private int getForkNumLeft(int philosopherId) {
        return philosopherId;
    }

    private int getForkNumRight(int philosopherId) {
        int num = philosopherId - 1;
        if (num < 0)
            num = 4;
        return num;
    }
}