package solid.liskovs_principle;

public class Cycle implements Vehicle{

    @Override
    public void getTyres() {
        System.out.println("tyres - 2");
    }
}
