package com.srohter.loginmenu;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField emailBox;
    @FXML
    private PasswordField passwordBox;
    @FXML
    private CheckBox rememberBox;
    @FXML
    private Label rememberLabel;
    @FXML
    private Label forgotPassword;
    @FXML
    private Button loginButton;
    @FXML
    private Label preUser;
    @FXML
    private Label prePass;


    @FXML
    protected void onLoginButtonClick(){
        
    }
    @FXML
    protected void prePassEnter(){
        prePass.setDisable(true);
        System.out.println("1");
    }
    @FXML
    protected void prePassExit(){
        prePass.setDisable(false);
        System.out.println("2");
    }
}