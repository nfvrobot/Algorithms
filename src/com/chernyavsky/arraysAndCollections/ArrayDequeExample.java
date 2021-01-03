package com.chernyavsky.arraysAndCollections;

import java.util.ArrayDeque;

public class ArrayDequeExample {

    public static ArrayDeque<?> arrayDequeImplementation() {

        ArrayDeque<String> states = new ArrayDeque<>();
        states.add("Germany");
        states.addFirst("France");
        states.push("Great Britain");
        states.addLast("Spain");
        states.add("Italy");

        String sFirst = states.getFirst();
        System.out.println(sFirst);
        String sLast = states.getLast();
        System.out.println(sLast);

        System.out.printf("Queue size: %d \n", states.size());

        while (states.peek() != null) {
            System.out.println(states.pop());
        }

        ArrayDeque<Person> people = new ArrayDeque<>();
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));

        for (Person p : people) {
            System.out.println(p.getName());
        }
        return states;
    }

    private static class Person {

        private final String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
