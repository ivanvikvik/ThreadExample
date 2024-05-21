package by.itstep.ivanvikvik.javalessons.controller;

import by.itstep.ivanvikvik.javalessons.model.entity.Printer;
import by.itstep.ivanvikvik.javalessons.model.entity.Writer;

public class Main {
    public static void main(String[] args) throws InterruptedException{

        String[] texts = {"FIRST writer", "SECOND writer","THIRD writer",
                "FOURTH writer", "FIFTH writer"};

        Printer printer = new Printer();

        for (int i = 0; i < texts.length; i++) {
            new Writer(texts[i], printer);
        }
    }
}
