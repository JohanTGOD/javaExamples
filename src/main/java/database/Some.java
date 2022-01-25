package database;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Some implements HostSummaryTable {

    @Override
    public void createSome() {
        Predicate<String> info = s -> s.equals((("sdsd")));
        List<String> strings = Arrays.asList("sadas", "dsdsd");
        Consumer<String> data = System.out::println;
        strings.stream().forEach(System.out::println);
    }
}
