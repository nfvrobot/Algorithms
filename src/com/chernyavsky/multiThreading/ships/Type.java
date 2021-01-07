package com.chernyavsky.multiThreading.ships;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Type {

    BREAD("bread"),
    BANANAS("bananas"),
    CLOTHE("clothes");

    private final String name;
}
