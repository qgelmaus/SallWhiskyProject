package application.model;

import java.util.ArrayList;
import java.util.List;

public class Lager {
    private List<Reol> reols;


    public Lager(){
        this.reols = new ArrayList<>();
    }

    public void addReol(Reol reol){
        if(!reols.contains(reol)){
            reols.add(reol);
        }
    }
}
