package com.chernyavsky.multiThreading;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.security.SecureRandom;

@Getter
@AllArgsConstructor
public enum Details {

    HEAD("head"),
    BODY("body"),
    LEFT_ARM("left_arm"),
    RIGHT_ARM("right_arm"),
    LEFT_LEG("left_leg"),
    RIGHT_LEG("right_leg"),
    CPU("cpu"),
    RAM("ram"),
    HDD("hdd");

    String currency;

    private static final SecureRandom random = new SecureRandom();

    public static <T extends Enum<?>> T randomEnum(Class<T> clazz){
        int x = random.nextInt(clazz.getEnumConstants().length);
        return clazz.getEnumConstants()[x];
    }

}
