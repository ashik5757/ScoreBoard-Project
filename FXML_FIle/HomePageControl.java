package FXML_FIle;

import DatabaseFile.DatabaseNames;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;

public class HomePageControl {

    @FXML
    private Button btNewMatch;

    @FXML
    private Button btSavedMatch;

    @FXML
    private Button btExit;

    private Stage stage;
    private Parent root;

    @FXML
    void exit(ActionEvent event) {


        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Log Out");
        alert.setHeaderText("You are about to EXIT");
        alert.setContentText("Are you sure??");

        if (alert.showAndWait().get() == ButtonType.OK) {
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.close();
        }


    }

    @FXML
    void newMatch(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("OverOption.fxml"));
        root = loader.load();

        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
        stage.setX(530);
        stage.setY(200);

    }




    @FXML
    void savedMatch(ActionEvent event) throws IOException, URISyntaxException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("SavedMatch_FirstScene.fxml"));
        root = loader.load();

        SavedMatch_FirstSceneControl savedMatch = loader.getController();
        savedMatch.addMatchData(new DatabaseNames().getDatabaseNames());

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
        stage.setX(500);
        stage.setY(200);



    }

}
