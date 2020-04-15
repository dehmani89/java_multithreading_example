package com.dehmani;

import com.dehmani.multithread.RunnableInterface;
import com.dehmani.multithread.ThreadClass;

/**
 * Threads can be created by using two different methods :
 * 1. Extend the Thread class
 * 2. or Implementing the Runnable Interface
 */
public class MultithreadMain {
    public static void main(String[] args) {

        int numOfThreads = 5; // Number of threads to generate

        /**
         * Example of Extending the Thread class
         */
        for (int i = 0; i < numOfThreads; i++) {
            ThreadClass tc = new ThreadClass();
            tc.start();
        }


        /**
         * Example of implementing the Runnable Interface
         */
        for (int i = 0; i < numOfThreads; i++) {
            Thread thread = new Thread(new RunnableInterface());
            thread.start();
        }
    }
}