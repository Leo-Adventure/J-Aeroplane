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
public class battleBG extends Application {
    static int cnt = 0;
    static int blue = 2;
    static int green = 3;
//fourIV.setVisible(true);
//                        fourIV.setFitHeight(150);
//                        fourIV.setFitWidth(200);
//                        fourIV.setLayoutX(68);
//                        fourIV.setLayoutY(211);
    //oneIV1.setVisible(true);
//
//                        oneIV1.setFitHeight(150);
//                        oneIV1.setFitWidth(200);
//                        oneIV1.setLayoutX(379);
//                        oneIV1.setLayoutY(211);
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Font font = new Font("Courier New", 15);
        Image battle = new Image("battleBvsG.jpg");
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
        ImageView threeIV = new ImageView(three);
        Image four = new Image("four.png");
        ImageView fourIV = new ImageView(four);
        Image five = new Image("five.png");
        ImageView fiveIV = new ImageView(five);
        Image six = new Image("six.png");
        ImageView sixIV = new ImageView(six);
        ImageView oneIV1 = new ImageView(one);
        ImageView twoIV1 = new ImageView(two);
        ImageView threeIV1 = new ImageView(three);
        ImageView fourIV1 = new ImageView(four);
        ImageView fiveIV1 = new ImageView(five);
        ImageView sixIV1 = new ImageView(six);
        btDice.setOnAction(event -> {
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
            ArrayList<Integer> arr = new ArrayList<>();
            if(cnt == 0){
            int num = dice.dice2();
            arr.add(num);
            switch(num){
                case 1:{
                    oneIV.setVisible(true);
                    oneIV.setFitHeight(150);
                    oneIV.setFitWidth(200);
                    oneIV.setLayoutX(68);
                    oneIV.setLayoutY(211);
                }
                case 2:{
                    twoIV.setVisible(true);
                    twoIV.setFitHeight(150);
                    twoIV.setFitWidth(200);
                    twoIV.setLayoutX(68);
                    twoIV.setLayoutY(211);
                }
                case 3:{
                    threeIV.setVisible(true);
                    threeIV.setFitHeight(150);
                    threeIV.setFitWidth(200);
                    threeIV.setLayoutX(68);
                    threeIV.setLayoutY(211);
                }
                case 4:{
                    fourIV.setVisible(true);
                    fourIV.setFitHeight(150);
                    fourIV.setFitWidth(200);
                    fourIV.setLayoutX(68);
                    fourIV.setLayoutY(211);
                }
                case 5:{
                    fiveIV.setVisible(true);
                    fiveIV.setFitHeight(150);
                    fiveIV.setFitWidth(200);
                    fiveIV.setLayoutX(68);
                    fiveIV.setLayoutY(211);
                }
                case 6:{
                    sixIV.setVisible(true);
                    sixIV.setFitHeight(150);
                    sixIV.setFitWidth(200);
                    sixIV.setLayoutX(68);
                    sixIV.setLayoutY(211);
                }
            }cnt ++;
        }
        else if(cnt == 1){
                int num = dice.dice2();
                arr.add(num);
                switch(num){
                    case 1:{
                        oneIV1.setVisible(true);
                        oneIV1.setFitHeight(150);
                        oneIV1.setFitWidth(200);
                        oneIV1.setLayoutX(379);
                        oneIV1.setLayoutY(211);
                    }break;
                    case 2:{
                        twoIV1.setVisible(true);
                        twoIV1.setFitHeight(150);
                        twoIV1.setFitWidth(200);
                        twoIV1.setLayoutX(379);
                        twoIV1.setLayoutY(211);
                    }break;
                    case 3:{
                        threeIV1.setVisible(true);
                        threeIV1.setFitHeight(150);
                        threeIV1.setFitWidth(200);
                        threeIV1.setLayoutX(379);
                        threeIV1.setLayoutY(211);
                    }break;
                    case 4:{
                        fourIV1.setVisible(true);
                        fourIV1.setFitHeight(150);
                        fourIV1.setFitWidth(200);
                        fourIV1.setLayoutX(379);
                        fourIV1.setLayoutY(211);
                    }break;
                    case 5:{
                        fiveIV1.setVisible(true);
                        fiveIV1.setFitHeight(150);
                        fiveIV1.setFitWidth(200);
                        fiveIV1.setLayoutX(379);
                        fiveIV1.setLayoutY(211);
                    }break;
                    case 6:{
                        sixIV1.setVisible(true);
                        sixIV1.setFitHeight(150);
                        sixIV1.setFitWidth(200);
                        sixIV1.setLayoutX(379);
                        sixIV1.setLayoutY(211);
                    }break;
                }cnt = 0;
        }
        if(blue == 0) {
            if (green == 3) basepane.resetBlue12L();
            if (green == 2) {
                basepane.resetBlue12L();
                Green.GreenPieceIV123.setVisible(false);
                Green.GreenPiece123L = -2;
                Green.GreenPieceIV12.setVisible(true);
                Green.GreenPiece12L = Green.GreenPiece123L;
                Green.GreenPieceIV12.setLayoutX(Green.getGreenLocationX(Green.GreenPiece12L));
                Green.GreenPieceIV12.setLayoutY(Green.getGreenLocationY(Green.GreenPiece12L));
                basepane.resetGreen1L();
            }if (green == 1) {
                basepane.resetBlue12L();
                Green.GreenPieceIV123.setVisible(false);
                Green.GreenPiece123L = -2;
                Green.GreenPieceIV3.setVisible(true);
                Green.GreenPiece3L = Green.GreenPiece123L;
                Green.GreenPieceIV3.setLayoutX(Green.getGreenLocationX(Green.GreenPiece12L));
                Green.GreenPieceIV3.setLayoutY(Green.getGreenLocationY(Green.GreenPiece12L));
                basepane.resetGreen1L();
                basepane.resetGreen2L();
            }primaryStage.close();
        }
        if(green == 0){
            if(blue == 1){
                Blue.BluePieceIV12.setVisible(false);
                basepane.resetBlue1L();
                Blue.BluePiece2L = Blue.BluePiece12L;
                Blue.BluePiece12L = -2;
                Blue.BluePieceIV2.setVisible(true);
                Blue.BluePieceIV2.setLayoutX(Blue.getBlueLocationX(Blue.BluePiece2L));
                Blue.BluePieceIV2.setLayoutY(Blue.getBlueLocationY(Blue.BluePiece2L));
            }
            if(blue == 2){
                basepane.resetGreen123L();
            }
            primaryStage.close();
        }
        if(arr.get(0) > arr.get(1)) green --;
        if(arr.get(0) <  arr.get(1)) blue--;
        if(arr.size()>= 2) arr.clear();
        });


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