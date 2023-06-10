package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController extends Thread{
    public TextField txtUserName;
    public AnchorPane pane;

    static String userName;

    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {

        userName=txtUserName.getText();
        txtUserName.clear();
        Stage stage=new Stage();
        stage.setScene(new Scene(FXMLLoader.load(LoginFormController.class.getResource("../view/ClientForm.fxml"))));
        stage.close();
        stage.centerOnScreen();
        stage.show();


    }



}
