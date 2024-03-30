package org.example.task1;

public class Animal {
    private String name;
    private int age;
    private String sound;


    public Animal(String name, String sound, int age) {
        this.name = name;
        this.age = age;
        this.sound = sound;
    }

    public String makeSound(){
        return sound;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }
}
