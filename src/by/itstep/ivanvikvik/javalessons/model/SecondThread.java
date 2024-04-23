package by.itstep.ivanvikvik.javalessons.model;

public class SecondThread extends Thread {

    private int number;

    public SecondThread(int number) {
        this.number = number;
        start();
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(number + " - child thread is running...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException exception) {
                System.out.println(exception);
            }
        }
    }
}
