package FXML_FIle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class OverOptionControl {

    @FXML
    private Button btFiveOver;

    @FXML
    private Button btTenOver;

    @FXML
    private Button btTwenty;

    @FXML
    private Button btODI;

    @FXML
    private Button btHomePage;


    private Stage stage;
    private Parent root;

    @FXML
    void ODI(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("PlayerList_Team1.fxml"));
        root = loader.load();

        PlayerListTeam1Control playerListTeam1Control = loader.getController();
        playerListTeam1Control.setOverLimit(50);

        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();

    }

    @FXML
    void fiveOver(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("PlayerList_Team1.fxml"));
        root = loader.load();

        PlayerListTeam1Control playerListTeam1Control = loader.getController();
        playerListTeam1Control.setOverLimit(5);

        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
        stage.setX(600);
        stage.setY(80);

    }

    @FXML
    void tenOver(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("PlayerList_Team1.fxml"));
        root = loader.load();

        PlayerListTeam1Control playerListTeam1Control = loader.getController();
        playerListTeam1Control.setOverLimit(10);

        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
        stage.setX(600);
        stage.setY(80);

    }

    @FXML
    void twentyOver(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("PlayerList_Team1.fxml"));
        root = loader.load();

        PlayerListTeam1Control playerListTeam1Control = loader.getController();
        playerListTeam1Control.setOverLimit(20);

        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
        stage.setX(600);
        stage.setY(80);

    }

    @FXML
    void homepage(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("HomePage.fxml"));
        root = loader.load();

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
        stage.setX(600);
        stage.setY(100);


    }




}
