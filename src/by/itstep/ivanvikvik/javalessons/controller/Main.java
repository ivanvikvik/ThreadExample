package by.itstep.ivanvikvik.javalessons.controller;

import by.itstep.ivanvikvik.javalessons.model.FirstThread;
import by.itstep.ivanvikvik.javalessons.model.FourthThread;
import by.itstep.ivanvikvik.javalessons.model.SecondThread;
import by.itstep.ivanvikvik.javalessons.model.ThirdThread;
import by.itstep.ivanvikvik.javalessons.model.entity.Writer;

public class Main {
    public static void main(String[] args) throws InterruptedException{
//        System.out.println("start main thread");
//        Thread main = Thread.currentThread();
//
//        System.out.println("Name: " + main.getName());
//        System.out.println("Group: " + main.getThreadGroup().getName());
//        System.out.println("Priority: " + main.getPriority());

//        FirstThread thread1 = new FirstThread(1);
//        FirstThread thread2 = new FirstThread(2);
//        FirstThread thread3 = new FirstThread(3);

//        thread1.start();
//        thread2.start();
//        thread3.start();
//
//        while(thread1.isAlive() || thread2.isAlive()) {
//            Thread.sleep(2000);
//        }

//        thread1.join();
//        thread2.join();

//
//        thread1.suspend();
//
//        Thread.sleep(2000);
//
//        thread1.interrupt();
//        thread2.interrupt();

//        thread1.resume();
//
//
//        thread1.stop();


//        SecondThread thread1 = new SecondThread(1);
//        SecondThread thread2 = new SecondThread(2);
//        SecondThread thread3 = new SecondThread(3);

//        ThirdThread thread1 = new ThirdThread(1);
//        ThirdThread thread2 = new ThirdThread(2);
//        ThirdThread thread3 = new ThirdThread(3);
//
//        Thread threadO1 = new Thread(thread1);
//        Thread threadO2 = new Thread(thread2);
//        Thread threadO3 = new Thread(thread3);
//
//        threadO1.start();
//        threadO2.start();
//        threadO3.start();
//
//        new Thread(new ThirdThread(10)).start();

//        FourthThread thread1 = new FourthThread(1);
//        FourthThread thread2 = new FourthThread(2);
//        FourthThread thread3 = new FourthThread(3);
//
//
//
//        System.out.println("end main thread");

        String[] texts = {"FIRST writer", "SECOND writer","THIRD writer",
                "FOURTH writer", "FIFTH writer"};

        for (int i = 0; i < texts.length; i++) {
            new Writer(texts[i]).run();
        }

    }
}
