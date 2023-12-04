package application.model;

import java.time.LocalDate;


public class Påfyldning {

    private Destillering destillering;
    private Fad fad;
    private int antalLiter;
    private LocalDate dato;


    public Påfyldning(int antalLiter, LocalDate dato, Destillering destillering){
        this.antalLiter = antalLiter;
        this.dato = dato;
        this.destillering = destillering;
    }


    //TODO Kod sammenhæng til klassen Fad
    //Sammenhæng til fad start:
    public void setFad(Fad fad) {
        if(this.fad != fad){
            Fad oldFad = this.fad;
            if(oldFad != null){
                oldFad.removePåfyldning(this);
            }
            this.fad = fad;
            if(fad != null){
                fad.addPåfyldning(this);
            }
        }
    }
    //Sammenhæng til fad slut.

    //TODO Kod sammenhæng til klassen Destillering
    //Sammenhæng til Destillering start:


    //Sammenhæng til destillering slut.


    //TODO Kod sammenhæng til klassen Whisky
    //Sammenhæng til whisky start:

    //Sammenhæng til whisky slut.
}
