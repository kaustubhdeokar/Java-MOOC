import java.util.Arrays;
import java.util.stream.Stream;

public class StreamExampleOnArrays {

    public static void main(String[] args) {

        Person[] person = new Person[5];
        person[0] = new Person("person1",11);
        person[1] = new Person("person2",21);
        person[2] = new Person("person3",31);
        person[3] = new Person("person4",41);
        person[4] = new Person("person5",51);

        Stream.of(person).forEach(p-> System.out.println(p.getAge()));
        Stream<Person> integerStream = Arrays.stream(person).filter(p->p.getAge()>20);

    }

}
