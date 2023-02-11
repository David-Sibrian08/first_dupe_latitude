package org.example;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[] input = parseInput(args);
        int dupe = findFirstDuplicate(input);
        System.out.println(dupe);
    }

    private static int[] parseInput(String[] args) {
        int[] elements = new int[args.length];
        for (int i = 0; i<args.length; i++) {
            elements[i] = Integer.parseInt(args[i]);
        }
        return elements;
    }

    public static int findFirstDuplicate(int[] numbers) {
        int count = numbers.length;

        if (numbers == null) {
            return -1;
        }

        if (count == 0) {
            return -1;
        }

        HashSet<Integer> seen = new HashSet<>();

        for (int x= 0; x < count; x++) {
            if(seen.contains(numbers[x])) {
                return numbers[x];
            } else {
                seen.add(numbers[x]);
            }
        }
        return -1;
    }
}