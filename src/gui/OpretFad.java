package gui;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

public class OpretFad {

    private GridPane gridPane;
    private TextField fadTypeTxf, størrelseTxf, oprindelseTxf, fadIdTxf;
    private ComboBox<String> blendCbo;
    private Label fadTypeLbl, størrelseLbl, oprindelseLbl, blendLbl, bemærkningLbl;
    private Button fortsætBtn, tilbageBtn;
    private TextArea bemærkningTxa;
    private Scene lastScene;

    public OpretFad() {
        this.gridPane = new GridPane();
        this.gridPane.setVgap(5);
        this.gridPane.setHgap(20);

        //FadId
        fadTypeLbl = new Label("Registrer fad ID:");
        fadIdTxf = new TextField("Fad ID...");

        this.gridPane.add(fadTypeLbl, 0, 0);
        this.gridPane.add(fadIdTxf,0, 1);
        fadIdTxf.setStyle("-fx-text-fill: gray;");


        //Størrelse
        størrelseLbl = new Label("Volumen (mL):");
        størrelseTxf = new TextField("mL..");

        this.gridPane.add(størrelseLbl, 0, 3);
        this.gridPane.add(størrelseTxf,0, 4);
        størrelseTxf.setStyle("-fx-text-fill: gray;");

        //Oprindelse
        oprindelseLbl = new Label("Oprindelse:");
        oprindelseTxf = new TextField();

        this.gridPane.add(oprindelseLbl, 0, 6);
        this.gridPane.add(oprindelseTxf,0, 7);
        oprindelseTxf.setStyle("-fx-text-fill: gray;");


    }

    public void setLastScene(Scene scene){
        this.lastScene = scene;
    }

    public Scene getScene() {
        return new Scene(this.gridPane, 800, 500);
    }
}