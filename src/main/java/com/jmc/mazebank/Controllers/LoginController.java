package com.jmc.mazebank.Controllers;

import com.jmc.mazebank.Models.Model;
import com.jmc.mazebank.Views.ViewFactory;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    public ChoiceBox acc_selector;
    public Label payee_address_label;
    public TextField payee_address_fld;
    public TextField password_fld;
    public Button login_btn;
    public Label error_lbl;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // login_btn.setOnAction(event -> Model.getInstance().getViewFactory().showClientWindow());
        login_btn.setOnAction(event -> onLogin());
    }

    private void onLogin() {
        Model.getInstance().getViewFactory().showClientWindow();
        Model.getInstance().getViewFactory().closeStage((Stage) acc_selector.getScene().getWindow());

    }
}
