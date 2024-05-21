package by.itstep.ivanvikvik.javalessons.model.entity;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Printer {
    private static final Random RANDOM;
    private static final int BOUND = 100;

    static {
        RANDOM = new Random();
    }

    public void print(String text) {
        try {
            System.out.print("[");

            TimeUnit.MICROSECONDS.sleep(RANDOM.nextInt(BOUND));

            for (int i = 0; i < text.length(); i++) {
                System.out.print(text.charAt(i));
                TimeUnit.MICROSECONDS.sleep(RANDOM.nextInt(BOUND));
            }

            TimeUnit.MICROSECONDS.sleep(RANDOM.nextInt(BOUND));
            System.out.println("]");
        } catch (InterruptedException exception) {
            System.out.println(exception);
        }
    }
}
