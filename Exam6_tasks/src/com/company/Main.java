package com.company;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        PrintReq printReqJava = new PrintReq("Java", 1);
        PrintReq printReqC = new PrintReq("C#", 1);
        PrintReq printReqPhp = new PrintReq("PHP", 1);
        PrintReq printReqJavaScript = new PrintReq("JavaScript", 1);
        PrintReq printReqGo = new PrintReq("Go", 1);
        PrintReq printReqPyton = new PrintReq("Pyton", 1);

        Thread t1 = new Thread(printReqJava);
        Thread t2 = new Thread(printReqPyton);
        Thread t3 = new Thread(printReqGo);
        Thread t4 = new Thread(printReqJavaScript);
        Thread t5 = new Thread(printReqPhp);
        Thread t6 = new Thread(printReqC);

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        t4.start();
        t4.join();
        t5.start();
        t5.join();
        t6.start();

    }
}
