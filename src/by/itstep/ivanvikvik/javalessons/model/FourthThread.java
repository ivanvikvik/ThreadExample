package by.itstep.ivanvikvik.javalessons.model;

public class FourthThread implements Runnable{
    private Thread thread;
    private int number;
    private volatile boolean running;

    public FourthThread(int number) {
        this.number = number;
        running = true;
        thread = new Thread(this);
        thread.setDaemon(true);
        thread.start();
    }

    @Override
    public void run() {
        while (running) {
            System.out.println(number + " - child thread is running...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException exception) {
                System.out.println(exception);
            }
        }
    }

    public void stop(){
        running = false;
    }

    public Thread getThread() {
        return thread;
    }
}
