package com.chernyavsky.algorithms.comparators;

import java.util.Comparator;

public class SortByID implements Comparator<Person> {

    @Override
    public int compare(Person person, Person t1) {
        return person.getId() - t1.getId();
    }
}
