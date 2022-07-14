package de.neuefische.streams;

import java.util.Arrays;

public class StreamsExerciseOne {

    public static void main(String[] args) {


        int[] zahlen = new int[]{9, 1, 8, 2, 7, 3, 6, 4, 5};

        int[] sortedZahlen = Arrays.stream(zahlen)
                .sorted()
                .toArray();

        System.out.println(Arrays.toString(sortedZahlen));

        Integer addZahlen = Arrays.stream(zahlen)
                .reduce(0, Integer::sum);

        System.out.println(addZahlen);

        Integer prodZahlen = Arrays.stream(zahlen)
                .reduce(1, (a, b) -> a * b);

        System.out.println(prodZahlen);

    }

}
