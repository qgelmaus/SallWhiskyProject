package application.model;

import java.security.Key;
import java.time.LocalDate;
import java.util.ArrayList;

public class Destillering {

private LocalDate startDato;
private LocalDate slutDato;
private int væskeMængde;
private String rygemateriale;
private String kornSort;
private String kommentar;
private ArrayList<Medarbejder> medarbejders;
private static ArrayList<Destillering> destillerings;

//TODO Kod sammenhæng til klassen påfyldning


    //Konstructor:
public Destillering(LocalDate startDato, LocalDate slutDato, int væskeMængde, String rygemateriale,
                    String kornSort, Medarbejder medarbejder,String kommentar){
    this.startDato = startDato;
    this.slutDato = slutDato;
    this.væskeMængde = væskeMængde;
    this.kommentar = kommentar;
}


    //Sammenhæng til medarbejder:
public void addMedarbejder(Medarbejder medarbejder){
    if(!medarbejders.contains(medarbejder)){
        medarbejders.add(medarbejder);
        medarbejder.addDestillering(this);
    }
}
    public static void addDestillering(Destillering destillering){
        if(!destillerings.contains(destillering)){
            destillerings.add(destillering);
            destillering.addDestillering(this);
        }
    }
public void removeMedarbejder(Medarbejder medarbejder){
    if(medarbejders.contains(medarbejder)){
        medarbejders.remove(medarbejder);
        medarbejder.removeDestillering(this);
    }
}
public ArrayList<Medarbejder> getMedarbejders(){
    return new ArrayList<>(medarbejders);
}

    //Sammenhæng til påfyldning:





}
