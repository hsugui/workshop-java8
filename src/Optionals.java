import java.util.Optional;
import java.util.concurrent.ExecutionException;

public class Optionals {

    public static void main(String[] args) {
        // Java 7
//        String s = "100";
//        Integer number = convertToNumber(s);
//        System.out.println(number);

        // Java 8
        String s2 = "adww";
        Optional<Integer> number = convertToNumberOptional(s2);
        System.out.println(number);

    }

//    public static Integer convertToNumber(String numberString) {
//        return Integer.valueOf(numberString);
//    }

//    public static Optional<Integer> convertToNumberOptional(String numberString) {
//        Integer integer = Integer.valueOf(numberString);
//        return Optional.of(integer);
//    }

    public static Optional<Integer> convertToNumberOptional(String numberString) {
        try {
            Integer integer = Integer.valueOf(numberString);
            return Optional.of(integer);
        } catch (Exception e) {
//            return null;
            return Optional.empty();
        }
    }

}
