import java.util.function.Consumer;

public class ConsumerChaining {
    public static void main(String[] args) {

        Consumer<String> c1 = s -> System.out.println("" + s);
        Consumer<String> c2 = s -> System.out.println("" + s);

        Consumer<String> c3 = c1.andThen(c2);
        c3.accept("Hello");

        //first passes to c1 then to c2.
    }
}
