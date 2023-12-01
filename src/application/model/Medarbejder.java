package application.model;

import java.util.ArrayList;

public class Medarbejder {
    private String navn;
    private String medarbejderNr;
    private ArrayList<Destillering> destillerings;

    public Medarbejder(String navn, String medarbejderNr){
        this.navn = navn;
        this.medarbejderNr = medarbejderNr;
    }


    public void addDestillering(Destillering destillering) {
        if(!destillerings.contains(destillering)){
            destillerings.add(destillering);
            destillering.addMedarbejder(this);
        }
    }


}
