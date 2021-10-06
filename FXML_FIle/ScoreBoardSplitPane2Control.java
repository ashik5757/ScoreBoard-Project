package FXML_FIle;

import ClassFile.Batsman;
import ClassFile.Bowler;
import ClassFile.ScoreBoard;
import DatabaseFile.DatabaseConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ScoreBoardSplitPane2Control {

    @FXML
    private Label batting;

    @FXML
    private Label lbName1;

    @FXML
    private Label lbName2;

    @FXML
    private Label lbName3;

    @FXML
    private Label lbName4;

    @FXML
    private Label lbName5;

    @FXML
    private Label lbName6;

    @FXML
    private Label lbName7;

    @FXML
    private Label lbName8;

    @FXML
    private Label lbName9;

    @FXML
    private Label lbName10;

    @FXML
    private Label lbName11;

    @FXML
    private Label lbTotal;

    @FXML
    private Label lbOutType1;

    @FXML
    private Label lbOutType2;

    @FXML
    private Label lbOutType3;

    @FXML
    private Label lbOutType4;

    @FXML
    private Label lbOutType5;

    @FXML
    private Label lbOutType6;

    @FXML
    private Label lbOutType7;

    @FXML
    private Label lbOutType8;

    @FXML
    private Label lbOutType9;

    @FXML
    private Label lbOutType10;

    @FXML
    private Label lbOutType11;

    @FXML
    private Label lbExtra;

    @FXML
    private Label run1;

    @FXML
    private Label lbRun1;

    @FXML
    private Label lbRun2;

    @FXML
    private Label lbRun3;

    @FXML
    private Label lbRun4;

    @FXML
    private Label lbRun5;

    @FXML
    private Label lbRun6;

    @FXML
    private Label lbRun7;

    @FXML
    private Label lbRun8;

    @FXML
    private Label lbRun9;

    @FXML
    private Label lbRun10;

    @FXML
    private Label lbRun11;

    @FXML
    private Label ball;

    @FXML
    private Label lbBall1;

    @FXML
    private Label lbBall2;

    @FXML
    private Label lbBall3;

    @FXML
    private Label lbBall4;

    @FXML
    private Label lbBall5;

    @FXML
    private Label lbBall6;

    @FXML
    private Label lbBall7;

    @FXML
    private Label lbBall8;

    @FXML
    private Label lbBall9;

    @FXML
    private Label lbBall10;

    @FXML
    private Label lbBall11;

    @FXML
    private Label four;

    @FXML
    private Label lbFour1;

    @FXML
    private Label lbFour2;

    @FXML
    private Label lbFour3;

    @FXML
    private Label lbFour4;

    @FXML
    private Label lbFour5;

    @FXML
    private Label lbFour6;

    @FXML
    private Label lbFour7;

    @FXML
    private Label lbFour8;

    @FXML
    private Label lbFour9;

    @FXML
    private Label lbFour10;

    @FXML
    private Label lbFour11;

    @FXML
    private Label six;

    @FXML
    private Label lbSix1;

    @FXML
    private Label lbSix2;

    @FXML
    private Label lbSix3;

    @FXML
    private Label lbSix4;

    @FXML
    private Label lbSix5;

    @FXML
    private Label lbSix6;

    @FXML
    private Label lbSix7;

    @FXML
    private Label lbSix8;

    @FXML
    private Label lbSix9;

    @FXML
    private Label lbSix10;

    @FXML
    private Label lbSix11;

    @FXML
    private Label strikeRate;

    @FXML
    private Label lbSR1;

    @FXML
    private Label lbSR2;

    @FXML
    private Label lbSR3;

    @FXML
    private Label lbSR4;

    @FXML
    private Label lbSR5;

    @FXML
    private Label lbSR6;

    @FXML
    private Label lbSR7;

    @FXML
    private Label lbSR8;

    @FXML
    private Label lbSR9;

    @FXML
    private Label lbSR10;

    @FXML
    private Label lbSR11;

    @FXML
    private Label lbTotalOver;

    @FXML
    private Label lbCrr;

    @FXML
    private Label lbBowlersName1;

    @FXML
    private Label lbBowlersName2;

    @FXML
    private Label lbBowlersName3;

    @FXML
    private Label lbBowlersName4;

    @FXML
    private Label lbBowlersName5;

    @FXML
    private Label lbBowlersName6;

    @FXML
    private Label lbBowlersName7;

    @FXML
    private Label lbBowlersName8;

    @FXML
    private Label lbBowlersName9;

    @FXML
    private Label over;

    @FXML
    private Label lbOver1;

    @FXML
    private Label lbOver2;

    @FXML
    private Label lbOver3;

    @FXML
    private Label lbOver4;

    @FXML
    private Label lbOver5;

    @FXML
    private Label lbOver6;

    @FXML
    private Label lbOver7;

    @FXML
    private Label lbOver8;

    @FXML
    private Label lbOver9;

    @FXML
    private Label maidenOver;

    @FXML
    private Label lbMaiden1;

    @FXML
    private Label lbMaiden2;

    @FXML
    private Label lbMaiden3;

    @FXML
    private Label lbMaiden4;

    @FXML
    private Label lbMaiden5;

    @FXML
    private Label lbMaiden6;

    @FXML
    private Label lbMaiden7;

    @FXML
    private Label lbMaiden8;

    @FXML
    private Label lbMaiden9;

    @FXML
    private Label run2;

    @FXML
    private Label lbBowlersRun1;

    @FXML
    private Label lbBowlersRun2;

    @FXML
    private Label lbBowlersRun3;

    @FXML
    private Label lbBowlersRun4;

    @FXML
    private Label lbBowlersRun5;

    @FXML
    private Label lbBowlersRun6;

    @FXML
    private Label lbBowlersRun7;

    @FXML
    private Label lbBowlersRun8;

    @FXML
    private Label lbBowlersRun9;


    @FXML
    private Label wicket;

    @FXML
    private Label lbWickets1;

    @FXML
    private Label lbWickets2;

    @FXML
    private Label lbWickets3;

    @FXML
    private Label lbWickets4;

    @FXML
    private Label lbWickets5;

    @FXML
    private Label lbWickets6;

    @FXML
    private Label lbWickets7;

    @FXML
    private Label lbWickets8;

    @FXML
    private Label lbWickets9;

    @FXML
    private Label wideBall;

    @FXML
    private Label lbWideBall1;

    @FXML
    private Label lbWideBall2;

    @FXML
    private Label lbWideBall3;

    @FXML
    private Label lbWideBall4;

    @FXML
    private Label lbWideBall5;

    @FXML
    private Label lbWideBall6;

    @FXML
    private Label lbWideBall7;

    @FXML
    private Label lbWideBall8;

    @FXML
    private Label lbWideBall9;


    @FXML
    private Label noBall;

    @FXML
    private Label lbNoBall1;

    @FXML
    private Label lbNoBall2;

    @FXML
    private Label lbNoBall3;

    @FXML
    private Label lbNoBall4;

    @FXML
    private Label lbNoBall5;

    @FXML
    private Label lbNoBall6;

    @FXML
    private Label lbNoBall7;

    @FXML
    private Label lbNoBall8;

    @FXML
    private Label lbNoBall9;

    @FXML
    private Label econ;

    @FXML
    private Label lbEcon1;

    @FXML
    private Label lbEcon2;

    @FXML
    private Label lbEcon3;

    @FXML
    private Label lbEcon4;

    @FXML
    private Label lbEcon5;

    @FXML
    private Label lbEcon6;

    @FXML
    private Label lbEcon7;

    @FXML
    private Label lbEcon8;

    @FXML
    private Label lbEcon9;


    @FXML
    private Label Team1;

    @FXML
    private Label Team2;

    @FXML
    private Label run;

    @FXML
    private Label lbTarget;

    @FXML
    private Label lbNeedRunFromBall;

    @FXML
    private Label lbRrr;

    @FXML
    private Button bt1;

    @FXML
    private Button bt2;

    @FXML
    private Button bt3;

    @FXML
    private Button bt4;

    @FXML
    private Button bt6;

    @FXML
    private Button bt0;

    @FXML
    private ComboBox<Integer> selectRun;

    @FXML
    private ComboBox<Integer> extraRun;

    @FXML
    private Button submitRun;

    @FXML
    private Button submitExtraRun;

    @FXML
    private Button btSwitchBatsman;

    @FXML
    private Button btNoBall;

    @FXML
    private Button btWideBall;


    @FXML
    private ComboBox<String> cbSelectBowlers;

    @FXML
    private Button btSetBowlers;

    @FXML
    private ComboBox<String> cbSelectOutBatsman;

    @FXML
    private Button btOut;

    @FXML
    private ComboBox<String> cbOutType;

    @FXML
    private Button btSubmitOutType;

    @FXML
    private Button btOutByPlayer;

    @FXML
    private ComboBox<String> cbOutByPlayer;

    @FXML
    private ComboBox<String> cbSelectBatsman;

    @FXML
    private Button btSetBatsman;

    private Stage stage;
    private Parent root;

    private ScoreBoard scoreBoard;
    private ScoreBoard scoreBoard00;
    private  int tempRun= -1;



    public void setOverLimit(int overLimit) {
        scoreBoard.setOverLimit(overLimit);
    }




    @FXML
    void passRun0(ActionEvent event) {

        scoreBoard.updateScore(0);
        scoreBoardUpdate();
    }

    @FXML
    void passRun1(ActionEvent event) {

        scoreBoard.updateScore(1);
        scoreBoardUpdate();
        switchBatsman(event);
    }

    @FXML
    void passRun2(ActionEvent event) {

        scoreBoard.updateScore(2);
        scoreBoardUpdate();

    }

    @FXML
    void passRun3(ActionEvent event) {

        scoreBoard.updateScore(3);
        scoreBoardUpdate();
        switchBatsman(event);

    }

    @FXML
    void passRun4(ActionEvent event) {

        scoreBoard.updateScore(4);
        scoreBoardUpdate();


    }

    @FXML
    void passRun6(ActionEvent event) {

        scoreBoard.updateScore(6);
        scoreBoardUpdate();


    }

    public void submitRun(ActionEvent event) {

        if (selectRun.getValue()==null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText("You didn't select any option");
            alert.setContentText("Please select an option");
            alert.show();
        }

        else {

            if (selectRun.getValue()==5 || selectRun.getValue()==7)
                switchBatsman(event);

            scoreBoard.updateScore2(selectRun.getValue());
            scoreBoardUpdate();
        }

    }

    public void submitExtraRun(ActionEvent event) {

        if (extraRun.getValue()==null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText("You didn't select any option");
            alert.setContentText("Please select an option");
            alert.show();
        }

        else {

            if (extraRun.getValue() == 1 || extraRun.getValue() == 3)
                switchBatsman(event);

            scoreBoard.updateExtraRun(extraRun.getValue());
            bowlerChanged = true;
            scoreBoardUpdate();
            bowlerChanged = false;
        }

    }

    @FXML
    void switchBatsman(ActionEvent event) {

        scoreBoard.switchBatsman();
        bowlerChanged = true;
        scoreBoardUpdate();
        bowlerChanged = false;
        setCbSelectOutBatsman();

    }



    @FXML
    void noBall(ActionEvent event) {

        ButtonType proceed = new ButtonType("Proceed");
        ButtonType cancel = new ButtonType("Cancel");
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("REMINDER");
        alert.setHeaderText("No Ball will rule out the previous ball\n\nPlease update the run info before pressing No Ball.");
        alert.setContentText("Are you sure to PROCEED..............?");
        alert.getButtonTypes().setAll(proceed,cancel);

        if (alert.showAndWait().get() == proceed) {

            scoreBoard.noBall();
            bowlerChanged = true;
            scoreBoardUpdate();
            bowlerChanged = false;

            buttonDisable(false);
        }

    }

    @FXML
    void wideBall(ActionEvent event) {
        scoreBoard.wideBall();
        bowlerChanged = true;
        scoreBoardUpdate();
        bowlerChanged = false;
    }


    public void autoSwitchBatsman(ActionEvent event) {

        if (scoreBoard.getTotalBall()%6==0 && scoreBoard.getTotalBall()!=0  && Double.parseDouble(scoreBoard.getTotalOver())!=scoreBoard.getOverLimit())
            switchBatsman(event);

    }




    private int bowlerCount = 0;        // indicate how many bowler already bowled
    private boolean bowlerChanged = false;
    private boolean isBowlerChanged = false;


    @FXML
    void selectBowlers(ActionEvent event) {

        if (getCbSelectedBowlers()==-1) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText("You didn't select any Bowler");
            alert.setContentText("Please select a Bowler");
            alert.show();
        }

        else {

            if (searchBowlerIndex()==-1) {
                scoreBoard.updateBowlersListTeam2(scoreBoard.getTeams()[1].getPlayersList().get(getCbSelectedBowlers()));
                scoreBoard.setScoreBoardCurrentBowler(scoreBoard.getBowlersListTeam2().get(bowlerCount));
                bowlerCount++;
                bowlerChanged = true;
                scoreBoardUpdate();
                bowlerChanged = false;

                autoSwitchBatsman(event);
                buttonDisable(false);
                setCbOutType();
                cbOutType.getSelectionModel().select(-1);
                cbOutType.setPromptText("Out Type");

                isBowlerChanged = true;
            }
            else if (searchBowlerIndex()!=-1) {

                if (scoreBoard.getCurrentPlayer().getCurrentBowlers().getPlayer()==scoreBoard.getTeams()[1].getPlayersList().get(getCbSelectedBowlers())) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("ERROR");
                    alert.setHeaderText("You select same bowler");
                    alert.setContentText("Please select other bowler");
                    alert.show();
                }

                else {
                    scoreBoard.setScoreBoardCurrentBowler(scoreBoard.getBowlersListTeam2().get(searchBowlerIndex()));
                    bowlerChanged = true;
                    scoreBoardUpdate();
                    bowlerChanged = false;

                    autoSwitchBatsman(event);
                    buttonDisable(false);
                    setCbOutType();
                    cbOutType.getSelectionModel().select(-1);
                    cbOutType.setPromptText("Out Type");

                    isBowlerChanged = true;
                }

            }

        }

    }




    public void buttonDisable(boolean status) {
        bt0.setDisable(status);
        bt1.setDisable(status);
        bt2.setDisable(status);
        bt3.setDisable(status);
        bt4.setDisable(status);
        bt6.setDisable(status);
        btNoBall.setDisable(status);
        btWideBall.setDisable(status);
        btSwitchBatsman.setDisable(status);
        selectRun.setDisable(status);
        extraRun.setDisable(status);
        submitRun.setDisable(status);
        submitExtraRun.setDisable(status);
        cbSelectBowlers.setDisable(status);
        btSetBowlers.setDisable(status);
        cbSelectOutBatsman.setDisable(status);
        btOut.setDisable(status);
    }



    @FXML
    void outSelectBatsman(ActionEvent event) {

        if (getCbSelectOutBatsman()==-1) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Something ERROR Happened");
            alert.setHeaderText("You didn't select any Batsman");
            alert.setContentText("Please select a Batsman");
            alert.show();
        }

        else {

            ButtonType proceed = new ButtonType("Proceed");
            ButtonType cancel = new ButtonType("Cancel");
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("REMINDER");
            alert.setHeaderText("Run-Out don't increase ball info \n\nSo, if out type is Run-Out, \n      Please update run info before out the batsman");
            alert.setContentText("Are you sure to PROCEED..............?");
            alert.getButtonTypes().setAll(proceed,cancel);


            if ((scoreBoard.getTotalBall()%6==0 && scoreBoard.getTotalBall()!=0 && isBowlerChanged == false) || Double.parseDouble(scoreBoard.getTotalOver())==scoreBoard.getOverLimit()) {

                if (getCbSelectOutBatsman()==0) {
                    scoreBoard.setBatsmanOut(scoreBoard.getScoreBoardStriker(),true);
                }
                else if (getCbSelectOutBatsman()==1) {
                    scoreBoard.setBatsmanOut(scoreBoard.getScoreBoardNonStriker(),false);
                    String[] outType = {"Run Out"};
                    cbOutType.getItems().setAll(outType);
                    cbOutType.getSelectionModel().selectFirst();
                    //cbOutType.getSelectionModel().clearSelection();
                }

                buttonDisable(true);

                cbOutType.setDisable(false);
                btSubmitOutType.setDisable(false);

                bowlerChanged = true;
                scoreBoardUpdate();
                bowlerChanged = false;

            }


            else {

                if (alert.showAndWait().get() == proceed) {

                    if (getCbSelectOutBatsman()==0) {
                        scoreBoard.setBatsmanOut(scoreBoard.getScoreBoardStriker(),true);
                    }
                    else if (getCbSelectOutBatsman()==1) {
                        scoreBoard.setBatsmanOut(scoreBoard.getScoreBoardNonStriker(),false);
                        String[] outType = {"Run Out"};
                        cbOutType.getItems().setAll(outType);
                        cbOutType.getSelectionModel().selectFirst();
                        //cbOutType.getSelectionModel().clearSelection();
                    }


                    buttonDisable(true);

                    cbOutType.setDisable(false);
                    btSubmitOutType.setDisable(false);

                    bowlerChanged = true;
                    scoreBoardUpdate();
                    bowlerChanged = false;

                }
            }



        }

    }



    @FXML
    void submitOutType(ActionEvent event) {

        if (cbOutType.getValue()==null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Something ERROR Happened");
            alert.setHeaderText("You didn't select any option");
            alert.setContentText("Please select an option");
            alert.show();
        }

        else {

            if (cbOutType.getValue()!=null) {
                cbOutType.setDisable(true);
                btSubmitOutType.setDisable(true);
            }


            if (cbOutType.getValue().equals("Bowled Out")) {
                cbSelectBatsman.setDisable(false);
                btSetBatsman.setDisable(false);

                if (getCbSelectOutBatsman()==0) {
                    scoreBoard.setBatsmanOutType("Bowled Out",scoreBoard.getScoreBoardStriker());
                }
                else if (getCbSelectOutBatsman()==1) {
                    scoreBoard.setBatsmanOutType("Bowled Out",scoreBoard.getScoreBoardNonStriker());
                }

            }

            else if (cbOutType.getValue().equals("LBW")) {
                cbSelectBatsman.setDisable(false);
                btSetBatsman.setDisable(false);

                if (getCbSelectOutBatsman()==0) {
                    scoreBoard.setBatsmanOutType("LBW",scoreBoard.getScoreBoardStriker());
                }
                else if (getCbSelectOutBatsman()==1) {
                    scoreBoard.setBatsmanOutType("LBW",scoreBoard.getScoreBoardNonStriker());
                }

            }


            else {
                cbOutByPlayer.setDisable(false);
                btOutByPlayer.setDisable(false);
            }


            bowlerChanged = true;
            scoreBoardUpdate();
            bowlerChanged = false;


            if ((cbOutType.getValue().equals("Bowled Out")||cbOutType.getValue().equals("LBW")) && (scoreBoard.getFallenWickets()==10 || Double.parseDouble(scoreBoard.getTotalOver())==scoreBoard.getOverLimit())) {
                matchEnd();
            }

        }

    }



    private boolean runOut = false;


    @FXML
    void submitOutByPlayer(ActionEvent event) {


        if (cbOutByPlayer.getValue()==null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Something ERROR Happened");
            alert.setHeaderText("You didn't select any option");
            alert.setContentText("Please select an option");
            alert.show();
        }


        if (cbOutType.getValue().equals("Catch Out")) {

            if (getCbSelectOutBatsman()==0) {
                scoreBoard.setBatsmanOutType("Catch Out",cbOutByPlayer.getValue(),scoreBoard.getScoreBoardStriker());
            }
            else if (getCbSelectOutBatsman()==1) {
                scoreBoard.setBatsmanOutType("Catch Out",cbOutByPlayer.getValue(),scoreBoard.getScoreBoardNonStriker());
            }


        }

        else if (cbOutType.getValue().equals("Run Out")) {

            if (getCbSelectOutBatsman()==0) {
                scoreBoard.setBatsmanOutType("Run Out",cbOutByPlayer.getValue(),scoreBoard.getScoreBoardStriker());
                runOut = true;
            }
            else if (getCbSelectOutBatsman()==1) {
                scoreBoard.setBatsmanOutType("Run Out",cbOutByPlayer.getValue(),scoreBoard.getScoreBoardNonStriker());
                setCbOutType();
                cbOutType.getSelectionModel().select(-1);
                cbOutType.setPromptText("Out Type");
                runOut = true;
            }
        }

        else if (cbOutType.getValue().equals("Stamp")) {

            if (getCbSelectOutBatsman()==0) {
                scoreBoard.setBatsmanOutType("Stamp",cbOutByPlayer.getValue(),scoreBoard.getScoreBoardStriker());
            }
            else if (getCbSelectOutBatsman()==1) {
                scoreBoard.setBatsmanOutType("Stamp",cbOutByPlayer.getValue(),scoreBoard.getScoreBoardNonStriker());
            }
        }

        if (cbOutByPlayer.getValue()!=null) {

            cbOutByPlayer.setDisable(true);
            btOutByPlayer.setDisable(true);

            cbSelectBatsman.setDisable(false);
            btSetBatsman.setDisable(false);

            bowlerChanged = true;
            scoreBoardUpdate();
            bowlerChanged = false;

            if (scoreBoard.getFallenWickets()==10 || Double.parseDouble(scoreBoard.getTotalOver())==scoreBoard.getOverLimit()) {
                matchEnd();
            }
        }

    }









    @FXML
    void selectBatsman(ActionEvent event) {

        if (cbSelectBatsman.getValue()==null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Something ERROR Happened");
            alert.setHeaderText("You didn't select any Batsman");
            alert.setContentText("Please select a Batsman");
            alert.show();
        }

        else {

            if (searchBatsmanBatted()) {

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("ERROR");
                alert.setHeaderText("This Batsman already batted");
                alert.setContentText("Please select other batsman");
                alert.show();
            }

            else if (!searchBatsmanBatted()) {

                scoreBoard.updateBatsmenListTeam1(scoreBoard.getTeams()[0].getPlayersList().get(getCbSelectBatsman()));

                if (getCbSelectOutBatsman()==0) {
                    scoreBoard.setScoreBoardStriker(scoreBoard.getBatsmenListTeam1().get(scoreBoard.getBatsmenListTeam1().size()-1));
                }

                else if (getCbSelectOutBatsman()==1) {
                    scoreBoard.setScoreBoardNonStriker(scoreBoard.getBatsmenListTeam1().get(scoreBoard.getBatsmenListTeam1().size()-1));
                }

                buttonDisable(false);

                cbSelectBatsman.setDisable(true);
                btSetBatsman.setDisable(true);


                if (runOut) {
                    switchBatsman(event);
                    bowlerChanged = true;
                    scoreBoardUpdate();
                    bowlerChanged = false;
                    runOut = false;
                }
                else
                    scoreBoardUpdate();


                if (scoreBoard.getTotalBall()%6==0 && scoreBoard.getTotalBall()!=0 && Double.parseDouble(scoreBoard.getTotalOver())!=scoreBoard.getOverLimit()) {
                    buttonDisable(true);
                    cbSelectBowlers.setDisable(false);
                    btSetBowlers.setDisable(false);
                }

                setCbSelectOutBatsman();

            }

        }

    }







    public void setCbSelectRun() {
        selectRun.getItems().setAll(5,6,7);
    }


    public void setCbExtraRun() {
        extraRun.getItems().setAll(1,2,3,4,5);
    }


    public void setCbSelectBowlers() {

        String[] nameList = {
                scoreBoard.getTeams()[1].getPlayersList().get(0).getPlayerName(),
                scoreBoard.getTeams()[1].getPlayersList().get(1).getPlayerName(),
                scoreBoard.getTeams()[1].getPlayersList().get(2).getPlayerName(),
                scoreBoard.getTeams()[1].getPlayersList().get(3).getPlayerName(),
                scoreBoard.getTeams()[1].getPlayersList().get(4).getPlayerName(),
                scoreBoard.getTeams()[1].getPlayersList().get(5).getPlayerName(),
                scoreBoard.getTeams()[1].getPlayersList().get(6).getPlayerName(),
                scoreBoard.getTeams()[1].getPlayersList().get(7).getPlayerName(),
                scoreBoard.getTeams()[1].getPlayersList().get(8).getPlayerName(),
                scoreBoard.getTeams()[1].getPlayersList().get(9).getPlayerName(),
                scoreBoard.getTeams()[1].getPlayersList().get(10).getPlayerName()

        };

        cbSelectBowlers.getItems().setAll(nameList);
    }

    public int getCbSelectedBowlers() {
        return cbSelectBowlers.getSelectionModel().getSelectedIndex();
    }

    public int searchBowlerIndex() {
        int count = 0;
        boolean found = false;
        for (Bowler bowler : scoreBoard.getBowlersListTeam2()){
            if (bowler.getPlayer()==scoreBoard.getTeams()[1].getPlayersList().get(getCbSelectedBowlers())){
                found = true;
                break;
            }
            count++;
        }

        if (found)
            return count;
        else
            return -1;

    }



    public void setCbOutType() {
        String[] outType = {"Bowled Out","Catch Out","Run Out","LBW","Stamp"};
        cbOutType.getItems().setAll(outType);
    }

    public int getCbOutType() {
        return cbOutType.getSelectionModel().getSelectedIndex();
    }

    public void setCbOutByPlayer() {

        String[] nameList = {
                scoreBoard.getTeams()[1].getPlayersList().get(0).getPlayerName(),
                scoreBoard.getTeams()[1].getPlayersList().get(1).getPlayerName(),
                scoreBoard.getTeams()[1].getPlayersList().get(2).getPlayerName(),
                scoreBoard.getTeams()[1].getPlayersList().get(3).getPlayerName(),
                scoreBoard.getTeams()[1].getPlayersList().get(4).getPlayerName(),
                scoreBoard.getTeams()[1].getPlayersList().get(5).getPlayerName(),
                scoreBoard.getTeams()[1].getPlayersList().get(6).getPlayerName(),
                scoreBoard.getTeams()[1].getPlayersList().get(7).getPlayerName(),
                scoreBoard.getTeams()[1].getPlayersList().get(8).getPlayerName(),
                scoreBoard.getTeams()[1].getPlayersList().get(9).getPlayerName(),
                scoreBoard.getTeams()[1].getPlayersList().get(10).getPlayerName()
        };

        cbOutByPlayer.getItems().setAll(nameList);
    }

    public int getCbOutByPlayer() {
        return cbOutByPlayer.getSelectionModel().getSelectedIndex();
    }



    public void setCbSelectOutBatsman() {

        String[] nameList = {
                scoreBoard.getCurrentPlayer().getStriker().getPlayer().getPlayerName(),
                scoreBoard.getCurrentPlayer().getNonStriker().getPlayer().getPlayerName()
        };

        cbSelectOutBatsman.getItems().setAll(nameList);

    }

    public int getCbSelectOutBatsman() {
        return cbSelectOutBatsman.getSelectionModel().getSelectedIndex();
    }



    public void setCbSelectBatsman() {

        String[] nameList = {
                scoreBoard.getTeams()[0].getPlayersList().get(0).getPlayerName(),
                scoreBoard.getTeams()[0].getPlayersList().get(1).getPlayerName(),
                scoreBoard.getTeams()[0].getPlayersList().get(2).getPlayerName(),
                scoreBoard.getTeams()[0].getPlayersList().get(3).getPlayerName(),
                scoreBoard.getTeams()[0].getPlayersList().get(4).getPlayerName(),
                scoreBoard.getTeams()[0].getPlayersList().get(5).getPlayerName(),
                scoreBoard.getTeams()[0].getPlayersList().get(6).getPlayerName(),
                scoreBoard.getTeams()[0].getPlayersList().get(7).getPlayerName(),
                scoreBoard.getTeams()[0].getPlayersList().get(8).getPlayerName(),
                scoreBoard.getTeams()[0].getPlayersList().get(9).getPlayerName(),
                scoreBoard.getTeams()[0].getPlayersList().get(10).getPlayerName()

        };

        cbSelectBatsman.getItems().setAll(nameList);
    }

    public int getCbSelectBatsman() {
        return cbSelectBatsman.getSelectionModel().getSelectedIndex();
    }


    public boolean searchBatsmanBatted() {

        boolean found = false;
        for (Batsman batsman : scoreBoard.getBatsmenListTeam1()){
            if (batsman.getPlayer().getPlayerName().equals(cbSelectBatsman.getValue())){
                found = true;
                break;
            }

        }

        return found;

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

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public Stage getStage() {
        return stage;
    }









    // striker

    public int searchStriker() {

        int count = 1;
        boolean found = false;

        for (Batsman batsman : scoreBoard.getBatsmenListTeam1()) {
            if (batsman == scoreBoard.getScoreBoardStriker()) {
                found = true;
                break;
            }
            count++;
        }

        if (found)
            return count;
        else
            return 0;
    }


    // Non-Striker

    public int searchNonStriker() {

        int count = 1;
        boolean found = false;

        for (Batsman batsman : scoreBoard.getBatsmenListTeam1()) {
            if (batsman == scoreBoard.getScoreBoardNonStriker()) {
                found = true;
                break;
            }
            count++;
        }

        if (found)
            return count;
        else
            return 0;
    }





    public void indicateBatsmanLabel(int check) {

        if (check == 1)
            changeText(lbName1,0);
        else if (check == 2)
            changeText(lbName2,1);
        else if (check == 3)
            changeText(lbName3,2);
        else if (check == 4)
            changeText(lbName4,3);
        else if (check == 5)
            changeText(lbName5,4);
        else if (check == 6)
            changeText(lbName6,5);
        else if (check == 7)
            changeText(lbName7,6);
        else if (check == 8)
            changeText(lbName8,7);
        else if (check == 9)
            changeText(lbName9,8);
        else if (check == 10)
            changeText(lbName10,9);
        else if (check == 11)
            changeText(lbName11,10);

    }

    public void fontChangeBatsmanLabel(int check) {

        if (check == 1) {
            changeFont(lbName1);
            changeFont(lbOutType1);
            changeFont(lbRun1);
            changeFont(lbBall1);
            changeFont(lbFour1);
            changeFont(lbSix1);
            changeFont(lbSR1);
        }
        else if (check == 2) {
            changeFont(lbName2);
            changeFont(lbOutType2);
            changeFont(lbRun2);
            changeFont(lbBall2);
            changeFont(lbFour2);
            changeFont(lbSix2);
            changeFont(lbSR2);
        }

        else if (check == 3) {
            changeFont(lbName3);
            changeFont(lbOutType3);
            changeFont(lbRun3);
            changeFont(lbBall3);
            changeFont(lbFour3);
            changeFont(lbSix3);
            changeFont(lbSR3);

        }

        else if (check == 4) {
            changeFont(lbName4);
            changeFont(lbOutType4);
            changeFont(lbRun4);
            changeFont(lbBall4);
            changeFont(lbFour4);
            changeFont(lbSix4);
            changeFont(lbSR4);

        }

        else if (check == 5) {
            changeFont(lbName5);
            changeFont(lbOutType5);
            changeFont(lbRun5);
            changeFont(lbBall5);
            changeFont(lbFour5);
            changeFont(lbSix5);
            changeFont(lbSR5);
        }

        else if (check == 6){
            changeFont(lbName6);
            changeFont(lbOutType6);
            changeFont(lbRun6);
            changeFont(lbBall6);
            changeFont(lbFour6);
            changeFont(lbSix6);
            changeFont(lbSR6);
        }

        else if (check == 7) {
            changeFont(lbName7);
            changeFont(lbOutType7);
            changeFont(lbRun7);
            changeFont(lbBall7);
            changeFont(lbFour7);
            changeFont(lbSix7);
            changeFont(lbSR7);
        }

        else if (check == 8) {
            changeFont(lbName8);
            changeFont(lbOutType8);
            changeFont(lbRun8);
            changeFont(lbBall8);
            changeFont(lbFour8);
            changeFont(lbSix8);
            changeFont(lbSR8);
        }

        else if (check == 9) {
            changeFont(lbName9);
            changeFont(lbOutType9);
            changeFont(lbRun9);
            changeFont(lbBall9);
            changeFont(lbFour9);
            changeFont(lbSix9);
            changeFont(lbSR9);
        }

        else if (check == 10) {
            changeFont(lbName10);
            changeFont(lbOutType10);
            changeFont(lbRun10);
            changeFont(lbBall10);
            changeFont(lbFour10);
            changeFont(lbSix10);
            changeFont(lbSR10);
        }

        else if (check == 11) {
            changeFont(lbName11);
            changeFont(lbOutType11);
            changeFont(lbRun11);
            changeFont(lbBall11);
            changeFont(lbFour11);
            changeFont(lbSix11);
            changeFont(lbSR11);
        }


    }


    public void fontChangeALLNormal() {

        changeFontRegular(lbName1);
        changeFontRegular(lbOutType1);
        changeFontRegular(lbRun1);
        changeFontRegular(lbBall1);
        changeFontRegular(lbFour1);
        changeFontRegular(lbSix1);
        changeFontRegular(lbSR1);

        changeFontRegular(lbName2);
        changeFontRegular(lbOutType2);
        changeFontRegular(lbRun2);
        changeFontRegular(lbBall2);
        changeFontRegular(lbFour2);
        changeFontRegular(lbSix2);
        changeFontRegular(lbSR2);

        changeFontRegular(lbName3);
        changeFontRegular(lbOutType3);
        changeFontRegular(lbRun3);
        changeFontRegular(lbBall3);
        changeFontRegular(lbFour3);
        changeFontRegular(lbSix3);
        changeFontRegular(lbSR3);

        changeFontRegular(lbName4);
        changeFontRegular(lbOutType4);
        changeFontRegular(lbRun4);
        changeFontRegular(lbBall4);
        changeFontRegular(lbFour4);
        changeFontRegular(lbSix4);
        changeFontRegular(lbSR4);


        changeFontRegular(lbName5);
        changeFontRegular(lbOutType5);
        changeFontRegular(lbRun5);
        changeFontRegular(lbBall5);
        changeFontRegular(lbFour5);
        changeFontRegular(lbSix5);
        changeFontRegular(lbSR5);

        changeFontRegular(lbName6);
        changeFontRegular(lbOutType6);
        changeFontRegular(lbRun6);
        changeFontRegular(lbBall6);
        changeFontRegular(lbFour6);
        changeFontRegular(lbSix6);
        changeFontRegular(lbSR6);

        changeFontRegular(lbName7);
        changeFontRegular(lbOutType7);
        changeFontRegular(lbRun7);
        changeFontRegular(lbBall7);
        changeFontRegular(lbFour7);
        changeFontRegular(lbSix7);
        changeFontRegular(lbSR7);

        changeFontRegular(lbName8);
        changeFontRegular(lbOutType8);
        changeFontRegular(lbRun8);
        changeFontRegular(lbBall8);
        changeFontRegular(lbFour8);
        changeFontRegular(lbSix8);
        changeFontRegular(lbSR8);

        changeFontRegular(lbName9);
        changeFontRegular(lbOutType9);
        changeFontRegular(lbRun9);
        changeFontRegular(lbBall9);
        changeFontRegular(lbFour9);
        changeFontRegular(lbSix9);
        changeFontRegular(lbSR9);

        changeFontRegular(lbName10);
        changeFontRegular(lbOutType10);
        changeFontRegular(lbRun10);
        changeFontRegular(lbBall10);
        changeFontRegular(lbFour10);
        changeFontRegular(lbSix10);
        changeFontRegular(lbSR10);

        changeFontRegular(lbName11);
        changeFontRegular(lbOutType11);
        changeFontRegular(lbRun11);
        changeFontRegular(lbBall11);
        changeFontRegular(lbFour11);
        changeFontRegular(lbSix11);
        changeFontRegular(lbSR11);


        // Bowlers

        changeFontRegular(lbBowlersName1);
        changeFontRegular(lbOver1);
        changeFontRegular(lbMaiden1);
        changeFontRegular(lbBowlersRun1);
        changeFontRegular(lbWickets1);
        changeFontRegular(lbWideBall1);
        changeFontRegular(lbNoBall1);
        changeFontRegular(lbEcon1);

        changeFontRegular(lbBowlersName2);
        changeFontRegular(lbOver2);
        changeFontRegular(lbMaiden2);
        changeFontRegular(lbBowlersRun2);
        changeFontRegular(lbWickets2);
        changeFontRegular(lbWideBall2);
        changeFontRegular(lbNoBall2);
        changeFontRegular(lbEcon2);

        changeFontRegular(lbBowlersName3);
        changeFontRegular(lbOver3);
        changeFontRegular(lbMaiden3);
        changeFontRegular(lbBowlersRun3);
        changeFontRegular(lbWickets3);
        changeFontRegular(lbWideBall3);
        changeFontRegular(lbNoBall3);
        changeFontRegular(lbEcon3);

        changeFontRegular(lbBowlersName4);
        changeFontRegular(lbOver4);
        changeFontRegular(lbMaiden4);
        changeFontRegular(lbBowlersRun4);
        changeFontRegular(lbWickets4);
        changeFontRegular(lbWideBall4);
        changeFontRegular(lbNoBall4);
        changeFontRegular(lbEcon4);

        changeFontRegular(lbBowlersName5);
        changeFontRegular(lbOver5);
        changeFontRegular(lbMaiden5);
        changeFontRegular(lbBowlersRun5);
        changeFontRegular(lbWickets5);
        changeFontRegular(lbWideBall5);
        changeFontRegular(lbNoBall5);
        changeFontRegular(lbEcon5);

        changeFontRegular(lbBowlersName6);
        changeFontRegular(lbOver6);
        changeFontRegular(lbMaiden6);
        changeFontRegular(lbBowlersRun6);
        changeFontRegular(lbWickets6);
        changeFontRegular(lbWideBall6);
        changeFontRegular(lbNoBall6);
        changeFontRegular(lbEcon6);

        changeFontRegular(lbBowlersName7);
        changeFontRegular(lbOver7);
        changeFontRegular(lbMaiden7);
        changeFontRegular(lbBowlersRun7);
        changeFontRegular(lbWickets7);
        changeFontRegular(lbWideBall7);
        changeFontRegular(lbNoBall7);
        changeFontRegular(lbEcon7);

        changeFontRegular(lbBowlersName8);
        changeFontRegular(lbOver8);
        changeFontRegular(lbMaiden8);
        changeFontRegular(lbBowlersRun8);
        changeFontRegular(lbWickets8);
        changeFontRegular(lbWideBall8);
        changeFontRegular(lbNoBall8);
        changeFontRegular(lbEcon8);

        changeFontRegular(lbBowlersName9);
        changeFontRegular(lbOver9);
        changeFontRegular(lbMaiden9);
        changeFontRegular(lbBowlersRun9);
        changeFontRegular(lbWickets9);
        changeFontRegular(lbWideBall9);
        changeFontRegular(lbNoBall9);
        changeFontRegular(lbEcon9);



    }





// Bowlers

    public int searchCurrentBowlers() {

        int count = 1;
        boolean found = false;

        for (Bowler bowler : scoreBoard.getBowlersListTeam2()) {
            if (bowler == scoreBoard.getScoreBoardBowlers()) {
                found = true;
                break;
            }
            count++;
        }

        if (found)
            return count;
        else
            return 0;
    }



    public void fontChangeBowlersLabel(int check) {

        if (check == 1) {
            changeFont(lbBowlersName1);
            changeFont(lbOver1);
            changeFont(lbMaiden1);
            changeFont(lbBowlersRun1);
            changeFont(lbWickets1);
            changeFont(lbWideBall1);
            changeFont(lbNoBall1);
            changeFont(lbEcon1);
        }
        else if (check == 2) {
            changeFont(lbBowlersName2);
            changeFont(lbOver2);
            changeFont(lbMaiden2);
            changeFont(lbBowlersRun2);
            changeFont(lbWickets2);
            changeFont(lbWideBall2);
            changeFont(lbNoBall2);
            changeFont(lbEcon2);
        }

        else if (check == 3) {
            changeFont(lbBowlersName3);
            changeFont(lbOver3);
            changeFont(lbMaiden3);
            changeFont(lbBowlersRun3);
            changeFont(lbWickets3);
            changeFont(lbWideBall3);
            changeFont(lbNoBall3);
            changeFont(lbEcon3);

        }

        else if (check == 4) {
            changeFont(lbBowlersName4);
            changeFont(lbOver4);
            changeFont(lbMaiden4);
            changeFont(lbBowlersRun4);
            changeFont(lbWickets4);
            changeFont(lbWideBall4);
            changeFont(lbNoBall4);
            changeFont(lbEcon4);

        }

        else if (check == 5) {
            changeFont(lbBowlersName5);
            changeFont(lbOver5);
            changeFont(lbMaiden5);
            changeFont(lbBowlersRun5);
            changeFont(lbWickets5);
            changeFont(lbWideBall5);
            changeFont(lbNoBall5);
            changeFont(lbEcon5);
        }

        else if (check == 6){
            changeFont(lbBowlersName6);
            changeFont(lbOver6);
            changeFont(lbMaiden6);
            changeFont(lbBowlersRun6);
            changeFont(lbWickets6);
            changeFont(lbWideBall6);
            changeFont(lbNoBall6);
            changeFont(lbEcon6);
        }

        else if (check == 7) {
            changeFont(lbBowlersName7);
            changeFont(lbOver7);
            changeFont(lbMaiden7);
            changeFont(lbBowlersRun7);
            changeFont(lbWickets7);
            changeFont(lbWideBall7);
            changeFont(lbNoBall7);
            changeFont(lbEcon7);
        }

        else if (check == 8) {
            changeFont(lbBowlersName8);
            changeFont(lbOver8);
            changeFont(lbMaiden8);
            changeFont(lbBowlersRun8);
            changeFont(lbWickets8);
            changeFont(lbWideBall8);
            changeFont(lbNoBall8);
            changeFont(lbEcon8);
        }

        else if (check == 9) {
            changeFont(lbBowlersName9);
            changeFont(lbOver9);
            changeFont(lbMaiden9);
            changeFont(lbBowlersRun9);
            changeFont(lbWickets9);
            changeFont(lbWideBall9);
            changeFont(lbNoBall9);
            changeFont(lbEcon9);
        }


    }










    public void changeText(Label label, int index) {
        label.setText("*" + scoreBoard.getBatsmenListTeam1().get(index).getPlayer().getPlayerName());
    }

    public void changeFont(Label label) {
        label.setStyle("-fx-font-weight : bold;" + "-fx-font-style : italic;" + "-fx-text-fill : linear-gradient(to left, #43c6ac, #191654);" );
    }

    public void changeFontRegular(Label label) {
        label.setStyle("-fx-font-weight : normal;" + "-fx-text-fill : black;");
    }

















    public void selectBowlersMsg() {

        buttonDisable(true);

        cbSelectBowlers.setDisable(false);
        btSetBowlers.setDisable(false);

        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("ATTENTION!!!!!!");
        alert.setHeaderText("First you have to select a Bowler");
        alert.setContentText("Please select the bowler from 'Chose Bowlers' option");
        alert.show();
    }





    public void scoreBoardUpdate() {

        if (scoreBoard.getTotalBall()%6==0 && bowlerChanged == false) {

            if (scoreBoard.getTotalRun()==tempRun) {
                scoreBoard.getScoreBoardBowlers().maidenOver();
            }
            tempRun = scoreBoard.getTotalRun();
        }


        if (scoreBoard.getTotalBall()%6==0 && scoreBoard.getTotalBall()!=0 && bowlerChanged == false && Double.parseDouble(scoreBoard.getTotalOver())!=scoreBoard.getOverLimit() && scoreBoard.getTotalRun()<scoreBoard00.getTargetRun()) {

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("ATTENTION!!!!!!");
            alert.setHeaderText("One Over Completed.");
            alert.setContentText("Please change the bowler.");
            alert.show();



            buttonDisable(true);
            extraRun.setDisable(false);
            submitExtraRun.setDisable(false);
            btNoBall.setDisable(false);
            cbSelectBowlers.setDisable(false);
            btSetBowlers.setDisable(false);
            cbSelectOutBatsman.setDisable(false);
            btOut.setDisable(false);

            String[] outType = {"Run Out"};
            cbOutType.getItems().setAll(outType);
            cbOutType.getSelectionModel().selectFirst();

            isBowlerChanged = false;

        }


        Team1.setText(scoreBoard.getTeams()[1].getName());
        Team2.setText(scoreBoard.getTeams()[0].getName());


        DecimalFormat twoPoint = new DecimalFormat("#.##");
        int reqRun;
        int remainBall;
        double rrr;

        if (scoreBoard.getTotalRun()>=scoreBoard00.getTargetRun() || Double.parseDouble(scoreBoard.getTotalOver())==scoreBoard.getOverLimit()) {
            reqRun = 0;
            remainBall = 0;
            rrr = 0.0;
        }

        else {
            reqRun = scoreBoard00.getTargetRun()-scoreBoard.getTotalRun();
            remainBall = (scoreBoard00.getOverLimit()*6)-scoreBoard.getTotalBall();
            rrr = Double.parseDouble(twoPoint.format(reqRun/(remainBall/6.0)));
        }




        lbTarget.setText("Target : " + scoreBoard00.getTargetRun());
        lbTotal.setText("Total : " + scoreBoard.getTotalRun() + "/" + scoreBoard.getFallenWickets());
        lbTotalOver.setText("Over : " + scoreBoard.getTotalOver());
        lbExtra.setText("Extra : " + scoreBoard.getExtraRun());
        lbCrr.setText("CRR : " + scoreBoard.getCRR());
        lbRrr.setText("RRR : " + rrr);
        lbNeedRunFromBall.setText("Need " + reqRun + " Run From " + remainBall + " Ball");



        fontChangeALLNormal();


        try {
            lbName1.setText(scoreBoard.getBatsmenListTeam1().get(0).getPlayer().getPlayerName());
            lbOutType1.setText(scoreBoard.getBatsmenListTeam1().get(0).outInfo());
            lbRun1.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(0).getRun()));
            lbBall1.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(0).getBallPlayed()));
            lbFour1.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(0).getFour()));
            lbSix1.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(0).getSix()));
            lbSR1.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(0).getStrikeRate()));
        }
        catch (RuntimeException ignored){

        }

        try {

            lbName2.setText(scoreBoard.getBatsmenListTeam1().get(1).getPlayer().getPlayerName());
            lbOutType2.setText(scoreBoard.getBatsmenListTeam1().get(1).outInfo());
            lbRun2.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(1).getRun()));
            lbBall2.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(1).getBallPlayed()));
            lbFour2.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(1).getFour()));
            lbSix2.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(1).getSix()));
            lbSR2.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(1).getStrikeRate()));

        }

        catch (RuntimeException ignored) {

        }


        try {
            lbName3.setText(scoreBoard.getBatsmenListTeam1().get(2).getPlayer().getPlayerName());
            lbOutType3.setText(scoreBoard.getBatsmenListTeam1().get(2).outInfo());
            lbRun3.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(2).getRun()));
            lbBall3.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(2).getBallPlayed()));
            lbFour3.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(2).getFour()));
            lbSix3.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(2).getSix()));
            lbSR3.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(2).getStrikeRate()));

        } catch (RuntimeException ignored) {

        }

        try {
            lbName4.setText(scoreBoard.getBatsmenListTeam1().get(3).getPlayer().getPlayerName());
            lbOutType4.setText(scoreBoard.getBatsmenListTeam1().get(3).outInfo());
            lbRun4.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(3).getRun()));
            lbBall4.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(3).getBallPlayed()));
            lbFour4.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(3).getFour()));
            lbSix4.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(3).getSix()));
            lbSR4.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(3).getStrikeRate()));

        } catch (RuntimeException ignored) {

        }

        try {
            lbName5.setText(scoreBoard.getBatsmenListTeam1().get(4).getPlayer().getPlayerName());
            lbOutType5.setText(scoreBoard.getBatsmenListTeam1().get(4).outInfo());
            lbRun5.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(4).getRun()));
            lbBall5.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(4).getBallPlayed()));
            lbFour5.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(4).getFour()));
            lbSix5.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(4).getSix()));
            lbSR5.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(4).getStrikeRate()));

        } catch (RuntimeException ignored) {

        }

        try {
            lbName6.setText(scoreBoard.getBatsmenListTeam1().get(5).getPlayer().getPlayerName());
            lbOutType6.setText(scoreBoard.getBatsmenListTeam1().get(5).outInfo());
            lbRun6.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(5).getRun()));
            lbBall6.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(5).getBallPlayed()));
            lbFour6.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(5).getFour()));
            lbSix6.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(5).getSix()));
            lbSR6.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(5).getStrikeRate()));

        } catch (RuntimeException ignored) {

        }

        try {
            lbName7.setText(scoreBoard.getBatsmenListTeam1().get(6).getPlayer().getPlayerName());
            lbOutType7.setText(scoreBoard.getBatsmenListTeam1().get(6).outInfo());
            lbRun7.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(6).getRun()));
            lbBall7.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(6).getBallPlayed()));
            lbFour7.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(6).getFour()));
            lbSix7.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(6).getSix()));
            lbSR7.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(6).getStrikeRate()));

        } catch (RuntimeException ignored) {

        }

        try {
            lbName8.setText(scoreBoard.getBatsmenListTeam1().get(7).getPlayer().getPlayerName());
            lbOutType8.setText(scoreBoard.getBatsmenListTeam1().get(7).outInfo());
            lbRun8.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(7).getRun()));
            lbBall8.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(7).getBallPlayed()));
            lbFour8.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(7).getFour()));
            lbSix8.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(7).getSix()));
            lbSR8.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(7).getStrikeRate()));

        } catch (RuntimeException ignored) {

        }

        try {
            lbName9.setText(scoreBoard.getBatsmenListTeam1().get(8).getPlayer().getPlayerName());
            lbOutType9.setText(scoreBoard.getBatsmenListTeam1().get(8).outInfo());
            lbRun9.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(8).getRun()));
            lbBall9.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(8).getBallPlayed()));
            lbFour9.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(8).getFour()));
            lbSix9.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(8).getSix()));
            lbSR9.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(8).getStrikeRate()));

        } catch (RuntimeException ignored) {

        }

        try {
            lbName10.setText(scoreBoard.getBatsmenListTeam1().get(9).getPlayer().getPlayerName());
            lbOutType10.setText(scoreBoard.getBatsmenListTeam1().get(9).outInfo());
            lbRun10.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(9).getRun()));
            lbBall10.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(9).getBallPlayed()));
            lbFour10.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(9).getFour()));
            lbSix10.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(9).getSix()));
            lbSR10.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(9).getStrikeRate()));

        } catch (RuntimeException ignored) {

        }

        try {
            lbName11.setText(scoreBoard.getBatsmenListTeam1().get(10).getPlayer().getPlayerName());
            lbOutType11.setText(scoreBoard.getBatsmenListTeam1().get(10).outInfo());
            lbRun11.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(10).getRun()));
            lbBall11.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(10).getBallPlayed()));
            lbFour11.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(10).getFour()));
            lbSix11.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(10).getSix()));
            lbSR11.setText(String.valueOf(scoreBoard.getBatsmenListTeam1().get(10).getStrikeRate()));

        } catch (RuntimeException ignored) {

        }



        // bowlers

        try {
            lbBowlersName1.setText(scoreBoard.getBowlersListTeam2().get(0).getPlayer().getPlayerName());
            lbOver1.setText(scoreBoard.getBowlersListTeam2().get(0).getOver());
            lbMaiden1.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(0).getMaidenOver()));
            lbBowlersRun1.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(0).getRun()));
            lbWickets1.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(0).getWickets()));
            lbWideBall1.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(0).getWideBall()));
            lbNoBall1.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(0).getNoBall()));
            lbEcon1.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(0).getEconomy()));

        } catch (RuntimeException ignored) {

        }

        try {
            lbBowlersName2.setText(scoreBoard.getBowlersListTeam2().get(1).getPlayer().getPlayerName());
            lbOver2.setText(scoreBoard.getBowlersListTeam2().get(1).getOver());
            lbMaiden2.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(1).getMaidenOver()));
            lbBowlersRun2.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(1).getRun()));
            lbWickets2.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(1).getWickets()));
            lbWideBall2.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(1).getWideBall()));
            lbNoBall2.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(1).getNoBall()));
            lbEcon2.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(1).getEconomy()));

        } catch (RuntimeException ignored) {

        }

        try {
            lbBowlersName3.setText(scoreBoard.getBowlersListTeam2().get(2).getPlayer().getPlayerName());
            lbOver3.setText(scoreBoard.getBowlersListTeam2().get(2).getOver());
            lbMaiden3.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(2).getMaidenOver()));
            lbBowlersRun3.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(2).getRun()));
            lbWickets3.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(2).getWickets()));
            lbWideBall3.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(2).getWideBall()));
            lbNoBall3.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(2).getNoBall()));
            lbEcon3.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(2).getEconomy()));

        } catch (RuntimeException ignored) {

        }

        try {
            lbBowlersName4.setText(scoreBoard.getBowlersListTeam2().get(3).getPlayer().getPlayerName());
            lbOver4.setText(scoreBoard.getBowlersListTeam2().get(3).getOver());
            lbMaiden4.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(3).getMaidenOver()));
            lbBowlersRun4.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(3).getRun()));
            lbWickets4.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(3).getWickets()));
            lbWideBall4.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(3).getWideBall()));
            lbNoBall4.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(3).getNoBall()));
            lbEcon4.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(3).getEconomy()));

        } catch (RuntimeException ignored) {

        }

        try {
            lbBowlersName5.setText(scoreBoard.getBowlersListTeam2().get(4).getPlayer().getPlayerName());
            lbOver5.setText(scoreBoard.getBowlersListTeam2().get(4).getOver());
            lbMaiden5.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(4).getMaidenOver()));
            lbBowlersRun5.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(4).getRun()));
            lbWickets5.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(4).getWickets()));
            lbWideBall5.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(4).getWideBall()));
            lbNoBall5.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(4).getNoBall()));
            lbEcon5.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(4).getEconomy()));

        } catch (RuntimeException ignored) {

        }

        try {
            lbBowlersName6.setText(scoreBoard.getBowlersListTeam2().get(5).getPlayer().getPlayerName());
            lbOver6.setText(scoreBoard.getBowlersListTeam2().get(5).getOver());
            lbMaiden6.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(5).getMaidenOver()));
            lbBowlersRun6.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(5).getRun()));
            lbWickets6.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(5).getWickets()));
            lbWideBall6.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(5).getWideBall()));
            lbNoBall6.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(5).getNoBall()));
            lbEcon6.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(5).getEconomy()));

        } catch (RuntimeException ignored) {

        }

        try {
            lbBowlersName7.setText(scoreBoard.getBowlersListTeam2().get(6).getPlayer().getPlayerName());
            lbOver7.setText(scoreBoard.getBowlersListTeam2().get(6).getOver());
            lbMaiden7.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(6).getMaidenOver()));
            lbBowlersRun7.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(6).getRun()));
            lbWickets7.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(6).getWickets()));
            lbWideBall7.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(6).getWideBall()));
            lbNoBall7.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(6).getNoBall()));
            lbEcon7.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(6).getEconomy()));

        } catch (RuntimeException ignored) {

        }

        try {
            lbBowlersName8.setText(scoreBoard.getBowlersListTeam2().get(7).getPlayer().getPlayerName());
            lbOver8.setText(scoreBoard.getBowlersListTeam2().get(7).getOver());
            lbMaiden8.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(7).getMaidenOver()));
            lbBowlersRun8.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(7).getRun()));
            lbWickets8.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(7).getWickets()));
            lbWideBall8.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(7).getWideBall()));
            lbNoBall8.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(7).getNoBall()));
            lbEcon8.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(7).getEconomy()));

        } catch (RuntimeException ignored) {

        }

        try {
            lbBowlersName9.setText(scoreBoard.getBowlersListTeam2().get(8).getPlayer().getPlayerName());
            lbOver9.setText(scoreBoard.getBowlersListTeam2().get(8).getOver());
            lbMaiden9.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(8).getMaidenOver()));
            lbBowlersRun9.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(8).getRun()));
            lbWickets9.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(8).getWickets()));
            lbWideBall9.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(8).getWideBall()));
            lbNoBall9.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(8).getNoBall()));
            lbEcon9.setText(String.valueOf(scoreBoard.getBowlersListTeam2().get(8).getEconomy()));

        } catch (RuntimeException ignored) {

        }




        indicateBatsmanLabel(searchStriker());
        fontChangeBatsmanLabel(searchStriker());
        fontChangeBatsmanLabel(searchNonStriker());
        fontChangeBowlersLabel(searchCurrentBowlers());







        if (((Double.parseDouble(scoreBoard.getTotalOver())==scoreBoard00.getOverLimit()) || (scoreBoard.getTotalRun()>=scoreBoard00.getTargetRun())) && bowlerChanged == false) {

            if (scoreBoard.getTotalRun()>=scoreBoard00.getTargetRun())
                matchEnd();


            else {

                ButtonType matchEnd = new ButtonType("End the match");
                ButtonType runOut = new ButtonType("Run Out Info");

                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Checking");
                alert.setHeaderText("Are you want to end the match }- or -{ update the out info (Run-Out)");
                alert.setContentText("Select an option.....");
                alert.getButtonTypes().setAll(matchEnd,runOut);


                if (alert.showAndWait().get() == matchEnd) {
                    matchEnd();
                }

                else {

                    buttonDisable(true);
                    cbSelectOutBatsman.setDisable(false);
                    btOut.setDisable(false);

                    String[] outType = {"Run Out"};
                    cbOutType.getItems().setAll(outType);
                    cbOutType.getSelectionModel().selectFirst();

                }


            }

        }



    }       // End of Score Update





    public void matchEnd() {


        ButtonType button = new ButtonType("Save Match-data & go to Homepage");
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Match END");

        String matchStatus;

        if (scoreBoard.getTotalRun()>=scoreBoard00.getTargetRun()) {
            matchStatus = scoreBoard.getTeams()[0].getName() + " win by " + (10-scoreBoard.getFallenWickets()) + " wickets";
        }

        else if (scoreBoard.getTotalRun()==scoreBoard00.getTotalRun()) {
            matchStatus = "Match Draw";
        }

        else {
            matchStatus = scoreBoard.getTeams()[1].getName() + " win by " + (scoreBoard00.getTotalRun()-scoreBoard.getTotalRun()) + " runs";
        }

        alert.setHeaderText(matchStatus);


        Calendar calendar = new GregorianCalendar();
        String date = calendar.get(Calendar.DATE) + "_" + calendar.get(Calendar.MONTH) + "_" + calendar.get(Calendar.YEAR);


        String team1Name = Team1.getText();
        String team2Name = Team2.getText();

        String setDatabaseName = team1Name + "vs" + team2Name + "_" + date;

        String sql1 = "INSERT INTO BATSMAN2 (batsman_name, out_type, batsman_run, ball_played, four_run, six_run, strike_rate) " +
                "values(?,?,?,?,?,?,?), " +
                "(?,?,?,?,?,?,?), " +
                "(?,?,?,?,?,?,?), " +
                "(?,?,?,?,?,?,?), " +
                "(?,?,?,?,?,?,?), " +
                "(?,?,?,?,?,?,?), " +
                "(?,?,?,?,?,?,?), " +
                "(?,?,?,?,?,?,?), " +
                "(?,?,?,?,?,?,?), " +
                "(?,?,?,?,?,?,?), " +
                "(?,?,?,?,?,?,?);";

        String sql2 = "INSERT INTO BOWLER2 (bowler_name, bowler_over, maiden_over, run_given, wicket_taken, wide_ball, no_ball, economy) " +
                "values(?,?,?,?,?,?,?,?), " +
                "(?,?,?,?,?,?,?,?), " +
                "(?,?,?,?,?,?,?,?), " +
                "(?,?,?,?,?,?,?,?), " +
                "(?,?,?,?,?,?,?,?), " +
                "(?,?,?,?,?,?,?,?), " +
                "(?,?,?,?,?,?,?,?), " +
                "(?,?,?,?,?,?,?,?), " +
                "(?,?,?,?,?,?,?,?); ";


        String sql3 = "INSERT INTO matchinfo2 (match_info2) values(?);";

        String sql4 = "INSERT INTO match_status (match_status) values(?);";

        String matchInfo = lbTotal.getText() + "      " + lbExtra.getText() + "     " + lbTotalOver.getText();

        try {


            //getting database connection to insert the datas in the database
            Connection insertIntoDatabase = new DatabaseConnection(setDatabaseName, "root","").getConnection();

            PreparedStatement statement1 = insertIntoDatabase.prepareStatement(sql1);
            PreparedStatement statement2 = insertIntoDatabase.prepareStatement(sql2);
            PreparedStatement statement3 = insertIntoDatabase.prepareStatement(sql3);
            PreparedStatement statement4 = insertIntoDatabase.prepareStatement(sql4);


            //batsman1 data inserting
            statement1.setString(1,lbName1.getText());
            statement1.setString(2,lbOutType1.getText());
            statement1.setString(3,lbRun1.getText());
            statement1.setString(4,lbBall1.getText());
            statement1.setString(5,lbFour1.getText());
            statement1.setString(6,lbSix1.getText());
            statement1.setString(7,lbSR1.getText());

            //batsman2 data inserting
            statement1.setString(8,lbName2.getText());
            statement1.setString(9,lbOutType2.getText());
            statement1.setString(10,lbRun2.getText());
            statement1.setString(11,lbBall2.getText());
            statement1.setString(12,lbFour2.getText());
            statement1.setString(13,lbSix2.getText());
            statement1.setString(14,lbSR2.getText());

            //batsman3 data inserting
            statement1.setString(15,lbName3.getText());
            statement1.setString(16,lbOutType3.getText());
            statement1.setString(17,lbRun3.getText());
            statement1.setString(18,lbBall3.getText());
            statement1.setString(19,lbFour3.getText());
            statement1.setString(20,lbSix3.getText());
            statement1.setString(21,lbSR3.getText());

            //batsman4 data inserting
            statement1.setString(22,lbName4.getText());
            statement1.setString(23,lbOutType4.getText());
            statement1.setString(24,lbRun4.getText());
            statement1.setString(25,lbBall4.getText());
            statement1.setString(26,lbFour4.getText());
            statement1.setString(27,lbSix4.getText());
            statement1.setString(28,lbSR4.getText());

            //batsman5 data inserting
            statement1.setString(29,lbName5.getText());
            statement1.setString(30,lbOutType5.getText());
            statement1.setString(31,lbRun5.getText());
            statement1.setString(32,lbBall5.getText());
            statement1.setString(33,lbFour5.getText());
            statement1.setString(34,lbSix5.getText());
            statement1.setString(35,lbSR5.getText());

            //batsman6 data inserting
            statement1.setString(36,lbName6.getText());
            statement1.setString(37,lbOutType6.getText());
            statement1.setString(38,lbRun6.getText());
            statement1.setString(39,lbBall6.getText());
            statement1.setString(40,lbFour6.getText());
            statement1.setString(41,lbSix6.getText());
            statement1.setString(42,lbSR6.getText());

            //batsman7 data inserting
            statement1.setString(43,lbName7.getText());
            statement1.setString(44,lbOutType7.getText());
            statement1.setString(45,lbRun7.getText());
            statement1.setString(46,lbBall7.getText());
            statement1.setString(47,lbFour7.getText());
            statement1.setString(48,lbSix7.getText());
            statement1.setString(49,lbSR7.getText());

            //batsman8 data inserting
            statement1.setString(50,lbName8.getText());
            statement1.setString(51,lbOutType8.getText());
            statement1.setString(52,lbRun8.getText());
            statement1.setString(53,lbBall8.getText());
            statement1.setString(54,lbFour8.getText());
            statement1.setString(55,lbSix8.getText());
            statement1.setString(56,lbSR8.getText());

            //batsman9 data inserting
            statement1.setString(57,lbName9.getText());
            statement1.setString(58,lbOutType9.getText());
            statement1.setString(59,lbRun9.getText());
            statement1.setString(60,lbBall9.getText());
            statement1.setString(61,lbFour9.getText());
            statement1.setString(62,lbSix9.getText());
            statement1.setString(63,lbSR9.getText());

            //batsman10 data inserting
            statement1.setString(64,lbName10.getText());
            statement1.setString(65,lbOutType10.getText());
            statement1.setString(66,lbRun10.getText());
            statement1.setString(67,lbBall10.getText());
            statement1.setString(68,lbFour10.getText());
            statement1.setString(69,lbSix10.getText());
            statement1.setString(70,lbSR10.getText());

            //batsman11 data inserting
            statement1.setString(71,lbName11.getText());
            statement1.setString(72,lbOutType11.getText());
            statement1.setString(73,lbRun11.getText());
            statement1.setString(74,lbBall11.getText());
            statement1.setString(75,lbFour11.getText());
            statement1.setString(76,lbSix11.getText());
            statement1.setString(77,lbSR11.getText());

            statement1.executeUpdate();

            //=============================================================================//

            //bowler1 data inserting
            statement2.setString(1,lbBowlersName1.getText());
            statement2.setString(2,lbOver1.getText());
            statement2.setString(3,lbMaiden1.getText());
            statement2.setString(4,lbBowlersRun1.getText());
            statement2.setString(5,lbWickets1.getText());
            statement2.setString(6,lbWideBall1.getText());
            statement2.setString(7,lbNoBall1.getText());
            statement2.setString(8,lbEcon1.getText());

            //bowler2 data inserting
            statement2.setString(9,lbBowlersName2.getText());
            statement2.setString(10,lbOver2.getText());
            statement2.setString(11,lbMaiden2.getText());
            statement2.setString(12,lbBowlersRun2.getText());
            statement2.setString(13,lbWickets2.getText());
            statement2.setString(14,lbWideBall2.getText());
            statement2.setString(15,lbNoBall2.getText());
            statement2.setString(16,lbEcon2.getText());

            //bowler3 data inserting
            statement2.setString(17,lbBowlersName3.getText());
            statement2.setString(18,lbOver3.getText());
            statement2.setString(19,lbMaiden3.getText());
            statement2.setString(20,lbBowlersRun3.getText());
            statement2.setString(21,lbWickets3.getText());
            statement2.setString(22,lbWideBall3.getText());
            statement2.setString(23,lbNoBall3.getText());
            statement2.setString(24,lbEcon3.getText());

            //bowler4 data inserting
            statement2.setString(25,lbBowlersName4.getText());
            statement2.setString(26,lbOver4.getText());
            statement2.setString(27,lbMaiden4.getText());
            statement2.setString(28,lbBowlersRun4.getText());
            statement2.setString(29,lbWickets4.getText());
            statement2.setString(30,lbWideBall4.getText());
            statement2.setString(31,lbNoBall4.getText());
            statement2.setString(32,lbEcon4.getText());

            //bowler5 data inserting
            statement2.setString(33,lbBowlersName5.getText());
            statement2.setString(34,lbOver5.getText());
            statement2.setString(35,lbMaiden5.getText());
            statement2.setString(36,lbBowlersRun5.getText());
            statement2.setString(37,lbWickets5.getText());
            statement2.setString(38,lbWideBall5.getText());
            statement2.setString(39,lbNoBall5.getText());
            statement2.setString(40,lbEcon5.getText());

            //bowler6 data inserting
            statement2.setString(41,lbBowlersName6.getText());
            statement2.setString(42,lbOver6.getText());
            statement2.setString(43,lbMaiden6.getText());
            statement2.setString(44,lbBowlersRun6.getText());
            statement2.setString(45,lbWickets6.getText());
            statement2.setString(46,lbWideBall6.getText());
            statement2.setString(47,lbNoBall6.getText());
            statement2.setString(48,lbEcon6.getText());

            //bowler7 data inserting
            statement2.setString(49,lbBowlersName7.getText());
            statement2.setString(50,lbOver7.getText());
            statement2.setString(51,lbMaiden7.getText());
            statement2.setString(52,lbBowlersRun7.getText());
            statement2.setString(53,lbWickets7.getText());
            statement2.setString(54,lbWideBall7.getText());
            statement2.setString(55,lbNoBall7.getText());
            statement2.setString(56,lbEcon7.getText());

            //bowler8 data inserting
            statement2.setString(57,lbBowlersName8.getText());
            statement2.setString(58,lbOver8.getText());
            statement2.setString(59,lbMaiden8.getText());
            statement2.setString(60,lbBowlersRun8.getText());
            statement2.setString(61,lbWickets8.getText());
            statement2.setString(62,lbWideBall8.getText());
            statement2.setString(63,lbNoBall8.getText());
            statement2.setString(64,lbEcon8.getText());

            //bowler9 data inserting
            statement2.setString(65,lbBowlersName9.getText());
            statement2.setString(66,lbOver9.getText());
            statement2.setString(67,lbMaiden9.getText());
            statement2.setString(68,lbBowlersRun9.getText());
            statement2.setString(69,lbWickets9.getText());
            statement2.setString(70,lbWideBall9.getText());
            statement2.setString(71,lbNoBall9.getText());
            statement2.setString(72,lbEcon9.getText());


            statement2.executeUpdate();


            //======================================================================//

            //inserting overall 2nd innings info in the batsman1 table in "match_info" column in the database
            statement3.setString(1,matchInfo);
            statement3.executeUpdate();

            statement4.setString(1,matchStatus);
            statement4.executeUpdate();

            insertIntoDatabase.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

        alert.setContentText("Interface will return to the Homepage");
        alert.getButtonTypes().setAll(button);

        while (true) {

            try {

                if (alert.showAndWait().get().getText().equals("Save Match-data & go to Homepage")) {

                    FXMLLoader loader = new FXMLLoader(getClass().getResource("HomePage.fxml"));

                    try {
                        root = loader.load();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    stage = this.getStage();
                    stage.setScene(new Scene(root));
                    stage.show();
                    stage.setX(600);
                    stage.setY(100);
                    break;

                }


            }
            catch (RuntimeException ignored) {

            }
        }
    }


}
