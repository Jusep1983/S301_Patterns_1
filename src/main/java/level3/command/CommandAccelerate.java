package level3.command;

import level3.model.Vehicle;

/**
 * Concrete Command to accelerate a vehicle.
 */
public class CommandAccelerate implements Command {
    private final Vehicle vehicle;

    public CommandAccelerate(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        this.vehicle.accelerate();
    }

}
