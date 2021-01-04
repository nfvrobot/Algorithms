package com.chernyavsky.multiThreading.fabric;

import java.util.ArrayDeque;
import java.util.Queue;

import static com.chernyavsky.multiThreading.fabric.RandomUtil.RANDOM_COUNT;

public class Fabric implements Runnable {

    protected static final Queue<Details> fabricGarbage = new ArrayDeque<>();

    static {
        for (int i = 0; i < 20; i++) {
            fabricGarbage.add(Details.randomEnum(Details.class));
        }
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(100);
                synchronized (fabricGarbage) {
                    int random = RANDOM_COUNT.nextInt(5);
                    for (int j = 0; j < random; j++) {
                        fabricGarbage.offer(Details.randomEnum(Details.class));
                        Fabric.fabricGarbage.wait(100L);
                    }
                    System.out.println("Fabric released " + random +  " details");
                    System.out.println();
                    Fabric.fabricGarbage.notify();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
