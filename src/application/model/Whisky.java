package application.model;

import java.util.ArrayList;

public class Whisky {

    private String navn;
    private int nr;
    private double procent;
    private Påfyldning påfyldning;
    private double tilsætningAfVand;
    private final ArrayList<WhiskyMængde> whiskyMængdes = new ArrayList<>();



    public Whisky(String navn, int nr, double procent, Påfyldning påfyldning, double tilsætningAfVand) {
        this.navn = navn;
        this.nr = nr;
        this.procent = procent;
        this.påfyldning = påfyldning;
        this.tilsætningAfVand = tilsætningAfVand;
    }


    //Sammenhæng til whiskyMængde
    public ArrayList<WhiskyMængde> getWhiskyMængdes(){
        return new ArrayList<>(whiskyMængdes);
    }

    public WhiskyMængde createWhiskyMængde(double liter){
        WhiskyMængde whiskyMængde = new WhiskyMængde(liter, this);
        whiskyMængdes.add(whiskyMængde);
        return whiskyMængde;
    }

    public void removeWhiskyMængde(WhiskyMængde whiskyMængde){
        if(whiskyMængdes.contains(whiskyMængde))
            whiskyMængdes.remove(whiskyMængde);
    }



}
