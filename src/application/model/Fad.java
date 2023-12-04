package application.model;

import java.util.ArrayList;

public class Fad {
    private String fadType;
    private int størrelse;
    private boolean isBlend;
    private String tidligereBrug;
    private boolean isOptaget;
    private String oprindelse;
    private ArrayList<Påfyldning> påfyldnings;

    //TODO Færdiggør sammenhæng til klassen påfyldning
    public Fad(String fadType, int størrelse, String tidligereBrug, String oprindelse){
        this.fadType = fadType;
        this.størrelse = størrelse;
        this.tidligereBrug = tidligereBrug;
        this.oprindelse = oprindelse;
        isBlend = false;
        isOptaget = false;
        påfyldnings = new ArrayList<>();
    }



    public void makeBlend(){
        if (påfyldnings.size()>1)
            this.isBlend = true;
    }

    public ArrayList<Påfyldning> getPåfyldnings(){
        return new ArrayList<>(påfyldnings);
    }





}
