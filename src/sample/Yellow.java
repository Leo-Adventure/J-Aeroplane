package sample;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import javafx.animation.PathTransition;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.awt.*;

public class Yellow {
    static boolean YellowFlag = false;
    static int y1 = 0;
    static int y2 = 0;
    static int y3 = 0;
    static int y4 = 0;
    static int y12 = 0;
    static int y13 = 0;
    static int y14 = 0;
    static int y23 = 0;
    static int y24 = 0;
    static int y34 = 0;
    static int y123 = 0;
    static int y124 = 0;
    static int y134 = 0;
    static int y234 = 0;
    static int y1234 = 0;
    static int YellowPiece1L = -2;
    static int YellowPiece2L = -2;
    static int YellowPiece3L = -2;
    static int YellowPiece4L = -2;
    static int YellowPiece12L = -2;
    static int YellowPiece13L = -2;
    static int YellowPiece14L = -2;
    static int YellowPiece23L = -2;
    static int YellowPiece24L = -2;
    static int YellowPiece34L = -2;
    static int YellowPiece123L = -2;
    static int YellowPiece124L = -2;
    static int YellowPiece134L = -2;
    static int YellowPiece234L = -2;
    static int YellowPiece1234L = -2;
    static int YellowNumber1 = 0;
    static int YellowNumber2 = 0;
    static int winNumber = 0;
    static Image WinIM = new Image("WinIM.jpg");
    static Image WinWDIM = new Image("WinWD.png");
    static ImageView WinWDIV = new ImageView(WinWDIM);
    static ImageView WinIV1= new ImageView(WinIM);
    static ImageView WinIV2= new ImageView(WinIM);
    static ImageView WinIV3= new ImageView(WinIM);
    static ImageView WinIV4= new ImageView(WinIM);

    static Image YellowPieceImg1 = new Image("YellowPiece.png");
    static ImageView YellowPieceIV1 = new ImageView(YellowPieceImg1);
    static Image YellowPieceImg2 = new Image("YellowPiece.png");
    static ImageView YellowPieceIV2 = new ImageView(YellowPieceImg2);
    static Image YellowPieceImg3 = new Image("YellowPiece.png");
    static ImageView YellowPieceIV3 = new ImageView(YellowPieceImg3);
    static Image YellowPieceImg4 = new Image("YellowPiece.png");
    static ImageView YellowPieceIV4 = new ImageView(YellowPieceImg4);
    static Image YellowIM12 = new Image("YTW.png");
    static Image YellowIM123 = new Image("YTR.png");
    static Image YellowIM1234 = new Image("YF.png");
    static ImageView YellowPieceIV1234 = new ImageView(YellowIM1234);
    static ImageView YellowPieceIV123 = new ImageView(YellowIM123);
    static ImageView YellowPieceIV124 = new ImageView(YellowIM123);
    static ImageView YellowPieceIV134 = new ImageView(YellowIM123);
    static ImageView YellowPieceIV234 = new ImageView(YellowIM123);
    static ImageView YellowPieceIV12 = new ImageView(YellowIM12);
    static ImageView YellowPieceIV13 = new ImageView(YellowIM12);
    static ImageView YellowPieceIV14 = new ImageView(YellowIM12);
    static ImageView YellowPieceIV23 = new ImageView(YellowIM12);
    static ImageView YellowPieceIV24 = new ImageView(YellowIM12);
    static ImageView YellowPieceIV34 = new ImageView(YellowIM12);
static void fly(ImageView IV, int L, int pace) throws InterruptedException {
    for(int n = 0; n < pace; n ++){
        IV.setLayoutX(getYellowLocationX(L+1));
        IV.setLayoutY(getYellowLocationY(L+1));
        Thread.sleep(200);

    }
}
public static void turn(int x, ImageView IV){
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
    public static ImageView getYellowPiece1(){
        YellowPieceIV1.setLayoutX(425);
        YellowPieceIV1.setLayoutY(73);
        YellowPieceIV1.setFitHeight(30);
        YellowPieceIV1.setFitWidth(30);
        YellowPieceIV1.setOnMouseClicked(event -> {
            if(basepane.yellowFlagOpen) y1 ++;
            basepane.yellowFlagOpen = false;
            if (basepane.YellowFlag) {
                if (YellowPieceIV1.getLayoutX() == 425 && YellowPieceIV1.getLayoutY() == 73) {
                    if (YellowNumber1 == 6 || YellowNumber2 == 6) {
                            YellowPieceIV1.setLayoutX(375);
                            YellowPieceIV1.setLayoutY(8);
                        YellowPiece1L = -1;
                        basepane.YellowFlag = false;
                        if(basepane.yellowCount > 0 && basepane.yellowCount < 3) ep.setEp("It's still Player1's turn, Please roll the dice ");
                        else ep.setEp("It's Player2's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{
                     if(YellowPiece1L + basepane.pace1 > 55){
                        YellowPiece1L = 110 - basepane.pace1 - YellowPiece1L;
                        YellowPieceIV1.setLayoutX(getYellowLocationX(YellowPiece1L));
                        YellowPieceIV1.setLayoutY(getYellowLocationY(YellowPiece1L));
                         basepane.YellowBoom(YellowPieceIV1);
                    }
                    else {
                        YellowPiece1L += basepane.pace1;
                        YellowPieceIV1.setLayoutX(getYellowLocationX(YellowPiece1L));
                        YellowPieceIV1.setLayoutY(getYellowLocationY(YellowPiece1L));

                              basepane.YellowBoom(YellowPieceIV1);

                    }
                    if(YellowPiece1L == 55){
                        YellowPieceIV1.setVisible(false);
                        getWinIV1();
                        getWinWDIV();
                        winNumber ++ ;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                       YellowPiece1L = -3;
                    }
                    if(YellowPiece1L == 13){

                        YellowPiece1L = 29;
                        YellowPieceIV1.setLayoutX(getYellowLocationX(YellowPiece1L));
                        YellowPieceIV1.setLayoutY(getYellowLocationY(YellowPiece1L));
                        basepane.YellowBoom(YellowPieceIV1);
                        basepane.YellowShortcut();
                    }
                    else if(YellowPiece1L == 17){

                        YellowPiece1L = 33;
                        YellowPieceIV1.setLayoutX(getYellowLocationX(YellowPiece1L));
                        YellowPieceIV1.setLayoutY(getYellowLocationY(YellowPiece1L));
                        basepane.YellowBoom(YellowPieceIV1);
                        basepane.YellowShortcut();
                    }
                    else if((YellowPiece1L - 1) % 4 == 0 && YellowPiece1L <= 49){
                        basepane.YellowBoom(YellowPieceIV1);
                        YellowPiece1L += 4;
                        YellowPieceIV1.setLayoutX(getYellowLocationX(YellowPiece1L));
                        YellowPieceIV1.setLayoutY(getYellowLocationY(YellowPiece1L));
                        basepane.YellowBoom(YellowPieceIV1);
                    }

                    turn(YellowPiece1L,YellowPieceIV1);
                    basepane.YellowFlag = false;
                    if(basepane.yellowCount > 0 && basepane.yellowCount < 3) ep.setEp("It's still Player1's turn, Please roll the dice ");
                    else ep.setEp("It's Player2's turn");
                }
            }
            getYellowIV12();
            getYellowIV13();
            getYellowIV14();
            getYellowIV123();
            getYellowIV124();
            getYellowIV134();
            getYellowIV1234();
        });
        return YellowPieceIV1;
    }
    public static ImageView getYellowPiece3(){
        YellowPieceIV3.setLayoutX(476);
        YellowPieceIV3.setLayoutY(22);
        YellowPieceIV3.setFitHeight(30);
        YellowPieceIV3.setFitWidth(30);
        YellowPieceIV3.setOnMouseClicked(event -> {
            YellowFlag = true;
            if(basepane.yellowFlagOpen == true) y3 ++;
            basepane.yellowFlagOpen= false;
            if (basepane.YellowFlag) {
                if (YellowPieceIV3.getLayoutX() == 476 && YellowPieceIV3.getLayoutY() == 22) {
                    if (YellowNumber1 == 6 || YellowNumber2 == 6) {
                        YellowPieceIV3.setLayoutX(375);
                        YellowPieceIV3.setLayoutY(8);
                        YellowPiece3L = -1;
                        basepane.YellowFlag = false;
                        if(basepane.yellowCount > 0 && basepane.yellowCount < 3) ep.setEp("It's still Player1's turn, Please roll the dice ");
                        else ep.setEp("It's Player2's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{
                    if(YellowPiece3L + basepane.pace1 > 55 ){
                        YellowPiece3L = 110 - basepane.pace1 - YellowPiece3L;
                        YellowPieceIV3.setLayoutX(getYellowLocationX(YellowPiece3L));
                        YellowPieceIV3.setLayoutY(getYellowLocationY(YellowPiece3L));
                        basepane.YellowBoom(YellowPieceIV3);
                    }
                    else {
                        YellowPiece3L += basepane.pace1;
                        YellowPieceIV3.setLayoutX(getYellowLocationX(YellowPiece3L));
                        YellowPieceIV3.setLayoutY(getYellowLocationY(YellowPiece3L));
                        basepane.YellowBoom(YellowPieceIV3);
                    }
                    if(YellowPiece3L == 55){
                        YellowPieceIV3.setVisible(false);
                        getWinIV3();
                        getWinWDIV();
                        winNumber ++ ;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        YellowPiece3L = -3;
                    }
                    if(YellowPiece3L == 13){
                        YellowPiece3L = 29;
                        YellowPieceIV3.setLayoutX(getYellowLocationX(YellowPiece3L));
                        YellowPieceIV3.setLayoutY(getYellowLocationY(YellowPiece3L));
                        basepane.YellowBoom(YellowPieceIV3);
                        basepane.YellowShortcut();
                    }
                    else if(YellowPiece3L == 17){
                        YellowPiece3L = 33;
                        YellowPieceIV3.setLayoutX(getYellowLocationX(YellowPiece3L));
                        YellowPieceIV3.setLayoutY(getYellowLocationY(YellowPiece3L));
                        basepane.YellowBoom(YellowPieceIV3);
                        basepane.YellowShortcut();
                    }
                    else if((YellowPiece3L - 1) % 4 == 0 && YellowPiece3L <= 49){
                        YellowPiece3L += 4;
                        YellowPieceIV3.setLayoutX(getYellowLocationX(YellowPiece3L));
                        YellowPieceIV3.setLayoutY(getYellowLocationY(YellowPiece3L));
                        basepane.YellowBoom(YellowPieceIV3);
                    }
                    turn(YellowPiece3L, YellowPieceIV3);
                    basepane.YellowFlag = false;
                    if(basepane.yellowCount > 0 && basepane.yellowCount < 3) ep.setEp("It's still Player1's turn, Please roll the dice ");
                    else ep.setEp("It's Player2's turn");
                }
            }
            getYellowIV13();
            getYellowIV23();
            getYellowIV34();
            getYellowIV123();
            getYellowIV134();
            getYellowIV234();
            getYellowIV1234();
        });
        return YellowPieceIV3;
    }
    public static ImageView getYellowPiece2(){
        YellowPieceIV2.setLayoutX(424);
        YellowPieceIV2.setLayoutY(22);
        YellowPieceIV2.setFitHeight(30);
        YellowPieceIV2.setFitWidth(30);

        YellowPieceIV2.setOnMouseClicked(event -> {

            YellowFlag = true;
            if(basepane.yellowFlagOpen == true) y2 ++;
            basepane.yellowFlagOpen = false;
            if (basepane.YellowFlag) {
                if (YellowPieceIV2.getLayoutX() == 424 && YellowPieceIV2.getLayoutY() == 22) {
                    if (YellowNumber1 == 6 || YellowNumber2 == 6 ) {
                        YellowPieceIV2.setLayoutX(375);
                        YellowPieceIV2.setLayoutY(8);

                        YellowPiece2L = -1;
                        basepane.YellowFlag = false;
                        if(basepane.yellowCount > 0 && basepane.yellowCount < 3) ep.setEp("It's still Player1's turn, Please roll the dice ");
                        else ep.setEp("It's Player2's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{
                   if(YellowPiece2L + basepane.pace1 > 55 ){
                        YellowPiece2L = 110 - basepane.pace1 - YellowPiece2L;
                        YellowPieceIV2.setLayoutX(getYellowLocationX(YellowPiece2L));
                        YellowPieceIV2.setLayoutY(getYellowLocationY(YellowPiece2L));
                       basepane.YellowBoom(YellowPieceIV2);
                    }
                    else {
                        YellowPiece2L += basepane.pace1;
                        YellowPieceIV2.setLayoutX(getYellowLocationX(YellowPiece2L));
                        YellowPieceIV2.setLayoutY(getYellowLocationY(YellowPiece2L));
                       basepane.YellowBoom(YellowPieceIV2);
                    }
                    if(YellowPiece2L == 55){
                        YellowPieceIV2.setVisible(false);
                        getWinIV2();
                        getWinWDIV();
                        winNumber ++ ;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        YellowPiece2L = -3;
                    }
                    if(YellowPiece2L == 13){
                        YellowPiece2L = 29;
                        YellowPieceIV2.setLayoutX(getYellowLocationX(YellowPiece2L));
                        YellowPieceIV2.setLayoutY(getYellowLocationY(YellowPiece2L));
                        basepane.YellowBoom(YellowPieceIV2);
                        basepane.YellowShortcut();
                    }
                    else if(YellowPiece2L == 17){
                        YellowPiece2L = 33;
                        YellowPieceIV2.setLayoutX(getYellowLocationX(YellowPiece2L));
                        YellowPieceIV2.setLayoutY(getYellowLocationY(YellowPiece2L));
                        basepane.YellowBoom(YellowPieceIV2);
                       basepane.YellowShortcut();
                    }
                    else if((YellowPiece2L - 1) % 4 == 0 && YellowPiece2L <= 49){
                        YellowPiece2L += 4;
                        YellowPieceIV2.setLayoutX(getYellowLocationX(YellowPiece2L));
                        YellowPieceIV2.setLayoutY(getYellowLocationY(YellowPiece2L));
                        basepane.YellowBoom(YellowPieceIV2);
                    }
                    turn(YellowPiece2L, YellowPieceIV2);
                    basepane.YellowFlag = false;
                    if(basepane.yellowCount > 0 && basepane.yellowCount < 3) ep.setEp("It's still Player1's turn, Please roll the dice ");
                    else ep.setEp("It's Player2's turn");
                }
            }
            getYellowIV12();
            getYellowIV23();
            getYellowIV24();
            getYellowIV123();
            getYellowIV124();
            getYellowIV234();
            getYellowIV1234();
        });
        return YellowPieceIV2;
    }
    public static ImageView getYellowPiece4(){
        YellowPieceIV4.setLayoutX(477);
        YellowPieceIV4.setLayoutY(72);
        YellowPieceIV4.setFitHeight(30);
        YellowPieceIV4.setFitWidth(30);
        YellowPieceIV4.setOnMouseClicked(event -> {
            if(basepane.yellowFlagOpen == true) y4 ++;
            basepane.yellowFlagOpen = false;
            YellowFlag = true;
            if (basepane.YellowFlag) {
                if (YellowPieceIV4.getLayoutX() == 477 && YellowPieceIV4.getLayoutY()== 72) {
                    if (YellowNumber1 == 6 || YellowNumber2 == 6 ) {
                        YellowPieceIV4.setLayoutX(375);
                        YellowPieceIV4.setLayoutY(8);

                        YellowPiece4L = -1;
                        basepane.YellowFlag = false;
                        if(basepane.yellowCount > 0 && basepane.yellowCount < 3) ep.setEp("It's still Player1's turn, Please roll the dice ");
                        else ep.setEp("It's Player2's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{
                     if(YellowPiece4L + basepane.pace1 > 55){
                        YellowPiece4L = 110 - basepane.pace1 - YellowPiece4L;
                        YellowPieceIV4.setLayoutX(getYellowLocationX(YellowPiece4L));
                        YellowPieceIV4.setLayoutY(getYellowLocationY(YellowPiece4L));
                         basepane.YellowBoom(YellowPieceIV4);
                    }
                    else {
                        YellowPiece4L += basepane.pace1;
                        YellowPieceIV4.setLayoutX(getYellowLocationX(YellowPiece4L));
                        YellowPieceIV4.setLayoutY(getYellowLocationY(YellowPiece4L));
                         basepane.YellowBoom(YellowPieceIV4);
                    }
                    if(YellowPiece4L == 55){
                        YellowPieceIV4.setVisible(false);
                        getWinIV4();
                        getWinWDIV();
                        winNumber ++ ;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        YellowPiece4L = -3;
                    }
                    if(YellowPiece4L == 13){
                        YellowPiece4L = 29;
                        YellowPieceIV4.setLayoutX(getYellowLocationX(YellowPiece4L));
                        YellowPieceIV4.setLayoutY(getYellowLocationY(YellowPiece4L));
                        basepane.YellowBoom(YellowPieceIV4);
                        basepane.YellowShortcut();
                    }
                    else if(YellowPiece4L == 17){
                        YellowPiece4L = 33;
                        YellowPieceIV4.setLayoutX(getYellowLocationX(YellowPiece4L));
                        YellowPieceIV4.setLayoutY(getYellowLocationY(YellowPiece4L));
                        basepane.YellowBoom(YellowPieceIV4);
                        basepane.YellowShortcut();
                    }
                    else if((YellowPiece4L - 1) % 4 == 0 && YellowPiece4L <= 49){
                        YellowPiece4L += 4;
                        YellowPieceIV4.setLayoutX(getYellowLocationX(YellowPiece4L));
                        YellowPieceIV4.setLayoutY(getYellowLocationY(YellowPiece4L));
                        basepane.YellowBoom(YellowPieceIV4);
                    }
                    turn(YellowPiece4L, YellowPieceIV4);
                    basepane.YellowFlag = false;
                    if(basepane.yellowCount > 0 && basepane.yellowCount < 3) ep.setEp("It's still Player1's turn, Please roll the dice ");
                    else ep.setEp("It's Player2's turn");
                }
            }
            getYellowIV14();
            getYellowIV24();
            getYellowIV34();
            getYellowIV124();
            getYellowIV134();
            getYellowIV234();
            getYellowIV1234();
        });
        return YellowPieceIV4;
    }

    public static ImageView getYellowIV12(){
        YellowPieceIV12.setVisible(false);
        if(YellowPiece1L != -2 ) {
            if (YellowPieceIV1.isVisible() && YellowPieceIV2.isVisible() &&YellowPiece1L == YellowPiece2L) {
                YellowPieceIV1.setVisible(false);
                YellowPieceIV2.setVisible(false);
                YellowPieceIV12.setFitHeight(30);
                YellowPieceIV12.setFitWidth(30);
                YellowPieceIV12.setLayoutX(YellowPieceIV1.getLayoutX());
                YellowPieceIV12.setLayoutY(YellowPieceIV1.getLayoutY());
                YellowPiece12L = YellowPiece1L;
                YellowPieceIV12.setVisible(true);
            }
        }
        YellowPieceIV12.setOnMouseClicked(event -> {
            if(basepane.yellowFlagOpen) y12 ++;
            basepane.yellowFlagOpen = false;
            if (basepane.YellowFlag) {
                     if(YellowPiece12L + basepane.pace1 > 55 ){
                        YellowPiece12L = 110 - basepane.pace1 - YellowPiece12L;
                        YellowPieceIV12.setLayoutX(getYellowLocationX(YellowPiece12L));
                        YellowPieceIV12.setLayoutY(getYellowLocationY(YellowPiece12L));
                         basepane.YellowBoom(YellowPieceIV12);
                    }
                    else {
                        YellowPiece12L += basepane.pace1;
                        YellowPieceIV12.setLayoutX(getYellowLocationX(YellowPiece12L));
                        YellowPieceIV12.setLayoutY(getYellowLocationY(YellowPiece12L));
                         basepane.YellowBoom(YellowPieceIV12);
                    }
                    if (YellowPiece12L == 55) {
                        YellowPieceIV12.setVisible(false);
                        getWinIV1();
                        getWinIV2();
                        getWinWDIV();
                        winNumber += 2;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        YellowPiece1L = -3;
                        YellowPiece2L = -3;
                    }
                    if(YellowPiece12L == 13){
                        YellowPiece12L = 29;
                        YellowPieceIV12.setLayoutX(getYellowLocationX(YellowPiece12L));
                        YellowPieceIV12.setLayoutY(getYellowLocationY(YellowPiece12L));
                        basepane.YellowBoom(YellowPieceIV12);
                       basepane.YellowShortcut();
                    }
                    else if(YellowPiece12L == 17){
                        YellowPiece12L = 33;
                        YellowPieceIV12.setLayoutX(getYellowLocationX(YellowPiece12L));
                        YellowPieceIV12.setLayoutY(getYellowLocationY(YellowPiece12L));
                        basepane.YellowBoom(YellowPieceIV12);
                        basepane.YellowShortcut();
                    }
                    else if((YellowPiece12L - 1) % 4 == 0 && YellowPiece12L <= 49){
                        YellowPiece12L += 4;
                        YellowPieceIV12.setLayoutX(getYellowLocationX(YellowPiece12L));
                        YellowPieceIV12.setLayoutY(getYellowLocationY(YellowPiece12L));
                        basepane.YellowBoom(YellowPieceIV12);
                    }
                    turn(YellowPiece12L, YellowPieceIV12);
                    basepane.YellowFlag = false;
                    if(basepane.yellowCount > 0 && basepane.yellowCount < 3) ep.setEp("It's still Player1's turn, Please roll the dice ");
                    else ep.setEp("It's Player2's turn");

            }
            getYellowIV123();
            getYellowIV124();
            getYellowIV1234();
        });
        return YellowPieceIV12;
    }
    public static ImageView getYellowIV13(){
        YellowPieceIV13.setVisible(false);
        if(YellowPiece1L != -2 ) {
            if (YellowPieceIV1.isVisible() && YellowPieceIV3.isVisible() &&YellowPiece1L == YellowPiece3L) {
                YellowPieceIV1.setVisible(false);
                YellowPieceIV3.setVisible(false);
                YellowPieceIV13.setFitHeight(30);
                YellowPieceIV13.setFitWidth(30);
                YellowPieceIV13.setLayoutX(YellowPieceIV1.getLayoutX());
                YellowPieceIV13.setLayoutY(YellowPieceIV1.getLayoutY());
                YellowPiece13L = YellowPiece1L;
                YellowPieceIV13.setVisible(true);
            }
        }
        YellowPieceIV13.setOnMouseClicked(event -> {
            if(basepane.yellowFlagOpen) y13 ++;
            basepane.yellowFlagOpen = false;
            if (basepane.YellowFlag) {
                if (YellowPieceIV13.getLayoutX() == 425 && YellowPieceIV13.getLayoutY() == 73) {
                    if (YellowNumber1 == 6 || YellowNumber2 == 6) {
                        YellowPieceIV13.setLayoutX(375);
                        YellowPieceIV13.setLayoutY(8);
                        basepane.YellowFlag = false;
                        if(basepane.yellowCount > 0 && basepane.yellowCount < 3) ep.setEp("It's still Player1's turn, Please roll the dice ");
                        else ep.setEp("It's Player2's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{
                   if(YellowPiece13L + basepane.pace1 > 55 ){
                        YellowPiece13L = 110 - basepane.pace1 - YellowPiece13L;
                        YellowPieceIV13.setLayoutX(getYellowLocationX(YellowPiece13L));
                        YellowPieceIV13.setLayoutY(getYellowLocationY(YellowPiece13L));
                       basepane.YellowBoom(YellowPieceIV13);
                    }
                    else {
                        YellowPiece13L += basepane.pace1;
                        YellowPieceIV13.setLayoutX(getYellowLocationX(YellowPiece13L));
                        YellowPieceIV13.setLayoutY(getYellowLocationY(YellowPiece13L));
                       basepane.YellowBoom(YellowPieceIV13);

                    }
                    if (YellowPiece13L == 55) {
                        YellowPieceIV13.setVisible(false);
                        getWinIV1();
                        getWinIV3();
                        getWinWDIV();
                        winNumber += 2;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        YellowPiece1L = -3;
                        YellowPiece3L = -3;
                    }
                    if(YellowPiece13L == 13){
                        YellowPiece13L = 29;
                        YellowPieceIV13.setLayoutX(getYellowLocationX(YellowPiece13L));
                        YellowPieceIV13.setLayoutY(getYellowLocationY(YellowPiece13L));
                        basepane.YellowBoom(YellowPieceIV13);
                        basepane.YellowShortcut();
                    }
                    else if(YellowPiece13L == 17){
                        YellowPiece13L = 33;
                        YellowPieceIV13.setLayoutX(getYellowLocationX(YellowPiece13L));
                        YellowPieceIV13.setLayoutY(getYellowLocationY(YellowPiece13L));
                        basepane.YellowBoom(YellowPieceIV13);
                        basepane.YellowShortcut();
                    }
                    else if((YellowPiece13L - 1) % 4 == 0 && YellowPiece13L <= 49){
                        YellowPiece13L += 4;
                        YellowPieceIV13.setLayoutX(getYellowLocationX(YellowPiece13L));
                        YellowPieceIV13.setLayoutY(getYellowLocationY(YellowPiece13L));
                        basepane.YellowBoom(YellowPieceIV13);
                    }
                    turn(YellowPiece13L, YellowPieceIV13);
                    basepane.YellowFlag = false;
                    if(basepane.yellowCount > 0 && basepane.yellowCount < 3) ep.setEp("It's still Player1's turn, Please roll the dice ");
                    else ep.setEp("It's Player2's turn");
                }
            }
            getYellowIV123();
            getYellowIV134();
            getYellowIV1234();
        });
        return YellowPieceIV13;
    }
    public static ImageView getYellowIV14(){
        YellowPieceIV14.setVisible(false);
        if(YellowPiece1L != -2 ) {
            if (YellowPieceIV1.isVisible() && YellowPieceIV4.isVisible() &&YellowPiece1L == YellowPiece4L) {
                YellowPieceIV1.setVisible(false);
                YellowPieceIV4.setVisible(false);
                YellowPieceIV14.setFitHeight(30);
                YellowPieceIV14.setFitWidth(30);
                YellowPieceIV14.setLayoutX(YellowPieceIV1.getLayoutX());
                YellowPieceIV14.setLayoutY(YellowPieceIV1.getLayoutY());
                YellowPiece14L = YellowPiece1L;
                YellowPieceIV14.setVisible(true);
            }
        }
        YellowPieceIV14.setOnMouseClicked(event -> {
            if(basepane.yellowFlagOpen) y14 ++;
            basepane.yellowFlagOpen = false;
            if (basepane.YellowFlag) {
                if (YellowPieceIV14.getLayoutX() == 425 && YellowPieceIV14.getLayoutY() == 73) {
                    if (YellowNumber1 == 6 || YellowNumber2 == 6) {
                        YellowPieceIV14.setLayoutX(375);
                        YellowPieceIV14.setLayoutY(8);
                        basepane.YellowFlag = false;
                        if(basepane.yellowCount > 0 && basepane.yellowCount < 3) ep.setEp("It's still Player1's turn, Please roll the dice ");
                        else ep.setEp("It's Player2's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{
                    if(YellowPiece14L + basepane.pace1 > 55){
                        YellowPiece14L = 110 - basepane.pace1 - YellowPiece14L;
                        YellowPieceIV14.setLayoutX(getYellowLocationX(YellowPiece14L));
                        YellowPieceIV14.setLayoutY(getYellowLocationY(YellowPiece14L));
                        basepane.YellowBoom(YellowPieceIV14);
                    }
                    else {
                        YellowPiece14L += basepane.pace1;
                        YellowPieceIV14.setLayoutX(getYellowLocationX(YellowPiece14L));
                        YellowPieceIV14.setLayoutY(getYellowLocationY(YellowPiece14L));
                        basepane.YellowBoom(YellowPieceIV14);
                    }
                    if (YellowPiece14L == 55) {
                        YellowPieceIV14.setVisible(false);
                        getWinIV1();
                        getWinIV4();
                        getWinWDIV();
                        winNumber += 2;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        YellowPiece1L = -3;
                        YellowPiece4L = -3;
                    }
                    if(YellowPiece14L == 13){
                        YellowPiece14L = 29;
                        YellowPieceIV14.setLayoutX(getYellowLocationX(YellowPiece14L));
                        YellowPieceIV14.setLayoutY(getYellowLocationY(YellowPiece14L));
                        basepane.YellowBoom(YellowPieceIV14);
                        basepane.YellowShortcut();
                    }
                    else if(YellowPiece14L == 17){
                        YellowPiece14L = 33;
                        YellowPieceIV14.setLayoutX(getYellowLocationX(YellowPiece14L));
                        YellowPieceIV14.setLayoutY(getYellowLocationY(YellowPiece14L));
                        basepane.YellowBoom(YellowPieceIV14);
                        basepane.YellowShortcut();
                    }
                    else if((YellowPiece14L - 1) % 4 == 0 && YellowPiece14L <= 49){
                        YellowPiece14L += 4;
                        YellowPieceIV14.setLayoutX(getYellowLocationX(YellowPiece14L));
                        YellowPieceIV14.setLayoutY(getYellowLocationY(YellowPiece14L));
                        basepane.YellowBoom(YellowPieceIV14);
                    }
                   turn(YellowPiece14L, getYellowIV14());
                    basepane.YellowFlag = false;
                    if(basepane.yellowCount > 0 && basepane.yellowCount < 3) ep.setEp("It's still Player1's turn, Please roll the dice ");
                    else ep.setEp("It's Player2's turn");
                }
            }
            getYellowIV124();
            getYellowIV134();
            getYellowIV1234();
        });
        return YellowPieceIV14;
    }
    public static ImageView getYellowIV23(){
        YellowPieceIV23.setVisible(false);
        if(YellowPiece2L != -2 ) {
            if (YellowPieceIV2.isVisible() && YellowPieceIV3.isVisible() &&YellowPiece2L == YellowPiece3L) {
                YellowPieceIV2.setVisible(false);
                YellowPieceIV3.setVisible(false);
                YellowPieceIV23.setFitHeight(30);
                YellowPieceIV23.setFitWidth(30);
                YellowPieceIV23.setLayoutX(YellowPieceIV2.getLayoutX());
                YellowPieceIV23.setLayoutY(YellowPieceIV2.getLayoutY());
                YellowPiece23L = YellowPiece2L;
                YellowPieceIV23.setVisible(true);
            }
        }
        YellowPieceIV23.setOnMouseClicked(event -> {
            if(basepane.yellowFlagOpen) y23 ++;
            basepane.yellowFlagOpen = false;
            if (basepane.YellowFlag) {
                if (YellowPieceIV23.getLayoutX() == 425 && YellowPieceIV23.getLayoutY() == 73) {
                    if (YellowNumber1 == 6 || YellowNumber2 == 6) {
                        YellowPieceIV23.setLayoutX(375);
                        YellowPieceIV23.setLayoutY(8);
                        basepane.YellowFlag = false;
                        if(basepane.yellowCount > 0 && basepane.yellowCount < 3) ep.setEp("It's still Player1's turn, Please roll the dice ");
                        else ep.setEp("It's Player2's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{

                if(YellowPiece23L + basepane.pace1 > 55){
                        YellowPiece23L = 110 - basepane.pace1 - YellowPiece23L;
                        YellowPieceIV23.setLayoutX(getYellowLocationX(YellowPiece23L));
                        YellowPieceIV23.setLayoutY(getYellowLocationY(YellowPiece23L));
                    basepane.YellowBoom(YellowPieceIV23);
                    }
                    else {
                        YellowPiece23L += basepane.pace1;
                        YellowPieceIV23.setLayoutX(getYellowLocationX(YellowPiece23L));
                        YellowPieceIV23.setLayoutY(getYellowLocationY(YellowPiece23L));
                    basepane.YellowBoom(YellowPieceIV23);
                    }
                    if (YellowPiece23L == 55) {
                        YellowPieceIV23.setVisible(false);
                        getWinIV3();
                        getWinIV2();
                        getWinWDIV();
                        winNumber += 2;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        YellowPiece3L = -3;
                        YellowPiece2L = -3;
                    }
                    if(YellowPiece23L == 13){//
                        YellowPiece23L = 29;
                        YellowPieceIV23.setLayoutX(getYellowLocationX(YellowPiece23L));
                        YellowPieceIV23.setLayoutY(getYellowLocationY(YellowPiece23L));
                        basepane.YellowBoom(YellowPieceIV23);
                        basepane.YellowShortcut();
                    }
                    else if(YellowPiece23L == 17){
                        YellowPiece23L = 33;
                        YellowPieceIV23.setLayoutX(getYellowLocationX(YellowPiece23L));
                        YellowPieceIV23.setLayoutY(getYellowLocationY(YellowPiece23L));
                        basepane.YellowBoom(YellowPieceIV23);
                        basepane.YellowShortcut();
                    }
                    else if((YellowPiece23L - 1) % 4 == 0 && YellowPiece23L <= 49){
                        YellowPiece23L += 4;
                        YellowPieceIV23.setLayoutX(getYellowLocationX(YellowPiece23L));
                        YellowPieceIV23.setLayoutY(getYellowLocationY(YellowPiece23L));
                        basepane.YellowBoom(YellowPieceIV23);
                    }
                    turn(YellowPiece23L, YellowPieceIV23);
                    basepane.YellowFlag = false;
                    if(basepane.yellowCount > 0 && basepane.yellowCount < 3) ep.setEp("It's still Player1's turn, Please roll the dice ");
                    else ep.setEp("It's Player2's turn");
                }
            }
            getYellowIV123();
            getYellowIV234();
            getYellowIV1234();
        });
        return YellowPieceIV23;
    }
    public static ImageView getYellowIV24(){
        YellowPieceIV24.setVisible(false);
        if(YellowPiece2L != -2 ) {
            if (YellowPieceIV2.isVisible() && YellowPieceIV4.isVisible() &&YellowPiece2L == YellowPiece4L) {
                YellowPieceIV2.setVisible(false);
                YellowPieceIV4.setVisible(false);
                YellowPieceIV24.setFitHeight(30);
                YellowPieceIV24.setFitWidth(30);
                YellowPieceIV24.setLayoutX(YellowPieceIV2.getLayoutX());
                YellowPieceIV24.setLayoutY(YellowPieceIV2.getLayoutY());
                YellowPiece24L = YellowPiece2L;
                YellowPieceIV24.setVisible(true);
            }
        }
        YellowPieceIV24.setOnMouseClicked(event -> {
            if(basepane.yellowFlagOpen) y24 ++;
            basepane.yellowFlagOpen = false;
            if (basepane.YellowFlag) {
                if (YellowPieceIV24.getLayoutX() == 425 && YellowPieceIV24.getLayoutY() == 73) {
                    if (YellowNumber1 == 6 || YellowNumber2 == 6) {
                        YellowPieceIV24.setLayoutX(375);
                        YellowPieceIV24.setLayoutY(8);
                        basepane.YellowFlag = false;
                        if(basepane.yellowCount > 0 && basepane.yellowCount < 3) ep.setEp("It's still Player1's turn, Please roll the dice ");
                        else ep.setEp("It's Player2's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{

                  if(YellowPiece24L + basepane.pace1 > 55 ){
                        YellowPiece24L = 110 - basepane.pace1 - YellowPiece24L;
                        YellowPieceIV24.setLayoutX(getYellowLocationX(YellowPiece24L));
                        YellowPieceIV24.setLayoutY(getYellowLocationY(YellowPiece24L));
                      basepane.YellowBoom(YellowPieceIV24);
                    }

                    else{
                        YellowPiece24L += basepane.pace1;
                        YellowPieceIV24.setLayoutX(getYellowLocationX(YellowPiece24L));
                        YellowPieceIV24.setLayoutY(getYellowLocationY(YellowPiece24L));
                      basepane.YellowBoom(YellowPieceIV24);
                    }
                    if (YellowPiece24L == 55) {
                        YellowPieceIV24.setVisible(false);
                        getWinIV4();
                        getWinIV2();
                        getWinWDIV();
                        winNumber += 2;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        YellowPiece4L = -3;
                        YellowPiece2L = -3;
                    }
                    if(YellowPiece24L == 13){//
                        YellowPiece24L = 29;
                        YellowPieceIV24.setLayoutX(getYellowLocationX(YellowPiece24L));
                        YellowPieceIV24.setLayoutY(getYellowLocationY(YellowPiece24L));
                        basepane.YellowBoom(YellowPieceIV24);
                        basepane.YellowShortcut();
                    }
                    else if(YellowPiece24L == 17){
                        YellowPiece24L = 33;
                        YellowPieceIV24.setLayoutX(getYellowLocationX(YellowPiece24L));
                        YellowPieceIV24.setLayoutY(getYellowLocationY(YellowPiece24L));
                        basepane.YellowBoom(YellowPieceIV24);
                        basepane.YellowShortcut();
                    }
                    else if((YellowPiece24L - 1) % 4 == 0 && YellowPiece24L <= 49){
                        YellowPiece24L += 4;
                        YellowPieceIV24.setLayoutX(getYellowLocationX(YellowPiece24L));
                        YellowPieceIV24.setLayoutY(getYellowLocationY(YellowPiece24L));
                        basepane.YellowBoom(YellowPieceIV24);
                    }

                   turn(YellowPiece24L, YellowPieceIV24);
                    basepane.YellowFlag = false;
                    if(basepane.yellowCount > 0 && basepane.yellowCount < 3) ep.setEp("It's still Player1's turn, Please roll the dice ");
                    else ep.setEp("It's Player2's turn");
                }
            }
            getYellowIV124();
            getYellowIV234();
            getYellowIV1234();
        });
        return YellowPieceIV24;
    }
    public static ImageView getYellowIV34(){
        YellowPieceIV34.setVisible(false);
        if(YellowPiece3L != -2 ) {
            if (YellowPieceIV3.isVisible() && YellowPieceIV4.isVisible() &&YellowPiece3L == YellowPiece4L) {
                YellowPieceIV4.setVisible(false);
                YellowPieceIV3.setVisible(false);
                YellowPieceIV34.setFitHeight(30);
                YellowPieceIV34.setFitWidth(30);
                YellowPieceIV34.setLayoutX(YellowPieceIV3.getLayoutX());
                YellowPieceIV34.setLayoutY(YellowPieceIV3.getLayoutY());
                YellowPiece34L = YellowPiece3L;
                YellowPieceIV34.setVisible(true);
            }
        }
        YellowPieceIV34.setOnMouseClicked(event -> {
            if(basepane.yellowFlagOpen) y34 ++;
            basepane.yellowFlagOpen = false;
            if (basepane.YellowFlag) {

                if (YellowPieceIV34.getLayoutX() == 425 && YellowPieceIV34.getLayoutY() == 73) {
                    if (YellowNumber1 == 6 || YellowNumber2 == 6) {
                        YellowPieceIV34.setLayoutX(375);
                        YellowPieceIV34.setLayoutY(8);
                        basepane.YellowFlag = false;
                        if(basepane.yellowCount > 0 && basepane.yellowCount < 3) ep.setEp("It's still Player1's turn, Please roll the dice ");
                        else ep.setEp("It's Player2's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{

                    if(YellowPiece34L + basepane.pace1 > 55 ){
                        YellowPiece34L = 110 - basepane.pace1 - YellowPiece34L;
                        YellowPieceIV34.setLayoutX(getYellowLocationX(YellowPiece34L));
                        YellowPieceIV34.setLayoutY(getYellowLocationY(YellowPiece34L));
                        basepane.YellowBoom(YellowPieceIV34);
                    }
                    else {
                        YellowPiece34L += basepane.pace1;
                        YellowPieceIV34.setLayoutX(getYellowLocationX(YellowPiece34L));
                        YellowPieceIV34.setLayoutY(getYellowLocationY(YellowPiece34L));
                        basepane.YellowBoom(YellowPieceIV34);
                    }
                    if (YellowPiece34L == 55) {
                        YellowPieceIV34.setVisible(false);
                        getWinIV3();
                        getWinIV4();
                        getWinWDIV();
                        winNumber += 2;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        YellowPiece4L = -3;
                        YellowPiece3L = -3;
                    }
                    if(YellowPiece34L == 13){
                        YellowPiece34L = 29;
                        YellowPieceIV34.setLayoutX(getYellowLocationX(YellowPiece34L));
                        YellowPieceIV34.setLayoutY(getYellowLocationY(YellowPiece34L));
                        basepane.YellowBoom(YellowPieceIV34);
                        basepane.YellowShortcut();
                    }
                    else if(YellowPiece34L == 17){
                        YellowPiece34L = 33;
                        YellowPieceIV34.setLayoutX(getYellowLocationX(YellowPiece34L));
                        YellowPieceIV34.setLayoutY(getYellowLocationY(YellowPiece34L));
                        basepane.YellowBoom(YellowPieceIV34);
                        basepane.YellowShortcut();
                    }
                    else if((YellowPiece34L - 1) % 4 == 0 && YellowPiece34L <= 49){
                        YellowPiece34L += 4;
                        YellowPieceIV34.setLayoutX(getYellowLocationX(YellowPiece34L));
                        YellowPieceIV34.setLayoutY(getYellowLocationY(YellowPiece34L));
                        basepane.YellowBoom(YellowPieceIV34);
                    }

                   turn(YellowPiece34L, YellowPieceIV34);
                    basepane.YellowFlag = false;
                    if(basepane.yellowCount > 0 && basepane.yellowCount < 3) ep.setEp("It's still Player1's turn, Please roll the dice ");
                    else ep.setEp("It's Player2's turn");
                }
            }
            getYellowIV134();
            getYellowIV234();
            getYellowIV1234();
        });
        return YellowPieceIV34;
    }
    public static ImageView getYellowIV123(){
        YellowPieceIV123.setVisible(false);
        if(YellowPiece1L != -2 && YellowPiece2L != -2 && YellowPiece3L != -2 ) {
            if (YellowPieceIV1.isVisible() && YellowPieceIV23.isVisible() &&YellowPiece1L == YellowPiece23L ) {
                YellowPieceIV1.setVisible(false);
                YellowPieceIV23.setVisible(false);
                YellowPieceIV123.setFitHeight(30);
                YellowPieceIV123.setFitWidth(30);
                YellowPieceIV123.setLayoutX(YellowPieceIV1.getLayoutX());
                YellowPieceIV123.setLayoutY(YellowPieceIV1.getLayoutY());
                YellowPiece123L = YellowPiece1L;
                YellowPieceIV123.setVisible(true);
            }
            else if(YellowPieceIV2.isVisible() && YellowPieceIV13.isVisible() &&YellowPiece2L == YellowPiece13L){
                YellowPieceIV2.setVisible(false);
                YellowPieceIV13.setVisible(false);
                YellowPieceIV123.setFitHeight(30);
                YellowPieceIV123.setFitWidth(30);
                YellowPieceIV123.setLayoutX(YellowPieceIV2.getLayoutX());
                YellowPieceIV123.setLayoutY(YellowPieceIV2.getLayoutY());
                YellowPiece123L = YellowPiece2L;
                YellowPieceIV123.setVisible(true);
            }
            else if(YellowPieceIV3.isVisible() && YellowPieceIV12.isVisible() &&YellowPiece3L == YellowPiece12L) {
                YellowPieceIV3.setVisible(false);
                YellowPieceIV12.setVisible(false);
                YellowPieceIV123.setFitHeight(30);
                YellowPieceIV123.setFitWidth(30);
                YellowPieceIV123.setLayoutX(YellowPieceIV3.getLayoutX());
                YellowPieceIV123.setLayoutY(YellowPieceIV3.getLayoutY());
                YellowPiece123L = YellowPiece3L;
                YellowPieceIV123.setVisible(true);
            }
        }
        YellowPieceIV123.setOnMouseClicked(event -> {
            if(basepane.yellowFlagOpen) y123 ++;
            basepane.yellowFlagOpen = false;
            if (basepane.YellowFlag) {
                YellowPieceIV12.setVisible(false);
                YellowPieceIV13.setVisible(false);
                YellowPieceIV23.setVisible(false);
                if (YellowPieceIV123.getLayoutX() == 425 && YellowPieceIV123.getLayoutY() == 73) {
                    if (YellowNumber1 == 6 || YellowNumber2 == 6) {
                        YellowPieceIV123.setLayoutX(375);
                        YellowPieceIV123.setLayoutY(8);
                        basepane.YellowFlag = false;
                        if(basepane.yellowCount > 0 && basepane.yellowCount < 3) ep.setEp("It's still Player1's turn, Please roll the dice ");
                        else ep.setEp("It's Player2's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{

                     if(YellowPiece123L + basepane.pace1 > 55 ){
                        YellowPiece123L = 110 - basepane.pace1 - YellowPiece123L;
                        YellowPieceIV123.setLayoutX(getYellowLocationX(YellowPiece123L));
                        YellowPieceIV123.setLayoutY(getYellowLocationY(YellowPiece123L));
                         basepane.YellowBoom(YellowPieceIV123);
                    }
                    else {
                        YellowPiece123L += basepane.pace1;
                        YellowPieceIV123.setLayoutX(getYellowLocationX(YellowPiece123L));
                        YellowPieceIV123.setLayoutY(getYellowLocationY(YellowPiece123L));
                         basepane.YellowBoom(YellowPieceIV123);
                    }
                    if (YellowPiece123L == 55) {
                        YellowPieceIV123.setVisible(false);
                        getWinIV1();
                        getWinIV2();
                        getWinIV3();
                        getWinWDIV();
                        winNumber += 3;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        YellowPiece1L = -3;
                        YellowPiece2L = -3;
                        YellowPiece3L = -3;
                    }
                    if(YellowPiece123L == 13){
                        YellowPiece123L = 29;
                        YellowPieceIV123.setLayoutX(getYellowLocationX(YellowPiece123L));
                        YellowPieceIV123.setLayoutY(getYellowLocationY(YellowPiece123L));
                        basepane.YellowBoom(YellowPieceIV123);
                        basepane.YellowShortcut();
                    }
                    else if(YellowPiece123L == 17){
                        YellowPiece123L = 33;
                        YellowPieceIV123.setLayoutX(getYellowLocationX(YellowPiece123L));
                        YellowPieceIV123.setLayoutY(getYellowLocationY(YellowPiece123L));
                        basepane.YellowBoom(YellowPieceIV123);
                       basepane.YellowShortcut();
                    }
                    else if((YellowPiece123L - 1) % 4 == 0 && YellowPiece123L <= 49){
                        YellowPiece123L += 4;
                        YellowPieceIV123.setLayoutX(getYellowLocationX(YellowPiece123L));
                        YellowPieceIV123.setLayoutY(getYellowLocationY(YellowPiece123L));
                        basepane.YellowBoom(YellowPieceIV123);
                    }

                   turn(YellowPiece123L, YellowPieceIV123);
                    basepane.YellowFlag = false;
                    if(basepane.yellowCount > 0 && basepane.yellowCount < 3) ep.setEp("It's still Player1's turn, Please roll the dice ");
                    else ep.setEp("It's Player2's turn");
                }
            }
            getYellowIV1234();
        });
        return YellowPieceIV123;
    }
    public static ImageView getYellowIV124(){
        YellowPieceIV124.setVisible(false);
        if(YellowPiece1L != -2 && YellowPiece2L != -2 && YellowPiece4L != -2 ) {
            if (YellowPieceIV1.isVisible() && YellowPieceIV24.isVisible() &&YellowPiece1L == YellowPiece24L ) {
                YellowPieceIV1.setVisible(false);
                YellowPieceIV24.setVisible(false);
                YellowPieceIV124.setFitHeight(30);
                YellowPieceIV124.setFitWidth(30);
                YellowPieceIV124.setLayoutX(YellowPieceIV1.getLayoutX());
                YellowPieceIV124.setLayoutY(YellowPieceIV1.getLayoutY());
                YellowPiece124L = YellowPiece1L;
                YellowPieceIV124.setVisible(true);
            }
            else if(YellowPieceIV2.isVisible() && YellowPieceIV14.isVisible() &&YellowPiece2L == YellowPiece14L){
                YellowPieceIV2.setVisible(false);
                YellowPieceIV14.setVisible(false);
                YellowPieceIV124.setFitHeight(30);
                YellowPieceIV124.setFitWidth(30);
                YellowPieceIV124.setLayoutX(YellowPieceIV2.getLayoutX());
                YellowPieceIV124.setLayoutY(YellowPieceIV2.getLayoutY());
                YellowPiece124L = YellowPiece2L;
                YellowPieceIV124.setVisible(true);
            }
            else if(YellowPieceIV4.isVisible() && YellowPieceIV12.isVisible() &&YellowPiece4L == YellowPiece12L) {
                YellowPieceIV4.setVisible(false);
                YellowPieceIV12.setVisible(false);
                YellowPieceIV124.setFitHeight(30);
                YellowPieceIV124.setFitWidth(30);
                YellowPieceIV124.setLayoutX(YellowPieceIV4.getLayoutX());
                YellowPieceIV124.setLayoutY(YellowPieceIV4.getLayoutY());
                YellowPiece124L = YellowPiece4L;
                YellowPieceIV124.setVisible(true);
            }
        }
        YellowPieceIV124.setOnMouseClicked(event -> {
            if(basepane.yellowFlagOpen) y124 ++;
            basepane.yellowFlagOpen = false;
            if (basepane.YellowFlag) {
                YellowPieceIV12.setVisible(false);
                YellowPieceIV14.setVisible(false);
                YellowPieceIV24.setVisible(false);
                if (YellowPieceIV124.getLayoutX() == 425 && YellowPieceIV124.getLayoutY() == 73) {
                    if (YellowNumber1 == 6 || YellowNumber2 == 6) {
                        YellowPieceIV124.setLayoutX(375);
                        YellowPieceIV124.setLayoutY(8);
                        basepane.YellowFlag = false;
                        if(basepane.yellowCount > 0 && basepane.yellowCount < 3) ep.setEp("It's still Player1's turn, Please roll the dice ");
                        else ep.setEp("It's Player2's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{

                  if(YellowPiece124L + basepane.pace1 > 55){
                        YellowPiece124L = 110 - basepane.pace1 - YellowPiece124L;
                        YellowPieceIV124.setLayoutX(getYellowLocationX(YellowPiece124L));
                        YellowPieceIV124.setLayoutY(getYellowLocationY(YellowPiece124L));
                      basepane.YellowBoom(YellowPieceIV124);

                    }else {
                        YellowPiece124L += basepane.pace1;
                        YellowPieceIV124.setLayoutX(getYellowLocationX(YellowPiece124L));
                        YellowPieceIV124.setLayoutY(getYellowLocationY(YellowPiece124L));
                      basepane.YellowBoom(YellowPieceIV124);

                    }
                    if (YellowPiece124L == 55) {
                        YellowPieceIV124.setVisible(false);
                        getWinIV1();
                        getWinIV2();
                        getWinIV4();
                        getWinWDIV();
                        winNumber += 3;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        YellowPiece1L = -3;
                        YellowPiece2L = -3;
                        YellowPiece4L = -3;
                    }
                    if(YellowPiece124L == 13){
                        YellowPiece124L = 29;
                        YellowPieceIV124.setLayoutX(getYellowLocationX(YellowPiece124L));
                        YellowPieceIV124.setLayoutY(getYellowLocationY(YellowPiece124L));
                        basepane.YellowBoom(YellowPieceIV124);
                        basepane.YellowShortcut();
                    }
                    else if(YellowPiece124L == 17){
                        YellowPiece124L = 33;
                        YellowPieceIV124.setLayoutX(getYellowLocationX(YellowPiece124L));
                        YellowPieceIV124.setLayoutY(getYellowLocationY(YellowPiece124L));
                        basepane.YellowBoom(YellowPieceIV124);
                        basepane.YellowShortcut();
                    }
                    else if((YellowPiece124L - 1) % 4 == 0 && YellowPiece124L <= 49){
                        YellowPiece124L += 4;
                        YellowPieceIV124.setLayoutX(getYellowLocationX(YellowPiece124L));
                        YellowPieceIV124.setLayoutY(getYellowLocationY(YellowPiece124L));
                        basepane.YellowBoom(YellowPieceIV124);
                    }

                   turn(YellowPiece124L, YellowPieceIV124);
                    basepane.YellowFlag = false;
                    if(basepane.yellowCount > 0 && basepane.yellowCount < 3) ep.setEp("It's still Player1's turn, Please roll the dice ");
                    else ep.setEp("It's Player2's turn");
                }
            }
            getYellowIV1234();
        });
        return YellowPieceIV124;
    }
    public static ImageView getYellowIV134(){
        YellowPieceIV134.setVisible(false);
        if(YellowPiece1L != -2 && YellowPiece3L != -2 && YellowPiece4L != -2 ) {
            if (YellowPieceIV1.isVisible() && YellowPieceIV34.isVisible() &&YellowPiece1L == YellowPiece34L ) {
                YellowPieceIV1.setVisible(false);
                YellowPieceIV34.setVisible(false);
                YellowPieceIV134.setFitHeight(30);
                YellowPieceIV134.setFitWidth(30);
                YellowPieceIV134.setLayoutX(YellowPieceIV1.getLayoutX());
                YellowPieceIV134.setLayoutY(YellowPieceIV1.getLayoutY());
                YellowPiece134L = YellowPiece1L;
                YellowPieceIV134.setVisible(true);
            }
            else if(YellowPieceIV3.isVisible() && YellowPieceIV14.isVisible() &&YellowPiece3L == YellowPiece14L){
                YellowPieceIV3.setVisible(false);
                YellowPieceIV14.setVisible(false);
                YellowPieceIV134.setFitHeight(30);
                YellowPieceIV134.setFitWidth(30);
                YellowPieceIV134.setLayoutX(YellowPieceIV3.getLayoutX());
                YellowPieceIV134.setLayoutY(YellowPieceIV3.getLayoutY());
                YellowPiece134L = YellowPiece3L;
                YellowPieceIV134.setVisible(true);
            }
            else if(YellowPieceIV4.isVisible() && YellowPieceIV13.isVisible() &&YellowPiece4L == YellowPiece13L) {
                YellowPieceIV4.setVisible(false);
                YellowPieceIV13.setVisible(false);
                YellowPieceIV134.setFitHeight(30);
                YellowPieceIV134.setFitWidth(30);
                YellowPieceIV134.setLayoutX(YellowPieceIV4.getLayoutX());
                YellowPieceIV134.setLayoutY(YellowPieceIV4.getLayoutY());
                YellowPiece134L = YellowPiece4L;
                YellowPieceIV134.setVisible(true);
            }
        }
        YellowPieceIV134.setOnMouseClicked(event -> {
            if(basepane.yellowFlagOpen) y134 ++;
            basepane.yellowFlagOpen = false;
            if (basepane.YellowFlag) {
                YellowPieceIV13.setVisible(false);
                YellowPieceIV34.setVisible(false);
                YellowPieceIV14.setVisible(false);
                if (YellowPieceIV134.getLayoutX() == 425 && YellowPieceIV134.getLayoutY() == 73) {
                    if (YellowNumber1 == 6 || YellowNumber2 == 6) {
                        YellowPieceIV134.setLayoutX(375);
                        YellowPieceIV134.setLayoutY(8);
                        basepane.YellowFlag = false;
                        if(basepane.yellowCount > 0 && basepane.yellowCount < 3) ep.setEp("It's still Player1's turn, Please roll the dice ");
                        else ep.setEp("It's Player2's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{

                  if(YellowPiece134L + basepane.pace1 > 55 ){
                        YellowPiece134L = 110 - basepane.pace1 - YellowPiece134L;
                        YellowPieceIV134.setLayoutX(getYellowLocationX(YellowPiece134L));
                        YellowPieceIV134.setLayoutY(getYellowLocationY(YellowPiece134L));
                      basepane.YellowBoom(YellowPieceIV134);

                    }else {
                        YellowPiece134L += basepane.pace1;
                        YellowPieceIV134.setLayoutX(getYellowLocationX(YellowPiece134L));
                        YellowPieceIV134.setLayoutY(getYellowLocationY(YellowPiece134L));
                      basepane.YellowBoom(YellowPieceIV134);

                    }
                    if (YellowPiece134L == 55) {
                        YellowPieceIV134.setVisible(false);
                        getWinIV1();
                        getWinIV4();
                        getWinIV3();
                        getWinWDIV();
                        winNumber += 3;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        YellowPiece1L = -3;
                        YellowPiece4L = -3;
                        YellowPiece3L = -3;
                    }
                    if(YellowPiece134L == 13){
                        YellowPiece134L = 29;
                        YellowPieceIV134.setLayoutX(getYellowLocationX(YellowPiece134L));
                        YellowPieceIV134.setLayoutY(getYellowLocationY(YellowPiece134L));
                        basepane.YellowBoom(YellowPieceIV134);
                        basepane.YellowShortcut();
                    }
                    else if(YellowPiece134L == 17){
                        YellowPiece134L = 33;
                        YellowPieceIV134.setLayoutX(getYellowLocationX(YellowPiece134L));
                        YellowPieceIV134.setLayoutY(getYellowLocationY(YellowPiece134L));
                        basepane.YellowBoom(YellowPieceIV134);
                        basepane.YellowShortcut();
                    }
                    else if((YellowPiece134L - 1) % 4 == 0 && YellowPiece134L <= 49){
                        YellowPiece134L += 4;
                        YellowPieceIV134.setLayoutX(getYellowLocationX(YellowPiece134L));
                        YellowPieceIV134.setLayoutY(getYellowLocationY(YellowPiece134L));
                        basepane.YellowBoom(YellowPieceIV134);
                    }

                  turn(YellowPiece134L, YellowPieceIV134);
                    basepane.YellowFlag = false;
                    if(basepane.yellowCount > 0 && basepane.yellowCount < 3) ep.setEp("It's still Player1's turn, Please roll the dice ");
                    else ep.setEp("It's Player2's turn");
                }
            }
            getYellowIV1234();
        });
        return YellowPieceIV134;
    }
    public static ImageView getYellowIV234(){
        YellowPieceIV234.setVisible(false);
        if(YellowPiece2L != -2 && YellowPiece3L != -2 && YellowPiece4L != -2 ) {
            if (YellowPieceIV2.isVisible() && YellowPieceIV34.isVisible() &&YellowPiece2L == YellowPiece34L ) {
                YellowPieceIV2.setVisible(false);
                YellowPieceIV34.setVisible(false);
                YellowPieceIV234.setFitHeight(30);
                YellowPieceIV234.setFitWidth(30);
                YellowPieceIV234.setLayoutX(YellowPieceIV2.getLayoutX());
                YellowPieceIV234.setLayoutY(YellowPieceIV2.getLayoutY());
                YellowPiece234L = YellowPiece2L;
                YellowPieceIV234.setVisible(true);
            }
            else if(YellowPieceIV3.isVisible() && YellowPieceIV24.isVisible() &&YellowPiece3L == YellowPiece24L){
                YellowPieceIV3.setVisible(false);
                YellowPieceIV24.setVisible(false);
                YellowPieceIV234.setFitHeight(30);
                YellowPieceIV234.setFitWidth(30);
                YellowPieceIV234.setLayoutX(YellowPieceIV3.getLayoutX());
                YellowPieceIV234.setLayoutY(YellowPieceIV3.getLayoutY());
                YellowPiece234L = YellowPiece3L;
                YellowPieceIV234.setVisible(true);
            }
            else if(YellowPieceIV4.isVisible() && YellowPieceIV23.isVisible() &&YellowPiece4L == YellowPiece23L) {
                YellowPieceIV4.setVisible(false);
                YellowPieceIV23.setVisible(false);
                YellowPieceIV234.setFitHeight(30);
                YellowPieceIV234.setFitWidth(30);
                YellowPieceIV234.setLayoutX(YellowPieceIV4.getLayoutX());
                YellowPieceIV234.setLayoutY(YellowPieceIV4.getLayoutY());
                YellowPiece234L = YellowPiece4L;
                YellowPieceIV234.setVisible(true);
            }
        }
        YellowPieceIV234.setOnMouseClicked(event -> {
            if(basepane.yellowFlagOpen) y234 ++;
            basepane.yellowFlagOpen = false;
            if (basepane.YellowFlag) {
                YellowPieceIV23.setVisible(false);
                YellowPieceIV24.setVisible(false);
                YellowPieceIV34.setVisible(false);
                if (YellowPieceIV234.getLayoutX() == 425 && YellowPieceIV234.getLayoutY() == 73) {
                    if (YellowNumber1 == 6 || YellowNumber2 == 6) {
                        YellowPieceIV234.setLayoutX(375);
                        YellowPieceIV234.setLayoutY(8);
                        basepane.YellowFlag = false;
                        if(basepane.yellowCount > 0 && basepane.yellowCount < 3) ep.setEp("It's still Player1's turn, Please roll the dice ");
                        else ep.setEp("It's Player2's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{

                   if(YellowPiece234L + basepane.pace1 > 55){
                        YellowPiece234L = 110 - basepane.pace1 - YellowPiece234L;
                        YellowPieceIV234.setLayoutX(getYellowLocationX(YellowPiece234L));
                        YellowPieceIV234.setLayoutY(getYellowLocationY(YellowPiece234L));
                       basepane.YellowBoom(YellowPieceIV234);

                    }else {
                        YellowPiece234L += basepane.pace1;
                        YellowPieceIV234.setLayoutX(getYellowLocationX(YellowPiece234L));
                        YellowPieceIV234.setLayoutY(getYellowLocationY(YellowPiece234L));
                       basepane.YellowBoom(YellowPieceIV234);
                    }
                    if (YellowPiece234L== 55) {
                        YellowPieceIV234.setVisible(false);
                        getWinIV4();
                        getWinIV2();
                        getWinIV3();
                        getWinWDIV();
                        winNumber += 3;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        YellowPiece4L = -3;
                        YellowPiece2L = -3;
                        YellowPiece3L = -3;
                    }
                    if(YellowPiece234L == 13){
                        YellowPiece234L = 29;
                        YellowPieceIV234.setLayoutX(getYellowLocationX(YellowPiece234L));
                        YellowPieceIV234.setLayoutY(getYellowLocationY(YellowPiece234L));
                        basepane.YellowBoom(YellowPieceIV234);
                        basepane.YellowShortcut();
                    }
                    else if(YellowPiece234L == 17){
                        YellowPiece234L = 33;
                        YellowPieceIV234.setLayoutX(getYellowLocationX(YellowPiece234L));
                        YellowPieceIV234.setLayoutY(getYellowLocationY(YellowPiece234L));
                        basepane.YellowBoom(YellowPieceIV234);
                        basepane.YellowShortcut();
                    }
                    else if((YellowPiece234L - 1) % 4 == 0 && YellowPiece234L <= 49){
                        YellowPiece234L += 4;
                        YellowPieceIV234.setLayoutX(getYellowLocationX(YellowPiece234L));
                        YellowPieceIV234.setLayoutY(getYellowLocationY(YellowPiece234L));
                        basepane.YellowBoom(YellowPieceIV234);
                    }

                    turn(YellowPiece234L, YellowPieceIV234);
                    basepane.YellowFlag = false;
                    if(basepane.yellowCount > 0 && basepane.yellowCount < 3) ep.setEp("It's still Player1's turn, Please roll the dice ");
                    else ep.setEp("It's Player2's turn");
                }
            }
            getYellowIV234();
        });
        return YellowPieceIV234;
    }
    public static ImageView getYellowIV1234(){
        YellowPieceIV1234.setVisible(false);
        if(YellowPiece1L != -2 &&  YellowPiece2L != -2 && YellowPiece3L != -2 && YellowPiece4L != -2 ) {
            if (YellowPieceIV1.isVisible() && YellowPieceIV234.isVisible() && YellowPiece1L == YellowPiece234L ) {
                YellowPieceIV1.setVisible(false);
                YellowPieceIV234.setVisible(false);
                YellowPieceIV1234.setFitHeight(30);
                YellowPieceIV1234.setFitWidth(30);
                YellowPieceIV1234.setLayoutX(YellowPieceIV1.getLayoutX());
                YellowPieceIV1234.setLayoutY(YellowPieceIV1.getLayoutY());
                YellowPiece1234L = YellowPiece1L;
                YellowPieceIV1234.setVisible(true);
            }
            else if (YellowPieceIV2.isVisible() && YellowPieceIV134.isVisible() &&YellowPiece2L == YellowPiece134L ) {
                YellowPieceIV2.setVisible(false);
                YellowPieceIV134.setVisible(false);
                YellowPieceIV1234.setFitHeight(30);
                YellowPieceIV1234.setFitWidth(30);
                YellowPieceIV1234.setLayoutX(YellowPieceIV2.getLayoutX());
                YellowPieceIV1234.setLayoutY(YellowPieceIV2.getLayoutY());
                YellowPiece1234L = YellowPiece2L;
                YellowPieceIV1234.setVisible(true);
            }
            else if(YellowPieceIV3.isVisible() && YellowPieceIV124.isVisible() &&YellowPiece3L == YellowPiece124L){
                YellowPieceIV3.setVisible(false);
                YellowPieceIV124.setVisible(false);
                YellowPieceIV1234.setFitHeight(30);
                YellowPieceIV1234.setFitWidth(30);
                YellowPieceIV1234.setLayoutX(YellowPieceIV3.getLayoutX());
                YellowPieceIV1234.setLayoutY(YellowPieceIV3.getLayoutY());
                YellowPiece1234L = YellowPiece3L;
                YellowPieceIV1234.setVisible(true);
            }
            else if(YellowPieceIV4.isVisible() && YellowPieceIV123.isVisible() &&YellowPiece4L == YellowPiece123L) {
                YellowPieceIV4.setVisible(false);
                YellowPieceIV123.setVisible(false);
                YellowPieceIV1234.setFitHeight(30);
                YellowPieceIV1234.setFitWidth(30);
                YellowPieceIV1234.setLayoutX(YellowPieceIV4.getLayoutX());
                YellowPieceIV1234.setLayoutY(YellowPieceIV4.getLayoutY());
                YellowPiece1234L = YellowPiece4L;
                YellowPieceIV1234.setVisible(true);
            }
        }
        YellowPieceIV1234.setOnMouseClicked(event -> {
            if(basepane.yellowFlagOpen) y1234 ++;
            basepane.yellowFlagOpen = false;
            if (basepane.YellowFlag) {
                YellowPieceIV1.setVisible(false);
                YellowPieceIV234.setVisible(false);
                YellowPieceIV2.setVisible(false);
                YellowPieceIV134.setVisible(false);
                YellowPieceIV3.setVisible(false);
                YellowPieceIV124.setVisible(false);
                YellowPieceIV4.setVisible(false);
                YellowPieceIV123.setVisible(false);
                YellowPieceIV12.setVisible(false);
                YellowPieceIV13.setVisible(false);
                YellowPieceIV14.setVisible(false);
                YellowPieceIV23.setVisible(false);
                YellowPieceIV24.setVisible(false);
                YellowPieceIV34.setVisible(false);
                if (YellowPieceIV1234.getLayoutX() == 425 && YellowPieceIV1234.getLayoutY() == 73) {
                    if (YellowNumber1 == 6 || YellowNumber2 == 6) {
                        YellowPieceIV1234.setLayoutX(375);
                        YellowPieceIV1234.setLayoutY(8);
                        basepane.YellowFlag = false;
                        if(basepane.yellowCount > 0 && basepane.yellowCount < 3) ep.setEp("It's still Player1's turn, Please roll the dice ");
                        else ep.setEp("It's Player2's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{
                    if(YellowPiece1234L + basepane.pace1 > 55){
                        YellowPiece1234L = 110 - basepane.pace1 - YellowPiece1234L;
                        YellowPieceIV1234.setLayoutX(getYellowLocationX(YellowPiece1234L));
                        YellowPieceIV1234.setLayoutY(getYellowLocationY(YellowPiece1234L));
                        basepane.YellowBoom(YellowPieceIV1234);
                    }else {
                        YellowPiece1234L += basepane.pace1;
                        YellowPieceIV1234.setLayoutX(getYellowLocationX(YellowPiece1234L));
                        YellowPieceIV1234.setLayoutY(getYellowLocationY(YellowPiece1234L));
                        basepane.YellowBoom(YellowPieceIV1234);
                    }
                    if (YellowPiece1234L == 55) {
                        YellowPieceIV1234.setVisible(false);
                        getWinIV1();
                        getWinIV2();
                        getWinIV3();
                        getWinIV4();
                        getWinWDIV();
                        winNumber += 4;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        YellowPiece1L = -3;
                        YellowPiece2L = -3;
                        YellowPiece3L = -3;
                        YellowPiece4L = -3;
                    }
                    if(YellowPiece1234L == 13){
                        YellowPiece1234L = 29;
                        YellowPieceIV1234.setLayoutX(getYellowLocationX(YellowPiece1234L));
                        YellowPieceIV1234.setLayoutY(getYellowLocationY(YellowPiece1234L));
                        basepane.YellowBoom(YellowPieceIV1234);
                        basepane.YellowShortcut();
                    }
                    else if(YellowPiece1234L == 17){
                        YellowPiece1234L = 33;
                        YellowPieceIV1234.setLayoutX(getYellowLocationX(YellowPiece1234L));
                        YellowPieceIV1234.setLayoutY(getYellowLocationY(YellowPiece1234L));
                        basepane.YellowBoom(YellowPieceIV1234);
                        basepane.YellowShortcut();
                    }
                    else if((YellowPiece1234L - 1) % 4 == 0 && YellowPiece1234L <= 49){
                        YellowPiece1234L += 4;
                        YellowPieceIV1234.setLayoutX(getYellowLocationX(YellowPiece1234L));
                        YellowPieceIV1234.setLayoutY(getYellowLocationY(YellowPiece1234L));
                        basepane.YellowBoom(YellowPieceIV1234);
                    }

                    turn(YellowPiece1234L, YellowPieceIV1234);
                    basepane.YellowFlag = false;
                    if(basepane.yellowCount > 0 && basepane.yellowCount < 3) ep.setEp("It's still Player1's turn, Please roll the dice ");
                    else ep.setEp("It's Player2's turn");
                }
            }
        });
        return YellowPieceIV1234;
    }

    public static ImageView getWinWDIV(){
        WinWDIV.setLayoutX(230);
        WinWDIV.setLayoutY(212);
        WinWDIV.setFitHeight(37);
        WinWDIV.setFitWidth(70);
        WinWDIV.setRotate(-15);
        WinWDIV.setVisible(true);
        return WinWDIV;
    }
    public static ImageView getWinIV1(){
        WinIV1.setLayoutX(414);
        WinIV1.setLayoutY(66);
        WinIV1.setRotate(-15);
        WinIV1.setFitWidth(51);
        WinIV1.setFitHeight(41);
        WinIV1.setVisible(true);
        return WinIV1;
    }
    public static ImageView getWinIV2(){
        WinIV2.setLayoutX(416);
        WinIV2.setLayoutY(20);
        WinIV2.setRotate(-15);
        WinIV2.setFitWidth(51);
        WinIV2.setFitHeight(41);
        WinIV2.setVisible(true);
        return WinIV2;
    }
    public static ImageView getWinIV3(){
        WinIV3.setLayoutX(468);
        WinIV3.setLayoutY(13);
        WinIV3.setRotate(-15);
        WinIV3.setFitWidth(51);
        WinIV3.setFitHeight(41);
        WinIV3.setVisible(true);
        return WinIV3;
    }
    public static ImageView getWinIV4(){
        WinIV4.setLayoutX(469);
        WinIV4.setLayoutY(68);
        WinIV4.setRotate(-15);
        WinIV4.setFitWidth(51);
        WinIV4.setFitHeight(41);
        WinIV4.setVisible(true);
        return WinIV4;
    }

    public static int getYellowLocationX(int xuhao) {

        int[] array40 = {27, 154};
        int[] array41 = {65, 139};
        int[] array42 = {96, 139};
        int[] array43 = {127, 154};
        int[] array44 = {152, 130};
        int[] array45 = {142, 94};
        int[] array46 = {141, 65};
        int[] array47 = {152, 28};
        int[] array48 = {189, 14};
        int[] array49 = {219, 14};
        int[] array1 = {347, 27};
        int[] array2 = {361, 66};
        int[] array3 = {357, 95};
        int[] array4 = {346, 130};
        int[] array5 = {373, 154};
        int[] array6 = {404, 145};
        int[] array7 = {435, 139};
        int[] array8 = {470, 154};
        int[] array9 = {485, 187};
        int[] array10 = {485, 218};
        int[] array11 = {485, 249};
        int[] array12 = {485, 280};
        int[] array13 = {485, 311};
        int[] array14 = {470, 342};
        int[] array15 = {437, 358};
        int[] array16 = {406, 358};
        int[] array17 = {372, 344};
        int[] array18 = {348, 371};
        int[] array19 = {357, 407};
        int[] array20 = {358, 436};
        int[] array21 = {347, 470};
        int[] array22 = {310, 486};
        int[] array23 = {281, 479};
        int[] array24 = {250, 486};
        int[] array25 = {219, 486};
        int[] array26 = {187, 479};//
        int[] array27 = {152, 470};
        int[] array28 = {141, 436};
        int[] array29 = {141, 407};
        int[] array30 = {152, 373};
        int[] array31 = {127, 345};
        int[] array32 = {94, 358};
        int[] array33 = {64, 358};
        int[] array34 = {31, 345};
        int[] array35 = {14, 312};
        int[] array36 = {14, 280};
        int[] array37 = {14, 249};
        int[] array38 = {14, 218};
        int[] array39 = {14, 187};
        //进入重点赛道
        int[] array50 = {250, 14};
        int[] array51 = {250, 64};
        int[] array52 = {250, 94};
        int[] array53 = {250, 124};
        int[] array54 = {250, 160};
        int[] array55 = {250, 191};
        int[] array56 = {250, 221};


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

    public static int getYellowLocationY(int xuhao) {
        int[] array40 = {27, 154};
        int[] array41 = {65, 139};
        int[] array42 = {96, 139};
        int[] array43 = {127, 154};
        int[] array44 = {152, 130};
        int[] array45 = {142, 94};
        int[] array46 = {141, 65};
        int[] array47 = {152, 28};
        int[] array48 = {189, 14};
        int[] array49 = {219, 14};
        int[] array1 = {347, 27};
        int[] array2 = {361, 66};
        int[] array3 = {357, 95};
        int[] array4 = {346, 130};
        int[] array5 = {373, 154};
        int[] array6 = {404, 145};
        int[] array7 = {435, 139};
        int[] array8 = {470, 154};
        int[] array9 = {485, 187};
        int[] array10 = {485, 218};
        int[] array11 = {485, 249};
        int[] array12 = {485, 280};
        int[] array13 = {485, 311};
        int[] array14 = {470, 342};
        int[] array15 = {437, 358};
        int[] array16 = {406, 358};
        int[] array17 = {372, 344};
        int[] array18 = {348, 371};
        int[] array19 = {357, 407};
        int[] array20 = {358, 436};
        int[] array21 = {347, 470};
        int[] array22 = {310, 486};
        int[] array23 = {281, 479};
        int[] array24 = {250, 486};
        int[] array25 = {219, 486};
        int[] array26 = {187, 479};//
        int[] array27 = {152, 470};
        int[] array28 = {141, 436};
        int[] array29 = {141, 407};
        int[] array30 = {152, 373};
        int[] array31 = {127, 345};
        int[] array32 = {94, 358};
        int[] array33 = {64, 358};
        int[] array34 = {31, 345};
        int[] array35 = {14, 312};
        int[] array36 = {14, 280};
        int[] array37 = {14, 249};
        int[] array38 = {14, 218};
        int[] array39 = {14, 187};
        //进入重点赛道
        int[] array50 = {250, 14};
        int[] array51 = {250, 64};
        int[] array52 = {250, 94};
        int[] array53 = {250, 124};
        int[] array54 = {250, 160};
        int[] array55 = {250, 191};
        int[] array56 = {250, 221};

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

