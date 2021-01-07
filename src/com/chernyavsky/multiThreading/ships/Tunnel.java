package com.chernyavsky.multiThreading.ships;

import java.util.ArrayList;
import java.util.List;

public class Tunnel {

    private List<Ship> shipListInTunnel;
    public static final int MAX_COUNT_SHIP_IN_TUNNEL = 5;
    private static final int MIN_COUNT_SHIP_IN_TUNNEL = 0;
    private int shipsCount = 0;

    public Tunnel() {
        shipListInTunnel = new ArrayList<>();
    }

    private synchronized boolean add(Ship ship) {
        boolean result = true;
        try{
            if (shipsCount < MAX_COUNT_SHIP_IN_TUNNEL) {
                notifyAll();
                shipListInTunnel.add(ship);
                String info = String.format("%s + The ship arrived in the tunnel: %s %s %s", shipListInTunnel.size(), ship.getType(), ship.getSize(), Thread.currentThread().getName());
                System.out.println(info);
                shipsCount++;
            } else {
                System.out.println(shipListInTunnel.size() + "> There is no place for a ship in the tunnel: " + Thread.currentThread().getName());
                wait();
                result = false;
            }
        } catch (InterruptedException e) {
            e.addSuppressed();
        }
        return result;
    }
}
