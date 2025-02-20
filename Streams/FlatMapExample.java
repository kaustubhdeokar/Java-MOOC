import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FlatMapExample {

    public static void main(String[] args) {

        List<City> cities = new ArrayList<>();
        cities.add(new City("Paris", 1000));

        Function<City, Stream<Person>> flatMapper = city -> city.getPeople().stream();
        //flat map function
        Stream<Person> personStream = cities.stream().flatMap(flatMapper);

        personStream.forEach(person -> System.out.println(person.getName()));

    }

}
