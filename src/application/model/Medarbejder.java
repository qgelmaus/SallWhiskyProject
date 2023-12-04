package application.model;

import java.util.ArrayList;

public class Medarbejder {
    private String navn;
    private ArrayList<Destillering> destillerings;

    public Medarbejder(String navn){
        this.navn = navn;
    }


    public void addDestillering(Destillering destillering) {
        if(!destillerings.contains(destillering)){
            destillerings.add(destillering);
            destillering.addMedarbejder(this);
        }
    }

    public void removeDestillering(Destillering destillering){
        if(destillerings.contains(destillering)){
            destillerings.remove(destillering);
            destillering.removeMedarbejder(this);
        }

    }

    public ArrayList<Destillering> getDestillerings(){
        return new ArrayList<>(destillerings);
    }




}
