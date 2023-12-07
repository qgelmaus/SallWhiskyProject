package application.model;

public class Whisky {

    private String navn;
    private int nr;
    private double procent;
    private Påfyldning påfyldning;
    private double tilsætningAfVand;


    public Whisky(String navn, int nr, double procent, Påfyldning påfyldning, double tilsætningAfVand) {
        this.navn = navn;
        this.nr = nr;
        this.procent = procent;
        this.påfyldning = påfyldning;
        this.tilsætningAfVand = tilsætningAfVand;
    }

}
