package functional;

import java.util.stream.IntStream;

public class MyStream {
    public static void main(String[] args) {
        IntStream infinitive = IntStream.iterate(0,x->x+2);
    }
}
