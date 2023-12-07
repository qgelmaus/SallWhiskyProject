package application.model;

public class Mængde {

    private double liter;
    private Destillering destillering;
    private Påfyldning påfyldning;
    public Mængde(double liter, Påfyldning påfyldning){
        this.liter = liter;
        this.påfyldning = påfyldning;
    }
    public double getLiter(){
        return liter;
    }
    public void setLiter(double liter){
        this.liter = liter;
    }


    //Sammenhæng til destillering
    public void setDestillering(Destillering destillering){
        if(this.destillering != destillering){
            Destillering oldDestillering = this.destillering;
            if(oldDestillering != null){
                oldDestillering.removeMængde(this);
            }
            this.destillering = destillering;
            if(destillering != null)
                destillering.addMængde(this);
        }
    }


    //Sammenhæng til påfyldning
    public Påfyldning getPåfyldning(){
        return påfyldning;
    }


    }


