package com.company.ibrahim;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    //list is an Interface.
    public static void main(String[] args) {
        //now this is generic list can contain any data type, so instead you need to specify a data type
        List numbers = new ArrayList();
        numbers.add("one");
        numbers.add(2);
        numbers.add(3.14f);

        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Orange");

        System.out.println(colors.contains("Red"));
        System.out.println(colors.contains("Yellow"));

        for (String color : colors) {
            System.out.println(color);
        }

        colors.forEach(System.out::println);
        //this more preferred to print element
        for (int i = 0; i < colors.size() - 1; i++) {
            System.out.println(colors.get(i));
        }

        //----------------
//        we can define list as this, but you can't edit it.
        List<String> colorUnmodifiable = List.of("Blue",
                "Black",
                "White",
                "Pink");
        int size = colorUnmodifiable.size();
        System.out.println(size);

        days welcome = days.welcome;
        System.out.print(welcome);

        int c = color.black.ordinal();
        System.out.println("color ordinal " + c);
    }

    public enum days {
        welcome, sowhate;

        public void test(int tes) {
            System.out.println(tes);
        }
    }

    enum color {
        red, white, black;
    }

}
