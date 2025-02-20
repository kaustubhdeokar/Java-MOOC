package decorator.pizza;

public class MushroomPizza implements Pizza {

    private Pizza pizza;

    public MushroomPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public int getCost(){
        return pizza.getCost() + 20;
    }

}

