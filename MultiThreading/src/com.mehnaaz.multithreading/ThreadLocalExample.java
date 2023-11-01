package com.mehnaaz.multithreading;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThreadLocalExample {

    private static ThreadLocal<String> threadLocalVariable = new ThreadLocal<>();
    private static ThreadLocal<FileReader> threadLocalVariable2 = new ThreadLocal<>();


    public static void main(String[] args) throws FileNotFoundException {
        threadLocalVariable.set("This is thread-local data.");
       System.out.println("dir is"+System.getProperty("user.dir"));

        threadLocalVariable2.set( new FileReader("./MultiThreading/src/com.mehnaaz.multithreading/hello.txt"));

        System.out.println(" main Value in the new thread: " + threadLocalVariable.get());
        Runnable task = () -> {
            threadLocalVariable.set("This is thread-local data. ****************");
            try {
                threadLocalVariable2.set( new FileReader("./MultiThreading/src/com.mehnaaz.multithreading/hello2.txt"));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            String value = threadLocalVariable.get();
            System.out.println(" other Value in the new thread: " + value);
            System.out.println(" other Value in the new thread: " + threadLocalVariable2.get());
        };
        Thread thread = new Thread(task);
        thread.start();
        try {
            thread.join(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(" last main Value in the new thread: " + threadLocalVariable.get());
    }

}
