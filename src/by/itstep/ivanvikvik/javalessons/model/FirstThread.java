package by.itstep.ivanvikvik.javalessons.model;

public class FirstThread extends Thread {

    private int number;

    public FirstThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("start child thread");
        for (int i = 0; i < 20; i++) {
            System.out.println(number + " - child thread is running...");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exception) {
                System.out.println(exception);
            }
        }
        System.out.println("end child thread.");
    }
}
