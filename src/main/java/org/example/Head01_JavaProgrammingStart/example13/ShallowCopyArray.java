package org.example.Head01_JavaProgrammingStart.example13;

import java.util.Arrays;

public class ShallowCopyArray {
    public static void main(String[] args) {
        int[] original = {1, 2, 3};
        int[] copy = original;

        copy[0] = 100;

        System.out.println(original == copy);
        System.out.println(original.equals(copy));
    }
}
