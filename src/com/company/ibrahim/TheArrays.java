package com.company.ibrahim;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "Red";
        colors[2] = "white";
        colors[4] = "black";
//        System.out.println(Arrays.toString(colors));
        int[] number = {100, 200, 900};

        //to print all element in array
        for (String color : colors) {
            System.out.print(color);
        }
        // print all element in array using stream
        Arrays.stream(colors).forEach(System.out::print);
    }
}
