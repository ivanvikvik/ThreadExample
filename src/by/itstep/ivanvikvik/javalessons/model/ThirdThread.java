package by.itstep.ivanvikvik.javalessons.model;

public class ThirdThread implements Runnable {
    private int number;

    public ThirdThread(int number) {
        this.number = number;
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
