package pcd.lab04.deadlock;

import java.util.concurrent.locks.Lock;

public class MyWorkerB extends Worker {

    private Lock lock1, lock2;

    public MyWorkerB(String name, Lock lock1, Lock lock2) {
        super(name);
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    public void run() {
        while (true) {
            try {
                lock2.lock();
                lock1.lock();
                System.out.println("Worker B");
                lock1.unlock();
                lock2.unlock();
            } catch (Exception e) {

            }
        }
    }
}

