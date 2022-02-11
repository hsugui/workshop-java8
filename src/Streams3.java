import java.util.Arrays;
import java.util.List;

public class Streams3 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(0, 3, 4, 6, 6, 5, 9, 5, 7, 10, 5);

        // filter
//        list.stream()
//                .filter(e -> e % 2 == 0) // numeros pares
//                .forEach(e -> System.out.println(e));

        // map
//        list.stream()
//                .map(e -> e * 10) // multiplicacao
//                .forEach(e -> System.out.println(e));
//        System.out.println();
//
//        //  A LISTA ORIGINAL NAO EH MODIFICADA!
//        System.out.println(list);

        // mistura varios
        list.stream()
                .limit(9)
                .distinct()
                .filter(integer -> integer % 2 != 0)
                .map(e -> Math.pow(e, 2))
                .forEach(e -> System.out.println(e));

    }
}
