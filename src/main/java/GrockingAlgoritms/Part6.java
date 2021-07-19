package GrockingAlgoritms;

import java.util.*;

public class Part6 {

    public static void main(String[] args) {
        Person tom = new Person("том", false, List.of());
        Person jon = new Person("джони", false, List.of());
        Person an = new Person("анудж", false, List.of());
        Person peggi = new Person("пегги", true, List.of());
        Person p1 = new Person("боб", true, List.of(peggi, an));
        Person p2 = new Person("клэр", false, List.of(tom, jon));
        Person p3 = new Person("алиса", false, List.of(peggi));
        Person iAm = new Person("я", false, List.of(p1, p2, p3));

        peggi.friends = List.of(p1, p3);

        // боб и пегги true -> первый боб
        doSearch(iAm);
    }

    private static void doSearch(Person iAm) {
        Queue<Person> q = new ArrayDeque<>();
        q.addAll(iAm.friends);

        Set<Person> alreadyCheckedPeople = new HashSet<>();

        while (!q.isEmpty()) {
            Person person = q.poll();
            if (alreadyCheckedPeople.contains(person)) {
                continue;
            }
            alreadyCheckedPeople.add(person);

            if (person.isMangoSeller) {
                System.out.println(person.name + " is mango seller!");
                return;
            } else {
                q.addAll(person.friends);
            }
        }
        System.out.println("No mango sellers.");
    }

    public static class Person {
        String name;
        boolean isMangoSeller;
        List<Person> friends;

        public Person(String name, boolean isMangoSeller, List<Person> friends) {
            this.name = name;
            this.isMangoSeller = isMangoSeller;
            this.friends = friends;
        }
    }
}