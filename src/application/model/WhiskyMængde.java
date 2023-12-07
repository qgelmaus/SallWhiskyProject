package application.model;

public class WhiskyMængde {
    private double liter;
    private Påfyldning påfyldning;
    private Whisky whisky;

    public WhiskyMængde(double liter, Whisky whisky){
        this.liter = liter;
        this.whisky = whisky;
    }
    public double getLiter(){
        return liter;
    }
    public void setLiter(double liter){
        this.liter = liter;
    }

    public Påfyldning getPåfyldning(){
        return påfyldning;
    }

    public void setPåfyldning(Påfyldning påfyldning){
        if(this.påfyldning != påfyldning){
            Påfyldning oldPåfyldning = this.påfyldning;
            if(oldPåfyldning != null){
                oldPåfyldning.removeWhiskyMængde(this);
            }
            this.påfyldning = påfyldning;
            if(påfyldning != null){
                påfyldning.addWhiskyMængde(this);
            }
        }
    }

    public Whisky getWhisky(){
        return whisky;
    }



}
