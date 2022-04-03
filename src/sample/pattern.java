package sample;
import com.sun.deploy.xml.XMLable;
import javafx.application.Application;
import javafx.scene.control.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
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
import org.w3c.dom.ls.LSOutput;
public class pattern extends Application{
    public void start(Stage primaryStage){
        Image image = new Image("background.jpg");
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(500);
        imageView.setFitWidth(500);
        Font font = new Font("Courier New", 15);
        Pane pane = new Pane();
        Button two = new Button("Two");
        two.setLayoutX(130);
        two.setLayoutY(250);
        two.setFont(font);
        two.setOnAction(event -> {
            ioio.player = 2;
            try {
                new basepane().start(new Stage());
                primaryStage.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        Button three = new Button("Three");
        three.setLayoutX(300);
        three.setLayoutY(250);
        three.setFont(font);
        three.setOnAction(event -> {
            ioio.player = 3;
            try {
                new basepane().start(new Stage());
                primaryStage.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        Button four = new Button("Four");
        four.setLayoutX(420);
        four.setLayoutY(250);
        four.setFont(font);
        four.setOnAction(event -> {
            ioio.player = 4;
            try {
                new basepane().start(new Stage());
                primaryStage.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        pane.getChildren().addAll(imageView, two, three, four);
        Scene scene = new Scene(pane, 500,500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Choose pattern");
        primaryStage.show();
    }
}
