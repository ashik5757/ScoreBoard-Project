package FXML_FIle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class SavedMatch_FirstSceneControl {

    private Parent root;
    private Stage stage;
    private Scene scene;

    @FXML
    private ComboBox<String> cbSelectMatch;

    @FXML
    private Label lblSelectMatch;

    @FXML
    private Button btnSelect;

    @FXML
    private Button btBack;


    public void addMatchData(ArrayList<String> databaseNamesArrayList){

        for(String d: databaseNamesArrayList){
            cbSelectMatch.getItems().add(d.toString());
        }
    }

    public void selectMatch(ActionEvent event) throws IOException, SQLException, ClassNotFoundException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("SavedMatch_SecondScene.fxml"));
        root = loader.load();

        SavedMatch_SecondSceneControl savedMatch2 = loader.getController();
        savedMatch2.tableList(cbSelectMatch.getValue());
        savedMatch2.matchInfoUpdate(cbSelectMatch.getValue());

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setX(200);
        stage.setY(50);

    }


    @FXML
    void backHome(ActionEvent event) throws IOException {


        FXMLLoader loader = new FXMLLoader(getClass().getResource("HomePage.fxml"));
        root = loader.load();

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
        stage.setX(600);
        stage.setY(100);

    }



}
