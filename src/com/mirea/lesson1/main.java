package com.mirea.lesson1;

import java.util.*;
import java.io.*;


public class main {
    public static void main(String[] args) {

        final int rAge = 200; final int rHeight = 2;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = in.nextLine();

        System.out.println("Enter your age: ");
        int age = in.nextInt();
        while (age <= 0 || age > rAge) {
            System.out.println("Enter correct variable: ");
            age = in.nextInt();
        }

        System.out.println("Enter your height: ");
        int height = in.nextInt();
        while (height <= 0 || height > rHeight) {
            System.out.println("Enter correct variable: ");
            height = in.nextInt();
        }

        Person student = new Person(name, age, height);
        String studentName = student.getName();
        int studentAge = student.getAge();
        int studentHeight = student.getHeight();

        System.out.println("Name of person: " + studentName);
        System.out.println("Age: " + studentAge);
        System.out.println("Height: " + studentHeight);

        in.close();
    }
}
