package level3.command;

import level3.model.Vehicle;

/**
 * Concrete Command to start a vehicle.
 */
public class CommandStart extends VehicleCommand{

    public CommandStart(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void execute() {
        this.vehicle.start();
    }

}
