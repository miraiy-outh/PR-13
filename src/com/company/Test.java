package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Test {
    public ArrayList<Student> IDNumber = new ArrayList<>();
    Test(int cnt) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите данные студентов для 1 задачи:");
        for (int i = 0; i < cnt; i++) {
            IDNumber.add(new Student(scan.next(), scan.nextDouble(), scan.nextInt()));
        }

        Collections.sort(IDNumber, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getId() - o2.getId();
            }
        });

        for (Student student:IDNumber){
            System.out.println(student.toString());
        }
    }




}
