import java.util.Objects;
import java.util.function.Predicate;

public class PredicateChaining {

    public static void main(String[] args) {

        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNull = Objects::isNull;

        Predicate<String> testPredicate = isNull.negate().and(isEmpty.negate());
        System.out.println(testPredicate.test(""));
        System.out.println(testPredicate.test(null));
        System.out.println(testPredicate.test("SomeString"));
    }
}
