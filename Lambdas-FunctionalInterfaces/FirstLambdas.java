import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class FirstLambdas {

    static void supplierImplementation() {
        Supplier<String> supplier = () -> "SomeString";
        System.out.println(supplier.get());
    }

    static void consumerImplementation() {
        Consumer<String> consumer = (String s) -> {
            for (int i = 0; i < s.length(); i++) {
                System.out.print(s.charAt(i) + "");
            }
            System.out.println();
        };
        consumer.accept("Ryan");
    }

    static void predicateImplementation(String s) {
        Predicate<String> nameCheckPredicate = (name) -> name.startsWith("a");
        boolean startWithA = nameCheckPredicate.test(s);
        System.out.println("Name starts with A:-" + startWithA);
    }

    static void functionalImplementation() {
        Function<String, Integer> function = (String s) -> {
            List<Integer> integerList = new ArrayList<>();
            Pattern pattern = Pattern.compile("");
            Stream<String> stringStream = pattern.splitAsStream(s);
            long count = stringStream.count();
            return (int) count;
        };
        System.out.println(function.apply("Abacus"));

    }

    public static void main(String[] args) {

        supplierImplementation();
        consumerImplementation();
        predicateImplementation("Anirudh");
        predicateImplementation("Anusha");
        functionalImplementation();

        Runnable runnable = () -> {
            System.out.println("don something");
            System.out.println("don something else");
            System.out.println("don something else");
        };
        runnable.run();

    }
}
