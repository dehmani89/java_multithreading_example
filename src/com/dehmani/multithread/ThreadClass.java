package com.dehmani.multithread;

//Create a new Thread by extending rge Thread Class
public class ThreadClass extends Thread {
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
