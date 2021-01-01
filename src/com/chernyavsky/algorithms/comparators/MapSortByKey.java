package com.chernyavsky.algorithms.comparators;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MapSortByKey {

    public static Map<Integer, Person> sortMapById(Person[] persons) {
        return Arrays.stream(persons)
                .sorted(Comparator.comparing(Person::getId))
                .collect(Collectors.toMap(Person::getId, person -> person, (oldValue, newValue) -> oldValue, TreeMap::new));
    }
}
