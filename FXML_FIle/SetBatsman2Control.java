package FXML_FIle;

import ClassFile.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

import java.io.IOException;

public class SetBatsman2Control {

    @FXML
    private ComboBox<String> cbStriker;

    @FXML
    private ComboBox<String> cbNonStriker;

    @FXML
    private Button btStart;


    private Team team1;
    private Team team2;
    private ScoreBoard scoreBoard;
    private int overLimit;

    private Stage stage;
    private Parent root;
    private ScoreBoard scoreBoard00;


    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public int getOverLimit() {
        return overLimit;
    }

    public void setOverLimit(int overLimit) {
        this.overLimit = overLimit;
    }

    public ScoreBoard getScoreBoard00() {
        return scoreBoard00;
    }

    public void setScoreBoard00(ScoreBoard scoreBoard00) {
        this.scoreBoard00 = scoreBoard00;
    }

    public ScoreBoard getScoreBoard() {
        return scoreBoard;
    }

    public void setScoreBoard(ScoreBoard scoreBoard) {
        this.scoreBoard = scoreBoard;
    }



    public void setComboBox() {

        String[] nameList = {

                team2.getPlayersList().get(0).getPlayerName(),
                team2.getPlayersList().get(1).getPlayerName(),
                team2.getPlayersList().get(2).getPlayerName(),
                team2.getPlayersList().get(3).getPlayerName(),
                team2.getPlayersList().get(4).getPlayerName(),
                team2.getPlayersList().get(5).getPlayerName(),
                team2.getPlayersList().get(6).getPlayerName(),
                team2.getPlayersList().get(7).getPlayerName(),
                team2.getPlayersList().get(8).getPlayerName(),
                team2.getPlayersList().get(9).getPlayerName(),
                team2.getPlayersList().get(10).getPlayerName()
        };

        cbStriker.getItems().setAll(nameList);
        cbNonStriker.getItems().setAll(nameList);
    }



    @FXML
    void start(ActionEvent event) throws IOException {

        if (cbNonStriker.getValue()==null || cbStriker.getValue()==null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText("You didn't select any option");
            alert.setContentText("Please select a option");
            alert.show();
        }


        else {

            if (cbStriker.getValue().equals(cbNonStriker.getValue())) {

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Something Error Happened");
                alert.setHeaderText("You selected Same Batsman");
                alert.setContentText("Please Select Two different Batsman");
                alert.show();
            }


            else if (!cbStriker.getValue().equals(cbNonStriker.getValue())) {

                FXMLLoader loader = new FXMLLoader(getClass().getResource("ScoreBoard_SplitPane2.fxml"));
                root = loader.load();

                ScoreBoard scoreBoard = new ScoreBoard(2);

                scoreBoard.setTeams(team2,team1);
                scoreBoard.updateBatsmenListTeam1(team2.getPlayersList().get(getSelectStrikerIndex()));
                scoreBoard.updateBatsmenListTeam1(team2.getPlayersList().get(getSelectNonStrikerIndex()));

                scoreBoard.setScoreBoardStriker(scoreBoard.getBatsmenListTeam1().get(0));
                scoreBoard.setScoreBoardNonStriker(scoreBoard.getBatsmenListTeam1().get(1));



                ScoreBoardSplitPane2Control scoreBoardSplitPane2Control = loader.getController();
                scoreBoardSplitPane2Control.setScoreBoard(scoreBoard);
                scoreBoardSplitPane2Control.setScoreBoard00(scoreBoard00);
                scoreBoardSplitPane2Control.setCbSelectBowlers();
                scoreBoardSplitPane2Control.setCbSelectOutBatsman();
                scoreBoardSplitPane2Control.setCbSelectBatsman();
                scoreBoardSplitPane2Control.setCbExtraRun();
                scoreBoardSplitPane2Control.setCbSelectRun();
                scoreBoardSplitPane2Control.setCbOutType();
                scoreBoardSplitPane2Control.setCbOutByPlayer();
                scoreBoardSplitPane2Control.setOverLimit(this.overLimit);
                scoreBoardSplitPane2Control.scoreBoardUpdate();
                scoreBoardSplitPane2Control.selectBowlersMsg();

                scoreBoardSplitPane2Control.setStage((Stage) ((Node)event.getSource()).getScene().getWindow());

                stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                stage.setScene(new Scene(root));
                stage.setX(100);
                stage.setY(50);
                stage.show();


            }
        }

    }

    public int getSelectStrikerIndex() {
        return cbStriker.getSelectionModel().getSelectedIndex();
    }

    public int getSelectNonStrikerIndex() {
        return cbNonStriker.getSelectionModel().getSelectedIndex();
    }


}
