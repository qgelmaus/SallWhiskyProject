package application.model;

import java.util.ArrayList;
import java.util.List;

public class Reol {
    private int kapacitet;
    private String lokation;
    private List<Fad> fads;


    public Reol(int kapacitet, String lokation){
        this.lokation = lokation;
        this.fads = new ArrayList<>();
        this.kapacitet = kapacitet;
    }


    public void addFad(Fad fad){
        if(fads.size() < kapacitet && !fads.contains(fad)){
            fads.add(fad);
        }
    }

    public int remainingKapacitet(){
        return kapacitet - fads.size();
    }


}
