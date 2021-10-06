package FXML_FIle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoadingPageControl implements Initializable {

    @FXML
    private ProgressBar proggressbar;

    @FXML
    private Label lbLogo;

    @FXML
    private AnchorPane rootPane;

    private Stage stage;
    private Parent root;




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        new HomePage().start();

    }


    class HomePage extends Thread {
        @Override
        public void run() {

            try {
                Thread.sleep(3000);

                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        Parent root = null;
                        try {
                            root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        stage.setScene(new Scene(root));
                        stage.show();


                    }
                });


            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }


    public void setStage(Stage stage) {
        this.stage = stage;
    }
}
