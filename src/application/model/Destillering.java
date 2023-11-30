package application.model;

import java.time.LocalDate;

public class Destillering {

private LocalDate startDato;
private LocalDate slutDato;
private MaltBatch maltBatch;
private Medarbejder medarbejder;
private int væskeMængde;
private String rygemateriale;
private String kornSort;
private String kommentar;

public Destillering(LocalDate startDato, LocalDate slutDato, MaltBatch maltBatch, Medarbejder medarbejder){
    this.startDato = startDato;
    this.slutDato = slutDato;
    this.maltBatch = maltBatch;
    this.medarbejder = medarbejder;
}



}
