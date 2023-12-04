package controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import storage.Storage;

public class Controller {
    private Storage storage;
    private static Controller controller;

    private Controller() {
        storage = new Storage();
    }

    public static Controller getController() {
        if (controller == null) {
            controller = new Controller();
        }
        return controller;
    }

    //TODO: Oprettelse af objekter.



    public void createSomeObjects() {

    }

}
