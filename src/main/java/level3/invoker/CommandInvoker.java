package level3.invoker;

import level3.command.CommandAccelerate;
import level3.command.CommandBrake;
import level3.command.CommandStart;
import level3.model.Vehicle;

/**
 * Invoker class in the Command pattern.
 * Sets up and invokes commands to control vehicles.
 */
public class CommandInvoker {

    public static void invokeAllFor(Vehicle vehicle) {

        CommandStart commandStart = new CommandStart(vehicle);
        CommandAccelerate commandAccelerate = new CommandAccelerate(vehicle);
        CommandBrake commandBrake = new CommandBrake(vehicle);

        System.out.println("Checking " + vehicle.getTypeOfVehicle() + ": ");
        commandStart.execute();
        commandAccelerate.execute();
        commandBrake.execute();

    }

}
