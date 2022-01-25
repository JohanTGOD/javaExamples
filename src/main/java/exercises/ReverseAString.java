package exercises;

import java.util.function.UnaryOperator;

public class ReverseAString {


    public static void main(String[] args) {
        System.out.println(reverseThePhrase("Vamos Que Vamos"));
        System.out.println(reverseThePhraseStringBuilder("Vamos Que Vamos"));
        System.out.println(reverseThePhraseWithLambda("Vamos Que Vamos"));
        System.out.println(reverseWithFunction.apply("Vamos Que Vamos"));
    }

    private static String reverseThePhraseWithLambda(String phrase) {
        return phrase.chars().mapToObj(x -> (char) x).reduce("", (z, y) -> y + z, (s1, s2) -> s2 + s1);
    }

    private static String reverseThePhraseStringBuilder(String phrase) {
        return new StringBuilder(phrase).reverse().toString();
    }

    private static String reverseThePhrase(String phrase) {
        char[] chars = phrase.toCharArray();
        String newPhrase = "";
        for (int i = 1; i <= chars.length; i++) {
            newPhrase += chars[chars.length - i];
        }
        return newPhrase;
    }

    private static final UnaryOperator<String> reverseWithFunction = phrase -> new StringBuilder(phrase).reverse().toString();
}
