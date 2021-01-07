package com.chernyavsky.multiThreading.ships;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Ship {

    private int count;
    private Size size;
    private Type type;

    public Ship(Size size, Type type) {
        this.size = size;
        this.type = type;
    }

    public boolean countCheck () {
        return count < size.getValue();
    }
}
