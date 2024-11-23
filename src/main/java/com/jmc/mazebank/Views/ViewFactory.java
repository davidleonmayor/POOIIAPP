package com.jmc.mazebank.Views;

import com.jmc.mazebank.Controllers.Client.ClientController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/* Init UI loading main composed scenes with logic */
public class ViewFactory {
    // Scenes path
    private final String LOGIN_PATH = "/Fxml/Login.fxml";
    private final String CLIENT_MENU_PATH = "/FXML/Client/ClientMenu.fxml";
    private final String DASHBOARD_PATH = "/FXML/Client/Dashboard.fxml";
    private final String MAIN_CLIENT_WINDOW = "/FXML/Client/Client.fxml";

    private AnchorPane dashboardView;

    // public ViewFactor() {}

    // if isn't initiated, init
    public AnchorPane getDashboardView () {
        if (dashboardView == null) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource(DASHBOARD_PATH));
                dashboardView = loader.load();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }

        return dashboardView;
    }

    public void showLoginWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(LOGIN_PATH));
        createStage(loader);
    }

    public void showClientWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(MAIN_CLIENT_WINDOW));
        ClientController clientController = new ClientController();
        loader.setController(clientController);
        createStage(loader);
    }

    private void createStage(FXMLLoader loader) {
        Scene scene = null;
        try {
            scene = new Scene(loader.load());
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("MazeBank");
        stage.show();
    }
}