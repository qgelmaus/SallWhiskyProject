package controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import application.model.Destillering;
import application.model.Medarbejder;
import storage.Storage;

public class Controller {
    private Storage storage;
    private static Controller controller;
    private static Destillering destillering;

    private Controller() {
        storage = new Storage();
    }

    public static Controller getController() {
        if (controller == null) {
            controller = new Controller();
        }
        return controller;
    }

    public static Destillering opretDestillering(LocalDate startDato, LocalDate slutDato, int væskeMængde, String rygemateriale,
       String kornSort, Medarbejder medarbejder,String kommentar) {

        Destillering d = new Destillering(startDato, slutDato, medarbejder,væskeMængde, rygemateriale, kornSort, kommentar);
        Storage.addDestillering(d);
        return d;
    }
    //TODO: Oprettelse af objekter.



    public void createSomeObjects() {

    }

}
