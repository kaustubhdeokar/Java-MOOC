package decorator.pizza;

public class Jalapeno implements Pizza {

    private Pizza pizza;

    public Jalapeno(Pizza pizza) {
        this.pizza = pizza;
    }

    public int getCost(){
        return pizza.getCost() + 20;
    }
}
