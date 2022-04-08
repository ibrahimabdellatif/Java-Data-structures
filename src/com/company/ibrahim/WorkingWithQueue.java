package com.company.ibrahim;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingWithQueue {
    //    transient int x = 2;
    public static void main(String[] args) {

        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("mohamed", 22));
        linkedList.add(new Person("ali", 20));
        linkedList.addFirst(new Person("kamal", 21));

        ListIterator<Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }
        System.out.println();
        while (personListIterator.hasPrevious()) {
            System.out.println(personListIterator.previous());
        }


    }

    private static void queues() {
        Queue superMarket = new LinkedList();

        superMarket.add(new Person("ibrahim", 21));
        superMarket.add(new Person("ahmed", 18));
        superMarket.add(new Person("mohamed", 40));

        System.out.println(superMarket.peek());
        System.out.println(superMarket.size());
        System.out.println(superMarket.poll());
        System.out.println(superMarket.size());
    }

    record Person(String name, int age) {
    }
}
