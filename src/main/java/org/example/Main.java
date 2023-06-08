package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello dogs!");
        Dog rex = new Dog("Рекс");
        System.out.println("Hello my Dog!");
        System.out.println("Where Rex lives?");

        Child child = new Child("Chico");


        System.out.println("*".repeat(10));

        System.out.println("Сhildren were added to the project");

        Cat cat = new Cat("Simon");
        rex.sleep();

    }
}