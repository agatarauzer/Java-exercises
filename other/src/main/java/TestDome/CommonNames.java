package main.java.TestDome;

import java.util.stream.Stream;

public class CommonNames {


    public static String[] findCommon(String[] names1, String[] names2) {

        return Stream.concat(Stream.of(names1), Stream.of(names2))
                .distinct()
                .toArray(String[]::new);
    }

    public static void main(String[] args) {
        String[] names1 = new String[]{"Ava", "Emma", "Olivia"};
        String[] names2 = new String[]{"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", CommonNames.findCommon(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}
