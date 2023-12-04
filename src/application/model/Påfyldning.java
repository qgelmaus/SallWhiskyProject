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









}
