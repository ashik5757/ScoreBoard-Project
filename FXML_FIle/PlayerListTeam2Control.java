package FXML_FIle;

import ClassFile.Player;
import ClassFile.Team;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.controlsfx.control.textfield.AutoCompletionBinding;
import org.controlsfx.control.textfield.TextFields;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;
import java.util.Scanner;

public class PlayerListTeam2Control implements Initializable {

    @FXML
    private TextField tfTeamName;

    @FXML
    private TextField tfPlayerName1;

    @FXML
    private TextField tfPlayerName2;

    @FXML
    private TextField tfPlayerName3;

    @FXML
    private TextField tfPlayerName4;

    @FXML
    private TextField tfPlayerName5;

    @FXML
    private TextField tfPlayerName6;

    @FXML
    private TextField tfPlayerName7;

    @FXML
    private TextField tfPlayerName8;

    @FXML
    private TextField tfPlayerName9;

    @FXML
    private TextField tfPlayerName10;

    @FXML
    private TextField tfPlayerName11;

    @FXML
    private Button btSubmit;

    @FXML
    private Button btHomePage;

    private Team team1;
    private int overLimit;

    private Stage stage;
    private Parent root;


    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public int getOverLimit() {
        return overLimit;
    }

    public void setOverLimit(int overLimit) {
        this.overLimit = overLimit;
    }

    @FXML
    void submit(ActionEvent event) throws IOException {

        if (tfTeamName.getText().isBlank() ||
                tfPlayerName1.getText().isBlank() ||
                tfPlayerName2.getText().isBlank() ||
                tfPlayerName3.getText().isBlank() ||
                tfPlayerName4.getText().isBlank() ||
                tfPlayerName5.getText().isBlank() ||
                tfPlayerName6.getText().isBlank() ||
                tfPlayerName7.getText().isBlank() ||
                tfPlayerName8.getText().isBlank() ||
                tfPlayerName9.getText().isBlank() ||
                tfPlayerName10.getText().isBlank()||
                tfPlayerName11.getText().isBlank()
        ) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText("You didn't input all names");
            alert.setContentText("Please input all names");
            alert.show();
        }


        else if (isSameName()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText("Similar name found");
            alert.setContentText("Please use Different names");
            alert.show();
        }



        else {

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Checking");
            alert.setHeaderText("You will not be able to change the names");
            alert.setContentText("Are you sure?");

            if (alert.showAndWait().get() == ButtonType.OK) {

                Team team2 = new Team();
                team2.setName(tfTeamName.getText());

                team2.addPlayer(new Player(tfPlayerName1.getText(),team2));
                team2.addPlayer(new Player(tfPlayerName2.getText(),team2));
                team2.addPlayer(new Player(tfPlayerName3.getText(),team2));
                team2.addPlayer(new Player(tfPlayerName4.getText(),team2));
                team2.addPlayer(new Player(tfPlayerName5.getText(),team2));
                team2.addPlayer(new Player(tfPlayerName6.getText(),team2));
                team2.addPlayer(new Player(tfPlayerName7.getText(),team2));
                team2.addPlayer(new Player(tfPlayerName8.getText(),team2));
                team2.addPlayer(new Player(tfPlayerName9.getText(),team2));
                team2.addPlayer(new Player(tfPlayerName10.getText(),team2));
                team2.addPlayer(new Player(tfPlayerName11.getText(),team2));




                if (!hasWordTeam(tfTeamName.getText()))
                    addNewTeamName(tfTeamName.getText());
                if (!hasWord(tfPlayerName1.getText()))
                    addNewName(tfPlayerName1.getText());
                if (!hasWord(tfPlayerName2.getText()))
                    addNewName(tfPlayerName2.getText());
                if (!hasWord(tfPlayerName3.getText()))
                    addNewName(tfPlayerName3.getText());
                if (!hasWord(tfPlayerName4.getText()))
                    addNewName(tfPlayerName4.getText());
                if (!hasWord(tfPlayerName5.getText()))
                    addNewName(tfPlayerName5.getText());
                if (!hasWord(tfPlayerName6.getText()))
                    addNewName(tfPlayerName6.getText());
                if (!hasWord(tfPlayerName7.getText()))
                    addNewName(tfPlayerName7.getText());
                if (!hasWord(tfPlayerName8.getText()))
                    addNewName(tfPlayerName8.getText());
                if (!hasWord(tfPlayerName9.getText()))
                    addNewName(tfPlayerName9.getText());
                if (!hasWord(tfPlayerName10.getText()))
                    addNewName(tfPlayerName10.getText());
                if (!hasWord(tfPlayerName11.getText()))
                    addNewName(tfPlayerName11.getText());









                FXMLLoader loader = new FXMLLoader(getClass().getResource("SetBatsman.fxml"));
                root = loader.load();

                SetBatsmanControl setBatsmanControl = loader.getController();
                setBatsmanControl.setTeam1(this.team1);
                setBatsmanControl.setTeam2(team2);
                setBatsmanControl.setOverLimit(this.overLimit);
                setBatsmanControl.setCbTeamSelect();

                stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                stage.setScene(new Scene(root));
                stage.show();
                stage.setX(530);
                stage.setY(200);

            }

        }

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






    public boolean isSameName() {

        boolean found = false;

        ArrayList<String> playerName = new ArrayList<>();
        playerName.add(tfPlayerName1.getText());
        playerName.add(tfPlayerName2.getText());
        playerName.add(tfPlayerName3.getText());
        playerName.add(tfPlayerName4.getText());
        playerName.add(tfPlayerName5.getText());
        playerName.add(tfPlayerName6.getText());
        playerName.add(tfPlayerName7.getText());
        playerName.add(tfPlayerName8.getText());
        playerName.add(tfPlayerName9.getText());
        playerName.add(tfPlayerName10.getText());
        playerName.add(tfPlayerName11.getText());


        for (String name : playerName) {

            if (Collections.frequency(playerName,name) > 1) {
                found = true;
                break;
            }

        }

        if (found)
            return true;
        else
            return false;

    }








    public boolean hasWord(String name) throws FileNotFoundException {

        File file = new File("/ScoreBoard/data/AllPlayerName.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()){
            if (scanner.next().equals(name)) {
                return true;
            }
        }

        return false;
    }

    public boolean hasWordTeam(String name) throws FileNotFoundException {

        File file = new File("/ScoreBoard/data/AllTeamName.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()){
            if (scanner.nextLine().equals(name)) {
                return true;
            }
        }

        return false;
    }


    public void addNewName(String name) throws IOException {

        FileWriter file = new FileWriter("/ScoreBoard/data/AllPlayerName.txt",true);
        BufferedWriter buffer = new BufferedWriter(file);
        PrintWriter output = new PrintWriter(buffer);

        output.println(name);

        output.flush();

        file.close();
        buffer.close();
        output.close();

    }

    public void addNewTeamName(String name) throws IOException {

        FileWriter file = new FileWriter("/ScoreBoard/data/AllTeamName.txt",true);
        BufferedWriter buffer = new BufferedWriter(file);
        PrintWriter output = new PrintWriter(buffer);

        output.println(name);

        output.flush();

        file.close();
        buffer.close();
        output.close();

    }


    public ArrayList<String> getAllPlayerName() throws FileNotFoundException {

        ArrayList<String> list = new ArrayList<String>();

        File file = new File("/ScoreBoard/data/AllPlayerName.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()){
            list.add(scanner.next());
        }

        return list;
    }

    public ArrayList<String> getAllTeamName() throws FileNotFoundException {

        ArrayList<String> list = new ArrayList<String>();

        File file = new File("/ScoreBoard/data/AllTeamName.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()){
            list.add(scanner.nextLine());
        }

        return list;
    }


    public void popUpStyle(TextField textField,ArrayList<String> list) throws FileNotFoundException {

        AutoCompletionBinding<String> autoComplete = TextFields.bindAutoCompletion(textField,list);
        autoComplete.setPrefWidth(textField.getPrefWidth());
        autoComplete.getAutoCompletionPopup().setStyle(
                        "-fx-font-family :  Candara;" +
                        "-fx-font-style :  italic;" +
                        "-fx-font-weight : BOLD;" +
                        "-fx-font-size : 23"
        );

    }










    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        try {
            popUpStyle(tfTeamName,getAllTeamName());
            popUpStyle(tfPlayerName1,getAllPlayerName());
            popUpStyle(tfPlayerName2,getAllPlayerName());
            popUpStyle(tfPlayerName3,getAllPlayerName());
            popUpStyle(tfPlayerName4,getAllPlayerName());
            popUpStyle(tfPlayerName5,getAllPlayerName());
            popUpStyle(tfPlayerName6,getAllPlayerName());
            popUpStyle(tfPlayerName7,getAllPlayerName());
            popUpStyle(tfPlayerName8,getAllPlayerName());
            popUpStyle(tfPlayerName9,getAllPlayerName());
            popUpStyle(tfPlayerName10,getAllPlayerName());
            popUpStyle(tfPlayerName11,getAllPlayerName());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }




    }
}
