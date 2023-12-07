package storage;

import application.model.Destillering;
import application.model.Fad;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    //TODO Lav storage
    private static List<Destillering> destillerings;
    private static List<Fad> fads;


    public Storage(){
        destillerings = new ArrayList<Destillering>();
        fads = new ArrayList<Fad>();
    }

    //Alle gemte Destilleringer
    public static List<Destillering> getAllDestillerings(){
        return new ArrayList<Destillering>(destillerings);
    }

    //Gemme destilleringer
    public static void addDestillering(Destillering destillering){
        if(!destillerings.contains(destillering))
            destillerings.add(destillering);
    }

    //Alle gemte fad
    public static List<Fad> getAllFad(){
        return new ArrayList<Fad>(fads);
    }

    //Gemme fad
    public static void addFad(Fad fad){
        if(!fads.contains(fad))
            fads.add(fad);
    }





}
