package ru.nosov;

public class Main {

    public static void main(String[] args) {


        /*
         * Напишите программу, в которой запускается 10 потоков и каждый из них выводит
         * числа от 0 до 100.
         */

        for (int i = 0; i < 9; i++) {
            Thread worker = new Worker();
            System.out.println("Before Start: " + worker.getName() + " : " + worker.getState());
            worker.start();
            System.out.println("After Start: " + worker.getName() + " : " + worker.getState());
            for (int j = 0; j <= 100; j++) {
                System.out.printf(" %s ", j);

            }
            System.out.println("\r");
        }




        /*
         * Напишите программу, в которой запускается 100 потоков, каждый из которых
         * вызывает метод increment() 1000 раз.
         * После того, как потоки завершат работу, проверьте, чему равен count .
         * Если обнаружилась проблема, предложите ее решение.
         */
        System.out.println("-------------------------------------------------------- \n");

        Counter counter = new Counter();
        for (int i = 0; i < 99; i++) {
            Thread worker = new Worker();
            //System.out.println(worker.getName() + " : " + worker.getState());
            worker.start();
            for (int j = 0; j < 1000; j++) {
                counter.increment();
            }
            System.out.println(counter.getCount());

            try {
                worker.join();

            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("End point: " + counter.getCount());
       // Thread.currentThread().interrupt();











	// write your code here
    }

//    static class  WorkerThread extends Thread {
//
//        @Override
//        public void run() {
//
//            //System.out.printf("\n Start %s%n ", Thread.currentThread().getName());
//
//            System.out.println("\r");
//            System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().getState());
//            for (int i = 0; i <= 100; i++) {
//                System.out.printf(" %s ", i);
//            }
//            System.out.println("\r");
//
//        }
//
//    }
//
//    static class Counter {
//        int count = 0;
//        public void increment() {
//            count = count + 1;
//        }
//        public int getCount() {
//            return count;
//        }
//    }

    static class  HardWorkerThread extends Thread {

        @Override
        public void run() {

            //System.out.printf("\n Start %s%n ", Thread.currentThread().getName());


            System.out.println("\r");
            System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().getState());
            for (int i = 0; i <= 100; i++) {
                System.out.printf(" %s ", i);
            }
            System.out.println("\r");

        }

    }



}
