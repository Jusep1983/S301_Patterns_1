package level3.model;
/**
 * Receiver class in the Command pattern.
 * Represents a generic vehicle with common operations.
 */
public class Vehicle {
    private final String typeOfVehicle;

    public Vehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public void start() {
        System.out.println("\tThe " + this.typeOfVehicle + " is ready to go!");
    }

    public void accelerate() {
        System.out.println("\tThe " + this.typeOfVehicle + " accelerates");
    }

    public void brake() {
        System.out.println("\tThe " + this.typeOfVehicle + " brakes");
    }

}
