package sample;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
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
import javafx.stage.Stage;

//  if(BluePiece2L >= 0 && BluePiece2L < 3){
//                        BluePieceIV2.setRotate(180);
//                    }
//                    if(BluePiece2L >= 3 && BluePiece2L < 7){
//                        BluePieceIV2.setRotate(90);
//                    }
//                    if(BluePiece2L >= 7 && BluePiece2L <=12){
//                        BluePieceIV2.setRotate(180);
//                    }
//                    if(BluePiece2L >= 13 && BluePiece2L <= 16){
//                        BluePieceIV2.setRotate(270);
//                    }
//                    if(BluePiece2L >= 17 && BluePiece2L <= 19){
//                        BluePieceIV2.setRotate(180);
//                    }
//                    if(BluePiece2L >= 20 && BluePiece2L <= 25){
//                        BluePieceIV2.setRotate(270);
//                    }
//                    if(BluePiece2L >= 26 && BluePiece2L <= 29){
//                        BluePieceIV2.setRotate(0);
//                    }
//                    if(BluePiece2L >= 30 && BluePiece2L <= 32){
//                        BluePieceIV2.setRotate(270);
//                    }
//                    if(BluePiece2L >= 33 && BluePiece2L<= 39){
//                        BluePieceIV2.setRotate(0);
//                    }
//                    if(BluePiece2L >= 40 && BluePiece2L <= 42){
//                        BluePieceIV2.setRotate(90);
//                    }
//                    if(BluePiece2L >= 43 && BluePiece2L <=45){
//                        BluePieceIV2.setRotate(0);
//                    }
//                    if(BluePiece2L >= 46 && BluePiece2L <= 49){
//                        BluePieceIV2.setRotate(90);
//                    }
//                    if(BluePiece2L >= 50 ){
//                        BluePieceIV2.setRotate(180);
//                    }
public class Blue {

    static int b1 = 0;
    static int b2 = 0;
    static int b3 = 0;
    static int b4 = 0;
    static int b12 = 0;
    static int b13 = 0;
    static int b14 = 0;
    static int b23 = 0;
    static int b24 = 0;
    static int b34 = 0;
    static int b123 = 0;
    static int b124 = 0;
    static int b134 = 0;
    static int b234 = 0;
    static int b1234 = 0;
    static int BluePiece1L = -2;
    static int BluePiece2L = -2;
    static int BluePiece3L = -2;
    static int BluePiece4L = -2;
    static int BluePiece12L = -2;
    static int BluePiece13L = -2;
    static int BluePiece14L = -2;
    static int BluePiece23L = -2;
    static int BluePiece24L = -2;
    static int BluePiece34L = -2;
    static int BluePiece123L = -2;
    static int BluePiece124L = -2;
    static int BluePiece134L = -2;
    static int BluePiece234L = -2;
    static int BluePiece1234L = -2;
    static int BlueNumber1 = 0;
    static int BlueNumber2 = 0;
    static int winNumber = 0;
    static Image WinIM = new Image("WinIM.jpg");
    static Image WinWDIM = new Image("WinWD.png");
    static ImageView WinWDIV = new ImageView(WinWDIM);
    static ImageView WinIV1= new ImageView(WinIM);
    static ImageView WinIV2= new ImageView(WinIM);
    static ImageView WinIV3= new ImageView(WinIM);
    static ImageView WinIV4= new ImageView(WinIM);

    static Image BluePieceImg1 = new Image("BluePiece.png");
    static ImageView BluePieceIV1 = new ImageView(BluePieceImg1);
    static Image BluePieceImg2 = new Image("BluePiece.png");
    static ImageView BluePieceIV2 = new ImageView(BluePieceImg2);
    static Image BluePieceImg3 = new Image("BluePiece.png");
    static ImageView BluePieceIV3 = new ImageView(BluePieceImg3);
    static Image BluePieceImg4 = new Image("BluePiece.png");
    static ImageView BluePieceIV4 = new ImageView(BluePieceImg4);
    static Image BlueIM12 = new Image("BTW.png");
    static Image BlueIM123 = new Image("BTR.png");
    static Image BlueIM1234 = new Image("BF.png");
    static ImageView BluePieceIV1234 = new ImageView(BlueIM1234);
    static ImageView BluePieceIV123 = new ImageView(BlueIM123);
    static ImageView BluePieceIV124 = new ImageView(BlueIM123);
    static ImageView BluePieceIV134 = new ImageView(BlueIM123);
    static ImageView BluePieceIV234 = new ImageView(BlueIM123);
    static ImageView BluePieceIV12 = new ImageView(BlueIM12);
    static ImageView BluePieceIV13 = new ImageView(BlueIM12);
    static ImageView BluePieceIV14 = new ImageView(BlueIM12);
    static ImageView BluePieceIV23 = new ImageView(BlueIM12);
    static ImageView BluePieceIV24 = new ImageView(BlueIM12);
    static ImageView BluePieceIV34 = new ImageView(BlueIM12);

    public static void turn(int x, ImageView IV){
        if(x >= 0 && x < 3){
            IV.setRotate(180);
        }
        if(x >= 3 && x < 7){
            IV.setRotate(90);
        }
        if(x >= 7 && x <=12){
            IV.setRotate(180);
        }
        if(x >= 13 && x <= 16){
            IV.setRotate(270);
        }
        if(x >= 17 && x <= 19){
            IV.setRotate(180);
        }
        if(x >= 20 && x <= 25){
            IV.setRotate(270);
        }
        if(x >= 26 && x <= 29){
            IV.setRotate(0);
        }
        if(x >= 30 && x <= 32){
            IV.setRotate(270);
        }
        if(x >= 33 && x<= 39){
            IV.setRotate(0);
        }
        if(x >= 40 && x <= 42){
            IV.setRotate(90);
        }
        if(x >= 43 && x <=45){
            IV.setRotate(0);
        }
        if(x >= 46 && x <= 49){
            IV.setRotate(90);
        }
        if(x >= 50 ){
            IV.setRotate(180);
        }
    }
    public static ImageView getBluePiece1() {
        BluePieceIV1.setLayoutX(426);
        BluePieceIV1.setLayoutY(426);
        BluePieceIV1.setFitHeight(30);
        BluePieceIV1.setFitWidth(30);
        BluePieceIV1.setRotate(0);
        BluePieceIV1.setOnMouseClicked(event -> {
            if(basepane.blueFlagOpen == true) b1++;
            basepane.blueFlagOpen = false;
            if (basepane.BlueFlag) {
                if (BluePieceIV1.getLayoutX() == 426 && BluePieceIV1.getLayoutY() == 426) {
                    if (BlueNumber1 == 6 || BlueNumber2 == 6) {

                        BluePieceIV1.setLayoutX(493);
                        BluePieceIV1.setLayoutY(376);
                        BluePiece1L ++;
                        basepane.BlueFlag = false;
                        if(basepane.blueCount > 0 && basepane.blueCount < 3) ep.setEp("It's still Player4's turn, Please roll the dice ");
                        else ep.setEp("It's Player1's turn");
                    } else {
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                } else {
                    if(BluePiece1L + basepane.pace1 > 55){
                        BluePiece1L = 110 - basepane.pace1 - BluePiece1L;
                        BluePieceIV1.setLayoutX(getBlueLocationX(BluePiece1L));
                        BluePieceIV1.setLayoutY(getBlueLocationY(BluePiece1L));
                        basepane.BlueBoom(BluePieceIV1);

                    }else {
                        BluePiece1L += basepane.pace1;
                        BluePieceIV1.setLayoutX(getBlueLocationX(BluePiece1L));
                        BluePieceIV1.setLayoutY(getBlueLocationY(BluePiece1L));
                        basepane.BlueBoom(BluePieceIV1);
                    }
                    if(BluePiece1L == 55){
                        BluePieceIV1.setVisible(false);
                        getWinIV1();
                        getWinWDIV();
                        winNumber ++ ;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        BluePiece1L = -3;
                    }
                    if(BluePiece1L == 13){
                        BluePiece1L = 29;
                        BluePieceIV1.setLayoutX(getBlueLocationX(BluePiece1L));
                        BluePieceIV1.setLayoutY(getBlueLocationY(BluePiece1L));
                        basepane.BlueBoom(BluePieceIV1);
                        basepane.BlueShortcut();
                    }
                    else if(BluePiece1L == 17){
                        BluePiece1L = 33;
                        BluePieceIV1.setLayoutX(getBlueLocationX(BluePiece1L));
                        BluePieceIV1.setLayoutY(getBlueLocationY(BluePiece1L));
                        basepane.BlueBoom(BluePieceIV1);
                        basepane.BlueShortcut();
                    }
                    else if((BluePiece1L - 1) % 4 == 0 && BluePiece1L <= 49){
                        BluePiece1L += 4;
                        BluePieceIV1.setLayoutX(getBlueLocationX(BluePiece1L));
                        BluePieceIV1.setLayoutY(getBlueLocationY(BluePiece1L));
                        basepane.BlueBoom(BluePieceIV1);
                    }
                    turn(BluePiece1L, BluePieceIV1);
                    basepane.BlueFlag = false;
                    if(basepane.blueCount > 0 && basepane.blueCount < 3) ep.setEp("It's still Player4's turn, Please roll the dice ");
                    else ep.setEp("It's Player1's turn");
                }
            }
            getBlueIV12();
            getBlueIV13();
            getBlueIV14();
            getBlueIV123();
            getBlueIV124();
            getBlueIV134();
            getBlueIV1234();
        });
        return BluePieceIV1;
    }
    public static ImageView getBluePiece3() {
        BluePieceIV3.setLayoutX(426);
        BluePieceIV3.setLayoutY(478);
        BluePieceIV3.setFitHeight(30);
        BluePieceIV3.setFitWidth(30);
        BluePieceIV3.setRotate(0);
        BluePieceIV3.setOnMouseClicked(event -> {
            if(basepane.blueFlagOpen == true) b3++;
            basepane.blueFlagOpen = false;
            if (basepane.BlueFlag) {
                if (BluePieceIV3.getLayoutX() == 426 && BluePieceIV3.getLayoutY() == 478) {
                    if (BlueNumber1 == 6 || BlueNumber2 == 6) {

                        BluePieceIV3.setLayoutX(493);
                        BluePieceIV3.setLayoutY(376);
                        BluePiece3L ++;

                        basepane.BlueFlag = false;
                        if(basepane.blueCount > 0 && basepane.blueCount < 3) ep.setEp("It's still Player4's turn, Please roll the dice ");
                        else ep.setEp("It's Player1's turn");
                    }
                    else {
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else {
                    if(BluePiece3L + basepane.pace1 > 55){
                        BluePiece3L = 110 - basepane.pace1 - BluePiece3L;
                        BluePieceIV3.setLayoutX(getBlueLocationX(BluePiece3L));
                        BluePieceIV3.setLayoutY(getBlueLocationY(BluePiece3L));
                        basepane.BlueBoom(BluePieceIV3);
                    }else {
                        BluePiece3L += basepane.pace1;
                        BluePieceIV3.setLayoutX(getBlueLocationX(BluePiece3L));
                        BluePieceIV3.setLayoutY(getBlueLocationY(BluePiece3L));
                        basepane.BlueBoom(BluePieceIV3);
                    }
                    if(BluePiece3L == 55){
                        BluePieceIV3.setVisible(false);
                        getWinIV3();
                        getWinWDIV();
                        winNumber ++ ;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        BluePiece3L = -3;
                    }
                    if(BluePiece3L == 13){
                        BluePiece3L = 29;
                        BluePieceIV3.setLayoutX(getBlueLocationX(BluePiece3L));
                        BluePieceIV3.setLayoutY(getBlueLocationY(BluePiece3L));
                        basepane.BlueBoom(BluePieceIV3);
                        basepane.BlueShortcut();
                    }
                    else if(BluePiece3L == 17){
                        BluePiece3L = 33;
                        BluePieceIV3.setLayoutX(getBlueLocationX(BluePiece3L));
                        BluePieceIV3.setLayoutY(getBlueLocationY(BluePiece3L));
                        basepane.BlueBoom(BluePieceIV3);
                        basepane.BlueShortcut();
                    }
                    else if((BluePiece3L - 1) % 4 == 0 && BluePiece3L <= 49){
                        BluePiece3L += 4;
                        BluePieceIV3.setLayoutX(getBlueLocationX(BluePiece3L));
                        BluePieceIV3.setLayoutY(getBlueLocationY(BluePiece3L));
                        basepane.BlueBoom(BluePieceIV3);
                    }
                    turn(BluePiece3L, BluePieceIV3);
                    basepane.BlueFlag = false;
                    if(basepane.blueCount > 0 && basepane.blueCount < 3) ep.setEp("It's still Player4's turn, Please roll the dice ");
                    else ep.setEp("It's Player1's turn");
                }
            }
            getBlueIV13();
            getBlueIV23();
            getBlueIV34();
            getBlueIV123();
            getBlueIV134();
            getBlueIV234();
            getBlueIV1234();
        });
        return BluePieceIV3;
    }
    public static ImageView getBluePiece2() {
        BluePieceIV2.setLayoutX(478);
        BluePieceIV2.setLayoutY(479);
        BluePieceIV2.setFitHeight(30);
        BluePieceIV2.setFitWidth(30);
        BluePieceIV2.setRotate(0);
        BluePieceIV2.setOnMouseClicked(event -> {
            if(basepane.blueFlagOpen == true) b2++;
            basepane.blueFlagOpen = false;
            if (basepane.BlueFlag) {
                if (BluePieceIV2.getLayoutX() == 478 && BluePieceIV2.getLayoutY() == 479) {
                    if (BlueNumber1 == 6 || BlueNumber2 == 6) {

                        BluePieceIV2.setLayoutX(493);
                        BluePieceIV2.setLayoutY(376);
                        BluePiece2L ++;

                        basepane.BlueFlag = false;
                        if(basepane.blueCount > 0 && basepane.blueCount < 3) ep.setEp("It's still Player4's turn, Please roll the dice ");
                        else ep.setEp("It's Player1's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{
                    if(BluePiece2L + basepane.pace1 > 55){
                        BluePiece2L = 110 - basepane.pace1 - BluePiece2L;
                        BluePieceIV2.setLayoutX(getBlueLocationX(BluePiece2L));
                        BluePieceIV2.setLayoutY(getBlueLocationY(BluePiece2L));
                        basepane.BlueBoom(BluePieceIV2);
                    }else {
                        BluePiece2L += basepane.pace1;
                        BluePieceIV2.setLayoutX(getBlueLocationX(BluePiece2L));
                        BluePieceIV2.setLayoutY(getBlueLocationY(BluePiece2L));
                        basepane.BlueBoom(BluePieceIV2);
                    }
                    if(BluePiece2L == 55){
                        BluePieceIV2.setVisible(false);
                        getWinIV2();
                        getWinWDIV();
                        winNumber ++ ;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        BluePiece2L = -3;
                    }
                    if(BluePiece2L == 13){
                        BluePiece2L = 29;
                        BluePieceIV2.setLayoutX(getBlueLocationX(BluePiece2L));
                        BluePieceIV2.setLayoutY(getBlueLocationY(BluePiece2L));
                        basepane.BlueShortcut();
                        basepane.BlueBoom(BluePieceIV2);
                    }
                    else if(BluePiece2L == 17){
                        BluePiece2L = 33;
                        BluePieceIV2.setLayoutX(getBlueLocationX(BluePiece2L));
                        BluePieceIV2.setLayoutY(getBlueLocationY(BluePiece2L));
                        basepane.BlueShortcut();
                        basepane.BlueBoom(BluePieceIV2);
                    }
                    else if((BluePiece2L - 1) % 4 == 0 && BluePiece2L <= 49){
                        BluePiece2L += 4;
                        BluePieceIV2.setLayoutX(getBlueLocationX(BluePiece2L));
                        BluePieceIV2.setLayoutY(getBlueLocationY(BluePiece2L));
                        basepane.BlueBoom(BluePieceIV2);
                    }
                    turn(BluePiece2L, BluePieceIV2);
                    basepane.BlueFlag = false;
                    if(basepane.blueCount > 0 && basepane.blueCount < 3) ep.setEp("It's still Player4's turn, Please roll the dice ");
                    else ep.setEp("It's Player1's turn");
                }
            }
            getBlueIV12();
            getBlueIV23();
            getBlueIV24();
            getBlueIV123();
            getBlueIV124();
            getBlueIV234();
            getBlueIV1234();
        });
        return BluePieceIV2;
    }
    public static ImageView getBluePiece4() {
        BluePieceIV4.setLayoutX(479);
        BluePieceIV4.setLayoutY(426);
        BluePieceIV4.setFitHeight(30);
        BluePieceIV4.setFitWidth(30);
        BluePieceIV4.setRotate(0);
        BluePieceIV4.setOnMouseClicked(event -> {
            if(basepane.blueFlagOpen == true) b4++;
            basepane.blueFlagOpen = false;
            if (basepane.BlueFlag) {
                if (BluePieceIV4.getLayoutX() == 479 && BluePieceIV4.getLayoutY() == 426) {
                    if (BlueNumber1 == 6 || BlueNumber2 == 6) {

                        BluePieceIV4.setLayoutX(493);
                        BluePieceIV4.setLayoutY(376);
                        BluePiece4L ++;
                        basepane.BlueFlag = false;
                        if(basepane.blueCount > 0 && basepane.blueCount < 3) ep.setEp("It's still Player4's turn, Please roll the dice ");
                        else ep.setEp("It's Player1's turn");
                    }
                    else {
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else {
                    if(BluePiece4L + basepane.pace1 > 55){
                        BluePiece4L = 110 - basepane.pace1 - BluePiece4L;
                        BluePieceIV4.setLayoutX(getBlueLocationX(BluePiece4L));
                        BluePieceIV4.setLayoutY(getBlueLocationY(BluePiece4L));
                        basepane.BlueBoom(BluePieceIV4);
                    }else {
                        BluePiece4L += basepane.pace1;
                        BluePieceIV4.setLayoutX(getBlueLocationX(BluePiece4L));
                        BluePieceIV4.setLayoutY(getBlueLocationY(BluePiece4L));
                        basepane.BlueBoom(BluePieceIV4);
                    }
                    if(BluePiece4L == 55){
                        BluePieceIV4.setVisible(false);
                        getWinIV4();
                        getWinWDIV();
                        winNumber ++ ;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        BluePiece4L = -3;
                    }
                    if(BluePiece4L == 13){
                        BluePiece4L = 29;
                        BluePieceIV4.setLayoutX(getBlueLocationX(BluePiece4L));
                        BluePieceIV4.setLayoutY(getBlueLocationY(BluePiece4L));
                        basepane.BlueShortcut();
                        basepane.BlueBoom(BluePieceIV4);
                    }
                    else if(BluePiece4L == 17){
                        BluePiece4L = 33;
                        BluePieceIV4.setLayoutX(getBlueLocationX(BluePiece4L));
                        BluePieceIV4.setLayoutY(getBlueLocationY(BluePiece4L));
                        basepane.BlueShortcut();
                        basepane.BlueBoom(BluePieceIV4);
                    }
                    else if((BluePiece4L - 1) % 4 == 0 && BluePiece4L <= 49){
                        BluePiece4L += 4;
                        BluePieceIV4.setLayoutX(getBlueLocationX(BluePiece4L));
                        BluePieceIV4.setLayoutY(getBlueLocationY(BluePiece4L));
                        basepane.BlueBoom(BluePieceIV4);
                    }
                    turn(BluePiece4L, BluePieceIV4);
                    basepane.BlueFlag = false;
                    if(basepane.blueCount > 0 && basepane.blueCount < 3) ep.setEp("It's still Player4's turn, Please roll the dice ");
                    else ep.setEp("It's Player1's turn");
                }
            }
            getBlueIV14();
            getBlueIV24();
            getBlueIV34();
            getBlueIV124();
            getBlueIV134();
            getBlueIV234();
            getBlueIV1234();
        });
        return BluePieceIV4;
    }
    public static ImageView getBlueIV12(){
        BluePieceIV12.setVisible(false);
        if(BluePiece1L != -2 ) {
            if (BluePieceIV1.isVisible() && BluePieceIV2.isVisible() &&BluePiece1L == BluePiece2L) {
                BluePieceIV1.setVisible(false);
                BluePieceIV2.setVisible(false);
                BluePieceIV12.setFitHeight(30);
                BluePieceIV12.setFitWidth(30);
                BluePieceIV12.setLayoutX(BluePieceIV1.getLayoutX());
                BluePieceIV12.setLayoutY(BluePieceIV1.getLayoutY());
                BluePiece12L = BluePiece1L;
                BluePieceIV12.setVisible(true);
            }
        }
        BluePieceIV12.setOnMouseClicked(event -> {
            if(basepane.blueFlagOpen) b12 ++;
            basepane.blueFlagOpen = false;
            if (basepane.BlueFlag) {
                if(BluePiece12L + basepane.pace1 > 55 ){
                    BluePiece12L = 110 - basepane.pace1 - BluePiece12L;
                    BluePieceIV12.setLayoutX(getBlueLocationX(BluePiece12L));
                    BluePieceIV12.setLayoutY(getBlueLocationY(BluePiece12L));
                    basepane.BlueBoom(BluePieceIV12);

                }
                else {
                    BluePiece12L += basepane.pace1;
                    BluePieceIV12.setLayoutX(getBlueLocationX(BluePiece12L));
                    BluePieceIV12.setLayoutY(getBlueLocationY(BluePiece12L));
                     basepane.BlueBoom(BluePieceIV12);

                }
                if (BluePiece12L == 55) {
                    BluePieceIV12.setVisible(false);
                    getWinIV1();
                    getWinIV2();
                    getWinWDIV();
                    winNumber += 2;
                    if(winNumber == 4){
                        new WinPane().display("ConGratulations!","Green is winner!");
                    }
                    BluePiece1L = -3;
                    BluePiece2L = -3;
                }
                if(BluePiece12L == 13){
                    BluePiece12L = 29;
                    BluePieceIV12.setLayoutX(getBlueLocationX(BluePiece12L));
                    BluePieceIV12.setLayoutY(getBlueLocationY(BluePiece12L));
                    basepane.BlueShortcut();
                      basepane.BlueBoom(BluePieceIV12);
                }
                else if(BluePiece12L == 17){
                    BluePiece12L = 33;
                    BluePieceIV12.setLayoutX(getBlueLocationX(BluePiece12L));
                    BluePieceIV12.setLayoutY(getBlueLocationY(BluePiece12L));
                    basepane.BlueShortcut();
                      basepane.BlueBoom(BluePieceIV12);
                }
                else if((BluePiece12L - 1) % 4 == 0 && BluePiece12L <= 49){
                    BluePiece12L += 4;
                    BluePieceIV12.setLayoutX(getBlueLocationX(BluePiece12L));
                    BluePieceIV12.setLayoutY(getBlueLocationY(BluePiece12L));
                      basepane.BlueBoom(BluePieceIV12);
                }

                turn(BluePiece12L, BluePieceIV12);
                basepane.BlueFlag = false;
                if(basepane.blueCount > 0 && basepane.blueCount < 3) ep.setEp("It's still Player4's turn, Please roll the dice ");
                else ep.setEp("It's Player1's turn");

            }
            getBlueIV123();
            getBlueIV124();
            getBlueIV1234();
        });
        return BluePieceIV12;
    }
    public static ImageView getBlueIV13(){
        BluePieceIV13.setVisible(false);
        if(BluePiece1L != -2 ) {
            if (BluePieceIV1.isVisible() && BluePieceIV3.isVisible() &&BluePiece1L == BluePiece3L) {
                BluePieceIV1.setVisible(false);
                BluePieceIV3.setVisible(false);
                BluePieceIV13.setFitHeight(30);
                BluePieceIV13.setFitWidth(30);
                BluePieceIV13.setLayoutX(BluePieceIV1.getLayoutX());
                BluePieceIV13.setLayoutY(BluePieceIV1.getLayoutY());
                BluePiece13L = BluePiece1L;
                BluePieceIV13.setVisible(true);
            }
        }
        BluePieceIV13.setOnMouseClicked(event -> {
            if(basepane.blueFlagOpen) b13 ++;
            basepane.blueFlagOpen = false;
            if (basepane.BlueFlag) {
                if (BluePieceIV13.getLayoutX() == 425 && BluePieceIV13.getLayoutY() == 73) {
                    if (BlueNumber1 == 6 || BlueNumber2 == 6) {
                        BluePieceIV13.setLayoutX(375);
                        BluePieceIV13.setLayoutY(8);
                        basepane.BlueFlag = false;
                        if(basepane.blueCount > 0 && basepane.blueCount < 3) ep.setEp("It's still Player2's turn, Please roll the dice ");
                        else ep.setEp("It's Player3's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{

                    if(BluePiece13L + basepane.pace1 > 55 ){
                        BluePiece13L = 110 - basepane.pace1 - BluePiece13L;
                        BluePieceIV13.setLayoutX(getBlueLocationX(BluePiece13L));
                        BluePieceIV13.setLayoutY(getBlueLocationY(BluePiece13L));
                        basepane.BlueBoom(BluePieceIV13);

                    }
                    else {
                        BluePiece13L += basepane.pace1;
                        BluePieceIV13.setLayoutX(getBlueLocationX(BluePiece13L));
                        BluePieceIV13.setLayoutY(getBlueLocationY(BluePiece13L));
                        basepane.BlueBoom(BluePieceIV13);

                    }
                    if (BluePiece13L == 55) {
                        BluePieceIV13.setVisible(false);
                        getWinIV1();
                        getWinIV3();
                        getWinWDIV();
                        winNumber += 2;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        BluePiece1L = -3;
                        BluePiece3L = -3;
                    }
                    if(BluePiece13L == 13){
                        BluePiece13L = 29;
                        BluePieceIV13.setLayoutX(getBlueLocationX(BluePiece13L));
                        BluePieceIV13.setLayoutY(getBlueLocationY(BluePiece13L));
                        basepane.BlueShortcut();
                        basepane.BlueBoom(BluePieceIV13);
                    }
                    else if(BluePiece13L == 17){
                        BluePiece13L = 33;
                        BluePieceIV13.setLayoutX(getBlueLocationX(BluePiece13L));
                        BluePieceIV13.setLayoutY(getBlueLocationY(BluePiece13L));
                        basepane.BlueShortcut();
                        basepane.BlueBoom(BluePieceIV13);
                    }

                    else if((BluePiece13L - 1) % 4 == 0 && BluePiece13L <= 49){
                        BluePiece13L += 4;
                        BluePieceIV13.setLayoutX(getBlueLocationX(BluePiece13L));
                        BluePieceIV13.setLayoutY(getBlueLocationY(BluePiece13L));
                        basepane.BlueBoom(BluePieceIV13);
                    }

                    turn(BluePiece13L, BluePieceIV13);
                    basepane.BlueFlag = false;
                    if(basepane.blueCount > 0 && basepane.blueCount < 3) ep.setEp("It's still Player4's turn, Please roll the dice ");
                    else ep.setEp("It's Player1's turn");
                }
            }
            getBlueIV123();
            getBlueIV134();
            getBlueIV1234();
        });
        return BluePieceIV13;
    }
    public static ImageView getBlueIV14(){
        BluePieceIV14.setVisible(false);
        if(BluePiece1L != -2 ) {
            if (BluePieceIV1.isVisible() && BluePieceIV4.isVisible() &&BluePiece1L == BluePiece4L) {
                BluePieceIV1.setVisible(false);
                BluePieceIV4.setVisible(false);
                BluePieceIV14.setFitHeight(30);
                BluePieceIV14.setFitWidth(30);
                BluePieceIV14.setLayoutX(BluePieceIV1.getLayoutX());
                BluePieceIV14.setLayoutY(BluePieceIV1.getLayoutY());
                BluePiece14L = BluePiece1L;
                BluePieceIV14.setVisible(true);
            }
        }
        BluePieceIV14.setOnMouseClicked(event -> {
            if(basepane.blueFlagOpen) b14 ++;
            basepane.blueFlagOpen = false;
            if (basepane.BlueFlag) {
                if (BluePieceIV14.getLayoutX() == 425 && BluePieceIV14.getLayoutY() == 73) {
                    if (BlueNumber1 == 6 || BlueNumber2 == 6) {
                        BluePieceIV14.setLayoutX(375);
                        BluePieceIV14.setLayoutY(8);
                        basepane.BlueFlag = false;
                        if(basepane.blueCount > 0 && basepane.blueCount < 3) ep.setEp("It's still Player2's turn, Please roll the dice ");
                        else ep.setEp("It's Player3's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{

                    if(BluePiece14L + basepane.pace1 > 55){
                        BluePiece14L = 110 - basepane.pace1 - BluePiece14L;
                        BluePieceIV14.setLayoutX(getBlueLocationX(BluePiece14L));
                        BluePieceIV14.setLayoutY(getBlueLocationY(BluePiece14L));
                        basepane.BlueBoom(BluePieceIV14);

                    }

                    else {
                        BluePiece14L += basepane.pace1;
                        BluePieceIV14.setLayoutX(getBlueLocationX(BluePiece14L));
                        BluePieceIV14.setLayoutY(getBlueLocationY(BluePiece14L));
                        basepane.BlueBoom(BluePieceIV14);

                    }
                    if (BluePiece14L == 55) {
                        BluePieceIV14.setVisible(false);
                        getWinIV1();
                        getWinIV4();
                        getWinWDIV();
                        winNumber += 2;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        BluePiece1L = -3;
                        BluePiece4L = -3;
                    }
                    if(BluePiece14L == 13){
                        BluePiece14L = 29;
                        BluePieceIV14.setLayoutX(getBlueLocationX(BluePiece14L));
                        BluePieceIV14.setLayoutY(getBlueLocationY(BluePiece14L));
                        basepane.BlueShortcut();
                        basepane.BlueBoom(BluePieceIV14);
                    }
                    else if(BluePiece14L == 17){
                        BluePiece14L = 33;
                        BluePieceIV14.setLayoutX(getBlueLocationX(BluePiece14L));
                        BluePieceIV14.setLayoutY(getBlueLocationY(BluePiece14L));
                        basepane.BlueShortcut();
                        basepane.BlueBoom(BluePieceIV14);
                    }
                    else if((BluePiece14L - 1) % 4 == 0 && BluePiece14L <= 49){
                        BluePiece14L += 4;
                        BluePieceIV14.setLayoutX(getBlueLocationX(BluePiece14L));
                        BluePieceIV14.setLayoutY(getBlueLocationY(BluePiece14L));
                        basepane.BlueBoom(BluePieceIV14);
                    }

                    turn(BluePiece14L, BluePieceIV14);
                    basepane.BlueFlag = false;
                    if(basepane.blueCount > 0 && basepane.blueCount < 3) ep.setEp("It's still Player4's turn, Please roll the dice ");
                    else ep.setEp("It's Player1's turn");
                }
            }
            getBlueIV124();
            getBlueIV134();
            getBlueIV1234();
        });
        return BluePieceIV14;
    }
    public static ImageView getBlueIV23(){
        BluePieceIV23.setVisible(false);
        if(BluePiece2L != -2 ) {
            if (BluePieceIV2.isVisible() && BluePieceIV3.isVisible() &&BluePiece2L == BluePiece3L) {
                BluePieceIV2.setVisible(false);
                BluePieceIV3.setVisible(false);
                BluePieceIV23.setFitHeight(30);
                BluePieceIV23.setFitWidth(30);
                BluePieceIV23.setLayoutX(BluePieceIV2.getLayoutX());
                BluePieceIV23.setLayoutY(BluePieceIV2.getLayoutY());
                BluePiece23L = BluePiece2L;
                BluePieceIV23.setVisible(true);
            }
        }
        BluePieceIV23.setOnMouseClicked(event -> {
            if(basepane.blueFlagOpen) b23 ++;
            basepane.blueFlagOpen = false;
            if (basepane.BlueFlag) {
                if (BluePieceIV23.getLayoutX() == 425 && BluePieceIV23.getLayoutY() == 73) {
                    if (BlueNumber1 == 6 || BlueNumber2 == 6) {
                        BluePieceIV23.setLayoutX(375);
                        BluePieceIV23.setLayoutY(8);
                        basepane.BlueFlag = false;
                        if(basepane.blueCount > 0 && basepane.blueCount < 3) ep.setEp("It's still Player4's turn, Please roll the dice ");
                        else ep.setEp("It's Player1's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{

                    if(BluePiece23L + basepane.pace1 > 55){
                        BluePiece23L = 110 - basepane.pace1 - BluePiece23L;
                        BluePieceIV23.setLayoutX(getBlueLocationX(BluePiece23L));
                        BluePieceIV23.setLayoutY(getBlueLocationY(BluePiece23L));
                        basepane.BlueBoom(BluePieceIV23);

                    }
                    else {
                        BluePiece23L += basepane.pace1;
                        BluePieceIV23.setLayoutX(getBlueLocationX(BluePiece23L));
                        BluePieceIV23.setLayoutY(getBlueLocationY(BluePiece23L));
                        basepane.BlueBoom(BluePieceIV23);

                    }
                    if (BluePiece23L == 55) {
                        BluePieceIV23.setVisible(false);
                        getWinIV3();
                        getWinIV2();
                        getWinWDIV();
                        winNumber += 2;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        BluePiece3L = -3;
                        BluePiece2L = -3;
                    }
                    if(BluePiece23L == 13){//
                        BluePiece23L = 29;
                        BluePieceIV23.setLayoutX(getBlueLocationX(BluePiece23L));
                        BluePieceIV23.setLayoutY(getBlueLocationY(BluePiece23L));
                        basepane.BlueShortcut();
                        basepane.BlueBoom(BluePieceIV23);
                    }
                    else if(BluePiece23L == 17){
                        BluePiece23L = 33;
                        BluePieceIV23.setLayoutX(getBlueLocationX(BluePiece23L));
                        BluePieceIV23.setLayoutY(getBlueLocationY(BluePiece23L));
                        basepane.BlueShortcut();
                        basepane.BlueBoom(BluePieceIV23);
                    }
                    else if((BluePiece23L - 1) % 4 == 0 && BluePiece23L <= 49){
                        BluePiece23L += 4;
                        BluePieceIV23.setLayoutX(getBlueLocationX(BluePiece23L));
                        BluePieceIV23.setLayoutY(getBlueLocationY(BluePiece23L));
                        basepane.BlueBoom(BluePieceIV23);
                    }

                    turn(BluePiece23L, BluePieceIV23);
                    basepane.BlueFlag = false;
                    if(basepane.blueCount > 0 && basepane.blueCount < 3) ep.setEp("It's still Player4's turn, Please roll the dice ");
                    else ep.setEp("It's Player1's turn");
                }
            }
            getBlueIV123();
            getBlueIV234();
            getBlueIV1234();
        });
        return BluePieceIV23;
    }
    public static ImageView getBlueIV24(){
        BluePieceIV24.setVisible(false);
        if(BluePiece2L != -2 ) {
            if (BluePieceIV2.isVisible() && BluePieceIV4.isVisible() &&BluePiece2L == BluePiece4L) {
                BluePieceIV2.setVisible(false);
                BluePieceIV4.setVisible(false);
                BluePieceIV24.setFitHeight(30);
                BluePieceIV24.setFitWidth(30);
                BluePieceIV24.setLayoutX(BluePieceIV2.getLayoutX());
                BluePieceIV24.setLayoutY(BluePieceIV2.getLayoutY());
                BluePiece24L = BluePiece2L;
                BluePieceIV24.setVisible(true);
            }
        }
        BluePieceIV24.setOnMouseClicked(event -> {
            if(basepane.blueFlagOpen) b24 ++;
            basepane.blueFlagOpen = false;
            if (basepane.BlueFlag) {
                if (BluePieceIV24.getLayoutX() == 425 && BluePieceIV24.getLayoutY() == 73) {
                    if (BlueNumber1 == 6 || BlueNumber2 == 6) {
                        BluePieceIV24.setLayoutX(375);
                        BluePieceIV24.setLayoutY(8);
                        basepane.BlueFlag = false;
                        if(basepane.blueCount > 0 && basepane.blueCount < 3) ep.setEp("It's still Player3's turn, Please roll the dice ");
                        else ep.setEp("It's Player4's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{

                    if(BluePiece24L + basepane.pace1 > 55 ){
                        BluePiece24L = 110 - basepane.pace1 - BluePiece24L;
                        BluePieceIV24.setLayoutX(getBlueLocationX(BluePiece24L));
                        BluePieceIV24.setLayoutY(getBlueLocationY(BluePiece24L));
                        basepane.BlueBoom(BluePieceIV24);

                    }

                    else{
                        BluePiece24L += basepane.pace1;
                        BluePieceIV24.setLayoutX(getBlueLocationX(BluePiece24L));
                        BluePieceIV24.setLayoutY(getBlueLocationY(BluePiece24L));
                        basepane.BlueBoom(BluePieceIV24);

                    }
                    if (BluePiece24L == 55) {
                        BluePieceIV24.setVisible(false);
                        getWinIV4();
                        getWinIV2();
                        getWinWDIV();
                        winNumber += 2;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        BluePiece4L = -3;
                        BluePiece2L = -3;
                    }
                    if(BluePiece24L == 13){//
                        BluePiece24L = 29;
                        BluePieceIV24.setLayoutX(getBlueLocationX(BluePiece24L));
                        BluePieceIV24.setLayoutY(getBlueLocationY(BluePiece24L));
                        basepane.BlueShortcut();
                        basepane.BlueBoom(BluePieceIV24);
                    }
                    else if(BluePiece24L == 17){
                        BluePiece24L = 33;
                        BluePieceIV24.setLayoutX(getBlueLocationX(BluePiece24L));
                        BluePieceIV24.setLayoutY(getBlueLocationY(BluePiece24L));
                        basepane.BlueShortcut();
                        basepane.BlueBoom(BluePieceIV24);
                    }
                    else if((BluePiece24L - 1) % 4 == 0 && BluePiece24L <= 49){
                        BluePiece24L += 4;
                        BluePieceIV24.setLayoutX(getBlueLocationX(BluePiece24L));
                        BluePieceIV24.setLayoutY(getBlueLocationY(BluePiece24L));
                        basepane.BlueBoom(BluePieceIV24);
                    }

                    turn(BluePiece24L, BluePieceIV24);
                    basepane.BlueFlag = false;
                    if(basepane.blueCount > 0 && basepane.blueCount < 3) ep.setEp("It's still Player4's turn, Please roll the dice ");
                    else ep.setEp("It's Player1's turn");
                }
            }
            getBlueIV124();
            getBlueIV234();
            getBlueIV1234();
        });
        return BluePieceIV24;
    }
    public static ImageView getBlueIV34(){
        BluePieceIV34.setVisible(false);
        if(BluePiece3L != -2 ) {
            if (BluePieceIV3.isVisible() && BluePieceIV4.isVisible() &&BluePiece3L == BluePiece4L) {
                BluePieceIV4.setVisible(false);
                BluePieceIV3.setVisible(false);
                BluePieceIV34.setFitHeight(30);
                BluePieceIV34.setFitWidth(30);
                BluePieceIV34.setLayoutX(BluePieceIV3.getLayoutX());
                BluePieceIV34.setLayoutY(BluePieceIV3.getLayoutY());
                BluePiece34L = BluePiece3L;
                BluePieceIV34.setVisible(true);
            }
        }
        BluePieceIV34.setOnMouseClicked(event -> {
            if(basepane.blueFlagOpen) b34 ++;
            basepane.blueFlagOpen = false;
            if (basepane.BlueFlag) {

                if (BluePieceIV34.getLayoutX() == 425 && BluePieceIV34.getLayoutY() == 73) {
                    if (BlueNumber1 == 6 || BlueNumber2 == 6) {
                        BluePieceIV34.setLayoutX(375);
                        BluePieceIV34.setLayoutY(8);
                        basepane.BlueFlag = false;
                        if(basepane.blueCount > 0 && basepane.blueCount < 3) ep.setEp("It's still Player1's turn, Please roll the dice ");
                        else ep.setEp("It's Player2's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{

                    if(BluePiece34L + basepane.pace1 > 55 ){
                        BluePiece34L = 110 - basepane.pace1 - BluePiece34L;
                        BluePieceIV34.setLayoutX(getBlueLocationX(BluePiece34L));
                        BluePieceIV34.setLayoutY(getBlueLocationY(BluePiece34L));
                        basepane.BlueBoom(BluePieceIV34);

                    }
                    else {
                        BluePiece34L += basepane.pace1;
                        BluePieceIV34.setLayoutX(getBlueLocationX(BluePiece34L));
                        BluePieceIV34.setLayoutY(getBlueLocationY(BluePiece34L));
                        basepane.BlueBoom(BluePieceIV34);

                    }
                    if (BluePiece34L == 55) {
                        BluePieceIV34.setVisible(false);
                        getWinIV3();
                        getWinIV4();
                        getWinWDIV();
                        winNumber += 2;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        BluePiece4L = -3;
                        BluePiece3L = -3;
                    }
                    if(BluePiece34L == 13){
                        BluePiece34L = 29;
                        BluePieceIV34.setLayoutX(getBlueLocationX(BluePiece34L));
                        BluePieceIV34.setLayoutY(getBlueLocationY(BluePiece34L));
                        basepane.BlueShortcut();
                        basepane.BlueBoom(BluePieceIV34);
                    }
                    else if(BluePiece34L == 17){
                        BluePiece34L = 33;
                        BluePieceIV34.setLayoutX(getBlueLocationX(BluePiece34L));
                        BluePieceIV34.setLayoutY(getBlueLocationY(BluePiece34L));
                        basepane.BlueShortcut();
                        basepane.BlueBoom(BluePieceIV34);
                    }
                    else if((BluePiece34L - 1) % 4 == 0 && BluePiece34L <= 49){
                        BluePiece34L += 4;
                        BluePieceIV34.setLayoutX(getBlueLocationX(BluePiece34L));
                        BluePieceIV34.setLayoutY(getBlueLocationY(BluePiece34L));
                        basepane.BlueBoom(BluePieceIV34);
                    }

                    turn(BluePiece34L, BluePieceIV34);
                    basepane.BlueFlag = false;
                    if(basepane.blueCount > 0 && basepane.blueCount < 3) ep.setEp("It's still Player4's turn, Please roll the dice ");
                    else ep.setEp("It's Player1's turn");
                }
            }
            getBlueIV134();
            getBlueIV234();
            getBlueIV1234();
        });
        return BluePieceIV34;
    }
    public static ImageView getBlueIV123(){
        BluePieceIV123.setVisible(false);
        if(BluePiece1L != -2 && BluePiece2L != -2 && BluePiece3L != -2 ) {
            if (BluePieceIV1.isVisible() && BluePieceIV23.isVisible() &&BluePiece1L == BluePiece23L ) {
                BluePieceIV1.setVisible(false);
                BluePieceIV23.setVisible(false);
                BluePieceIV123.setFitHeight(30);
                BluePieceIV123.setFitWidth(30);
                BluePieceIV123.setLayoutX(BluePieceIV1.getLayoutX());
                BluePieceIV123.setLayoutY(BluePieceIV1.getLayoutY());
                BluePiece123L = BluePiece1L;
                BluePieceIV123.setVisible(true);
            }
            else if(BluePieceIV2.isVisible() && BluePieceIV13.isVisible() &&BluePiece2L == BluePiece13L){
                BluePieceIV2.setVisible(false);
                BluePieceIV13.setVisible(false);
                BluePieceIV123.setFitHeight(30);
                BluePieceIV123.setFitWidth(30);
                BluePieceIV123.setLayoutX(BluePieceIV2.getLayoutX());
                BluePieceIV123.setLayoutY(BluePieceIV2.getLayoutY());
                BluePiece123L = BluePiece2L;
                BluePieceIV123.setVisible(true);
            }
            else if(BluePieceIV3.isVisible() && BluePieceIV12.isVisible() &&BluePiece3L == BluePiece12L) {
                BluePieceIV3.setVisible(false);
                BluePieceIV12.setVisible(false);
                BluePieceIV123.setFitHeight(30);
                BluePieceIV123.setFitWidth(30);
                BluePieceIV123.setLayoutX(BluePieceIV3.getLayoutX());
                BluePieceIV123.setLayoutY(BluePieceIV3.getLayoutY());
                BluePiece123L = BluePiece3L;
                BluePieceIV123.setVisible(true);
            }
        }
        BluePieceIV123.setOnMouseClicked(event -> {
            if(basepane.blueFlagOpen) b123 ++;
            basepane.blueFlagOpen = false;
            if (basepane.BlueFlag) {
                BluePieceIV12.setVisible(false);
                BluePieceIV13.setVisible(false);
                BluePieceIV23.setVisible(false);
                if (BluePieceIV123.getLayoutX() == 425 && BluePieceIV123.getLayoutY() == 73) {
                    if (BlueNumber1 == 6 || BlueNumber2 == 6) {
                        BluePieceIV123.setLayoutX(375);
                        BluePieceIV123.setLayoutY(8);
                        basepane.BlueFlag = false;
                        if(basepane.blueCount > 0 && basepane.blueCount < 3) ep.setEp("It's still Player1's turn, Please roll the dice ");
                        else ep.setEp("It's Player2's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{

                    if(BluePiece123L + basepane.pace1 > 55 ){
                        BluePiece123L = 110 - basepane.pace1 - BluePiece123L;
                        BluePieceIV123.setLayoutX(getBlueLocationX(BluePiece123L));
                        BluePieceIV123.setLayoutY(getBlueLocationY(BluePiece123L));
                        basepane.BlueBoom(BluePieceIV123);
                    }
                    else {
                        BluePiece123L += basepane.pace1;
                        BluePieceIV123.setLayoutX(getBlueLocationX(BluePiece123L));
                        BluePieceIV123.setLayoutY(getBlueLocationY(BluePiece123L));

                        basepane.BlueBoom(BluePieceIV123);
                    }
                    if (BluePiece123L == 55) {
                        BluePieceIV123.setVisible(false);
                        getWinIV1();
                        getWinIV2();
                        getWinIV3();
                        getWinWDIV();
                        winNumber += 3;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        BluePiece1L = -3;
                        BluePiece2L = -3;
                        BluePiece3L = -3;
                    }
                    if(BluePiece123L == 13){
                        BluePiece123L = 29;
                        BluePieceIV123.setLayoutX(getBlueLocationX(BluePiece123L));
                        BluePieceIV123.setLayoutY(getBlueLocationY(BluePiece123L));
                        basepane.BlueShortcut();
                        basepane.BlueBoom(BluePieceIV123);
                    }
                    else if(BluePiece123L == 17){
                        BluePiece123L = 33;
                        BluePieceIV123.setLayoutX(getBlueLocationX(BluePiece123L));
                        BluePieceIV123.setLayoutY(getBlueLocationY(BluePiece123L));
                        basepane.BlueShortcut();
                        basepane.BlueBoom(BluePieceIV123);
                    }
                    else if((BluePiece123L - 1) % 4 == 0 && BluePiece123L <= 49){
                        BluePiece123L += 4;
                        BluePieceIV123.setLayoutX(getBlueLocationX(BluePiece123L));
                        BluePieceIV123.setLayoutY(getBlueLocationY(BluePiece123L));
                        basepane.BlueBoom(BluePieceIV123);
                    }

                    turn(BluePiece123L, BluePieceIV123);
                    basepane.BlueFlag = false;
                    if(basepane.blueCount > 0 && basepane.blueCount < 3) ep.setEp("It's still Player4's turn, Please roll the dice ");
                    else ep.setEp("It's Player1's turn");
                }
            }
            getBlueIV1234();
        });
        return BluePieceIV123;
    }
    public static ImageView getBlueIV124(){
        BluePieceIV124.setVisible(false);
        if(BluePiece1L != -2 && BluePiece2L != -2 && BluePiece4L != -2 ) {
            if (BluePieceIV1.isVisible() && BluePieceIV24.isVisible() &&BluePiece1L == BluePiece24L ) {
                BluePieceIV1.setVisible(false);
                BluePieceIV24.setVisible(false);
                BluePieceIV124.setFitHeight(30);
                BluePieceIV124.setFitWidth(30);
                BluePieceIV124.setLayoutX(BluePieceIV1.getLayoutX());
                BluePieceIV124.setLayoutY(BluePieceIV1.getLayoutY());
                BluePiece124L = BluePiece1L;
                BluePieceIV124.setVisible(true);
            }
            else if(BluePieceIV2.isVisible() && BluePieceIV14.isVisible() &&BluePiece2L == BluePiece14L){
                BluePieceIV2.setVisible(false);
                BluePieceIV14.setVisible(false);
                BluePieceIV124.setFitHeight(30);
                BluePieceIV124.setFitWidth(30);
                BluePieceIV124.setLayoutX(BluePieceIV2.getLayoutX());
                BluePieceIV124.setLayoutY(BluePieceIV2.getLayoutY());
                BluePiece124L = BluePiece2L;
                BluePieceIV124.setVisible(true);
            }
            else if(BluePieceIV4.isVisible() && BluePieceIV12.isVisible() &&BluePiece4L == BluePiece12L) {
                BluePieceIV4.setVisible(false);
                BluePieceIV12.setVisible(false);
                BluePieceIV124.setFitHeight(30);
                BluePieceIV124.setFitWidth(30);
                BluePieceIV124.setLayoutX(BluePieceIV4.getLayoutX());
                BluePieceIV124.setLayoutY(BluePieceIV4.getLayoutY());
                BluePiece124L = BluePiece4L;
                BluePieceIV124.setVisible(true);
            }
        }
        BluePieceIV124.setOnMouseClicked(event -> {
            if(basepane.blueFlagOpen) b124 ++;
            basepane.blueFlagOpen = false;
            if (basepane.BlueFlag) {
                BluePieceIV12.setVisible(false);
                BluePieceIV14.setVisible(false);
                BluePieceIV24.setVisible(false);
                if (BluePieceIV124.getLayoutX() == 425 && BluePieceIV124.getLayoutY() == 73) {
                    if (BlueNumber1 == 6 || BlueNumber2 == 6) {
                        BluePieceIV124.setLayoutX(375);
                        BluePieceIV124.setLayoutY(8);
                        basepane.BlueFlag = false;
                        if(basepane.blueCount > 0 && basepane.blueCount < 3) ep.setEp("It's still Player2's turn, Please roll the dice ");
                        else ep.setEp("It's Player3's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{

                    if(BluePiece124L + basepane.pace1 > 55){
                        BluePiece124L = 110 - basepane.pace1 - BluePiece124L;
                        BluePieceIV124.setLayoutX(getBlueLocationX(BluePiece124L));
                        BluePieceIV124.setLayoutY(getBlueLocationY(BluePiece124L));
                        basepane.BlueBoom(BluePieceIV124);

                    }else {
                        BluePiece124L += basepane.pace1;
                        BluePieceIV124.setLayoutX(getBlueLocationX(BluePiece124L));
                        BluePieceIV124.setLayoutY(getBlueLocationY(BluePiece124L));
                        basepane.BlueBoom(BluePieceIV124);

                    }
                    if (BluePiece124L == 55) {
                        BluePieceIV124.setVisible(false);
                        getWinIV1();
                        getWinIV2();
                        getWinIV4();
                        getWinWDIV();
                        winNumber += 3;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        BluePiece1L = -3;
                        BluePiece2L = -3;
                        BluePiece4L = -3;
                    }
                    if(BluePiece124L == 13){
                        BluePiece124L = 29;
                        BluePieceIV124.setLayoutX(getBlueLocationX(BluePiece124L));
                        BluePieceIV124.setLayoutY(getBlueLocationY(BluePiece124L));
                        basepane.BlueShortcut();
                        basepane.BlueBoom(BluePieceIV124);
                    }
                    else if(BluePiece124L == 17){
                        BluePiece124L = 33;
                        BluePieceIV124.setLayoutX(getBlueLocationX(BluePiece124L));
                        BluePieceIV124.setLayoutY(getBlueLocationY(BluePiece124L));
                        basepane.BlueShortcut();
                        basepane.BlueBoom(BluePieceIV124);
                    }
                    else if((BluePiece124L - 1) % 4 == 0 && BluePiece124L <= 49){
                        BluePiece124L += 4;
                        BluePieceIV124.setLayoutX(getBlueLocationX(BluePiece124L));
                        BluePieceIV124.setLayoutY(getBlueLocationY(BluePiece124L));
                        basepane.BlueBoom(BluePieceIV124);
                    }

                    turn(BluePiece124L, BluePieceIV124);
                    basepane.BlueFlag = false;
                    if(basepane.blueCount > 0 && basepane.blueCount < 3) ep.setEp("It's still Player4's turn, Please roll the dice ");
                    else ep.setEp("It's Player1's turn");
                }
            }
            getBlueIV1234();
        });
        return BluePieceIV124;
    }
    public static ImageView getBlueIV134(){
        BluePieceIV134.setVisible(false);
        if(BluePiece1L != -2 && BluePiece3L != -2 && BluePiece4L != -2 ) {
            if (BluePieceIV1.isVisible() && BluePieceIV34.isVisible() &&BluePiece1L == BluePiece34L ) {
                BluePieceIV1.setVisible(false);
                BluePieceIV34.setVisible(false);
                BluePieceIV134.setFitHeight(30);
                BluePieceIV134.setFitWidth(30);
                BluePieceIV134.setLayoutX(BluePieceIV1.getLayoutX());
                BluePieceIV134.setLayoutY(BluePieceIV1.getLayoutY());
                BluePiece134L = BluePiece1L;
                BluePieceIV134.setVisible(true);
            }
            else if(BluePieceIV3.isVisible() && BluePieceIV14.isVisible() &&BluePiece3L == BluePiece14L){
                BluePieceIV3.setVisible(false);
                BluePieceIV14.setVisible(false);
                BluePieceIV134.setFitHeight(30);
                BluePieceIV134.setFitWidth(30);
                BluePieceIV134.setLayoutX(BluePieceIV3.getLayoutX());
                BluePieceIV134.setLayoutY(BluePieceIV3.getLayoutY());
                BluePiece134L = BluePiece3L;
                BluePieceIV134.setVisible(true);
            }
            else if(BluePieceIV4.isVisible() && BluePieceIV13.isVisible() &&BluePiece4L == BluePiece13L) {
                BluePieceIV4.setVisible(false);
                BluePieceIV13.setVisible(false);
                BluePieceIV134.setFitHeight(30);
                BluePieceIV134.setFitWidth(30);
                BluePieceIV134.setLayoutX(BluePieceIV4.getLayoutX());
                BluePieceIV134.setLayoutY(BluePieceIV4.getLayoutY());
                BluePiece134L = BluePiece4L;
                BluePieceIV134.setVisible(true);
            }
        }
        BluePieceIV134.setOnMouseClicked(event -> {
            if(basepane.blueFlagOpen) b134 ++;
            basepane.blueFlagOpen = false;
            if (basepane.BlueFlag) {
                BluePieceIV13.setVisible(false);
                BluePieceIV34.setVisible(false);
                BluePieceIV14.setVisible(false);
                if (BluePieceIV134.getLayoutX() == 425 && BluePieceIV134.getLayoutY() == 73) {
                    if (BlueNumber1 == 6 || BlueNumber2 == 6) {
                        BluePieceIV134.setLayoutX(375);
                        BluePieceIV134.setLayoutY(8);
                        basepane.BlueFlag = false;
                        if(basepane.blueCount > 0 && basepane.blueCount < 3) ep.setEp("It's still Player1's turn, Please roll the dice ");
                        else ep.setEp("It's Player2's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{

                    if(BluePiece134L + basepane.pace1 > 55 ){
                        BluePiece134L = 110 - basepane.pace1 - BluePiece134L;
                        BluePieceIV134.setLayoutX(getBlueLocationX(BluePiece134L));
                        BluePieceIV134.setLayoutY(getBlueLocationY(BluePiece134L));
                        basepane.BlueBoom(BluePieceIV134);

                    }else {
                        BluePiece134L += basepane.pace1;
                        BluePieceIV134.setLayoutX(getBlueLocationX(BluePiece134L));
                        BluePieceIV134.setLayoutY(getBlueLocationY(BluePiece134L));

                        basepane.BlueBoom(BluePieceIV134);

                    }
                    if (BluePiece134L == 55) {
                        BluePieceIV134.setVisible(false);
                        getWinIV1();
                        getWinIV4();
                        getWinIV3();
                        getWinWDIV();
                        winNumber += 3;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        BluePiece1L = -3;
                        BluePiece4L = -3;
                        BluePiece3L = -3;
                    }
                    if(BluePiece134L == 13){
                        BluePiece134L = 29;
                        BluePieceIV134.setLayoutX(getBlueLocationX(BluePiece134L));
                        BluePieceIV134.setLayoutY(getBlueLocationY(BluePiece134L));
                        basepane.BlueShortcut();
                        basepane.BlueBoom(BluePieceIV134);
                    }
                    else if(BluePiece134L == 17){
                        BluePiece134L = 33;
                        BluePieceIV134.setLayoutX(getBlueLocationX(BluePiece134L));
                        BluePieceIV134.setLayoutY(getBlueLocationY(BluePiece134L));
                        basepane.BlueShortcut();
                        basepane.BlueBoom(BluePieceIV134);
                    }
                    else if((BluePiece134L - 1) % 4 == 0 && BluePiece134L <= 49){
                        BluePiece134L += 4;
                        BluePieceIV134.setLayoutX(getBlueLocationX(BluePiece134L));
                        BluePieceIV134.setLayoutY(getBlueLocationY(BluePiece134L));
                        basepane.BlueBoom(BluePieceIV134);
                    }

                    turn(BluePiece134L, BluePieceIV134);
                    basepane.BlueFlag = false;
                    if(basepane.blueCount > 0 && basepane.blueCount < 3) ep.setEp("It's still Player4's turn, Please roll the dice ");
                    else ep.setEp("It's Player1's turn");
                }
            }
            getBlueIV1234();
        });
        return BluePieceIV134;
    }
    public static ImageView getBlueIV234(){
        BluePieceIV234.setVisible(false);
        if(BluePiece2L != -2 && BluePiece3L != -2 && BluePiece4L != -2 ) {
            if (BluePieceIV2.isVisible() && BluePieceIV34.isVisible() &&BluePiece2L == BluePiece34L ) {
                BluePieceIV2.setVisible(false);
                BluePieceIV34.setVisible(false);
                BluePieceIV234.setFitHeight(30);
                BluePieceIV234.setFitWidth(30);
                BluePieceIV234.setLayoutX(BluePieceIV2.getLayoutX());
                BluePieceIV234.setLayoutY(BluePieceIV2.getLayoutY());
                BluePiece234L = BluePiece2L;
                BluePieceIV234.setVisible(true);
            }
            else if(BluePieceIV3.isVisible() && BluePieceIV24.isVisible() &&BluePiece3L == BluePiece24L){
                BluePieceIV3.setVisible(false);
                BluePieceIV24.setVisible(false);
                BluePieceIV234.setFitHeight(30);
                BluePieceIV234.setFitWidth(30);
                BluePieceIV234.setLayoutX(BluePieceIV3.getLayoutX());
                BluePieceIV234.setLayoutY(BluePieceIV3.getLayoutY());
                BluePiece234L = BluePiece3L;
                BluePieceIV234.setVisible(true);
            }
            else if(BluePieceIV4.isVisible() && BluePieceIV23.isVisible() &&BluePiece4L == BluePiece23L) {
                BluePieceIV4.setVisible(false);
                BluePieceIV23.setVisible(false);
                BluePieceIV234.setFitHeight(30);
                BluePieceIV234.setFitWidth(30);
                BluePieceIV234.setLayoutX(BluePieceIV4.getLayoutX());
                BluePieceIV234.setLayoutY(BluePieceIV4.getLayoutY());
                BluePiece234L = BluePiece4L;
                BluePieceIV234.setVisible(true);
            }
        }
        BluePieceIV234.setOnMouseClicked(event -> {
            if(basepane.blueFlagOpen) b234 ++;
            basepane.blueFlagOpen = false;
            if (basepane.BlueFlag) {
                BluePieceIV23.setVisible(false);
                BluePieceIV24.setVisible(false);
                BluePieceIV34.setVisible(false);
                if (BluePieceIV234.getLayoutX() == 425 && BluePieceIV234.getLayoutY() == 73) {
                    if (BlueNumber1 == 6 || BlueNumber2 == 6) {
                        BluePieceIV234.setLayoutX(375);
                        BluePieceIV234.setLayoutY(8);
                        basepane.BlueFlag = false;
                        if(basepane.blueCount > 0 && basepane.blueCount < 3) ep.setEp("It's still Player3's turn, Please roll the dice ");
                        else ep.setEp("It's Player4's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{

                    if(BluePiece234L + basepane.pace1 > 55){
                        BluePiece234L = 110 - basepane.pace1 - BluePiece234L;
                        BluePieceIV234.setLayoutX(getBlueLocationX(BluePiece234L));
                        BluePieceIV234.setLayoutY(getBlueLocationY(BluePiece234L));
                        basepane.BlueBoom(BluePieceIV234);


                    }else {
                        BluePiece234L += basepane.pace1;
                        BluePieceIV234.setLayoutX(getBlueLocationX(BluePiece234L));
                        BluePieceIV234.setLayoutY(getBlueLocationY(BluePiece234L));
                        basepane.BlueBoom(BluePieceIV234);

                        
                    }
                    if (BluePiece234L== 55) {
                        BluePieceIV234.setVisible(false);
                        getWinIV4();
                        getWinIV2();
                        getWinIV3();
                        getWinWDIV();
                        winNumber += 3;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        BluePiece4L = -3;
                        BluePiece2L = -3;
                        BluePiece3L = -3;
                    }
                    if(BluePiece234L == 13){
                        BluePiece234L = 29;
                        BluePieceIV234.setLayoutX(getBlueLocationX(BluePiece234L));
                        BluePieceIV234.setLayoutY(getBlueLocationY(BluePiece234L));
                        basepane.BlueShortcut();
                        basepane.BlueBoom(BluePieceIV234);
                    }
                    else if(BluePiece234L == 17){
                        BluePiece234L = 33;
                        BluePieceIV234.setLayoutX(getBlueLocationX(BluePiece234L));
                        BluePieceIV234.setLayoutY(getBlueLocationY(BluePiece234L));
                        basepane.BlueShortcut();
                        basepane.BlueBoom(BluePieceIV234);
                    }
                    else if((BluePiece234L - 1) % 4 == 0 && BluePiece234L <= 49){
                        BluePiece234L += 4;
                        BluePieceIV234.setLayoutX(getBlueLocationX(BluePiece234L));
                        BluePieceIV234.setLayoutY(getBlueLocationY(BluePiece234L));
                        basepane.BlueBoom(BluePieceIV234);
                    }
                    turn(BluePiece234L, BluePieceIV234);
                    basepane.BlueFlag = false;
                    if(basepane.blueCount > 0 && basepane.blueCount < 3) ep.setEp("It's still Player4's turn, Please roll the dice ");
                    else ep.setEp("It's Player1's turn");
                }
            }
            getBlueIV1234();
        });
        return BluePieceIV234;
    }
    public static ImageView getBlueIV1234(){
        BluePieceIV1234.setVisible(false);
        if(BluePiece1L != -2 &&  BluePiece2L != -2 && BluePiece3L != -2 && BluePiece4L != -2 ) {
            if (BluePieceIV1.isVisible() && BluePieceIV234.isVisible() && BluePiece1L == BluePiece234L ) {
                BluePieceIV1.setVisible(false);
                BluePieceIV234.setVisible(false);
                BluePieceIV1234.setFitHeight(30);
                BluePieceIV1234.setFitWidth(30);
                BluePieceIV1234.setLayoutX(BluePieceIV1.getLayoutX());
                BluePieceIV1234.setLayoutY(BluePieceIV1.getLayoutY());
                BluePiece1234L = BluePiece1L;
                BluePieceIV1234.setVisible(true);
            }
            else if (BluePieceIV2.isVisible() && BluePieceIV134.isVisible() &&BluePiece2L == BluePiece134L ) {
                BluePieceIV2.setVisible(false);
                BluePieceIV134.setVisible(false);
                BluePieceIV1234.setFitHeight(30);
                BluePieceIV1234.setFitWidth(30);
                BluePieceIV1234.setLayoutX(BluePieceIV2.getLayoutX());
                BluePieceIV1234.setLayoutY(BluePieceIV2.getLayoutY());
                BluePiece1234L = BluePiece2L;
                BluePieceIV1234.setVisible(true);
            }
            else if(BluePieceIV3.isVisible() && BluePieceIV124.isVisible() &&BluePiece3L == BluePiece124L){
                BluePieceIV3.setVisible(false);
                BluePieceIV124.setVisible(false);
                BluePieceIV1234.setFitHeight(30);
                BluePieceIV1234.setFitWidth(30);
                BluePieceIV1234.setLayoutX(BluePieceIV3.getLayoutX());
                BluePieceIV1234.setLayoutY(BluePieceIV3.getLayoutY());
                BluePiece1234L = BluePiece3L;
                BluePieceIV1234.setVisible(true);
            }
            else if(BluePieceIV4.isVisible() && BluePieceIV123.isVisible() &&BluePiece4L == BluePiece123L) {
                BluePieceIV4.setVisible(false);
                BluePieceIV123.setVisible(false);
                BluePieceIV1234.setFitHeight(30);
                BluePieceIV1234.setFitWidth(30);
                BluePieceIV1234.setLayoutX(BluePieceIV4.getLayoutX());
                BluePieceIV1234.setLayoutY(BluePieceIV4.getLayoutY());
                BluePiece1234L = BluePiece4L;
                BluePieceIV1234.setVisible(true);
            }
        }
        BluePieceIV1234.setOnMouseClicked(event -> {
            System.out.println(winNumber);
            if(basepane.blueFlagOpen) b1234 ++;
            basepane.blueFlagOpen = false;
            if (basepane.BlueFlag) {
                BluePieceIV1.setVisible(false);
                BluePieceIV234.setVisible(false);
                BluePieceIV2.setVisible(false);
                BluePieceIV134.setVisible(false);
                BluePieceIV3.setVisible(false);
                BluePieceIV124.setVisible(false);
                BluePieceIV4.setVisible(false);
                BluePieceIV123.setVisible(false);
                BluePieceIV12.setVisible(false);
                BluePieceIV13.setVisible(false);
                BluePieceIV14.setVisible(false);
                BluePieceIV23.setVisible(false);
                BluePieceIV24.setVisible(false);
                BluePieceIV34.setVisible(false);
                if (BluePieceIV1234.getLayoutX() == 425 && BluePieceIV1234.getLayoutY() == 73) {
                    if (BlueNumber1 == 6 || BlueNumber2 == 6) {
                        BluePieceIV1234.setLayoutX(375);
                        BluePieceIV1234.setLayoutY(8);
                        basepane.BlueFlag = false;
                        if(basepane.blueCount > 0 && basepane.blueCount < 3) ep.setEp("It's still Player3's turn, Please roll the dice ");
                        else ep.setEp("It's Player4's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{
                    if(BluePiece1234L + basepane.pace1 > 55){
                        BluePiece1234L = 110 - basepane.pace1 - BluePiece1234L;
                        BluePieceIV1234.setLayoutX(getBlueLocationX(BluePiece1234L));
                        BluePieceIV1234.setLayoutY(getBlueLocationY(BluePiece1234L));
                        basepane.BlueBoom(BluePieceIV1234);
                    }else {
                        BluePiece1234L += basepane.pace1;
                        BluePieceIV1234.setLayoutX(getBlueLocationX(BluePiece1234L));
                        BluePieceIV1234.setLayoutY(getBlueLocationY(BluePiece1234L));
                        basepane.BlueBoom(BluePieceIV1234);
                    }
                    if (BluePiece1234L == 55) {
                        BluePieceIV1234.setVisible(false);
                        getWinIV1();
                        getWinIV2();
                        getWinIV3();
                        getWinIV4();
                        getWinWDIV();
                        winNumber = 4;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        BluePiece1L = -3;
                        BluePiece2L = -3;
                        BluePiece3L = -3;
                        BluePiece4L = -3;
                        new WinPane().display( "Congratulations!",String.format("Blue finished!And the ranking is %s","Winner!"));
                        basepane.cnt1 = 1;
                    }
                    if(BluePiece1234L == 13){
                        BluePiece1234L = 29;
                        BluePieceIV1234.setLayoutX(getBlueLocationX(BluePiece1234L));
                        BluePieceIV1234.setLayoutY(getBlueLocationY(BluePiece1234L));
                        basepane.BlueShortcut();
                        basepane.BlueBoom(BluePieceIV1234);
                    }
                    else if(BluePiece1234L == 17){
                        BluePiece1234L = 33;
                        BluePieceIV1234.setLayoutX(getBlueLocationX(BluePiece1234L));
                        BluePieceIV1234.setLayoutY(getBlueLocationY(BluePiece1234L));
                        basepane.BlueShortcut();
                        basepane.BlueBoom(BluePieceIV1234);
                    }
                    else if((BluePiece1234L - 1) % 4 == 0 && BluePiece1234L <= 49){
                        BluePiece1234L += 4;
                        BluePieceIV1234.setLayoutX(getBlueLocationX(BluePiece1234L));
                        BluePieceIV1234.setLayoutY(getBlueLocationY(BluePiece1234L));
                        basepane.BlueBoom(BluePieceIV1234);
                    }

                    turn(BluePiece1234L, BluePieceIV1234);
                    basepane.BlueFlag = false;
                    if(basepane.blueCount > 0 && basepane.blueCount < 3) ep.setEp("It's still Player4's turn, Please roll the dice ");
                    else ep.setEp("It's Player1's turn");
                }
            }
        });
        return BluePieceIV1234;
    }
    public static ImageView getWinWDIV(){
        WinWDIV.setLayoutX(259);
        WinWDIV.setLayoutY(247);
        WinWDIV.setFitHeight(37);
        WinWDIV.setFitWidth(70);
        WinWDIV.setRotate(-15);
        WinWDIV.setVisible(true);
        return WinWDIV;
    }
    public static ImageView getWinIV1(){
        WinIV1.setLayoutX(426);
        WinIV1.setLayoutY(426);
        WinIV1.setRotate(-15);
        WinIV1.setFitWidth(51);
        WinIV1.setFitHeight(41);
        WinIV1.setVisible(true);
        return WinIV1;
    }
    public static ImageView getWinIV2(){
        WinIV2.setLayoutX(478);
        WinIV2.setLayoutY(479);
        WinIV2.setRotate(-15);
        WinIV2.setFitWidth(51);
        WinIV2.setFitHeight(41);
        WinIV2.setVisible(true);
        return WinIV2;
    }
    public static ImageView getWinIV3(){
        WinIV3.setLayoutX(426);
        WinIV3.setLayoutY(478);
        WinIV3.setRotate(-15);
        WinIV3.setFitWidth(51);
        WinIV3.setFitHeight(41);
        WinIV3.setVisible(true);
        return WinIV3;
    }
    public static ImageView getWinIV4(){
        WinIV4.setLayoutX(479);
        WinIV4.setLayoutY(426);
        WinIV4.setRotate(-15);
        WinIV4.setFitWidth(51);
        WinIV4.setFitHeight(41);
        WinIV4.setVisible(true);
        return WinIV4;
    }
    public static Label getBlue(){
        Label blue = new Label("Blue");
        blue.setFont(Font.font("Courier New", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 14));
        blue.setTextFill(Color.RED);
        blue.setVisible(true);
        blue.setLayoutX(620);
        blue.setLayoutY(14);
        return blue;
    }
    public static int getBlueLocationX(int xuhao) {
        int[] array27 = {27, 154};
        int[] array28 = {65, 139};
        int[] array29 = {96, 139};
        int[] array30 = {127, 154};
        int[] array31 = {152, 130};
        int[] array32 = {142, 94};
        int[] array33 = {141, 65};
        int[] array34 = {152, 28};
        int[] array35 = {189, 14};
        int[] array36 = {219, 14};
        int[] array37 = {250, 14};
        int[] array38 = {281, 14};
        int[] array39 = {310, 14};
        int[] array40 = {347, 27};
        int[] array41 = {361, 66};
        int[] array42 = {357, 95};
        int[] array43 = {346, 130};
        int[] array44 = {373, 154};
        int[] array45 = {404, 145};
        int[] array46 = {435, 139};
        int[] array47 = {470, 154};
        int[] array48 = {485, 187};
        int[] array49 = {485, 218};
        int[] array24 = {14, 249};
        int[] array25 = {14, 218};
        int[] array26 = {14, 187};
        int[] array1 = {470, 342};
        int[] array2 = {437, 358};
        int[] array3 = {406, 358};
        int[] array4 = {372, 344};
        int[] array5 = {348, 371};
        int[] array6 = {357, 407};
        int[] array7 = {358, 436};
        int[] array8 = {347, 470};
        int[] array9 = {310, 486};
        int[] array10 = {281, 479};
        int[] array11 = {250, 486};
        int[] array12 = {219, 486};
        int[] array13 = {187, 479};
        int[] array14 = {152, 470};
        int[] array15 = {141, 436};
        int[] array16 = {141, 407};
        int[] array17 = {152, 373};
        int[] array18 = {127, 345};
        int[] array19 = {94, 358};
        int[] array20 = {64, 358};
        int[] array21 = {31, 345};
        int[] array22 = {14, 312};
        int[] array23 = {14, 280};
        //进入重点赛道
        int[] array50 = {483, 250};
        int[] array51 = {436, 250};
        int[] array52 = {406, 250};
        int[] array53 = {373, 250};
        int[] array54 = {345, 250};
        int[] array55 = {309, 250};
        int[] array56 = {278, 250};


        int[][] location = new int[56][2];
        location[0] = array1;
        location[1] = array2;
        location[2] = array3;
        location[3] = array4;
        location[4] = array5;
        location[5] = array6;
        location[6] = array7;
        location[7] = array8;
        location[8] = array9;
        location[9] = array10;
        location[10] = array11;
        location[11] = array12;
        location[12] = array13;
        location[13] = array14;
        location[14] = array15;
        location[15] = array16;
        location[16] = array17;
        location[17] = array18;
        location[18] = array19;
        location[19] = array20;
        location[20] = array21;
        location[21] = array22;
        location[22] = array23;
        location[23] = array24;
        location[24] = array25;
        location[25] = array26;
        location[26] = array27;
        location[27] = array28;
        location[28] = array29;
        location[29] = array30;
        location[30] = array31;
        location[31] = array32;
        location[32] = array33;
        location[33] = array34;
        location[34] = array35;
        location[35] = array36;
        location[36] = array37;
        location[37] = array38;
        location[38] = array39;
        location[39] = array40;
        location[40] = array41;
        location[41] = array42;
        location[42] = array43;
        location[43] = array44;
        location[44] = array45;
        location[45] = array46;
        location[46] = array47;
        location[47] = array48;
        location[48] = array49;
        location[49] = array50;
        location[50] = array51;
        location[51] = array52;
        location[52] = array53;
        location[53] = array54;
        location[54] = array55;
        location[55] = array56;
        return location[xuhao][0];
    }

    public static int getBlueLocationY(int xuhao) {
        int[] array27 = {27, 154};
        int[] array28 = {65, 139};
        int[] array29 = {96, 139};
        int[] array30 = {127, 154};
        int[] array31 = {152, 130};
        int[] array32 = {142, 94};
        int[] array33 = {141, 65};
        int[] array34 = {152, 28};
        int[] array35 = {189, 14};
        int[] array36 = {219, 14};
        int[] array37 = {250, 14};
        int[] array38 = {281, 14};
        int[] array39 = {310, 14};
        int[] array40 = {347, 27};
        int[] array41 = {361, 66};
        int[] array42 = {357, 95};
        int[] array43 = {346, 130};
        int[] array44 = {373, 154};
        int[] array45 = {404, 145};
        int[] array46 = {435, 139};
        int[] array47 = {470, 154};
        int[] array48 = {485, 187};
        int[] array49 = {485, 218};
        int[] array24 = {14, 249};
        int[] array25 = {14, 218};
        int[] array26 = {14, 187};
        int[] array1 = {470, 342};
        int[] array2 = {437, 358};
        int[] array3 = {406, 358};
        int[] array4 = {372, 344};
        int[] array5 = {348, 371};
        int[] array6 = {357, 407};
        int[] array7 = {358, 436};
        int[] array8 = {347, 470};
        int[] array9 = {310, 486};
        int[] array10 = {281, 479};
        int[] array11 = {250, 486};
        int[] array12 = {219, 486};
        int[] array13 = {187, 479};
        int[] array14 = {152, 470};
        int[] array15 = {141, 436};
        int[] array16 = {141, 407};
        int[] array17 = {152, 373};
        int[] array18 = {127, 345};
        int[] array19 = {94, 358};
        int[] array20 = {64, 358};
        int[] array21 = {31, 345};
        int[] array22 = {14, 312};
        int[] array23 = {14, 280};
        //进入重点赛道
        int[] array50 = {483, 250};
        int[] array51 = {436, 250};
        int[] array52 = {406, 250};
        int[] array53 = {373, 250};
        int[] array54 = {345, 250};
        int[] array55 = {309, 250};
        int[] array56 = {278, 250};


        int[][] location = new int[56][2];
        location[0] = array1;
        location[1] = array2;
        location[2] = array3;
        location[3] = array4;
        location[4] = array5;
        location[5] = array6;
        location[6] = array7;
        location[7] = array8;
        location[8] = array9;
        location[9] = array10;
        location[10] = array11;
        location[11] = array12;
        location[12] = array13;
        location[13] = array14;
        location[14] = array15;
        location[15] = array16;
        location[16] = array17;
        location[17] = array18;
        location[18] = array19;
        location[19] = array20;
        location[20] = array21;
        location[21] = array22;
        location[22] = array23;
        location[23] = array24;
        location[24] = array25;
        location[25] = array26;
        location[26] = array27;
        location[27] = array28;
        location[28] = array29;
        location[29] = array30;
        location[30] = array31;
        location[31] = array32;
        location[32] = array33;
        location[33] = array34;
        location[34] = array35;
        location[35] = array36;
        location[36] = array37;
        location[37] = array38;
        location[38] = array39;
        location[39] = array40;
        location[40] = array41;
        location[41] = array42;
        location[42] = array43;
        location[43] = array44;
        location[44] = array45;
        location[45] = array46;
        location[46] = array47;
        location[47] = array48;
        location[48] = array49;
        location[49] = array50;
        location[50] = array51;
        location[51] = array52;
        location[52] = array53;
        location[53] = array54;
        location[54] = array55;
        location[55] = array56;
        return location[xuhao][1];
    }


}

