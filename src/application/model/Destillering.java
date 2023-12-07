package application.model;

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

//TODO Kod sammenhæng til klassen påfyldning


    //Konstructor:
public Destillering(LocalDate startDato, LocalDate slutDato, Medarbejder medarbejder, int væskeMængde, String rygemateriale, String kornSort, String kommentar){
    this.startDato = startDato;
    this.slutDato = slutDato;
    this.væskeMængde = væskeMængde;
    this.rygemateriale = rygemateriale;
    this.kornSort = kornSort;
    this.kommentar = kommentar;

    //TODO Overvej hvordan vi vil gøre det her:
    this.medarbejders = new ArrayList<>();
    addMedarbejder(medarbejder);
}


    //Sammenhæng til medarbejder:
public void addMedarbejder(Medarbejder medarbejder){
    if(!medarbejders.contains(medarbejder)){
        medarbejders.add(medarbejder);
        medarbejder.addDestillering(this);
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
