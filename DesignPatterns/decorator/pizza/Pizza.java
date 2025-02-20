package decorator.pizza;

public interface Pizza {
    default public int getCost(){
        return 100;
    }
}
