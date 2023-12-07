package gui;

//import application.controller.Controller;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.ActionEvent;

public class Gui extends Application {

    private TextField vælgDestillatTXT, vælgStartTXT, vælgSlutTXT, vælgBatchTXT, vælgVæskeTXT, vælgRøgTXT, vælgSortTXT, vælgMedarbjderTXT, bemærkningTXT;
    private ListView<String> destillatListLW;
    private TextArea bemærkningTXA;
    private GridPane gridPane;
    private Button loginBtn;


    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("LavWhisky");

        //Startside:
        BorderPane startPane = new BorderPane();
        Button loginBtn = new Button("Login");

        //Knap funktion:
        loginBtn.setOnAction(event -> {
            primaryStage.setScene(new Scene(gridPane, 800, 500));
        });

        startPane.setCenter(loginBtn);

        Scene startScene = new Scene(startPane, 400, 200);

        //Hovedside:
        gridPane = new GridPane();
        gridPane.setVgap(20);
        gridPane.setHgap(20);

        vælgDestillatTXT = new TextField();
        vælgStartTXT = new TextField();
        vælgSlutTXT = new TextField();
        vælgBatchTXT = new TextField();
        vælgVæskeTXT = new TextField();
        vælgRøgTXT = new TextField();
        vælgSortTXT = new TextField();
        vælgMedarbjderTXT = new TextField();
        bemærkningTXT = new TextField();
        destillatListLW = new ListView<>();
        bemærkningTXA = new TextArea();
        vælgDestillatTXT.setText("Hej haukur");
        gridPane.add(vælgDestillatTXT,0 ,0);

        primaryStage.setScene(startScene);
        primaryStage.setHeight(200);
        primaryStage.setWidth(400);
        primaryStage.show();










        //TODO Tilføj knapper og andre ting til UI
    }

    private void initContent(BorderPane pane) {
        TabPane tabPane = new TabPane();
        this.initTabPane(tabPane);
        pane.setCenter(tabPane);
    }

    private void initTabPane(TabPane tabPane) {
        tabPane.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);

    }



}

