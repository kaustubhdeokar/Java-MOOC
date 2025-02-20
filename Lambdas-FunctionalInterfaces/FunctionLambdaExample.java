import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionLambdaExample {

    public static void main(String[] args) {

        User user1 = new User("user1", 10);
        User user2 = new User("user2", 11);
        User user3 = new User("user3", 12);
        User user4 = new User("user4", 13);

        List<User> list = List.of(user1, user2, user3, user4);
        List<String> userNames = new ArrayList<>();
        Function<User, String> toName = User::getName;
        list.forEach(user -> {
            userNames.add(toName.apply(user));
        });
        System.out.println(userNames);
    }


}

class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
