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
public class battleRY extends Application{
    static int cnt = 0;
    public void start(Stage primaryStage){
        Pane pane = new Pane();
        Font font = new Font("Courier New", 15);
        Image battle = new Image("battleRpkY.jpg");
        ImageView baIV = new ImageView(battle);
        baIV.setFitWidth(600);
        baIV.setFitHeight(400);
        Button btDice = new Button("Dice");
        Image Dice = new Image("dice.png");
        ImageView DiceIV = new ImageView(Dice);
        DiceIV.setFitWidth(20);
        DiceIV.setFitHeight(20);
        btDice.setFont(font);
        btDice.setGraphic(DiceIV);
        btDice.setLayoutX(260);
        btDice.setLayoutY(160);
        Image one = new Image("one.png");
        ImageView oneIV = new ImageView(one);
        Image two = new Image("two.png");
        ImageView twoIV = new ImageView(two);
        Image three = new Image("three.png");
        ImageView threeIV = new ImageView(three );
        Image four = new Image("four.png");
        ImageView fourIV = new ImageView(four);
        Image five = new Image("five.png");
        ImageView fiveIV = new ImageView(five);
        Image six = new Image("six.png");
        ImageView sixIV = new ImageView(six);
        ImageView oneIV1 = new ImageView(one);
        ImageView twoIV1 = new ImageView(two);
        ImageView threeIV1 = new ImageView(three );
        ImageView fourIV1 = new ImageView(four);
        ImageView fiveIV1 = new ImageView(five);
        ImageView sixIV1 = new ImageView(six);
        ArrayList<Integer> array  = new ArrayList<>();
        btDice.setOnAction(event -> {
            if(cnt < 2) {
                cnt ++;
                if (cnt % 2 == 1) {
                    array.add(dice.dice2());
                    if (dice.dice2() == 1) {
                        oneIV.setVisible(true);
                        oneIV.setFitHeight(150);
                        oneIV.setFitWidth(200);
                        oneIV.setLayoutX(68);
                        oneIV.setLayoutY(211);
                    }
                    ;
                    if (dice.dice2() == 2) {
                        twoIV.setVisible(true);
                        twoIV.setFitHeight(150);
                        twoIV.setFitWidth(200);
                        twoIV.setLayoutX(68);
                        twoIV.setLayoutY(211);
                    }
                    ;
                    if (dice.dice2() == 3) {
                        threeIV.setVisible(true);
                        threeIV.setFitHeight(150);
                        threeIV.setFitWidth(200);
                        threeIV.setLayoutX(68);
                        threeIV.setLayoutY(211);
                    }
                    ;
                    if (dice.dice2() == 4) {
                        fourIV.setVisible(true);
                        fourIV.setFitHeight(150);
                        fourIV.setFitWidth(200);
                        fourIV.setLayoutX(68);
                        fourIV.setLayoutY(211);
                    }
                    ;
                    if (dice.dice2() == 5) {
                        fiveIV.setVisible(true);
                        fiveIV.setFitHeight(150);
                        fiveIV.setFitWidth(200);
                        fiveIV.setLayoutX(68);
                        fiveIV.setLayoutY(211);
                    }
                    ;
                    if (dice.dice2() == 6) {
                        sixIV.setVisible(true);
                        sixIV.setFitHeight(150);
                        sixIV.setFitWidth(200);
                        sixIV.setLayoutX(68);
                        sixIV.setLayoutY(211);
                    }
                    ;
                }
                if (cnt % 2 == 0) {
                    array.add(dice.dice2());
                    if (array.get(1) == 1) {
                        oneIV1.setVisible(true);

                        oneIV1.setFitHeight(150);
                        oneIV1.setFitWidth(200);
                        oneIV1.setLayoutX(379);
                        oneIV1.setLayoutY(211);
                    } else if (array.get(1) == 2) {
                        twoIV1.setVisible(true);

                        twoIV1.setFitHeight(150);
                        twoIV1.setFitWidth(200);
                        twoIV1.setLayoutX(379);
                        twoIV1.setLayoutY(211);
                    } else if (array.get(1) == 3) {
                        threeIV1.setVisible(true);

                        threeIV1.setFitHeight(150);
                        threeIV1.setFitWidth(200);
                        threeIV1.setLayoutX(379);
                        threeIV1.setLayoutY(211);
                    } else if (array.get(1) == 4) {
                        fourIV1.setVisible(true);

                        fourIV1.setFitHeight(150);
                        fourIV1.setFitWidth(200);
                        fourIV1.setLayoutX(379);
                        fourIV1.setLayoutY(211);
                    } else if (array.get(1) == 5) {
                        fiveIV1.setVisible(true);

                        fiveIV1.setFitHeight(150);
                        fiveIV1.setFitWidth(200);
                        fiveIV1.setLayoutX(379);
                        fiveIV1.setLayoutY(211);
                    } else if (array.get(1) == 6) {
                        sixIV1.setVisible(true);

                        sixIV1.setFitHeight(150);
                        sixIV1.setFitWidth(200);
                        sixIV1.setLayoutX(379);
                        sixIV1.setLayoutY(211);
                    }

                }
                if (array.get(0) > array.get(1)) {
                    Yellow.YellowPieceIV1.setLayoutX(425);
                    Yellow.YellowPieceIV1.setLayoutY(73);
                    Yellow.YellowPiece1L = -2;


                }
                if (array.get(0) < array.get(1)) {
                    Red.RedPieceIV1.setLayoutX(75);
                    Red.RedPieceIV1.setLayoutY(74);
                    Red.RedPiece1L = -2;


                }
            }else {
                primaryStage.close();
            }

        });
        if(array.size() >= 2){
            array.clear();
        }
        pane.getChildren().addAll(baIV, btDice,oneIV, twoIV, threeIV, fourIV, fiveIV, sixIV,oneIV1, twoIV1, threeIV1, fourIV1, fiveIV1, sixIV1);
        oneIV.setVisible(false);
        twoIV.setVisible(false);
        threeIV.setVisible(false);
        fourIV.setVisible(false);
        fiveIV.setVisible(false);
        sixIV.setVisible(false);
        oneIV1.setVisible(false);
        twoIV1.setVisible(false);
        threeIV1.setVisible(false);
        fourIV1.setVisible(false);
        fiveIV1.setVisible(false);
        sixIV1.setVisible(false);
        Scene scene = new Scene(pane, 600,400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Let's battle");
        primaryStage.show();
    }
}
