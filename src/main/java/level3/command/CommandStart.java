package level3.command;

import level3.model.Vehicle;

/**
 * Concrete Command to start a vehicle.
 */
public class CommandStart implements Command {
    private final Vehicle vehicle;

    public CommandStart(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        this.vehicle.start();
    }

}
