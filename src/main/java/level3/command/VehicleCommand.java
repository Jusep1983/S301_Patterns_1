package level3.command;

import level3.model.Vehicle;

public abstract class VehicleCommand implements Command{
    protected Vehicle vehicle;

    public VehicleCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

}
