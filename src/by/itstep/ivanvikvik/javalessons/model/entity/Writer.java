package by.itstep.ivanvikvik.javalessons.model.entity;

public class Writer implements Runnable {
    private Thread thread;
    private String text;
    private Printer printer;

    public Writer(String text, Printer printer) {
        thread = new Thread(this);
        this.printer = printer;
        this.text = text;
        thread.start();
    }

    @Override
    public void run() {
        printer.getLock().lock();
        try {
            printer.print(text);
        } finally {
            printer.getLock().unlock();
        }
    }
}
