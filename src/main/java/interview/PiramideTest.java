package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PiramideTest {
    public static void main(String[] args) {
        printTriangle(5, 10, 30, 100);
    }

    static void printTriangle(Integer... triangleSixe) {
        Integer[] triangleSixe1 = Optional.ofNullable(triangleSixe).orElseThrow(() -> new IllegalArgumentException());
        for (int d = 0; d < triangleSixe1.length; d++) {
            String idenfier = "";
            String space = "";
            List<String> some = new ArrayList<>(triangleSixe1[d]);
            for (int i = 1; i <= triangleSixe[d]; i++) {
                for (int j = triangleSixe[d] - i; j > 0; j--) {
                    space = space + " ";
                }
                idenfier += "* ";
                some.add(space + idenfier);
                space = "";
                System.out.println(some.get(i - 1));
            }
        }
    }
}
