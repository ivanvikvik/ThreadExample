package by.itstep.ivanvikvik.javalessons.model.entity;

public class Writer implements Runnable {
    private Thread thread;
    private String text;

    public Writer(String text) {
        thread = new Thread(this);
        this.text = text;
        //thread.start();
    }

    @Override
    public void run() {
        Printer.print(text);
    }
}
