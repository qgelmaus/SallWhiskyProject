package application.model;

public class Mængde {

    private double liter;
    private Destillering destillering;

    public Mængde(double liter, Destillering destillering){
        this.liter = liter;
        this.destillering = destillering;
    }

    public double getLiter(){
        return liter;
    }

    public void setLiter(double liter){
        this.liter = liter;
    }

    public Destillering getDestillering(){
        return destillering;
    }

    public void setDestillering(Destillering destillering){
        this.destillering = destillering;
    }
}
