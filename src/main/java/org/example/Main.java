package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] input = args;
        Object[] result = findFirstDuplicateWithIndex(input);

        if (result == null) {
            System.out.println("Found duplicate value " + result[0] + " at index " + result[1]);
        } else {
            System.out.println("No duplicates found");
        }
    }

    private static int[] parseInput(String[] args) {
        int[] elements = new int[args.length];
        for (int i = 0; i<args.length; i++) {
            elements[i] = Integer.parseInt(args[i]);
        }
        return elements;
    }

    public static <T>  Object[] findFirstDuplicateWithIndex(T[] input) {

        if (input == null || input.length == 0) {
            return null;
        }

        HashMap<T, Integer> map = new HashMap<>();

        for (int x= 0; x < input.length; x++) {
            T current = input[x];
            if (map.containsKey(current)) {
                return new Object[]{current, map.get(current)};
            } else {
                map.put(current, x);
            }
        }
        return new Object[]{-1, -1};
    }
}