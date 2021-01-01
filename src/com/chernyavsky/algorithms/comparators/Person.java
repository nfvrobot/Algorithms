package com.chernyavsky.algorithms.comparators;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Comparator;

@Getter
@Setter
@ToString
public class Person implements Comparable<Person> {

    private int id;
    private int age;
    private String name;

    public Person(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Person person) {
        return this.name.compareTo(person.getName());
    }

    Comparator<Person> comparatorByAge = Comparator.comparing(Person::getAge);

}
