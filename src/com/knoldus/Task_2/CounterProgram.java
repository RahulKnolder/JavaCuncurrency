package com.knoldus.Task_2;

public class CounterProgram {

    private static volatile int counter = 0;

    public static void main(String[] args) {


        //Thread which increments counter
        Thread mainThread = new Thread(() -> {
            while (counter <= 10) {
                ++counter;
                System.out.println("Counter value is getting incremented by  : " + counter);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        //Thread which prints counter
        Thread printingThread = new Thread(() -> {
            while (counter <= 10) {
                System.out.println("Printing the updated value" + counter);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        });


        mainThread.start();
        printingThread.start();
    }
}
