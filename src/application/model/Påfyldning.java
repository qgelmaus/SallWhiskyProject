package application.model;

import java.time.LocalDate;


public class Påfyldning {

    private Destillering destillering;
    private Fad fad;
    private int antalLiter;
    private LocalDate dato;

    //TODO Kod sammenhæng til klassen Destillering


    //TODO Kod sammenhæng til klassen Fad


    //TODO Kod sammenhæng til klassen Whisky

    public Påfyldning(int antalLiter, LocalDate dato, Destillering destillering){
        this.antalLiter = antalLiter;
        this.dato = dato;
        this.destillering = destillering;
    }









}
