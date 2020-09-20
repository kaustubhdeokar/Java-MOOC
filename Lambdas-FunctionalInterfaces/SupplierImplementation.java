import java.util.function.Supplier;

public class SupplierImplementation {

    public static void main(String[] args) {

        Supplier<String> supplier = () -> "SomeString";

        System.out.println(supplier.get());


    }
}
