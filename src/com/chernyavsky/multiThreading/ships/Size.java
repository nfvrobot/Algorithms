package com.chernyavsky.multiThreading.ships;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Size {

    SMALL(10),
    MEDIUM(50),
    LARGE(100);

    private final int value;

}

