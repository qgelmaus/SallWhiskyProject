package application.model;

import java.time.LocalDate;
import java.util.ArrayList;


public class Påfyldning {

    private Fad fad;
    private final ArrayList<Mængde> mængdes = new ArrayList<>();
    private final ArrayList<WhiskyMængde> whiskyMængdes = new ArrayList<>();
    private boolean isWhisky;
    private double antalLiter;
    private LocalDate påfyldningsDato;
    private LocalDate tappeDato;


    public Påfyldning(double antalLiter, Mængde mængde, boolean isWhisky, LocalDate dato){
        this.antalLiter = antalLiter;
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
    public ArrayList<Mængde> getMængdes(){
        return new ArrayList<>(mængdes);
    }

    public Mængde createMængde(double liter){
        Mængde mængde = new Mængde(liter,this);
        mængdes.add(mængde);
        return mængde;
    }

    public void removeMængde(Mængde mængde){
        if(mængdes.contains(mængde)){
            mængdes.remove(mængde);
        }
    }

    //Sammenhæng til Mængde slut.


    //TODO Kod sammenhæng til klassen WhiskyMængde
    //Sammenhæng til whiskyMængde start:
    public ArrayList<WhiskyMængde> getWhiskyMængdes(){
        return new ArrayList<>(whiskyMængdes);
    }
    public void addWhiskyMængde(WhiskyMængde whiskyMængde){
        if(!whiskyMængdes.contains(whiskyMængde)){
            whiskyMængdes.add(whiskyMængde);
            whiskyMængde.setPåfyldning(this);
        }
    }


    public void removeWhiskyMængde(WhiskyMængde whiskyMængde) {
        if(whiskyMængdes.contains(whiskyMængde)){
            whiskyMængdes.remove(whiskyMængde);
            whiskyMængde.setPåfyldning(null);
        }
    }


    //Sammenhæng til whiskyMængde slut.
}
