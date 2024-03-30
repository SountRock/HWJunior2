package org.example.task1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Prog {
    public static void main(String[] args) throws IllegalAccessException {
        List<Animal> animalList = new ArrayList<>(List.of(
                new Cat("Oswald", 6),
                new Dog("Volz", 8)
        ));

        Class<?> clazz = Animal.class;

        for (Animal animal : animalList) {
            System.out.println("{");

            Field[] fields = clazz.getDeclaredFields();
            System.out.println('\t' + "Fields: ");
            for (Field f: fields) {
                f.setAccessible(true);
                System.out.println("\t\t" + f.getName() + " = " + f.get(animal));
            }

            System.out.println('\t' + "Methods: ");
            Method[] methods = clazz.getMethods();
            for (Method m: methods) {
                System.out.println("\t\t" + m);
            }
            System.out.print("} ");

            try {
                Method method = clazz.getMethod("makeSound");
                System.out.println("Sounds like: " + method.invoke(animal));
            } catch (NoSuchMethodException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
