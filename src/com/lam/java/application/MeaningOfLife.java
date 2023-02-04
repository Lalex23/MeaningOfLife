package com.lam.java.application;

import java.util.concurrent.*;


public class MeaningOfLife {

    private final ExecutorService executor = Executors.newFixedThreadPool(30);


    Future<Integer> thinkSomewhereElse(final Integer theMeaningOfLife) {
        return executor.submit(() -> {
            Thread.sleep(1000L);
            return theMeaningOfLife + 6;
        });
    }

    CompletableFuture<Integer> thinkDifferent(Integer theMeaningOfLife) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return theMeaningOfLife + 10;
        });
    }

    static void tellTheMeaningOfLife(Integer theMeaningOfLife) {
        System.out.println(theMeaningOfLife);
    }
}


