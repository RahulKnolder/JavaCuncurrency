package com.knoldus.Task_1;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorDemo {
    public static void main(String[] args) {

        //creating a thread pool for 10 threads
        ExecutorService execute = Executors.newFixedThreadPool(10);

        // creating a future array which will store the values of asynchronous execution
        //The generic type <?> is a wildcard type in Java.
        Future<?>[] futures = new Future<?>[10];

        for (int index = 0; index < 10; index++) {
            Task task = new Task(index);
            futures[index] = execute.submit(task);
        }


        for (int index = 0; index < 10; index++) {
            try {
                futures[index].get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        execute.shutdown();


    }
}
