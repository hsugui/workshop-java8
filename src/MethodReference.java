import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReference {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("William", "Jose", "Yasmin", "Joao");

        List<String> result = list.stream()
                .filter(s -> s.startsWith("J"))
                .collect(Collectors.toList());

        // Java 7
//        Cat.meow(); // propriedade estatica dentro da classe
//        System.out.println();
//
//        // Java 8 Lambda
//        result.forEach(s -> {
//            Cat.meow();
//        });
//        System.out.println();

        // Java 8
        result.forEach(Cat::meow); // erro pq espera parametro
        System.out.println();
        result.forEach(System.out::println);
    }

}
