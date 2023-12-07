package gui;

import javafx.application.Application;
import javafx.stage.Stage;

public class Gui extends Application {

    private StartPage startPage;
    private OpretDestillering mainMenu;

    @Override
    public void start(Stage primaryStage) {
        this.startPage = new StartPage();
        this.mainMenu = new OpretDestillering();

        primaryStage.setScene(startPage.createStartScene(primaryStage, mainMenu));
        primaryStage.setHeight(800);
        primaryStage.setWidth(800);
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }


}