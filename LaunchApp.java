import FXML_FIle.LoadingPageControl;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LaunchApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException, InterruptedException {


        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML_FIle/LoadingPage.fxml"));
        Parent root = loader.load();

        LoadingPageControl loadingPageControl = loader.getController();
        loadingPageControl.setStage(primaryStage);


        //Image icon = new Image("file:/F:/IntelliJ/Java/ScoreBoard Project/Final Logo.png");
        Image icon = new Image(getClass().getResourceAsStream("/Final Logo.png"));
        createFile();

        primaryStage.getIcons().add(icon);
        primaryStage.setTitle("Cricket Live Scoreboard");

        primaryStage.setScene(new Scene(root));
        primaryStage.setX(600);
        primaryStage.setY(100);
        primaryStage.show();


        primaryStage.setOnCloseRequest(e -> {
            e.consume();
            logOut(primaryStage);
        });


    }

    public void logOut(Stage stage) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Log Out");
        alert.setHeaderText("You are about to EXIT");
        alert.setContentText("Are you sure??");


        if (alert.showAndWait().get() == ButtonType.OK) {
            stage.close();
        }

    }



    public void createFile() throws IOException {


        File teamFile = new File("/ScoreBoard/data/AllTeamName.txt");
        File playerFile = new File("/ScoreBoard/data/AllPlayerName.txt");

        if (!teamFile.exists()) {

            //System.out.println("Team Don't Exists");

            Path path = Paths.get("/ScoreBoard/data/");
            Files.createDirectories(path);


            PrintWriter output1 = new PrintWriter(teamFile);

            for (String names : getTeamList()) {
                output1.println(names);
            }

            output1.close();

        }



        if (!playerFile.exists()) {

            //System.out.println("Player Don't Exists");

            Path path = Paths.get("/ScoreBoard/data/");
            Files.createDirectories(path);

            PrintWriter output2 = new PrintWriter(playerFile);

            for (String names : getPlayerList()) {
                output2.println(names);
            }

            output2.close();

        }


        //File databaseFile = new File("/ScoreBoard/data/AllTeamName.txt");




    }














    public ArrayList<String> getTeamList() throws IOException {

        ArrayList<String> list = new ArrayList<String>();

        //InputStream in = new FileInputStream("AllTeamName.txt");
        InputStream in = getClass().getResourceAsStream("/AllTeamName.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));


        String line;

        while ((line=reader.readLine())!=null) {
            list.add(line);
        }

        in.close();
        reader.close();


        return list;

    }

    public ArrayList<String> getPlayerList() throws IOException {

        ArrayList<String> list = new ArrayList<String>();

        //InputStream in = new FileInputStream("AllPlayerName.txt");
        InputStream in = getClass().getResourceAsStream("/AllPlayerName.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));


        String line;

        while ((line=reader.readLine())!=null) {
            list.add(line);
        }

        in.close();
        reader.close();


        return list;


    }





}
