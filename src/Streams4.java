import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Streams4 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(0, 3, 4, 6, 6, 5, 9, 5, 7, 10, 5);

        // count
//        long quantidade = list.stream()
//                .filter(e -> e % 2 == 0)
//                .count();
//        System.out.println(quantidade);

        // min
//        Optional<Integer> menorNumero = list.stream()
//                .filter(e -> e % 2 == 1)
//                .min(Comparator.naturalOrder());
//        System.out.println(menorNumero.get());

        // max
//        Optional<Integer> maiorNumero = list.stream()
//                .filter(e -> e % 2 == 1)
//                .max(Comparator.naturalOrder());
//        System.out.println(maiorNumero.get());

    }
}
