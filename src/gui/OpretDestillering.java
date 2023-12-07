package gui;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

public class OpretDestillering {

    private GridPane gridPane;
    private TextField rgstrMedarbejderTxf, væskeMængdeTxf;
    private DatePicker startDatoDtp, slutDatoDtp;
    private ComboBox<String> maltBatchCbo, rygeMaterialeCbo, kornSortCbo;
    private Label startDatoLbl, slutDatoLbl, kornSortLbl, rygeMaterialeLbl, rgstrMedarbejderLbl, væskemængdeLbl, maltBatchLbl, bemærkningerLbl;
    private Button fortsætBtn, tilbageBtn;

    public OpretDestillering() {
        this.gridPane = new GridPane();
        this.gridPane.setVgap(5);
        this.gridPane.setHgap(20);

        //Medarbejder
        rgstrMedarbejderLbl = new Label("Registrer medarbejder:");
        rgstrMedarbejderTxf = new TextField("Medarbejder ID");

        this.gridPane.add(rgstrMedarbejderLbl, 0, 0);
        this.gridPane.add(rgstrMedarbejderTxf,0, 1);
        rgstrMedarbejderTxf.setStyle("-fx-text-fill: gray;");

        //start og slut dato
        startDatoLbl = new Label("Start dato:");
        startDatoDtp = new DatePicker();

        slutDatoLbl = new Label("Slut dato:");
        slutDatoDtp = new DatePicker();

        this.gridPane.add(startDatoLbl, 0, 3);
        this.gridPane.add(startDatoDtp, 0, 4);

        this.gridPane.add(slutDatoLbl, 0 , 6);
        this.gridPane.add(slutDatoDtp, 0 , 7);

        //Maltbatch
        maltBatchLbl = new Label("Maltbatch:");
        maltBatchCbo = new ComboBox<String>();
        maltBatchCbo.getItems().addAll("batch1", "batch2", "batch3", "batch4");
        this.gridPane.add(maltBatchLbl, 1 , 0);
        this.gridPane.add(maltBatchCbo, 1, 1);

        //Væskemængde
        væskemængdeLbl = new Label("Indtast væskemængde:");
        væskeMængdeTxf = new TextField("Indtast..");

        this.gridPane.add(væskemængdeLbl, 1, 3);
        this.gridPane.add(væskeMængdeTxf, 1, 4);
        væskeMængdeTxf.setStyle("-fx-text-fill: gray;");


    }


    public Scene getScene() {
        return new Scene(this.gridPane, 800, 500);
    }
}