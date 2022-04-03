package sample;
import com.sun.deploy.xml.XMLable;
import javafx.application.Application;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.layout.Pane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.*;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.util.Duration;

import java.io.File;
import java.nio.file.attribute.PosixFileAttributes;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
public class FilePane extends Application{
    public  void start(Stage primaryStage) throws Exception{
        Pane filePane = new Pane();
        Image FilePicture = new Image("FilePicture.jpg");
        ImageView FIV = new ImageView(FilePicture);
        FIV.setFitHeight(339);
        FIV.setFitWidth(600);
        Button button1 = new Button("File 1");
        button1.setFont(Font.font("Courier New", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 13));
        button1.setTextFill(Color.rgb(102,198, 218));
        button1.setLayoutX(105);
        button1.setLayoutY(170);
        button1.setOnAction(event -> {
            ioio.i = 1;
            try {
                new basepane().start(new Stage());
                primaryStage.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        Button button2 = new Button("File 2");
        button2.setFont(Font.font("Courier New", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 13));
        button2.setTextFill(Color.rgb(102,198, 218));
        button2.setLayoutX(168);
        button2.setLayoutY(218);
        button2.setOnAction(event -> {
            ioio.i = 2;
            try {
                new basepane().start(new Stage());
                primaryStage.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        Button button3 = new Button("File 3");
        button3.setFont(Font.font("Courier New", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 13));
        button3.setTextFill(Color.rgb(102,198, 218));
        button3.setLayoutX(248);
        button3.setLayoutY(262);
        button3.setOnAction(event -> {
            ioio.i = 3;
            try {
                new basepane().start(new Stage());
                primaryStage.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        Button button4 = new Button("File 4");
        button4.setFont(Font.font("Courier New", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 13));
        button4.setTextFill(Color.rgb(102,198, 218));
        button4.setLayoutX(322);
        button4.setLayoutY(207);
        button4.setOnAction(event -> {
            ioio.i = 4;
            try {
                new basepane().start(new Stage());
                primaryStage.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        Button button5 = new Button("File 5");
        button5.setFont(Font.font("Courier New", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 13));
        button5.setTextFill(Color.rgb(102,198, 218));
        button5.setLayoutX(384);
        button5.setLayoutY(147);
        button5.setOnAction(event -> {
            ioio.i = 5;
            try {
                new basepane().start(new Stage());
                primaryStage.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        Button button6 = new Button("File 6");
        button6.setFont(Font.font("Courier New", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 13));
        button6.setTextFill(Color.rgb(102,198, 218));
        button6.setLayoutX(453);
        button6.setLayoutY(78);
        button6.setOnAction(event -> {
            ioio.i = 6;
            try {
                new basepane().start(new Stage());
                primaryStage.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        Button button7 = new Button("File 7");
        button7.setFont(Font.font("Courier New", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 13));
        button7.setTextFill(Color.rgb(102,198, 218));
        button7.setLayoutX(497);
        button7.setLayoutY(14);
        button7.setOnAction(event -> {
            ioio.i = 7;
            try {
                new basepane().start(new Stage());
                primaryStage.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        filePane.getChildren().addAll(FIV, button1, button2, button3, button4, button5, button6, button7);
        Scene scene = new Scene(filePane, 600, 339);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Choose one file to enter");
        primaryStage.show();

    }
}
