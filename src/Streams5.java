import java.util.*;
import java.util.stream.Collectors;

public class Streams5 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(0, 3, 4, 6, 6, 5, 9, 5, 7, 10, 5);

        // toList
//        List<Integer> newList = list.stream()
//        .filter(e -> e % 2 == 0)
//        .map(e -> e + 5)
//        .collect(Collectors.toList());
//        System.out.println(newList);

        // groupingBy
//        Map<Boolean, List<Integer>> mapa = list.stream()
//                .filter(e -> e % 2 == 0)
//                .map(e -> e + 5)
//                .collect(Collectors.groupingBy(e -> e < 10));
//        System.out.println(mapa);
//
//        Map<Integer, List<Integer>> mapaInteiros = list.stream()
//                .collect(Collectors.groupingBy(e -> e % 3));
//        System.out.println(mapaInteiros);

        // joining
//        String string = list.stream()
//                .map(e -> String.valueOf(e))
//                .collect(Collectors.joining(";", "->", "<-"));
//        System.out.println(string);


    }
}
