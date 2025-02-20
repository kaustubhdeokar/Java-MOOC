package solid.liskovs_principle;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new Bike();
        vehicle.getTyres();

        EnginedVehicle bike1 = new Bike();
        bike1.startEngine();

        vehicle = new Cycle();
        vehicle.getTyres();

//        EnginedVehicle cycle1 = (EnginedVehicle) new Cycle(); class cast.

    }

}
