package storage;

import application.model.Destillering;
import application.model.Fad;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    //TODO Lav storage
    private List<Destillering> destillerings;
    private List<Fad> fads;


    public Storage(){
        destillerings = new ArrayList<Destillering>();
        fads = new ArrayList<Fad>();
    }

    //Alle gemte Destilleringer
    public List<Destillering> getAllDestillerings(){
        return new ArrayList<Destillering>(destillerings);
    }

    //Gemme destilleringer
    public void addDestillering(Destillering destillering){
        if(!destillerings.contains(destillering))
            destillerings.add(destillering);
    }





}
