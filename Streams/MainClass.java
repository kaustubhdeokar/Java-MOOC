import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class MainClass {

    public static void main(String[] args) {

        List<Integer> integers = getPrimeNumbersTo50().get();

        integers.forEach(System.out::println);

        consumeString().accept("SomeString");


    }

    private static Consumer<String> consumeString() {
        return (s) -> System.out.println(s+2);
    }

    private static Supplier<List<Integer>> getPrimeNumbersTo50() {
        Supplier<List<Integer>> primeNumbersTo50 = () -> {
            List<Integer> list = getListTo50().get();
            for (int i = 2; i * i <= 50; i++) {
                if (list.contains(i)) {
                    for (int j = i * i; j <= 50; j += i) {
                        list.remove(Integer.valueOf(j));
                    }
                }
            }
            return list;
        };
        return primeNumbersTo50;
    }

    private static Supplier<List<Integer>> getListTo50() {
        Supplier<List<Integer>> listTo50 = () -> {
            List<Integer> listIntegersUpto50 = new ArrayList<>();
            for (int i = 2; i < 51; i++) {
                listIntegersUpto50.add(i);
            }
            return listIntegersUpto50;
        };
        return listTo50;
    }

}
