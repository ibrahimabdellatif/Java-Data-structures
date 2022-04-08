package com.company.ibrahim;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WorkingWithMaps {
    public static void main(String[] args) {
        //working with hash
        Map<Person, Diamond> map = new HashMap<>();
        map.put(new Person("Jamila"), new Diamond("African Diamond"));

        System.out.println(new Person("Welcome").hashCode());
        System.out.println(new Person("Welcome").hashCode());
        System.out.println(map.get(new Person("Jamila")));
    }

    private static void maps() {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("ibrahim"));
        map.put(2, new Person("ali"));
        map.put(3, new Person("mohamed"));
        System.out.println(map);
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());
        System.out.println(map.size());
        System.out.println(map.values());
        System.out.println(map.remove(2));
        System.out.println(map.size());
        System.out.println(map.entrySet());
        map.entrySet().forEach(System.out::println);

        map.forEach((key, value) -> {
            System.out.println(key + " " + value);
        });
    }

    static class Person {
        String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

    //    record Person(String name){}
    record Diamond(String name) {
    }
}
