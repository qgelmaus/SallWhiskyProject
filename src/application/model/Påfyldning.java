package application.model;

import java.time.LocalDate;


public class Påfyldning {

    private Fad fad;
    private Mængde mængde;
    private boolean isWhisky;
    private double antalLiter;
    private LocalDate påfyldningsDato;
    private LocalDate tappeDato;


    public Påfyldning(double antalLiter, Mængde mængde, boolean isWhisky, LocalDate dato){
        this.antalLiter = antalLiter;
        this.mængde = mængde;
        this.isWhisky = isWhisky;
        if(!isWhisky) {
            this.påfyldningsDato = dato;
            this.tappeDato = påfyldningsDato.plusYears(3);
        }
    }

    //TODO Påfyldningsmetoder
    //Påfyldningsmetoder:
    public Whisky påfyldningAfWhisky(double antalLiter){
        //TODO ???
    }

    public double resterendeIndhold(){
        //TODO ???
        return -1;
    }

    public double getAntalLiter(){
        return antalLiter;
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

    //TODO Kod sammenhæng til klassen Mængde
    //Sammenhæng til Mængde start:


    //Sammenhæng til Mængde slut.


    //TODO Kod sammenhæng til klassen WhiskyMængde
    //Sammenhæng til whiskyMængde start:

    //Sammenhæng til whiskyMængde slut.
}
