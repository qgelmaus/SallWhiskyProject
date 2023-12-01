package application.model;

import java.time.LocalDate;

public class Påfyldning {


    private int antalLiter;
    private LocalDate dato;

    public Påfyldning(int antalLiter, LocalDate dato){
        this.antalLiter = antalLiter;
        this.dato = dato;
    }


}
