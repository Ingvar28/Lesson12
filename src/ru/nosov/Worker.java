package ru.nosov;

import static java.lang.Thread.interrupted;

public class Worker extends Thread{
    @Override
    public void run() {

        //System.out.printf("\n Start %s%n ", Thread.currentThread().getName());
        System.out.println("In process: "
                + Thread.currentThread().getName() + " : "
                + Thread.currentThread().getState());






    }
}
