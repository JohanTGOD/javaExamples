package interview.foraws;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.asList;

public class TriangleTester {

    public static boolean isTriangle(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static int findShort(String s) {
        return Arrays.stream(s.split(" ")).min(Comparator.comparing(String::length)).get().length();
//        return Arrays.stream(s.split(" ")).min((x,y)->Integer.compare(x.length(),y.length())));
    }

    public static String accum(String s) {
        String[] split = s.split("");
        return IntStream.range(0, split.length).mapToObj(iterator -> {
            String currentLetter = split[iterator];
            return currentLetter.toUpperCase() + currentLetter.toLowerCase().repeat(iterator);
        }).collect(Collectors.joining("-"));
    }

    public static boolean isIsogram(String s) {
        //one way
//        String[] split = s.split("");
//        for (int i = 0; i < split.length; i++) {
//            for (int j = i+1; j < split.length; j++) {
//                if (split[i].equalsIgnoreCase(split[j])) {
//                    return false;
//                }
//            }
//        }
//        return true;

        //second way
        String[] letters = s.split("");
        return asList(letters).stream().map(String::toLowerCase).distinct().count() == letters.length ? true : false;
    }


    public static int nbYear(int currentPopulation, double percent, int aug, int peopleToSurPass) {
        int years = 0;
        while (currentPopulation < peopleToSurPass) {
            currentPopulation = (int) (currentPopulation * percent) / 100 + aug + currentPopulation;
            years++;
        }
        return years;
    }

}
