package sample;

import com.sun.deploy.xml.XMLable;
import javafx.application.Application;
import javafx.stage.Modality;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TextArea;
import javafx.scene.control.ComboBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.layout.Pane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.*;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import java.sql.SQLOutput;
import java.util.ArrayList;
public class Red {
    static int r1 = 0;
    static int r2 = 0;
    static int r3 = 0;
    static int r4 = 0;
    static int r12 = 0;
    static int r13 = 0;
    static int r14 = 0;
    static int r23 = 0;
    static int r24 = 0;
    static int r34 = 0;
    static int r123 = 0;
    static int r124 = 0;
    static int r134 = 0;
    static int r234 = 0;
    static int r1234 = 0;
    static int RedPiece1L = -2;
    static int RedPiece2L = -2;
    static int RedPiece3L = -2;
    static int RedPiece4L = -2;
    static int RedPiece12L = -2;
    static int RedPiece13L = -2;
    static int RedPiece14L = -2;
    static int RedPiece23L = -2;
    static int RedPiece24L = -2;
    static int RedPiece34L = -2;
    static int RedPiece123L = -2;
    static int RedPiece124L = -2;
    static int RedPiece134L = -2;
    static int RedPiece234L = -2;
    static int RedPiece1234L = -2;
    static int RedNumber1 = 0;
    static int RedNumber2 = 0;
    static int winNumber = 0;
    static Image WinIM = new Image("WinIM.jpg");
    static Image WinWDIM = new Image("WinWD.png");
    static ImageView WinWDIV = new ImageView(WinWDIM);
    static ImageView WinIV1= new ImageView(WinIM);
    static ImageView WinIV2= new ImageView(WinIM);
    static ImageView WinIV3= new ImageView(WinIM);
    static ImageView WinIV4= new ImageView(WinIM);

    static Image RedPieceImg1 = new Image("RedPiece.png");
    static ImageView RedPieceIV1 = new ImageView(RedPieceImg1);
    static Image RedPieceImg2 = new Image("RedPiece.png");
    static ImageView RedPieceIV2 = new ImageView(RedPieceImg2);
    static Image RedPieceImg3 = new Image("RedPiece.png");
    static ImageView RedPieceIV3 = new ImageView(RedPieceImg3);
    static Image RedPieceImg4 = new Image("RedPiece.png");
    static ImageView RedPieceIV4 = new ImageView(RedPieceImg4);
    static Image RedIM12 = new Image("RTW.png");
    static Image RedIM123 = new Image("RTR.png");
    static Image RedIM1234 = new Image("RF.png");
    static ImageView RedPieceIV1234 = new ImageView(RedIM1234);
    static ImageView RedPieceIV123 = new ImageView(RedIM123);
    static ImageView RedPieceIV124 = new ImageView(RedIM123);
    static ImageView RedPieceIV134 = new ImageView(RedIM123);
    static ImageView RedPieceIV234 = new ImageView(RedIM123);
    static ImageView RedPieceIV12 = new ImageView(RedIM12);
    static ImageView RedPieceIV13 = new ImageView(RedIM12);
    static ImageView RedPieceIV14 = new ImageView(RedIM12);
    static ImageView RedPieceIV23 = new ImageView(RedIM12);
    static ImageView RedPieceIV24 = new ImageView(RedIM12);
    static ImageView RedPieceIV34 = new ImageView(RedIM12);
    public static void turn(int x,ImageView IV){
        if(x >= 0 && x < 3){
            IV.setRotate(-90);
        }
        if(x >= 3 && x < 7){
            IV.setRotate(180);
        }
        if(x >= 7 && x <=12){
            IV.setRotate(-90);
        }
        if(x >= 13 && x <= 16){
            IV.setRotate(0);
        }
        if(x >= 17 && x <= 19){
            IV.setRotate(-90);
        }
        if(x >= 20 && x <= 25){
            IV.setRotate(0);
        }
        if(x >= 26 && x <= 29){
            IV.setRotate(90);
        }
        if(x >= 30 && x <= 32){
            IV.setRotate(0);
        }
        if(x >= 33 && x<= 39){
            IV.setRotate(90);
        }
        if(x >= 40 && x <= 42){
            IV.setRotate(180);
        }
        if(x >= 43 && x <=45){
            IV.setRotate(90);
        }
        if(x >= 46 && x <= 49){
            IV.setRotate(180);
        }
        if(x >= 50 ){
            IV.setRotate(-90);
        }
    }
    public static ImageView getRedPiece1() {
        RedPieceIV1.setLayoutX(75);
        RedPieceIV1.setLayoutY(74);
        RedPieceIV1.setFitHeight(30);
        RedPieceIV1.setFitWidth(30);
        RedPieceIV1.setRotate(90);
        RedPieceIV1.setOnMouseClicked(event -> {
            if(basepane.RedFlagOpen== true) r1 ++;
            basepane.RedFlagOpen = false;
            if (basepane.RedFlag) {
                if (RedPieceIV1.getLayoutX() == 75 && RedPieceIV1.getLayoutY() == 74) {
                    if (RedNumber1 == 6 || RedNumber2 == 6) {
                        RedPieceIV1.setLayoutX(14);
                        RedPieceIV1.setLayoutY(124);
                        RedPiece1L = -1;
                        basepane.RedFlag = false;
                        ep.setEp("It's Player3's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{
                    if(RedPiece1L + basepane.pace1 > 55){
                        RedPiece1L = 110 - basepane.pace1 - RedPiece1L;
                        RedPieceIV1.setLayoutX(getRedLocationX(RedPiece1L));
                        RedPieceIV1.setLayoutY(getRedLocationY(RedPiece1L));
                        basepane.RedBoom(RedPieceIV1);
                    }else {
                        RedPiece1L += basepane.pace1;
                        RedPieceIV1.setLayoutX(getRedLocationX(RedPiece1L));
                        RedPieceIV1.setLayoutY(getRedLocationY(RedPiece1L));
                        basepane.RedBoom(RedPieceIV1);
                    }
                    if(RedPiece1L == 55){
                        RedPieceIV1.setVisible(false);
                        getWinIV1();
                        getWinWDIV();
                        winNumber ++ ;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        RedPiece1L = -3;
                    }
                    if(RedPiece1L == 13){
                        RedPiece1L = 29;
                        RedPieceIV1.setLayoutX(getRedLocationX(RedPiece1L));
                        RedPieceIV1.setLayoutY(getRedLocationY(RedPiece1L));
                        basepane.RedBoom(RedPieceIV1);
                        basepane.RedShortcut();
                    }
                    else if(RedPiece1L == 17){
                        RedPiece1L = 33;
                        RedPieceIV1.setLayoutX(getRedLocationX(RedPiece1L));
                        RedPieceIV1.setLayoutY(getRedLocationY(RedPiece1L));
                        basepane.RedBoom(RedPieceIV1);
                        basepane.RedShortcut();
                    }
                    else if((RedPiece1L - 1) % 4 == 0 && RedPiece1L <= 49){
                        RedPiece1L += 4;
                        RedPieceIV1.setLayoutX(getRedLocationX(RedPiece1L));
                        RedPieceIV1.setLayoutY(getRedLocationY(RedPiece1L));
                        basepane.RedBoom(RedPieceIV1);
                    }
                    turn(RedPiece1L, RedPieceIV1);
                    basepane.RedFlag = false;
                    if(basepane.RedCount > 0 && basepane.RedCount < 3) ep.setEp("It's still Player2's turn, Please roll the dice ");
                    else ep.setEp("It's Player3's turn");
                }
            }
            getRedIV12();
            getRedIV13();
            getRedIV14();
            getRedIV123();
            getRedIV124();
            getRedIV134();
            getRedIV1234();
        });
        return RedPieceIV1;
    }


    public static ImageView getRedPiece3() {
        RedPieceIV3.setLayoutX(21);
        RedPieceIV3.setLayoutY(74);
        RedPieceIV3.setFitHeight(30);
        RedPieceIV3.setFitWidth(30);
        RedPieceIV3.setRotate(90);
        RedPieceIV3.setOnMouseClicked(event -> {
            if(basepane.RedFlagOpen== true) r3 ++;
            basepane.RedFlagOpen = false;
            if (basepane.RedFlag) {
                if (RedPieceIV3.getLayoutX() == 21 && RedPieceIV3.getLayoutY() == 74) {
                    if (RedNumber1 == 6 || RedNumber2 == 6) {
                        RedPieceIV3.setLayoutX(14);
                        RedPieceIV3.setLayoutY(124);
                        RedPiece3L = -1;
                        basepane.RedFlag = false;
                        if(basepane.RedCount > 0 && basepane.RedCount < 3) ep.setEp("It's still Player2's turn, Please roll the dice ");
                        else ep.setEp("It's Player3's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{
                    if(RedPiece3L + basepane.pace1 > 55){
                        RedPiece3L = 110 - basepane.pace1 - RedPiece3L;
                        RedPieceIV3.setLayoutX(getRedLocationX(RedPiece3L));
                        RedPieceIV3.setLayoutY(getRedLocationY(RedPiece3L));
                        basepane.RedBoom(RedPieceIV3);
                    }else {
                        RedPiece3L += basepane.pace1;
                        RedPieceIV3.setLayoutX(getRedLocationX(RedPiece3L));
                        RedPieceIV3.setLayoutY(getRedLocationY(RedPiece3L));
                        basepane.RedBoom(RedPieceIV3);
                    }
                    if(RedPiece3L == 55){
                        RedPieceIV3.setVisible(false);
                        getWinIV3();
                        getWinWDIV();
                        winNumber ++ ;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        RedPiece3L = -3;
                    }
                    if(RedPiece3L == 13){
                        RedPiece3L = 29;
                        RedPieceIV3.setLayoutX(getRedLocationX(RedPiece3L));
                        RedPieceIV3.setLayoutY(getRedLocationY(RedPiece3L));
                        basepane.RedShortcut();
                        basepane.RedBoom(RedPieceIV3);
                    }
                    else if(RedPiece3L == 17){
                        RedPiece3L = 33;
                        RedPieceIV3.setLayoutX(getRedLocationX(RedPiece3L));
                        RedPieceIV3.setLayoutY(getRedLocationY(RedPiece3L));
                        basepane.RedBoom(RedPieceIV3);
                        basepane.RedShortcut();
                    }
                    else if((RedPiece3L - 1) % 4 == 0 && RedPiece3L <= 49){
                        RedPiece3L += 4;
                        RedPieceIV3.setLayoutX(getRedLocationX(RedPiece3L));
                        RedPieceIV3.setLayoutY(getRedLocationY(RedPiece3L));
                        basepane.RedBoom(RedPieceIV3);
                    }
                    turn(RedPiece3L, RedPieceIV3);
                    basepane.RedFlag = false;
                    if(basepane.RedCount > 0 && basepane.RedCount < 3) ep.setEp("It's still Player2's turn, Please roll the dice ");
                    else ep.setEp("It's Player3's turn");
                }
            }
            getRedIV13();
            getRedIV23();
            getRedIV34();
            getRedIV123();
            getRedIV134();
            getRedIV234();
            getRedIV1234();
        });
        return RedPieceIV3;
    }

    public static ImageView getRedPiece2() {
        RedPieceIV2.setLayoutX(23);
        RedPieceIV2.setLayoutY(21);
        RedPieceIV2.setFitHeight(30);
        RedPieceIV2.setFitWidth(30);
        RedPieceIV2.setRotate(90);
        RedPieceIV2.setOnMouseClicked(event -> {
            if(basepane.RedFlagOpen== true) r2 ++;
            basepane.RedFlagOpen = false;
            if (basepane.RedFlag) {
                if (RedPieceIV2.getLayoutX() == 23 && RedPieceIV2.getLayoutY() == 21) {
                    if (RedNumber1 == 6 || RedNumber2 == 6) {

                        RedPieceIV2.setLayoutX(14);
                        RedPieceIV2.setLayoutY(124);
                        RedPiece2L = -1;
                        basepane.RedFlag = false;
                        if(basepane.RedCount > 0 && basepane.RedCount < 3) ep.setEp("It's still Player2's turn, Please roll the dice ");
                        else ep.setEp("It's Player3's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{
                    if(RedPiece2L + basepane.pace1 > 55){
                        RedPiece2L =  110 - basepane.pace1 - RedPiece2L;
                        RedPieceIV2.setLayoutX(getRedLocationX(RedPiece2L));
                        RedPieceIV2.setLayoutY(getRedLocationY(RedPiece2L));
                        basepane.RedBoom(RedPieceIV2);
                    }else {
                        RedPiece2L += basepane.pace1;
                        RedPieceIV2.setLayoutX(getRedLocationX(RedPiece2L));
                        RedPieceIV2.setLayoutY(getRedLocationY(RedPiece2L));
                        basepane.RedBoom(RedPieceIV2);
                    }
                    if(RedPiece2L == 55){
                        RedPieceIV2.setVisible(false);
                        getWinIV2();
                        getWinWDIV();
                        winNumber ++ ;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        RedPiece2L = -3;
                    }
                    if(RedPiece2L == 13){
                        RedPiece2L = 29;
                        RedPieceIV2.setLayoutX(getRedLocationX(RedPiece2L));
                        RedPieceIV2.setLayoutY(getRedLocationY(RedPiece2L));
                        basepane.RedBoom(RedPieceIV2);
                       basepane.RedShortcut();
                    }
                    else if(RedPiece2L == 17){
                        RedPiece2L = 33;
                        RedPieceIV2.setLayoutX(getRedLocationX(RedPiece2L));
                        RedPieceIV2.setLayoutY(getRedLocationY(RedPiece2L));
                        basepane.RedBoom(RedPieceIV2);
                      basepane.RedShortcut();
                    }
                    else if((RedPiece2L - 1) % 4 == 0 && RedPiece2L <= 49){
                        RedPiece2L += 4;
                        RedPieceIV2.setLayoutX(getRedLocationX(RedPiece2L));
                        RedPieceIV2.setLayoutY(getRedLocationY(RedPiece2L));
                        basepane.RedBoom(RedPieceIV2);
                    }
                   turn(RedPiece2L, RedPieceIV2);
                    basepane.RedFlag = false;
                    if(basepane.RedCount > 0 && basepane.RedCount < 3) ep.setEp("It's still Player2's turn, Please roll the dice ");
                    else ep.setEp("It's Player3's turn");
                }
            }
            getRedIV12();
            getRedIV23();
            getRedIV24();
            getRedIV123();
            getRedIV124();
            getRedIV234();
            getRedIV1234();
        });
        return RedPieceIV2;
    }

    public static ImageView getRedPiece4() {
        RedPieceIV4.setLayoutX(75);
        RedPieceIV4.setLayoutY(22);
        RedPieceIV4.setFitHeight(30);
        RedPieceIV4.setFitWidth(30);
        RedPieceIV4.setRotate(90);
        RedPieceIV4.setOnMouseClicked(event -> {
            if(basepane.RedFlagOpen== true) r4 ++;
            basepane.RedFlagOpen = false;
            if (basepane.RedFlag) {
                if (RedPieceIV4.getLayoutX() == 75 && RedPieceIV4.getLayoutY() == 22) {
                    if (RedNumber1 == 6 || RedNumber2 == 6) {

                        RedPieceIV4.setLayoutX(14);
                        RedPieceIV4.setLayoutY(124);
                        RedPiece4L = -1;
                        basepane.RedFlag = false;
                        if(basepane.RedCount > 0 && basepane.RedCount < 3) ep.setEp("It's still Player2's turn, Please roll the dice ");
                        else ep.setEp("It's Player3's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{
                    if(RedPiece4L + basepane.pace1 > 55){
                        RedPiece4L = 110 - basepane.pace1 - RedPiece4L;
                        RedPieceIV4.setLayoutX(getRedLocationX(RedPiece4L));
                        RedPieceIV4.setLayoutY(getRedLocationY(RedPiece4L));
                        basepane.RedBoom(RedPieceIV4);
                    }else {
                        RedPiece4L += basepane.pace1;
                        RedPieceIV4.setLayoutX(getRedLocationX(RedPiece4L));
                        RedPieceIV4.setLayoutY(getRedLocationY(RedPiece4L));
                        basepane.RedBoom(RedPieceIV4);
                    }
                    if(RedPiece4L == 55){
                        RedPieceIV4.setVisible(false);
                        getWinIV4();
                        getWinWDIV();
                        winNumber ++ ;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        RedPiece4L = -3;
                    }
                    if(RedPiece4L == 13){
                        RedPiece4L = 29;
                        RedPieceIV4.setLayoutX(getRedLocationX(RedPiece4L));
                        RedPieceIV4.setLayoutY(getRedLocationY(RedPiece4L));
                       basepane.RedShortcut();
                        basepane.RedBoom(RedPieceIV4);
                    }
                    else if(RedPiece4L == 17){
                        RedPiece4L = 33;
                        RedPieceIV4.setLayoutX(getRedLocationX(RedPiece4L));
                        RedPieceIV4.setLayoutY(getRedLocationY(RedPiece4L));
                        basepane.RedBoom(RedPieceIV4);
                       basepane.RedShortcut();
                    }
                    else if((RedPiece4L - 1) % 4 == 0 && RedPiece4L <= 49){
                        RedPiece4L += 4;
                        RedPieceIV4.setLayoutX(getRedLocationX(RedPiece4L));
                        RedPieceIV4.setLayoutY(getRedLocationY(RedPiece4L));
                        basepane.RedBoom(RedPieceIV4);
                    }
                   basepane.RedShortcut();
                    basepane.RedFlag = false;
                    if(basepane.RedCount > 0 && basepane.RedCount < 3) ep.setEp("It's still Player2's turn, Please roll the dice ");
                    else ep.setEp("It's Player3's turn");
                }
            }
            getRedIV14();
            getRedIV24();
            getRedIV34();
            getRedIV124();
            getRedIV134();
            getRedIV234();
            getRedIV1234();
        });
        return RedPieceIV4;
    }
    public static ImageView getRedIV12(){
        RedPieceIV12.setVisible(false);
        if(RedPiece1L != -2 ) {
            if (RedPieceIV1.isVisible() && RedPieceIV2.isVisible() &&RedPiece1L == RedPiece2L) {
                RedPieceIV1.setVisible(false);
                RedPieceIV2.setVisible(false);
                RedPieceIV12.setFitHeight(30);
                RedPieceIV12.setFitWidth(30);
                RedPieceIV12.setLayoutX(RedPieceIV1.getLayoutX());
                RedPieceIV12.setLayoutY(RedPieceIV1.getLayoutY());
                RedPiece12L = RedPiece1L;
                RedPieceIV12.setVisible(true);
            }
        }
        RedPieceIV12.setOnMouseClicked(event -> {
            if(basepane.RedFlagOpen) r12 ++;
            basepane.RedFlagOpen = false;
            if (basepane.RedFlag) {
                if(RedPiece12L + basepane.pace1 > 55 ){
                    RedPiece12L = 110 - basepane.pace1 - RedPiece12L;
                    RedPieceIV12.setLayoutX(getRedLocationX(RedPiece12L));
                    RedPieceIV12.setLayoutY(getRedLocationY(RedPiece12L));
                    basepane.RedBoom(RedPieceIV12);
                }
                else {
                    RedPiece12L += basepane.pace1;
                    RedPieceIV12.setLayoutX(getRedLocationX(RedPiece12L));
                    RedPieceIV12.setLayoutY(getRedLocationY(RedPiece12L));
                    basepane.RedBoom(RedPieceIV12);
                }
                if (RedPiece12L == 55) {
                    RedPieceIV12.setVisible(false);
                    getWinIV1();
                    getWinIV2();
                    getWinWDIV();
                    winNumber += 2;
                    if(winNumber == 4){
                        new WinPane().display("ConGratulations!","Green is winner!");
                    }
                    RedPiece1L = -3;
                    RedPiece2L = -3;
                }
                if(RedPiece12L == 13){
                    RedPiece12L = 29;
                    RedPieceIV12.setLayoutX(getRedLocationX(RedPiece12L));
                    RedPieceIV12.setLayoutY(getRedLocationY(RedPiece12L));
                    basepane.RedShortcut();
                    basepane.RedBoom(RedPieceIV12);
                }
                else if(RedPiece12L == 17){
                    RedPiece12L = 33;
                    RedPieceIV12.setLayoutX(getRedLocationX(RedPiece12L));
                    RedPieceIV12.setLayoutY(getRedLocationY(RedPiece12L));
                    basepane.RedBoom(RedPieceIV12);
                    basepane.RedShortcut();
                }
                else if((RedPiece12L - 1) % 4 == 0 && RedPiece12L <= 49){
                    RedPiece12L += 4;
                    RedPieceIV12.setLayoutX(getRedLocationX(RedPiece12L));
                    RedPieceIV12.setLayoutY(getRedLocationY(RedPiece12L));
                    basepane.RedBoom(RedPieceIV12);
                }
                turn(RedPiece12L, RedPieceIV12);
                basepane.RedFlag = false;
                if(basepane.RedCount > 0 && basepane.RedCount < 3) ep.setEp("It's still Player2's turn, Please roll the dice ");
                else ep.setEp("It's Player3's turn");

            }
            getRedIV123();
            getRedIV124();
            getRedIV1234();
        });
        return RedPieceIV12;
    }
    public static ImageView getRedIV13(){
        RedPieceIV13.setVisible(false);
        if(RedPiece1L != -2 ) {
            if (RedPieceIV1.isVisible() && RedPieceIV3.isVisible() &&RedPiece1L == RedPiece3L) {
                RedPieceIV1.setVisible(false);
                RedPieceIV3.setVisible(false);
                RedPieceIV13.setFitHeight(30);
                RedPieceIV13.setFitWidth(30);
                RedPieceIV13.setLayoutX(RedPieceIV1.getLayoutX());
                RedPieceIV13.setLayoutY(RedPieceIV1.getLayoutY());
                RedPiece13L = RedPiece1L;
                RedPieceIV13.setVisible(true);
            }
        }
        RedPieceIV13.setOnMouseClicked(event -> {
            if(basepane.RedFlagOpen) r13 ++;
            basepane.RedFlagOpen = false;
            if (basepane.RedFlag) {
                if (RedPieceIV13.getLayoutX() == 425 && RedPieceIV13.getLayoutY() == 73) {
                    if (RedNumber1 == 6 || RedNumber2 == 6) {
                        RedPieceIV13.setLayoutX(375);
                        RedPieceIV13.setLayoutY(8);
                        basepane.RedFlag = false;
                        if(basepane.RedCount > 0 && basepane.RedCount < 3) ep.setEp("It's still Player2's turn, Please roll the dice ");
                        else ep.setEp("It's Player3's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{

                    if(RedPiece13L + basepane.pace1 > 55 ){
                        RedPiece13L = 110 - basepane.pace1 - RedPiece13L;
                        RedPieceIV13.setLayoutX(getRedLocationX(RedPiece13L));
                        RedPieceIV13.setLayoutY(getRedLocationY(RedPiece13L));
                        basepane.RedBoom(RedPieceIV13);
                    }
                    else {
                        RedPiece13L += basepane.pace1;
                        RedPieceIV13.setLayoutX(getRedLocationX(RedPiece13L));
                        RedPieceIV13.setLayoutY(getRedLocationY(RedPiece13L));
                        basepane.RedBoom(RedPieceIV13);
                    }
                    if (RedPiece13L == 55) {
                        RedPieceIV13.setVisible(false);
                        getWinIV1();
                        getWinIV3();
                        getWinWDIV();
                        winNumber += 2;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        RedPiece1L = -3;
                        RedPiece3L = -3;
                    }
                    if(RedPiece13L == 13){
                        RedPiece13L = 29;
                        RedPieceIV13.setLayoutX(getRedLocationX(RedPiece13L));
                        RedPieceIV13.setLayoutY(getRedLocationY(RedPiece13L));
                        basepane.RedBoom(RedPieceIV13);
                       basepane.RedShortcut();
                    }
                    else if(RedPiece13L == 17){
                        RedPiece13L = 33;
                        RedPieceIV13.setLayoutX(getRedLocationX(RedPiece13L));
                        RedPieceIV13.setLayoutY(getRedLocationY(RedPiece13L));
                        basepane.RedBoom(RedPieceIV13);
                        basepane.RedShortcut();
                    }
                    else if((RedPiece13L - 1) % 4 == 0 && RedPiece13L <= 49){
                        RedPiece13L += 4;
                        RedPieceIV13.setLayoutX(getRedLocationX(RedPiece13L));
                        RedPieceIV13.setLayoutY(getRedLocationY(RedPiece13L));
                        basepane.RedBoom(RedPieceIV13);
                    }

                    turn(RedPiece13L, RedPieceIV13);
                    basepane.RedFlag = false;
                    if(basepane.RedCount > 0 && basepane.RedCount < 3) ep.setEp("It's still Player2's turn, Please roll the dice ");
                    else ep.setEp("It's Player3's turn");
                }
            }
            getRedIV123();
            getRedIV134();
            getRedIV1234();
        });
        return RedPieceIV13;
    }
    public static ImageView getRedIV14(){
        RedPieceIV14.setVisible(false);
        if(RedPiece1L != -2 ) {
            if (RedPieceIV1.isVisible() && RedPieceIV4.isVisible() &&RedPiece1L == RedPiece4L) {
                RedPieceIV1.setVisible(false);
                RedPieceIV4.setVisible(false);
                RedPieceIV14.setFitHeight(30);
                RedPieceIV14.setFitWidth(30);
                RedPieceIV14.setLayoutX(RedPieceIV1.getLayoutX());
                RedPieceIV14.setLayoutY(RedPieceIV1.getLayoutY());
                RedPiece14L = RedPiece1L;
                RedPieceIV14.setVisible(true);
            }
        }
        RedPieceIV14.setOnMouseClicked(event -> {
            if(basepane.RedFlagOpen) r14 ++;
            basepane.RedFlagOpen = false;
            if (basepane.RedFlag) {
                if (RedPieceIV14.getLayoutX() == 425 && RedPieceIV14.getLayoutY() == 73) {
                    if (RedNumber1 == 6 || RedNumber2 == 6) {
                        RedPieceIV14.setLayoutX(375);
                        RedPieceIV14.setLayoutY(8);
                        basepane.RedFlag = false;
                        if(basepane.RedCount > 0 && basepane.RedCount < 3) ep.setEp("It's still Player2's turn, Please roll the dice ");
                        else ep.setEp("It's Player3's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{
                    if(RedPiece14L + basepane.pace1 > 55){
                        RedPiece14L = 110 - basepane.pace1 - RedPiece14L;
                        RedPieceIV14.setLayoutX(getRedLocationX(RedPiece14L));
                        RedPieceIV14.setLayoutY(getRedLocationY(RedPiece14L));
                        basepane.RedBoom(RedPieceIV14);

                    }

                    else {
                        RedPiece14L += basepane.pace1;
                        RedPieceIV14.setLayoutX(getRedLocationX(RedPiece14L));
                        RedPieceIV14.setLayoutY(getRedLocationY(RedPiece14L));
                        basepane.RedBoom(RedPieceIV14);
                    }
                    if (RedPiece14L == 55) {
                        RedPieceIV14.setVisible(false);
                        getWinIV1();
                        getWinIV4();
                        getWinWDIV();
                        winNumber += 2;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        RedPiece1L = -3;
                        RedPiece4L = -3;
                    }
                    if(RedPiece14L == 13){
                        RedPiece14L = 29;
                        RedPieceIV14.setLayoutX(getRedLocationX(RedPiece14L));
                        RedPieceIV14.setLayoutY(getRedLocationY(RedPiece14L));
                        basepane.RedShortcut();
                        basepane.RedBoom(RedPieceIV14);
                    }
                    else if(RedPiece14L == 17){
                        RedPiece14L = 33;
                        RedPieceIV14.setLayoutX(getRedLocationX(RedPiece14L));
                        RedPieceIV14.setLayoutY(getRedLocationY(RedPiece14L));
                       basepane.RedShortcut();
                        basepane.RedBoom(RedPieceIV14);
                    }
                    else if((RedPiece14L - 1) % 4 == 0 && RedPiece14L <= 49){
                        RedPiece14L += 4;
                        RedPieceIV14.setLayoutX(getRedLocationX(RedPiece14L));
                        RedPieceIV14.setLayoutY(getRedLocationY(RedPiece14L));
                        basepane.RedBoom(RedPieceIV14);
                    }

                    turn(RedPiece14L, RedPieceIV14);
                    basepane.RedFlag = false;
                    if(basepane.RedCount > 0 && basepane.RedCount < 3) ep.setEp("It's still Player2's turn, Please roll the dice ");
                    else ep.setEp("It's Player3's turn");
                }
            }
            getRedIV124();
            getRedIV134();
            getRedIV1234();
        });
        return RedPieceIV14;
    }
    public static ImageView getRedIV23(){
        RedPieceIV23.setVisible(false);
        if(RedPiece2L != -2 ) {
            if (RedPieceIV2.isVisible() && RedPieceIV3.isVisible() &&RedPiece2L == RedPiece3L) {
                RedPieceIV2.setVisible(false);
                RedPieceIV3.setVisible(false);
                RedPieceIV23.setFitHeight(30);
                RedPieceIV23.setFitWidth(30);
                RedPieceIV23.setLayoutX(RedPieceIV2.getLayoutX());
                RedPieceIV23.setLayoutY(RedPieceIV2.getLayoutY());
                RedPiece23L = RedPiece2L;
                RedPieceIV23.setVisible(true);
            }
        }
        RedPieceIV23.setOnMouseClicked(event -> {
            if(basepane.RedFlagOpen) r23 ++;
            basepane.RedFlagOpen = false;
            if (basepane.RedFlag) {
                if (RedPieceIV23.getLayoutX() == 425 && RedPieceIV23.getLayoutY() == 73) {
                    if (RedNumber1 == 6 || RedNumber2 == 6) {
                        RedPieceIV23.setLayoutX(375);
                        RedPieceIV23.setLayoutY(8);
                        basepane.RedFlag = false;
                        if(basepane.RedCount > 0 && basepane.RedCount < 3) ep.setEp("It's still Player1's turn, Please roll the dice ");
                        else ep.setEp("It's Player2's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{

                    if(RedPiece23L + basepane.pace1 > 55){
                        RedPiece23L = 110 - basepane.pace1 - RedPiece23L;
                        RedPieceIV23.setLayoutX(getRedLocationX(RedPiece23L));
                        RedPieceIV23.setLayoutY(getRedLocationY(RedPiece23L));
                        basepane.RedBoom(RedPieceIV23);
                    }
                    else {
                        RedPiece23L += basepane.pace1;
                        RedPieceIV23.setLayoutX(getRedLocationX(RedPiece23L));
                        RedPieceIV23.setLayoutY(getRedLocationY(RedPiece23L));
                        basepane.RedBoom(RedPieceIV23);
                    }
                    if (RedPiece23L == 55) {
                        RedPieceIV23.setVisible(false);
                        getWinIV3();
                        getWinIV2();
                        getWinWDIV();
                        winNumber += 2;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        RedPiece3L = -3;
                        RedPiece2L = -3;
                    }
                    if(RedPiece23L == 13){//
                        RedPiece23L = 29;
                        RedPieceIV23.setLayoutX(getRedLocationX(RedPiece23L));
                        RedPieceIV23.setLayoutY(getRedLocationY(RedPiece23L));
                       basepane.RedShortcut();
                        basepane.RedBoom(RedPieceIV23);
                    }
                    else if(RedPiece23L == 17){
                        RedPiece23L = 33;
                        RedPieceIV23.setLayoutX(getRedLocationX(RedPiece23L));
                        RedPieceIV23.setLayoutY(getRedLocationY(RedPiece23L));
                        basepane.RedShortcut();
                        basepane.RedBoom(RedPieceIV23);
                    }
                    else if((RedPiece23L - 1) % 4 == 0 && RedPiece23L <= 49){
                        RedPiece23L += 4;
                        RedPieceIV23.setLayoutX(getRedLocationX(RedPiece23L));
                        RedPieceIV23.setLayoutY(getRedLocationY(RedPiece23L));
                        basepane.RedBoom(RedPieceIV23);
                    }

                   turn(RedPiece23L, RedPieceIV23);
                    basepane.RedFlag = false;
                    if(basepane.RedCount > 0 && basepane.RedCount < 3) ep.setEp("It's still Player2's turn, Please roll the dice ");
                    else ep.setEp("It's Player3's turn");
                }
            }
            getRedIV123();
            getRedIV234();
            getRedIV1234();
        });
        return RedPieceIV23;
    }
    public static ImageView getRedIV24(){
        RedPieceIV24.setVisible(false);
        if(RedPiece2L != -2 ) {
            if (RedPieceIV2.isVisible() && RedPieceIV4.isVisible() &&RedPiece2L == RedPiece4L) {
                RedPieceIV2.setVisible(false);
                RedPieceIV4.setVisible(false);
                RedPieceIV24.setFitHeight(30);
                RedPieceIV24.setFitWidth(30);
                RedPieceIV24.setLayoutX(RedPieceIV2.getLayoutX());
                RedPieceIV24.setLayoutY(RedPieceIV2.getLayoutY());
                RedPiece24L = RedPiece2L;
                RedPieceIV24.setVisible(true);
            }
        }
        RedPieceIV24.setOnMouseClicked(event -> {
            if(basepane.RedFlagOpen) r24 ++;
            basepane.RedFlagOpen = false;
            if (basepane.RedFlag) {
                if (RedPieceIV24.getLayoutX() == 425 && RedPieceIV24.getLayoutY() == 73) {
                    if (RedNumber1 == 6 || RedNumber2 == 6) {
                        RedPieceIV24.setLayoutX(375);
                        RedPieceIV24.setLayoutY(8);
                        basepane.RedFlag = false;
                        if(basepane.RedCount > 0 && basepane.RedCount < 3) ep.setEp("It's still Player2's turn, Please roll the dice ");
                        else ep.setEp("It's Player3's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{

                    if(RedPiece24L + basepane.pace1 > 55 ){
                        RedPiece24L = 110 - basepane.pace1 - RedPiece24L;
                        RedPieceIV24.setLayoutX(getRedLocationX(RedPiece24L));
                        RedPieceIV24.setLayoutY(getRedLocationY(RedPiece24L));
                        basepane.RedBoom(RedPieceIV24);
                    }

                    else{
                        RedPiece24L += basepane.pace1;
                        RedPieceIV24.setLayoutX(getRedLocationX(RedPiece24L));
                        RedPieceIV24.setLayoutY(getRedLocationY(RedPiece24L));
                        basepane.RedBoom(RedPieceIV24);
                    }
                    if (RedPiece24L == 55) {
                        RedPieceIV24.setVisible(false);
                        getWinIV4();
                        getWinIV2();
                        getWinWDIV();
                        winNumber += 2;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        RedPiece4L = -3;
                        RedPiece2L = -3;
                    }
                    if(RedPiece24L == 13){//
                        RedPiece24L = 29;
                        RedPieceIV24.setLayoutX(getRedLocationX(RedPiece24L));
                        RedPieceIV24.setLayoutY(getRedLocationY(RedPiece24L));
                        basepane.RedShortcut();
                        basepane.RedBoom(RedPieceIV24);
                    }
                    else if(RedPiece24L == 17){
                        RedPiece24L = 33;
                        RedPieceIV24.setLayoutX(getRedLocationX(RedPiece24L));
                        RedPieceIV24.setLayoutY(getRedLocationY(RedPiece24L));
                        basepane.RedShortcut();
                        basepane.RedBoom(RedPieceIV24);
                    }
                    else if((RedPiece24L - 1) % 4 == 0 && RedPiece24L <= 49){
                        RedPiece24L += 4;
                        RedPieceIV24.setLayoutX(getRedLocationX(RedPiece24L));
                        RedPieceIV24.setLayoutY(getRedLocationY(RedPiece24L));
                        basepane.RedBoom(RedPieceIV24);
                    }
                   turn(RedPiece24L, RedPieceIV24);
                    basepane.RedFlag = false;
                    if(basepane.RedCount > 0 && basepane.RedCount < 3) ep.setEp("It's still Player2's turn, Please roll the dice ");
                    else ep.setEp("It's Player3's turn");
                }
            }
            getRedIV124();
            getRedIV234();
            getRedIV1234();
        });
        return RedPieceIV24;
    }
    public static ImageView getRedIV34(){
        RedPieceIV34.setVisible(false);
        if(RedPiece3L != -2 ) {
            if (RedPieceIV3.isVisible() && RedPieceIV4.isVisible() &&RedPiece3L == RedPiece4L) {
                RedPieceIV4.setVisible(false);
                RedPieceIV3.setVisible(false);
                RedPieceIV34.setFitHeight(30);
                RedPieceIV34.setFitWidth(30);
                RedPieceIV34.setLayoutX(RedPieceIV3.getLayoutX());
                RedPieceIV34.setLayoutY(RedPieceIV3.getLayoutY());
                RedPiece34L = RedPiece3L;
                RedPieceIV34.setVisible(true);
            }
        }
        RedPieceIV34.setOnMouseClicked(event -> {
            if(basepane.RedFlagOpen) r34 ++;
            basepane.RedFlagOpen = false;
            if (basepane.RedFlag) {

                if (RedPieceIV34.getLayoutX() == 425 && RedPieceIV34.getLayoutY() == 73) {
                    if (RedNumber1 == 6 || RedNumber2 == 6) {
                        RedPieceIV34.setLayoutX(375);
                        RedPieceIV34.setLayoutY(8);
                        basepane.RedFlag = false;
                        if(basepane.RedCount > 0 && basepane.RedCount < 3) ep.setEp("It's still Player1's turn, Please roll the dice ");
                        else ep.setEp("It's Player2's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{

                    if(RedPiece34L + basepane.pace1 > 55 ){
                        RedPiece34L = 110 - basepane.pace1 - RedPiece34L;
                        RedPieceIV34.setLayoutX(getRedLocationX(RedPiece34L));
                        RedPieceIV34.setLayoutY(getRedLocationY(RedPiece34L));
                        basepane.RedBoom(RedPieceIV34);
                    }
                    else {
                        RedPiece34L += basepane.pace1;
                        RedPieceIV34.setLayoutX(getRedLocationX(RedPiece34L));
                        RedPieceIV34.setLayoutY(getRedLocationY(RedPiece34L));
                        basepane.RedBoom(RedPieceIV34);
                    }
                    if (RedPiece34L == 55) {
                        RedPieceIV34.setVisible(false);
                        getWinIV3();
                        getWinIV4();
                        getWinWDIV();
                        winNumber += 2;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        RedPiece4L = -3;
                        RedPiece3L = -3;
                    }
                    if(RedPiece34L == 13){
                        RedPiece34L = 29;
                        RedPieceIV34.setLayoutX(getRedLocationX(RedPiece34L));
                        RedPieceIV34.setLayoutY(getRedLocationY(RedPiece34L));
                        basepane.RedShortcut();
                        basepane.RedBoom(RedPieceIV34);
                    }
                    else if(RedPiece34L == 17){
                        RedPiece34L = 33;
                        RedPieceIV34.setLayoutX(getRedLocationX(RedPiece34L));
                        RedPieceIV34.setLayoutY(getRedLocationY(RedPiece34L));
                       basepane.RedShortcut();
                        basepane.RedBoom(RedPieceIV34);
                    }
                    else if((RedPiece34L - 1) % 4 == 0 && RedPiece34L <= 49){
                        RedPiece34L += 4;
                        RedPieceIV34.setLayoutX(getRedLocationX(RedPiece34L));
                        RedPieceIV34.setLayoutY(getRedLocationY(RedPiece34L));
                        basepane.RedBoom(RedPieceIV34);
                    }
                    turn(RedPiece34L, RedPieceIV34);
                    basepane.RedFlag = false;
                    if(basepane.RedCount > 0 && basepane.RedCount < 3) ep.setEp("It's still Player2's turn, Please roll the dice ");
                    else ep.setEp("It's Player3's turn");
                }
            }
            getRedIV134();
            getRedIV234();
            getRedIV1234();
        });
        return RedPieceIV34;
    }
    public static ImageView getRedIV123(){
        RedPieceIV123.setVisible(false);
        if(RedPiece1L != -2 && RedPiece2L != -2 && RedPiece3L != -2 ) {
            if (RedPieceIV1.isVisible() && RedPieceIV23.isVisible() &&RedPiece1L == RedPiece23L ) {
                RedPieceIV1.setVisible(false);
                RedPieceIV23.setVisible(false);
                RedPieceIV123.setFitHeight(30);
                RedPieceIV123.setFitWidth(30);
                RedPieceIV123.setLayoutX(RedPieceIV1.getLayoutX());
                RedPieceIV123.setLayoutY(RedPieceIV1.getLayoutY());
                RedPiece123L = RedPiece1L;
                RedPieceIV123.setVisible(true);
            }
            else if(RedPieceIV2.isVisible() && RedPieceIV13.isVisible() &&RedPiece2L == RedPiece13L){
                RedPieceIV2.setVisible(false);
                RedPieceIV13.setVisible(false);
                RedPieceIV123.setFitHeight(30);
                RedPieceIV123.setFitWidth(30);
                RedPieceIV123.setLayoutX(RedPieceIV2.getLayoutX());
                RedPieceIV123.setLayoutY(RedPieceIV2.getLayoutY());
                RedPiece123L = RedPiece2L;
                RedPieceIV123.setVisible(true);
            }
            else if(RedPieceIV3.isVisible() && RedPieceIV12.isVisible() &&RedPiece3L == RedPiece12L) {
                RedPieceIV3.setVisible(false);
                RedPieceIV12.setVisible(false);
                RedPieceIV123.setFitHeight(30);
                RedPieceIV123.setFitWidth(30);
                RedPieceIV123.setLayoutX(RedPieceIV3.getLayoutX());
                RedPieceIV123.setLayoutY(RedPieceIV3.getLayoutY());
                RedPiece123L = RedPiece3L;
                RedPieceIV123.setVisible(true);
            }
        }
        RedPieceIV123.setOnMouseClicked(event -> {
            if(basepane.RedFlagOpen) r123 ++;
            basepane.RedFlagOpen = false;
            if (basepane.RedFlag) {
                RedPieceIV12.setVisible(false);
                RedPieceIV13.setVisible(false);
                RedPieceIV23.setVisible(false);
                if (RedPieceIV123.getLayoutX() == 425 && RedPieceIV123.getLayoutY() == 73) {
                    if (RedNumber1 == 6 || RedNumber2 == 6) {
                        RedPieceIV123.setLayoutX(375);
                        RedPieceIV123.setLayoutY(8);
                        basepane.RedFlag = false;
                        if(basepane.RedCount > 0 && basepane.RedCount < 3) ep.setEp("It's still Player1's turn, Please roll the dice ");
                        else ep.setEp("It's Player2's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{

                    if(RedPiece123L + basepane.pace1 > 55 ){
                        RedPiece123L = 110 - basepane.pace1 - RedPiece123L;
                        RedPieceIV123.setLayoutX(getRedLocationX(RedPiece123L));
                        RedPieceIV123.setLayoutY(getRedLocationY(RedPiece123L));
                        basepane.RedShortcut();
                        basepane.RedBoom(RedPieceIV123);
                    }
                    else {
                        RedPiece123L += basepane.pace1;
                        RedPieceIV123.setLayoutX(getRedLocationX(RedPiece123L));
                        RedPieceIV123.setLayoutY(getRedLocationY(RedPiece123L));
                        basepane.RedShortcut();
                        basepane.RedBoom(RedPieceIV123);
                    }
                    if (RedPiece123L == 55) {
                        RedPieceIV123.setVisible(false);
                        getWinIV1();
                        getWinIV2();
                        getWinIV3();
                        getWinWDIV();
                        winNumber += 3;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        RedPiece1L = -3;
                        RedPiece2L = -3;
                        RedPiece3L = -3;
                    }
                    if(RedPiece123L == 13){
                        RedPiece123L = 29;
                        RedPieceIV123.setLayoutX(getRedLocationX(RedPiece123L));
                        RedPieceIV123.setLayoutY(getRedLocationY(RedPiece123L));
                        basepane.RedShortcut();
                        basepane.RedBoom(RedPieceIV123);
                    }
                    else if(RedPiece123L == 17){
                        RedPiece123L = 33;
                        RedPieceIV123.setLayoutX(getRedLocationX(RedPiece123L));
                        RedPieceIV123.setLayoutY(getRedLocationY(RedPiece123L));
                        basepane.RedShortcut();
                        basepane.RedBoom(RedPieceIV123);
                    }
                    else if((RedPiece123L - 1) % 4 == 0 && RedPiece123L <= 49){
                        RedPiece123L += 4;
                        RedPieceIV123.setLayoutX(getRedLocationX(RedPiece123L));
                        RedPieceIV123.setLayoutY(getRedLocationY(RedPiece123L));
                        basepane.RedBoom(RedPieceIV123);
                    }

                    turn(RedPiece123L, RedPieceIV123);
                    basepane.RedFlag = false;
                    if(basepane.RedCount > 0 && basepane.RedCount < 3) ep.setEp("It's still Player2's turn, Please roll the dice ");
                    else ep.setEp("It's Player3's turn");
                }
            }
            getRedIV1234();
        });
        return RedPieceIV123;
    }
    public static ImageView getRedIV124(){
        RedPieceIV124.setVisible(false);
        if(RedPiece1L != -2 && RedPiece2L != -2 && RedPiece4L != -2 ) {
            if (RedPieceIV1.isVisible() && RedPieceIV24.isVisible() &&RedPiece1L == RedPiece24L ) {
                RedPieceIV1.setVisible(false);
                RedPieceIV24.setVisible(false);
                RedPieceIV124.setFitHeight(30);
                RedPieceIV124.setFitWidth(30);
                RedPieceIV124.setLayoutX(RedPieceIV1.getLayoutX());
                RedPieceIV124.setLayoutY(RedPieceIV1.getLayoutY());
                RedPiece124L = RedPiece1L;
                RedPieceIV124.setVisible(true);
            }
            else if(RedPieceIV2.isVisible() && RedPieceIV14.isVisible() &&RedPiece2L == RedPiece14L){
                RedPieceIV2.setVisible(false);
                RedPieceIV14.setVisible(false);
                RedPieceIV124.setFitHeight(30);
                RedPieceIV124.setFitWidth(30);
                RedPieceIV124.setLayoutX(RedPieceIV2.getLayoutX());
                RedPieceIV124.setLayoutY(RedPieceIV2.getLayoutY());
                RedPiece124L = RedPiece2L;
                RedPieceIV124.setVisible(true);
            }
            else if(RedPieceIV4.isVisible() && RedPieceIV12.isVisible() &&RedPiece4L == RedPiece12L) {
                RedPieceIV4.setVisible(false);
                RedPieceIV12.setVisible(false);
                RedPieceIV124.setFitHeight(30);
                RedPieceIV124.setFitWidth(30);
                RedPieceIV124.setLayoutX(RedPieceIV4.getLayoutX());
                RedPieceIV124.setLayoutY(RedPieceIV4.getLayoutY());
                RedPiece124L = RedPiece4L;
                RedPieceIV124.setVisible(true);
            }
        }
        RedPieceIV124.setOnMouseClicked(event -> {
            if(basepane.RedFlagOpen) r124 ++;
            basepane.RedFlagOpen = false;
            if (basepane.RedFlag) {
                RedPieceIV12.setVisible(false);
                RedPieceIV14.setVisible(false);
                RedPieceIV24.setVisible(false);
                if (RedPieceIV124.getLayoutX() == 425 && RedPieceIV124.getLayoutY() == 73) {
                    if (RedNumber1 == 6 || RedNumber2 == 6) {
                        RedPieceIV124.setLayoutX(375);
                        RedPieceIV124.setLayoutY(8);
                        basepane.RedFlag = false;
                        if(basepane.RedCount > 0 && basepane.RedCount < 3) ep.setEp("It's still Player2's turn, Please roll the dice ");
                        else ep.setEp("It's Player3's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{

                    if(RedPiece124L + basepane.pace1 > 55){
                        RedPiece124L = 110 - basepane.pace1 - RedPiece124L;
                        RedPieceIV124.setLayoutX(getRedLocationX(RedPiece124L));
                        RedPieceIV124.setLayoutY(getRedLocationY(RedPiece124L));
                        basepane.RedBoom(RedPieceIV124);
                    }else {
                        RedPiece124L += basepane.pace1;
                        RedPieceIV124.setLayoutX(getRedLocationX(RedPiece124L));
                        RedPieceIV124.setLayoutY(getRedLocationY(RedPiece124L));
                        basepane.RedBoom(RedPieceIV124);

                    }
                    if (RedPiece124L == 55) {
                        RedPieceIV124.setVisible(false);
                        getWinIV1();
                        getWinIV2();
                        getWinIV4();
                        getWinWDIV();
                        winNumber += 3;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        RedPiece1L = -3;
                        RedPiece2L = -3;
                        RedPiece4L = -3;
                    }
                    if(RedPiece124L == 13){
                        RedPiece124L = 29;
                        RedPieceIV124.setLayoutX(getRedLocationX(RedPiece124L));
                        RedPieceIV124.setLayoutY(getRedLocationY(RedPiece124L));
                        turn(RedPiece124L, RedPieceIV124);
                        basepane.RedBoom(RedPieceIV124);
                    }
                    else if(RedPiece124L == 17){
                        RedPiece124L = 33;
                        RedPieceIV124.setLayoutX(getRedLocationX(RedPiece124L));
                        RedPieceIV124.setLayoutY(getRedLocationY(RedPiece124L));
                       basepane.RedShortcut();
                        basepane.RedBoom(RedPieceIV124);
                    }
                    else if((RedPiece124L - 1) % 4 == 0 && RedPiece124L <= 49){
                        RedPiece124L += 4;
                        RedPieceIV124.setLayoutX(getRedLocationX(RedPiece124L));
                        RedPieceIV124.setLayoutY(getRedLocationY(RedPiece124L));
                        basepane.RedBoom(RedPieceIV124);
                    }

                    turn(RedPiece124L, RedPieceIV124);
                    basepane.RedFlag = false;
                    if(basepane.RedCount > 0 && basepane.RedCount < 3) ep.setEp("It's still Player2's turn, Please roll the dice ");
                    else ep.setEp("It's Player3's turn");
                }
            }
            getRedIV1234();
        });
        return RedPieceIV124;
    }
    public static ImageView getRedIV134(){
        RedPieceIV134.setVisible(false);
        if(RedPiece1L != -2 && RedPiece3L != -2 && RedPiece4L != -2 ) {
            if (RedPieceIV1.isVisible() && RedPieceIV34.isVisible() &&RedPiece1L == RedPiece34L ) {
                RedPieceIV1.setVisible(false);
                RedPieceIV34.setVisible(false);
                RedPieceIV134.setFitHeight(30);
                RedPieceIV134.setFitWidth(30);
                RedPieceIV134.setLayoutX(RedPieceIV1.getLayoutX());
                RedPieceIV134.setLayoutY(RedPieceIV1.getLayoutY());
                RedPiece134L = RedPiece1L;
                RedPieceIV134.setVisible(true);
            }
            else if(RedPieceIV3.isVisible() && RedPieceIV14.isVisible() &&RedPiece3L == RedPiece14L){
                RedPieceIV3.setVisible(false);
                RedPieceIV14.setVisible(false);
                RedPieceIV134.setFitHeight(30);
                RedPieceIV134.setFitWidth(30);
                RedPieceIV134.setLayoutX(RedPieceIV3.getLayoutX());
                RedPieceIV134.setLayoutY(RedPieceIV3.getLayoutY());
                RedPiece134L = RedPiece3L;
                RedPieceIV134.setVisible(true);
            }
            else if(RedPieceIV4.isVisible() && RedPieceIV13.isVisible() &&RedPiece4L == RedPiece13L) {
                RedPieceIV4.setVisible(false);
                RedPieceIV13.setVisible(false);
                RedPieceIV134.setFitHeight(30);
                RedPieceIV134.setFitWidth(30);
                RedPieceIV134.setLayoutX(RedPieceIV4.getLayoutX());
                RedPieceIV134.setLayoutY(RedPieceIV4.getLayoutY());
                RedPiece134L = RedPiece4L;
                RedPieceIV134.setVisible(true);
            }
        }
        RedPieceIV134.setOnMouseClicked(event -> {
            if(basepane.RedFlagOpen) r134 ++;
            basepane.RedFlagOpen = false;
            if (basepane.RedFlag) {
                RedPieceIV13.setVisible(false);
                RedPieceIV34.setVisible(false);
                RedPieceIV14.setVisible(false);
                if (RedPieceIV134.getLayoutX() == 425 && RedPieceIV134.getLayoutY() == 73) {
                    if (RedNumber1 == 6 || RedNumber2 == 6) {
                        RedPieceIV134.setLayoutX(375);
                        RedPieceIV134.setLayoutY(8);
                        basepane.RedFlag = false;
                        if(basepane.RedCount > 0 && basepane.RedCount < 3) ep.setEp("It's still Player1's turn, Please roll the dice ");
                        else ep.setEp("It's Player2's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{

                    if(RedPiece134L + basepane.pace1 > 55 ){
                        RedPiece134L = 110 - basepane.pace1 - RedPiece134L;
                        RedPieceIV134.setLayoutX(getRedLocationX(RedPiece134L));
                        RedPieceIV134.setLayoutY(getRedLocationY(RedPiece134L));
                        basepane.RedBoom(RedPieceIV134);

                    }else {
                        RedPiece134L += basepane.pace1;
                        RedPieceIV134.setLayoutX(getRedLocationX(RedPiece134L));
                        RedPieceIV134.setLayoutY(getRedLocationY(RedPiece134L));
                        basepane.RedBoom(RedPieceIV134);

                    }
                    if (RedPiece134L == 55) {
                        RedPieceIV134.setVisible(false);
                        getWinIV1();
                        getWinIV4();
                        getWinIV3();
                        getWinWDIV();
                        winNumber += 3;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        RedPiece1L = -3;
                        RedPiece4L = -3;
                        RedPiece3L = -3;
                    }
                    if(RedPiece134L == 13){
                        RedPiece134L = 29;
                        RedPieceIV134.setLayoutX(getRedLocationX(RedPiece134L));
                        RedPieceIV134.setLayoutY(getRedLocationY(RedPiece134L));
                        basepane.RedShortcut();
                        basepane.RedBoom(RedPieceIV134);
                    }
                    else if(RedPiece134L == 17){
                        RedPiece134L = 33;
                        RedPieceIV134.setLayoutX(getRedLocationX(RedPiece134L));
                        RedPieceIV134.setLayoutY(getRedLocationY(RedPiece134L));
                        basepane.RedShortcut();
                        basepane.RedBoom(RedPieceIV134);
                    }
                    else if((RedPiece134L - 1) % 4 == 0 && RedPiece134L <= 49){
                        RedPiece134L += 4;
                        RedPieceIV134.setLayoutX(getRedLocationX(RedPiece134L));
                        RedPieceIV134.setLayoutY(getRedLocationY(RedPiece134L));
                        basepane.RedBoom(RedPieceIV234);
                    }

                   turn(RedPiece134L, RedPieceIV134);
                    basepane.RedFlag = false;
                    if(basepane.RedCount > 0 && basepane.RedCount < 3) ep.setEp("It's still Player2's turn, Please roll the dice ");
                    else ep.setEp("It's Player3's turn");
                }
            }
            getRedIV1234();
        });
        return RedPieceIV134;
    }
    public static ImageView getRedIV234(){
        RedPieceIV234.setVisible(false);
        if(RedPiece2L != -2 && RedPiece3L != -2 && RedPiece4L != -2 ) {
            if (RedPieceIV2.isVisible() && RedPieceIV34.isVisible() &&RedPiece2L == RedPiece34L ) {
                RedPieceIV2.setVisible(false);
                RedPieceIV34.setVisible(false);
                RedPieceIV234.setFitHeight(30);
                RedPieceIV234.setFitWidth(30);
                RedPieceIV234.setLayoutX(RedPieceIV2.getLayoutX());
                RedPieceIV234.setLayoutY(RedPieceIV2.getLayoutY());
                RedPiece234L = RedPiece2L;
                RedPieceIV234.setVisible(true);
            }
            else if(RedPieceIV3.isVisible() && RedPieceIV24.isVisible() &&RedPiece3L == RedPiece24L){
                RedPieceIV3.setVisible(false);
                RedPieceIV24.setVisible(false);
                RedPieceIV234.setFitHeight(30);
                RedPieceIV234.setFitWidth(30);
                RedPieceIV234.setLayoutX(RedPieceIV3.getLayoutX());
                RedPieceIV234.setLayoutY(RedPieceIV3.getLayoutY());
                RedPiece234L = RedPiece3L;
                RedPieceIV234.setVisible(true);
            }
            else if(RedPieceIV4.isVisible() && RedPieceIV23.isVisible() &&RedPiece4L == RedPiece23L) {
                RedPieceIV4.setVisible(false);
                RedPieceIV23.setVisible(false);
                RedPieceIV234.setFitHeight(30);
                RedPieceIV234.setFitWidth(30);
                RedPieceIV234.setLayoutX(RedPieceIV4.getLayoutX());
                RedPieceIV234.setLayoutY(RedPieceIV4.getLayoutY());
                RedPiece234L = RedPiece4L;
                RedPieceIV234.setVisible(true);
            }
        }
        RedPieceIV234.setOnMouseClicked(event -> {
            if(basepane.RedFlagOpen) r234 ++;
            basepane.RedFlagOpen = false;
            if (basepane.RedFlag) {
                RedPieceIV23.setVisible(false);
                RedPieceIV24.setVisible(false);
                RedPieceIV34.setVisible(false);
                if (RedPieceIV234.getLayoutX() == 425 && RedPieceIV234.getLayoutY() == 73) {
                    if (RedNumber1 == 6 || RedNumber2 == 6) {
                        RedPieceIV234.setLayoutX(375);
                        RedPieceIV234.setLayoutY(8);
                        basepane.RedFlag = false;
                        if(basepane.RedCount > 0 && basepane.RedCount < 3) ep.setEp("It's still Player1's turn, Please roll the dice ");
                        else ep.setEp("It's Player2's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{

                    if(RedPiece234L + basepane.pace1 > 55){
                        RedPiece234L = 110 - basepane.pace1 - RedPiece234L;
                        RedPieceIV234.setLayoutX(getRedLocationX(RedPiece234L));
                        RedPieceIV234.setLayoutY(getRedLocationY(RedPiece234L));
                        basepane.RedBoom(RedPieceIV234);


                    }else {
                        RedPiece234L += basepane.pace1;
                        RedPieceIV234.setLayoutX(getRedLocationX(RedPiece234L));
                        RedPieceIV234.setLayoutY(getRedLocationY(RedPiece234L));
                        basepane.RedBoom(RedPieceIV234);

                    }
                    if (RedPiece234L== 55) {
                        RedPieceIV234.setVisible(false);
                        getWinIV4();
                        getWinIV2();
                        getWinIV3();
                        getWinWDIV();
                        winNumber += 3;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        RedPiece4L = -3;
                        RedPiece2L = -3;
                        RedPiece3L = -3;
                    }
                    if(RedPiece234L == 13){
                        RedPiece234L = 29;
                        RedPieceIV234.setLayoutX(getRedLocationX(RedPiece234L));
                        RedPieceIV234.setLayoutY(getRedLocationY(RedPiece234L));
                        basepane.RedShortcut();
                        basepane.RedBoom(RedPieceIV234);
                    }
                    else if(RedPiece234L == 17){
                        RedPiece234L = 33;
                        RedPieceIV234.setLayoutX(getRedLocationX(RedPiece234L));
                        RedPieceIV234.setLayoutY(getRedLocationY(RedPiece234L));
                        basepane.RedShortcut();
                        basepane.RedBoom(RedPieceIV234);
                    }
                    else if((RedPiece234L - 1) % 4 == 0 && RedPiece234L <= 49){
                        RedPiece234L += 4;
                        RedPieceIV234.setLayoutX(getRedLocationX(RedPiece234L));
                        RedPieceIV234.setLayoutY(getRedLocationY(RedPiece234L));
                        basepane.RedBoom(RedPieceIV234);
                    }

                   turn(RedPiece234L,RedPieceIV234);
                    basepane.RedFlag = false;
                    if(basepane.RedCount > 0 && basepane.RedCount < 3) ep.setEp("It's still Player2's turn, Please roll the dice ");
                    else ep.setEp("It's Player3's turn");
                }
            }
            getRedIV1234();
        });
        return RedPieceIV234;
    }
    public static ImageView getRedIV1234(){
        RedPieceIV1234.setVisible(false);
        if(RedPiece1L != -2 &&  RedPiece2L != -2 && RedPiece3L != -2 && RedPiece4L != -2 ) {
            if (RedPieceIV1.isVisible() && RedPieceIV234.isVisible() && RedPiece1L == RedPiece234L ) {
                RedPieceIV1.setVisible(false);
                RedPieceIV234.setVisible(false);
                RedPieceIV1234.setFitHeight(30);
                RedPieceIV1234.setFitWidth(30);
                RedPieceIV1234.setLayoutX(RedPieceIV1.getLayoutX());
                RedPieceIV1234.setLayoutY(RedPieceIV1.getLayoutY());
                RedPiece1234L = RedPiece1L;
                RedPieceIV1234.setVisible(true);
            }
            else if (RedPieceIV2.isVisible() && RedPieceIV134.isVisible() &&RedPiece2L == RedPiece134L ) {
                RedPieceIV2.setVisible(false);
                RedPieceIV134.setVisible(false);
                RedPieceIV1234.setFitHeight(30);
                RedPieceIV1234.setFitWidth(30);
                RedPieceIV1234.setLayoutX(RedPieceIV2.getLayoutX());
                RedPieceIV1234.setLayoutY(RedPieceIV2.getLayoutY());
                RedPiece1234L = RedPiece2L;
                RedPieceIV1234.setVisible(true);
            }
            else if(RedPieceIV3.isVisible() && RedPieceIV124.isVisible() &&RedPiece3L == RedPiece124L){
                RedPieceIV3.setVisible(false);
                RedPieceIV124.setVisible(false);
                RedPieceIV1234.setFitHeight(30);
                RedPieceIV1234.setFitWidth(30);
                RedPieceIV1234.setLayoutX(RedPieceIV3.getLayoutX());
                RedPieceIV1234.setLayoutY(RedPieceIV3.getLayoutY());
                RedPiece1234L = RedPiece3L;
                RedPieceIV1234.setVisible(true);
            }
            else if(RedPieceIV4.isVisible() && RedPieceIV123.isVisible() &&RedPiece4L == RedPiece123L) {
                RedPieceIV4.setVisible(false);
                RedPieceIV123.setVisible(false);
                RedPieceIV1234.setFitHeight(30);
                RedPieceIV1234.setFitWidth(30);
                RedPieceIV1234.setLayoutX(RedPieceIV4.getLayoutX());
                RedPieceIV1234.setLayoutY(RedPieceIV4.getLayoutY());
                RedPiece1234L = RedPiece4L;
                RedPieceIV1234.setVisible(true);
            }
        }
        RedPieceIV1234.setOnMouseClicked(event -> {
            if(basepane.RedFlagOpen) r1234 ++;
            basepane.RedFlagOpen = false;
            if (basepane.RedFlag) {
                RedPieceIV1.setVisible(false);
                RedPieceIV234.setVisible(false);
                RedPieceIV2.setVisible(false);
                RedPieceIV134.setVisible(false);
                RedPieceIV3.setVisible(false);
                RedPieceIV124.setVisible(false);
                RedPieceIV4.setVisible(false);
                RedPieceIV123.setVisible(false);
                RedPieceIV12.setVisible(false);
                RedPieceIV13.setVisible(false);
                RedPieceIV14.setVisible(false);
                RedPieceIV23.setVisible(false);
                RedPieceIV24.setVisible(false);
                RedPieceIV34.setVisible(false);
                if (RedPieceIV1234.getLayoutX() == 425 && RedPieceIV1234.getLayoutY() == 73) {
                    if (RedNumber1 == 6 || RedNumber2 == 6) {
                        RedPieceIV1234.setLayoutX(375);
                        RedPieceIV1234.setLayoutY(8);
                        basepane.RedFlag = false;
                        if(basepane.RedCount > 0 && basepane.RedCount < 3) ep.setEp("It's still Player1's turn, Please roll the dice ");
                        else ep.setEp("It's Player2's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{
                    if(RedPiece1234L + basepane.pace1 > 55){
                        RedPiece1234L = 110 - basepane.pace1 - RedPiece1234L;
                        RedPieceIV1234.setLayoutX(getRedLocationX(RedPiece1234L));
                        RedPieceIV1234.setLayoutY(getRedLocationY(RedPiece1234L));
                        basepane.RedBoom(RedPieceIV1234);
                    }else {
                        RedPiece1234L += basepane.pace1;
                        RedPieceIV1234.setLayoutX(getRedLocationX(RedPiece1234L));
                        RedPieceIV1234.setLayoutY(getRedLocationY(RedPiece1234L));
                        basepane.RedBoom(RedPieceIV1234);
                    }
                    if (RedPiece1234L == 55) {
                        RedPieceIV1234.setVisible(false);
                        getWinIV1();
                        getWinIV2();
                        getWinIV3();
                        getWinIV4();
                        getWinWDIV();
                        winNumber += 4;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        RedPiece1L = -3;
                        RedPiece2L = -3;
                        RedPiece3L = -3;
                        RedPiece4L = -3;
                    }
                    if(RedPiece1234L == 13){
                        RedPiece1234L = 29;
                        RedPieceIV1234.setLayoutX(getRedLocationX(RedPiece1234L));
                        RedPieceIV1234.setLayoutY(getRedLocationY(RedPiece1234L));
                        basepane.RedShortcut();
                        basepane.RedBoom(RedPieceIV1234);
                    }
                    else if(RedPiece1234L == 17){
                        RedPiece1234L = 33;
                        RedPieceIV1234.setLayoutX(getRedLocationX(RedPiece1234L));
                        RedPieceIV1234.setLayoutY(getRedLocationY(RedPiece1234L));
                        basepane.RedShortcut();
                        basepane.RedBoom(RedPieceIV1234);
                    }
                    else if((RedPiece1234L - 1) % 4 == 0 && RedPiece1234L <= 49){
                        RedPiece1234L += 4;
                        RedPieceIV1234.setLayoutX(getRedLocationX(RedPiece1234L));
                        RedPieceIV1234.setLayoutY(getRedLocationY(RedPiece1234L));
                        basepane.RedBoom(RedPieceIV1234);
                    }

                    if(RedPiece1234L >= 0 && RedPiece1234L < 3){
                        RedPieceIV1234.setRotate(-90);
                    }
                    if(RedPiece1234L >= 3 && RedPiece1234L < 7){
                        RedPieceIV1234.setRotate(180);
                    }
                    if(RedPiece1234L >= 7 && RedPiece1234L <=12){
                        RedPieceIV1234.setRotate(-90);
                    }
                    if(RedPiece1234L >= 13 && RedPiece1234L <= 16){
                        RedPieceIV1234.setRotate(0);
                    }
                    if(RedPiece1234L >= 17 && RedPiece1234L <= 19){
                        RedPieceIV1234.setRotate(-90);
                    }
                    if(RedPiece1234L >= 20 && RedPiece1234L <= 25){
                        RedPieceIV1234.setRotate(0);
                    }
                    if(RedPiece1234L >= 26 && RedPiece1234L <= 29){
                        RedPieceIV1234.setRotate(90);
                    }
                    if(RedPiece1234L >= 30 && RedPiece1234L <= 32){
                        RedPieceIV1234.setRotate(0);
                    }
                    if(RedPiece1234L >= 33 && RedPiece1234L<= 39){
                        RedPieceIV1234.setRotate(90);
                    }
                    if(RedPiece1234L >= 40 && RedPiece1234L <= 42){
                        RedPieceIV1234.setRotate(180);
                    }
                    if(RedPiece1234L >= 43 && RedPiece1234L <=45){
                        RedPieceIV1234.setRotate(90);
                    }
                    if(RedPiece1234L >= 46 && RedPiece1234L <= 49){
                        RedPieceIV1234.setRotate(180);
                    }
                    if(RedPiece1234L >= 50 ){
                        RedPieceIV1234.setRotate(-90);
                    }
                    basepane.RedFlag = false;
                    if(basepane.RedCount > 0 && basepane.RedCount < 3) ep.setEp("It's still Player2's turn, Please roll the dice ");
                    else ep.setEp("It's Player3's turn");
                }
            }
        });
        return RedPieceIV1234;
    }
    public static ImageView getWinWDIV(){
        WinWDIV.setLayoutX(202);
        WinWDIV.setLayoutY(238);
        WinWDIV.setFitHeight(37);
        WinWDIV.setFitWidth(70);
        WinWDIV.setRotate(-15);
        WinWDIV.setVisible(true);
        return WinWDIV;
    }
    public static ImageView getWinIV1(){
        WinIV1.setLayoutX(75);
        WinIV1.setLayoutY(74);
        WinIV1.setRotate(-15);
        WinIV1.setFitWidth(51);
        WinIV1.setFitHeight(41);
        WinIV1.setVisible(true);
        return WinIV1;
    }
    public static ImageView getWinIV2(){
        WinIV2.setLayoutX(23);
        WinIV2.setLayoutY(21);
        WinIV2.setRotate(-15);
        WinIV2.setFitWidth(51);
        WinIV2.setFitHeight(41);
        WinIV2.setVisible(true);
        return WinIV2;
    }
    public static ImageView getWinIV3(){
        WinIV3.setLayoutX(21);
        WinIV3.setLayoutY(74);
        WinIV3.setRotate(-15);
        WinIV3.setFitWidth(51);
        WinIV3.setFitHeight(41);
        WinIV3.setVisible(true);
        return WinIV3;
    }
    public static ImageView getWinIV4(){
        WinIV4.setLayoutX(75);
        WinIV4.setLayoutY(22);
        WinIV4.setRotate(-15);
        WinIV4.setFitWidth(51);
        WinIV4.setFitHeight(41);
        WinIV4.setVisible(true);
        return WinIV4;
    }


    public static int getRedLocationX(int xuhao) {
        int[] array1 = {27, 154};
        int[] array2 = {65, 139};
        int[] array3 = {96, 139};
        int[] array4 = {127, 154};
        int[] array5 = {152, 130};
        int[] array6 = {142, 94};
        int[] array7 = {141, 65};
        int[] array8 = {152, 28};
        int[] array9 = {189, 14};
        int[] array10 = {219, 14};
        int[] array11 = {250, 14};
        int[] array12 = {281, 14};
        int[] array13 = {310, 14};
        int[] array14 = {347, 27};
        int[] array15 = {361, 66};
        int[] array16 = {357, 95};
        int[] array17 = {346, 130};
        int[] array18 = {373, 154};
        int[] array19 = {404, 145};
        int[] array20 = {435, 139};
        int[] array21 = {470, 154};
        int[] array22 = {485, 187};
        int[] array23 = {485, 218};
        int[] array24 = {485, 249};
        int[] array25 = {485, 280};
        int[] array26 = {485, 311};
        int[] array27 = {470, 342};
        int[] array28 = {437, 358};
        int[] array29 = {406, 358};
        int[] array30 = {372, 344};
        int[] array31 = {348, 371};
        int[] array32 = {357, 407};
        int[] array33 = {358, 436};
        int[] array34 = {347, 470};
        int[] array35 = {310, 486};
        int[] array36 = {281, 479};
        int[] array37 = {250, 486};
        int[] array38 = {219, 486};
        int[] array39 = {187, 479};
        int[] array40 = {152, 470};
        int[] array41 = {141, 436};
        int[] array42 = {141, 407};
        int[] array43 = {152, 373};
        int[] array44 = {127, 345};
        int[] array45 = {94, 358};
        int[] array46 = {64, 358};
        int[] array47 = {31, 345};
        int[] array48 = {14, 312};
        int[] array49 = {14, 280};
        //进入重点赛道
        int[] array50 = {14, 249};
        int[] array51 = {59, 249};
        int[] array52 = {9, 249};
        int[] array53 = {125, 249};
        int[] array54 = {155, 249};
        int[] array55 = {190, 249};
        int[] array56 = {220, 249};


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

    public static int getRedLocationY(int xuhao) {
        int[] array1 = {27, 154};
        int[] array2 = {65, 139};
        int[] array3 = {96, 139};
        int[] array4 = {127, 154};
        int[] array5 = {152, 130};
        int[] array6 = {142, 94};
        int[] array7 = {141, 65};
        int[] array8 = {152, 28};
        int[] array9 = {189, 14};
        int[] array10 = {219, 14};
        int[] array11 = {250, 14};
        int[] array12 = {281, 14};
        int[] array13 = {310, 14};
        int[] array14 = {347, 27};
        int[] array15 = {361, 66};
        int[] array16 = {357, 95};
        int[] array17 = {346, 130};
        int[] array18 = {373, 154};
        int[] array19 = {404, 145};
        int[] array20 = {435, 139};
        int[] array21 = {470, 154};
        int[] array22 = {485, 187};
        int[] array23 = {485, 218};
        int[] array24 = {485, 249};
        int[] array25 = {485, 280};
        int[] array26 = {485, 311};
        int[] array27 = {470, 342};
        int[] array28 = {437, 358};
        int[] array29 = {406, 358};
        int[] array30 = {372, 344};
        int[] array31 = {348, 371};
        int[] array32 = {357, 407};
        int[] array33 = {358, 436};
        int[] array34 = {347, 470};
        int[] array35 = {310, 486};
        int[] array36 = {281, 479};
        int[] array37 = {250, 486};
        int[] array38 = {219, 486};
        int[] array39 = {187, 479};
        int[] array40 = {152, 470};
        int[] array41 = {141, 436};
        int[] array42 = {141, 407};
        int[] array43 = {152, 373};
        int[] array44 = {127, 345};
        int[] array45 = {94, 358};
        int[] array46 = {64, 358};
        int[] array47 = {31, 345};
        int[] array48 = {14, 312};
        int[] array49 = {14, 280};
        //进入重点赛道
        int[] array50 = {14, 249};
        int[] array51 = {59, 249};
        int[] array52 = {9, 249};
        int[] array53 = {125, 249};
        int[] array54 = {155, 249};
        int[] array55 = {190, 249};
        int[] array56 = {220, 249};


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
