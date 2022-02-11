import java.util.Arrays;
import java.util.List;

public class ListCollection {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("William", "José", "Yasmin");

        // Java 7
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("\n================\n");

        // Java 8
        list.forEach(s -> System.out.println(s));

    }

}
