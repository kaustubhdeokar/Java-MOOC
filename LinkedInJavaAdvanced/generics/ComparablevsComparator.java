import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Apple implements Comparable<Apple> {

    String name;
    double price;

    Apple(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public static Comparator<Apple> appleComparator() {
        Comparator<Apple> comparator = Comparator.comparingDouble((Apple apple) -> apple.price).
                thenComparing(apple -> apple.name);
        return comparator;
    }

    public static void main(String[] args) {

        List<Apple> appleList = new ArrayList<>();
        appleList.add(new Apple("Z1", 10));
        appleList.add(new Apple("Y1", 10));
        appleList.add(new Apple("X1", 13));
        appleList.sort(appleComparator());

        for (Apple apple : appleList) {
            System.out.println(apple.name + " " + apple.price);
        }


    }

    public int compareTo(Apple a1) {
        int priceComparator = Double.compare(price, a1.price);
        return priceComparator==0?name.compareTo(a1.name):priceComparator;
    }
}
