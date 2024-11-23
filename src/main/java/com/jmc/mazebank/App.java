package com.jmc.mazebank;

import javafx.application.Application;
import javafx.stage.Stage;

import com.jmc.mazebank.Models.Model;

public class App extends Application {
//    @Override
//    public void start(Stage stage) throws Exception {
//        // FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Fxml/Login.fxml"));
//        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Styles/Login.fxml"));
//        Scene scene = new Scene(fxmlLoader.load());
//        stage.setScene(scene);
//        stage.show();
//    }

    @Override
    public void start(Stage stage) throws Exception {
        Model.getInstance().showLogin();
    }
}
