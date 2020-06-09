package generics.example;

public class Building {

    final static int maxLimit = 1000;

    @Override
    public String toString() {
        return "Building";
    }

    public String getName(){
        return "building:"+System.currentTimeMillis();
    }

}
