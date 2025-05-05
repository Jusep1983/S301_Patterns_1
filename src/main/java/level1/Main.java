package level1;

import level1.model.Undo;
import level1.utilsIO.KeyboardInput;

public class Main {

    public static void main(String[] args) {
        Undo undo = Undo.getUndoInstance();
        // Undo SecondUndo = Undo.getUndoInstance();
        boolean exit = false;
        while (!exit) {
            switch (KeyboardInput.menuOption()) {
                case 1:
                    String command = KeyboardInput.readString("Enter the command:\nC:\\Users\\JosePC>");
                    undo.addCommand(command);
                    break;
                case 2:
                    undo.deleteLastCommand();
                    break;
                case 3:
                    undo.showCommands();
                    break;
                case 0:
                    System.out.println("Exiting the application...");
                    exit = true;
                    break;
            }
        }
    }

}
