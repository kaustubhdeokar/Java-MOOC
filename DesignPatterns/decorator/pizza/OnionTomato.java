package decorator.pizza;

public class OnionTomato implements Pizza{
    Pizza pizza;

    public OnionTomato(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 40;
    }
}
