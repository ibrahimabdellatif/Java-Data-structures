package com.company.ibrahim;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class WorkingWithSets {
    public static void main(String[] args) {
        //set is unordered list and the duplication is not allowed inside it
        //so, if you repeat add with same values it choose at most one of them,
        // and at most it has a one null value inside it
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("blue"));
        balls.add(new Ball("black"));
        balls.add(new Ball("black"));
        balls.add(new Ball("white"));
        balls.add(new Ball("pink"));
        balls.remove(new Ball("pink"));
        System.out.println(balls.size());
        balls.forEach(System.out::println);
    }

    static class Ball {
        String color;

        Ball(String color) {
            this.color = color;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Ball ball = (Ball) o;
            return Objects.equals(color, ball.color);
        }

        @Override
        public int hashCode() {
            return Objects.hash(color);
        }

        @Override
        public String toString() {
            return "Ball{" +
                    "color='" + color + '\'' +
                    '}';
        }
    }

//    record Ball(String color){}
}
