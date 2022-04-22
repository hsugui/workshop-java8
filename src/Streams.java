import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("William", "Jose", "Yasmin", "Joao");

        // Java 7
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println();

        // Java 8
        list.forEach(s -> System.out.println(s));
        System.out.println();

        list.stream()
                .filter(s -> s.startsWith("J"))
                .forEach(e -> System.out.println(e));
        System.out.println();

        list.stream()
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        return s.startsWith("J");
                    }
                })
                .forEach(new Consumer<String>() {
                    @Override
                    public void accept(String e) {
                        System.out.println(e);
                    }
                });

    }
}
