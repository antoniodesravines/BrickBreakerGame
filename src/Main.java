
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.bryant.brickbreakergui.*;

import java.io.File;
import java.util.Scanner;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws java.io.IOException {


        String configFilename = "C:\\Users\\adesr\\IdeaProjects\\Mp1Driver\\brickbreaker.txt";
        String profileFilename = "C:\\Users\\adesr\\IdeaProjects\\Mp1Driver\\brickbreakerprofiles.txt";

        ProfilePane pfPane = new ProfilePane(profileFilename, configFilename);

        Scene scene = new Scene(pfPane, 400, 200);

        primaryStage.setTitle("Brick Breaker");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }



}