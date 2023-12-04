package application.model;

import java.util.ArrayList;

public class Fad {
    private String fadType;
    private int størrelse;
    private boolean isBlend;
    private String tidligereBrug;
    private boolean isFull;
    private boolean isOptaget;
    private String oprindelse;
    private ArrayList<Påfyldning> påfyldnings;


    public Fad(String fadType, int størrelse, String tidligereBrug, String oprindelse){
        this.fadType = fadType;
        this.størrelse = størrelse;
        this.tidligereBrug = tidligereBrug;
        this.oprindelse = oprindelse;
        isBlend = false;
        isOptaget = false;
        påfyldnings = new ArrayList<>();
    }

    //Kontrollerer kapacitet
    public double checkCapacity(){
        double totalIndhold = 0;
        for(Påfyldning påfyldning : påfyldnings){
            totalIndhold =+ påfyldning.getAntalLiter();
        }
        return størrelse - totalIndhold;
    }

    //Hvis total indhold i fadet er >90%, sættes isOptaget som true;

    public void setOptaget(){
        if(checkCapacity() >= størrelse * 0.90){
            isOptaget = true;
        }
    }

    //Hvis et fad indeholder mere end en påfyldning skal isBlend være == true;
    public void makeBlend(){
        if (påfyldnings.size()>1)
            this.isBlend = true;
    }


    //TODO Færdiggør sammenhæng til klassen påfyldning
    //Sammenhæng til påfyldning start:
    public ArrayList<Påfyldning> getPåfyldnings(){
        return new ArrayList<>(påfyldnings);
    }

    public void addPåfyldning(Påfyldning påfyldning){
        if(!påfyldnings.contains(påfyldning)){
            påfyldnings.add(påfyldning);
            påfyldning.setFad(this);
        }
    }

    public void removePåfyldning(Påfyldning påfyldning){
        if(påfyldnings.contains(påfyldning)){
            påfyldnings.remove(påfyldning);
            påfyldning.setFad(null);
        }
    }


    //Sammenhæng til påfyldning slut.


}
