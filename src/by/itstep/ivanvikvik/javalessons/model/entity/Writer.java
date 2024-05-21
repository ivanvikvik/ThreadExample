package by.itstep.ivanvikvik.javalessons.model.entity;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

public class Writer implements Runnable {
    private Thread thread;
    private String text;
    private Printer printer;
    private Lock lock;

    public Writer(String text, Printer printer, Lock lock) {
        thread = new Thread(this);
        this.printer = printer;
        this.text = text;
        this.lock = lock;
        thread.start();
    }

    @Override
    public void run() {
        int number = 0;
        while(true) {
            if (lock.tryLock()) {
                try {
                    printer.print(text);
                    break;
                } finally {
                    lock.unlock();
                }
            } else {
                text += " " + number++;
                try {
                    TimeUnit.MICROSECONDS.sleep(1000);
                } catch (InterruptedException exception) {
                    System.out.println(exception);
                }
            }
        }
    }
}
