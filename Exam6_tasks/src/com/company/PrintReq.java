package com.company;

public class PrintReq implements Runnable{
    private String text;
    private int copies;

    public PrintReq(String text, int copies) {
        this.text = text;
        this.copies = copies;
    }

    @Override
    public void run() {
        System.out.println(text);
    }
}
