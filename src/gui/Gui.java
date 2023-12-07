package gui;

import javafx.application.Application;
import javafx.stage.Stage;

public class Gui extends Application {

    private StartPage startPage;
    private OpretDestillering opretDestillering;
    private OpretFad opretFad;
    private OpretLager opretLager;

    @Override
    public void start(Stage primaryStage) {
        this.startPage = new StartPage();
        this.opretDestillering = new OpretDestillering();
        this.opretFad = new OpretFad();
        this.opretLager = new OpretLager();

        primaryStage.setScene(startPage.createStartScene(primaryStage, opretDestillering, opretFad, opretLager));
        primaryStage.setHeight(800);
        primaryStage.setWidth(800);
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }


}