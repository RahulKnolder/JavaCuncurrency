package com.knoldus.Task_1;

public class Task implements Runnable {
    private int num;

    public Task(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println(num);
    }
}