package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Green {
    static int g1 = 0;
    static int g2 = 0;
    static int g3 = 0;
    static int g4 = 0;
    static int g12 = 0;
    static int g13 = 0;
    static int g14 = 0;
    static int g23 = 0;
    static int g24 = 0;
    static int g34 = 0;
    static int g123 = 0;
    static int g124 = 0;
    static int g134 = 0;
    static int g234 = 0;
    static int g1234 = 0;
    static int GreenPiece1L = -2;
    static int GreenPiece2L = -2;
    static int GreenPiece3L = -2;
    static int GreenPiece4L = -2;
    static int GreenPiece12L = -2;
    static int GreenPiece13L = -2;
    static int GreenPiece14L = -2;
    static int GreenPiece23L = -2;
    static int GreenPiece24L = -2;
    static int GreenPiece34L = -2;
    static int GreenPiece123L = -2;
    static int GreenPiece124L = -2;
    static int GreenPiece134L = -2;
    static int GreenPiece234L = -2;
    static int GreenPiece1234L = -2;
    static int GreenNumber1 = 0;
    static int GreenNumber2 = 0;
    static int winNumber = 0;
    static Image WinIM = new Image("WinIM.jpg");
    static Image WinWDIM = new Image("WinWD.png");
    static ImageView WinWDIV = new ImageView(WinWDIM);
    static ImageView WinIV1= new ImageView(WinIM);
    static ImageView WinIV2= new ImageView(WinIM);
    static ImageView WinIV3= new ImageView(WinIM);
    static ImageView WinIV4= new ImageView(WinIM);

    static Image GreenPieceImg1 = new Image("GreenPiece.png");
    static ImageView GreenPieceIV1 = new ImageView(GreenPieceImg1);
    static Image GreenPieceImg2 = new Image("GreenPiece.png");
    static ImageView GreenPieceIV2 = new ImageView(GreenPieceImg2);
    static Image GreenPieceImg3 = new Image("GreenPiece.png");
    static ImageView GreenPieceIV3 = new ImageView(GreenPieceImg3);
    static Image GreenPieceImg4 = new Image("GreenPiece.png");
    static ImageView GreenPieceIV4 = new ImageView(GreenPieceImg4);
    static Image GreenIM12 = new Image("GTW.png");
    static Image GreenIM123 = new Image("GTR.png");
    static Image GreenIM1234 = new Image("GF.png");
    static ImageView GreenPieceIV1234 = new ImageView(GreenIM1234);
    static ImageView GreenPieceIV123 = new ImageView(GreenIM123);
    static ImageView GreenPieceIV124 = new ImageView(GreenIM123);
    static ImageView GreenPieceIV134 = new ImageView(GreenIM123);
    static ImageView GreenPieceIV234 = new ImageView(GreenIM123);
    static ImageView GreenPieceIV12 = new ImageView(GreenIM12);
    static ImageView GreenPieceIV13 = new ImageView(GreenIM12);
    static ImageView GreenPieceIV14 = new ImageView(GreenIM12);
    static ImageView GreenPieceIV23 = new ImageView(GreenIM12);
    static ImageView GreenPieceIV24 = new ImageView(GreenIM12);
    static ImageView GreenPieceIV34 = new ImageView(GreenIM12);

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

    public static ImageView getGreenPiece1() {
        GreenPieceIV1.setLayoutX(75);
        GreenPieceIV1.setLayoutY(478);
        GreenPieceIV1.setFitHeight(30);
        GreenPieceIV1.setFitWidth(30);
        GreenPieceIV1.setRotate(180);
        GreenPieceIV1.setOnMouseClicked(event -> {
            if(basepane.greenFlagOpen == true) g1 ++;
            basepane.greenFlagOpen = false;
            if(basepane.GreenFlag) {
                if (GreenPieceIV1.getLayoutX() == 75 && GreenPieceIV1.getLayoutY() == 478) {
                    if (GreenNumber1 == 6 || GreenNumber2 == 6) {

                        GreenPieceIV1.setLayoutX(126);
                        GreenPieceIV1.setLayoutY(498);
                        GreenPiece1L ++;
                        basepane.GreenFlag = false;
                        if(basepane.greenCount > 0 && basepane.greenCount < 3) ep.setEp("It's still Player3's turn, Please roll the dice ");
                        else ep.setEp("It's Player4's turn");
                    } else {
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                } else {
                    if(GreenPiece1L + basepane.pace1 > 55){
                        GreenPiece1L = 110 - basepane.pace1 - GreenPiece1L;
                        GreenPieceIV1.setLayoutX(getGreenLocationX(GreenPiece1L));
                        GreenPieceIV1.setLayoutY(getGreenLocationY(GreenPiece1L));
                        basepane.GreenBoom(GreenPieceIV1);
                    }else {
                        GreenPiece1L += basepane.pace1;
                        GreenPieceIV1.setLayoutX(getGreenLocationX(GreenPiece1L));
                        GreenPieceIV1.setLayoutY(getGreenLocationY(GreenPiece1L));
                        basepane.GreenBoom(GreenPieceIV1);
                    }
                    if(GreenPiece1L == 55){
                        GreenPieceIV1.setVisible(false);
                        getWinIV1();
                        getWinWDIV();
                        winNumber ++ ;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        GreenPiece1L = -3;
                    }
                    if(GreenPiece1L == 13){
                        GreenPiece1L = 29;
                        GreenPieceIV1.setLayoutX(getGreenLocationX(GreenPiece1L));
                        GreenPieceIV1.setLayoutY(getGreenLocationY(GreenPiece1L));
                        basepane.GreenBoom(GreenPieceIV1);
                        basepane.GreenShortcut();
                    }
                    else if(GreenPiece1L == 17){
                        GreenPiece1L = 33;
                        GreenPieceIV1.setLayoutX(getGreenLocationX(GreenPiece1L));
                        GreenPieceIV1.setLayoutY(getGreenLocationY(GreenPiece1L));
                        basepane.GreenBoom(GreenPieceIV1);
                        basepane.GreenShortcut();
                    }
                    else if((GreenPiece1L - 1) % 4 == 0 && GreenPiece1L <= 49){
                        GreenPiece1L += 4;
                        GreenPieceIV1.setLayoutX(getGreenLocationX(GreenPiece1L));
                        GreenPieceIV1.setLayoutY(getGreenLocationY(GreenPiece1L));
                        basepane.GreenBoom(GreenPieceIV1);
                    }
                    turn(GreenPiece1L,GreenPieceIV1);
                    basepane.GreenFlag = false;
                    if(basepane.greenCount > 0 && basepane.greenCount < 3) ep.setEp("It's still Player3's turn, Please roll the dice ");
                    else ep.setEp("It's Player4's turn");
                }
            }
            getGreenIV12();
            getGreenIV13();
            getGreenIV14();
            getGreenIV123();
            getGreenIV124();
            getGreenIV134();
            getGreenIV1234();
        });
        return GreenPieceIV1;
    }


    public static ImageView getGreenPiece3() {
        GreenPieceIV3.setLayoutX(75);
        GreenPieceIV3.setLayoutY(426);
        GreenPieceIV3.setFitHeight(30);
        GreenPieceIV3.setFitWidth(30);
        GreenPieceIV3.setRotate(180);
        GreenPieceIV3.setOnMouseClicked(event -> {
            if(basepane.greenFlagOpen == true) g3 ++;
            basepane.greenFlagOpen = false;
            if(basepane.GreenFlag) {
                if (GreenPieceIV3.getLayoutX() == 75 && GreenPieceIV3.getLayoutY() == 426) {
                    if (GreenNumber1 == 6 || GreenNumber2 == 6) {

                        GreenPieceIV3.setLayoutX(126);
                        GreenPieceIV3.setLayoutY(498);
                        GreenPiece3L ++;
                        basepane.GreenFlag = false;
                        if(basepane.greenCount > 0 && basepane.greenCount < 3) ep.setEp("It's still Player3's turn, Please roll the dice ");
                        else ep.setEp("It's Player4's turn");
                    } else {
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                } else {
                    if(GreenPiece3L + basepane.pace1 > 55){
                        GreenPiece3L = 110 - basepane.pace1 - GreenPiece3L;
                        GreenPieceIV3.setLayoutX(getGreenLocationX(GreenPiece3L));
                        GreenPieceIV3.setLayoutY(getGreenLocationY(GreenPiece3L));
                        basepane.GreenBoom(GreenPieceIV3);
                    }else {
                        GreenPiece3L += basepane.pace1;
                        GreenPieceIV3.setLayoutX(getGreenLocationX(GreenPiece3L));
                        GreenPieceIV3.setLayoutY(getGreenLocationY(GreenPiece3L));
                        basepane.GreenBoom(GreenPieceIV3);
                    }
                    if(GreenPiece3L == 55){
                        GreenPieceIV3.setVisible(false);
                        getWinIV3();
                        getWinWDIV();
                        winNumber ++ ;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        GreenPiece3L = -3;
                    }
                    if(GreenPiece3L == 13){
                        GreenPiece3L = 29;
                        GreenPieceIV3.setLayoutX(getGreenLocationX(GreenPiece3L));
                        GreenPieceIV3.setLayoutY(getGreenLocationY(GreenPiece3L));
                        basepane.GreenBoom(GreenPieceIV3);
                        basepane.GreenShortcut();
                    }
                    else if(GreenPiece3L == 17){
                        GreenPiece3L = 33;
                        GreenPieceIV3.setLayoutX(getGreenLocationX(GreenPiece3L));
                        GreenPieceIV3.setLayoutY(getGreenLocationY(GreenPiece3L));
                        basepane.GreenBoom(GreenPieceIV3);
                        basepane.GreenShortcut();
                    }
                    else if((GreenPiece3L - 1) % 4 == 0 && GreenPiece3L <= 49){
                        GreenPiece3L += 4;
                        GreenPieceIV3.setLayoutX(getGreenLocationX(GreenPiece3L));
                        GreenPieceIV3.setLayoutY(getGreenLocationY(GreenPiece3L));
                        basepane.GreenBoom(GreenPieceIV3);
                    }
                    turn(GreenPiece3L,GreenPieceIV3);
                    basepane.GreenFlag = false;
                    if(basepane.greenCount > 0 && basepane.greenCount < 3) ep.setEp("It's still Player3's turn, Please roll the dice ");
                    else ep.setEp("It's Player4's turn");
                }
            }
            getGreenIV13();
            getGreenIV23();
            getGreenIV34();
            getGreenIV123();
            getGreenIV134();
            getGreenIV234();
            getGreenIV1234();
        });
        return GreenPieceIV3;
    }

    public static ImageView getGreenPiece2() {
        GreenPieceIV2.setLayoutX(23);
        GreenPieceIV2.setLayoutY(426);
        GreenPieceIV2.setFitHeight(30);
        GreenPieceIV2.setFitWidth(30);
        GreenPieceIV2.setRotate(180);
        GreenPieceIV2.setOnMouseClicked(event -> {
            if(basepane.greenFlagOpen == true) g2 ++;
            basepane.greenFlagOpen = false;
            if(basepane.GreenFlag) {
                if (GreenPieceIV2.getLayoutX() == 23 && GreenPieceIV2.getLayoutY() == 426) {
                    if (GreenNumber1 == 6 || GreenNumber2 == 6) {

                        GreenPieceIV2.setLayoutX(126);
                        GreenPieceIV2.setLayoutY(498);
                        GreenPiece2L ++;
                        basepane.GreenFlag = false;
                        if(basepane.greenCount > 0 && basepane.greenCount < 3) ep.setEp("It's still Player3's turn, Please roll the dice ");
                        else ep.setEp("It's Player4's turn");
                    } else {
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                } else {
                    if(GreenPiece2L + basepane.pace1 > 55){
                        GreenPiece2L = 110 - basepane.pace1 - GreenPiece2L;
                        GreenPieceIV2.setLayoutX(getGreenLocationX(GreenPiece2L));
                        GreenPieceIV2.setLayoutY(getGreenLocationY(GreenPiece2L));
                        basepane.GreenBoom(GreenPieceIV2);
                    }else {
                        GreenPiece2L += basepane.pace1;
                        GreenPieceIV2.setLayoutX(getGreenLocationX(GreenPiece2L));
                        GreenPieceIV2.setLayoutY(getGreenLocationY(GreenPiece2L));
                        basepane.GreenBoom(GreenPieceIV2);
                    }
                    if(GreenPiece2L == 55){
                        GreenPieceIV2.setVisible(false);
                        getWinIV2();
                        getWinWDIV();
                        winNumber ++ ;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        GreenPiece2L = -3;
                    }
                    if(GreenPiece2L == 13){
                        GreenPiece2L = 29;
                        GreenPieceIV2.setLayoutX(getGreenLocationX(GreenPiece2L));
                        GreenPieceIV2.setLayoutY(getGreenLocationY(GreenPiece2L));
                        basepane.GreenBoom(GreenPieceIV2);
                        basepane.GreenShortcut();
                    }
                    else if(GreenPiece2L == 17){
                        GreenPiece2L = 33;
                        GreenPieceIV2.setLayoutX(getGreenLocationX(GreenPiece2L));
                        GreenPieceIV2.setLayoutY(getGreenLocationY(GreenPiece2L));
                        basepane.GreenBoom(GreenPieceIV2);
                        basepane.GreenShortcut();
                    }
                    else if((GreenPiece2L - 1) % 4 == 0 && GreenPiece2L <= 49){
                        GreenPiece2L += 4;
                        GreenPieceIV2.setLayoutX(getGreenLocationX(GreenPiece2L));
                        GreenPieceIV2.setLayoutY(getGreenLocationY(GreenPiece2L));
                        basepane.GreenBoom(GreenPieceIV2);
                    }
                    turn(GreenPiece2L,GreenPieceIV2);
                    basepane.GreenFlag = false;
                    if(basepane.greenCount > 0 && basepane.greenCount < 3) ep.setEp("It's still Player3's turn, Please roll the dice ");
                    else ep.setEp("It's Player4's turn");
                }
            }
            getGreenIV12();
            getGreenIV23();
            getGreenIV24();
            getGreenIV123();
            getGreenIV124();
            getGreenIV234();
            getGreenIV1234();
        });
        return GreenPieceIV2;
    }

    public static ImageView getGreenPiece4() {
        GreenPieceIV4.setLayoutX(20);
        GreenPieceIV4.setLayoutY(478);
        GreenPieceIV4.setFitHeight(30);
        GreenPieceIV4.setFitWidth(30);
        GreenPieceIV4.setRotate(180);
        GreenPieceIV4.setOnMouseClicked(event -> {
            if(basepane.greenFlagOpen == true) g4 ++;
            basepane.greenFlagOpen = false;
            if(basepane.GreenFlag) {
                if (GreenPieceIV4.getLayoutX() == 20 && GreenPieceIV4.getLayoutY() == 478) {
                    if (GreenNumber1 == 6 || GreenNumber2 == 6) {

                        GreenPieceIV4.setLayoutX(126);
                        GreenPieceIV4.setLayoutY(498);
                        GreenPiece4L ++;
                        basepane.GreenFlag = false;
                        if(basepane.greenCount > 0 && basepane.greenCount < 3) ep.setEp("It's still Player3's turn, Please roll the dice ");
                        else ep.setEp("It's Player4's turn");
                    } else {
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                } else {
                    if(GreenPiece4L + basepane.pace1 > 55){
                        GreenPiece4L = 110 - basepane.pace1 - GreenPiece4L;
                        GreenPieceIV4.setLayoutX(getGreenLocationX(GreenPiece4L));
                        GreenPieceIV4.setLayoutY(getGreenLocationY(GreenPiece4L));
                        basepane.GreenBoom(GreenPieceIV4);
                    }else {
                        GreenPiece4L += basepane.pace1;
                        GreenPieceIV4.setLayoutX(getGreenLocationX(GreenPiece4L));
                        GreenPieceIV4.setLayoutY(getGreenLocationY(GreenPiece4L));
                        basepane.GreenBoom(GreenPieceIV4);
                    }
                    if(GreenPiece4L == 55){
                        GreenPieceIV4.setVisible(false);
                        getWinIV4();
                        getWinWDIV();
                        winNumber ++ ;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        GreenPiece4L = -3;
                    }
                    if(GreenPiece4L == 13){
                        GreenPiece4L = 29;
                        GreenPieceIV4.setLayoutX(getGreenLocationX(GreenPiece4L));
                        GreenPieceIV4.setLayoutY(getGreenLocationY(GreenPiece4L));
                        basepane.GreenBoom(GreenPieceIV4);
                        basepane.GreenShortcut();
                    }

                    else if(GreenPiece4L == 17){
                        GreenPiece4L = 33;
                        GreenPieceIV4.setLayoutX(getGreenLocationX(GreenPiece4L));
                        GreenPieceIV4.setLayoutY(getGreenLocationY(GreenPiece4L));
                        basepane.GreenBoom(GreenPieceIV4);
                        basepane.GreenShortcut();
                    }
                    else if((GreenPiece4L - 1) % 4 == 0 && GreenPiece4L <= 49){
                        GreenPiece4L += 4;
                        GreenPieceIV4.setLayoutX(getGreenLocationX(GreenPiece4L));
                        GreenPieceIV4.setLayoutY(getGreenLocationY(GreenPiece4L));
                        basepane.GreenBoom(GreenPieceIV4);
                    }
                    turn(GreenPiece4L,GreenPieceIV4);
                    basepane.GreenFlag = false;
                    if(basepane.greenCount > 0 && basepane.greenCount < 3) ep.setEp("It's still Player3's turn, Please roll the dice ");
                    else ep.setEp("It's Player4's turn");
                }
            }
            getGreenIV14();
            getGreenIV24();
            getGreenIV34();
            getGreenIV124();
            getGreenIV134();
            getGreenIV234();
            getGreenIV1234();
        });
        return GreenPieceIV4;
    }
    public static ImageView getGreenIV12(){
        GreenPieceIV12.setVisible(false);
        if(GreenPiece1L != -2 ) {
            if (GreenPieceIV1.isVisible() && GreenPieceIV2.isVisible() &&GreenPiece1L == GreenPiece2L) {
                GreenPieceIV1.setVisible(false);
                GreenPieceIV2.setVisible(false);
                GreenPieceIV12.setFitHeight(30);
                GreenPieceIV12.setFitWidth(30);
                GreenPieceIV12.setLayoutX(GreenPieceIV1.getLayoutX());
                GreenPieceIV12.setLayoutY(GreenPieceIV1.getLayoutY());
                GreenPiece12L = GreenPiece1L;
                GreenPieceIV12.setVisible(true);
            }
        }
        GreenPieceIV12.setOnMouseClicked(event -> {
            if(basepane.greenFlagOpen) g12 ++;
            basepane.greenFlagOpen = false;
            if (basepane.GreenFlag) {
                if(GreenPiece12L + basepane.pace1 > 55 ){
                    GreenPiece12L = 110 - basepane.pace1 - GreenPiece12L;
                    GreenPieceIV12.setLayoutX(getGreenLocationX(GreenPiece12L));
                    GreenPieceIV12.setLayoutY(getGreenLocationY(GreenPiece12L));
                    basepane.GreenBoom(GreenPieceIV12);

                }
                else {
                    GreenPiece12L += basepane.pace1;
                    GreenPieceIV12.setLayoutX(getGreenLocationX(GreenPiece12L));
                    GreenPieceIV12.setLayoutY(getGreenLocationY(GreenPiece12L));
                    basepane.GreenBoom(GreenPieceIV12);

                }
                if (GreenPiece12L == 55) {
                    GreenPieceIV12.setVisible(false);
                    getWinIV1();
                    getWinIV2();
                    getWinWDIV();
                    winNumber += 2;
                    if(winNumber == 4){
                        new WinPane().display("ConGratulations!","Green is winner!");
                    }
                    GreenPiece1L = -3;
                    GreenPiece2L = -3;
                }
                if(GreenPiece12L == 13){
                    GreenPiece12L = 29;
                    GreenPieceIV12.setLayoutX(getGreenLocationX(GreenPiece12L));
                    GreenPieceIV12.setLayoutY(getGreenLocationY(GreenPiece12L));
                    basepane.GreenBoom(GreenPieceIV12);
                    basepane.GreenShortcut();
                }
                else if(GreenPiece12L == 17){
                    GreenPiece12L = 33;
                    GreenPieceIV12.setLayoutX(getGreenLocationX(GreenPiece12L));
                    GreenPieceIV12.setLayoutY(getGreenLocationY(GreenPiece12L));
                    basepane.GreenBoom(GreenPieceIV12);
                    basepane.GreenShortcut();
                }
                else if((GreenPiece12L - 1) % 4 == 0 && GreenPiece12L <= 49){
                    GreenPiece12L += 4;
                    GreenPieceIV12.setLayoutX(getGreenLocationX(GreenPiece12L));
                    GreenPieceIV12.setLayoutY(getGreenLocationY(GreenPiece12L));
                    basepane.GreenBoom(GreenPieceIV12);
                }

                turn(GreenPiece12L,GreenPieceIV12);
                basepane.GreenFlag = false;
                if(basepane.greenCount > 0 && basepane.greenCount < 3) ep.setEp("It's still Player3's turn, Please roll the dice ");
                else ep.setEp("It's Player4's turn");

            }
            getGreenIV123();
            getGreenIV124();
            getGreenIV1234();
        });
        return GreenPieceIV12;
    }
    public static ImageView getGreenIV13(){
        GreenPieceIV13.setVisible(false);
        if(GreenPiece1L != -2 ) {
            if (GreenPieceIV1.isVisible() && GreenPieceIV3.isVisible() &&GreenPiece1L == GreenPiece3L) {
                GreenPieceIV1.setVisible(false);
                GreenPieceIV3.setVisible(false);
                GreenPieceIV13.setFitHeight(30);
                GreenPieceIV13.setFitWidth(30);
                GreenPieceIV13.setLayoutX(GreenPieceIV1.getLayoutX());
                GreenPieceIV13.setLayoutY(GreenPieceIV1.getLayoutY());
                GreenPiece13L = GreenPiece1L;
                GreenPieceIV13.setVisible(true);
            }
        }
        GreenPieceIV13.setOnMouseClicked(event -> {
            if(basepane.greenFlagOpen) g13 ++;
            basepane.greenFlagOpen = false;
            if (basepane.GreenFlag) {
                if (GreenPieceIV13.getLayoutX() == 425 && GreenPieceIV13.getLayoutY() == 73) {
                    if (GreenNumber1 == 6 || GreenNumber2 == 6) {
                        GreenPieceIV13.setLayoutX(375);
                        GreenPieceIV13.setLayoutY(8);
                        basepane.GreenFlag = false;
                        if(basepane.greenCount > 0 && basepane.greenCount < 3) ep.setEp("It's still Player2's turn, Please roll the dice ");
                        else ep.setEp("It's Player3's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{

                    if(GreenPiece13L + basepane.pace1 > 55 ){
                        GreenPiece13L = 110 - basepane.pace1 - GreenPiece13L;
                        GreenPieceIV13.setLayoutX(getGreenLocationX(GreenPiece13L));
                        GreenPieceIV13.setLayoutY(getGreenLocationY(GreenPiece13L));
                        basepane.GreenBoom(GreenPieceIV13);

                    }
                    else {
                        GreenPiece13L += basepane.pace1;
                        GreenPieceIV13.setLayoutX(getGreenLocationX(GreenPiece13L));
                        GreenPieceIV13.setLayoutY(getGreenLocationY(GreenPiece13L));
                        basepane.GreenBoom(GreenPieceIV13);

                    }
                    if (GreenPiece13L == 55) {
                        GreenPieceIV13.setVisible(false);
                        getWinIV1();
                        getWinIV3();
                        getWinWDIV();
                        winNumber += 2;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        GreenPiece1L = -3;
                        GreenPiece3L = -3;
                    }
                    if(GreenPiece13L == 13){
                        GreenPiece13L = 29;
                        GreenPieceIV13.setLayoutX(getGreenLocationX(GreenPiece13L));
                        GreenPieceIV13.setLayoutY(getGreenLocationY(GreenPiece13L));
                        basepane.GreenBoom(GreenPieceIV13);
                        basepane.GreenShortcut();
                    }
                    else if(GreenPiece13L == 17){
                        GreenPiece13L = 33;
                        GreenPieceIV13.setLayoutX(getGreenLocationX(GreenPiece13L));
                        GreenPieceIV13.setLayoutY(getGreenLocationY(GreenPiece13L));
                        basepane.GreenBoom(GreenPieceIV13);
                        basepane.GreenShortcut();
                    }
                    else if((GreenPiece13L - 1) % 4 == 0 && GreenPiece13L <= 49){
                        GreenPiece13L += 4;
                        GreenPieceIV13.setLayoutX(getGreenLocationX(GreenPiece13L));
                        GreenPieceIV13.setLayoutY(getGreenLocationY(GreenPiece13L));
                        basepane.GreenBoom(GreenPieceIV13);
                    }

                    turn(GreenPiece13L,GreenPieceIV13);
                    basepane.GreenFlag = false;
                    if(basepane.greenCount > 0 && basepane.greenCount < 3) ep.setEp("It's still Player3's turn, Please roll the dice ");
                    else ep.setEp("It's Player4's turn");
                }
            }
            getGreenIV123();
            getGreenIV134();
            getGreenIV1234();
        });
        return GreenPieceIV13;
    }
    public static ImageView getGreenIV14(){
        GreenPieceIV14.setVisible(false);
        if(GreenPiece1L != -2 ) {
            if (GreenPieceIV1.isVisible() && GreenPieceIV4.isVisible() &&GreenPiece1L == GreenPiece4L) {
                GreenPieceIV1.setVisible(false);
                GreenPieceIV4.setVisible(false);
                GreenPieceIV14.setFitHeight(30);
                GreenPieceIV14.setFitWidth(30);
                GreenPieceIV14.setLayoutX(GreenPieceIV1.getLayoutX());
                GreenPieceIV14.setLayoutY(GreenPieceIV1.getLayoutY());
                GreenPiece14L = GreenPiece1L;
                GreenPieceIV14.setVisible(true);
            }
        }
        GreenPieceIV14.setOnMouseClicked(event -> {
            if(basepane.greenFlagOpen) g14 ++;
            basepane.greenFlagOpen = false;
            if (basepane.GreenFlag) {
                if (GreenPieceIV14.getLayoutX() == 425 && GreenPieceIV14.getLayoutY() == 73) {
                    if (GreenNumber1 == 6 || GreenNumber2 == 6) {
                        GreenPieceIV14.setLayoutX(375);
                        GreenPieceIV14.setLayoutY(8);
                        basepane.GreenFlag = false;
                        if(basepane.greenCount > 0 && basepane.greenCount < 3) ep.setEp("It's still Player2's turn, Please roll the dice ");
                        else ep.setEp("It's Player3's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{

                    if(GreenPiece14L + basepane.pace1 > 55){
                        GreenPiece14L = 110 - basepane.pace1 - GreenPiece14L;
                        GreenPieceIV14.setLayoutX(getGreenLocationX(GreenPiece14L));
                        GreenPieceIV14.setLayoutY(getGreenLocationY(GreenPiece14L));
                        basepane.GreenBoom(GreenPieceIV14);

                    }

                    else {
                        GreenPiece14L += basepane.pace1;
                        GreenPieceIV14.setLayoutX(getGreenLocationX(GreenPiece14L));
                        GreenPieceIV14.setLayoutY(getGreenLocationY(GreenPiece14L));
                        basepane.GreenBoom(GreenPieceIV14);

                    }
                    if (GreenPiece14L == 55) {
                        GreenPieceIV14.setVisible(false);
                        getWinIV1();
                        getWinIV4();
                        getWinWDIV();
                        winNumber += 2;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        GreenPiece1L = -3;
                        GreenPiece4L = -3;
                    }
                    if(GreenPiece14L == 13){
                        GreenPiece14L = 29;
                        GreenPieceIV14.setLayoutX(getGreenLocationX(GreenPiece14L));
                        GreenPieceIV14.setLayoutY(getGreenLocationY(GreenPiece14L));
                        basepane.GreenBoom(GreenPieceIV14);
                        basepane.GreenShortcut();
                    }
                    else if(GreenPiece14L == 17){
                        GreenPiece14L = 33;
                        GreenPieceIV14.setLayoutX(getGreenLocationX(GreenPiece14L));
                        GreenPieceIV14.setLayoutY(getGreenLocationY(GreenPiece14L));
                        basepane.GreenBoom(GreenPieceIV14);
                        basepane.GreenShortcut();
                    }
                    else if((GreenPiece14L - 1) % 4 == 0 && GreenPiece14L <= 49){
                        GreenPiece14L += 4;
                        GreenPieceIV14.setLayoutX(getGreenLocationX(GreenPiece14L));
                        GreenPieceIV14.setLayoutY(getGreenLocationY(GreenPiece14L));
                        basepane.GreenBoom(GreenPieceIV14);
                    }

                    turn(GreenPiece14L,GreenPieceIV14);
                    basepane.GreenFlag = false;
                    if(basepane.greenCount > 0 && basepane.greenCount < 3) ep.setEp("It's still Player3's turn, Please roll the dice ");
                    else ep.setEp("It's Player4's turn");
                }
            }
            getGreenIV124();
            getGreenIV134();
            getGreenIV1234();
        });
        return GreenPieceIV14;
    }
    public static ImageView getGreenIV23(){
        GreenPieceIV23.setVisible(false);
        if(GreenPiece2L != -2 ) {
            if (GreenPieceIV2.isVisible() && GreenPieceIV3.isVisible() &&GreenPiece2L == GreenPiece3L) {
                GreenPieceIV2.setVisible(false);
                GreenPieceIV3.setVisible(false);
                GreenPieceIV23.setFitHeight(30);
                GreenPieceIV23.setFitWidth(30);
                GreenPieceIV23.setLayoutX(GreenPieceIV2.getLayoutX());
                GreenPieceIV23.setLayoutY(GreenPieceIV2.getLayoutY());
                GreenPiece23L = GreenPiece2L;
                GreenPieceIV23.setVisible(true);
            }
        }
        GreenPieceIV23.setOnMouseClicked(event -> {
            if(basepane.greenFlagOpen) g23 ++;
            basepane.greenFlagOpen = false;
            if (basepane.GreenFlag) {
                if (GreenPieceIV23.getLayoutX() == 425 && GreenPieceIV23.getLayoutY() == 73) {
                    if (GreenNumber1 == 6 || GreenNumber2 == 6) {
                        GreenPieceIV23.setLayoutX(375);
                        GreenPieceIV23.setLayoutY(8);
                        basepane.GreenFlag = false;
                        if(basepane.greenCount > 0 && basepane.greenCount < 3) ep.setEp("It's still Player1's turn, Please roll the dice ");
                        else ep.setEp("It's Player2's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{

                    if(GreenPiece23L + basepane.pace1 > 55){
                        GreenPiece23L = 110 - basepane.pace1 - GreenPiece23L;
                        GreenPieceIV23.setLayoutX(getGreenLocationX(GreenPiece23L));
                        GreenPieceIV23.setLayoutY(getGreenLocationY(GreenPiece23L));
                        basepane.GreenBoom(GreenPieceIV23);

                    }
                    else {
                        GreenPiece23L += basepane.pace1;
                        GreenPieceIV23.setLayoutX(getGreenLocationX(GreenPiece23L));
                        GreenPieceIV23.setLayoutY(getGreenLocationY(GreenPiece23L));
                        basepane.GreenBoom(GreenPieceIV23);

                    }
                    if (GreenPiece23L == 55) {
                        GreenPieceIV23.setVisible(false);
                        getWinIV3();
                        getWinIV2();
                        getWinWDIV();
                        winNumber += 2;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        GreenPiece3L = -3;
                        GreenPiece2L = -3;
                    }
                    if(GreenPiece23L == 13){//
                        GreenPiece23L = 29;
                        GreenPieceIV23.setLayoutX(getGreenLocationX(GreenPiece23L));
                        GreenPieceIV23.setLayoutY(getGreenLocationY(GreenPiece23L));
                        basepane.GreenBoom(GreenPieceIV23);
                        basepane.GreenShortcut();
                    }
                    else if(GreenPiece23L == 17){
                        GreenPiece23L = 33;
                        GreenPieceIV23.setLayoutX(getGreenLocationX(GreenPiece23L));
                        GreenPieceIV23.setLayoutY(getGreenLocationY(GreenPiece23L));
                        basepane.GreenBoom(GreenPieceIV23);
                        basepane.GreenShortcut();
                    }
                    else if((GreenPiece23L - 1) % 4 == 0 && GreenPiece23L <= 49){
                        GreenPiece23L += 4;
                        GreenPieceIV23.setLayoutX(getGreenLocationX(GreenPiece23L));
                        GreenPieceIV23.setLayoutY(getGreenLocationY(GreenPiece23L));
                        basepane.GreenBoom(GreenPieceIV23);
                    }

                    turn(GreenPiece23L,GreenPieceIV23);
                    basepane.GreenFlag = false;
                    if(basepane.greenCount > 0 && basepane.greenCount < 3) ep.setEp("It's still Player3's turn, Please roll the dice ");
                    else ep.setEp("It's Player4's turn");
                }
            }
            getGreenIV123();
            getGreenIV234();
            getGreenIV1234();
        });
        return GreenPieceIV23;
    }
    public static ImageView getGreenIV24(){
        GreenPieceIV24.setVisible(false);
        if(GreenPiece2L != -2 ) {
            if (GreenPieceIV2.isVisible() && GreenPieceIV4.isVisible() &&GreenPiece2L == GreenPiece4L) {
                GreenPieceIV2.setVisible(false);
                GreenPieceIV4.setVisible(false);
                GreenPieceIV24.setFitHeight(30);
                GreenPieceIV24.setFitWidth(30);
                GreenPieceIV24.setLayoutX(GreenPieceIV2.getLayoutX());
                GreenPieceIV24.setLayoutY(GreenPieceIV2.getLayoutY());
                GreenPiece24L = GreenPiece2L;
                GreenPieceIV24.setVisible(true);
            }
        }
        GreenPieceIV24.setOnMouseClicked(event -> {
            if(basepane.greenFlagOpen) g24 ++;
            basepane.greenFlagOpen = false;
            if (basepane.GreenFlag) {
                if (GreenPieceIV24.getLayoutX() == 425 && GreenPieceIV24.getLayoutY() == 73) {
                    if (GreenNumber1 == 6 || GreenNumber2 == 6) {
                        GreenPieceIV24.setLayoutX(375);
                        GreenPieceIV24.setLayoutY(8);
                        basepane.GreenFlag = false;
                        if(basepane.greenCount > 0 && basepane.greenCount < 3) ep.setEp("It's still Player3's turn, Please roll the dice ");
                        else ep.setEp("It's Player4's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{

                    if(GreenPiece24L + basepane.pace1 > 55 ){
                        GreenPiece24L = 110 - basepane.pace1 - GreenPiece24L;
                        GreenPieceIV24.setLayoutX(getGreenLocationX(GreenPiece24L));
                        GreenPieceIV24.setLayoutY(getGreenLocationY(GreenPiece24L));
                        basepane.GreenBoom(GreenPieceIV24);

                    }

                    else{
                        GreenPiece24L += basepane.pace1;
                        GreenPieceIV24.setLayoutX(getGreenLocationX(GreenPiece24L));
                        GreenPieceIV24.setLayoutY(getGreenLocationY(GreenPiece24L));
                        basepane.GreenBoom(GreenPieceIV24);

                    }
                    if (GreenPiece24L == 55) {
                        GreenPieceIV24.setVisible(false);
                        getWinIV4();
                        getWinIV2();
                        getWinWDIV();
                        winNumber += 2;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        GreenPiece4L = -3;
                        GreenPiece2L = -3;
                    }
                    if(GreenPiece24L == 13){//
                        GreenPiece24L = 29;
                        GreenPieceIV24.setLayoutX(getGreenLocationX(GreenPiece24L));
                        GreenPieceIV24.setLayoutY(getGreenLocationY(GreenPiece24L));
                        basepane.GreenBoom(GreenPieceIV24);
                        basepane.GreenShortcut();
                    }
                    else if(GreenPiece24L == 17){
                        GreenPiece24L = 33;
                        GreenPieceIV24.setLayoutX(getGreenLocationX(GreenPiece24L));
                        GreenPieceIV24.setLayoutY(getGreenLocationY(GreenPiece24L));
                        basepane.GreenBoom(GreenPieceIV24);
                        basepane.GreenShortcut();
                    }
                    else if((GreenPiece24L - 1) % 4 == 0 && GreenPiece24L <= 49){
                        GreenPiece24L += 4;
                        GreenPieceIV24.setLayoutX(getGreenLocationX(GreenPiece24L));
                        GreenPieceIV24.setLayoutY(getGreenLocationY(GreenPiece24L));
                        basepane.GreenBoom(GreenPieceIV24);
                    }

                    turn(GreenPiece24L,GreenPieceIV24);
                    basepane.GreenFlag = false;
                    if(basepane.greenCount > 0 && basepane.greenCount < 3) ep.setEp("It's still Player3's turn, Please roll the dice ");
                    else ep.setEp("It's Player4's turn");
                }
            }
            getGreenIV124();
            getGreenIV234();
            getGreenIV1234();
        });
        return GreenPieceIV24;
    }
    public static ImageView getGreenIV34(){
        GreenPieceIV34.setVisible(false);
        if(GreenPiece3L != -2 ) {
            if (GreenPieceIV3.isVisible() && GreenPieceIV4.isVisible() &&GreenPiece3L == GreenPiece4L) {
                GreenPieceIV4.setVisible(false);
                GreenPieceIV3.setVisible(false);
                GreenPieceIV34.setFitHeight(30);
                GreenPieceIV34.setFitWidth(30);
                GreenPieceIV34.setLayoutX(GreenPieceIV3.getLayoutX());
                GreenPieceIV34.setLayoutY(GreenPieceIV3.getLayoutY());
                GreenPiece34L = GreenPiece3L;
                GreenPieceIV34.setVisible(true);
            }
        }
        GreenPieceIV34.setOnMouseClicked(event -> {
            if(basepane.greenFlagOpen) g34 ++;
            basepane.greenFlagOpen = false;
            if (basepane.GreenFlag) {

                if (GreenPieceIV34.getLayoutX() == 425 && GreenPieceIV34.getLayoutY() == 73) {
                    if (GreenNumber1 == 6 || GreenNumber2 == 6) {
                        GreenPieceIV34.setLayoutX(375);
                        GreenPieceIV34.setLayoutY(8);
                        basepane.GreenFlag = false;
                        if(basepane.greenCount > 0 && basepane.greenCount < 3) ep.setEp("It's still Player1's turn, Please roll the dice ");
                        else ep.setEp("It's Player2's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{

                    if(GreenPiece34L + basepane.pace1 > 55 ){
                        GreenPiece34L = 110 - basepane.pace1 - GreenPiece34L;
                        GreenPieceIV34.setLayoutX(getGreenLocationX(GreenPiece34L));
                        GreenPieceIV34.setLayoutY(getGreenLocationY(GreenPiece34L));
                        basepane.GreenBoom(GreenPieceIV34);

                    }
                    else {
                        GreenPiece34L += basepane.pace1;
                        GreenPieceIV34.setLayoutX(getGreenLocationX(GreenPiece34L));
                        GreenPieceIV34.setLayoutY(getGreenLocationY(GreenPiece34L));
                        basepane.GreenBoom(GreenPieceIV34);

                    }
                    if (GreenPiece34L == 55) {
                        GreenPieceIV34.setVisible(false);
                        getWinIV3();
                        getWinIV4();
                        getWinWDIV();
                        winNumber += 2;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        GreenPiece4L = -3;
                        GreenPiece3L = -3;
                    }
                    if(GreenPiece34L == 13){
                        GreenPiece34L = 29;
                        GreenPieceIV34.setLayoutX(getGreenLocationX(GreenPiece34L));
                        GreenPieceIV34.setLayoutY(getGreenLocationY(GreenPiece34L));
                        basepane.GreenBoom(GreenPieceIV34);
                        basepane.GreenShortcut();
                    }
                    else if(GreenPiece34L == 17){
                        GreenPiece34L = 33;
                        GreenPieceIV34.setLayoutX(getGreenLocationX(GreenPiece34L));
                        GreenPieceIV34.setLayoutY(getGreenLocationY(GreenPiece34L));
                        basepane.GreenBoom(GreenPieceIV34);
                        basepane.GreenShortcut();
                    }
                    else if((GreenPiece34L - 1) % 4 == 0 && GreenPiece34L <= 49){
                        GreenPiece34L += 4;
                        GreenPieceIV34.setLayoutX(getGreenLocationX(GreenPiece34L));
                        GreenPieceIV34.setLayoutY(getGreenLocationY(GreenPiece34L));
                        basepane.GreenBoom(GreenPieceIV34);
                    }

                    turn(GreenPiece34L,GreenPieceIV34);
                    basepane.GreenFlag = false;
                    if(basepane.greenCount > 0 && basepane.greenCount < 3) ep.setEp("It's still Player3's turn, Please roll the dice ");
                    else ep.setEp("It's Player4's turn");
                }
            }
            getGreenIV134();
            getGreenIV234();
            getGreenIV1234();
        });
        return GreenPieceIV34;
    }
    public static ImageView getGreenIV123(){
        GreenPieceIV123.setVisible(false);
        if(GreenPiece1L != -2 && GreenPiece2L != -2 && GreenPiece3L != -2 ) {
            if (GreenPieceIV1.isVisible() && GreenPieceIV23.isVisible() &&GreenPiece1L == GreenPiece23L ) {
                GreenPieceIV1.setVisible(false);
                GreenPieceIV23.setVisible(false);
                GreenPieceIV123.setFitHeight(30);
                GreenPieceIV123.setFitWidth(30);
                GreenPieceIV123.setLayoutX(GreenPieceIV1.getLayoutX());
                GreenPieceIV123.setLayoutY(GreenPieceIV1.getLayoutY());
                GreenPiece123L = GreenPiece1L;
                GreenPieceIV123.setVisible(true);
            }
            else if(GreenPieceIV2.isVisible() && GreenPieceIV13.isVisible() &&GreenPiece2L == GreenPiece13L){
                GreenPieceIV2.setVisible(false);
                GreenPieceIV13.setVisible(false);
                GreenPieceIV123.setFitHeight(30);
                GreenPieceIV123.setFitWidth(30);
                GreenPieceIV123.setLayoutX(GreenPieceIV2.getLayoutX());
                GreenPieceIV123.setLayoutY(GreenPieceIV2.getLayoutY());
                GreenPiece123L = GreenPiece2L;
                GreenPieceIV123.setVisible(true);
            }
            else if(GreenPieceIV3.isVisible() && GreenPieceIV12.isVisible() &&GreenPiece3L == GreenPiece12L) {
                GreenPieceIV3.setVisible(false);
                GreenPieceIV12.setVisible(false);
                GreenPieceIV123.setFitHeight(30);
                GreenPieceIV123.setFitWidth(30);
                GreenPieceIV123.setLayoutX(GreenPieceIV3.getLayoutX());
                GreenPieceIV123.setLayoutY(GreenPieceIV3.getLayoutY());
                GreenPiece123L = GreenPiece3L;
                GreenPieceIV123.setVisible(true);
            }
        }
        GreenPieceIV123.setOnMouseClicked(event -> {
            if(basepane.greenFlagOpen) g123 ++;
            basepane.greenFlagOpen = false;
            if (basepane.GreenFlag) {
                GreenPieceIV12.setVisible(false);
                GreenPieceIV13.setVisible(false);
                GreenPieceIV23.setVisible(false);
                if (GreenPieceIV123.getLayoutX() == 425 && GreenPieceIV123.getLayoutY() == 73) {
                    if (GreenNumber1 == 6 || GreenNumber2 == 6) {
                        GreenPieceIV123.setLayoutX(375);
                        GreenPieceIV123.setLayoutY(8);
                        basepane.GreenFlag = false;
                        if(basepane.greenCount > 0 && basepane.greenCount < 3) ep.setEp("It's still Player1's turn, Please roll the dice ");
                        else ep.setEp("It's Player2's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{
                    if(GreenPiece123L + basepane.pace1 > 55 ){
                        GreenPiece123L = 110 - basepane.pace1 - GreenPiece123L;
                        GreenPieceIV123.setLayoutX(getGreenLocationX(GreenPiece123L));
                        GreenPieceIV123.setLayoutY(getGreenLocationY(GreenPiece123L));
                        basepane.GreenBoom(GreenPieceIV123);

                    }
                    else {
                        GreenPiece123L += basepane.pace1;
                        GreenPieceIV123.setLayoutX(getGreenLocationX(GreenPiece123L));
                        GreenPieceIV123.setLayoutY(getGreenLocationY(GreenPiece123L));
                         basepane.GreenBoom(GreenPieceIV123);

                    }
                    if (GreenPiece123L == 55) {
                        GreenPieceIV123.setVisible(false);
                        getWinIV1();
                        getWinIV2();
                        getWinIV3();
                        getWinWDIV();
                        winNumber += 3;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        GreenPiece1L = -3;
                        GreenPiece2L = -3;
                        GreenPiece3L = -3;
                    }
                    if(GreenPiece123L == 13){
                        GreenPiece123L = 29;
                        GreenPieceIV123.setLayoutX(getGreenLocationX(GreenPiece123L));
                        GreenPieceIV123.setLayoutY(getGreenLocationY(GreenPiece123L));
                         basepane.GreenBoom(GreenPieceIV123);
                        basepane.GreenShortcut();
                    }
                    else if(GreenPiece123L == 17){
                        GreenPiece123L = 33;
                        GreenPieceIV123.setLayoutX(getGreenLocationX(GreenPiece123L));
                        GreenPieceIV123.setLayoutY(getGreenLocationY(GreenPiece123L));
                         basepane.GreenBoom(GreenPieceIV123);
                        basepane.GreenShortcut();
                    }
                    else if((GreenPiece123L - 1) % 4 == 0 && GreenPiece123L <= 49){
                        GreenPiece123L += 4;
                        GreenPieceIV123.setLayoutX(getGreenLocationX(GreenPiece123L));
                        GreenPieceIV123.setLayoutY(getGreenLocationY(GreenPiece123L));

                         basepane.GreenBoom(GreenPieceIV123);
                    }

                    turn(GreenPiece123L,GreenPieceIV123);
                    basepane.GreenFlag = false;
                    if(basepane.greenCount > 0 && basepane.greenCount < 3) ep.setEp("It's still Player3's turn, Please roll the dice ");
                    else ep.setEp("It's Player4's turn");
                }
            }
            getGreenIV1234();
        });
        return GreenPieceIV123;
    }
    public static ImageView getGreenIV124(){
        GreenPieceIV124.setVisible(false);
        if(GreenPiece1L != -2 && GreenPiece2L != -2 && GreenPiece4L != -2 ) {
            if (GreenPieceIV1.isVisible() && GreenPieceIV24.isVisible() &&GreenPiece1L == GreenPiece24L ) {
                GreenPieceIV1.setVisible(false);
                GreenPieceIV24.setVisible(false);
                GreenPieceIV124.setFitHeight(30);
                GreenPieceIV124.setFitWidth(30);
                GreenPieceIV124.setLayoutX(GreenPieceIV1.getLayoutX());
                GreenPieceIV124.setLayoutY(GreenPieceIV1.getLayoutY());
                GreenPiece124L = GreenPiece1L;
                GreenPieceIV124.setVisible(true);
            }
            else if(GreenPieceIV2.isVisible() && GreenPieceIV14.isVisible() &&GreenPiece2L == GreenPiece14L){
                GreenPieceIV2.setVisible(false);
                GreenPieceIV14.setVisible(false);
                GreenPieceIV124.setFitHeight(30);
                GreenPieceIV124.setFitWidth(30);
                GreenPieceIV124.setLayoutX(GreenPieceIV2.getLayoutX());
                GreenPieceIV124.setLayoutY(GreenPieceIV2.getLayoutY());
                GreenPiece124L = GreenPiece2L;
                GreenPieceIV124.setVisible(true);
            }
            else if(GreenPieceIV4.isVisible() && GreenPieceIV12.isVisible() &&GreenPiece4L == GreenPiece12L) {
                GreenPieceIV4.setVisible(false);
                GreenPieceIV12.setVisible(false);
                GreenPieceIV124.setFitHeight(30);
                GreenPieceIV124.setFitWidth(30);
                GreenPieceIV124.setLayoutX(GreenPieceIV4.getLayoutX());
                GreenPieceIV124.setLayoutY(GreenPieceIV4.getLayoutY());
                GreenPiece124L = GreenPiece4L;
                GreenPieceIV124.setVisible(true);
            }
        }
        GreenPieceIV124.setOnMouseClicked(event -> {
            if(basepane.greenFlagOpen) g124 ++;
            basepane.greenFlagOpen = false;
            if (basepane.GreenFlag) {
                GreenPieceIV12.setVisible(false);
                GreenPieceIV14.setVisible(false);
                GreenPieceIV24.setVisible(false);
                if (GreenPieceIV124.getLayoutX() == 425 && GreenPieceIV124.getLayoutY() == 73) {
                    if (GreenNumber1 == 6 || GreenNumber2 == 6) {
                        GreenPieceIV124.setLayoutX(375);
                        GreenPieceIV124.setLayoutY(8);
                        basepane.GreenFlag = false;
                        if(basepane.greenCount > 0 && basepane.greenCount < 3) ep.setEp("It's still Player2's turn, Please roll the dice ");
                        else ep.setEp("It's Player3's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{

                    if(GreenPiece124L + basepane.pace1 > 55){
                        GreenPiece124L = 110 - basepane.pace1 - GreenPiece124L;
                        GreenPieceIV124.setLayoutX(getGreenLocationX(GreenPiece124L));
                        GreenPieceIV124.setLayoutY(getGreenLocationY(GreenPiece124L));
                        basepane.GreenBoom(GreenPieceIV124);

                    }else {
                        GreenPiece124L += basepane.pace1;
                        GreenPieceIV124.setLayoutX(getGreenLocationX(GreenPiece124L));
                        GreenPieceIV124.setLayoutY(getGreenLocationY(GreenPiece124L));
                        basepane.GreenBoom(GreenPieceIV124);

                    }
                    if (GreenPiece124L == 55) {
                        GreenPieceIV124.setVisible(false);
                        getWinIV1();
                        getWinIV2();
                        getWinIV4();
                        getWinWDIV();
                        winNumber += 3;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        GreenPiece1L = -3;
                        GreenPiece2L = -3;
                        GreenPiece4L = -3;
                    }
                    if(GreenPiece124L == 13){
                        GreenPiece124L = 29;
                        GreenPieceIV124.setLayoutX(getGreenLocationX(GreenPiece124L));
                        GreenPieceIV124.setLayoutY(getGreenLocationY(GreenPiece124L));
                        basepane.GreenBoom(GreenPieceIV124);
                        basepane.GreenShortcut();
                    }
                    else if(GreenPiece124L == 17){
                        GreenPiece124L = 33;
                        GreenPieceIV124.setLayoutX(getGreenLocationX(GreenPiece124L));
                        GreenPieceIV124.setLayoutY(getGreenLocationY(GreenPiece124L));
                        basepane.GreenBoom(GreenPieceIV124);
                        basepane.GreenShortcut();
                    }
                    else if((GreenPiece124L - 1) % 4 == 0 && GreenPiece124L <= 49){
                        GreenPiece124L += 4;
                        GreenPieceIV124.setLayoutX(getGreenLocationX(GreenPiece124L));
                        GreenPieceIV124.setLayoutY(getGreenLocationY(GreenPiece124L));
                        basepane.GreenBoom(GreenPieceIV124);
                    }

                    turn(GreenPiece124L,GreenPieceIV124);
                    basepane.GreenFlag = false;
                    if(basepane.greenCount > 0 && basepane.greenCount < 3) ep.setEp("It's still Player3's turn, Please roll the dice ");
                    else ep.setEp("It's Player4's turn");
                }
            }
            getGreenIV1234();
        });
        return GreenPieceIV124;
    }
    public static ImageView getGreenIV134(){
        GreenPieceIV134.setVisible(false);
        if(GreenPiece1L != -2 && GreenPiece3L != -2 && GreenPiece4L != -2 ) {
            if (GreenPieceIV1.isVisible() && GreenPieceIV34.isVisible() &&GreenPiece1L == GreenPiece34L ) {
                GreenPieceIV1.setVisible(false);
                GreenPieceIV34.setVisible(false);
                GreenPieceIV134.setFitHeight(30);
                GreenPieceIV134.setFitWidth(30);
                GreenPieceIV134.setLayoutX(GreenPieceIV1.getLayoutX());
                GreenPieceIV134.setLayoutY(GreenPieceIV1.getLayoutY());
                GreenPiece134L = GreenPiece1L;
                GreenPieceIV134.setVisible(true);
            }
            else if(GreenPieceIV3.isVisible() && GreenPieceIV14.isVisible() &&GreenPiece3L == GreenPiece14L){
                GreenPieceIV3.setVisible(false);
                GreenPieceIV14.setVisible(false);
                GreenPieceIV134.setFitHeight(30);
                GreenPieceIV134.setFitWidth(30);
                GreenPieceIV134.setLayoutX(GreenPieceIV3.getLayoutX());
                GreenPieceIV134.setLayoutY(GreenPieceIV3.getLayoutY());
                GreenPiece134L = GreenPiece3L;
                GreenPieceIV134.setVisible(true);
            }
            else if(GreenPieceIV4.isVisible() && GreenPieceIV13.isVisible() &&GreenPiece4L == GreenPiece13L) {
                GreenPieceIV4.setVisible(false);
                GreenPieceIV13.setVisible(false);
                GreenPieceIV134.setFitHeight(30);
                GreenPieceIV134.setFitWidth(30);
                GreenPieceIV134.setLayoutX(GreenPieceIV4.getLayoutX());
                GreenPieceIV134.setLayoutY(GreenPieceIV4.getLayoutY());
                GreenPiece134L = GreenPiece4L;
                GreenPieceIV134.setVisible(true);
            }
        }
        GreenPieceIV134.setOnMouseClicked(event -> {
            if(basepane.greenFlagOpen) g134 ++;
            basepane.greenFlagOpen = false;
            if (basepane.GreenFlag) {
                GreenPieceIV13.setVisible(false);
                GreenPieceIV34.setVisible(false);
                GreenPieceIV14.setVisible(false);
                if (GreenPieceIV134.getLayoutX() == 425 && GreenPieceIV134.getLayoutY() == 73) {
                    if (GreenNumber1 == 6 || GreenNumber2 == 6) {
                        GreenPieceIV134.setLayoutX(375);
                        GreenPieceIV134.setLayoutY(8);
                        basepane.GreenFlag = false;
                        if(basepane.greenCount > 0 && basepane.greenCount < 3) ep.setEp("It's still Player1's turn, Please roll the dice ");
                        else ep.setEp("It's Player2's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{

                    if(GreenPiece134L + basepane.pace1 > 55 ){
                        GreenPiece134L = 110 - basepane.pace1 - GreenPiece134L;
                        GreenPieceIV134.setLayoutX(getGreenLocationX(GreenPiece134L));
                        GreenPieceIV134.setLayoutY(getGreenLocationY(GreenPiece134L));
                        basepane.GreenBoom(GreenPieceIV134);


                    }else {
                        GreenPiece134L += basepane.pace1;
                        GreenPieceIV134.setLayoutX(getGreenLocationX(GreenPiece134L));
                        GreenPieceIV134.setLayoutY(getGreenLocationY(GreenPiece134L));
                        basepane.GreenBoom(GreenPieceIV134);


                    }
                    if (GreenPiece134L == 55) {
                        GreenPieceIV134.setVisible(false);
                        getWinIV1();
                        getWinIV4();
                        getWinIV3();
                        getWinWDIV();
                        winNumber += 3;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        GreenPiece1L = -3;
                        GreenPiece4L = -3;
                        GreenPiece3L = -3;
                    }
                    if(GreenPiece134L == 13){
                        GreenPiece134L = 29;
                        GreenPieceIV134.setLayoutX(getGreenLocationX(GreenPiece134L));
                        GreenPieceIV134.setLayoutY(getGreenLocationY(GreenPiece134L));
                        basepane.GreenBoom(GreenPieceIV134);
                        basepane.GreenShortcut();
                    }
                    else if(GreenPiece134L == 17){
                        GreenPiece134L = 33;
                        GreenPieceIV134.setLayoutX(getGreenLocationX(GreenPiece134L));
                        GreenPieceIV134.setLayoutY(getGreenLocationY(GreenPiece134L));
                        basepane.GreenBoom(GreenPieceIV134);
                        basepane.GreenShortcut();
                    }
                    else if((GreenPiece134L - 1) % 4 == 0 && GreenPiece134L <= 49){
                        GreenPiece134L += 4;
                        GreenPieceIV134.setLayoutX(getGreenLocationX(GreenPiece134L));
                        GreenPieceIV134.setLayoutY(getGreenLocationY(GreenPiece134L));
                        basepane.GreenBoom(GreenPieceIV134);
                    }

                    turn(GreenPiece134L,GreenPieceIV134);
                    basepane.GreenFlag = false;
                    if(basepane.greenCount > 0 && basepane.greenCount < 3) ep.setEp("It's still Player3's turn, Please roll the dice ");
                    else ep.setEp("It's Player4's turn");
                }
            }
            getGreenIV1234();
        });
        return GreenPieceIV134;
    }
    public static ImageView getGreenIV234(){
        GreenPieceIV234.setVisible(false);
        if(GreenPiece2L != -2 && GreenPiece3L != -2 && GreenPiece4L != -2 ) {
            if (GreenPieceIV2.isVisible() && GreenPieceIV34.isVisible() &&GreenPiece2L == GreenPiece34L ) {
                GreenPieceIV2.setVisible(false);
                GreenPieceIV34.setVisible(false);
                GreenPieceIV234.setFitHeight(30);
                GreenPieceIV234.setFitWidth(30);
                GreenPieceIV234.setLayoutX(GreenPieceIV2.getLayoutX());
                GreenPieceIV234.setLayoutY(GreenPieceIV2.getLayoutY());
                GreenPiece234L = GreenPiece2L;
                GreenPieceIV234.setVisible(true);
            }
            else if(GreenPieceIV3.isVisible() && GreenPieceIV24.isVisible() &&GreenPiece3L == GreenPiece24L){
                GreenPieceIV3.setVisible(false);
                GreenPieceIV24.setVisible(false);
                GreenPieceIV234.setFitHeight(30);
                GreenPieceIV234.setFitWidth(30);
                GreenPieceIV234.setLayoutX(GreenPieceIV3.getLayoutX());
                GreenPieceIV234.setLayoutY(GreenPieceIV3.getLayoutY());
                GreenPiece234L = GreenPiece3L;
                GreenPieceIV234.setVisible(true);
            }
            else if(GreenPieceIV4.isVisible() && GreenPieceIV23.isVisible() &&GreenPiece4L == GreenPiece23L) {
                GreenPieceIV4.setVisible(false);
                GreenPieceIV23.setVisible(false);
                GreenPieceIV234.setFitHeight(30);
                GreenPieceIV234.setFitWidth(30);
                GreenPieceIV234.setLayoutX(GreenPieceIV4.getLayoutX());
                GreenPieceIV234.setLayoutY(GreenPieceIV4.getLayoutY());
                GreenPiece234L = GreenPiece4L;
                GreenPieceIV234.setVisible(true);
            }
        }
        GreenPieceIV234.setOnMouseClicked(event -> {
            if(basepane.greenFlagOpen) g234 ++;
            basepane.greenFlagOpen = false;
            if (basepane.GreenFlag) {
                GreenPieceIV23.setVisible(false);
                GreenPieceIV24.setVisible(false);
                GreenPieceIV34.setVisible(false);
                if (GreenPieceIV234.getLayoutX() == 425 && GreenPieceIV234.getLayoutY() == 73) {
                    if (GreenNumber1 == 6 || GreenNumber2 == 6) {
                        GreenPieceIV234.setLayoutX(375);
                        GreenPieceIV234.setLayoutY(8);
                        basepane.GreenFlag = false;
                        if(basepane.greenCount > 0 && basepane.greenCount < 3) ep.setEp("It's still Player3's turn, Please roll the dice ");
                        else ep.setEp("It's Player4's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{

                    if(GreenPiece234L + basepane.pace1 > 55){
                        GreenPiece234L = 110 - basepane.pace1 - GreenPiece234L;
                        GreenPieceIV234.setLayoutX(getGreenLocationX(GreenPiece234L));
                        GreenPieceIV234.setLayoutY(getGreenLocationY(GreenPiece234L));
                        basepane.GreenBoom(GreenPieceIV234);


                    }else {
                        GreenPiece234L += basepane.pace1;
                        GreenPieceIV234.setLayoutX(getGreenLocationX(GreenPiece234L));
                        GreenPieceIV234.setLayoutY(getGreenLocationY(GreenPiece234L));
                        basepane.GreenBoom(GreenPieceIV234);

                    }
                    if (GreenPiece234L== 55) {
                        GreenPieceIV234.setVisible(false);
                        getWinIV4();
                        getWinIV2();
                        getWinIV3();
                        getWinWDIV();
                        winNumber += 3;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        GreenPiece4L = -3;
                        GreenPiece2L = -3;
                        GreenPiece3L = -3;
                    }
                    if(GreenPiece234L == 13){
                        GreenPiece234L = 29;
                        GreenPieceIV234.setLayoutX(getGreenLocationX(GreenPiece234L));
                        GreenPieceIV234.setLayoutY(getGreenLocationY(GreenPiece234L));
                        basepane.GreenBoom(GreenPieceIV234);
                        basepane.GreenShortcut();
                    }
                    else if(GreenPiece234L == 17){
                        GreenPiece234L = 33;
                        GreenPieceIV234.setLayoutX(getGreenLocationX(GreenPiece234L));
                        GreenPieceIV234.setLayoutY(getGreenLocationY(GreenPiece234L));
                        basepane.GreenBoom(GreenPieceIV234);
                        basepane.GreenShortcut();
                    }
                    else if((GreenPiece234L - 1) % 4 == 0 && GreenPiece234L <= 49){
                        GreenPiece234L += 4;
                        GreenPieceIV234.setLayoutX(getGreenLocationX(GreenPiece234L));
                        GreenPieceIV234.setLayoutY(getGreenLocationY(GreenPiece234L));
                        basepane.GreenBoom(GreenPieceIV234);
                    }

                    turn(GreenPiece234L,GreenPieceIV234);
                    basepane.GreenFlag = false;
                    if(basepane.greenCount > 0 && basepane.greenCount < 3) ep.setEp("It's still Player3's turn, Please roll the dice ");
                    else ep.setEp("It's Player4's turn");
                }
            }
            getGreenIV1234();
        });
        return GreenPieceIV234;
    }
    public static ImageView getGreenIV1234(){
        GreenPieceIV1234.setVisible(false);
        if(GreenPiece1L != -2 &&  GreenPiece2L != -2 && GreenPiece3L != -2 && GreenPiece4L != -2 ) {
            if (GreenPieceIV1.isVisible() && GreenPieceIV234.isVisible() && GreenPiece1L == GreenPiece234L ) {
                GreenPieceIV1.setVisible(false);
                GreenPieceIV234.setVisible(false);
                GreenPieceIV1234.setFitHeight(30);
                GreenPieceIV1234.setFitWidth(30);
                GreenPieceIV1234.setLayoutX(GreenPieceIV1.getLayoutX());
                GreenPieceIV1234.setLayoutY(GreenPieceIV1.getLayoutY());
                GreenPiece1234L = GreenPiece1L;
                GreenPieceIV1234.setVisible(true);
            }
            else if (GreenPieceIV2.isVisible() && GreenPieceIV134.isVisible() &&GreenPiece2L == GreenPiece134L ) {
                GreenPieceIV2.setVisible(false);
                GreenPieceIV134.setVisible(false);
                GreenPieceIV1234.setFitHeight(30);
                GreenPieceIV1234.setFitWidth(30);
                GreenPieceIV1234.setLayoutX(GreenPieceIV2.getLayoutX());
                GreenPieceIV1234.setLayoutY(GreenPieceIV2.getLayoutY());
                GreenPiece1234L = GreenPiece2L;
                GreenPieceIV1234.setVisible(true);
            }
            else if(GreenPieceIV3.isVisible() && GreenPieceIV124.isVisible() &&GreenPiece3L == GreenPiece124L){
                GreenPieceIV3.setVisible(false);
                GreenPieceIV124.setVisible(false);
                GreenPieceIV1234.setFitHeight(30);
                GreenPieceIV1234.setFitWidth(30);
                GreenPieceIV1234.setLayoutX(GreenPieceIV3.getLayoutX());
                GreenPieceIV1234.setLayoutY(GreenPieceIV3.getLayoutY());
                GreenPiece1234L = GreenPiece3L;
                GreenPieceIV1234.setVisible(true);
            }
            else if(GreenPieceIV4.isVisible() && GreenPieceIV123.isVisible() &&GreenPiece4L == GreenPiece123L) {
                GreenPieceIV4.setVisible(false);
                GreenPieceIV123.setVisible(false);
                GreenPieceIV1234.setFitHeight(30);
                GreenPieceIV1234.setFitWidth(30);
                GreenPieceIV1234.setLayoutX(GreenPieceIV4.getLayoutX());
                GreenPieceIV1234.setLayoutY(GreenPieceIV4.getLayoutY());
                GreenPiece1234L = GreenPiece4L;
                GreenPieceIV1234.setVisible(true);
            }
        }
        GreenPieceIV1234.setOnMouseClicked(event -> {
            if(basepane.greenFlagOpen) g1234 ++;
            basepane.greenFlagOpen = false;
            if (basepane.GreenFlag) {
                GreenPieceIV1.setVisible(false);
                GreenPieceIV234.setVisible(false);
                GreenPieceIV2.setVisible(false);
                GreenPieceIV134.setVisible(false);
                GreenPieceIV3.setVisible(false);
                GreenPieceIV124.setVisible(false);
                GreenPieceIV4.setVisible(false);
                GreenPieceIV123.setVisible(false);
                GreenPieceIV12.setVisible(false);
                GreenPieceIV13.setVisible(false);
                GreenPieceIV14.setVisible(false);
                GreenPieceIV23.setVisible(false);
                GreenPieceIV24.setVisible(false);
                GreenPieceIV34.setVisible(false);
                if (GreenPieceIV1234.getLayoutX() == 425 && GreenPieceIV1234.getLayoutY() == 73) {
                    if (GreenNumber1 == 6 || GreenNumber2 == 6) {
                        GreenPieceIV1234.setLayoutX(375);
                        GreenPieceIV1234.setLayoutY(8);
                        basepane.GreenFlag = false;
                        if(basepane.greenCount > 0 && basepane.greenCount < 3) ep.setEp("It's still Player3's turn, Please roll the dice ");
                        else ep.setEp("It's Player4's turn");
                    }
                    else{
                        ep.setEp("Sorry! The piece fails to get off!");
                    }
                }
                else{
                    if(GreenPiece1234L + basepane.pace1 > 55){
                        GreenPiece1234L = 110 - basepane.pace1 - GreenPiece1234L;
                        GreenPieceIV1234.setLayoutX(getGreenLocationX(GreenPiece1234L));
                        GreenPieceIV1234.setLayoutY(getGreenLocationY(GreenPiece1234L));
                        basepane.GreenBoom(GreenPieceIV1234);
                    }else {
                        GreenPiece1234L += basepane.pace1;
                        GreenPieceIV1234.setLayoutX(getGreenLocationX(GreenPiece1234L));
                        GreenPieceIV1234.setLayoutY(getGreenLocationY(GreenPiece1234L));
                        basepane.GreenBoom(GreenPieceIV1234);
                    }
                    if (GreenPiece1234L == 55) {
                        GreenPieceIV1234.setVisible(false);
                        getWinIV1();
                        getWinIV2();
                        getWinIV3();
                        getWinIV4();
                        getWinWDIV();
                        winNumber += 4;
                        if(winNumber == 4){
                            new WinPane().display("ConGratulations!","Green is winner!");
                        }
                        GreenPiece1L = -3;
                        GreenPiece2L = -3;
                        GreenPiece3L = -3;
                        GreenPiece4L = -3;
                    }
                    if(GreenPiece1234L == 13){
                        GreenPiece1234L = 29;
                        GreenPieceIV1234.setLayoutX(getGreenLocationX(GreenPiece1234L));
                        GreenPieceIV1234.setLayoutY(getGreenLocationY(GreenPiece1234L));
                        basepane.GreenBoom(GreenPieceIV1234);
                        basepane.GreenShortcut();
                    }
                    else if(GreenPiece1234L == 17){
                        GreenPiece1234L = 33;
                        GreenPieceIV1234.setLayoutX(getGreenLocationX(GreenPiece1234L));
                        GreenPieceIV1234.setLayoutY(getGreenLocationY(GreenPiece1234L));
                        basepane.GreenBoom(GreenPieceIV1234);
                        basepane.GreenShortcut();
                    }
                    else if((GreenPiece1234L - 1) % 4 == 0 && GreenPiece1234L <= 49){
                        GreenPiece1234L += 4;
                        GreenPieceIV1234.setLayoutX(getGreenLocationX(GreenPiece1234L));
                        GreenPieceIV1234.setLayoutY(getGreenLocationY(GreenPiece1234L));
                        basepane.GreenBoom(GreenPieceIV1234);
                    }

                    turn(GreenPiece1234L,GreenPieceIV1234);
                    basepane.GreenFlag = false;
                    if(basepane.greenCount > 0 && basepane.greenCount < 3) ep.setEp("It's still Player3's turn, Please roll the dice ");
                    else ep.setEp("It's Player4's turn");
                }
            }
        });
        return GreenPieceIV1234;
    }
    public static ImageView getWinWDIV(){
        WinWDIV.setLayoutX(230);
        WinWDIV.setLayoutY(272);
        WinWDIV.setFitHeight(37);
        WinWDIV.setFitWidth(70);
        WinWDIV.setRotate(-15);
        WinWDIV.setVisible(true);
        return WinWDIV;
    }
    public static ImageView getWinIV1(){
        WinIV1.setLayoutX(75);
        WinIV1.setLayoutY(478);
        WinIV1.setRotate(-15);
        WinIV1.setFitWidth(51);
        WinIV1.setFitHeight(41);
        WinIV1.setVisible(true);
        return WinIV1;
    }
    public static ImageView getWinIV2(){
        WinIV2.setLayoutX(23);
        WinIV2.setLayoutY(426);
        WinIV2.setRotate(-15);
        WinIV2.setFitWidth(51);
        WinIV2.setFitHeight(41);
        WinIV2.setVisible(true);
        return WinIV2;
    }
    public static ImageView getWinIV3(){
        WinIV3.setLayoutX(75);
        WinIV3.setLayoutY(426);
        WinIV3.setRotate(-15);
        WinIV3.setFitWidth(51);
        WinIV3.setFitHeight(41);
        WinIV3.setVisible(true);
        return WinIV3;
    }
    public static ImageView getWinIV4(){
        WinIV4.setLayoutX(20);
        WinIV4.setLayoutY(478);
        WinIV4.setRotate(-15);
        WinIV4.setFitWidth(51);
        WinIV4.setFitHeight(41);
        WinIV4.setVisible(true);
        return WinIV4;
    }

    public static int getGreenLocationX(int xuhao) {
        int[] array14 = {27, 154};
        int[] array15 = {65, 139};
        int[] array16 = {96, 139};
        int[] array17 = {127, 154};
        int[] array18 = {152, 130};
        int[] array19 = {142, 94};
        int[] array20 = {141, 65};
        int[] array21 = {152, 28};
        int[] array22 = {189, 14};
        int[] array23 = {219, 14};
        int[] array24 = {250, 14};
        int[] array25 = {281, 14};
        int[] array26 = {310, 14};
        int[] array27 = {347, 27};
        int[] array28 = {361, 66};
        int[] array29 = {357, 95};
        int[] array30 = {346, 130};
        int[] array31 = {373, 154};
        int[] array32 = {404, 145};
        int[] array33 = {435, 139};
        int[] array34 = {470, 154};
        int[] array35 = {485, 187};
        int[] array36 = {485, 218};
        int[] array37 = {485, 249};
        int[] array38 = {485, 280};
        int[] array39 = {485, 311};
        int[] array40 = {470, 342};
        int[] array41 = {437, 358};
        int[] array42 = {406, 358};
        int[] array43 = {372, 344};
        int[] array44 = {348, 371};
        int[] array45 = {357, 407};
        int[] array46 = {358, 436};
        int[] array47 = {347, 470};
        int[] array48 = {310, 486};
        int[] array49 = {281, 479};
        int[] array1 = {152, 470};
        int[] array2 = {141, 436};
        int[] array3 = {141, 407};
        int[] array4 = {152, 373};
        int[] array5 = {127, 345};
        int[] array6 = {94, 358};
        int[] array7 = {64, 358};
        int[] array8 = {31, 345};
        int[] array9 = {14, 312};
        int[] array10 = {14, 280};
        int[] array11 = {14, 249};
        int[] array12 = {14, 218};
        int[] array13 = {14, 187};
        //进入重点赛道
        int[] array50 = {250, 486};
        int[] array51 = {250, 436};
        int[] array52 = {250, 407};
        int[] array53 = {250, 374};
        int[] array54 = {250, 340};
        int[] array55 = {250, 310};
        int[] array56 = {250, 273};


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

    public static int getGreenLocationY(int xuhao) {
        int[] array14 = {27, 154};
        int[] array15 = {65, 139};
        int[] array16 = {96, 139};
        int[] array17 = {127, 154};
        int[] array18 = {152, 130};
        int[] array19 = {142, 94};
        int[] array20 = {141, 65};
        int[] array21 = {152, 28};
        int[] array22 = {189, 14};
        int[] array23 = {219, 14};
        int[] array24 = {250, 14};
        int[] array25 = {281, 14};
        int[] array26 = {310, 14};
        int[] array27 = {347, 27};
        int[] array28 = {361, 66};
        int[] array29 = {357, 95};
        int[] array30 = {346, 130};
        int[] array31 = {373, 154};
        int[] array32 = {404, 145};
        int[] array33 = {435, 139};
        int[] array34 = {470, 154};
        int[] array35 = {485, 187};
        int[] array36 = {485, 218};
        int[] array37 = {485, 249};
        int[] array38 = {485, 280};
        int[] array39 = {485, 311};
        int[] array40 = {470, 342};
        int[] array41 = {437, 358};
        int[] array42 = {406, 358};
        int[] array43 = {372, 344};
        int[] array44 = {348, 371};
        int[] array45 = {357, 407};
        int[] array46 = {358, 436};
        int[] array47 = {347, 470};
        int[] array48 = {310, 486};
        int[] array49 = {281, 479};
        int[] array1 = {152, 470};
        int[] array2 = {141, 436};
        int[] array3 = {141, 407};
        int[] array4 = {152, 373};
        int[] array5 = {127, 345};
        int[] array6 = {94, 358};
        int[] array7 = {64, 358};
        int[] array8 = {31, 345};
        int[] array9 = {14, 312};
        int[] array10 = {14, 280};
        int[] array11 = {14, 249};
        int[] array12 = {14, 218};
        int[] array13 = {14, 187};
        //进入重点赛道
        int[] array50 = {250, 486};
        int[] array51 = {250, 436};
        int[] array52 = {250, 407};
        int[] array53 = {250, 374};
        int[] array54 = {250, 340};
        int[] array55 = {250, 310};
        int[] array56 = {250, 273};


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
