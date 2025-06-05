package level3.command;

import level3.model.Vehicle;

/**
 * Concrete Command to accelerate a vehicle.
 */
public class CommandAccelerate extends VehicleCommand {

    public CommandAccelerate(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void execute() {
        this.vehicle.accelerate();
    }

}
