package gui;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class StartPage {

    private static Button opretFadBtn, opretDestilleringBtn, opretLagerBtn;

    public static Scene createStartScene(Stage primaryStage, OpretDestillering mainMenu) {
        primaryStage.setTitle("LavWhisky");
        GridPane startPane = new GridPane();

        opretFadBtn = new Button("Opret fad");
        opretLagerBtn = new Button("Opret lager");
        opretDestilleringBtn = new Button("Opret destillering");
        startPane.add(opretDestilleringBtn,2,2);
        startPane.add(opretFadBtn, 1, 2);
        startPane.add(opretLagerBtn, 3, 2);


        opretDestilleringBtn.setOnAction(event -> primaryStage.setScene(mainMenu.getScene()));


        return new Scene(startPane, 800, 500);
    }
}