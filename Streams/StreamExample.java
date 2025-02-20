import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        list.add(new Person("a", 11));
        list.add(new Person("b", 21));
        list.add(new Person("c", 31));
        list.add(new Person("a", 12));
        list.add(new Person("b", 22));
        list.add(new Person("c", 32));

        Stream<Person> personStream = list.stream();
        Stream<String> nameStream = personStream.map(Person::getName); //map can transform stream into other data form
        Stream<String> nameStartsWithAStream = nameStream.filter(name -> name.startsWith("a"));// filter does not change the datatype.
        System.out.println(nameStartsWithAStream.count());
        //also filter or any stream object can be accessed only once.
        try {
            personStream.map(person -> person.getAge());
//            nameStream.filter(name->name.startsWith("b"));
        } catch (IllegalStateException e) {
            System.out.println("You accessed stream object twice ! You can't do that!");
        }
        //hence the above way of writing stream map,reduce,filter is wrong.

        Stream<Integer> integerStream = list.stream().map(person -> person.getAge()).filter(age -> age > 20);

    }

}
