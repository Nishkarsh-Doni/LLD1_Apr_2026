package com.example.lld1_apr_2026.concurrency.NumberPrinter;

public class Client {
    public static void main(String[] args) {
        System.out.println("Main function is executing in " + Thread.currentThread().getName());

        // create 100 threads and each thread prints a different number
        NumberPrinter numberPrinter = new NumberPrinter();
        for (int i = 1; i <= 100; i++) {
            numberPrinter.setNumberToPrint(i);
            Thread t = new Thread(numberPrinter);
            t.start();
        }
    }
}
