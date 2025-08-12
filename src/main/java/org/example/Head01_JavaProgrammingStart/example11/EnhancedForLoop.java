package org.example.Head01_JavaProgrammingStart.example11;

public class EnhancedForLoop {
    public static void main(String[] args) {
        String[] animals = {"Cat", "Dog", "Bird","Cat", "Dog", "Bird","Cat", "Dog", "Bird","Cat", "Dog", "Bird","Cat", "Dog", "Bird","Cat", "Dog", "Bird"};

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }

        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
