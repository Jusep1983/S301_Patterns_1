package level3;

import level3.invoker.CommandInvoker;
import level3.model.Vehicle;

/**
 * Main class to demonstrate Command pattern usage.
 * Creates four vehicles and executes commands for each.
 */
public class Main {

    public static void main(String[] args) {

        Vehicle car = new Vehicle("car");
        Vehicle bicycle = new Vehicle("bicycle");
        Vehicle airplane = new Vehicle("airplane");
        Vehicle boat = new Vehicle("boat");

        CommandInvoker.invokeAllFor(car);
        CommandInvoker.invokeAllFor(bicycle);
        CommandInvoker.invokeAllFor(airplane);
        CommandInvoker.invokeAllFor(boat);

    }

}
