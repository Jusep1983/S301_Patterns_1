package level1.model;

import java.util.ArrayList;
import java.util.List;

public class Undo {

    private static Undo undo;
    private final List<String> historialCommands;

    private Undo() {
        this.historialCommands = new ArrayList<>();
    }

    public static synchronized Undo getUndoInstance() {
        if (undo == null) {
            undo = new Undo();
        }
        return undo;
    }

    public void addCommand(String command) {
        this.historialCommands.add(command);
        System.out.println("Command successfully added");
    }

    public void deleteLastCommand() {
        if (this.historialCommands.isEmpty()) {
            System.out.println("Command history is empty");
        } else {
            this.historialCommands.remove(this.historialCommands.size() - 1);
            System.out.println("Last command successfully removed");
        }
    }

    public void showCommands() {
        if (this.historialCommands.isEmpty()) {
            System.out.println("No commands in history");
        } else {
            System.out.println("Command history:");
            this.historialCommands.forEach(System.out::println);
        }
    }

}
