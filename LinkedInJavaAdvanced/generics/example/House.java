package generics.example;

public class House extends Building{

    static final int maxLimit = 10;

    @Override
    public String toString() {
        return "House class";
    }

    @Override
    public String getName(){
        return "house:"+System.currentTimeMillis();
    }

}
