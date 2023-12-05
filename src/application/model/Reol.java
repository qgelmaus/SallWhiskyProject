package application.model;

import java.util.ArrayList;
import java.util.List;

public class Reol {
    private int kapacitet;
    private int indhold = 0;

    private List<Fad> fads;


    public Reol(int kapacitet){
        this.fads = new ArrayList<>();
        this.kapacitet = kapacitet;
    }


    public void addFad(Fad fad){
        if(fads.size() < kapacitet && !fads.contains(fad)){
            fads.add(fad);
            indhold++;
        }
    }


}
