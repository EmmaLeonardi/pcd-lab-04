package pcd.lab04.deadlock;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {

        Lock lock = new ReentrantLock();
        Lock lock2 = new ReentrantLock();
        new MyWorkerB("MyAgent-01", lock, lock2).start();
        new MyWorkerA("MyAgent-02", lock, lock2).start();


    }
}
