import java.util.Optional;

public class Optionals2 {

    public static void main(String[] args) {

//        String s2 = "200";
        String s2 = "Hildo";
//        Optional<Integer> number = convertToNumberOptional(s2);

        // isPresent
//        System.out.println(number.isPresent());

        // get
//        System.out.println(number.get());

        // ifPresent
//        number.ifPresent(n -> System.out.println(n));
//       convertToNumberOptional(s2).ifPresent(System.out::println); // tamanho reduzido

        // orElse
//        Integer number = convertToNumberOptional(s2).orElse(500);
//        System.out.println(number);

        // orElseGet
//        Integer number = convertToNumberOptional(s2)
//                .orElseGet(() -> 400);
//        System.out.println(number);

        // orElseThrow
        Integer number = convertToNumberOptional(s2)
                .orElseThrow(() -> new NullPointerException("Valor vazio."));
        System.out.println(number);

    }

    public static Optional<Integer> convertToNumberOptional(String numberString) {
        try {
            Integer integer = Integer.valueOf(numberString);
            return Optional.of(integer);
        } catch (Exception e) {
            return Optional.empty();
        }
    }
}
