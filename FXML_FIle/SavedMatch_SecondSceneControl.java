package FXML_FIle;


import DatabaseFile.DatabaseConnection;
import TableViewFiles.TableBatsman;
import TableViewFiles.TableBowler;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SavedMatch_SecondSceneControl {

    @FXML
    private Label lblSearchPlayer;

    @FXML
    private TextField txtSearchPlayer;

    @FXML
    private TableView<TableBatsman> batsmanTable1;

    @FXML
    private TableColumn<TableBatsman, String> col_BatsmanName1;

    @FXML
    private TableColumn<TableBatsman, String> col_OutType1;

    @FXML
    private TableColumn<TableBatsman, String> col_BatsmanRun1;

    @FXML
    private TableColumn<TableBatsman, String> col_BallPlayed1;

    @FXML
    private TableColumn<TableBatsman, String> col_FourRun1;

    @FXML
    private TableColumn<TableBatsman, String> col_SixRun1;

    @FXML
    private TableColumn<TableBatsman, String> col_StrikeRate1;

    @FXML
    private TableView<TableBowler> bowlersTable1;

    @FXML
    private TableColumn<TableBowler, String> col_BowlerName1;

    @FXML
    private TableColumn<TableBowler, String> col_Over1;

    @FXML
    private TableColumn<TableBowler, String> col_Maiden1;

    @FXML
    private TableColumn<TableBowler, String> col_GivenRun1;

    @FXML
    private TableColumn<TableBowler, String> col_Wicket1;

    @FXML
    private TableColumn<TableBowler, String> col_Wide1;

    @FXML
    private TableColumn<TableBowler, String> col_NoBall1;

    @FXML
    private TableColumn<TableBowler, String> col_Eco1;

    @FXML
    private TableView<TableBatsman> batsmanTable2;

    @FXML
    private TableColumn<TableBatsman, String> col_BatsmanName2;

    @FXML
    private TableColumn<TableBatsman, String> col_OutType2;

    @FXML
    private TableColumn<TableBatsman, String> col_BatsmanRun2;

    @FXML
    private TableColumn<TableBatsman, String> col_BallPlayed2;

    @FXML
    private TableColumn<TableBatsman, String> col_FourRun2;

    @FXML
    private TableColumn<TableBatsman, String> col_SixRun2;

    @FXML
    private TableColumn<TableBatsman, String> col_StrikeRate2;

    @FXML
    private TableView<TableBowler> bowlersTable2;

    @FXML
    private TableColumn<TableBowler, String> col_BowlerName2;

    @FXML
    private TableColumn<TableBowler, String> col_Over2;

    @FXML
    private TableColumn<TableBowler, String> col_Maiden2;

    @FXML
    private TableColumn<TableBowler, String> col_GivenRun2;

    @FXML
    private TableColumn<TableBowler, String> col_Wicket2;

    @FXML
    private TableColumn<TableBowler, String> col_Wide2;

    @FXML
    private TableColumn<TableBowler, String> col_NoBall2;

    @FXML
    private TableColumn<TableBowler, String> col_Eco2;

    @FXML
    private Button btnExit;

    @FXML
    private Label lbMatchInfo1;

    @FXML
    private Label lbMatchInfo2;

    @FXML
    private Label lbMatchStatus;

    @FXML
    private Label lbTeamName;




    private Stage stage;
    private Parent root;


    ObservableList<TableBatsman> list1, list3;
    ObservableList<TableBowler> list2, list4;

    public void tableList(String databaseName){

        col_BatsmanName1.setCellValueFactory(new PropertyValueFactory<TableBatsman, String>("playerName"));
        col_OutType1.setCellValueFactory(new PropertyValueFactory<TableBatsman, String>("outType"));
        col_BatsmanRun1.setCellValueFactory(new PropertyValueFactory<TableBatsman, String>("batsmanRun"));
        col_BallPlayed1.setCellValueFactory(new PropertyValueFactory<TableBatsman, String>("ballPlayed"));
        col_FourRun1.setCellValueFactory(new PropertyValueFactory<TableBatsman, String>("fourRun"));
        col_SixRun1.setCellValueFactory(new PropertyValueFactory<TableBatsman, String>("sixRun"));
        col_StrikeRate1.setCellValueFactory(new PropertyValueFactory<TableBatsman, String>("strikeRate"));

        col_BatsmanName2.setCellValueFactory(new PropertyValueFactory<TableBatsman, String>("playerName"));
        col_OutType2.setCellValueFactory(new PropertyValueFactory<TableBatsman, String>("outType"));
        col_BatsmanRun2.setCellValueFactory(new PropertyValueFactory<TableBatsman, String>("batsmanRun"));
        col_BallPlayed2.setCellValueFactory(new PropertyValueFactory<TableBatsman, String>("ballPlayed"));
        col_FourRun2.setCellValueFactory(new PropertyValueFactory<TableBatsman, String>("fourRun"));
        col_SixRun2.setCellValueFactory(new PropertyValueFactory<TableBatsman, String>("sixRun"));
        col_StrikeRate2.setCellValueFactory(new PropertyValueFactory<TableBatsman, String>("strikeRate"));

        col_BowlerName1.setCellValueFactory(new PropertyValueFactory<>("bowlerName"));
        col_Over1.setCellValueFactory(new PropertyValueFactory<>("bowlerOver"));
        col_Maiden1.setCellValueFactory(new PropertyValueFactory<>("maidenOver"));
        col_GivenRun1.setCellValueFactory(new PropertyValueFactory<>("runGiven"));
        col_Wicket1.setCellValueFactory(new PropertyValueFactory<>("wicketTaken"));
        col_Wide1.setCellValueFactory(new PropertyValueFactory<>("wideBall"));
        col_NoBall1.setCellValueFactory(new PropertyValueFactory<>("noBall"));
        col_Eco1.setCellValueFactory(new PropertyValueFactory<>("economy"));

        col_BowlerName2.setCellValueFactory(new PropertyValueFactory<>("bowlerName"));
        col_Over2.setCellValueFactory(new PropertyValueFactory<>("bowlerOver"));
        col_Maiden2.setCellValueFactory(new PropertyValueFactory<>("maidenOver"));
        col_GivenRun2.setCellValueFactory(new PropertyValueFactory<>("runGiven"));
        col_Wicket2.setCellValueFactory(new PropertyValueFactory<>("wicketTaken"));
        col_Wide2.setCellValueFactory(new PropertyValueFactory<>("wideBall"));
        col_NoBall2.setCellValueFactory(new PropertyValueFactory<>("noBall"));
        col_Eco2.setCellValueFactory(new PropertyValueFactory<>("economy"));

        try{
            list1 = new DatabaseConnection(databaseName,"root","").getBatsmanData("batsman1");
            list2 = new DatabaseConnection(databaseName,"root","").getBowlerData("bowler1");
            list3 = new DatabaseConnection(databaseName,"root","").getBatsmanData("batsman2");
            list4 = new DatabaseConnection(databaseName,"root","").getBowlerData("bowler2");
        }catch (Exception e){

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Something ERROR happened");
            alert.setHeaderText("Unknown Database");
            alert.setContentText("Please check SQL connection");
            alert.show();
        }


        batsmanTable1.setItems(list1);
        bowlersTable1.setItems(list2);

        batsmanTable2.setItems(list3);
        bowlersTable2.setItems(list4);
        searchData(databaseName);
    }

    ObservableList<TableBatsman> data1 ,data2;
    ObservableList<TableBowler> data3, data4;
    public void searchData(String databaseName){

        col_BatsmanName1.setCellValueFactory(new PropertyValueFactory<>("playerName"));
        col_OutType1.setCellValueFactory(new PropertyValueFactory<>("outType"));
        col_BatsmanRun1.setCellValueFactory(new PropertyValueFactory<>("batsmanRun"));
        col_BallPlayed1.setCellValueFactory(new PropertyValueFactory<>("ballPlayed"));
        col_FourRun1.setCellValueFactory(new PropertyValueFactory<>("fourRun"));
        col_SixRun1.setCellValueFactory(new PropertyValueFactory<>("sixRun"));
        col_StrikeRate1.setCellValueFactory(new PropertyValueFactory<>("strikeRate"));

        col_BatsmanName2.setCellValueFactory(new PropertyValueFactory<TableBatsman, String>("playerName"));
        col_OutType2.setCellValueFactory(new PropertyValueFactory<TableBatsman, String>("outType"));
        col_BatsmanRun2.setCellValueFactory(new PropertyValueFactory<TableBatsman, String>("batsmanRun"));
        col_BallPlayed2.setCellValueFactory(new PropertyValueFactory<TableBatsman, String>("ballPlayed"));
        col_FourRun2.setCellValueFactory(new PropertyValueFactory<TableBatsman, String>("fourRun"));
        col_SixRun2.setCellValueFactory(new PropertyValueFactory<TableBatsman, String>("sixRun"));
        col_StrikeRate2.setCellValueFactory(new PropertyValueFactory<TableBatsman, String>("strikeRate"));

        col_BowlerName1.setCellValueFactory(new PropertyValueFactory<>("bowlerName"));
        col_Over1.setCellValueFactory(new PropertyValueFactory<>("bowlerOver"));
        col_Maiden1.setCellValueFactory(new PropertyValueFactory<>("maidenOver"));
        col_GivenRun1.setCellValueFactory(new PropertyValueFactory<>("runGiven"));
        col_Wicket1.setCellValueFactory(new PropertyValueFactory<>("wicketTaken"));
        col_Wide1.setCellValueFactory(new PropertyValueFactory<>("wideBall"));
        col_NoBall1.setCellValueFactory(new PropertyValueFactory<>("noBall"));
        col_Eco1.setCellValueFactory(new PropertyValueFactory<>("economy"));

        col_BowlerName2.setCellValueFactory(new PropertyValueFactory<>("bowlerName"));
        col_Over2.setCellValueFactory(new PropertyValueFactory<>("bowlerOver"));
        col_Maiden2.setCellValueFactory(new PropertyValueFactory<>("maidenOver"));
        col_GivenRun2.setCellValueFactory(new PropertyValueFactory<>("runGiven"));
        col_Wicket2.setCellValueFactory(new PropertyValueFactory<>("wicketTaken"));
        col_Wide2.setCellValueFactory(new PropertyValueFactory<>("wideBall"));
        col_NoBall2.setCellValueFactory(new PropertyValueFactory<>("noBall"));
        col_Eco2.setCellValueFactory(new PropertyValueFactory<>("economy"));

        try{
            data1 = new DatabaseConnection(databaseName,"root","").getBatsmanData("batsman1");
            data2 = new DatabaseConnection(databaseName,"root","").getBatsmanData("batsman2");
            data3 = new DatabaseConnection(databaseName,"root","").getBowlerData("bowler1");
            data4 = new DatabaseConnection(databaseName,"root","").getBowlerData("bowler2");
        }catch (Exception e){

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Something ERROR happened");
            alert.setHeaderText("Unknown Database");
            alert.setContentText("Please check SQL connection");
            alert.show();
        }

        batsmanTable1.setItems(data1);
        batsmanTable2.setItems(data2);

        bowlersTable1.setItems(data3);
        bowlersTable2.setItems(data4);

        FilteredList<TableBatsman> filterData1 = new FilteredList<>(data1, e-> true);
        txtSearchPlayer.textProperty().addListener((observable, oldValue, newValue) -> {
            filterData1.setPredicate(tableBatsman -> {
                if(newValue == null || newValue.isEmpty() || newValue.isBlank()){
                    return true;
                }
                String lowercaseFilter = newValue.toLowerCase();

                if(tableBatsman.getPlayerName().toLowerCase().indexOf(lowercaseFilter) != -1){
                    return true;
                }else
                    return false;
            });
        });

        FilteredList<TableBatsman> filterData2 = new FilteredList<>(data2, e-> true);
        txtSearchPlayer.textProperty().addListener((observable, oldValue, newValue) -> {
            filterData2.setPredicate(tableBatsman -> {
                if(newValue == null || newValue.isEmpty() || newValue.isBlank()){
                    return true;
                }
                String lowercaseFilter = newValue.toLowerCase();

                if(tableBatsman.getPlayerName().toLowerCase().indexOf(lowercaseFilter) != -1){
                    return true;
                }else
                    return false;
            });
        });

        FilteredList<TableBowler> filterData3 = new FilteredList<>(data3, e-> true);
        txtSearchPlayer.textProperty().addListener((observable, oldValue, newValue) -> {
            filterData3.setPredicate(tableBatsman -> {
                if(newValue == null || newValue.isEmpty() || newValue.isBlank()){
                    return true;
                }
                String lowercaseFilter = newValue.toLowerCase();

                if(tableBatsman.getBowlerName().toLowerCase().indexOf(lowercaseFilter) != -1){
                    return true;
                }else
                    return false;
            });
        });

        FilteredList<TableBowler> filterData4 = new FilteredList<>(data4, e-> true);
        txtSearchPlayer.textProperty().addListener((observable, oldValue, newValue) -> {
            filterData4.setPredicate(tableBatsman -> {
                if(newValue == null || newValue.isEmpty() || newValue.isBlank()){
                    return true;
                }
                String lowercaseFilter = newValue.toLowerCase();

                if(tableBatsman.getBowlerName().toLowerCase().indexOf(lowercaseFilter) != -1){
                    return true;
                }else
                    return false;
            });
        });

        SortedList<TableBatsman> sortedData1 = new SortedList<>(filterData1);
        SortedList<TableBatsman> sortedData2 = new SortedList<>(filterData2);
        SortedList<TableBowler> sortedData3 = new SortedList<>(filterData3);
        SortedList<TableBowler> sortedData4 = new SortedList<>(filterData4);

        sortedData1.comparatorProperty().bind(batsmanTable1.comparatorProperty());
        sortedData2.comparatorProperty().bind(batsmanTable2.comparatorProperty());

        sortedData3.comparatorProperty().bind(bowlersTable1.comparatorProperty());
        sortedData4.comparatorProperty().bind(bowlersTable2.comparatorProperty());

        batsmanTable1.setItems(sortedData1);
        batsmanTable2.setItems(sortedData2);

        bowlersTable1.setItems(sortedData3);
        bowlersTable2.setItems(sortedData4);
    }


    public void matchInfoUpdate(String databaseName) throws SQLException, ClassNotFoundException {

        lbTeamName.setText("#" + databaseName);

        Connection connection = new DatabaseConnection(databaseName,"root","").getConnection();

        Statement statement = connection.createStatement();

        String sql1 = "SELECT * FROM matchinfo1";
        String sql2 = "SELECT * FROM matchinfo2";
        String sql3 = "SELECT * FROM match_status";


        ResultSet matchinfo1 = statement.executeQuery(sql1);
        while (matchinfo1.next())
            lbMatchInfo1.setText(matchinfo1.getString("match_info1"));


        ResultSet matchinfo2 = statement.executeQuery(sql2);
        while (matchinfo2.next())
            lbMatchInfo2.setText(matchinfo2.getString("match_info2"));


        ResultSet match_status = statement.executeQuery(sql3);
        while (match_status.next())
            lbMatchStatus.setText(match_status.getString("match_status"));


        statement.close();


    }




    public void exit(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("HomePage.fxml"));
        root = loader.load();

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
        stage.setX(600);
        stage.setY(100);

    }

}
