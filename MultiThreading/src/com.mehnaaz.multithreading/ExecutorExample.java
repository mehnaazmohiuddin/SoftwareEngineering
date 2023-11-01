package com.mehnaaz.multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;



/**
 * Executor threads run even if there is an excpetion in on of the threads . cool.
 * */


public class ExecutorExample {

    public static void main(String[] args) {
        Executor executor = Executors.newSingleThreadExecutor();
        executor.execute(() -> {
            System.out.println("This is the runnable class");
            try {
                throw new Exception();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        executor.execute(() -> {
            System.out.println("This is the runnable class 1 ");
        });
        executor.execute(() -> {
            System.out.println("This is the runnable class 2");
        });
        executor.execute(() -> {
            System.out.println("This is the runnable class 3");
        });

        return;
    }
}