package pcd.lab04.deadlock;

import java.util.concurrent.locks.Lock;

public class MyWorkerA extends Worker {

    private Lock lock1, lock2;

    public MyWorkerA(String name, Lock lock, Lock lock2) {
        super(name);
        this.lock1 = lock;
        this.lock2 = lock2;
    }

    public void run() {
        while (true) {
            try {
                lock1.lock();
                lock2.lock();
                System.out.println("Worker A");
                lock2.unlock();
                lock1.unlock();
            } catch (Exception e) {

            }
        }
    }
}

