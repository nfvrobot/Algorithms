package com.chernyavsky.multiThreading.fabric;

import java.util.ArrayList;
import java.util.List;

import static com.chernyavsky.multiThreading.fabric.RandomUtil.RANDOM_COUNT;

public class SecondCrazy implements Runnable {

    private static final List<Details> state = new ArrayList<>();

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (Fabric.fabricGarbage) {
                int random = RANDOM_COUNT.nextInt(5);
                for (int j = 0; j < random; j++) {
                    state.add(Fabric.fabricGarbage.poll());
                }
                System.out.println("SecondCrazy robot brings " + random + " details");
                System.out.println();
                try {
                    Fabric.fabricGarbage.wait(100L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Fabric.fabricGarbage.notify();
            }
        }
    }
}
