import java.util.ArrayList;
import java.util.List;

public class Filtering {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("one", "two", "three"));
        list.removeIf(string->string.startsWith("t")); //Predicate
        list.forEach(System.out::println); //Consumer

    }
}
