package pl.com.a2ya.area3.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;
import pl.com.a2ya.area3.controller.factory.popupFactory;


import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    private popupFactory factory;

    @FXML
    private Button exitButton;
    @FXML
    private Button loginButton;

    @FXML
    private AnchorPane loginAnchor;
    @FXML
    private TextField loginTXT;

    @FXML
    private TextField passwordTXT;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
       initExitButton();
        initLoginButton();
    }

    public HelloController(){
        factory = new popupFactory();
    }


    private void initLoginButton() {
        loginButton.setOnAction((x) ->{
          performAuthentication();
        });
    }

    private void performAuthentication() {

        Stage waitingPopup = factory.createWaitPopup("Connecting to server. Please waite ..");
        waitingPopup.show();
        String login = loginTXT.getText();
        String password = passwordTXT.getText();
        System.out.println("Login to: " + login + "a hasło to: " + password);

    }

    private void initExitButton() {
        exitButton.setOnAction((x) -> {
            getStage().close();
        });
    }
    private Stage getStage(){

        return (Stage) loginButton.getScene().getWindow();
    }
}
