package four;

import java.util.concurrent.TimeUnit;

class PrimeCounter implements Runnable {

    private final int x;
    private final int y;
    private volatile int counter = 0;

    public PrimeCounter(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getCounter() {
        return counter;
    }

    @Override
    public void run() {
        for (int i = x; i < y; i++) {
            if (checkPrime(i)) {
                counter++;
            }
        }
    }

    private boolean checkPrime(int x) {

        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class Main {

    public static void main(String[] args) throws InterruptedException {

        PrimeCounter primeCounter = new PrimeCounter(2, 300000);
        PrimeCounter primeCounter1 = new PrimeCounter(300001, 500000);

        Thread thread1 = new Thread(primeCounter);
        Thread thread2 = new Thread(primeCounter1);

        long start = System.nanoTime();
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        long end = System.nanoTime();

        System.out.println(primeCounter.getCounter() + primeCounter1.getCounter());
        System.out.println(TimeUnit.NANOSECONDS.toMillis(end - start) + "ms.");

    }
}