import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReference {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("William", "Jose", "Yasmin", "Joao");

        List<String> result = list.stream()
                .filter(s -> s.startsWith("J"))
                .collect(Collectors.toList());

        for (String s : result) {
            System.out.println(s);
        }

        result.forEach(s -> System.out.println(s));

        result.forEach(System.out::println);

        System.out.println();

        // Java 7
        Cat.meow();
        System.out.println();

        // Java 8 Lambda
        result.forEach(s -> {
            Cat.scratch(s);
        });
        System.out.println();

        // Java 8 - Method Reference
        result.forEach(Cat::scratch);

    }

}
