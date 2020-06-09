package generics.example;

public class Office extends Building {

    final static int maxLimit  = 500;

    @Override
    public String toString() {
        return "Office";
    }

    @Override
    public String getName(){
        return "office:"+System.currentTimeMillis();
    }

}
