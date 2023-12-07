package gui;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

public class OpretFad {

    private GridPane gridPane;
//    private TextField ;
//    private DatePicker ;
//    private ComboBox<String> ;
//    private Label ;
      private Button fortsætBtn, tilbageBtn;

    public OpretFad() {
        this.gridPane = new GridPane();
        this.gridPane.setVgap(5);
        this.gridPane.setHgap(20);




    }

    public Scene getScene() {
        return new Scene(this.gridPane, 800, 500);
    }
}