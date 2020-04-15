package com.dehmani.multithread;

// creation using the Runnable Interface
public class RunnableInterface implements Runnable {
    public void run() {
        try {
            // Displaying the current thread running
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}
