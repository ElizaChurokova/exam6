package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student(1, "Ann", 4.50, 21, "Female"),
                new Student(2, "Mark", 5.00, 23, "Male" ),
                new Student(3, "Pete", 4.75, 30, "Male" ),
                new Student(4, "Elizabeth", 4.90, 25, "Female" ),
                new Student(5, "Brad", 3.80, 21, "Male" ),
                new Student(6, "Vera", 4.50, 22, "Female" ),
                new Student(7, "Maria", 4.50, 21, "Female" ),
                new Student(8, "Bob", 5.00, 23, "Male" ),
                new Student(9, "Denis", 5.00, 22, "Male" ),
                new Student(10, "Kate", 4.30, 19, "Female" )
                );
        System.out.println("1:");
        students.stream().map(x -> x.getName()).forEach(x-> System.out.println(x));
        System.out.println("-------");
        List<String> studentNames = students.stream().map(x -> x.getName()).collect(Collectors.toList());
        System.out.println(studentNames);

        System.out.println("--------");
        System.out.println("2:");
        students.stream()
                .filter(x -> x.getAge() > 23)
                .map(x -> x.getName())
                .forEach(x -> System.out.println(x));

        System.out.println("--------");
        System.out.println("3:");
        students.stream().map(x-> x.getId())
                .forEach(x -> System.out.println("ID: " + x + ", Average grade: %d" + students.stream().map(y -> y.getAverageGrade())));

        System.out.println("---------");
        System.out.println("4:");
       // students.stream().map(x -> x.getName()).findFirst().filter(x->x.length().forEach(x-> System.out.println(x));

    List studentsIdAndAverageGrade = new ArrayList();
    studentsIdAndAverageGrade.add(1);
    studentsIdAndAverageGrade.add(4.7);






    }
}
