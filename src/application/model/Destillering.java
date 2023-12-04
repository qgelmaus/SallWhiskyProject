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
private ArrayList<Påfyldning> påfyldnings;

//TODO Kod sammenhæng til klassen påfyldning


    //Konstructor:
public Destillering(LocalDate startDato, LocalDate slutDato, Medarbejder medarbejder){
    this.startDato = startDato;
    this.slutDato = slutDato;
    this.påfyldnings = new ArrayList<>();
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

public void addPåfyldning(Påfyldning påfyldning){
    this.påfyldnings.add(påfyldning);
}
public ArrayList<Påfyldning> getPåfyldnings(){
    return new ArrayList<>(påfyldnings);
}






}
