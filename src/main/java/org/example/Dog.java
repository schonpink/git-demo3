package org.example;

public class Dog extends Pet{
    public String getName() {
        return "Собака";
    }
    public Pet getChild() {
        return new Dog();
    }

}
