package one;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Person> personList = List.of(
                new Person("One", "Male", 36000),
                new Person("Two", "Female", 29000),
                new Person("Three", "Male", 31000),
                new Person("Four", "Female", 32000),
                new Person("Five", "Male", 33000),
                new Person("Six", "Female", 28000),
                new Person("Seven", "Male", 30000),
                new Person("Eight", "Male", 39000),
                new Person("Nine", "Female", 34000),
                new Person("Ten", "Female", 35000)
        );

        // 1.1
        System.out.println(
                personList.stream()
                        .collect(Collectors.groupingBy(
                                Person::getGender, Collectors.averagingDouble(Person::getSalary)
                        )));

        // 1.2
        System.out.println(
                personList.stream()
                        .max(Comparator.comparing(Person::getSalary))
                        .orElseThrow()
        );

        // 1.3
        System.out.println(
                personList.stream()
                        .min(Comparator.comparing(Person::getSalary))
                        .orElseThrow()
        );
    }
}