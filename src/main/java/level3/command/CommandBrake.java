package level3.command;

import level3.model.Vehicle;

/**
 * Concrete Command to brake a vehicle.
 */
public class CommandBrake implements Command {
    private final Vehicle vehicle;

    public CommandBrake(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        this.vehicle.brake();
    }

}
