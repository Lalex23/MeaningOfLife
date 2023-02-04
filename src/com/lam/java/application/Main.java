package com.lam.java.application;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Integer theMeaningOfLife = 42;
        MeaningOfLife meaningOfLife = new MeaningOfLife();
        Future<Integer> theMeaningOfLifeFromOtherPlace = meaningOfLife.thinkSomewhereElse(theMeaningOfLife);
        meaningOfLife.thinkDifferent(theMeaningOfLife).thenAccept(MeaningOfLife::tellTheMeaningOfLife);
        MeaningOfLife.tellTheMeaningOfLife(theMeaningOfLifeFromOtherPlace.get());
        MeaningOfLife.tellTheMeaningOfLife(theMeaningOfLife);
    }
}
