package controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import application.model.*;
import storage.Storage;

public class Controller {
    private Storage storage;
    private static Controller controller;
    private static Destillering destillering;
    private static Fad fad;
    private static Medarbejder medarbejder;
    private static Lager lager;
    private static Reol reol;
    private static Whisky whisky;
    private static Påfyldning påfyldning;


    private Controller() {
        storage = new Storage();
    }

    public static Controller getController() {
        if (controller == null) {
            controller = new Controller();
        }
        return controller;
    }

    public static Medarbejder opretMedarbejder(String navn){
        Medarbejder m = new Medarbejder(navn);
        Storage.addMedarbejder(m);
        return m;
    }
    public static Destillering opretDestillering(LocalDate startDato, LocalDate slutDato, int væskeMængde, String rygemateriale,
        String kornSort, Medarbejder medarbejder,String kommentar) {
        Destillering d = new Destillering(startDato, slutDato, medarbejder,væskeMængde, rygemateriale, kornSort, kommentar);
        Storage.addDestillering(d);
        return d;
    }

    //TODO
//    public static Påfyldning opretPåfyldning(){
//        Påfyldning p = new Påfyldning();
//        Storage.addPåfyldning(p);
//        return p;
//    }
//
//    public static Fad opretFad(){
//        Fad f = new Fad();
//        Storage.addFad(f);
//        return f;
//    }
//
//    public static Lager opretLager(){
//        Lager l = new Lager();
//        Storage.addLager(l);
//        return l;
//    }
//
//    public static Reol opretReol(){
//        Reol r = new Reol();
//        Storage.addReol(r);
//        return r;
//    }
//
//    public static Whisky opretWhisky(){
//        Whisky w = new Whisky();
//        Storage.addWhisky(w);
//        return w;
//    }
    //TODO: Oprettelse af objekter.



    public void createSomeObjects() {
//        opretLager();
//        opretReol();
    }

}
