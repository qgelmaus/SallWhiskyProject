package storage;

import application.model.*;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    //TODO Lav storage
    private static List<Destillering> destillerings;
    private static List<Fad> fads;
    private static List<Lager> lagers;
    private static List<Medarbejder> medarbejders;
    private static List<Påfyldning> påfyldnings;
    private static List<Reol> reols;
    private static List<Whisky> whiskies;


    public Storage(){
        destillerings = new ArrayList<Destillering>();
        fads = new ArrayList<Fad>();
        medarbejders = new ArrayList<>();
    }

    //Destilleringer
    public static List<Destillering> getAllDestillerings(){
        return new ArrayList<Destillering>(destillerings);
    }

    public static void addDestillering(Destillering destillering){
        if(!destillerings.contains(destillering))
            destillerings.add(destillering);
    }

    //Fad
    public static List<Fad> getAllFads(){
        return new ArrayList<Fad>(fads);
    }

    public static void addFad(Fad fad){
        if(!fads.contains(fad))
            fads.add(fad);
    }

    //Medarbejdere
    public static List<Medarbejder> getAllMedarbejders(){return new ArrayList<>(medarbejders);}

    public static void addMedarbejder(Medarbejder m) {
        if(!medarbejders.contains(m))
            medarbejders.add(m);
    }

    //Lagere
    public static List<Lager> getAllLagers(){return new ArrayList<>(lagers);}

    public static void addLager(Lager l) {
        if(!lagers.contains(l))
            lagers.add(l);
    }

    //Påfyldninger
    //TODO Måske ikke laves?

    //Reoler
    public static List<Reol> getAllReols(){return new ArrayList<>(reols);}

    public static void addReol(Reol r) {
        if(!reols.contains(r))
            reols.add(r);
    }

    //Whisky
    public static List<Whisky> getAllWhiskies(){return new ArrayList<>(whiskies);}

    public static void addWhisky(Whisky w) {
        if(!whiskies.contains(w))
            whiskies.add(w);
    }
}
