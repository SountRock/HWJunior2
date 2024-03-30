package org.example.task1;

import java.lang.reflect.Field;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, "Meow", age);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name=" + super.getName() +
                ", age=" + super.getAge() +
                '}';
    }
}
