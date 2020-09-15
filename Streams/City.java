import java.util.ArrayList;
import java.util.List;

public class City {

    String name;
    int population;
    List<Person> peopleList = new ArrayList<>();

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public List<Person> getPeople() {
        peopleList.add(new Person("person1",10));
        peopleList.add(new Person("person2",20));
        peopleList.add(new Person("person3",30));
        return peopleList;
    }
}
