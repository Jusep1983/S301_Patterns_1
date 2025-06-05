package level3.command;

import level3.model.Vehicle;

/**
 * Concrete Command to brake a vehicle.
 */
public class CommandBrake extends VehicleCommand {

    public CommandBrake(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void execute() {
        this.vehicle.brake();
    }

}
