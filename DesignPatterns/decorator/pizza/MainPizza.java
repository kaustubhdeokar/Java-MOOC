package decorator.pizza;

public class MainPizza {

    public static void main(String[] args) {

        Pizza cheeseBurstOnionTomatoJalpeno = new Jalapeno(new OnionTomato(new CheeseBurstBase()));
        int total = cheeseBurstOnionTomatoJalpeno.getCost();
        System.out.println(total);

    }
}
