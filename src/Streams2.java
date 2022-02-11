import java.util.Arrays;
import java.util.List;

public class Streams2 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(0, 3, 4, 6, 6, 5, 9, 5, 7, 10, 5);

        // Java 7
//        for (Integer i : list) {
//            System.out.println(i);
//        }
//        System.out.println();

        // Java 8
//        list.stream().forEach(e -> System.out.println(e));
//        System.out.println();

        // skip
//        list.stream()
//                .skip(2) // pula os primeiros
//                .forEach(integer -> System.out.println(integer));

        // limit
//        list.stream()
//                .limit(3) // limita ao numero que foi passado
//                .forEach(integer -> System.out.println(integer));

        // distinct
//        list.stream()
//                .distinct() // tira elementos repetidos (equals e hashcode)
//                .forEach(integer -> System.out.println(integer));

        // mistura
        list.stream()
                .skip(2)
                .limit(5)
                .distinct()
                .forEach(integer -> System.out.println(integer));

    }
}
