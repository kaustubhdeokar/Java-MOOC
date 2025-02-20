package solid.liskovs_principle;

public class Bike implements Vehicle, EnginedVehicle {
    @Override
    public void startEngine() {
        System.out.println("bike engine starting");
    }

    @Override
    public void getTyres() {
        System.out.println("bike tyres - 2");
    }
}
