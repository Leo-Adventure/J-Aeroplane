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

public class basepane extends Application {
    static int cnt1 = 0;
    static int i = 2;
    static int fileNumber = 0;
    static int yellowCount = 0;
    static int RedCount = 0;
    static int greenCount = 0;
    static int blueCount = 0;
    static int winCount = 0;
    static boolean yellowFlagOpen = false;
    static boolean RedFlagOpen = false;
    static boolean greenFlagOpen = false;
    static boolean blueFlagOpen = false;
    static int Exception = 0;
    static int Exception2 = 0;
    static int diceNumber1 = 0;
    static int diceNumber2 = 0;
    static int num1 = 0;
    static int pace1 = 0;
    static boolean YellowFlag = false;
    static boolean RedFlag = false;
    static boolean BlueFlag = false;
    static boolean GreenFlag = false;
    static Image BoomIM = new Image("Boom.jpg");
    static ImageView BoomIV = new ImageView(BoomIM);
    static ImageView getBoomIV(double x, double y){
        BoomIV.setVisible(true);
        BoomIV.setLayoutX(x);
        BoomIV.setLayoutY(y);
        BoomIV.setFitHeight(78);
        BoomIV.setFitWidth(56);

        return BoomIV;
    }
    static void resetYellow1L(){
        Yellow.YellowPieceIV1.setLayoutX(425);
        Yellow.YellowPieceIV1.setLayoutY(73);
        Yellow.YellowPieceIV1.setRotate(0);
        Yellow.YellowPiece1L = -2;
    }
    static void resetYellow2L(){
        Yellow.YellowPieceIV2.setLayoutX(424);
        Yellow.YellowPieceIV2.setLayoutY(22);
        Yellow.YellowPieceIV2.setRotate(0);
        Yellow.YellowPiece2L = -2;
    }
    static void resetYellow3L(){
        Yellow.YellowPieceIV3.setLayoutX(476);
        Yellow.YellowPieceIV3.setLayoutY(22);
        Yellow.YellowPieceIV3.setRotate(0);
        Yellow.YellowPiece3L = -2;
    }
    static void resetYellow4L(){
        Yellow.YellowPieceIV4.setLayoutX(477);
        Yellow.YellowPieceIV4.setLayoutY(72);
        Yellow.YellowPieceIV4.setRotate(0);
        Yellow.YellowPiece4L = -2;
    }
    static void resetYellow12L(){
        Yellow.YellowPieceIV1.setLayoutX(425);
        Yellow.YellowPieceIV1.setLayoutY(73);
        Yellow.YellowPieceIV1.setRotate(0);
        Yellow.YellowPieceIV2.setLayoutX(424);
        Yellow.YellowPieceIV2.setLayoutY(22);
        Yellow.YellowPieceIV2.setRotate(0);
        Yellow.YellowPieceIV1.setVisible(true);
        Yellow.YellowPieceIV2.setVisible(true);
        Yellow.YellowPieceIV12.setVisible(false);
        Yellow.YellowPiece2L = -2;
        Yellow.YellowPiece1L = -2;
    }
    static void resetYellow13L(){
        Yellow.YellowPieceIV1.setLayoutX(425);
        Yellow.YellowPieceIV1.setLayoutY(73);
        Yellow.YellowPieceIV1.setRotate(0);
        Yellow.YellowPieceIV3.setLayoutX(476);
        Yellow.YellowPieceIV3.setLayoutY(22);
        Yellow.YellowPieceIV3.setRotate(0);
        Yellow.YellowPieceIV1.setVisible(true);
        Yellow.YellowPieceIV3.setVisible(true);
        Yellow.YellowPieceIV13.setVisible(false);
        Yellow.YellowPiece3L = -2;
        Yellow.YellowPiece1L = -2;
    }
    static void resetYellow14L(){
        Yellow.YellowPieceIV1.setLayoutX(425);
        Yellow.YellowPieceIV1.setLayoutY(73);
        Yellow.YellowPieceIV1.setRotate(0);
        Yellow.YellowPieceIV4.setLayoutX(477);
        Yellow.YellowPieceIV4.setLayoutY(72);
        Yellow.YellowPieceIV4.setRotate(0);
        Yellow.YellowPiece4L = -2;
        Yellow.YellowPieceIV1.setVisible(true);
        Yellow.YellowPieceIV4.setVisible(true);
        Yellow.YellowPieceIV14.setVisible(false);
        Yellow.YellowPiece1L = -2;
    }
    static void resetYellow23L(){
        Yellow.YellowPieceIV2.setLayoutX(424);
        Yellow.YellowPieceIV2.setLayoutY(22);
        Yellow.YellowPieceIV2.setRotate(0);
        Yellow.YellowPieceIV3.setLayoutX(476);
        Yellow.YellowPieceIV3.setLayoutY(22);
        Yellow.YellowPieceIV3.setRotate(0);
        Yellow.YellowPieceIV2.setVisible(true);
        Yellow.YellowPieceIV3.setVisible(true);
        Yellow.YellowPieceIV23.setVisible(false);
        Yellow.YellowPiece2L = -2;
    }
    static void resetYellow24L(){
        Yellow.YellowPieceIV2.setLayoutX(424);
        Yellow.YellowPieceIV2.setLayoutY(22);
        Yellow.YellowPieceIV2.setRotate(0);
        Yellow.YellowPieceIV4.setLayoutX(477);
        Yellow.YellowPieceIV4.setLayoutY(72);
        Yellow.YellowPieceIV4.setRotate(0);
        Yellow.YellowPiece4L = -2;
        Yellow.YellowPieceIV2.setVisible(true);
        Yellow.YellowPieceIV4.setVisible(true);
        Yellow.YellowPieceIV24.setVisible(false);
        Yellow.YellowPiece2L = -2;
    }
    static void resetYellow34L(){
        Yellow.YellowPieceIV3.setLayoutX(476);
        Yellow.YellowPieceIV3.setLayoutY(22);
        Yellow.YellowPieceIV3.setRotate(0);
        Yellow.YellowPieceIV4.setLayoutX(477);
        Yellow.YellowPieceIV4.setLayoutY(72);
        Yellow.YellowPieceIV4.setRotate(0);
        Yellow.YellowPiece4L = -2;
        Yellow.YellowPieceIV3.setVisible(true);
        Yellow.YellowPieceIV4.setVisible(true);
        Yellow.YellowPieceIV34.setVisible(false);
        Yellow.YellowPiece3L = -2;
    }
    static void resetYellow123L(){
        Yellow.YellowPieceIV3.setLayoutX(476);
        Yellow.YellowPieceIV3.setLayoutY(22);
        Yellow.YellowPiece3L = -2;
        Yellow.YellowPieceIV3.setRotate(0);
        Yellow.YellowPieceIV2.setLayoutX(424);
        Yellow.YellowPieceIV2.setLayoutY(22);
        Yellow.YellowPieceIV2.setRotate(0);
        Yellow.YellowPiece2L = -2;
        Yellow.YellowPieceIV1.setLayoutX(425);
        Yellow.YellowPieceIV1.setLayoutY(73);
        Yellow.YellowPieceIV1.setRotate(0);
        Yellow.YellowPiece1L = -2;
        Yellow.YellowPieceIV3.setVisible(true);
        Yellow.YellowPieceIV2.setVisible(true);
        Yellow.YellowPieceIV1.setVisible(true);
        Yellow.YellowPieceIV123.setVisible(false);

    }
    static void resetYellow124L(){
        Yellow.YellowPieceIV4.setLayoutX(477);
        Yellow.YellowPieceIV4.setLayoutY(72);
        Yellow.YellowPieceIV4.setRotate(0);
        Yellow.YellowPiece4L = -2;
        Yellow.YellowPieceIV2.setLayoutX(424);
        Yellow.YellowPieceIV2.setLayoutY(22);
        Yellow.YellowPieceIV2.setRotate(0);
        Yellow.YellowPiece2L = -2;
        Yellow.YellowPieceIV1.setLayoutX(425);
        Yellow.YellowPieceIV1.setLayoutY(73);
        Yellow.YellowPieceIV1.setRotate(0);
        Yellow.YellowPiece1L = -2;
        Yellow.YellowPieceIV4.setVisible(true);
        Yellow.YellowPieceIV2.setVisible(true);
        Yellow.YellowPieceIV1.setVisible(true);
        Yellow.YellowPieceIV124.setVisible(false);

    }
    static void resetYellow134L(){
        Yellow.YellowPieceIV4.setLayoutX(477);
        Yellow.YellowPieceIV4.setLayoutY(72);
        Yellow.YellowPieceIV4.setRotate(0);
        Yellow.YellowPiece4L = -2;
        Yellow.YellowPieceIV3.setLayoutX(476);
        Yellow.YellowPieceIV3.setLayoutY(22);
        Yellow.YellowPieceIV3.setRotate(0);
        Yellow.YellowPiece3L = -2;
        Yellow.YellowPieceIV1.setLayoutX(425);
        Yellow.YellowPieceIV1.setLayoutY(73);
        Yellow.YellowPieceIV1.setRotate(0);
        Yellow.YellowPiece1L = -2;
        Yellow.YellowPieceIV4.setVisible(true);
        Yellow.YellowPieceIV3.setVisible(true);
        Yellow.YellowPieceIV1.setVisible(true);
        Yellow.YellowPieceIV134.setVisible(false);
    }
    static void resetYellow234L(){
        Yellow.YellowPieceIV4.setLayoutX(477);
        Yellow.YellowPieceIV4.setLayoutY(72);
        Yellow.YellowPieceIV4.setRotate(0);
        Yellow.YellowPiece4L = -2;
        Yellow.YellowPieceIV3.setLayoutX(476);
        Yellow.YellowPieceIV3.setLayoutY(22);
        Yellow.YellowPieceIV3.setRotate(0);
        Yellow.YellowPiece3L = -2;
        Yellow.YellowPieceIV2.setLayoutX(424);
        Yellow.YellowPieceIV2.setLayoutY(22);
        Yellow.YellowPieceIV2.setRotate(0);
        Yellow.YellowPiece2L = -2;
        Yellow.YellowPieceIV4.setVisible(true);
        Yellow.YellowPieceIV2.setVisible(true);
        Yellow.YellowPieceIV3.setVisible(true);
        Yellow.YellowPieceIV234.setVisible(false);
    }
    static void resetYellow1234L(){
        Yellow.YellowPieceIV1.setLayoutX(425);
        Yellow.YellowPieceIV1.setLayoutY(73);
        Yellow.YellowPieceIV1.setRotate(0);
        Yellow.YellowPiece1L = -2;
        Yellow.YellowPieceIV4.setLayoutX(477);
        Yellow.YellowPieceIV4.setLayoutY(72);
        Yellow.YellowPieceIV4.setRotate(0);
        Yellow.YellowPiece4L = -2;
        Yellow.YellowPieceIV3.setLayoutX(476);
        Yellow.YellowPieceIV3.setLayoutY(22);
        Yellow.YellowPieceIV3.setRotate(0);
        Yellow.YellowPiece3L = -2;
        Yellow.YellowPieceIV2.setLayoutX(424);
        Yellow.YellowPieceIV2.setLayoutY(22);
        Yellow.YellowPieceIV2.setRotate(0);
        Yellow.YellowPiece2L = -2;
        Yellow.YellowPieceIV4.setVisible(true);
        Yellow.YellowPieceIV2.setVisible(true);
        Yellow.YellowPieceIV3.setVisible(true);
        Yellow.YellowPieceIV1.setVisible(true);
        Yellow.YellowPieceIV1234.setVisible(false);
    }
    static void resetRed1L(){
        Red.RedPieceIV1.setLayoutX(75);
        Red.RedPieceIV1.setLayoutY(74);
        Red.RedPieceIV1.setRotate(90);
        Red.RedPiece1L = -2;
    }
    static void resetRed3L(){
        Red.RedPieceIV3.setLayoutX(21);
        Red.RedPieceIV3.setLayoutY(74);
        Red.RedPieceIV3.setRotate(90);
        Red.RedPiece3L = -2;
    }
    static void resetRed2L(){
        Red.RedPieceIV2.setLayoutX(23);
        Red.RedPieceIV2.setLayoutY(21);
        Red.RedPieceIV2.setRotate(90);
        Red.RedPiece2L = -2;
    }
    static void resetRed4L(){
        Red.RedPieceIV4.setLayoutX(75);
        Red.RedPieceIV4.setLayoutY(22);
        Red.RedPieceIV4.setRotate(90);
        Red.RedPiece4L = -2;
    }
    static void resetRed12L(){
        Red.RedPieceIV1.setLayoutX(75);
        Red.RedPieceIV1.setLayoutY(74);
        Red.RedPiece1L = -2;
        Red.RedPieceIV1.setVisible(true);
        Red.RedPieceIV2.setLayoutX(23);
        Red.RedPieceIV2.setLayoutY(21);
        Red.RedPiece2L = -2;
        Red.RedPieceIV1.setRotate(90);
        Red.RedPieceIV2.setRotate(90);
        Red.RedPieceIV2.setVisible(true);
        Red.RedPieceIV12.setVisible(false);
    }
    static void resetRed13L(){
        Red.RedPieceIV1.setLayoutX(75);
        Red.RedPieceIV1.setLayoutY(74);
        Red.RedPiece1L = -2;
        Red.RedPieceIV1.setRotate(90);
        Red.RedPieceIV3.setRotate(90);
        Red.RedPieceIV1.setVisible(true);
        Red.RedPieceIV3.setLayoutX(21);
        Red.RedPieceIV3.setLayoutY(74);
        Red.RedPiece3L = -2;
        Red.RedPieceIV3.setVisible(true);
        Red.RedPieceIV13.setVisible(false);
    }
    static void resetRed14L(){
        Red.RedPieceIV1.setLayoutX(75);
        Red.RedPieceIV1.setLayoutY(74);
        Red.RedPiece1L = -2;
        Red.RedPieceIV1.setRotate(90);
        Red.RedPieceIV4.setRotate(90);
        Red.RedPieceIV1.setVisible(true);
        Red.RedPieceIV4.setLayoutX(75);
        Red.RedPieceIV4.setLayoutY(22);
        Red.RedPiece4L = -2;
        Red.RedPieceIV4.setVisible(true);
        Red.RedPieceIV14.setVisible(false);
    }
    static void resetRed23L(){
        Red.RedPieceIV2.setLayoutX(23);
        Red.RedPieceIV2.setLayoutY(21);
        Red.RedPiece2L = -2;
        Red.RedPieceIV2.setRotate(90);
        Red.RedPieceIV3.setRotate(90);
        Red.RedPieceIV2.setVisible(true);
        Red.RedPieceIV3.setLayoutX(21);
        Red.RedPieceIV3.setLayoutY(74);
        Red.RedPiece3L = -2;
        Red.RedPieceIV3.setVisible(true);
        Red.RedPieceIV23.setVisible(false);
    }
    static void resetRed24L(){
        Red.RedPieceIV2.setLayoutX(23);
        Red.RedPieceIV2.setLayoutY(21);
        Red.RedPiece2L = -2;
        Red.RedPieceIV2.setRotate(90);
        Red.RedPieceIV4.setRotate(90);
        Red.RedPieceIV2.setVisible(true);
        Red.RedPieceIV4.setLayoutX(75);
        Red.RedPieceIV4.setLayoutY(22);
        Red.RedPiece4L = -2;
        Red.RedPieceIV4.setVisible(true);
        Red.RedPieceIV24.setVisible(false);
    }
    static void resetRed34L(){
        Red.RedPieceIV3.setRotate(90);
        Red.RedPieceIV4.setRotate(90);
        Red.RedPieceIV3.setLayoutX(21);
        Red.RedPieceIV3.setLayoutY(74);
        Red.RedPiece3L = -2;
        Red.RedPieceIV3.setVisible(true);
        Red.RedPieceIV4.setLayoutX(75);
        Red.RedPieceIV4.setLayoutY(22);
        Red.RedPiece4L = -2;
        Red.RedPieceIV4.setVisible(true);
        Red.RedPieceIV34.setVisible(false);
    }
    static void resetRed123L(){
        Red.RedPieceIV1.setRotate(90);
        Red.RedPieceIV2.setRotate(90);
        Red.RedPieceIV3.setRotate(90);
        Red.RedPieceIV1.setLayoutX(75);
        Red.RedPieceIV1.setLayoutY(74);
        Red.RedPiece1L = -2;
        Red.RedPieceIV1.setVisible(true);
        Red.RedPieceIV2.setLayoutX(23);
        Red.RedPieceIV2.setLayoutY(21);
        Red.RedPiece2L = -2;
        Red.RedPieceIV2.setVisible(true);
        Red.RedPieceIV3.setLayoutX(21);
        Red.RedPieceIV3.setLayoutY(74);
        Red.RedPiece3L = -2;
        Red.RedPieceIV3.setVisible(true);
        Red.RedPieceIV123.setVisible(false);
    }
    static void resetRed124L(){
        Red.RedPieceIV1.setRotate(90);
        Red.RedPieceIV2.setRotate(90);
        Red.RedPieceIV4.setRotate(90);
        Red.RedPieceIV1.setLayoutX(75);
        Red.RedPieceIV1.setLayoutY(74);
        Red.RedPiece1L = -2;
        Red.RedPieceIV1.setVisible(true);
        Red.RedPieceIV2.setLayoutX(23);
        Red.RedPieceIV2.setLayoutY(21);
        Red.RedPiece2L = -2;
        Red.RedPieceIV2.setVisible(true);
        Red.RedPieceIV4.setLayoutX(75);
        Red.RedPieceIV4.setLayoutY(22);
        Red.RedPiece4L = -2;
        Red.RedPieceIV4.setVisible(true);
        Red.RedPieceIV124.setVisible(false);
    }
    static void resetRed134L(){
        Red.RedPieceIV1.setRotate(90);
        Red.RedPieceIV3.setRotate(90);
        Red.RedPieceIV4.setRotate(90);
        Red.RedPieceIV1.setLayoutX(75);
        Red.RedPieceIV1.setLayoutY(74);
        Red.RedPiece1L = -2;
        Red.RedPieceIV1.setVisible(true);
        Red.RedPieceIV3.setLayoutX(21);
        Red.RedPieceIV3.setLayoutY(74);
        Red.RedPiece3L = -2;
        Red.RedPieceIV3.setVisible(true);
        Red.RedPieceIV4.setLayoutX(75);
        Red.RedPieceIV4.setLayoutY(22);
        Red.RedPiece4L = -2;
        Red.RedPieceIV4.setVisible(true);
        Red.RedPieceIV134.setVisible(false);
    }
    static void resetRed234L(){
        Red.RedPieceIV2.setRotate(90);
        Red.RedPieceIV3.setRotate(90);
        Red.RedPieceIV4.setRotate(90);
        Red.RedPieceIV2.setLayoutX(23);
        Red.RedPieceIV2.setLayoutY(21);
        Red.RedPiece2L = -2;
        Red.RedPieceIV2.setVisible(true);
        Red.RedPieceIV3.setLayoutX(21);
        Red.RedPieceIV3.setLayoutY(74);
        Red.RedPiece3L = -2;
        Red.RedPieceIV3.setVisible(true);
        Red.RedPieceIV4.setLayoutX(75);
        Red.RedPieceIV4.setLayoutY(22);
        Red.RedPiece4L = -2;
        Red.RedPieceIV4.setVisible(true);
        Red.RedPieceIV234.setVisible(false);
    }
    static void resetGreen1L(){
        Green.GreenPieceIV1.setLayoutX(75);
        Green.GreenPieceIV1.setLayoutY(478);
        Green.GreenPiece1L = -2;
        Green.GreenPieceIV1.setRotate(180);
    }
    static void resetGreen2L(){
        System.out.println(" !!!");
        Green.GreenPieceIV2.setLayoutX(23);
        Green.GreenPieceIV2.setLayoutY(426);
        Green.GreenPiece2L = -2;
        Green.GreenPieceIV2.setRotate(180);
    }
    static void resetGreen3L(){
        Green.GreenPieceIV3.setLayoutX(75);
        Green.GreenPieceIV3.setLayoutY(426);
        Green.GreenPiece3L = -2;
        Green.GreenPieceIV3.setRotate(180);
    }
    static void resetGreen4L(){
        Green.GreenPieceIV4.setLayoutX(20);
        Green.GreenPieceIV4.setLayoutY(478);
        Green.GreenPiece4L = -2;
        Green.GreenPieceIV4.setRotate(180);
    }
    static void resetGreen12L(){
        Green.GreenPieceIV1.setRotate(180);
        Green.GreenPieceIV2.setRotate(180);
        Green.GreenPieceIV1.setLayoutX(75);
        Green.GreenPieceIV1.setLayoutY(478);
        Green.GreenPiece1L = -2;
        Green.GreenPieceIV1.setVisible(true);
        Green.GreenPieceIV2.setLayoutX(23);
        Green.GreenPieceIV2.setLayoutY(426);
        Green.GreenPiece2L = -2;
        Green.GreenPieceIV2.setVisible(true);
        Green.GreenPieceIV12.setVisible(false);
    }
    static void resetGreen13L(){
        Green.GreenPieceIV1.setRotate(180);
        Green.GreenPieceIV3.setRotate(180);
        Green.GreenPieceIV1.setLayoutX(75);
        Green.GreenPieceIV1.setLayoutY(478);
        Green.GreenPiece1L = -2;
        Green.GreenPieceIV1.setVisible(true);
        Green.GreenPieceIV3.setLayoutX(75);
        Green.GreenPieceIV3.setLayoutY(426);
        Green.GreenPiece3L = -2;
        Green.GreenPieceIV3.setVisible(true);
        Green.GreenPieceIV13.setVisible(false);
    }
    static void resetGreen14L(){
        Green.GreenPieceIV1.setRotate(180);
        Green.GreenPieceIV4.setRotate(180);
        Green.GreenPieceIV1.setLayoutX(75);
        Green.GreenPieceIV1.setLayoutY(478);
        Green.GreenPiece1L = -2;
        Green.GreenPieceIV1.setVisible(true);
        Green.GreenPieceIV4.setLayoutX(20);
        Green.GreenPieceIV4.setLayoutY(478);
        Green.GreenPiece4L = -2;
        Green.GreenPieceIV4.setVisible(true);
        Green.GreenPieceIV14.setVisible(false);
    }
    static void resetGreen23L(){
        Green.GreenPieceIV2.setRotate(180);
        Green.GreenPieceIV3.setRotate(180);
        Green.GreenPieceIV3.setLayoutX(75);
        Green.GreenPieceIV3.setLayoutY(426);
        Green.GreenPiece3L = -2;
        Green.GreenPieceIV3.setVisible(true);
        Green.GreenPieceIV2.setLayoutX(23);
        Green.GreenPieceIV2.setLayoutY(426);
        Green.GreenPiece2L = -2;
        Green.GreenPieceIV2.setVisible(true);
        Green.GreenPieceIV23.setVisible(false);
    }
    static void resetGreen24L(){
        Green.GreenPieceIV2.setRotate(180);
        Green.GreenPieceIV4.setRotate(180);
        Green.GreenPieceIV4.setLayoutX(20);
        Green.GreenPieceIV4.setLayoutY(478);
        Green.GreenPiece4L = -2;
        Green.GreenPieceIV4.setVisible(true);
        Green.GreenPieceIV2.setLayoutX(23);
        Green.GreenPieceIV2.setLayoutY(426);
        Green.GreenPiece2L = -2;
        Green.GreenPieceIV2.setVisible(true);
        Green.GreenPieceIV24.setVisible(false);
    }
    static void resetGreen34L(){
        Green.GreenPieceIV3.setRotate(180);
        Green.GreenPieceIV4.setRotate(180);
        Green.GreenPieceIV4.setLayoutX(20);
        Green.GreenPieceIV4.setLayoutY(478);
        Green.GreenPiece4L = -2;
        Green.GreenPieceIV4.setVisible(true);
        Green.GreenPieceIV3.setLayoutX(75);
        Green.GreenPieceIV3.setLayoutY(426);
        Green.GreenPiece3L = -2;
        Green.GreenPieceIV3.setVisible(true);
        Green.GreenPieceIV34.setVisible(false);
    }
    static void resetGreen123L(){
        Green.GreenPieceIV1.setRotate(180);
        Green.GreenPieceIV2.setRotate(180);
        Green.GreenPieceIV3.setRotate(180);
        Green.GreenPieceIV1.setLayoutX(75);
        Green.GreenPieceIV1.setLayoutY(478);
        Green.GreenPiece1L = -2;
        Green.GreenPieceIV1.setVisible(true);
        Green.GreenPieceIV2.setLayoutX(23);
        Green.GreenPieceIV2.setLayoutY(426);
        Green.GreenPiece2L = -2;
        Green.GreenPieceIV2.setVisible(true);
        Green.GreenPieceIV3.setLayoutX(75);
        Green.GreenPieceIV3.setLayoutY(426);
        Green.GreenPiece3L = -2;
        Green.GreenPieceIV3.setVisible(true);
        Green.GreenPieceIV123.setVisible(false);
    }
    static void resetGreen124L(){
        Green.GreenPieceIV1.setRotate(180);
        Green.GreenPieceIV2.setRotate(180);
        Green.GreenPieceIV4.setRotate(180);
        Green.GreenPieceIV1.setLayoutX(75);
        Green.GreenPieceIV1.setLayoutY(478);
        Green.GreenPiece1L = -2;
        Green.GreenPieceIV1.setVisible(true);
        Green.GreenPieceIV2.setLayoutX(23);
        Green.GreenPieceIV2.setLayoutY(426);
        Green.GreenPiece2L = -2;
        Green.GreenPieceIV2.setVisible(true);
        Green.GreenPieceIV4.setLayoutX(20);
        Green.GreenPieceIV4.setLayoutY(478);
        Green.GreenPiece4L = -2;
        Green.GreenPieceIV4.setVisible(true);
        Green.GreenPieceIV124.setVisible(false);
    }
    static void resetGreen134L(){
        Green.GreenPieceIV1.setRotate(180);
        Green.GreenPieceIV3.setRotate(180);
        Green.GreenPieceIV4.setRotate(180);
        Green.GreenPieceIV1.setLayoutX(75);
        Green.GreenPieceIV1.setLayoutY(478);
        Green.GreenPiece1L = -2;
        Green.GreenPieceIV1.setVisible(true);
        Green.GreenPieceIV3.setLayoutX(75);
        Green.GreenPieceIV3.setLayoutY(426);
        Green.GreenPiece3L = -2;
        Green.GreenPieceIV3.setVisible(true);
        Green.GreenPieceIV4.setLayoutX(20);
        Green.GreenPieceIV4.setLayoutY(478);
        Green.GreenPiece4L = -2;
        Green.GreenPieceIV4.setVisible(true);
        Green.GreenPieceIV134.setVisible(false);
    }
    static void resetGreen234L(){
        Green.GreenPieceIV2.setRotate(180);
        Green.GreenPieceIV3.setRotate(180);
        Green.GreenPieceIV4.setRotate(180);
        Green.GreenPieceIV2.setLayoutX(23);
        Green.GreenPieceIV2.setLayoutY(426);
        Green.GreenPiece2L = -2;
        Green.GreenPieceIV2.setVisible(true);
        Green.GreenPieceIV3.setLayoutX(75);
        Green.GreenPieceIV3.setLayoutY(426);
        Green.GreenPiece3L = -2;
        Green.GreenPieceIV3.setVisible(true);
        Green.GreenPieceIV4.setLayoutX(20);
        Green.GreenPieceIV4.setLayoutY(478);
        Green.GreenPiece4L = -2;
        Green.GreenPieceIV4.setVisible(true);
        Green.GreenPieceIV234.setVisible(false);
    }
    static void resetGreen1234L(){
        Green.GreenPieceIV1.setRotate(180);
        Green.GreenPieceIV2.setRotate(180);
        Green.GreenPieceIV3.setRotate(180);
        Green.GreenPieceIV4.setRotate(180);
        Green.GreenPieceIV1.setLayoutX(75);
        Green.GreenPieceIV1.setLayoutY(478);
        Green.GreenPiece1L = -2;
        Green.GreenPieceIV1.setVisible(true);
        Green.GreenPieceIV2.setLayoutX(23);
        Green.GreenPieceIV2.setLayoutY(426);
        Green.GreenPiece2L = -2;
        Green.GreenPieceIV2.setVisible(true);
        Green.GreenPieceIV3.setLayoutX(75);
        Green.GreenPieceIV3.setLayoutY(426);
        Green.GreenPiece3L = -2;
        Green.GreenPieceIV3.setVisible(true);
        Green.GreenPieceIV4.setLayoutX(20);
        Green.GreenPieceIV4.setLayoutY(478);
        Green.GreenPiece4L = -2;
        Green.GreenPieceIV4.setVisible(true);
        Green.GreenPieceIV1234.setVisible(false);
    }
    static void resetRed1234L(){
        Red.RedPieceIV1.setRotate(90);
        Red.RedPieceIV2.setRotate(90);
        Red.RedPieceIV3.setRotate(90);
        Red.RedPieceIV4.setRotate(90);
        Red.RedPieceIV1.setLayoutX(75);
        Red.RedPieceIV1.setLayoutY(74);
        Red.RedPiece1L = -2;
        Red.RedPieceIV1.setVisible(true);
        Red.RedPieceIV2.setLayoutX(23);
        Red.RedPieceIV2.setLayoutY(21);
        Red.RedPiece2L = -2;
        Red.RedPieceIV2.setVisible(true);
        Red.RedPieceIV3.setLayoutX(21);
        Red.RedPieceIV3.setLayoutY(74);
        Red.RedPiece3L = -2;
        Red.RedPieceIV3.setVisible(true);
        Red.RedPieceIV4.setLayoutX(75);
        Red.RedPieceIV4.setLayoutY(22);
        Red.RedPiece4L = -2;
        Red.RedPieceIV4.setVisible(true);
        Red.RedPieceIV1234.setVisible(false);
    }
    static void resetBlue1L(){
        Blue.BluePieceIV1.setLayoutX(426);
        Blue.BluePieceIV1.setLayoutY(426);
        Blue.BluePiece1L = -2;
    }
    static void resetBlue2L(){
        Blue.BluePieceIV2.setLayoutX(478);
        Blue.BluePieceIV2.setLayoutY(479);
        Blue.BluePiece2L = -2;
    }
    static void resetBlue3L(){
        Blue.BluePieceIV3.setLayoutX(426);
        Blue.BluePieceIV3.setLayoutY(478);
        Blue.BluePiece3L = -2;
    }
    static void resetBlue4L(){
        Blue.BluePieceIV4.setLayoutX(479);
        Blue.BluePieceIV4.setLayoutY(426);
        Blue.BluePiece4L = -2;
    }
    static void resetBlue12L(){
        Blue.BluePieceIV1.setLayoutX(426);
        Blue.BluePieceIV1.setLayoutY(426);
        Blue.BluePiece1L = -2;
        Blue.BluePieceIV1.setVisible(true);
        Blue.BluePieceIV2.setLayoutX(478);
        Blue.BluePieceIV2.setLayoutY(479);
        Blue.BluePiece2L = -2;
        Blue.BluePieceIV2.setVisible(true);
        Blue.BluePieceIV12.setVisible(false);
    }
    static void resetBlue13L(){
        Blue.BluePieceIV1.setLayoutX(426);
        Blue.BluePieceIV1.setLayoutY(426);
        Blue.BluePiece1L = -2;
        Blue.BluePieceIV1.setVisible(true);
        Blue.BluePieceIV3.setLayoutX(426);
        Blue.BluePieceIV3.setLayoutY(478);
        Blue.BluePiece3L = -2;
        Blue.BluePieceIV3.setVisible(true);
        Blue.BluePieceIV13.setVisible(false);
    }
    static void resetBlue14L(){
        Blue.BluePieceIV1.setLayoutX(426);
        Blue.BluePieceIV1.setLayoutY(426);
        Blue.BluePiece1L = -2;
        Blue.BluePieceIV1.setVisible(true);
        Blue.BluePieceIV4.setLayoutX(479);
        Blue.BluePieceIV4.setLayoutY(426);
        Blue.BluePiece4L = -2;
        Blue.BluePieceIV4.setVisible(true);
        Blue.BluePieceIV14.setVisible(false);
    }
    static void resetBlue23L(){
        Blue.BluePieceIV3.setLayoutX(426);
        Blue.BluePieceIV3.setLayoutY(478);
        Blue.BluePiece3L = -2;
        Blue.BluePieceIV3.setVisible(true);
        Blue.BluePieceIV2.setLayoutX(478);
        Blue.BluePieceIV2.setLayoutY(479);
        Blue.BluePiece2L = -2;
        Blue.BluePieceIV2.setVisible(true);
        Blue.BluePieceIV23.setVisible(false);
    }
    static void resetBlue24L(){
        Blue.BluePieceIV4.setLayoutX(479);
        Blue.BluePieceIV4.setLayoutY(426);
        Blue.BluePiece4L = -2;
        Blue.BluePieceIV4.setVisible(true);
        Blue.BluePieceIV2.setLayoutX(478);
        Blue.BluePieceIV2.setLayoutY(479);
        Blue.BluePiece2L = -2;
        Blue.BluePieceIV2.setVisible(true);
        Blue.BluePieceIV24.setVisible(false);
    }
    static void resetBlue34L(){
        Blue.BluePieceIV4.setLayoutX(479);
        Blue.BluePieceIV4.setLayoutY(426);
        Blue.BluePiece4L = -2;
        Blue.BluePieceIV4.setVisible(true);
        Blue.BluePieceIV3.setLayoutX(426);
        Blue.BluePieceIV3.setLayoutY(478);
        Blue.BluePiece3L = -2;
        Blue.BluePieceIV3.setVisible(true);
        Blue.BluePieceIV34.setVisible(false);
    }
    static void resetBlue123L(){
        Blue.BluePieceIV1.setLayoutX(426);
        Blue.BluePieceIV1.setLayoutY(426);
        Blue.BluePiece1L = -2;
        Blue.BluePieceIV1.setVisible(true);
        Blue.BluePieceIV2.setLayoutX(478);
        Blue.BluePieceIV2.setLayoutY(479);
        Blue.BluePiece2L = -2;
        Blue.BluePieceIV2.setVisible(true);
        Blue.BluePieceIV3.setLayoutX(426);
        Blue.BluePieceIV3.setLayoutY(478);
        Blue.BluePiece3L = -2;
        Blue.BluePieceIV3.setVisible(true);
        Blue.BluePieceIV123.setVisible(false);
    }
    static void resetBlue124L(){
        Blue.BluePieceIV1.setLayoutX(426);
        Blue.BluePieceIV1.setLayoutY(426);
        Blue.BluePiece1L = -2;
        Blue.BluePieceIV1.setVisible(true);
        Blue.BluePieceIV2.setLayoutX(478);
        Blue.BluePieceIV2.setLayoutY(479);
        Blue.BluePiece2L = -2;
        Blue.BluePieceIV2.setVisible(true);
        Blue.BluePieceIV4.setLayoutX(479);
        Blue.BluePieceIV4.setLayoutY(426);
        Blue.BluePiece4L = -2;
        Blue.BluePieceIV4.setVisible(true);
        Blue.BluePieceIV124.setVisible(false);
    }
    static void resetBlue134L(){
        Blue.BluePieceIV1.setLayoutX(426);
        Blue.BluePieceIV1.setLayoutY(426);
        Blue.BluePiece1L = -2;
        Blue.BluePieceIV1.setVisible(true);
        Blue.BluePieceIV3.setLayoutX(426);
        Blue.BluePieceIV3.setLayoutY(478);
        Blue.BluePiece3L = -2;
        Blue.BluePieceIV3.setVisible(true);
        Blue.BluePieceIV4.setLayoutX(479);
        Blue.BluePieceIV4.setLayoutY(426);
        Blue.BluePiece4L = -2;
        Blue.BluePieceIV4.setVisible(true);
        Blue.BluePieceIV134.setVisible(false);
    }
    static void resetBlue234L(){
        Blue.BluePieceIV2.setLayoutX(478);
        Blue.BluePieceIV2.setLayoutY(479);
        Blue.BluePiece2L = -2;
        Blue.BluePieceIV2.setVisible(true);
        Blue.BluePieceIV3.setLayoutX(426);
        Blue.BluePieceIV3.setLayoutY(478);
        Blue.BluePiece3L = -2;
        Blue.BluePieceIV3.setVisible(true);
        Blue.BluePieceIV4.setLayoutX(479);
        Blue.BluePieceIV4.setLayoutY(426);
        Blue.BluePiece4L = -2;
        Blue.BluePieceIV4.setVisible(true);
        Blue.BluePieceIV234.setVisible(false);
    }
    static void resetBlue1234L(){
        Blue.BluePieceIV1.setLayoutX(426);
        Blue.BluePieceIV1.setLayoutY(426);
        Blue.BluePiece1L = -2;
        Blue.BluePieceIV1.setVisible(true);
        Blue.BluePieceIV2.setLayoutX(478);
        Blue.BluePieceIV2.setLayoutY(479);
        Blue.BluePiece2L = -2;
        Blue.BluePieceIV2.setVisible(true);
        Blue.BluePieceIV3.setLayoutX(426);
        Blue.BluePieceIV3.setLayoutY(478);
        Blue.BluePiece3L = -2;
        Blue.BluePieceIV3.setVisible(true);
        Blue.BluePieceIV4.setLayoutX(479);
        Blue.BluePieceIV4.setLayoutY(426);
        Blue.BluePiece4L = -2;
        Blue.BluePieceIV4.setVisible(true);
        Blue.BluePieceIV1234.setVisible(false);
    }
    static void YellowShortcut(){
        if(Green.GreenPiece1L == 52) {
            basepane.resetGreen1L();
        }
        if(Green.GreenPiece2L == 52) {
            basepane.resetGreen2L();
        }
        if(Green.GreenPiece3L == 52) {
            basepane.resetGreen3L();
        }
        if(Green.GreenPiece4L == 52) {
            basepane.resetGreen4L();
        }
        if(Green.GreenPiece12L == 52){
            basepane.resetGreen12L();
        }
        if(Green.GreenPiece13L == 52){
            basepane.resetGreen13L();
        }
        if(Green.GreenPiece14L == 52){
            basepane.resetGreen14L();
        }
        if(Green.GreenPiece23L == 52){
            basepane.resetGreen23L();
        }
        if(Green.GreenPiece24L == 52){
            basepane.resetGreen24L();
        }
        if(Green.GreenPiece34L == 52){
            basepane.resetGreen34L();
        }
        if(Green.GreenPiece123L == 52){
            basepane.resetGreen123L();
        }
        if(Green.GreenPiece124L == 52){
            basepane.resetGreen124L();
        }
        if(Green.GreenPiece234L == 52){
            basepane.resetGreen234L();
        }
        if(Green.GreenPiece1234L == 52){
            basepane.resetGreen1234L();
        }
    }
    static void RedShortcut(){
        if(Blue.BluePiece1L == 52) {
            Blue.BluePieceIV1.setLayoutX(426);
            Blue.BluePieceIV1.setLayoutY(426);
            Blue.BluePiece1L = -2;
        }
        if(Blue.BluePiece2L == 52) {
            Blue.BluePieceIV2.setLayoutX(478);
            Blue.BluePieceIV2.setLayoutY(479);
            Blue.BluePiece2L = -2;
        }
        if(Blue.BluePiece3L == 52) {
            Blue.BluePieceIV3.setLayoutX(426);
            Blue.BluePieceIV3.setLayoutY(478);
            Blue.BluePiece3L = -2;
        }
        if(Blue.BluePiece4L == 52) {
            Blue.BluePieceIV4.setLayoutX(479);
            Blue.BluePieceIV4.setLayoutY(426);
            Blue.BluePiece4L = -2;
        }
        if(Blue.BluePiece12L == 52){
            basepane.resetBlue12L();
        }
        if(Blue.BluePiece13L == 52){
            basepane.resetBlue13L();
        }
        if(Blue.BluePiece14L == 52){
            basepane.resetBlue14L();
        }
        if(Blue.BluePiece23L == 52){
            basepane.resetBlue23L();
        }
        if(Blue.BluePiece24L == 52){
            basepane.resetBlue24L();
        }
        if(Blue.BluePiece34L == 52){
            basepane.resetBlue34L();
        }
        if(Blue.BluePiece123L == 52){
            basepane.resetBlue123L();
        }
        if(Blue.BluePiece124L == 52){
            basepane.resetBlue124L();
        }
        if(Blue.BluePiece234L == 52){
            basepane.resetBlue234L();
        }
        if(Blue.BluePiece1234L == 52){
            basepane.resetBlue1234L();
        }
    }
    static void GreenShortcut(){
        if(Yellow.YellowPiece1L == 52) {
            Yellow.YellowPieceIV1.setLayoutX(425);
            Yellow.YellowPieceIV1.setLayoutY(73);
            Yellow.YellowPiece1L = -2;
        }
        if(Yellow.YellowPiece2L == 52) {
            Yellow.YellowPieceIV2.setLayoutX(424);
            Yellow.YellowPieceIV2.setLayoutY(22);
            Yellow.YellowPiece2L = -2;
        }
        if(Yellow.YellowPiece3L == 52) {
            Yellow.YellowPieceIV3.setLayoutX(476);
            Yellow.YellowPieceIV3.setLayoutY(22);
            Yellow.YellowPiece3L = -2;
        }
        if(Yellow.YellowPiece4L == 52) {
            Yellow.YellowPieceIV4.setLayoutX(477);
            Yellow.YellowPieceIV4.setLayoutY(72);
            Yellow.YellowPiece4L = -2;
        }
        if(Yellow.YellowPiece12L == 52){
            basepane.resetYellow12L();
        }
        if(Yellow.YellowPiece13L == 52){
            basepane.resetYellow13L();
        }
        if(Yellow.YellowPiece14L == 52){
            basepane.resetYellow14L();
        }
        if(Yellow.YellowPiece23L == 52){
            basepane.resetYellow23L();
        }
        if(Yellow.YellowPiece24L == 52){
            basepane.resetYellow24L();
        }
        if(Yellow.YellowPiece34L == 52){
            basepane.resetYellow34L();
        }
        if(Yellow.YellowPiece123L == 52){
            basepane.resetYellow123L();
        }
        if(Yellow.YellowPiece124L == 52){
            basepane.resetYellow124L();
        }
        if(Yellow.YellowPiece234L == 52){
            basepane.resetYellow234L();
        }
        if(Yellow.YellowPiece1234L == 52){
            basepane.resetYellow1234L();
        }
    }
    static void BlueShortcut(){
        if(Red.RedPiece1L == 52) {
            Red.RedPieceIV1.setLayoutX(75);
            Red.RedPieceIV1.setLayoutY(74);
            Red.RedPiece1L = -2;
        }
        if(Red.RedPiece2L == 52) {
            Red.RedPieceIV2.setLayoutX(23);
            Red.RedPieceIV2.setLayoutY(21);
            Red.RedPiece2L = -2;
        }
        if(Red.RedPiece3L == 52) {
            Red.RedPieceIV3.setLayoutX(21);
            Red.RedPieceIV3.setLayoutY(74);
            Red.RedPiece3L = -2;
        }
        if(Red.RedPiece4L == 52) {
            Red.RedPieceIV4.setLayoutX(75);
            Red.RedPieceIV4.setLayoutY(22);
            Red.RedPiece4L = -2;
        }
    }
    static void RedBoom(ImageView IV){
        if(IV.getLayoutX() == Yellow.YellowPieceIV1.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV1.getLayoutY()
                && Yellow.YellowPieceIV1.isVisible()) {
            basepane.resetYellow1L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV2.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV2.getLayoutY()
                && Yellow.YellowPieceIV2.isVisible()) {
            basepane.resetYellow2L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV3.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV3.getLayoutY()
                && Yellow.YellowPieceIV3.isVisible()) {
            basepane.resetYellow3L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV4.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV4.getLayoutY()
                && Yellow.YellowPieceIV4.isVisible()) {
            basepane.resetYellow4L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV12.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV12.getLayoutY()
                && Yellow.YellowPieceIV12.isVisible()) {
            basepane.resetYellow12L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV13.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV13.getLayoutY()
                && Yellow.YellowPieceIV13.isVisible()) {
            basepane.resetYellow13L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV14.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV14.getLayoutY()
                && Yellow.YellowPieceIV14.isVisible()) {
            basepane.resetYellow14L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV23.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV23.getLayoutY()
                && Yellow.YellowPieceIV23.isVisible()) {
            basepane.resetYellow23L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV24.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV24.getLayoutY()
                && Yellow.YellowPieceIV24.isVisible()) {
            basepane.resetYellow24L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV34.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV34.getLayoutY()
                && Yellow.YellowPieceIV34.isVisible()) {
            basepane.resetYellow34L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV123.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV123.getLayoutY()
                && Yellow.YellowPieceIV123.isVisible()) {
            basepane.resetYellow123L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV124.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV124.getLayoutY()
                && Yellow.YellowPieceIV124.isVisible()) {
            basepane.resetYellow124L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV134.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV134.getLayoutY()
                && Yellow.YellowPieceIV134.isVisible()) {
            basepane.resetYellow134L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV234.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV234.getLayoutY()
                && Yellow.YellowPieceIV234.isVisible()) {
            basepane.resetYellow234L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV1234.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV1234.getLayoutY()
                && Red.RedPieceIV1234.isVisible()) {
            basepane.resetYellow1234L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV1.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV1.getLayoutY()
                && Green.GreenPieceIV1.isVisible()) {
            basepane.resetGreen1L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV2.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV2.getLayoutY()
                && Green.GreenPieceIV2.isVisible()) {
            basepane.resetGreen2L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV3.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV3.getLayoutY()
                && Green.GreenPieceIV3.isVisible()) {
            basepane.resetGreen3L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV4.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV4.getLayoutY()
                && Green.GreenPieceIV4.isVisible()) {
            basepane.resetGreen4L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV12.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV12.getLayoutY()
                && Green.GreenPieceIV12.isVisible()) {
            basepane.resetGreen12L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV13.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV13.getLayoutY()
                && Green.GreenPieceIV13.isVisible()) {
            basepane.resetGreen13L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV14.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV14.getLayoutY()
                && Green.GreenPieceIV14.isVisible()) {
            basepane.resetGreen14L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV23.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV23.getLayoutY()
                && Green.GreenPieceIV23.isVisible()) {
            basepane.resetGreen23L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV24.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV24.getLayoutY()
                && Green.GreenPieceIV24.isVisible()) {
            basepane.resetGreen24L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV34.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV34.getLayoutY()
                && Green.GreenPieceIV34.isVisible()) {
            basepane.resetGreen34L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV123.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV123.getLayoutY()
                && Green.GreenPieceIV123.isVisible()) {
            basepane.resetGreen123L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV124.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV124.getLayoutY()
                && Green.GreenPieceIV124.isVisible()) {
            basepane.resetGreen124L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV134.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV134.getLayoutY()
                && Green.GreenPieceIV134.isVisible()) {
            basepane.resetGreen134L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV234.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV234.getLayoutY()
                && Green.GreenPieceIV234.isVisible()) {
            basepane.resetGreen234L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV1234.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV1234.getLayoutY()
                && Green.GreenPieceIV1234.isVisible()) {
            basepane.resetGreen1234L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV1.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV1.getLayoutY()
                && Blue.BluePieceIV1.isVisible()) {
            basepane.resetBlue1L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV2.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV2.getLayoutY()
                && Blue.BluePieceIV2.isVisible()) {
            basepane.resetBlue2L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV3.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV3.getLayoutY()
                && Blue.BluePieceIV3.isVisible()) {
            basepane.resetBlue3L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV4.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV4.getLayoutY()
                && Blue.BluePieceIV4.isVisible()) {
            basepane.resetBlue4L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV12.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV12.getLayoutY()
                && Blue.BluePieceIV12.isVisible()) {
            basepane.resetBlue12L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV13.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV13.getLayoutY()
                && Blue.BluePieceIV13.isVisible()) {
            basepane.resetBlue13L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV14.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV14.getLayoutY()
                && Blue.BluePieceIV14.isVisible()) {
            basepane.resetBlue14L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV23.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV23.getLayoutY()
                && Blue.BluePieceIV23.isVisible()) {
            basepane.resetBlue23L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV24.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV24.getLayoutY()
                && Blue.BluePieceIV24.isVisible()) {
            basepane.resetBlue24L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV34.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV34.getLayoutY()
                && Blue.BluePieceIV34.isVisible()) {
            basepane.resetBlue34L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV123.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV123.getLayoutY()
                && Blue.BluePieceIV123.isVisible()) {
            basepane.resetBlue123L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV124.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV124.getLayoutY()
                && Blue.BluePieceIV124.isVisible()) {
            basepane.resetBlue124L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV134.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV134.getLayoutY()
                && Blue.BluePieceIV134.isVisible()) {
            basepane.resetBlue134L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV234.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV234.getLayoutY()
                && Blue.BluePieceIV234.isVisible()) {
            basepane.resetBlue234L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV1234.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV1234.getLayoutY()
                && Blue.BluePieceIV1234.isVisible()) {
            basepane.resetBlue1234L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
    }
    static void YellowBoom(ImageView IV){
        if(IV.getLayoutX() == Red.RedPieceIV1.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV1.getLayoutY()
                && Yellow.YellowPieceIV1.isVisible()) {
            basepane.resetRed1L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Red.RedPieceIV2.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV2.getLayoutY()
                && Red.RedPieceIV2.isVisible()) {
            basepane.resetRed2L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Red.RedPieceIV3.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV3.getLayoutY()
                && Red.RedPieceIV3.isVisible()) {
            basepane.resetRed3L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Red.RedPieceIV4.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV4.getLayoutY()
                && Red.RedPieceIV4.isVisible()) {
            basepane.resetRed4L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Red.RedPieceIV12.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV12.getLayoutY()
                && Red.RedPieceIV12.isVisible()) {
            basepane.resetRed12L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Red.RedPieceIV13.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV13.getLayoutY()
                && Red.RedPieceIV13.isVisible()) {
            basepane.resetRed13L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Red.RedPieceIV14.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV14.getLayoutY()
                && Red.RedPieceIV14.isVisible()) {
            basepane.resetRed14L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Red.RedPieceIV23.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV23.getLayoutY()
                && Red.RedPieceIV23.isVisible()) {
            basepane.resetRed23L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Red.RedPieceIV24.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV24.getLayoutY()
                && Red.RedPieceIV24.isVisible()) {
            basepane.resetRed24L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Red.RedPieceIV34.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV34.getLayoutY()
                && Red.RedPieceIV34.isVisible()) {
            basepane.resetRed34L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Red.RedPieceIV123.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV123.getLayoutY()
                && Red.RedPieceIV123.isVisible()) {
            basepane.resetRed123L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Red.RedPieceIV124.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV124.getLayoutY()
                && Red.RedPieceIV124.isVisible()) {
            basepane.resetRed124L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Red.RedPieceIV134.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV134.getLayoutY()
                && Red.RedPieceIV134.isVisible()) {
            basepane.resetRed134L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Red.RedPieceIV234.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV234.getLayoutY()
                && Red.RedPieceIV234.isVisible()) {
            basepane.resetRed234L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Red.RedPieceIV1234.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV1234.getLayoutY()
                && Red.RedPieceIV1234.isVisible()) {
            basepane.resetRed1234L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV1.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV1.getLayoutY()
                && Green.GreenPieceIV1.isVisible()) {
            basepane.resetGreen1L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV2.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV2.getLayoutY()
                && Green.GreenPieceIV2.isVisible()) {
            basepane.resetGreen2L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV3.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV3.getLayoutY()
                && Green.GreenPieceIV3.isVisible()) {
            basepane.resetGreen3L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV4.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV4.getLayoutY()
                && Green.GreenPieceIV4.isVisible()) {
            basepane.resetGreen4L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV12.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV12.getLayoutY()
                && Green.GreenPieceIV12.isVisible()) {
            basepane.resetGreen12L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV13.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV13.getLayoutY()
                && Green.GreenPieceIV13.isVisible()) {
            basepane.resetGreen13L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV14.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV14.getLayoutY()
                && Green.GreenPieceIV14.isVisible()) {
            basepane.resetGreen14L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV23.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV23.getLayoutY()
                && Green.GreenPieceIV23.isVisible()) {
            basepane.resetGreen23L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV24.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV24.getLayoutY()
                && Green.GreenPieceIV24.isVisible()) {
            basepane.resetGreen24L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV34.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV34.getLayoutY()
                && Green.GreenPieceIV34.isVisible()) {
            basepane.resetGreen34L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV123.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV123.getLayoutY()
                && Green.GreenPieceIV123.isVisible()) {
            basepane.resetGreen123L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV124.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV124.getLayoutY()
                && Green.GreenPieceIV124.isVisible()) {
            basepane.resetGreen124L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV134.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV134.getLayoutY()
                && Green.GreenPieceIV134.isVisible()) {
            basepane.resetGreen134L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV234.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV234.getLayoutY()
                && Green.GreenPieceIV234.isVisible()) {
            basepane.resetGreen234L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV1234.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV1234.getLayoutY()
                && Green.GreenPieceIV1234.isVisible()) {
            basepane.resetGreen1234L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV1.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV1.getLayoutY()
                && Blue.BluePieceIV1.isVisible()) {
            basepane.resetBlue1L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV2.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV2.getLayoutY()
                && Blue.BluePieceIV2.isVisible()) {
            basepane.resetBlue2L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV3.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV3.getLayoutY()
                && Blue.BluePieceIV3.isVisible()) {
            basepane.resetBlue3L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV4.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV4.getLayoutY()
                && Blue.BluePieceIV4.isVisible()) {
            basepane.resetBlue4L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV12.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV12.getLayoutY()
                && Blue.BluePieceIV12.isVisible()) {
            basepane.resetBlue12L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV13.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV13.getLayoutY()
                && Blue.BluePieceIV13.isVisible()) {
            basepane.resetBlue13L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV14.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV14.getLayoutY()
                && Blue.BluePieceIV14.isVisible()) {
            basepane.resetBlue14L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV23.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV23.getLayoutY()
                && Blue.BluePieceIV23.isVisible()) {
            basepane.resetBlue23L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV24.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV24.getLayoutY()
                && Blue.BluePieceIV24.isVisible()) {
            basepane.resetBlue24L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV34.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV34.getLayoutY()
                && Blue.BluePieceIV34.isVisible()) {
            basepane.resetBlue34L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV123.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV123.getLayoutY()
                && Blue.BluePieceIV123.isVisible()) {
            basepane.resetBlue123L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV124.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV124.getLayoutY()
                && Blue.BluePieceIV124.isVisible()) {
            basepane.resetBlue124L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV134.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV134.getLayoutY()
                && Blue.BluePieceIV134.isVisible()) {
            basepane.resetBlue134L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV234.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV234.getLayoutY()
                && Blue.BluePieceIV234.isVisible()) {
            basepane.resetBlue234L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV1234.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV1234.getLayoutY()
                && Blue.BluePieceIV1234.isVisible()) {
            basepane.resetBlue1234L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
    }
    static void GreenBoom(ImageView IV){
        if(IV.getLayoutX() == Red.RedPieceIV1.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV1.getLayoutY()
                && Yellow.YellowPieceIV1.isVisible()) {
            basepane.resetRed1L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Red.RedPieceIV2.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV2.getLayoutY()
                && Red.RedPieceIV2.isVisible()) {
            basepane.resetRed2L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Red.RedPieceIV3.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV3.getLayoutY()
                && Red.RedPieceIV3.isVisible()) {
            basepane.resetRed3L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Red.RedPieceIV4.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV4.getLayoutY()
                && Red.RedPieceIV4.isVisible()) {
            basepane.resetRed4L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Red.RedPieceIV12.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV12.getLayoutY()
                && Red.RedPieceIV12.isVisible()) {
            basepane.resetRed12L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Red.RedPieceIV13.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV13.getLayoutY()
                && Red.RedPieceIV13.isVisible()) {
            basepane.resetRed13L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Red.RedPieceIV14.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV14.getLayoutY()
                && Red.RedPieceIV14.isVisible()) {
            basepane.resetRed14L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Red.RedPieceIV23.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV23.getLayoutY()
                && Red.RedPieceIV23.isVisible()) {
            basepane.resetRed23L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Red.RedPieceIV24.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV24.getLayoutY()
                && Red.RedPieceIV24.isVisible()) {
            basepane.resetRed24L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Red.RedPieceIV34.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV34.getLayoutY()
                && Red.RedPieceIV34.isVisible()) {
            basepane.resetRed34L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Red.RedPieceIV123.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV123.getLayoutY()
                && Red.RedPieceIV123.isVisible()) {
            basepane.resetRed123L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Red.RedPieceIV124.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV124.getLayoutY()
                && Red.RedPieceIV124.isVisible()) {
            basepane.resetRed124L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Red.RedPieceIV134.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV134.getLayoutY()
                && Red.RedPieceIV134.isVisible()) {
            basepane.resetRed134L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Red.RedPieceIV234.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV234.getLayoutY()
                && Red.RedPieceIV234.isVisible()) {
            basepane.resetRed234L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Red.RedPieceIV1234.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV1234.getLayoutY()
                && Red.RedPieceIV1234.isVisible()) {
            basepane.resetRed1234L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV1.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV1.getLayoutY()
                && Yellow.YellowPieceIV1.isVisible()) {
            basepane.resetYellow1L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV2.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV2.getLayoutY()
                && Yellow.YellowPieceIV2.isVisible()) {
            basepane.resetYellow2L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV3.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV3.getLayoutY()
                && Yellow.YellowPieceIV3.isVisible()) {
            basepane.resetYellow3L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV4.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV4.getLayoutY()
                && Yellow.YellowPieceIV4.isVisible()) {
            basepane.resetYellow4L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV12.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV12.getLayoutY()
                && Yellow.YellowPieceIV12.isVisible()) {
            basepane.resetYellow12L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV13.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV13.getLayoutY()
                && Yellow.YellowPieceIV13.isVisible()) {
            basepane.resetYellow13L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV14.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV14.getLayoutY()
                && Yellow.YellowPieceIV14.isVisible()) {
            basepane.resetYellow14L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV23.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV23.getLayoutY()
                && Yellow.YellowPieceIV23.isVisible()) {
            basepane.resetYellow23L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV24.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV24.getLayoutY()
                && Yellow.YellowPieceIV24.isVisible()) {
            basepane.resetYellow24L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV34.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV34.getLayoutY()
                && Yellow.YellowPieceIV34.isVisible()) {
            basepane.resetYellow34L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV123.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV123.getLayoutY()
                && Yellow.YellowPieceIV123.isVisible()) {
            basepane.resetYellow123L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV124.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV124.getLayoutY()
                && Yellow.YellowPieceIV124.isVisible()) {
            basepane.resetYellow124L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV134.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV134.getLayoutY()
                && Yellow.YellowPieceIV134.isVisible()) {
            basepane.resetYellow134L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV234.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV234.getLayoutY()
                && Yellow.YellowPieceIV234.isVisible()) {
            basepane.resetYellow234L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV1234.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV1234.getLayoutY()
                && Red.RedPieceIV1234.isVisible()) {
            basepane.resetYellow1234L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV1.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV1.getLayoutY()
                && Blue.BluePieceIV1.isVisible()) {
            basepane.resetBlue1L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV2.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV2.getLayoutY()
                && Blue.BluePieceIV2.isVisible()) {
            basepane.resetBlue2L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV3.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV3.getLayoutY()
                && Blue.BluePieceIV3.isVisible()) {
            basepane.resetBlue3L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV4.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV4.getLayoutY()
                && Blue.BluePieceIV4.isVisible()) {
            basepane.resetBlue4L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV12.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV12.getLayoutY()
                && Blue.BluePieceIV12.isVisible()) {
            basepane.resetBlue12L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV13.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV13.getLayoutY()
                && Blue.BluePieceIV13.isVisible()) {
            basepane.resetBlue13L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV14.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV14.getLayoutY()
                && Blue.BluePieceIV14.isVisible()) {
            basepane.resetBlue14L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV23.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV23.getLayoutY()
                && Blue.BluePieceIV23.isVisible()) {
            basepane.resetBlue23L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV24.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV24.getLayoutY()
                && Blue.BluePieceIV24.isVisible()) {
            basepane.resetBlue24L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV34.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV34.getLayoutY()
                && Blue.BluePieceIV34.isVisible()) {
            basepane.resetBlue34L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV123.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV123.getLayoutY()
                && Blue.BluePieceIV123.isVisible()) {
            basepane.resetBlue123L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV124.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV124.getLayoutY()
                && Blue.BluePieceIV124.isVisible()) {
            basepane.resetBlue124L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV134.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV134.getLayoutY()
                && Blue.BluePieceIV134.isVisible()) {
            basepane.resetBlue134L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV234.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV234.getLayoutY()
                && Blue.BluePieceIV234.isVisible()) {
            basepane.resetBlue234L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Blue.BluePieceIV1234.getLayoutX() && IV.getLayoutY() == Blue.BluePieceIV1234.getLayoutY()
                && Blue.BluePieceIV1234.isVisible()) {
            basepane.resetBlue1234L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
    }
    static void BlueBoom(ImageView IV){
        if(IV.getLayoutX() == Red.RedPieceIV1.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV1.getLayoutY()
                && Yellow.YellowPieceIV1.isVisible()) {
            basepane.resetRed1L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Red.RedPieceIV2.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV2.getLayoutY()
                && Red.RedPieceIV2.isVisible()) {
            basepane.resetRed2L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Red.RedPieceIV3.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV3.getLayoutY()
                && Red.RedPieceIV3.isVisible()) {
            basepane.resetRed3L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Red.RedPieceIV4.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV4.getLayoutY()
                && Red.RedPieceIV4.isVisible()) {
            basepane.resetRed4L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Red.RedPieceIV12.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV12.getLayoutY()
                && Red.RedPieceIV12.isVisible()) {
            basepane.resetRed12L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Red.RedPieceIV13.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV13.getLayoutY()
                && Red.RedPieceIV13.isVisible()) {
            basepane.resetRed13L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Red.RedPieceIV14.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV14.getLayoutY()
                && Red.RedPieceIV14.isVisible()) {
            basepane.resetRed14L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Red.RedPieceIV23.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV23.getLayoutY()
                && Red.RedPieceIV23.isVisible()) {
            basepane.resetRed23L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Red.RedPieceIV24.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV24.getLayoutY()
                && Red.RedPieceIV24.isVisible()) {
            basepane.resetRed24L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Red.RedPieceIV34.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV34.getLayoutY()
                && Red.RedPieceIV34.isVisible()) {
            basepane.resetRed34L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Red.RedPieceIV123.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV123.getLayoutY()
                && Red.RedPieceIV123.isVisible()) {
            basepane.resetRed123L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Red.RedPieceIV124.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV124.getLayoutY()
                && Red.RedPieceIV124.isVisible()) {
            basepane.resetRed124L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Red.RedPieceIV134.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV134.getLayoutY()
                && Red.RedPieceIV134.isVisible()) {
            basepane.resetRed134L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Red.RedPieceIV234.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV234.getLayoutY()
                && Red.RedPieceIV234.isVisible()) {
            basepane.resetRed234L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Red.RedPieceIV1234.getLayoutX() && IV.getLayoutY() == Red.RedPieceIV1234.getLayoutY()
                && Red.RedPieceIV1234.isVisible()) {
            basepane.resetRed1234L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV1.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV1.getLayoutY()
                && Yellow.YellowPieceIV1.isVisible()) {
            basepane.resetYellow1L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV2.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV2.getLayoutY()
                && Yellow.YellowPieceIV2.isVisible()) {
            basepane.resetYellow2L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV3.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV3.getLayoutY()
                && Yellow.YellowPieceIV3.isVisible()) {
            basepane.resetYellow3L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV4.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV4.getLayoutY()
                && Yellow.YellowPieceIV4.isVisible()) {
            basepane.resetYellow4L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV12.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV12.getLayoutY()
                && Yellow.YellowPieceIV12.isVisible()) {
            basepane.resetYellow12L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV13.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV13.getLayoutY()
                && Yellow.YellowPieceIV13.isVisible()) {
            basepane.resetYellow13L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV14.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV14.getLayoutY()
                && Yellow.YellowPieceIV14.isVisible()) {
            basepane.resetYellow14L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV23.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV23.getLayoutY()
                && Yellow.YellowPieceIV23.isVisible()) {
            basepane.resetYellow23L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV24.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV24.getLayoutY()
                && Yellow.YellowPieceIV24.isVisible()) {
            basepane.resetYellow24L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV34.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV34.getLayoutY()
                && Yellow.YellowPieceIV34.isVisible()) {
            basepane.resetYellow34L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV123.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV123.getLayoutY()
                && Yellow.YellowPieceIV123.isVisible()) {
            basepane.resetYellow123L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV124.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV124.getLayoutY()
                && Yellow.YellowPieceIV124.isVisible()) {
            basepane.resetYellow124L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV134.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV134.getLayoutY()
                && Yellow.YellowPieceIV134.isVisible()) {
            basepane.resetYellow134L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV234.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV234.getLayoutY()
                && Yellow.YellowPieceIV234.isVisible()) {
            basepane.resetYellow234L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Yellow.YellowPieceIV1234.getLayoutX() && IV.getLayoutY() == Yellow.YellowPieceIV1234.getLayoutY()
                && Red.RedPieceIV1234.isVisible()) {
            basepane.resetYellow1234L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV1.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV1.getLayoutY()
                && Green.GreenPieceIV1.isVisible()) {
            basepane.resetGreen1L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV2.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV2.getLayoutY()
                && Green.GreenPieceIV2.isVisible()) {
            basepane.resetGreen2L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV3.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV3.getLayoutY()
                && Green.GreenPieceIV3.isVisible()) {
            basepane.resetGreen3L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV4.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV4.getLayoutY()
                && Green.GreenPieceIV4.isVisible()) {
            basepane.resetGreen4L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV12.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV12.getLayoutY()
                && Green.GreenPieceIV12.isVisible()) {
            basepane.resetGreen12L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV13.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV13.getLayoutY()
                && Green.GreenPieceIV13.isVisible()) {
            basepane.resetGreen13L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV14.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV14.getLayoutY()
                && Green.GreenPieceIV14.isVisible()) {
            basepane.resetGreen14L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV23.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV23.getLayoutY()
                && Green.GreenPieceIV23.isVisible()) {
            basepane.resetGreen23L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV24.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV24.getLayoutY()
                && Green.GreenPieceIV24.isVisible()) {
            basepane.resetGreen24L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV34.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV34.getLayoutY()
                && Green.GreenPieceIV34.isVisible()) {
            basepane.resetGreen34L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV123.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV123.getLayoutY()
                && Green.GreenPieceIV123.isVisible()) {
            basepane.resetGreen123L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV124.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV124.getLayoutY()
                && Green.GreenPieceIV124.isVisible()) {
            basepane.resetGreen124L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV134.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV134.getLayoutY()
                && Green.GreenPieceIV134.isVisible()) {
            basepane.resetGreen134L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV234.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV234.getLayoutY()
                && Green.GreenPieceIV234.isVisible()) {
            basepane.resetGreen234L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
        if(IV.getLayoutX() == Green.GreenPieceIV1234.getLayoutX() && IV.getLayoutY() == Green.GreenPieceIV1234.getLayoutY()
                && Green.GreenPieceIV1234.isVisible()) {
            basepane.resetGreen1234L();
            basepane.getBoomIV(IV.getLayoutX(),IV.getLayoutY());
        }
    }


    public void start(Stage primaryStage)throws Exception {
        File file1 = new File("C:\\Codes\\practise\\src\\sample\\File\\File1.txt");
        File file2 = new File("C:\\Codes\\practise\\src\\sample\\File\\File2.txt");
        File file3 = new File("C:\\Codes\\practise\\src\\sample\\File\\File3.txt");
        File file4 = new File("C:\\Codes\\practise\\src\\sample\\File\\File4.txt");
        File file5 = new File("C:\\Codes\\practise\\src\\sample\\File\\File5.txt");
        File file6 = new File("C:\\Codes\\practise\\src\\sample\\File\\File6.txt");
        File file7 = new File("C:\\Codes\\practise\\src\\sample\\File\\File7.txt");
        File file8 = new File("C:\\Codes\\practise\\src\\sample\\File\\File8.txt");

        Scanner input1 = new Scanner(file1);
        Scanner input2 = new Scanner(file2);
        Scanner input3 = new Scanner(file3);
        Scanner input4 = new Scanner(file4);
        Scanner input5 = new Scanner(file5);
        Scanner input6 = new Scanner(file6);
        Scanner input7 = new Scanner(file7);
        Scanner input8 = new Scanner(file8);
        ArrayList<Integer> number = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        Font font = new Font("Courier New", 15);

        Pane basePane = new Pane();//引入一个面板放置棋盘

        Image oneIM = new Image("one.png");
        Image twoIM = new Image("two.png");
        Image threeIM = new Image("three.png");
        Image fourIM = new Image("four.png");
        Image fiveIM = new Image("five.png");
        Image sixIM = new Image("six.png");
        Image musicIM = new Image("Circle.png");

        ImageView oneIV1 = new ImageView(oneIM);
        oneIV1.setLayoutX(545);
        oneIV1.setLayoutY(110);
        oneIV1.setFitWidth(65);
        oneIV1.setFitHeight(65);
        oneIV1.setVisible(false);
        ImageView twoIV1 = new ImageView(twoIM);
        twoIV1.setLayoutX(545);
        twoIV1.setLayoutY(110);
        twoIV1.setFitWidth(65);
        twoIV1.setFitHeight(65);
        twoIV1.setVisible(false);
        ImageView threeIV1 = new ImageView(threeIM);
        threeIV1.setLayoutX(545);
        threeIV1.setLayoutY(110);
        threeIV1.setFitWidth(65);
        threeIV1.setFitHeight(65);
        threeIV1.setVisible(false);
        ImageView fourIV1 = new ImageView(fourIM);
        fourIV1.setLayoutX(545);
        fourIV1.setLayoutY(110);
        fourIV1.setFitWidth(65);
        fourIV1.setFitHeight(65);
        fourIV1.setVisible(false);
        ImageView fiveIV1 = new ImageView(fiveIM);
        fiveIV1.setLayoutX(545);
        fiveIV1.setLayoutY(110);
        fiveIV1.setFitWidth(65);
        fiveIV1.setFitHeight(65);
        fiveIV1.setVisible(false);
        ImageView sixIV1 = new ImageView(sixIM);
        sixIV1.setLayoutX(545);
        sixIV1.setLayoutY(110);
        sixIV1.setFitWidth(65);
        sixIV1.setFitHeight(65);
        sixIV1.setVisible(false);
        ImageView oneIV2 = new ImageView(oneIM);
        oneIV2.setLayoutX(640);
        oneIV2.setLayoutY(110);
        oneIV2.setFitWidth(65);
        oneIV2.setFitHeight(65);
        oneIV2.setVisible(false);
        ImageView twoIV2 = new ImageView(twoIM);
        twoIV2.setLayoutX(640);
        twoIV2.setLayoutY(110);
        twoIV2.setFitWidth(65);
        twoIV2.setFitHeight(65);
        twoIV2.setVisible(false);
        ImageView threeIV2 = new ImageView(threeIM);
        threeIV2.setLayoutX(640);
        threeIV2.setLayoutY(110);
        threeIV2.setFitWidth(65);
        threeIV2.setFitHeight(65);
        threeIV2.setVisible(false);
        ImageView fourIV2 = new ImageView(fourIM);
        fourIV2.setLayoutX(640);
        fourIV2.setLayoutY(110);
        fourIV2.setFitWidth(65);
        fourIV2.setFitHeight(65);
        fourIV2.setVisible(false);
        ImageView fiveIV2 = new ImageView(fiveIM);
        fiveIV2.setLayoutX(640);
        fiveIV2.setLayoutY(110);
        fiveIV2.setFitWidth(65);
        fiveIV2.setFitHeight(65);
        fiveIV2.setVisible(false);
        ImageView sixIV2 = new ImageView(sixIM);
        sixIV2.setLayoutX(640);
        sixIV2.setLayoutY(110);
        sixIV2.setFitWidth(65);
        sixIV2.setFitHeight(65);
        sixIV2.setVisible(false);
        Image champion = new Image("champion.png");
        ImageView championIV = new ImageView(champion);
        championIV.setLayoutX(535);
        championIV.setLayoutY(14);
        championIV.setFitWidth(64);
        championIV.setFitHeight(106);

        Image basePicture = new Image("basePicture.jpg");
        ImageView basePictureIV = new ImageView(basePicture);
        basePictureIV.setFitHeight(558);
        basePictureIV.setFitWidth(720);
        basePane.getChildren().add(basePictureIV);

        Image chessboard = new Image("chessboard.jpg");//导入图片
        ImageView Chessboard = new ImageView(chessboard);//显示导入的图片
        Chessboard.setFitHeight(530);//调整图片大小
        Chessboard.setFitWidth(530);//3048 x 3036（这是图片原大小）（此处应为按比例缩放）
        basePane.getChildren().add(Chessboard);//将棋盘加入面板

        Label label2 = new Label("Choose the pace:");
        label2.setVisible(false);
        label2.setFont(Font.font("Franklin Gothic Demi Cond", FontWeight.NORMAL, FontPosture.ITALIC, 20));
        label2.setTextFill(Color.rgb(80, 100, 32));
        basePane.getChildren().add(label2);
        label2.setLayoutX(568);
        label2.setLayoutY(248);


        Button btDice = new Button("Dice");
        Image Dice = new Image("dice.png");
        ImageView DiceIV = new ImageView(Dice);
        DiceIV.setFitWidth(20);
        DiceIV.setFitHeight(20);
        btDice.setFont(font);
        btDice.setGraphic(DiceIV);
        basePane.getChildren().addAll(btDice);
        btDice.setLayoutX(640);
        btDice.setLayoutY(210);

        btDice.setOnAction(event -> {
            BoomIV.setVisible(false);
            Yellow.WinWDIV.setVisible(false);
            Red.WinWDIV.setVisible(false);
            Green.WinWDIV.setVisible(false);
            Blue.WinWDIV.setVisible(false);
            if (i == 2) {
                new AlertBox().display("Warning", "You haven't  chosen Auto yet!");
            }
            if (Exception == 1 || YellowFlag || RedFlag || BlueFlag || GreenFlag) {
                new AlertBox().display("Warning", "Please choose your movement first");
            } else if (i == 0 && Exception == 0) {
                ComboBox<Integer> cbo2 = new ComboBox<>();
                number.add(dice.getNumber());
                //cbo2为选择骰子之后弹出的复选框；
                if (dice.count % 2 == 1) {
                    if (number.get(0) == 1) oneIV1.setVisible(true);
                    if (number.get(0) == 2) twoIV1.setVisible(true);
                    if (number.get(0) == 3) threeIV1.setVisible(true);
                    if (number.get(0) == 4) fourIV1.setVisible(true);
                    if (number.get(0) == 5) fiveIV1.setVisible(true);
                    if (number.get(0) == 6) sixIV1.setVisible(true);
                }
                if (dice.count % 2 == 0) {
                    Exception = 1;
                    label2.setVisible(true);
                    diceNumber1 = number.get(0);
                    diceNumber2 = number.get(1);
                    if (number.get(1) == 1) oneIV2.setVisible(true);
                    if (number.get(1) == 2) twoIV2.setVisible(true);
                    if (number.get(1) == 3) threeIV2.setVisible(true);
                    if (number.get(1) == 4) fourIV2.setVisible(true);
                    if (number.get(1) == 5) fiveIV2.setVisible(true);
                    if (number.get(1) == 6) sixIV2.setVisible(true);
                    if (dice.PlayerCount % 4 == 1) {
                        YellowFlag = true;
                        Yellow.YellowNumber1 = diceNumber1;
                        Yellow.YellowNumber2 = diceNumber2;
                        RedCount = 0;
                        greenCount = 0;
                        blueCount = 0;
                        if (Yellow.YellowNumber1 + Yellow.YellowNumber2 >= 10 && yellowCount <= 2) {
                            yellowCount++;
                            if (yellowCount != 3)
                                dice.PlayerCount--;
                            yellowFlagOpen = true;
                        }

                        if (yellowCount >= 3) {
                            YellowFlag = false;
                            oneIV1.setVisible(false);
                            twoIV1.setVisible(false);
                            threeIV1.setVisible(false);
                            fourIV1.setVisible(false);
                            fiveIV1.setVisible(false);
                            sixIV1.setVisible(false);
                            oneIV2.setVisible(false);
                            twoIV2.setVisible(false);
                            threeIV2.setVisible(false);
                            fourIV2.setVisible(false);
                            fiveIV2.setVisible(false);
                            sixIV2.setVisible(false);
                            if (Yellow.y1 > 0 && Yellow.YellowNumber1 + Yellow.YellowNumber2 >= 10) {
                                Yellow.YellowPieceIV1.setLayoutX(425);
                                Yellow.YellowPieceIV1.setLayoutY(73);
                                Yellow.YellowPieceIV1.setRotate(0);
                                Yellow.YellowPiece1L = -2;
                                Yellow.y1 = 0;
                                ep.setEp("Pity! It's player2's turn now");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Yellow.y2 > 0 && Yellow.YellowNumber1 + Yellow.YellowNumber2 >= 10) {
                                Yellow.YellowPieceIV2.setLayoutX(424);
                                Yellow.YellowPieceIV2.setLayoutY(22);
                                Yellow.YellowPieceIV2.setRotate(0);
                                Yellow.YellowPiece2L = -2;
                                Yellow.y2 = 0;
                                ep.setEp("Pity! It's player2's turn now");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Yellow.y3 > 0 && Yellow.YellowNumber1 + Yellow.YellowNumber2 >= 10) {
                                Yellow.YellowPieceIV3.setLayoutX(476);
                                Yellow.YellowPieceIV3.setLayoutY(22);
                                Yellow.YellowPieceIV3.setRotate(0);
                                Yellow.YellowPiece3L = -2;
                                Yellow.y3 = 0;
                                ep.setEp("Pity! It's player2's turn now");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Yellow.y4 > 0 && Yellow.YellowNumber1 + Yellow.YellowNumber2 >= 10) {
                                Yellow.YellowPieceIV4.setLayoutX(477);
                                Yellow.YellowPieceIV4.setLayoutY(72);
                                Yellow.YellowPieceIV4.setRotate(0);
                                Yellow.YellowPiece4L = -2;
                                Yellow.y4 = 0;
                                ep.setEp("Pity! It's player2's turn now");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if ((Yellow.y1 > 0 || Yellow.y2 > 0 || Yellow.y12 > 0) && Yellow.YellowNumber1 + Yellow.YellowNumber2 >= 10) {
                                Yellow.YellowPieceIV1.setLayoutX(425);
                                Yellow.YellowPieceIV1.setLayoutY(73);
                                Yellow.YellowPieceIV1.setRotate(0);
                                Yellow.YellowPiece1L = -2;
                                Yellow.YellowPieceIV2.setLayoutX(424);
                                Yellow.YellowPieceIV2.setLayoutY(22);
                                Yellow.YellowPieceIV2.setRotate(0);
                                Yellow.YellowPiece2L = -2;
                                Yellow.YellowPieceIV1.setVisible(true);
                                Yellow.YellowPieceIV2.setVisible(true);
                                Yellow.YellowPiece12L = -2;
                                Yellow.YellowPieceIV12.setVisible(false);
                                ep.setEp("Pity! It's player2's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }

                            if ((Yellow.y1 > 0 || Yellow.y3 > 0 || Yellow.y13 > 0) && Yellow.YellowNumber1 + Yellow.YellowNumber2 >= 10) {
                                Yellow.YellowPieceIV1.setLayoutX(425);
                                Yellow.YellowPieceIV1.setLayoutY(73);
                                Yellow.YellowPieceIV1.setRotate(0);
                                Yellow.YellowPiece1L = -2;
                                Yellow.YellowPieceIV3.setLayoutX(476);
                                Yellow.YellowPieceIV3.setLayoutY(22);
                                Yellow.YellowPieceIV3.setRotate(0);
                                Yellow.YellowPiece3L = -2;
                                Yellow.YellowPieceIV1.setVisible(true);
                                Yellow.YellowPieceIV3.setVisible(true);
                                Yellow.YellowPiece13L = -2;
                                Yellow.YellowPieceIV13.setVisible(false);
                                ep.setEp("Pity! It's player2's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Yellow.y1 > 0 || Yellow.y4 > 0 || Yellow.y14 > 0 && Yellow.YellowNumber1 + Yellow.YellowNumber2 >= 10) {
                                Yellow.YellowPieceIV1.setLayoutX(425);
                                Yellow.YellowPieceIV1.setLayoutY(73);
                                Yellow.YellowPieceIV1.setRotate(0);
                                Yellow.YellowPiece1L = -2;
                                Yellow.YellowPieceIV4.setLayoutX(477);
                                Yellow.YellowPieceIV4.setLayoutY(72);
                                Yellow.YellowPieceIV4.setRotate(0);
                                Yellow.YellowPiece4L = -2;
                                Yellow.YellowPieceIV1.setVisible(true);
                                Yellow.YellowPieceIV4.setVisible(true);
                                Yellow.YellowPiece14L = -2;
                                Yellow.YellowPieceIV14.setVisible(false);
                                ep.setEp("Pity! It's player2's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Yellow.y2 > 0 || Yellow.y3 > 0 || Yellow.y23 > 0 && Yellow.YellowNumber1 + Yellow.YellowNumber2 >= 10) {
                                Yellow.YellowPieceIV2.setLayoutX(424);
                                Yellow.YellowPieceIV2.setLayoutY(22);
                                Yellow.YellowPieceIV2.setRotate(0);
                                Yellow.YellowPiece1L = -2;
                                Yellow.YellowPieceIV3.setLayoutX(476);
                                Yellow.YellowPieceIV3.setLayoutY(22);
                                Yellow.YellowPieceIV3.setRotate(0);
                                Yellow.YellowPiece2L = -2;
                                Yellow.YellowPieceIV2.setVisible(true);
                                Yellow.YellowPieceIV3.setVisible(true);
                                Yellow.YellowPiece23L = -2;
                                Yellow.YellowPieceIV23.setVisible(false);
                                ep.setEp("Pity! It's player2's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Yellow.y2 > 0 || Yellow.y4 > 0 || Yellow.y24 > 0 && Yellow.YellowNumber1 + Yellow.YellowNumber2 >= 10) {
                                Yellow.YellowPieceIV2.setLayoutX(424);
                                Yellow.YellowPieceIV2.setLayoutY(22);
                                Yellow.YellowPieceIV2.setRotate(0);
                                Yellow.YellowPiece2L = -2;
                                Yellow.YellowPieceIV4.setLayoutX(477);
                                Yellow.YellowPieceIV4.setLayoutY(72);
                                Yellow.YellowPieceIV4.setRotate(0);
                                Yellow.YellowPiece4L = -2;
                                Yellow.YellowPieceIV2.setVisible(true);
                                Yellow.YellowPieceIV4.setVisible(true);
                                Yellow.YellowPiece24L = -2;
                                Yellow.YellowPieceIV24.setVisible(false);
                                ep.setEp("Pity! It's player2's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                                if (Yellow.y3 > 0 || Yellow.y4 > 0 || Yellow.y34 > 0 && Yellow.YellowNumber1 + Yellow.YellowNumber2 >= 10) {
                                    Yellow.YellowPieceIV4.setLayoutX(477);
                                    Yellow.YellowPieceIV4.setLayoutY(72);
                                    Yellow.YellowPieceIV4.setRotate(0);
                                    Yellow.YellowPiece4L = -2;
                                    Yellow.YellowPieceIV4.setVisible(true);
                                    Yellow.YellowPieceIV3.setLayoutX(476);
                                    Yellow.YellowPieceIV3.setLayoutY(22);
                                    Yellow.YellowPieceIV3.setRotate(0);
                                    Yellow.YellowPiece3L = -2;
                                    Yellow.YellowPieceIV3.setVisible(true);
                                    Yellow.YellowPiece34L = -2;
                                    Yellow.YellowPieceIV34.setVisible(false);
                                    ep.setEp("Pity! It's player2's turn now ");
                                    oneIV1.setVisible(false);
                                    twoIV1.setVisible(false);
                                    threeIV1.setVisible(false);
                                    fourIV1.setVisible(false);
                                    fiveIV1.setVisible(false);
                                    sixIV1.setVisible(false);
                                    oneIV2.setVisible(false);
                                    twoIV2.setVisible(false);
                                    threeIV2.setVisible(false);
                                    fourIV2.setVisible(false);
                                    fiveIV2.setVisible(false);
                                    sixIV2.setVisible(false);
                                }
                            if ((Yellow.y1 > 0 || Yellow.y2> 0|| Yellow.y3 > 0 ||Yellow.y12 > 0 || Yellow.y23 > 0|| Yellow.y13 > 0 ||Yellow.y123> 0) && Yellow.YellowNumber1 + Yellow.YellowNumber2 >= 10) {
                                Yellow.YellowPieceIV1.setLayoutX(425);
                                Yellow.YellowPieceIV1.setLayoutY(73);
                                Yellow.YellowPieceIV1.setRotate(0);
                                Yellow.YellowPiece1L = -2;
                                Yellow.YellowPieceIV2.setLayoutX(424);
                                Yellow.YellowPieceIV2.setLayoutY(22);
                                Yellow.YellowPieceIV2.setRotate(0);
                                Yellow.YellowPiece2L = -2;
                                Yellow.YellowPieceIV3.setLayoutX(476);
                                Yellow.YellowPieceIV3.setLayoutY(22);
                                Yellow.YellowPieceIV3.setRotate(0);
                                Yellow.YellowPiece3L = -2;
                                Yellow.YellowPieceIV1.setVisible(true);
                                Yellow.YellowPieceIV2.setVisible(true);
                                Yellow.YellowPieceIV3.setVisible(true);
                                Yellow.YellowPiece13L = -2;
                                Yellow.YellowPiece12L = -2;
                                Yellow.YellowPiece23L = -2;
                                Yellow.YellowPieceIV12.setVisible(false);
                                Yellow.YellowPieceIV13.setVisible(false);
                                Yellow.YellowPieceIV23.setVisible(false);
                                Yellow.YellowPieceIV123.setVisible(false);
                                ep.setEp("Pity! It's player2's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if ((Yellow.y1 > 0 || Yellow.y2> 0|| Yellow.y4 > 0 ||Yellow.y12 > 0 || Yellow.y14 > 0|| Yellow.y24 > 0 ||Yellow.y124> 0) && Yellow.YellowNumber1 + Yellow.YellowNumber2 >= 10) {
                                Yellow.YellowPieceIV1.setLayoutX(425);
                                Yellow.YellowPieceIV1.setLayoutY(73);
                                Yellow.YellowPieceIV1.setRotate(0);
                                Yellow.YellowPiece1L = -2;
                                Yellow.YellowPieceIV1.setVisible(true);
                                Yellow.YellowPieceIV2.setLayoutX(424);
                                Yellow.YellowPieceIV2.setLayoutY(22);
                                Yellow.YellowPieceIV2.setRotate(0);
                                Yellow.YellowPiece2L = -2;
                                Yellow.YellowPieceIV2.setVisible(true);
                                Yellow.YellowPieceIV4.setLayoutX(477);
                                Yellow.YellowPieceIV4.setLayoutY(72);
                                Yellow.YellowPieceIV4.setRotate(0);
                                Yellow.YellowPiece4L = -2;
                                Yellow.YellowPieceIV4.setVisible(true);
                                Yellow.YellowPiece14L = -2;
                                Yellow.YellowPiece12L = -2;
                                Yellow.YellowPiece24L = -2;
                                Yellow.YellowPieceIV12.setVisible(false);
                                Yellow.YellowPieceIV14.setVisible(false);
                                Yellow.YellowPieceIV24.setVisible(false);
                                Yellow.YellowPieceIV124.setVisible(false);
                                ep.setEp("Pity! It's player2's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if ((Yellow.y1 > 0 || Yellow.y3> 0|| Yellow.y4 > 0 ||Yellow.y13 > 0 || Yellow.y14 > 0|| Yellow.y34 > 0 ||Yellow.y134> 0) && Yellow.YellowNumber1 + Yellow.YellowNumber2 >= 10) {
                                Yellow.YellowPieceIV1.setLayoutX(425);
                                Yellow.YellowPieceIV1.setLayoutY(73);
                                Yellow.YellowPieceIV1.setRotate(0);
                                Yellow.YellowPiece1L = -2;
                                Yellow.YellowPieceIV1.setVisible(true);
                                Yellow.YellowPieceIV3.setLayoutX(476);
                                Yellow.YellowPieceIV3.setLayoutY(22);
                                Yellow.YellowPieceIV3.setRotate(0);
                                Yellow.YellowPiece3L = -2;
                                Yellow.YellowPieceIV3.setVisible(true);
                                Yellow.YellowPieceIV4.setLayoutX(477);
                                Yellow.YellowPieceIV4.setLayoutY(72);
                                Yellow.YellowPieceIV4.setRotate(0);
                                Yellow.YellowPiece4L = -2;
                                Yellow.YellowPieceIV4.setVisible(true);
                                Yellow.YellowPiece14L = -2;
                                Yellow.YellowPiece13L = -2;
                                Yellow.YellowPiece34L = -2;
                                Yellow.YellowPieceIV13.setVisible(false);
                                Yellow.YellowPieceIV14.setVisible(false);
                                Yellow.YellowPieceIV34.setVisible(false);
                                Yellow.YellowPieceIV134.setVisible(false);
                                ep.setEp("Pity! It's player2's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                                if ((Yellow.y2 > 0 || Yellow.y3> 0|| Yellow.y4 > 0 ||Yellow.y23 > 0 || Yellow.y24 > 0|| Yellow.y34 > 0 ||Yellow.y134> 0) && Yellow.YellowNumber1 + Yellow.YellowNumber2 >= 10) {
                                    Yellow.YellowPieceIV2.setLayoutX(424);
                                    Yellow.YellowPieceIV2.setLayoutY(22);
                                    Yellow.YellowPieceIV2.setRotate(0);
                                    Yellow.YellowPiece2L = -2;
                                    Yellow.YellowPieceIV2.setVisible(true);
                                    Yellow.YellowPieceIV3.setLayoutX(476);
                                    Yellow.YellowPieceIV3.setLayoutY(22);
                                    Yellow.YellowPieceIV3.setRotate(0);
                                    Yellow.YellowPiece3L = -2;
                                    Yellow.YellowPieceIV3.setVisible(true);
                                    Yellow.YellowPieceIV4.setLayoutX(477);
                                    Yellow.YellowPieceIV4.setLayoutY(72);
                                    Yellow.YellowPieceIV4.setRotate(0);
                                    Yellow.YellowPiece4L = -2;
                                    Yellow.YellowPieceIV4.setVisible(true);
                                    Yellow.YellowPiece24L = -2;
                                    Yellow.YellowPiece23L = -2;
                                    Yellow.YellowPiece34L = -2;
                                    Yellow.YellowPieceIV23.setVisible(false);
                                    Yellow.YellowPieceIV24.setVisible(false);
                                    Yellow.YellowPieceIV34.setVisible(false);
                                    Yellow.YellowPieceIV234.setVisible(false);
                                    ep.setEp("Pity! It's player2's turn now ");
                                    oneIV1.setVisible(false);
                                    twoIV1.setVisible(false);
                                    threeIV1.setVisible(false);
                                    fourIV1.setVisible(false);
                                    fiveIV1.setVisible(false);
                                    sixIV1.setVisible(false);
                                    oneIV2.setVisible(false);
                                    twoIV2.setVisible(false);
                                    threeIV2.setVisible(false);
                                    fourIV2.setVisible(false);
                                    fiveIV2.setVisible(false);
                                    sixIV2.setVisible(false);
                                }
                                if (Yellow.y1 > 0||Yellow.y2 > 0 || Yellow.y3> 0|| Yellow.y4 > 0 ||Yellow.y12 >0 || Yellow.y13 >0|| Yellow.y14 > 0 ||Yellow.y23 > 0 || Yellow.y24 > 0|| Yellow.y34 > 0 ||Yellow.y123 > 0 || Yellow.y124 > 0||  Yellow.y134> 0|| Yellow.y234 > 0 ||Yellow.y1234 > 0  && Yellow.YellowNumber1 + Yellow.YellowNumber2 >= 10) {
                                    Yellow.YellowPieceIV1.setLayoutX(425);
                                    Yellow.YellowPieceIV1.setLayoutY(73);
                                    Yellow.YellowPieceIV1.setRotate(0);
                                    Yellow.YellowPiece1L = -2;
                                    Yellow.YellowPieceIV1.setVisible(true);
                                    Yellow.YellowPieceIV2.setLayoutX(424);
                                    Yellow.YellowPieceIV2.setLayoutY(22);
                                    Yellow.YellowPieceIV2.setRotate(0);
                                    Yellow.YellowPiece2L = -2;
                                    Yellow.YellowPieceIV2.setVisible(true);
                                    Yellow.YellowPieceIV3.setLayoutX(476);
                                    Yellow.YellowPieceIV3.setLayoutY(22);
                                    Yellow.YellowPieceIV3.setRotate(0);
                                    Yellow.YellowPiece3L = -2;
                                    Yellow.YellowPieceIV3.setVisible(true);
                                    Yellow.YellowPieceIV4.setLayoutX(477);
                                    Yellow.YellowPieceIV4.setLayoutY(72);
                                    Yellow.YellowPieceIV4.setRotate(0);
                                    Yellow.YellowPiece4L = -2;
                                    Yellow.YellowPieceIV4.setVisible(true);
                                   Yellow.YellowPiece12L = -2;
                                    Yellow.YellowPiece13L = -2;
                                    Yellow.YellowPiece14L = -2;
                                    Yellow.YellowPiece24L = -2;
                                    Yellow.YellowPiece23L = -2;
                                    Yellow.YellowPiece34L = -2;
                                    Yellow.YellowPiece123L = -2;
                                    Yellow.YellowPiece124L = -2;
                                    Yellow.YellowPiece134L = -2;
                                    Yellow.YellowPiece234L = -2;
                                    Yellow.YellowPiece1234L = -2;
                                    Yellow.YellowPieceIV12.setVisible(false);
                                    Yellow.YellowPieceIV13.setVisible(false);
                                    Yellow.YellowPieceIV14.setVisible(false);
                                    Yellow.YellowPieceIV23.setVisible(false);
                                    Yellow.YellowPieceIV24.setVisible(false);
                                    Yellow.YellowPieceIV34.setVisible(false);
                                    Yellow.YellowPieceIV123.setVisible(false);
                                    Yellow.YellowPieceIV124.setVisible(false);
                                    Yellow.YellowPieceIV134.setVisible(false);
                                    Yellow.YellowPieceIV234.setVisible(false);
                                    Yellow.YellowPieceIV1234.setVisible(false);
                                    ep.setEp("Pity! It's player2's turn now ");
                                    oneIV1.setVisible(false);
                                    twoIV1.setVisible(false);
                                    threeIV1.setVisible(false);
                                    fourIV1.setVisible(false);
                                    fiveIV1.setVisible(false);
                                    sixIV1.setVisible(false);
                                    oneIV2.setVisible(false);
                                    twoIV2.setVisible(false);
                                    threeIV2.setVisible(false);
                                    fourIV2.setVisible(false);
                                    fiveIV2.setVisible(false);
                                    sixIV2.setVisible(false);
                                }

                            yellowFlagOpen = false;
                                yellowCount = 0;
                        }
                        if (Yellow.YellowPiece1L == -2 && Yellow.YellowPiece2L == -2
                                && Yellow.YellowPiece3L == -2 && Yellow.YellowPiece4L == -2
                                && Yellow.YellowNumber1 != 6 && Yellow.YellowNumber2 != 6 && yellowCount == 0) {
                            description.setDescription("It's player2's turn! Please roll the dice!");
                            ep.setEp("It's player2's turn");
                            oneIV1.setVisible(false);
                            twoIV1.setVisible(false);
                            threeIV1.setVisible(false);
                            fourIV1.setVisible(false);
                            fiveIV1.setVisible(false);
                            sixIV1.setVisible(false);
                            oneIV2.setVisible(false);
                            twoIV2.setVisible(false);
                            threeIV2.setVisible(false);
                            fourIV2.setVisible(false);
                            fiveIV2.setVisible(false);
                            sixIV2.setVisible(false);
                            YellowFlag = false;
                            Exception2 = 1;
                        }else if(Yellow.YellowPiece1L == -2 && Yellow.YellowPiece2L == -2
                                && Yellow.YellowPiece3L == -2 && Yellow.YellowPiece4L == -2
                                && Yellow.YellowNumber1 != 6 && Yellow.YellowNumber2 != 6 && yellowCount > 0){
                            description.setDescription("It's player1's turn! Please roll the dice!");
                            ep.setEp("It's player1's turn");
                            oneIV1.setVisible(false);
                            twoIV1.setVisible(false);
                            threeIV1.setVisible(false);
                            fourIV1.setVisible(false);
                            fiveIV1.setVisible(false);
                            sixIV1.setVisible(false);
                            oneIV2.setVisible(false);
                            twoIV2.setVisible(false);
                            threeIV2.setVisible(false);
                            fourIV2.setVisible(false);
                            fiveIV2.setVisible(false);
                            sixIV2.setVisible(false);
                            YellowFlag = false;
                            Exception2 = 1;
                        }


                    } else if (dice.PlayerCount % 4 == 2) {
                        RedFlag = true;
                        yellowCount = 0;
                        blueCount = 0;
                        greenCount = 0;
                        Red.RedNumber1 = diceNumber1;
                        Red.RedNumber2 = diceNumber2;
                        if (Red.RedNumber1 + Red.RedNumber2 >= 10 && RedCount <= 2) {

                            RedCount++;
                            if (RedCount != 3)
                                dice.PlayerCount--;
                            RedFlagOpen = true;
                        }
                        if (RedCount >= 3) {
                            RedFlag = false;
                            if (Red.r1 > 0 && Red.RedNumber1 + Red.RedNumber2 >= 10) {
                                Red.RedPieceIV1.setLayoutX(75);
                                Red.RedPieceIV1.setLayoutY(74);
                                Red.RedPieceIV1.setRotate(90);
                                Red.RedPiece1L = -2;
                                Red.r1 = 0;
                                ep.setEp("Pity! It's player3's turn now");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);

                            }
                            if (Red.r2 > 0 && Red.RedNumber1 + Red.RedNumber2 >= 10) {
                                Red.RedPieceIV2.setLayoutX(23);
                                Red.RedPieceIV2.setLayoutY(21);
                                Red.RedPieceIV2.setRotate(90);
                                Red.RedPiece2L = -2;
                                Red.r2 = 0;
                                ep.setEp("Pity! It's player3's turn now");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Red.r3 > 0 && Red.RedNumber1 + Red.RedNumber2 >= 10) {
                                Red.RedPieceIV3.setLayoutX(21);
                                Red.RedPieceIV3.setLayoutY(74);
                                Red.RedPieceIV3.setRotate(90);
                                Red.RedPiece3L = -2;
                                Red.r3 = 0;
                                ep.setEp("Pity! It's player3's turn now");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Red.r4 > 0 && Red.RedNumber1 + Red.RedNumber2 >= 10) {
                                Red.RedPieceIV4.setLayoutX(75);
                                Red.RedPieceIV4.setLayoutY(22);
                                Red.RedPieceIV4.setRotate(90);
                                Red.RedPiece4L = -2;
                                Red.r4 = 0;
                                ep.setEp("Pity! It's player3's turn now");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);

                            }
                            if ((Red.r1 > 0 || Red.r2 > 0 || Red.r12 > 0) && Red.RedNumber1 + Red.RedNumber2 >= 10) {
                                Red.RedPieceIV1.setLayoutX(75);
                                Red.RedPieceIV1.setLayoutY(74);
                                Red.RedPieceIV1.setRotate(0);
                                Red.RedPiece1L = -2;
                                Red.RedPieceIV2.setLayoutX(23);
                                Red.RedPieceIV2.setLayoutY(21);
                                Red.RedPieceIV2.setRotate(0);
                                Red.RedPiece2L = -2;
                                Red.RedPieceIV1.setVisible(true);
                                Red.RedPieceIV2.setVisible(true);
                                Red.RedPiece12L = -2;
                                Red.RedPieceIV12.setVisible(false);
                                ep.setEp("Pity! It's player3's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }

                            if ((Red.r1 > 0 || Red.r3 > 0 || Red.r13 > 0) && Red.RedNumber1 + Red.RedNumber2 >= 10) {
                                Red.RedPieceIV1.setLayoutX(75);
                                Red.RedPieceIV1.setLayoutY(74);
                                Red.RedPieceIV1.setRotate(0);
                                Red.RedPiece1L = -2;
                                Red.RedPieceIV3.setLayoutX(21);
                                Red.RedPieceIV3.setLayoutY(74);
                                Red.RedPieceIV3.setRotate(0);
                                Red.RedPiece3L = -2;
                                Red.RedPieceIV1.setVisible(true);
                                Red.RedPieceIV3.setVisible(true);
                                Red.RedPiece13L = -2;
                                Red.RedPieceIV13.setVisible(false);
                                ep.setEp("Pity! It's player3's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Red.r1 > 0 || Red.r4 > 0 || Red.r14 > 0 && Red.RedNumber1 + Red.RedNumber2 >= 10) {
                                Red.RedPieceIV1.setLayoutX(75);
                                Red.RedPieceIV1.setLayoutY(74);
                                Red.RedPieceIV1.setRotate(0);
                                Red.RedPiece1L = -2;
                                Red.RedPieceIV4.setLayoutX(75);
                                Red.RedPieceIV4.setLayoutY(22);
                                Red.RedPieceIV4.setRotate(0);
                                Red.RedPiece4L = -2;
                                Red.RedPieceIV1.setVisible(true);
                                Red.RedPieceIV4.setVisible(true);
                                Red.RedPiece14L = -2;
                                Red.RedPieceIV14.setVisible(false);
                                ep.setEp("Pity! It's player3's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Red.r2 > 0 || Red.r3 > 0 || Red.r23 > 0 && Red.RedNumber1 + Red.RedNumber2 >= 10) {
                                Red.RedPieceIV2.setLayoutX(23);
                                Red.RedPieceIV2.setLayoutY(21);
                                Red.RedPieceIV2.setRotate(0);
                                Red.RedPiece1L = -2;
                                Red.RedPieceIV3.setLayoutX(21);
                                Red.RedPieceIV3.setLayoutY(74);
                                Red.RedPieceIV3.setRotate(0);
                                Red.RedPiece2L = -2;
                                Red.RedPieceIV2.setVisible(true);
                                Red.RedPieceIV3.setVisible(true);
                                Red.RedPiece23L = -2;
                                Red.RedPieceIV23.setVisible(false);
                                ep.setEp("Pity! It's player3's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Red.r2 > 0 || Red.r4 > 0 || Red.r24 > 0 && Red.RedNumber1 + Red.RedNumber2 >= 10) {
                                Red.RedPieceIV2.setLayoutX(23);
                                Red.RedPieceIV2.setLayoutY(21);
                                Red.RedPieceIV2.setRotate(0);
                                Red.RedPiece2L = -2;
                                Red.RedPieceIV4.setLayoutX(75);
                                Red.RedPieceIV4.setLayoutY(22);
                                Red.RedPieceIV4.setRotate(0);
                                Red.RedPiece4L = -2;
                                Red.RedPieceIV2.setVisible(true);
                                Red.RedPieceIV4.setVisible(true);
                                Red.RedPiece24L = -2;
                                Red.RedPieceIV24.setVisible(false);
                                ep.setEp("Pity! It's player3's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Red.r3 > 0 || Red.r4 > 0 || Red.r34 > 0 && Red.RedNumber1 + Red.RedNumber2 >= 10) {
                                Red.RedPieceIV4.setLayoutX(75);
                                Red.RedPieceIV4.setLayoutY(22);
                                Red.RedPieceIV4.setRotate(0);
                                Red.RedPiece4L = -2;
                                Red.RedPieceIV4.setVisible(true);
                                Red.RedPieceIV3.setLayoutX(21);
                                Red.RedPieceIV3.setLayoutY(74);
                                Red.RedPieceIV3.setRotate(0);
                                Red.RedPiece3L = -2;
                                Red.RedPieceIV3.setVisible(true);
                                Red.RedPiece34L = -2;
                                Red.RedPieceIV34.setVisible(false);
                                ep.setEp("Pity! It's player3's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if ((Red.r1 > 0 || Red.r2> 0|| Red.r3 > 0 ||Red.r12 > 0 || Red.r23 > 0|| Red.r13 > 0 ||Red.r123> 0) && Red.RedNumber1 + Red.RedNumber2 >= 10) {
                                Red.RedPieceIV1.setLayoutX(75);
                                Red.RedPieceIV1.setLayoutY(74);
                                Red.RedPieceIV1.setRotate(0);
                                Red.RedPiece1L = -2;
                                Red.RedPieceIV2.setLayoutX(23);
                                Red.RedPieceIV2.setLayoutY(21);
                                Red.RedPieceIV2.setRotate(0);
                                Red.RedPiece2L = -2;
                                Red.RedPieceIV3.setLayoutX(21);
                                Red.RedPieceIV3.setLayoutY(74);
                                Red.RedPieceIV3.setRotate(0);
                                Red.RedPiece3L = -2;
                                Red.RedPieceIV1.setVisible(true);
                                Red.RedPieceIV2.setVisible(true);
                                Red.RedPieceIV3.setVisible(true);
                                Red.RedPiece13L = -2;
                                Red.RedPiece12L = -2;
                                Red.RedPiece23L = -2;
                                Red.RedPieceIV12.setVisible(false);
                                Red.RedPieceIV13.setVisible(false);
                                Red.RedPieceIV23.setVisible(false);
                                Red.RedPieceIV123.setVisible(false);
                                ep.setEp("Pity! It's player3's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if ((Red.r1 > 0 || Red.r2> 0|| Red.r4 > 0 ||Red.r12 > 0 || Red.r14 > 0|| Red.r24 > 0 ||Red.r124> 0) && Red.RedNumber1 + Red.RedNumber2 >= 10) {
                                Red.RedPieceIV1.setLayoutX(75);
                                Red.RedPieceIV1.setLayoutY(74);
                                Red.RedPieceIV1.setRotate(0);
                                Red.RedPiece1L = -2;
                                Red.RedPieceIV1.setVisible(true);
                                Red.RedPieceIV2.setLayoutX(23);
                                Red.RedPieceIV2.setLayoutY(21);
                                Red.RedPieceIV2.setRotate(0);
                                Red.RedPiece2L = -2;
                                Red.RedPieceIV2.setVisible(true);
                                Red.RedPieceIV4.setLayoutX(75);
                                Red.RedPieceIV4.setLayoutY(22);
                                Red.RedPieceIV4.setRotate(0);
                                Red.RedPiece4L = -2;
                                Red.RedPieceIV4.setVisible(true);
                                Red.RedPiece14L = -2;
                                Red.RedPiece12L = -2;
                                Red.RedPiece24L = -2;
                                Red.RedPieceIV12.setVisible(false);
                                Red.RedPieceIV14.setVisible(false);
                                Red.RedPieceIV24.setVisible(false);
                                Red.RedPieceIV124.setVisible(false);
                                ep.setEp("Pity! It's player3's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if ((Red.r1 > 0 || Red.r3> 0|| Red.r4 > 0 ||Red.r13 > 0 || Red.r14 > 0|| Red.r34 > 0 ||Red.r134> 0) && Red.RedNumber1 + Red.RedNumber2 >= 10) {
                                Red.RedPieceIV1.setLayoutX(75);
                                Red.RedPieceIV1.setLayoutY(74);
                                Red.RedPieceIV1.setRotate(0);
                                Red.RedPiece1L = -2;
                                Red.RedPieceIV1.setVisible(true);
                                Red.RedPieceIV3.setLayoutX(21);
                                Red.RedPieceIV3.setLayoutY(74);
                                Red.RedPieceIV3.setRotate(0);
                                Red.RedPiece3L = -2;
                                Red.RedPieceIV3.setVisible(true);
                                Red.RedPieceIV4.setLayoutX(75);
                                Red.RedPieceIV4.setLayoutY(22);
                                Red.RedPieceIV4.setRotate(0);
                                Red.RedPiece4L = -2;
                                Red.RedPieceIV4.setVisible(true);
                                Red.RedPiece14L = -2;
                                Red.RedPiece13L = -2;
                                Red.RedPiece34L = -2;
                                Red.RedPieceIV13.setVisible(false);
                                Red.RedPieceIV14.setVisible(false);
                                Red.RedPieceIV34.setVisible(false);
                                Red.RedPieceIV134.setVisible(false);
                                ep.setEp("Pity! It's player3's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if ((Red.r2 > 0 || Red.r3> 0|| Red.r4 > 0 ||Red.r23 > 0 || Red.r24 > 0|| Red.r34 > 0 ||Red.r134> 0) && Red.RedNumber1 + Red.RedNumber2 >= 10) {
                                Red.RedPieceIV2.setLayoutX(23);
                                Red.RedPieceIV2.setLayoutY(21);
                                Red.RedPieceIV2.setRotate(0);
                                Red.RedPiece2L = -2;
                                Red.RedPieceIV2.setVisible(true);
                                Red.RedPieceIV3.setLayoutX(21);
                                Red.RedPieceIV3.setLayoutY(74);
                                Red.RedPieceIV3.setRotate(0);
                                Red.RedPiece3L = -2;
                                Red.RedPieceIV3.setVisible(true);
                                Red.RedPieceIV4.setLayoutX(75);
                                Red.RedPieceIV4.setLayoutY(22);
                                Red.RedPieceIV4.setRotate(0);
                                Red.RedPiece4L = -2;
                                Red.RedPieceIV4.setVisible(true);
                                Red.RedPiece24L = -2;
                                Red.RedPiece23L = -2;
                                Red.RedPiece34L = -2;
                                Red.RedPieceIV23.setVisible(false);
                                Red.RedPieceIV24.setVisible(false);
                                Red.RedPieceIV34.setVisible(false);
                                Red.RedPieceIV234.setVisible(false);
                                ep.setEp("Pity! It's player3's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Red.r1 > 0||Red.r2 > 0 || Red.r3> 0|| Red.r4 > 0 ||Red.r12 >0 || Red.r13 >0|| Red.r14 > 0 ||Red.r23 > 0 || Red.r24 > 0|| Red.r34 > 0 ||Red.r123 > 0 || Red.r124 > 0||  Red.r134> 0|| Red.r234 > 0 ||Red.r1234 > 0  && Red.RedNumber1 + Red.RedNumber2 >= 10) {
                                Red.RedPieceIV1.setLayoutX(75);
                                Red.RedPieceIV1.setLayoutY(74);
                                Red.RedPieceIV1.setRotate(0);
                                Red.RedPiece1L = -2;
                                Red.RedPieceIV1.setVisible(true);
                                Red.RedPieceIV2.setLayoutX(23);
                                Red.RedPieceIV2.setLayoutY(21);
                                Red.RedPieceIV2.setRotate(0);
                                Red.RedPiece2L = -2;
                                Red.RedPieceIV2.setVisible(true);
                                Red.RedPieceIV3.setLayoutX(21);
                                Red.RedPieceIV3.setLayoutY(74);
                                Red.RedPieceIV3.setRotate(0);
                                Red.RedPiece3L = -2;
                                Red.RedPieceIV3.setVisible(true);
                                Red.RedPieceIV4.setLayoutX(75);
                                Red.RedPieceIV4.setLayoutY(22);
                                Red.RedPieceIV4.setRotate(0);
                                Red.RedPiece4L = -2;
                                Red.RedPieceIV4.setVisible(true);
                                Red.RedPiece12L = -2;
                                Red.RedPiece13L = -2;
                                Red.RedPiece14L = -2;
                                Red.RedPiece24L = -2;
                                Red.RedPiece23L = -2;
                                Red.RedPiece34L = -2;
                                Red.RedPiece123L = -2;
                                Red.RedPiece124L = -2;
                                Red.RedPiece134L = -2;
                                Red.RedPiece234L = -2;
                                Red.RedPiece1234L = -2;
                                Red.RedPieceIV12.setVisible(false);
                                Red.RedPieceIV13.setVisible(false);
                                Red.RedPieceIV14.setVisible(false);
                                Red.RedPieceIV23.setVisible(false);
                                Red.RedPieceIV24.setVisible(false);
                                Red.RedPieceIV34.setVisible(false);
                                Red.RedPieceIV123.setVisible(false);
                                Red.RedPieceIV124.setVisible(false);
                                Red.RedPieceIV134.setVisible(false);
                                Red.RedPieceIV234.setVisible(false);
                                Red.RedPieceIV1234.setVisible(false);
                                ep.setEp("Pity! It's player3's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            RedFlagOpen = false;//open the count;
                            RedCount = 0;
                        }
                        if (Red.RedPiece1L == -2 && Red.RedPiece2L == -2
                                && Red.RedPiece3L == -2 && Red.RedPiece4L == -2
                                && Red.RedNumber1 != 6 && Red.RedNumber2 != 6 && RedCount == 0) {
                            description.setDescription("It's player3's turn! Please roll the dice!");
                            ep.setEp("It's player3's turn");
                            oneIV1.setVisible(false);
                            twoIV1.setVisible(false);
                            threeIV1.setVisible(false);
                            fourIV1.setVisible(false);
                            fiveIV1.setVisible(false);
                            sixIV1.setVisible(false);
                            oneIV2.setVisible(false);
                            twoIV2.setVisible(false);
                            threeIV2.setVisible(false);
                            fourIV2.setVisible(false);
                            fiveIV2.setVisible(false);
                            sixIV2.setVisible(false);
                            Exception2 = 1;
                            RedFlag = false;
                        }else if(Red.RedPiece1L == -2 && Red.RedPiece2L == -2
                                && Red.RedPiece3L == -2 && Red.RedPiece4L == -2
                                && Red.RedNumber1 != 6 && Red.RedNumber2 != 6 && RedCount > 0){
                            description.setDescription("It's player2's turn! Please roll the dice!");
                            ep.setEp("It's player2's turn");
                            oneIV1.setVisible(false);
                            twoIV1.setVisible(false);
                            threeIV1.setVisible(false);
                            fourIV1.setVisible(false);
                            fiveIV1.setVisible(false);
                            sixIV1.setVisible(false);
                            oneIV2.setVisible(false);
                            twoIV2.setVisible(false);
                            threeIV2.setVisible(false);
                            fourIV2.setVisible(false);
                            fiveIV2.setVisible(false);
                            sixIV2.setVisible(false);
                            Exception2 = 1;
                            RedFlag = false;
                        }
                    } else if (dice.PlayerCount % 4 == 3) {
                        yellowCount = 0;
                        RedCount = 0;
                        blueCount = 0;
                        GreenFlag = true;
                        Green.GreenNumber1 = diceNumber1;
                        Green.GreenNumber2 = diceNumber2;
                        if (Green.GreenNumber1 + Green.GreenNumber2 >= 10 && greenCount <= 2) {

                            greenCount++;
                            if (greenCount != 3)
                                dice.PlayerCount--;
                            greenFlagOpen = true;
                        }
                        if (greenCount >= 3) {
                            GreenFlag = false;
                            if (Green.g1 > 0 && Green.GreenNumber1 + Green.GreenNumber2 >= 10) {
                                Green.GreenPieceIV1.setLayoutX(75);
                                Green.GreenPieceIV1.setLayoutY(478);
                                Green.GreenPieceIV1.setRotate(180);
                                Green.GreenPiece1L = -2;
                                Green.g1 = 0;
                                ep.setEp("Pity! It's player4's turn now");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Green.g2 > 0 && Green.GreenNumber1 + Green.GreenNumber2 >= 10) {
                                Green.GreenPieceIV2.setLayoutX(23);
                                Green.GreenPieceIV2.setLayoutY(426);
                                Green.GreenPieceIV2.setRotate(180);
                                Green.GreenPiece2L = -2;
                                Green.g2 = 0;
                                ep.setEp("Pity! It's player4's turn now");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Green.g3 > 0 && Green.GreenNumber1 + Green.GreenNumber2 >= 10) {
                                Green.GreenPieceIV3.setLayoutX(75);
                                Green.GreenPieceIV3.setLayoutY(426);
                                Green.GreenPieceIV3.setRotate(180);
                                Green.GreenPiece3L = -2;
                                Green.g3 = 0;
                                ep.setEp("Pity! It's player4's turn now");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Green.g4 > 0 && Green.GreenNumber1 + Green.GreenNumber2 >= 10) {
                                Green.GreenPieceIV4.setLayoutX(20);
                                Green.GreenPieceIV4.setLayoutY(478);
                                Green.GreenPieceIV4.setRotate(180);
                                Green.GreenPiece4L = -2;
                                Green.g4 = 0;
                                ep.setEp("Pity! It's player4's turn now");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);


                            }

                            if ((Green.g1 > 0 || Green.g2 > 0 || Green.g12 > 0) && Green.GreenNumber1 + Green.GreenNumber2 >= 10) {
                                Green.GreenPieceIV1.setLayoutX(75);
                                Green.GreenPieceIV1.setLayoutY(478);
                                Green.GreenPieceIV1.setRotate(0);
                                Green.GreenPiece1L = -2;
                                Green.GreenPieceIV2.setLayoutX(23);
                                Green.GreenPieceIV2.setLayoutY(426);
                                Green.GreenPieceIV2.setRotate(0);
                                Green.GreenPiece2L = -2;
                                Green.GreenPieceIV1.setVisible(true);
                                Green.GreenPieceIV2.setVisible(true);
                                Green.GreenPiece12L = -2;
                                Green.GreenPieceIV12.setVisible(false);
                                ep.setEp("Pity! It's player4's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }

                            if ((Green.g1 > 0 || Green.g3 > 0 || Green.g13 > 0) && Green.GreenNumber1 + Green.GreenNumber2 >= 10) {
                                Green.GreenPieceIV1.setLayoutX(75);
                                Green.GreenPieceIV1.setLayoutY(478);
                                Green.GreenPieceIV1.setRotate(0);
                                Green.GreenPiece1L = -2;
                                Green.GreenPieceIV3.setLayoutX(75);
                                Green.GreenPieceIV3.setLayoutY(426);
                                Green.GreenPieceIV3.setRotate(0);
                                Green.GreenPiece3L = -2;
                                Green.GreenPieceIV1.setVisible(true);
                                Green.GreenPieceIV3.setVisible(true);
                                Green.GreenPiece13L = -2;
                                Green.GreenPieceIV13.setVisible(false);
                                ep.setEp("Pity! It's player4's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Green.g1 > 0 || Green.g4 > 0 || Green.g14 > 0 && Green.GreenNumber1 + Green.GreenNumber2 >= 10) {
                                Green.GreenPieceIV1.setLayoutX(75);
                                Green.GreenPieceIV1.setLayoutY(478);
                                Green.GreenPieceIV1.setRotate(0);
                                Green.GreenPiece1L = -2;
                                Green.GreenPieceIV4.setLayoutX(20);
                                Green.GreenPieceIV4.setLayoutY(478);
                                Green.GreenPieceIV4.setRotate(0);
                                Green.GreenPiece4L = -2;
                                Green.GreenPieceIV1.setVisible(true);
                                Green.GreenPieceIV4.setVisible(true);
                                Green.GreenPiece14L = -2;
                                Green.GreenPieceIV14.setVisible(false);
                                ep.setEp("Pity! It's player4's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Green.g2 > 0 || Green.g3 > 0 || Green.g23 > 0 && Green.GreenNumber1 + Green.GreenNumber2 >= 10) {
                                Green.GreenPieceIV2.setLayoutX(23);
                                Green.GreenPieceIV2.setLayoutY(426);
                                Green.GreenPieceIV2.setRotate(0);
                                Green.GreenPiece1L = -2;
                                Green.GreenPieceIV3.setLayoutX(75);
                                Green.GreenPieceIV3.setLayoutY(426);
                                Green.GreenPieceIV3.setRotate(0);
                                Green.GreenPiece2L = -2;
                                Green.GreenPieceIV2.setVisible(true);
                                Green.GreenPieceIV3.setVisible(true);
                                Green.GreenPiece23L = -2;
                                Green.GreenPieceIV23.setVisible(false);
                                ep.setEp("Pity! It's player4's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Green.g2 > 0 || Green.g4 > 0 || Green.g24 > 0 && Green.GreenNumber1 + Green.GreenNumber2 >= 10) {
                                Green.GreenPieceIV2.setLayoutX(23);
                                Green.GreenPieceIV2.setLayoutY(426);
                                Green.GreenPieceIV2.setRotate(0);
                                Green.GreenPiece2L = -2;
                                Green.GreenPieceIV4.setLayoutX(20);
                                Green.GreenPieceIV4.setLayoutY(478);
                                Green.GreenPieceIV4.setRotate(0);
                                Green.GreenPiece4L = -2;
                                Green.GreenPieceIV2.setVisible(true);
                                Green.GreenPieceIV4.setVisible(true);
                                Green.GreenPiece24L = -2;
                                Green.GreenPieceIV24.setVisible(false);
                                ep.setEp("Pity! It's player4's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Green.g3 > 0 || Green.g4 > 0 || Green.g34 > 0 && Green.GreenNumber1 + Green.GreenNumber2 >= 10) {
                                Green.GreenPieceIV4.setLayoutX(20);
                                Green.GreenPieceIV4.setLayoutY(478);
                                Green.GreenPieceIV4.setRotate(0);
                                Green.GreenPiece4L = -2;
                                Green.GreenPieceIV4.setVisible(true);
                                Green.GreenPieceIV3.setLayoutX(75);
                                Green.GreenPieceIV3.setLayoutY(426);
                                Green.GreenPieceIV3.setRotate(0);
                                Green.GreenPiece3L = -2;
                                Green.GreenPieceIV3.setVisible(true);
                                Green.GreenPiece34L = -2;
                                Green.GreenPieceIV34.setVisible(false);
                                ep.setEp("Pity! It's player4's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if ((Green.g1 > 0 || Green.g2> 0|| Green.g3 > 0 ||Green.g12 > 0 || Green.g23 > 0|| Green.g13 > 0 ||Green.g123> 0) && Green.GreenNumber1 + Green.GreenNumber2 >= 10) {
                                Green.GreenPieceIV1.setLayoutX(75);
                                Green.GreenPieceIV1.setLayoutY(478);
                                Green.GreenPieceIV1.setRotate(0);
                                Green.GreenPiece1L = -2;
                                Green.GreenPieceIV2.setLayoutX(23);
                                Green.GreenPieceIV2.setLayoutY(426);
                                Green.GreenPieceIV2.setRotate(0);
                                Green.GreenPiece2L = -2;
                                Green.GreenPieceIV3.setLayoutX(75);
                                Green.GreenPieceIV3.setLayoutY(426);
                                Green.GreenPieceIV3.setRotate(0);
                                Green.GreenPiece3L = -2;
                                Green.GreenPieceIV1.setVisible(true);
                                Green.GreenPieceIV2.setVisible(true);
                                Green.GreenPieceIV3.setVisible(true);
                                Green.GreenPiece13L = -2;
                                Green.GreenPiece12L = -2;
                                Green.GreenPiece23L = -2;
                                Green.GreenPieceIV12.setVisible(false);
                                Green.GreenPieceIV13.setVisible(false);
                                Green.GreenPieceIV23.setVisible(false);
                                Green.GreenPieceIV123.setVisible(false);
                                ep.setEp("Pity! It's player4's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if ((Green.g1 > 0 || Green.g2> 0|| Green.g4 > 0 ||Green.g12 > 0 || Green.g14 > 0|| Green.g24 > 0 ||Green.g124> 0) && Green.GreenNumber1 + Green.GreenNumber2 >= 10) {
                                Green.GreenPieceIV1.setLayoutX(75);
                                Green.GreenPieceIV1.setLayoutY(478);
                                Green.GreenPieceIV1.setRotate(0);
                                Green.GreenPiece1L = -2;
                                Green.GreenPieceIV1.setVisible(true);
                                Green.GreenPieceIV2.setLayoutX(23);
                                Green.GreenPieceIV2.setLayoutY(426);
                                Green.GreenPieceIV2.setRotate(0);
                                Green.GreenPiece2L = -2;
                                Green.GreenPieceIV2.setVisible(true);
                                Green.GreenPieceIV4.setLayoutX(20);
                                Green.GreenPieceIV4.setLayoutY(478);
                                Green.GreenPieceIV4.setRotate(0);
                                Green.GreenPiece4L = -2;
                                Green.GreenPieceIV4.setVisible(true);
                                Green.GreenPiece14L = -2;
                                Green.GreenPiece12L = -2;
                                Green.GreenPiece24L = -2;
                                Green.GreenPieceIV12.setVisible(false);
                                Green.GreenPieceIV14.setVisible(false);
                                Green.GreenPieceIV24.setVisible(false);
                                Green.GreenPieceIV124.setVisible(false);
                                ep.setEp("Pity! It's player4's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if ((Green.g1 > 0 || Green.g3> 0|| Green.g4 > 0 ||Green.g13 > 0 || Green.g14 > 0|| Green.g34 > 0 ||Green.g134> 0) && Green.GreenNumber1 + Green.GreenNumber2 >= 10) {
                                Green.GreenPieceIV1.setLayoutX(75);
                                Green.GreenPieceIV1.setLayoutY(478);
                                Green.GreenPieceIV1.setRotate(0);
                                Green.GreenPiece1L = -2;
                                Green.GreenPieceIV1.setVisible(true);
                                Green.GreenPieceIV3.setLayoutX(75);
                                Green.GreenPieceIV3.setLayoutY(426);
                                Green.GreenPieceIV3.setRotate(0);
                                Green.GreenPiece3L = -2;
                                Green.GreenPieceIV3.setVisible(true);
                                Green.GreenPieceIV4.setLayoutX(20);
                                Green.GreenPieceIV4.setLayoutY(478);
                                Green.GreenPieceIV4.setRotate(0);
                                Green.GreenPiece4L = -2;
                                Green.GreenPieceIV4.setVisible(true);
                                Green.GreenPiece14L = -2;
                                Green.GreenPiece13L = -2;
                                Green.GreenPiece34L = -2;
                                Green.GreenPieceIV13.setVisible(false);
                                Green.GreenPieceIV14.setVisible(false);
                                Green.GreenPieceIV34.setVisible(false);
                                Green.GreenPieceIV134.setVisible(false);
                                ep.setEp("Pity! It's player4's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if ((Green.g2 > 0 || Green.g3> 0|| Green.g4 > 0 ||Green.g23 > 0 || Green.g24 > 0|| Green.g34 > 0 ||Green.g134> 0) && Green.GreenNumber1 + Green.GreenNumber2 >= 10) {
                                Green.GreenPieceIV2.setLayoutX(23);
                                Green.GreenPieceIV2.setLayoutY(426);
                                Green.GreenPieceIV2.setRotate(0);
                                Green.GreenPiece2L = -2;
                                Green.GreenPieceIV2.setVisible(true);
                                Green.GreenPieceIV3.setLayoutX(75);
                                Green.GreenPieceIV3.setLayoutY(426);
                                Green.GreenPieceIV3.setRotate(0);
                                Green.GreenPiece3L = -2;
                                Green.GreenPieceIV3.setVisible(true);
                                Green.GreenPieceIV4.setLayoutX(20);
                                Green.GreenPieceIV4.setLayoutY(478);
                                Green.GreenPieceIV4.setRotate(0);
                                Green.GreenPiece4L = -2;
                                Green.GreenPieceIV4.setVisible(true);
                                Green.GreenPiece24L = -2;
                                Green.GreenPiece23L = -2;
                                Green.GreenPiece34L = -2;
                                Green.GreenPieceIV23.setVisible(false);
                                Green.GreenPieceIV24.setVisible(false);
                                Green.GreenPieceIV34.setVisible(false);
                                Green.GreenPieceIV234.setVisible(false);
                                ep.setEp("Pity! It's player4's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Green.g1 > 0||Green.g2 > 0 || Green.g3> 0|| Green.g4 > 0 ||Green.g12 >0 || Green.g13 >0|| Green.g14 > 0 ||Green.g23 > 0 || Green.g24 > 0|| Green.g34 > 0 ||Green.g123 > 0 || Green.g124 > 0||  Green.g134> 0|| Green.g234 > 0 ||Green.g1234 > 0  && Green.GreenNumber1 + Green.GreenNumber2 >= 10) {
                                Green.GreenPieceIV1.setLayoutX(75);
                                Green.GreenPieceIV1.setLayoutY(478);
                                Green.GreenPieceIV1.setRotate(0);
                                Green.GreenPiece1L = -2;
                                Green.GreenPieceIV1.setVisible(true);
                                Green.GreenPieceIV2.setLayoutX(23);
                                Green.GreenPieceIV2.setLayoutY(426);
                                Green.GreenPieceIV2.setRotate(0);
                                Green.GreenPiece2L = -2;
                                Green.GreenPieceIV2.setVisible(true);
                                Green.GreenPieceIV3.setLayoutX(75);
                                Green.GreenPieceIV3.setLayoutY(426);
                                Green.GreenPieceIV3.setRotate(0);
                                Green.GreenPiece3L = -2;
                                Green.GreenPieceIV3.setVisible(true);
                                Green.GreenPieceIV4.setLayoutX(20);
                                Green.GreenPieceIV4.setLayoutY(478);
                                Green.GreenPieceIV4.setRotate(0);
                                Green.GreenPiece4L = -2;
                                Green.GreenPieceIV4.setVisible(true);
                                Green.GreenPiece12L = -2;
                                Green.GreenPiece13L = -2;
                                Green.GreenPiece14L = -2;
                                Green.GreenPiece24L = -2;
                                Green.GreenPiece23L = -2;
                                Green.GreenPiece34L = -2;
                                Green.GreenPiece123L = -2;
                                Green.GreenPiece124L = -2;
                                Green.GreenPiece134L = -2;
                                Green.GreenPiece234L = -2;
                                Green.GreenPiece1234L = -2;
                                Green.GreenPieceIV12.setVisible(false);
                                Green.GreenPieceIV13.setVisible(false);
                                Green.GreenPieceIV14.setVisible(false);
                                Green.GreenPieceIV23.setVisible(false);
                                Green.GreenPieceIV24.setVisible(false);
                                Green.GreenPieceIV34.setVisible(false);
                                Green.GreenPieceIV123.setVisible(false);
                                Green.GreenPieceIV124.setVisible(false);
                                Green.GreenPieceIV134.setVisible(false);
                                Green.GreenPieceIV234.setVisible(false);
                                Green.GreenPieceIV1234.setVisible(false);
                                ep.setEp("Pity! It's player4's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            greenFlagOpen = false;//open the count;
                            greenCount = 0;
                        }
                        if (Green.GreenPiece1L == -2 && Green.GreenPiece2L == -2
                                && Green.GreenPiece3L == -2 && Green.GreenPiece4L == -2
                                && Green.GreenNumber1 != 6 && Green.GreenNumber2 != 6 && greenCount == 0) {

                            description.setDescription("It's player4's turn! Please roll the dice!");
                            ep.setEp("It's player4's turn ");
                            oneIV1.setVisible(false);
                            twoIV1.setVisible(false);
                            threeIV1.setVisible(false);
                            fourIV1.setVisible(false);
                            fiveIV1.setVisible(false);
                            sixIV1.setVisible(false);
                            oneIV2.setVisible(false);
                            twoIV2.setVisible(false);
                            threeIV2.setVisible(false);
                            fourIV2.setVisible(false);
                            fiveIV2.setVisible(false);
                            sixIV2.setVisible(false);
                            Exception2 = 1;
                            GreenFlag = false;
                        }else if(Green.GreenPiece1L == -2 && Green.GreenPiece2L == -2
                                && Green.GreenPiece3L == -2 && Green.GreenPiece4L == -2
                                && Green.GreenNumber1 != 6 && Green.GreenNumber2 != 6 && greenCount > 0){
                            description.setDescription("It's player3's turn! Please roll the dice!");
                            ep.setEp("It's player3's turn ");
                            oneIV1.setVisible(false);
                            twoIV1.setVisible(false);
                            threeIV1.setVisible(false);
                            fourIV1.setVisible(false);
                            fiveIV1.setVisible(false);
                            sixIV1.setVisible(false);
                            oneIV2.setVisible(false);
                            twoIV2.setVisible(false);
                            threeIV2.setVisible(false);
                            fourIV2.setVisible(false);
                            fiveIV2.setVisible(false);
                            sixIV2.setVisible(false);
                            Exception2 = 1;
                            GreenFlag = false;
                        }
                    } else if (dice.PlayerCount % 4 == 0) {
                        yellowCount = 0;
                        RedCount = 0;
                        greenCount = 0;
                        BlueFlag = true;
                        Blue.BlueNumber1 = diceNumber1;
                        Blue.BlueNumber2 = diceNumber2;
                        if (Blue.BlueNumber1 + Blue.BlueNumber2 >= 10 && blueCount <= 2) {
                            blueCount++;
                            dice.PlayerCount--;
                            blueFlagOpen = true;
                        }
                        if (blueCount >= 3) {
                            BlueFlag = false;
                            if (Blue.b1 > 0 && Blue.BlueNumber1 + Blue.BlueNumber2 >= 10) {
                                Blue.BluePieceIV1.setLayoutX(426);
                                Blue.BluePieceIV1.setLayoutY(426);
                                Blue.BluePieceIV1.setRotate(0);
                                Blue.BluePiece1L = -2;
                                Blue.b1 = 0;
                                ep.setEp("Pity! It's player1's turn now");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Blue.b2 > 0 && Blue.BlueNumber1 + Blue.BlueNumber2 >= 10) {
                                Blue.BluePieceIV2.setLayoutX(478);
                                Blue.BluePieceIV2.setLayoutY(479);
                                Blue.BluePieceIV2.setRotate(0);
                                Blue.BluePiece2L = -2;
                                Blue.b1 = 0;
                                ep.setEp("Pity! It's player1's turn now");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Blue.b3 > 0 && Blue.BlueNumber1 + Blue.BlueNumber2 >= 10) {
                                Blue.BluePieceIV3.setLayoutX(426);
                                Blue.BluePieceIV3.setLayoutY(478);
                                Blue.BluePieceIV3.setRotate(0);
                                Blue.BluePiece3L = -2;
                                Blue.b1 = 0;
                                ep.setEp("Pity! It's player1's turn now");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Blue.b4 > 0 && Blue.BlueNumber1 + Blue.BlueNumber2 >= 10) {
                                Blue.BluePieceIV4.setLayoutX(479);
                                Blue.BluePieceIV4.setLayoutY(426);
                                Blue.BluePieceIV4.setRotate(0);
                                Blue.BluePiece4L = -2;
                                Blue.b1 = 0;
                                ep.setEp("Pity! It's player1's turn now");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if ((Blue.b1 > 0 || Blue.b2 > 0 || Blue.b12 > 0) && Blue.BlueNumber1 + Blue.BlueNumber2 >= 10) {
                                Blue.BluePieceIV1.setLayoutX(426);
                                Blue.BluePieceIV1.setLayoutY(426);
                                Blue.BluePieceIV1.setRotate(0);
                                Blue.BluePiece1L = -2;
                                Blue.BluePieceIV2.setLayoutX(478);
                                Blue.BluePieceIV2.setLayoutY(479);
                                Blue.BluePieceIV2.setRotate(0);
                                Blue.BluePiece2L = -2;
                                Blue.BluePieceIV1.setVisible(true);
                                Blue.BluePieceIV2.setVisible(true);
                                Blue.BluePiece12L = -2;
                                Blue.BluePieceIV12.setVisible(false);
                                ep.setEp("Pity! It's player1's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }

                            if ((Blue.b1 > 0 || Blue.b3 > 0 || Blue.b13 > 0) && Blue.BlueNumber1 + Blue.BlueNumber2 >= 10) {
                                Blue.BluePieceIV1.setLayoutX(426);
                                Blue.BluePieceIV1.setLayoutY(426);
                                Blue.BluePieceIV1.setRotate(0);
                                Blue.BluePiece1L = -2;
                                Blue.BluePieceIV3.setLayoutX(426);
                                Blue.BluePieceIV3.setLayoutY(478);
                                Blue.BluePieceIV3.setRotate(0);
                                Blue.BluePiece3L = -2;
                                Blue.BluePieceIV1.setVisible(true);
                                Blue.BluePieceIV3.setVisible(true);
                                Blue.BluePiece13L = -2;
                                Blue.BluePieceIV13.setVisible(false);
                                ep.setEp("Pity! It's player1's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Blue.b1 > 0 || Blue.b4 > 0 || Blue.b14 > 0 && Blue.BlueNumber1 + Blue.BlueNumber2 >= 10) {
                                Blue.BluePieceIV1.setLayoutX(426);
                                Blue.BluePieceIV1.setLayoutY(426);
                                Blue.BluePieceIV1.setRotate(0);
                                Blue.BluePiece1L = -2;
                                Blue.BluePieceIV4.setLayoutX(479);
                                Blue.BluePieceIV4.setLayoutY(426);
                                Blue.BluePieceIV4.setRotate(0);
                                Blue.BluePiece4L = -2;
                                Blue.BluePieceIV1.setVisible(true);
                                Blue.BluePieceIV4.setVisible(true);
                                Blue.BluePiece14L = -2;
                                Blue.BluePieceIV14.setVisible(false);
                                ep.setEp("Pity! It's player1's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Blue.b2 > 0 || Blue.b3 > 0 || Blue.b23 > 0 && Blue.BlueNumber1 + Blue.BlueNumber2 >= 10) {
                                Blue.BluePieceIV2.setLayoutX(478);
                                Blue.BluePieceIV2.setLayoutY(479);
                                Blue.BluePieceIV2.setRotate(0);
                                Blue.BluePiece1L = -2;
                                Blue.BluePieceIV3.setLayoutX(426);
                                Blue.BluePieceIV3.setLayoutY(478);
                                Blue.BluePieceIV3.setRotate(0);
                                Blue.BluePiece2L = -2;
                                Blue.BluePieceIV2.setVisible(true);
                                Blue.BluePieceIV3.setVisible(true);
                                Blue.BluePiece23L = -2;
                                Blue.BluePieceIV23.setVisible(false);
                                ep.setEp("Pity! It's player1's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Blue.b2 > 0 || Blue.b4 > 0 || Blue.b24 > 0 && Blue.BlueNumber1 + Blue.BlueNumber2 >= 10) {
                                Blue.BluePieceIV2.setLayoutX(478);
                                Blue.BluePieceIV2.setLayoutY(479);
                                Blue.BluePieceIV2.setRotate(0);
                                Blue.BluePiece2L = -2;
                                Blue.BluePieceIV4.setLayoutX(479);
                                Blue.BluePieceIV4.setLayoutY(426);
                                Blue.BluePieceIV4.setRotate(0);
                                Blue.BluePiece4L = -2;
                                Blue.BluePieceIV2.setVisible(true);
                                Blue.BluePieceIV4.setVisible(true);
                                Blue.BluePiece24L = -2;
                                Blue.BluePieceIV24.setVisible(false);
                                ep.setEp("Pity! It's player1's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Blue.b3 > 0 || Blue.b4 > 0 || Blue.b34 > 0 && Blue.BlueNumber1 + Blue.BlueNumber2 >= 10) {
                                Blue.BluePieceIV4.setLayoutX(479);
                                Blue.BluePieceIV4.setLayoutY(426);
                                Blue.BluePieceIV4.setRotate(0);
                                Blue.BluePiece4L = -2;
                                Blue.BluePieceIV4.setVisible(true);
                                Blue.BluePieceIV3.setLayoutX(426);
                                Blue.BluePieceIV3.setLayoutY(478);
                                Blue.BluePieceIV3.setRotate(0);
                                Blue.BluePiece3L = -2;
                                Blue.BluePieceIV3.setVisible(true);
                                Blue.BluePiece34L = -2;
                                Blue.BluePieceIV34.setVisible(false);
                                ep.setEp("Pity! It's player1's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if ((Blue.b1 > 0 || Blue.b2> 0|| Blue.b3 > 0 ||Blue.b12 > 0 || Blue.b23 > 0|| Blue.b13 > 0 ||Blue.b123> 0) && Blue.BlueNumber1 + Blue.BlueNumber2 >= 10) {
                                Blue.BluePieceIV1.setLayoutX(426);
                                Blue.BluePieceIV1.setLayoutY(426);
                                Blue.BluePieceIV1.setRotate(0);
                                Blue.BluePiece1L = -2;
                                Blue.BluePieceIV2.setLayoutX(478);
                                Blue.BluePieceIV2.setLayoutY(479);
                                Blue.BluePieceIV2.setRotate(0);
                                Blue.BluePiece2L = -2;
                                Blue.BluePieceIV3.setLayoutX(426);
                                Blue.BluePieceIV3.setLayoutY(478);
                                Blue.BluePieceIV3.setRotate(0);
                                Blue.BluePiece3L = -2;
                                Blue.BluePieceIV1.setVisible(true);
                                Blue.BluePieceIV2.setVisible(true);
                                Blue.BluePieceIV3.setVisible(true);
                                Blue.BluePiece13L = -2;
                                Blue.BluePiece12L = -2;
                                Blue.BluePiece23L = -2;
                                Blue.BluePieceIV12.setVisible(false);
                                Blue.BluePieceIV13.setVisible(false);
                                Blue.BluePieceIV23.setVisible(false);
                                Blue.BluePieceIV123.setVisible(false);
                                ep.setEp("Pity! It's player1's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if ((Blue.b1 > 0 || Blue.b2> 0|| Blue.b4 > 0 ||Blue.b12 > 0 || Blue.b14 > 0|| Blue.b24 > 0 ||Blue.b124> 0) && Blue.BlueNumber1 + Blue.BlueNumber2 >= 10) {
                                Blue.BluePieceIV1.setLayoutX(426);
                                Blue.BluePieceIV1.setLayoutY(426);
                                Blue.BluePieceIV1.setRotate(0);
                                Blue.BluePiece1L = -2;
                                Blue.BluePieceIV1.setVisible(true);
                                Blue.BluePieceIV2.setLayoutX(478);
                                Blue.BluePieceIV2.setLayoutY(479);
                                Blue.BluePieceIV2.setRotate(0);
                                Blue.BluePiece2L = -2;
                                Blue.BluePieceIV2.setVisible(true);
                                Blue.BluePieceIV4.setLayoutX(479);
                                Blue.BluePieceIV4.setLayoutY(426);
                                Blue.BluePieceIV4.setRotate(0);
                                Blue.BluePiece4L = -2;
                                Blue.BluePieceIV4.setVisible(true);
                                Blue.BluePiece14L = -2;
                                Blue.BluePiece12L = -2;
                                Blue.BluePiece24L = -2;
                                Blue.BluePieceIV12.setVisible(false);
                                Blue.BluePieceIV14.setVisible(false);
                                Blue.BluePieceIV24.setVisible(false);
                                Blue.BluePieceIV124.setVisible(false);
                                ep.setEp("Pity! It's player1's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if ((Blue.b1 > 0 || Blue.b3> 0|| Blue.b4 > 0 ||Blue.b13 > 0 || Blue.b14 > 0|| Blue.b34 > 0 ||Blue.b134> 0) && Blue.BlueNumber1 + Blue.BlueNumber2 >= 10) {
                                Blue.BluePieceIV1.setLayoutX(426);
                                Blue.BluePieceIV1.setLayoutY(426);
                                Blue.BluePieceIV1.setRotate(0);
                                Blue.BluePiece1L = -2;
                                Blue.BluePieceIV1.setVisible(true);
                                Blue.BluePieceIV3.setLayoutX(426);
                                Blue.BluePieceIV3.setLayoutY(478);
                                Blue.BluePieceIV3.setRotate(0);
                                Blue.BluePiece3L = -2;
                                Blue.BluePieceIV3.setVisible(true);
                                Blue.BluePieceIV4.setLayoutX(479);
                                Blue.BluePieceIV4.setLayoutY(426);
                                Blue.BluePieceIV4.setRotate(0);
                                Blue.BluePiece4L = -2;
                                Blue.BluePieceIV4.setVisible(true);
                                Blue.BluePiece14L = -2;
                                Blue.BluePiece13L = -2;
                                Blue.BluePiece34L = -2;
                                Blue.BluePieceIV13.setVisible(false);
                                Blue.BluePieceIV14.setVisible(false);
                                Blue.BluePieceIV34.setVisible(false);
                                Blue.BluePieceIV134.setVisible(false);
                                ep.setEp("Pity! It's player1's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if ((Blue.b2 > 0 || Blue.b3> 0|| Blue.b4 > 0 ||Blue.b23 > 0 || Blue.b24 > 0|| Blue.b34 > 0 ||Blue.b134> 0) && Blue.BlueNumber1 + Blue.BlueNumber2 >= 10) {
                                Blue.BluePieceIV2.setLayoutX(478);
                                Blue.BluePieceIV2.setLayoutY(479);
                                Blue.BluePieceIV2.setRotate(0);
                                Blue.BluePiece2L = -2;
                                Blue.BluePieceIV2.setVisible(true);
                                Blue.BluePieceIV3.setLayoutX(426);
                                Blue.BluePieceIV3.setLayoutY(478);
                                Blue.BluePieceIV3.setRotate(0);
                                Blue.BluePiece3L = -2;
                                Blue.BluePieceIV3.setVisible(true);
                                Blue.BluePieceIV4.setLayoutX(479);
                                Blue.BluePieceIV4.setLayoutY(426);
                                Blue.BluePieceIV4.setRotate(0);
                                Blue.BluePiece4L = -2;
                                Blue.BluePieceIV4.setVisible(true);
                                Blue.BluePiece24L = -2;
                                Blue.BluePiece23L = -2;
                                Blue.BluePiece34L = -2;
                                Blue.BluePieceIV23.setVisible(false);
                                Blue.BluePieceIV24.setVisible(false);
                                Blue.BluePieceIV34.setVisible(false);
                                Blue.BluePieceIV234.setVisible(false);
                                ep.setEp("Pity! It's player1's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Blue.b1 > 0||Blue.b2 > 0 || Blue.b3> 0|| Blue.b4 > 0 ||Blue.b12 >0 || Blue.b13 >0|| Blue.b14 > 0 ||Blue.b23 > 0 || Blue.b24 > 0|| Blue.b34 > 0 ||Blue.b123 > 0 || Blue.b124 > 0||  Blue.b134> 0|| Blue.b234 > 0 ||Blue.b1234 > 0  && Blue.BlueNumber1 + Blue.BlueNumber2 >= 10) {
                                Blue.BluePieceIV1.setLayoutX(426);
                                Blue.BluePieceIV1.setLayoutY(426);
                                Blue.BluePieceIV1.setRotate(0);
                                Blue.BluePiece1L = -2;
                                Blue.BluePieceIV1.setVisible(true);
                                Blue.BluePieceIV2.setLayoutX(478);
                                Blue.BluePieceIV2.setLayoutY(479);
                                Blue.BluePieceIV2.setRotate(0);
                                Blue.BluePiece2L = -2;
                                Blue.BluePieceIV2.setVisible(true);
                                Blue.BluePieceIV3.setLayoutX(426);
                                Blue.BluePieceIV3.setLayoutY(478);
                                Blue.BluePieceIV3.setRotate(0);
                                Blue.BluePiece3L = -2;
                                Blue.BluePieceIV3.setVisible(true);
                                Blue.BluePieceIV4.setLayoutX(479);
                                Blue.BluePieceIV4.setLayoutY(426);
                                Blue.BluePieceIV4.setRotate(0);
                                Blue.BluePiece4L = -2;
                                Blue.BluePieceIV4.setVisible(true);
                                Blue.BluePiece12L = -2;
                                Blue.BluePiece13L = -2;
                                Blue.BluePiece14L = -2;
                                Blue.BluePiece24L = -2;
                                Blue.BluePiece23L = -2;
                                Blue.BluePiece34L = -2;
                                Blue.BluePiece123L = -2;
                                Blue.BluePiece124L = -2;
                                Blue.BluePiece134L = -2;
                                Blue.BluePiece234L = -2;
                                Blue.BluePiece1234L = -2;
                                Blue.BluePieceIV12.setVisible(false);
                                Blue.BluePieceIV13.setVisible(false);
                                Blue.BluePieceIV14.setVisible(false);
                                Blue.BluePieceIV23.setVisible(false);
                                Blue.BluePieceIV24.setVisible(false);
                                Blue.BluePieceIV34.setVisible(false);
                                Blue.BluePieceIV123.setVisible(false);
                                Blue.BluePieceIV124.setVisible(false);
                                Blue.BluePieceIV134.setVisible(false);
                                Blue.BluePieceIV234.setVisible(false);
                                Blue.BluePieceIV1234.setVisible(false);
                                ep.setEp("Pity! It's player1's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            blueFlagOpen = false;
                            blueCount = 0;
                        }
                        if (Blue.BluePiece1L == -2 && Blue.BluePiece2L == -2
                                && Blue.BluePiece3L == -2 && Blue.BluePiece4L == -2
                                && Blue.BlueNumber1 != 6 && Blue.BlueNumber2 != 6 && blueCount == 0) {
                            description.setDescription("It's player1's turn! Please roll the dice!");
                            ep.setEp("It's player1's turn");
                            oneIV1.setVisible(false);
                            twoIV1.setVisible(false);
                            threeIV1.setVisible(false);
                            fourIV1.setVisible(false);
                            fiveIV1.setVisible(false);
                            sixIV1.setVisible(false);
                            oneIV2.setVisible(false);
                            twoIV2.setVisible(false);
                            threeIV2.setVisible(false);
                            fourIV2.setVisible(false);
                            fiveIV2.setVisible(false);
                            sixIV2.setVisible(false);
                            Exception2 = 1;
                            BlueFlag = false;
                            
                        }else if(Blue.BluePiece1L == -2 && Blue.BluePiece2L == -2
                                && Blue.BluePiece3L == -2 && Blue.BluePiece4L == -2
                                && Blue.BlueNumber1 != 6 && Blue.BlueNumber2 != 6 && blueCount > 0){
                            description.setDescription("It's player4's turn! Please roll the dice!");
                            ep.setEp("It's player4's turn");
                            oneIV1.setVisible(false);
                            twoIV1.setVisible(false);
                            threeIV1.setVisible(false);
                            fourIV1.setVisible(false);
                            fiveIV1.setVisible(false);
                            sixIV1.setVisible(false);
                            oneIV2.setVisible(false);
                            twoIV2.setVisible(false);
                            threeIV2.setVisible(false);
                            fourIV2.setVisible(false);
                            fiveIV2.setVisible(false);
                            sixIV2.setVisible(false);
                            Exception2 = 1;
                            BlueFlag = false;
                        }
                    }
                    ObservableList<Integer> items2 = FXCollections.observableArrayList(dice.getPace(number.get(0), number.get(1)));
                    cbo2.getItems().addAll(items2);
                    basePane.getChildren().add(cbo2);
                    if (Exception2 == 0) {
                        cbo2.setVisible(true);
                        label2.setVisible(true);
                    }
                    if (Exception2 == 1 || yellowCount >= 3 || RedCount >= 3 || greenCount >= 3 || blueCount >= 3) {
                        cbo2.setVisible(false);
                        label2.setVisible(false);
                        Exception = 0;
                    }
                    Exception2 = 0;
                    cbo2.setPrefWidth(70);
                    cbo2.setPrefHeight(28);
                    cbo2.setLayoutX(640);
                    cbo2.setLayoutY(272);
                    cbo2.setOnAction(event1 -> {
                        cbo2.setVisible(false);
                        oneIV1.setVisible(false);
                        twoIV1.setVisible(false);
                        threeIV1.setVisible(false);
                        fourIV1.setVisible(false);
                        fiveIV1.setVisible(false);
                        sixIV1.setVisible(false);
                        oneIV2.setVisible(false);
                        twoIV2.setVisible(false);
                        threeIV2.setVisible(false);
                        fourIV2.setVisible(false);
                        fiveIV2.setVisible(false);
                        sixIV2.setVisible(false);
                        cbo2.setVisible(false);
                        Exception = 0;

                        pace1 = cbo2.getValue();
                        if (yellowCount > 0 || RedCount > 0 || greenCount > 0 || blueCount > 0) {
                            ep.setEp(String.format("Player %d moves %d pace%s", (dice.PlayerCount % 4 == 0) ? 1 : dice.PlayerCount % 4 + 1, cbo2.getValue(), (cbo2.getValue() == 1) ? "" : "s"));
                        } else {
                            ep.setEp(String.format("Player %d moves %d pace%s", (dice.PlayerCount % 4 == 0) ? 4 : dice.PlayerCount % 4, cbo2.getValue(), (cbo2.getValue() == 1) ? "" : "s"));
                        }
                        label2.setVisible(false);

                    });
                    dice.count = 0;
                } else {
                    cbo2.setVisible(false);
                }
                if (number.size() >= 2) {
                    number.clear();
                }
            }
            if (i == 1) {
                new AlertBox().display("Warning", "You have chosen MANUAL");
            }
        });


        basePane.getChildren().addAll(description.getInitialTextArea(), ep.getInitialTextArea());


        Label label = new Label("Description");
        label.setFont(Font.font("Ink Free", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 20));
        label.setTextFill(Color.RED);
        basePane.getChildren().add(label);
        label.setLayoutX(568);
        label.setLayoutY(310);


        Label status = new Label("Status");
        status.setFont(Font.font("Ink Free", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 20));
        status.setTextFill(Color.rgb(88, 23, 191));
        basePane.getChildren().add(status);
        status.setLayoutX(583);
        status.setLayoutY(435);
        Label Winner1 = new Label("Winner:");
        Winner1.setFont(Font.font("Courier New", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 14));
        Winner1.setTextFill(Color.RED);
        Winner1.setLayoutX(600);
        Winner1.setLayoutY(14);

        Label Winner2 = new Label("Second:");
        Winner2.setFont(Font.font("Courier New", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 14));
        Winner2.setTextFill(Color.RED);
        Winner2.setLayoutX(600);
        Winner2.setLayoutY(48);

        Label Winner3 = new Label("Third:");
        Winner3.setFont(Font.font("Courier New", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 14));
        Winner3.setTextFill(Color.RED);
        Winner3.setLayoutX(600);
        Winner3.setLayoutY(82);
        Label yellow = new Label("Yellow");
        yellow.setFont(Font.font("Courier New", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 14));
        yellow.setTextFill(Color.RED);
        yellow.setVisible(false);
        Label red = new Label("Red");
        red.setFont(Font.font("Courier New", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 14));
        red.setTextFill(Color.RED);
        red.setVisible(false);
        Label green= new Label("Green");
        green.setFont(Font.font("Courier New", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 14));
        green.setTextFill(Color.RED);
        green.setVisible(false);

        TextField tf = new TextField();
        tf.setLayoutX(535);
        tf.setLayoutY(210);
        tf.setPrefWidth(45);
        tf.setPrefHeight(28);
        Button ok = new Button("OK");
        Image OKIM = new Image("OK.png");
        ImageView OKIV = new ImageView(OKIM);
        OKIV.setFitWidth(18);
        OKIV.setFitHeight(20);
        ok.setGraphic(OKIV);
        ok.setContentDisplay(ContentDisplay.RIGHT);
        ok.setLayoutX(583);
        ok.setLayoutY(210);
        basePane.getChildren().addAll(tf, ok);


        ok.setOnAction(event -> {
            BoomIV.setVisible(false);
            Red.WinWDIV.setVisible(false);
            Yellow.WinWDIV.setVisible(false);
            Green.WinWDIV.setVisible(false);
            Blue.WinWDIV.setVisible(false);
            if (i == 2) {
                new AlertBox().display("Warning", "You haven't chosen MANUAL yet!");
            }
            if (tf.getText().length() > 1) new AlertBox().display("Wrong", "Please input a number between 1 and 6");
            else if (!Character.isDigit(tf.getText().charAt(0)))
                new AlertBox().display("Wrong", "Please input a number between 1 and 6");
            else if (tf.getText() == null || Integer.parseInt(tf.getText()) > 6 || Integer.parseInt(tf.getText()) < 1)
                new AlertBox().display("Invalid Input", "Please input number between 1 and 6 ");

            if (Exception == 1 || YellowFlag || RedFlag || BlueFlag || GreenFlag) {
                new AlertBox().display("Warning", "Please choose your movement first");
            } else if (i == 1 && Exception == 0 && Integer.parseInt(tf.getText()) <= 6 && Integer.parseInt(tf.getText()) >= 1) {
                num1++;
                number2.add(Integer.parseInt(tf.getText()));
                description.setDescription(String.format("The %s dice number is %d\n", (num1 % 2 == 1) ? "first" : "second", Integer.parseInt(tf.getText())));
                if (num1 % 2 == 1) {
                    if (Integer.parseInt(tf.getText()) == 1) oneIV1.setVisible(true);
                    if (Integer.parseInt(tf.getText()) == 2) twoIV1.setVisible(true);
                    if (Integer.parseInt(tf.getText()) == 3) threeIV1.setVisible(true);
                    if (Integer.parseInt(tf.getText()) == 4) fourIV1.setVisible(true);
                    if (Integer.parseInt(tf.getText()) == 5) fiveIV1.setVisible(true);
                    if (Integer.parseInt(tf.getText()) == 6) sixIV1.setVisible(true);
                }
                if (num1 % 2 == 0) {
                    diceNumber1 = number2.get(0);
                    diceNumber2 = number2.get(1);
                    dice.PlayerCount++;
                    if (Integer.parseInt(tf.getText()) == 1) oneIV2.setVisible(true);
                    if (Integer.parseInt(tf.getText()) == 2) twoIV2.setVisible(true);
                    if (Integer.parseInt(tf.getText()) == 3) threeIV2.setVisible(true);
                    if (Integer.parseInt(tf.getText()) == 4) fourIV2.setVisible(true);
                    if (Integer.parseInt(tf.getText()) == 5) fiveIV2.setVisible(true);
                    if (Integer.parseInt(tf.getText()) == 6) sixIV2.setVisible(true);
                    if (dice.PlayerCount % 4 == 1) {
                        YellowFlag = true;
                        Yellow.YellowNumber1 = diceNumber1;
                        Yellow.YellowNumber2 = diceNumber2;
                        RedCount = 0;
                        greenCount = 0;
                        blueCount = 0;
                        if (Yellow.YellowNumber1 + Yellow.YellowNumber2 >= 10 && yellowCount <= 2) {
                            yellowCount++;
                            if (yellowCount != 3)
                                dice.PlayerCount--;
                            yellowFlagOpen = true;
                        }

                        if (yellowCount >= 3) {

                            YellowFlag = false;
                            if (Yellow.y1 > 0 && Yellow.YellowNumber1 + Yellow.YellowNumber2 >= 10) {
                                Yellow.YellowPieceIV1.setLayoutX(425);
                                Yellow.YellowPieceIV1.setLayoutY(73);
                                Yellow.YellowPieceIV1.setRotate(0);
                                Yellow.YellowPiece1L = -2;
                                ep.setEp("Pity! It's player2's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Yellow.y2 > 0 && Yellow.YellowNumber1 + Yellow.YellowNumber2 >= 10) {
                                Yellow.YellowPieceIV2.setLayoutX(424);
                                Yellow.YellowPieceIV2.setLayoutY(22);
                                Yellow.YellowPieceIV2.setRotate(0);
                                Yellow.YellowPiece2L = -2;
                                ep.setEp("Pity! It's player2's turn now");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Yellow.y3 > 0 && Yellow.YellowNumber1 + Yellow.YellowNumber2 >= 10) {
                                Yellow.YellowPieceIV3.setLayoutX(476);
                                Yellow.YellowPieceIV3.setLayoutY(22);
                                Yellow.YellowPieceIV3.setRotate(0);
                                Yellow.YellowPiece3L = -2;
                                ep.setEp("Pity! It's player2's turn now");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Yellow.y4 > 0 && Yellow.YellowNumber1 + Yellow.YellowNumber2 >= 10) {
                                Yellow.YellowPieceIV4.setLayoutX(477);
                                Yellow.YellowPieceIV4.setLayoutY(72);
                                Yellow.YellowPieceIV4.setRotate(0);
                                Yellow.YellowPiece4L = -2;
                                ep.setEp("Pity! It's player2's turn now");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if ((Yellow.y1 > 0 || Yellow.y2 > 0 || Yellow.y12 > 0) && Yellow.YellowNumber1 + Yellow.YellowNumber2 >= 10) {
                                Yellow.YellowPieceIV1.setLayoutX(425);
                                Yellow.YellowPieceIV1.setLayoutY(73);
                                Yellow.YellowPieceIV1.setRotate(0);
                                Yellow.YellowPiece1L = -2;
                                Yellow.YellowPieceIV2.setLayoutX(424);
                                Yellow.YellowPieceIV2.setLayoutY(22);
                                Yellow.YellowPieceIV2.setRotate(0);
                                Yellow.YellowPiece2L = -2;
                                Yellow.YellowPieceIV1.setVisible(true);
                                Yellow.YellowPieceIV2.setVisible(true);
                                Yellow.YellowPiece12L = -2;
                                Yellow.YellowPieceIV12.setVisible(false);
                                ep.setEp("Pity! It's player2's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }

                            if ((Yellow.y1 > 0 || Yellow.y3 > 0 || Yellow.y13 > 0) && Yellow.YellowNumber1 + Yellow.YellowNumber2 >= 10) {
                                Yellow.YellowPieceIV1.setLayoutX(425);
                                Yellow.YellowPieceIV1.setLayoutY(73);
                                Yellow.YellowPieceIV1.setRotate(0);
                                Yellow.YellowPiece1L = -2;
                                Yellow.YellowPieceIV3.setLayoutX(476);
                                Yellow.YellowPieceIV3.setLayoutY(22);
                                Yellow.YellowPieceIV3.setRotate(0);
                                Yellow.YellowPiece3L = -2;
                                Yellow.YellowPieceIV1.setVisible(true);
                                Yellow.YellowPieceIV3.setVisible(true);
                                Yellow.YellowPiece13L = -2;
                                Yellow.YellowPieceIV13.setVisible(false);
                                ep.setEp("Pity! It's player2's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Yellow.y1 > 0 || Yellow.y4 > 0 || Yellow.y14 > 0 && Yellow.YellowNumber1 + Yellow.YellowNumber2 >= 10) {
                                Yellow.YellowPieceIV1.setLayoutX(425);
                                Yellow.YellowPieceIV1.setLayoutY(73);
                                Yellow.YellowPieceIV1.setRotate(0);
                                Yellow.YellowPiece1L = -2;
                                Yellow.YellowPieceIV4.setLayoutX(477);
                                Yellow.YellowPieceIV4.setLayoutY(72);
                                Yellow.YellowPieceIV4.setRotate(0);
                                Yellow.YellowPiece4L = -2;
                                Yellow.YellowPieceIV1.setVisible(true);
                                Yellow.YellowPieceIV4.setVisible(true);
                                Yellow.YellowPiece14L = -2;
                                Yellow.YellowPieceIV14.setVisible(false);
                                ep.setEp("Pity! It's player2's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Yellow.y2 > 0 || Yellow.y3 > 0 || Yellow.y23 > 0 && Yellow.YellowNumber1 + Yellow.YellowNumber2 >= 10) {
                                Yellow.YellowPieceIV2.setLayoutX(424);
                                Yellow.YellowPieceIV2.setLayoutY(22);
                                Yellow.YellowPieceIV2.setRotate(0);
                                Yellow.YellowPiece1L = -2;
                                Yellow.YellowPieceIV3.setLayoutX(476);
                                Yellow.YellowPieceIV3.setLayoutY(22);
                                Yellow.YellowPieceIV3.setRotate(0);
                                Yellow.YellowPiece2L = -2;
                                Yellow.YellowPieceIV2.setVisible(true);
                                Yellow.YellowPieceIV3.setVisible(true);
                                Yellow.YellowPiece23L = -2;
                                Yellow.YellowPieceIV23.setVisible(false);
                                ep.setEp("Pity! It's player2's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Yellow.y2 > 0 || Yellow.y4 > 0 || Yellow.y24 > 0 && Yellow.YellowNumber1 + Yellow.YellowNumber2 >= 10) {
                                Yellow.YellowPieceIV2.setLayoutX(424);
                                Yellow.YellowPieceIV2.setLayoutY(22);
                                Yellow.YellowPieceIV2.setRotate(0);
                                Yellow.YellowPiece2L = -2;
                                Yellow.YellowPieceIV4.setLayoutX(477);
                                Yellow.YellowPieceIV4.setLayoutY(72);
                                Yellow.YellowPieceIV4.setRotate(0);
                                Yellow.YellowPiece4L = -2;
                                Yellow.YellowPieceIV2.setVisible(true);
                                Yellow.YellowPieceIV4.setVisible(true);
                                Yellow.YellowPiece24L = -2;
                                Yellow.YellowPieceIV24.setVisible(false);
                                ep.setEp("Pity! It's player2's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Yellow.y3 > 0 || Yellow.y4 > 0 || Yellow.y34 > 0 && Yellow.YellowNumber1 + Yellow.YellowNumber2 >= 10) {
                                Yellow.YellowPieceIV4.setLayoutX(477);
                                Yellow.YellowPieceIV4.setLayoutY(72);
                                Yellow.YellowPieceIV4.setRotate(0);
                                Yellow.YellowPiece4L = -2;
                                Yellow.YellowPieceIV4.setVisible(true);
                                Yellow.YellowPieceIV3.setLayoutX(476);
                                Yellow.YellowPieceIV3.setLayoutY(22);
                                Yellow.YellowPieceIV3.setRotate(0);
                                Yellow.YellowPiece3L = -2;
                                Yellow.YellowPieceIV3.setVisible(true);
                                Yellow.YellowPiece34L = -2;
                                Yellow.YellowPieceIV34.setVisible(false);
                                ep.setEp("Pity! It's player2's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if ((Yellow.y1 > 0 || Yellow.y2> 0|| Yellow.y3 > 0 ||Yellow.y12 > 0 || Yellow.y23 > 0|| Yellow.y13 > 0 ||Yellow.y123> 0) && Yellow.YellowNumber1 + Yellow.YellowNumber2 >= 10) {
                                Yellow.YellowPieceIV1.setLayoutX(425);
                                Yellow.YellowPieceIV1.setLayoutY(73);
                                Yellow.YellowPieceIV1.setRotate(0);
                                Yellow.YellowPiece1L = -2;
                                Yellow.YellowPieceIV2.setLayoutX(424);
                                Yellow.YellowPieceIV2.setLayoutY(22);
                                Yellow.YellowPieceIV2.setRotate(0);
                                Yellow.YellowPiece2L = -2;
                                Yellow.YellowPieceIV3.setLayoutX(476);
                                Yellow.YellowPieceIV3.setLayoutY(22);
                                Yellow.YellowPieceIV3.setRotate(0);
                                Yellow.YellowPiece3L = -2;
                                Yellow.YellowPieceIV1.setVisible(true);
                                Yellow.YellowPieceIV2.setVisible(true);
                                Yellow.YellowPieceIV3.setVisible(true);
                                Yellow.YellowPiece13L = -2;
                                Yellow.YellowPiece12L = -2;
                                Yellow.YellowPiece23L = -2;
                                Yellow.YellowPieceIV12.setVisible(false);
                                Yellow.YellowPieceIV13.setVisible(false);
                                Yellow.YellowPieceIV23.setVisible(false);
                                Yellow.YellowPieceIV123.setVisible(false);
                                ep.setEp("Pity! It's player2's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if ((Yellow.y1 > 0 || Yellow.y2> 0|| Yellow.y4 > 0 ||Yellow.y12 > 0 || Yellow.y14 > 0|| Yellow.y24 > 0 ||Yellow.y124> 0) && Yellow.YellowNumber1 + Yellow.YellowNumber2 >= 10) {
                                Yellow.YellowPieceIV1.setLayoutX(425);
                                Yellow.YellowPieceIV1.setLayoutY(73);
                                Yellow.YellowPieceIV1.setRotate(0);
                                Yellow.YellowPiece1L = -2;
                                Yellow.YellowPieceIV1.setVisible(true);
                                Yellow.YellowPieceIV2.setLayoutX(424);
                                Yellow.YellowPieceIV2.setLayoutY(22);
                                Yellow.YellowPieceIV2.setRotate(0);
                                Yellow.YellowPiece2L = -2;
                                Yellow.YellowPieceIV2.setVisible(true);
                                Yellow.YellowPieceIV4.setLayoutX(477);
                                Yellow.YellowPieceIV4.setLayoutY(72);
                                Yellow.YellowPieceIV4.setRotate(0);
                                Yellow.YellowPiece4L = -2;
                                Yellow.YellowPieceIV4.setVisible(true);
                                Yellow.YellowPiece14L = -2;
                                Yellow.YellowPiece12L = -2;
                                Yellow.YellowPiece24L = -2;
                                Yellow.YellowPieceIV12.setVisible(false);
                                Yellow.YellowPieceIV14.setVisible(false);
                                Yellow.YellowPieceIV24.setVisible(false);
                                Yellow.YellowPieceIV124.setVisible(false);
                                ep.setEp("Pity! It's player2's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if ((Yellow.y1 > 0 || Yellow.y3> 0|| Yellow.y4 > 0 ||Yellow.y13 > 0 || Yellow.y14 > 0|| Yellow.y34 > 0 ||Yellow.y134> 0) && Yellow.YellowNumber1 + Yellow.YellowNumber2 >= 10) {
                                Yellow.YellowPieceIV1.setLayoutX(425);
                                Yellow.YellowPieceIV1.setLayoutY(73);
                                Yellow.YellowPieceIV1.setRotate(0);
                                Yellow.YellowPiece1L = -2;
                                Yellow.YellowPieceIV1.setVisible(true);
                                Yellow.YellowPieceIV3.setLayoutX(476);
                                Yellow.YellowPieceIV3.setLayoutY(22);
                                Yellow.YellowPieceIV3.setRotate(0);
                                Yellow.YellowPiece3L = -2;
                                Yellow.YellowPieceIV3.setVisible(true);
                                Yellow.YellowPieceIV4.setLayoutX(477);
                                Yellow.YellowPieceIV4.setLayoutY(72);
                                Yellow.YellowPieceIV4.setRotate(0);
                                Yellow.YellowPiece4L = -2;
                                Yellow.YellowPieceIV4.setVisible(true);
                                Yellow.YellowPiece14L = -2;
                                Yellow.YellowPiece13L = -2;
                                Yellow.YellowPiece34L = -2;
                                Yellow.YellowPieceIV13.setVisible(false);
                                Yellow.YellowPieceIV14.setVisible(false);
                                Yellow.YellowPieceIV34.setVisible(false);
                                Yellow.YellowPieceIV134.setVisible(false);
                                ep.setEp("Pity! It's player2's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if ((Yellow.y2 > 0 || Yellow.y3> 0|| Yellow.y4 > 0 ||Yellow.y23 > 0 || Yellow.y24 > 0|| Yellow.y34 > 0 ||Yellow.y134> 0) && Yellow.YellowNumber1 + Yellow.YellowNumber2 >= 10) {
                                Yellow.YellowPieceIV2.setLayoutX(424);
                                Yellow.YellowPieceIV2.setLayoutY(22);
                                Yellow.YellowPieceIV2.setRotate(0);
                                Yellow.YellowPiece2L = -2;
                                Yellow.YellowPieceIV2.setVisible(true);
                                Yellow.YellowPieceIV3.setLayoutX(476);
                                Yellow.YellowPieceIV3.setLayoutY(22);
                                Yellow.YellowPieceIV3.setRotate(0);
                                Yellow.YellowPiece3L = -2;
                                Yellow.YellowPieceIV3.setVisible(true);
                                Yellow.YellowPieceIV4.setLayoutX(477);
                                Yellow.YellowPieceIV4.setLayoutY(72);
                                Yellow.YellowPieceIV4.setRotate(0);
                                Yellow.YellowPiece4L = -2;
                                Yellow.YellowPieceIV4.setVisible(true);
                                Yellow.YellowPiece24L = -2;
                                Yellow.YellowPiece23L = -2;
                                Yellow.YellowPiece34L = -2;
                                Yellow.YellowPieceIV23.setVisible(false);
                                Yellow.YellowPieceIV24.setVisible(false);
                                Yellow.YellowPieceIV34.setVisible(false);
                                Yellow.YellowPieceIV234.setVisible(false);
                                ep.setEp("Pity! It's player2's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Yellow.y1 > 0||Yellow.y2 > 0 || Yellow.y3> 0|| Yellow.y4 > 0 ||Yellow.y12 >0 || Yellow.y13 >0|| Yellow.y14 > 0 ||Yellow.y23 > 0 || Yellow.y24 > 0|| Yellow.y34 > 0 ||Yellow.y123 > 0 || Yellow.y124 > 0||  Yellow.y134> 0|| Yellow.y234 > 0 ||Yellow.y1234 > 0  && Yellow.YellowNumber1 + Yellow.YellowNumber2 >= 10) {
                                Yellow.YellowPieceIV1.setLayoutX(425);
                                Yellow.YellowPieceIV1.setLayoutY(73);
                                Yellow.YellowPieceIV1.setRotate(0);
                                Yellow.YellowPiece1L = -2;
                                Yellow.YellowPieceIV1.setVisible(true);
                                Yellow.YellowPieceIV2.setLayoutX(424);
                                Yellow.YellowPieceIV2.setLayoutY(22);
                                Yellow.YellowPieceIV2.setRotate(0);
                                Yellow.YellowPiece2L = -2;
                                Yellow.YellowPieceIV2.setVisible(true);
                                Yellow.YellowPieceIV3.setLayoutX(476);
                                Yellow.YellowPieceIV3.setLayoutY(22);
                                Yellow.YellowPieceIV3.setRotate(0);
                                Yellow.YellowPiece3L = -2;
                                Yellow.YellowPieceIV3.setVisible(true);
                                Yellow.YellowPieceIV4.setLayoutX(477);
                                Yellow.YellowPieceIV4.setLayoutY(72);
                                Yellow.YellowPieceIV4.setRotate(0);
                                Yellow.YellowPiece4L = -2;
                                Yellow.YellowPieceIV4.setVisible(true);
                                Yellow.YellowPiece12L = -2;
                                Yellow.YellowPiece13L = -2;
                                Yellow.YellowPiece14L = -2;
                                Yellow.YellowPiece24L = -2;
                                Yellow.YellowPiece23L = -2;
                                Yellow.YellowPiece34L = -2;
                                Yellow.YellowPiece123L = -2;
                                Yellow.YellowPiece124L = -2;
                                Yellow.YellowPiece134L = -2;
                                Yellow.YellowPiece234L = -2;
                                Yellow.YellowPiece1234L = -2;
                                Yellow.YellowPieceIV12.setVisible(false);
                                Yellow.YellowPieceIV13.setVisible(false);
                                Yellow.YellowPieceIV14.setVisible(false);
                                Yellow.YellowPieceIV23.setVisible(false);
                                Yellow.YellowPieceIV24.setVisible(false);
                                Yellow.YellowPieceIV34.setVisible(false);
                                Yellow.YellowPieceIV123.setVisible(false);
                                Yellow.YellowPieceIV124.setVisible(false);
                                Yellow.YellowPieceIV134.setVisible(false);
                                Yellow.YellowPieceIV234.setVisible(false);
                                Yellow.YellowPieceIV1234.setVisible(false);
                                ep.setEp("Pity! It's player2's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            yellowFlagOpen = false;
                            yellowCount = 0;

                        }
                        if (Yellow.YellowPiece1L == -2 && Yellow.YellowPiece2L == -2
                                && Yellow.YellowPiece3L == -2 && Yellow.YellowPiece4L == -2
                                && diceNumber1 != 6 && diceNumber2 != 6 && yellowCount == 0) {
                            description.setDescription("It's player2's turn! Please roll the dice!");
                            ep.setEp("It's player2's turn");
                            oneIV1.setVisible(false);
                            twoIV1.setVisible(false);
                            threeIV1.setVisible(false);
                            fourIV1.setVisible(false);
                            fiveIV1.setVisible(false);
                            sixIV1.setVisible(false);
                            oneIV2.setVisible(false);
                            twoIV2.setVisible(false);
                            threeIV2.setVisible(false);
                            fourIV2.setVisible(false);
                            fiveIV2.setVisible(false);
                            sixIV2.setVisible(false);
                            Exception2 = 1;
                            YellowFlag = false;
                        } else if(Yellow.YellowPiece1L == -2 && Yellow.YellowPiece2L == -2
                                && Yellow.YellowPiece3L == -2 && Yellow.YellowPiece4L == -2
                                && diceNumber1 != 6 && diceNumber2 != 6 && yellowCount > 0){
                            description.setDescription("It's player1's turn! Please roll the dice!");
                            ep.setEp("It's player1's turn");
                            oneIV1.setVisible(false);
                            twoIV1.setVisible(false);
                            threeIV1.setVisible(false);
                            fourIV1.setVisible(false);
                            fiveIV1.setVisible(false);
                            sixIV1.setVisible(false);
                            oneIV2.setVisible(false);
                            twoIV2.setVisible(false);
                            threeIV2.setVisible(false);
                            fourIV2.setVisible(false);
                            fiveIV2.setVisible(false);
                            sixIV2.setVisible(false);
                            Exception2 = 1;
                            YellowFlag = false;
                        }
                    } else if (dice.PlayerCount % 4 == 2) {
                        RedFlag = true;
                        Red.RedNumber1 = diceNumber1;
                        Red.RedNumber2 = diceNumber2;
                        yellowCount = 0;
                        blueCount = 0;
                        greenCount = 0;
                        if (Red.RedNumber1 + Red.RedNumber2 >= 10 && RedCount <= 2) {

                            RedCount++;
                            if (RedCount != 3)
                                dice.PlayerCount--;
                            RedFlagOpen = true;
                        }
                        if (RedCount >= 3) {
                            RedFlag = false;
                            if (Red.r1 > 0 && Red.RedNumber1 + Red.RedNumber2 >= 10) {
                                Red.RedPieceIV1.setLayoutX(75);
                                Red.RedPieceIV1.setLayoutY(74);
                                Red.RedPieceIV1.setRotate(90);
                                Red.RedPiece1L = -2;
                                ep.setEp("Pity! It's player3's turn now");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Red.r2 > 0 && Red.RedNumber1 + Red.RedNumber2 >= 10) {
                                Red.RedPieceIV2.setLayoutX(23);
                                Red.RedPieceIV2.setLayoutY(21);
                                Red.RedPieceIV2.setRotate(90);
                                Red.RedPiece2L = -2;
                                ep.setEp("Pity! It's player3's turn now");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Red.r3 > 0 && Red.RedNumber1 + Red.RedNumber2 >= 10) {
                                Red.RedPieceIV3.setLayoutX(21);
                                Red.RedPieceIV3.setLayoutY(74);
                                Red.RedPieceIV3.setRotate(90);
                                Red.RedPiece3L = -2;
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                ep.setEp("Pity! It's player3's turn now ");
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Red.r4 > 0 && Red.RedNumber1 + Red.RedNumber2 >= 10) {
                                Red.RedPieceIV4.setLayoutX(75);
                                Red.RedPieceIV4.setLayoutY(22);
                                Red.RedPieceIV4.setRotate(90);
                                Red.RedPiece4L = -2;
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                ep.setEp("Pity! It's player3's turn now ");
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if ((Red.r1 > 0 || Red.r2 > 0 || Red.r12 > 0) && Red.RedNumber1 + Red.RedNumber2 >= 10) {
                                Red.RedPieceIV1.setLayoutX(75);
                                Red.RedPieceIV1.setLayoutY(74);
                                Red.RedPieceIV1.setRotate(0);
                                Red.RedPiece1L = -2;
                                Red.RedPieceIV2.setLayoutX(23);
                                Red.RedPieceIV2.setLayoutY(21);
                                Red.RedPieceIV2.setRotate(0);
                                Red.RedPiece2L = -2;
                                Red.RedPieceIV1.setVisible(true);
                                Red.RedPieceIV2.setVisible(true);
                                Red.RedPiece12L = -2;
                                Red.RedPieceIV12.setVisible(false);
                                ep.setEp("Pity! It's player3's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }

                            if ((Red.r1 > 0 || Red.r3 > 0 || Red.r13 > 0) && Red.RedNumber1 + Red.RedNumber2 >= 10) {
                                Red.RedPieceIV1.setLayoutX(75);
                                Red.RedPieceIV1.setLayoutY(74);
                                Red.RedPieceIV1.setRotate(0);
                                Red.RedPiece1L = -2;
                                Red.RedPieceIV3.setLayoutX(21);
                                Red.RedPieceIV3.setLayoutY(74);
                                Red.RedPieceIV3.setRotate(0);
                                Red.RedPiece3L = -2;
                                Red.RedPieceIV1.setVisible(true);
                                Red.RedPieceIV3.setVisible(true);
                                Red.RedPiece13L = -2;
                                Red.RedPieceIV13.setVisible(false);
                                ep.setEp("Pity! It's player3's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Red.r1 > 0 || Red.r4 > 0 || Red.r14 > 0 && Red.RedNumber1 + Red.RedNumber2 >= 10) {
                                Red.RedPieceIV1.setLayoutX(75);
                                Red.RedPieceIV1.setLayoutY(74);
                                Red.RedPieceIV1.setRotate(0);
                                Red.RedPiece1L = -2;
                                Red.RedPieceIV4.setLayoutX(75);
                                Red.RedPieceIV4.setLayoutY(22);
                                Red.RedPieceIV4.setRotate(0);
                                Red.RedPiece4L = -2;
                                Red.RedPieceIV1.setVisible(true);
                                Red.RedPieceIV4.setVisible(true);
                                Red.RedPiece14L = -2;
                                Red.RedPieceIV14.setVisible(false);
                                ep.setEp("Pity! It's player3's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Red.r2 > 0 || Red.r3 > 0 || Red.r23 > 0 && Red.RedNumber1 + Red.RedNumber2 >= 10) {
                                Red.RedPieceIV2.setLayoutX(23);
                                Red.RedPieceIV2.setLayoutY(21);
                                Red.RedPieceIV2.setRotate(0);
                                Red.RedPiece1L = -2;
                                Red.RedPieceIV3.setLayoutX(21);
                                Red.RedPieceIV3.setLayoutY(74);
                                Red.RedPieceIV3.setRotate(0);
                                Red.RedPiece2L = -2;
                                Red.RedPieceIV2.setVisible(true);
                                Red.RedPieceIV3.setVisible(true);
                                Red.RedPiece23L = -2;
                                Red.RedPieceIV23.setVisible(false);
                                ep.setEp("Pity! It's player3's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Red.r2 > 0 || Red.r4 > 0 || Red.r24 > 0 && Red.RedNumber1 + Red.RedNumber2 >= 10) {
                                Red.RedPieceIV2.setLayoutX(23);
                                Red.RedPieceIV2.setLayoutY(21);
                                Red.RedPieceIV2.setRotate(0);
                                Red.RedPiece2L = -2;
                                Red.RedPieceIV4.setLayoutX(75);
                                Red.RedPieceIV4.setLayoutY(22);
                                Red.RedPieceIV4.setRotate(0);
                                Red.RedPiece4L = -2;
                                Red.RedPieceIV2.setVisible(true);
                                Red.RedPieceIV4.setVisible(true);
                                Red.RedPiece24L = -2;
                                Red.RedPieceIV24.setVisible(false);
                                ep.setEp("Pity! It's player3's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Red.r3 > 0 || Red.r4 > 0 || Red.r34 > 0 && Red.RedNumber1 + Red.RedNumber2 >= 10) {
                                Red.RedPieceIV4.setLayoutX(75);
                                Red.RedPieceIV4.setLayoutY(22);
                                Red.RedPieceIV4.setRotate(0);
                                Red.RedPiece4L = -2;
                                Red.RedPieceIV4.setVisible(true);
                                Red.RedPieceIV3.setLayoutX(21);
                                Red.RedPieceIV3.setLayoutY(74);
                                Red.RedPieceIV3.setRotate(0);
                                Red.RedPiece3L = -2;
                                Red.RedPieceIV3.setVisible(true);
                                Red.RedPiece34L = -2;
                                Red.RedPieceIV34.setVisible(false);
                                ep.setEp("Pity! It's player3's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if ((Red.r1 > 0 || Red.r2> 0|| Red.r3 > 0 ||Red.r12 > 0 || Red.r23 > 0|| Red.r13 > 0 ||Red.r123> 0) && Red.RedNumber1 + Red.RedNumber2 >= 10) {
                                Red.RedPieceIV1.setLayoutX(75);
                                Red.RedPieceIV1.setLayoutY(74);
                                Red.RedPieceIV1.setRotate(0);
                                Red.RedPiece1L = -2;
                                Red.RedPieceIV2.setLayoutX(23);
                                Red.RedPieceIV2.setLayoutY(21);
                                Red.RedPieceIV2.setRotate(0);
                                Red.RedPiece2L = -2;
                                Red.RedPieceIV3.setLayoutX(21);
                                Red.RedPieceIV3.setLayoutY(74);
                                Red.RedPieceIV3.setRotate(0);
                                Red.RedPiece3L = -2;
                                Red.RedPieceIV1.setVisible(true);
                                Red.RedPieceIV2.setVisible(true);
                                Red.RedPieceIV3.setVisible(true);
                                Red.RedPiece13L = -2;
                                Red.RedPiece12L = -2;
                                Red.RedPiece23L = -2;
                                Red.RedPieceIV12.setVisible(false);
                                Red.RedPieceIV13.setVisible(false);
                                Red.RedPieceIV23.setVisible(false);
                                Red.RedPieceIV123.setVisible(false);
                                ep.setEp("Pity! It's player3's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if ((Red.r1 > 0 || Red.r2> 0|| Red.r4 > 0 ||Red.r12 > 0 || Red.r14 > 0|| Red.r24 > 0 ||Red.r124> 0) && Red.RedNumber1 + Red.RedNumber2 >= 10) {
                                Red.RedPieceIV1.setLayoutX(75);
                                Red.RedPieceIV1.setLayoutY(74);
                                Red.RedPieceIV1.setRotate(0);
                                Red.RedPiece1L = -2;
                                Red.RedPieceIV1.setVisible(true);
                                Red.RedPieceIV2.setLayoutX(23);
                                Red.RedPieceIV2.setLayoutY(21);
                                Red.RedPieceIV2.setRotate(0);
                                Red.RedPiece2L = -2;
                                Red.RedPieceIV2.setVisible(true);
                                Red.RedPieceIV4.setLayoutX(75);
                                Red.RedPieceIV4.setLayoutY(22);
                                Red.RedPieceIV4.setRotate(0);
                                Red.RedPiece4L = -2;
                                Red.RedPieceIV4.setVisible(true);
                                Red.RedPiece14L = -2;
                                Red.RedPiece12L = -2;
                                Red.RedPiece24L = -2;
                                Red.RedPieceIV12.setVisible(false);
                                Red.RedPieceIV14.setVisible(false);
                                Red.RedPieceIV24.setVisible(false);
                                Red.RedPieceIV124.setVisible(false);
                                ep.setEp("Pity! It's player3's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if ((Red.r1 > 0 || Red.r3> 0|| Red.r4 > 0 ||Red.r13 > 0 || Red.r14 > 0|| Red.r34 > 0 ||Red.r134> 0) && Red.RedNumber1 + Red.RedNumber2 >= 10) {
                                Red.RedPieceIV1.setLayoutX(75);
                                Red.RedPieceIV1.setLayoutY(74);
                                Red.RedPieceIV1.setRotate(0);
                                Red.RedPiece1L = -2;
                                Red.RedPieceIV1.setVisible(true);
                                Red.RedPieceIV3.setLayoutX(21);
                                Red.RedPieceIV3.setLayoutY(74);
                                Red.RedPieceIV3.setRotate(0);
                                Red.RedPiece3L = -2;
                                Red.RedPieceIV3.setVisible(true);
                                Red.RedPieceIV4.setLayoutX(75);
                                Red.RedPieceIV4.setLayoutY(22);
                                Red.RedPieceIV4.setRotate(0);
                                Red.RedPiece4L = -2;
                                Red.RedPieceIV4.setVisible(true);
                                Red.RedPiece14L = -2;
                                Red.RedPiece13L = -2;
                                Red.RedPiece34L = -2;
                                Red.RedPieceIV13.setVisible(false);
                                Red.RedPieceIV14.setVisible(false);
                                Red.RedPieceIV34.setVisible(false);
                                Red.RedPieceIV134.setVisible(false);
                                ep.setEp("Pity! It's player3's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if ((Red.r2 > 0 || Red.r3> 0|| Red.r4 > 0 ||Red.r23 > 0 || Red.r24 > 0|| Red.r34 > 0 ||Red.r134> 0) && Red.RedNumber1 + Red.RedNumber2 >= 10) {
                                Red.RedPieceIV2.setLayoutX(23);
                                Red.RedPieceIV2.setLayoutY(21);
                                Red.RedPieceIV2.setRotate(0);
                                Red.RedPiece2L = -2;
                                Red.RedPieceIV2.setVisible(true);
                                Red.RedPieceIV3.setLayoutX(21);
                                Red.RedPieceIV3.setLayoutY(74);
                                Red.RedPieceIV3.setRotate(0);
                                Red.RedPiece3L = -2;
                                Red.RedPieceIV3.setVisible(true);
                                Red.RedPieceIV4.setLayoutX(75);
                                Red.RedPieceIV4.setLayoutY(22);
                                Red.RedPieceIV4.setRotate(0);
                                Red.RedPiece4L = -2;
                                Red.RedPieceIV4.setVisible(true);
                                Red.RedPiece24L = -2;
                                Red.RedPiece23L = -2;
                                Red.RedPiece34L = -2;
                                Red.RedPieceIV23.setVisible(false);
                                Red.RedPieceIV24.setVisible(false);
                                Red.RedPieceIV34.setVisible(false);
                                Red.RedPieceIV234.setVisible(false);
                                ep.setEp("Pity! It's player3's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Red.r1 > 0||Red.r2 > 0 || Red.r3> 0|| Red.r4 > 0 ||Red.r12 >0 || Red.r13 >0|| Red.r14 > 0 ||Red.r23 > 0 || Red.r24 > 0|| Red.r34 > 0 ||Red.r123 > 0 || Red.r124 > 0||  Red.r134> 0|| Red.r234 > 0 ||Red.r1234 > 0  && Red.RedNumber1 + Red.RedNumber2 >= 10) {
                                Red.RedPieceIV1.setLayoutX(75);
                                Red.RedPieceIV1.setLayoutY(74);
                                Red.RedPieceIV1.setRotate(0);
                                Red.RedPiece1L = -2;
                                Red.RedPieceIV1.setVisible(true);
                                Red.RedPieceIV2.setLayoutX(23);
                                Red.RedPieceIV2.setLayoutY(21);
                                Red.RedPieceIV2.setRotate(0);
                                Red.RedPiece2L = -2;
                                Red.RedPieceIV2.setVisible(true);
                                Red.RedPieceIV3.setLayoutX(21);
                                Red.RedPieceIV3.setLayoutY(74);
                                Red.RedPieceIV3.setRotate(0);
                                Red.RedPiece3L = -2;
                                Red.RedPieceIV3.setVisible(true);
                                Red.RedPieceIV4.setLayoutX(75);
                                Red.RedPieceIV4.setLayoutY(22);
                                Red.RedPieceIV4.setRotate(0);
                                Red.RedPiece4L = -2;
                                Red.RedPieceIV4.setVisible(true);
                                Red.RedPiece12L = -2;
                                Red.RedPiece13L = -2;
                                Red.RedPiece14L = -2;
                                Red.RedPiece24L = -2;
                                Red.RedPiece23L = -2;
                                Red.RedPiece34L = -2;
                                Red.RedPiece123L = -2;
                                Red.RedPiece124L = -2;
                                Red.RedPiece134L = -2;
                                Red.RedPiece234L = -2;
                                Red.RedPiece1234L = -2;
                                Red.RedPieceIV12.setVisible(false);
                                Red.RedPieceIV13.setVisible(false);
                                Red.RedPieceIV14.setVisible(false);
                                Red.RedPieceIV23.setVisible(false);
                                Red.RedPieceIV24.setVisible(false);
                                Red.RedPieceIV34.setVisible(false);
                                Red.RedPieceIV123.setVisible(false);
                                Red.RedPieceIV124.setVisible(false);
                                Red.RedPieceIV134.setVisible(false);
                                Red.RedPieceIV234.setVisible(false);
                                Red.RedPieceIV1234.setVisible(false);
                                ep.setEp("Pity! It's player3's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }

                            RedFlagOpen = false;//open the count;
                            RedCount = 0;
                        }
                        if (Red.RedPiece1L == -2 && Red.RedPiece2L == -2
                                && Red.RedPiece3L == -2 && Red.RedPiece4L == -2
                                && Red.RedNumber1 != 6 && Red.RedNumber2 != 6 && RedCount == 0) {
                            description.setDescription("It's player3's turn! Please roll the dice!");
                            ep.setEp("It's player3's turn");
                            oneIV1.setVisible(false);
                            twoIV1.setVisible(false);
                            threeIV1.setVisible(false);
                            fourIV1.setVisible(false);
                            fiveIV1.setVisible(false);
                            sixIV1.setVisible(false);
                            oneIV2.setVisible(false);
                            twoIV2.setVisible(false);
                            threeIV2.setVisible(false);
                            fourIV2.setVisible(false);
                            fiveIV2.setVisible(false);
                            sixIV2.setVisible(false);
                            Exception2 = 1;
                            RedFlag = false;
                        } else if(Red.RedPiece1L == -2 && Red.RedPiece2L == -2
                                && Red.RedPiece3L == -2 && Red.RedPiece4L == -2
                                && Red.RedNumber1 != 6 && Red.RedNumber2 != 6 && RedCount > 0){
                            description.setDescription("It's player2's turn! Please roll the dice!");
                            ep.setEp("It's player2's turn");
                            oneIV1.setVisible(false);
                            twoIV1.setVisible(false);
                            threeIV1.setVisible(false);
                            fourIV1.setVisible(false);
                            fiveIV1.setVisible(false);
                            sixIV1.setVisible(false);
                            oneIV2.setVisible(false);
                            twoIV2.setVisible(false);
                            threeIV2.setVisible(false);
                            fourIV2.setVisible(false);
                            fiveIV2.setVisible(false);
                            sixIV2.setVisible(false);
                            Exception2 = 1;
                            RedFlag = false;
                        }
                    } else if (dice.PlayerCount % 4 == 3) {
                        yellowCount = 0;
                        RedCount = 0;
                        blueCount = 0;
                        GreenFlag = true;
                        Green.GreenNumber1 = diceNumber1;
                        Green.GreenNumber2 = diceNumber2;
                        if (Green.GreenNumber1 + Green.GreenNumber2 >= 10 && greenCount <= 2) {

                            greenCount++;
                            if (greenCount != 3)
                                dice.PlayerCount--;
                            greenFlagOpen = true;
                        }
                        if (greenCount >= 3) {
                            GreenFlag = false;
                            if (Green.g1 > 0 && Green.GreenNumber1 + Green.GreenNumber2 >= 10) {
                                Green.GreenPieceIV1.setLayoutX(75);
                                Green.GreenPieceIV1.setLayoutY(478);
                                Green.GreenPieceIV1.setRotate(180);
                                Green.GreenPiece1L = -2;
                                ep.setEp("Pity! It's player3's turn now");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Green.g2 > 0 && Green.GreenNumber1 + Green.GreenNumber2 >= 10) {
                                Green.GreenPieceIV2.setLayoutX(23);
                                Green.GreenPieceIV2.setLayoutY(426);
                                Green.GreenPieceIV2.setRotate(180);
                                Green.GreenPiece2L = -2;
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Green.g3 > 0 && Green.GreenNumber1 + Green.GreenNumber2 >= 10) {
                                Green.GreenPieceIV3.setLayoutX(75);
                                Green.GreenPieceIV3.setLayoutY(426);
                                Green.GreenPieceIV3.setRotate(180);
                                Green.GreenPiece3L = -2;
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Green.g4 > 0 && Green.GreenNumber1 + Green.GreenNumber2 >= 10) {
                                Green.GreenPieceIV4.setLayoutX(20);
                                Green.GreenPieceIV4.setLayoutY(478);
                                Green.GreenPieceIV4.setRotate(180);
                                Green.GreenPiece4L = -2;
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if ((Green.g1 > 0 || Green.g2 > 0 || Green.g12 > 0) && Green.GreenNumber1 + Green.GreenNumber2 >= 10) {
                                Green.GreenPieceIV1.setLayoutX(75);
                                Green.GreenPieceIV1.setLayoutY(478);
                                Green.GreenPieceIV1.setRotate(0);
                                Green.GreenPiece1L = -2;
                                Green.GreenPieceIV2.setLayoutX(23);
                                Green.GreenPieceIV2.setLayoutY(426);
                                Green.GreenPieceIV2.setRotate(0);
                                Green.GreenPiece2L = -2;
                                Green.GreenPieceIV1.setVisible(true);
                                Green.GreenPieceIV2.setVisible(true);
                                Green.GreenPiece12L = -2;
                                Green.GreenPieceIV12.setVisible(false);
                                ep.setEp("Pity! It's player4's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }

                            if ((Green.g1 > 0 || Green.g3 > 0 || Green.g13 > 0) && Green.GreenNumber1 + Green.GreenNumber2 >= 10) {
                                Green.GreenPieceIV1.setLayoutX(75);
                                Green.GreenPieceIV1.setLayoutY(478);
                                Green.GreenPieceIV1.setRotate(0);
                                Green.GreenPiece1L = -2;
                                Green.GreenPieceIV3.setLayoutX(75);
                                Green.GreenPieceIV3.setLayoutY(426);
                                Green.GreenPieceIV3.setRotate(0);
                                Green.GreenPiece3L = -2;
                                Green.GreenPieceIV1.setVisible(true);
                                Green.GreenPieceIV3.setVisible(true);
                                Green.GreenPiece13L = -2;
                                Green.GreenPieceIV13.setVisible(false);
                                ep.setEp("Pity! It's player4's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Green.g1 > 0 || Green.g4 > 0 || Green.g14 > 0 && Green.GreenNumber1 + Green.GreenNumber2 >= 10) {
                                Green.GreenPieceIV1.setLayoutX(75);
                                Green.GreenPieceIV1.setLayoutY(478);
                                Green.GreenPieceIV1.setRotate(0);
                                Green.GreenPiece1L = -2;
                                Green.GreenPieceIV4.setLayoutX(20);
                                Green.GreenPieceIV4.setLayoutY(478);
                                Green.GreenPieceIV4.setRotate(0);
                                Green.GreenPiece4L = -2;
                                Green.GreenPieceIV1.setVisible(true);
                                Green.GreenPieceIV4.setVisible(true);
                                Green.GreenPiece14L = -2;
                                Green.GreenPieceIV14.setVisible(false);
                                ep.setEp("Pity! It's player4's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Green.g2 > 0 || Green.g3 > 0 || Green.g23 > 0 && Green.GreenNumber1 + Green.GreenNumber2 >= 10) {
                                Green.GreenPieceIV2.setLayoutX(23);
                                Green.GreenPieceIV2.setLayoutY(426);
                                Green.GreenPieceIV2.setRotate(0);
                                Green.GreenPiece1L = -2;
                                 Green.GreenPieceIV3.setLayoutX(75);
                                Green.GreenPieceIV3.setLayoutY(426);
                                Green.GreenPieceIV3.setRotate(0);
                                Green.GreenPiece2L = -2;
                                Green.GreenPieceIV2.setVisible(true);
                                Green.GreenPieceIV3.setVisible(true);
                                Green.GreenPiece23L = -2;
                                Green.GreenPieceIV23.setVisible(false);
                                ep.setEp("Pity! It's player4's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Green.g2 > 0 || Green.g4 > 0 || Green.g24 > 0 && Green.GreenNumber1 + Green.GreenNumber2 >= 10) {
                               Green.GreenPieceIV2.setLayoutX(23);
                                Green.GreenPieceIV2.setLayoutY(426);
                                Green.GreenPieceIV2.setRotate(0);
                                Green.GreenPiece2L = -2;
                                Green.GreenPieceIV4.setLayoutX(20);
                                Green.GreenPieceIV4.setLayoutY(478);
                                Green.GreenPieceIV4.setRotate(0);
                                Green.GreenPiece4L = -2;
                                Green.GreenPieceIV2.setVisible(true);
                                Green.GreenPieceIV4.setVisible(true);
                                Green.GreenPiece24L = -2;
                                Green.GreenPieceIV24.setVisible(false);
                                ep.setEp("Pity! It's player4's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Green.g3 > 0 || Green.g4 > 0 || Green.g34 > 0 && Green.GreenNumber1 + Green.GreenNumber2 >= 10) {
                                Green.GreenPieceIV4.setLayoutX(20);
                                Green.GreenPieceIV4.setLayoutY(478);
                                Green.GreenPieceIV4.setRotate(0);
                                Green.GreenPiece4L = -2;
                                Green.GreenPieceIV4.setVisible(true);
                                 Green.GreenPieceIV3.setLayoutX(75);
                                Green.GreenPieceIV3.setLayoutY(426);
                                Green.GreenPieceIV3.setRotate(0);
                                Green.GreenPiece3L = -2;
                                Green.GreenPieceIV3.setVisible(true);
                                Green.GreenPiece34L = -2;
                                Green.GreenPieceIV34.setVisible(false);
                                ep.setEp("Pity! It's player4's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if ((Green.g1 > 0 || Green.g2> 0|| Green.g3 > 0 ||Green.g12 > 0 || Green.g23 > 0|| Green.g13 > 0 ||Green.g123> 0) && Green.GreenNumber1 + Green.GreenNumber2 >= 10) {
                                Green.GreenPieceIV1.setLayoutX(75);
                                Green.GreenPieceIV1.setLayoutY(478);
                                Green.GreenPieceIV1.setRotate(0);
                                Green.GreenPiece1L = -2;
                               Green.GreenPieceIV2.setLayoutX(23);
                                Green.GreenPieceIV2.setLayoutY(426);
                                Green.GreenPieceIV2.setRotate(0);
                                Green.GreenPiece2L = -2;
                                 Green.GreenPieceIV3.setLayoutX(75);
                                Green.GreenPieceIV3.setLayoutY(426);
                                Green.GreenPieceIV3.setRotate(0);
                                Green.GreenPiece3L = -2;
                                Green.GreenPieceIV1.setVisible(true);
                                Green.GreenPieceIV2.setVisible(true);
                                Green.GreenPieceIV3.setVisible(true);
                                Green.GreenPiece13L = -2;
                                Green.GreenPiece12L = -2;
                                Green.GreenPiece23L = -2;
                                Green.GreenPieceIV12.setVisible(false);
                                Green.GreenPieceIV13.setVisible(false);
                                Green.GreenPieceIV23.setVisible(false);
                                Green.GreenPieceIV123.setVisible(false);
                                ep.setEp("Pity! It's player4's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if ((Green.g1 > 0 || Green.g2> 0|| Green.g4 > 0 ||Green.g12 > 0 || Green.g14 > 0|| Green.g24 > 0 ||Green.g124> 0) && Green.GreenNumber1 + Green.GreenNumber2 >= 10) {
                                Green.GreenPieceIV1.setLayoutX(75);
                                Green.GreenPieceIV1.setLayoutY(478);
                                Green.GreenPieceIV1.setRotate(0);
                                Green.GreenPiece1L = -2;
                                Green.GreenPieceIV1.setVisible(true);
                               Green.GreenPieceIV2.setLayoutX(23);
                                Green.GreenPieceIV2.setLayoutY(426);
                                Green.GreenPieceIV2.setRotate(0);
                                Green.GreenPiece2L = -2;
                                Green.GreenPieceIV2.setVisible(true);
                                Green.GreenPieceIV4.setLayoutX(20);
                                Green.GreenPieceIV4.setLayoutY(478);
                                Green.GreenPieceIV4.setRotate(0);
                                Green.GreenPiece4L = -2;
                                Green.GreenPieceIV4.setVisible(true);
                                Green.GreenPiece14L = -2;
                                Green.GreenPiece12L = -2;
                                Green.GreenPiece24L = -2;
                                Green.GreenPieceIV12.setVisible(false);
                                Green.GreenPieceIV14.setVisible(false);
                                Green.GreenPieceIV24.setVisible(false);
                                Green.GreenPieceIV124.setVisible(false);
                                ep.setEp("Pity! It's player4's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if ((Green.g1 > 0 || Green.g3> 0|| Green.g4 > 0 ||Green.g13 > 0 || Green.g14 > 0|| Green.g34 > 0 ||Green.g134> 0) && Green.GreenNumber1 + Green.GreenNumber2 >= 10) {
                                Green.GreenPieceIV1.setLayoutX(75);
                                Green.GreenPieceIV1.setLayoutY(478);
                                Green.GreenPieceIV1.setRotate(0);
                                Green.GreenPiece1L = -2;
                                Green.GreenPieceIV1.setVisible(true);
                                 Green.GreenPieceIV3.setLayoutX(75);
                                Green.GreenPieceIV3.setLayoutY(426);
                                Green.GreenPieceIV3.setRotate(0);
                                Green.GreenPiece3L = -2;
                                Green.GreenPieceIV3.setVisible(true);
                                Green.GreenPieceIV4.setLayoutX(20);
                                Green.GreenPieceIV4.setLayoutY(478);
                                Green.GreenPieceIV4.setRotate(0);
                                Green.GreenPiece4L = -2;
                                Green.GreenPieceIV4.setVisible(true);
                                Green.GreenPiece14L = -2;
                                Green.GreenPiece13L = -2;
                                Green.GreenPiece34L = -2;
                                Green.GreenPieceIV13.setVisible(false);
                                Green.GreenPieceIV14.setVisible(false);
                                Green.GreenPieceIV34.setVisible(false);
                                Green.GreenPieceIV134.setVisible(false);
                                ep.setEp("Pity! It's player4's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if ((Green.g2 > 0 || Green.g3> 0|| Green.g4 > 0 ||Green.g23 > 0 || Green.g24 > 0|| Green.g34 > 0 ||Green.g134> 0) && Green.GreenNumber1 + Green.GreenNumber2 >= 10) {
                               Green.GreenPieceIV2.setLayoutX(23);
                                Green.GreenPieceIV2.setLayoutY(426);
                                Green.GreenPieceIV2.setRotate(0);
                                Green.GreenPiece2L = -2;
                                Green.GreenPieceIV2.setVisible(true);
                                 Green.GreenPieceIV3.setLayoutX(75);
                                Green.GreenPieceIV3.setLayoutY(426);
                                Green.GreenPieceIV3.setRotate(0);
                                Green.GreenPiece3L = -2;
                                Green.GreenPieceIV3.setVisible(true);
                                Green.GreenPieceIV4.setLayoutX(20);
                                Green.GreenPieceIV4.setLayoutY(478);
                                Green.GreenPieceIV4.setRotate(0);
                                Green.GreenPiece4L = -2;
                                Green.GreenPieceIV4.setVisible(true);
                                Green.GreenPiece24L = -2;
                                Green.GreenPiece23L = -2;
                                Green.GreenPiece34L = -2;
                                Green.GreenPieceIV23.setVisible(false);
                                Green.GreenPieceIV24.setVisible(false);
                                Green.GreenPieceIV34.setVisible(false);
                                Green.GreenPieceIV234.setVisible(false);
                                ep.setEp("Pity! It's player4's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Green.g1 > 0||Green.g2 > 0 || Green.g3> 0|| Green.g4 > 0 ||Green.g12 >0 || Green.g13 >0|| Green.g14 > 0 ||Green.g23 > 0 || Green.g24 > 0|| Green.g34 > 0 ||Green.g123 > 0 || Green.g124 > 0||  Green.g134> 0|| Green.g234 > 0 ||Green.g1234 > 0  && Green.GreenNumber1 + Green.GreenNumber2 >= 10) {
                                Green.GreenPieceIV1.setLayoutX(75);
                                Green.GreenPieceIV1.setLayoutY(478);
                                Green.GreenPieceIV1.setRotate(0);
                                Green.GreenPiece1L = -2;
                                Green.GreenPieceIV1.setVisible(true);
                               Green.GreenPieceIV2.setLayoutX(23);
                                Green.GreenPieceIV2.setLayoutY(426);
                                Green.GreenPieceIV2.setRotate(0);
                                Green.GreenPiece2L = -2;
                                Green.GreenPieceIV2.setVisible(true);
                                 Green.GreenPieceIV3.setLayoutX(75);
                                Green.GreenPieceIV3.setLayoutY(426);
                                Green.GreenPieceIV3.setRotate(0);
                                Green.GreenPiece3L = -2;
                                Green.GreenPieceIV3.setVisible(true);
                                Green.GreenPieceIV4.setLayoutX(20);
                                Green.GreenPieceIV4.setLayoutY(478);
                                Green.GreenPieceIV4.setRotate(0);
                                Green.GreenPiece4L = -2;
                                Green.GreenPieceIV4.setVisible(true);
                                Green.GreenPiece12L = -2;
                                Green.GreenPiece13L = -2;
                                Green.GreenPiece14L = -2;
                                Green.GreenPiece24L = -2;
                                Green.GreenPiece23L = -2;
                                Green.GreenPiece34L = -2;
                                Green.GreenPiece123L = -2;
                                Green.GreenPiece124L = -2;
                                Green.GreenPiece134L = -2;
                                Green.GreenPiece234L = -2;
                                Green.GreenPiece1234L = -2;
                                Green.GreenPieceIV12.setVisible(false);
                                Green.GreenPieceIV13.setVisible(false);
                                Green.GreenPieceIV14.setVisible(false);
                                Green.GreenPieceIV23.setVisible(false);
                                Green.GreenPieceIV24.setVisible(false);
                                Green.GreenPieceIV34.setVisible(false);
                                Green.GreenPieceIV123.setVisible(false);
                                Green.GreenPieceIV124.setVisible(false);
                                Green.GreenPieceIV134.setVisible(false);
                                Green.GreenPieceIV234.setVisible(false);
                                Green.GreenPieceIV1234.setVisible(false);
                                ep.setEp("Pity! It's player4's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            greenFlagOpen = false;//open the count;
                            greenCount = 0;
                        }
                        if (Green.GreenPiece1L == -2 && Green.GreenPiece2L == -2
                                && Green.GreenPiece3L == -2 && Green.GreenPiece4L == -2
                                && Green.GreenNumber1 != 6 && Green.GreenNumber2 != 6 && greenCount == 0) {

                            description.setDescription("It's player4's turn! Please roll the dice!");
                            ep.setEp("It's player4's turn");
                            oneIV1.setVisible(false);
                            twoIV1.setVisible(false);
                            threeIV1.setVisible(false);
                            fourIV1.setVisible(false);
                            fiveIV1.setVisible(false);
                            sixIV1.setVisible(false);
                            oneIV2.setVisible(false);
                            twoIV2.setVisible(false);
                            threeIV2.setVisible(false);
                            fourIV2.setVisible(false);
                            fiveIV2.setVisible(false);
                            sixIV2.setVisible(false);
                            Exception2 = 1;
                            GreenFlag = false;
                        }else if(Green.GreenPiece1L == -2 && Green.GreenPiece2L == -2
                                && Green.GreenPiece3L == -2 && Green.GreenPiece4L == -2
                                && Green.GreenNumber1 != 6 && Green.GreenNumber2 != 6 && greenCount > 0){
                            description.setDescription("It's player3's turn! Please roll the dice!");
                            ep.setEp("It's player3's turn");
                            oneIV1.setVisible(false);
                            twoIV1.setVisible(false);
                            threeIV1.setVisible(false);
                            fourIV1.setVisible(false);
                            fiveIV1.setVisible(false);
                            sixIV1.setVisible(false);
                            oneIV2.setVisible(false);
                            twoIV2.setVisible(false);
                            threeIV2.setVisible(false);
                            fourIV2.setVisible(false);
                            fiveIV2.setVisible(false);
                            sixIV2.setVisible(false);
                            Exception2 = 1;
                            GreenFlag = false;
                        }
                    } else if (dice.PlayerCount % 4 == 0) {
                        yellowCount = 0;
                        RedCount = 0;
                        greenCount = 0;
                        BlueFlag = true;
                        Blue.BlueNumber1 = diceNumber1;
                        Blue.BlueNumber2 = diceNumber2;
                        if (Blue.BlueNumber1 + Blue.BlueNumber2 >= 10 && blueCount <= 2) {

                            blueCount++;
                            if (blueCount != 3)
                                dice.PlayerCount--;
                            blueFlagOpen = true;
                        }
                        if (blueCount >= 3) {
                            BlueFlag = false;
                            if (Blue.b1 > 0 && Blue.BlueNumber1 + Blue.BlueNumber2 >= 10) {
                                Blue.BluePieceIV1.setLayoutX(426);
                                Blue.BluePieceIV1.setLayoutY(426);
                                Blue.BluePieceIV1.setRotate(0);
                                Blue.BluePiece1L = -2;
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Blue.b2 > 0 && Blue.BlueNumber1 + Blue.BlueNumber2 >= 10) {
                                Blue.BluePieceIV2.setLayoutX(478);
                                Blue.BluePieceIV2.setLayoutY(479);
                                Blue.BluePieceIV2.setRotate(0);
                                Blue.BluePiece2L = -2;
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Blue.b3 > 0 && Blue.BlueNumber1 + Blue.BlueNumber2 >= 10) {
                                Blue.BluePieceIV3.setLayoutX(426);
                                Blue.BluePieceIV3.setLayoutY(478);
                                Blue.BluePieceIV3.setRotate(0);
                                Blue.BluePiece3L = -2;
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Blue.b4 > 0 && Blue.BlueNumber1 + Blue.BlueNumber2 >= 10) {
                                Blue.BluePieceIV4.setLayoutX(479);
                                Blue.BluePieceIV4.setLayoutY(426);
                                Blue.BluePieceIV4.setRotate(0);
                                Blue.BluePiece4L = -2;
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if ((Blue.b1 > 0 || Blue.b2 > 0 || Blue.b12 > 0) && Blue.BlueNumber1 + Blue.BlueNumber2 >= 10) {
                                Blue.BluePieceIV1.setLayoutX(426);
                                Blue.BluePieceIV1.setLayoutY(426);
                                Blue.BluePieceIV1.setRotate(0);
                                Blue.BluePiece1L = -2;
                                Blue.BluePieceIV2.setLayoutX(478);
                                Blue.BluePieceIV2.setLayoutY(479);
                                Blue.BluePieceIV2.setRotate(0);
                                Blue.BluePiece2L = -2;
                                Blue.BluePieceIV1.setVisible(true);
                                Blue.BluePieceIV2.setVisible(true);
                                Blue.BluePiece12L = -2;
                                Blue.BluePieceIV12.setVisible(false);
                                ep.setEp("Pity! It's player4's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }

                            if ((Blue.b1 > 0 || Blue.b3 > 0 || Blue.b13 > 0) && Blue.BlueNumber1 + Blue.BlueNumber2 >= 10) {
                                Blue.BluePieceIV1.setLayoutX(426);
                                Blue.BluePieceIV1.setLayoutY(426);
                                Blue.BluePieceIV1.setRotate(0);
                                Blue.BluePiece1L = -2;
                                Blue.BluePieceIV3.setLayoutX(426);
                                Blue.BluePieceIV3.setLayoutY(478);
                                Blue.BluePieceIV3.setRotate(0);
                                Blue.BluePiece3L = -2;
                                Blue.BluePieceIV1.setVisible(true);
                                Blue.BluePieceIV3.setVisible(true);
                                Blue.BluePiece13L = -2;
                                Blue.BluePieceIV13.setVisible(false);
                                ep.setEp("Pity! It's player4's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Blue.b1 > 0 || Blue.b4 > 0 || Blue.b14 > 0 && Blue.BlueNumber1 + Blue.BlueNumber2 >= 10) {
                                Blue.BluePieceIV1.setLayoutX(426);
                                Blue.BluePieceIV1.setLayoutY(426);
                                Blue.BluePieceIV1.setRotate(0);
                                Blue.BluePiece1L = -2;
                                Blue.BluePieceIV4.setLayoutX(479);
                                Blue.BluePieceIV4.setLayoutY(426);
                                Blue.BluePieceIV4.setRotate(0);
                                Blue.BluePiece4L = -2;
                                Blue.BluePieceIV1.setVisible(true);
                                Blue.BluePieceIV4.setVisible(true);
                                Blue.BluePiece14L = -2;
                                Blue.BluePieceIV14.setVisible(false);
                                ep.setEp("Pity! It's player4's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Blue.b2 > 0 || Blue.b3 > 0 || Blue.b23 > 0 && Blue.BlueNumber1 + Blue.BlueNumber2 >= 10) {
                                Blue.BluePieceIV2.setLayoutX(478);
                                Blue.BluePieceIV2.setLayoutY(479);
                                Blue.BluePieceIV2.setRotate(0);
                                Blue.BluePiece1L = -2;
                                Blue.BluePieceIV3.setLayoutX(426);
                                Blue.BluePieceIV3.setLayoutY(478);
                                Blue.BluePieceIV3.setRotate(0);
                                Blue.BluePiece2L = -2;
                                Blue.BluePieceIV2.setVisible(true);
                                Blue.BluePieceIV3.setVisible(true);
                                Blue.BluePiece23L = -2;
                                Blue.BluePieceIV23.setVisible(false);
                                ep.setEp("Pity! It's player4's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Blue.b2 > 0 || Blue.b4 > 0 || Blue.b24 > 0 && Blue.BlueNumber1 + Blue.BlueNumber2 >= 10) {
                                Blue.BluePieceIV2.setLayoutX(478);
                                Blue.BluePieceIV2.setLayoutY(479);
                                Blue.BluePieceIV2.setRotate(0);
                                Blue.BluePiece2L = -2;
                                Blue.BluePieceIV4.setLayoutX(479);
                                Blue.BluePieceIV4.setLayoutY(426);
                                Blue.BluePieceIV4.setRotate(0);
                                Blue.BluePiece4L = -2;
                                Blue.BluePieceIV2.setVisible(true);
                                Blue.BluePieceIV4.setVisible(true);
                                Blue.BluePiece24L = -2;
                                Blue.BluePieceIV24.setVisible(false);
                                ep.setEp("Pity! It's player4's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Blue.b3 > 0 || Blue.b4 > 0 || Blue.b34 > 0 && Blue.BlueNumber1 + Blue.BlueNumber2 >= 10) {
                                Blue.BluePieceIV4.setLayoutX(479);
                                Blue.BluePieceIV4.setLayoutY(426);
                                Blue.BluePieceIV4.setRotate(0);
                                Blue.BluePiece4L = -2;
                                Blue.BluePieceIV4.setVisible(true);
                                Blue.BluePieceIV3.setLayoutX(426);
                                Blue.BluePieceIV3.setLayoutY(478);
                                Blue.BluePieceIV3.setRotate(0);
                                Blue.BluePiece3L = -2;
                                Blue.BluePieceIV3.setVisible(true);
                                Blue.BluePiece34L = -2;
                                Blue.BluePieceIV34.setVisible(false);
                                ep.setEp("Pity! It's player4's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if ((Blue.b1 > 0 || Blue.b2> 0|| Blue.b3 > 0 ||Blue.b12 > 0 || Blue.b23 > 0|| Blue.b13 > 0 ||Blue.b123> 0) && Blue.BlueNumber1 + Blue.BlueNumber2 >= 10) {
                                Blue.BluePieceIV1.setLayoutX(426);
                                Blue.BluePieceIV1.setLayoutY(426);
                                Blue.BluePieceIV1.setRotate(0);
                                Blue.BluePiece1L = -2;
                                Blue.BluePieceIV2.setLayoutX(478);
                                Blue.BluePieceIV2.setLayoutY(479);
                                Blue.BluePieceIV2.setRotate(0);
                                Blue.BluePiece2L = -2;
                                Blue.BluePieceIV3.setLayoutX(426);
                                Blue.BluePieceIV3.setLayoutY(478);
                                Blue.BluePieceIV3.setRotate(0);
                                Blue.BluePiece3L = -2;
                                Blue.BluePieceIV1.setVisible(true);
                                Blue.BluePieceIV2.setVisible(true);
                                Blue.BluePieceIV3.setVisible(true);
                                Blue.BluePiece13L = -2;
                                Blue.BluePiece12L = -2;
                                Blue.BluePiece23L = -2;
                                Blue.BluePieceIV12.setVisible(false);
                                Blue.BluePieceIV13.setVisible(false);
                                Blue.BluePieceIV23.setVisible(false);
                                Blue.BluePieceIV123.setVisible(false);
                                ep.setEp("Pity! It's player4's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if ((Blue.b1 > 0 || Blue.b2> 0|| Blue.b4 > 0 ||Blue.b12 > 0 || Blue.b14 > 0|| Blue.b24 > 0 ||Blue.b124> 0) && Blue.BlueNumber1 + Blue.BlueNumber2 >= 10) {
                                Blue.BluePieceIV1.setLayoutX(426);
                                Blue.BluePieceIV1.setLayoutY(426);
                                Blue.BluePieceIV1.setRotate(0);
                                Blue.BluePiece1L = -2;
                                Blue.BluePieceIV1.setVisible(true);
                                Blue.BluePieceIV2.setLayoutX(478);
                                Blue.BluePieceIV2.setLayoutY(479);
                                Blue.BluePieceIV2.setRotate(0);
                                Blue.BluePiece2L = -2;
                                Blue.BluePieceIV2.setVisible(true);
                                Blue.BluePieceIV4.setLayoutX(479);
                                Blue.BluePieceIV4.setLayoutY(426);
                                Blue.BluePieceIV4.setRotate(0);
                                Blue.BluePiece4L = -2;
                                Blue.BluePieceIV4.setVisible(true);
                                Blue.BluePiece14L = -2;
                                Blue.BluePiece12L = -2;
                                Blue.BluePiece24L = -2;
                                Blue.BluePieceIV12.setVisible(false);
                                Blue.BluePieceIV14.setVisible(false);
                                Blue.BluePieceIV24.setVisible(false);
                                Blue.BluePieceIV124.setVisible(false);
                                ep.setEp("Pity! It's player4's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if ((Blue.b1 > 0 || Blue.b3> 0|| Blue.b4 > 0 ||Blue.b13 > 0 || Blue.b14 > 0|| Blue.b34 > 0 ||Blue.b134> 0) && Blue.BlueNumber1 + Blue.BlueNumber2 >= 10) {
                                Blue.BluePieceIV1.setLayoutX(426);
                                Blue.BluePieceIV1.setLayoutY(426);
                                Blue.BluePieceIV1.setRotate(0);
                                Blue.BluePiece1L = -2;
                                Blue.BluePieceIV1.setVisible(true);
                                Blue.BluePieceIV3.setLayoutX(426);
                                Blue.BluePieceIV3.setLayoutY(478);
                                Blue.BluePieceIV3.setRotate(0);
                                Blue.BluePiece3L = -2;
                                Blue.BluePieceIV3.setVisible(true);
                                Blue.BluePieceIV4.setLayoutX(479);
                                Blue.BluePieceIV4.setLayoutY(426);
                                Blue.BluePieceIV4.setRotate(0);
                                Blue.BluePiece4L = -2;
                                Blue.BluePieceIV4.setVisible(true);
                                Blue.BluePiece14L = -2;
                                Blue.BluePiece13L = -2;
                                Blue.BluePiece34L = -2;
                                Blue.BluePieceIV13.setVisible(false);
                                Blue.BluePieceIV14.setVisible(false);
                                Blue.BluePieceIV34.setVisible(false);
                                Blue.BluePieceIV134.setVisible(false);
                                ep.setEp("Pity! It's player4's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if ((Blue.b2 > 0 || Blue.b3> 0|| Blue.b4 > 0 ||Blue.b23 > 0 || Blue.b24 > 0|| Blue.b34 > 0 ||Blue.b134> 0) && Blue.BlueNumber1 + Blue.BlueNumber2 >= 10) {
                                Blue.BluePieceIV2.setLayoutX(478);
                                Blue.BluePieceIV2.setLayoutY(479);
                                Blue.BluePieceIV2.setRotate(0);
                                Blue.BluePiece2L = -2;
                                Blue.BluePieceIV2.setVisible(true);
                                Blue.BluePieceIV3.setLayoutX(426);
                                Blue.BluePieceIV3.setLayoutY(478);
                                Blue.BluePieceIV3.setRotate(0);
                                Blue.BluePiece3L = -2;
                                Blue.BluePieceIV3.setVisible(true);
                                Blue.BluePieceIV4.setLayoutX(479);
                                Blue.BluePieceIV4.setLayoutY(426);
                                Blue.BluePieceIV4.setRotate(0);
                                Blue.BluePiece4L = -2;
                                Blue.BluePieceIV4.setVisible(true);
                                Blue.BluePiece24L = -2;
                                Blue.BluePiece23L = -2;
                                Blue.BluePiece34L = -2;
                                Blue.BluePieceIV23.setVisible(false);
                                Blue.BluePieceIV24.setVisible(false);
                                Blue.BluePieceIV34.setVisible(false);
                                Blue.BluePieceIV234.setVisible(false);
                                ep.setEp("Pity! It's player4's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            if (Blue.b1 > 0||Blue.b2 > 0 || Blue.b3> 0|| Blue.b4 > 0 ||Blue.b12 >0 || Blue.b13 >0|| Blue.b14 > 0 ||Blue.b23 > 0 || Blue.b24 > 0|| Blue.b34 > 0 ||Blue.b123 > 0 || Blue.b124 > 0||  Blue.b134> 0|| Blue.b234 > 0 ||Blue.b1234 > 0  && Blue.BlueNumber1 + Blue.BlueNumber2 >= 10) {
                                Blue.BluePieceIV1.setLayoutX(426);
                                Blue.BluePieceIV1.setLayoutY(426);
                                Blue.BluePieceIV1.setRotate(0);
                                Blue.BluePiece1L = -2;
                                Blue.BluePieceIV1.setVisible(true);
                                Blue.BluePieceIV2.setLayoutX(478);
                                Blue.BluePieceIV2.setLayoutY(479);
                                Blue.BluePieceIV2.setRotate(0);
                                Blue.BluePiece2L = -2;
                                Blue.BluePieceIV2.setVisible(true);
                                Blue.BluePieceIV3.setLayoutX(426);
                                Blue.BluePieceIV3.setLayoutY(478);
                                Blue.BluePieceIV3.setRotate(0);
                                Blue.BluePiece3L = -2;
                                Blue.BluePieceIV3.setVisible(true);
                                Blue.BluePieceIV4.setLayoutX(479);
                                Blue.BluePieceIV4.setLayoutY(426);
                                Blue.BluePieceIV4.setRotate(0);
                                Blue.BluePiece4L = -2;
                                Blue.BluePieceIV4.setVisible(true);
                                Blue.BluePiece12L = -2;
                                Blue.BluePiece13L = -2;
                                Blue.BluePiece14L = -2;
                                Blue.BluePiece24L = -2;
                                Blue.BluePiece23L = -2;
                                Blue.BluePiece34L = -2;
                                Blue.BluePiece123L = -2;
                                Blue.BluePiece124L = -2;
                                Blue.BluePiece134L = -2;
                                Blue.BluePiece234L = -2;
                                Blue.BluePiece1234L = -2;
                                Blue.BluePieceIV12.setVisible(false);
                                Blue.BluePieceIV13.setVisible(false);
                                Blue.BluePieceIV14.setVisible(false);
                                Blue.BluePieceIV23.setVisible(false);
                                Blue.BluePieceIV24.setVisible(false);
                                Blue.BluePieceIV34.setVisible(false);
                                Blue.BluePieceIV123.setVisible(false);
                                Blue.BluePieceIV124.setVisible(false);
                                Blue.BluePieceIV134.setVisible(false);
                                Blue.BluePieceIV234.setVisible(false);
                                Blue.BluePieceIV1234.setVisible(false);
                                ep.setEp("Pity! It's player4's turn now ");
                                oneIV1.setVisible(false);
                                twoIV1.setVisible(false);
                                threeIV1.setVisible(false);
                                fourIV1.setVisible(false);
                                fiveIV1.setVisible(false);
                                sixIV1.setVisible(false);
                                oneIV2.setVisible(false);
                                twoIV2.setVisible(false);
                                threeIV2.setVisible(false);
                                fourIV2.setVisible(false);
                                fiveIV2.setVisible(false);
                                sixIV2.setVisible(false);
                            }
                            blueFlagOpen = false;
                            blueCount = 0;
                        }
                        if (Blue.BluePiece1L == -2 && Blue.BluePiece2L == -2
                                && Blue.BluePiece3L == -2 && Blue.BluePiece4L == -2
                                && Blue.BlueNumber1 != 6 && Blue.BlueNumber2 != 6 && blueCount == 0) {
                            description.setDescription("It's player1's turn! Please roll the dice!");
                            ep.setEp("It's player1's turn");
                            ep.setEp("Pity! It's player1's turn now");
                            oneIV1.setVisible(false);
                            twoIV1.setVisible(false);
                            threeIV1.setVisible(false);
                            fourIV1.setVisible(false);
                            fiveIV1.setVisible(false);
                            sixIV1.setVisible(false);
                            oneIV2.setVisible(false);
                            twoIV2.setVisible(false);
                            threeIV2.setVisible(false);
                            fourIV2.setVisible(false);
                            fiveIV2.setVisible(false);
                            sixIV2.setVisible(false);
                            Exception2 = 1;
                            BlueFlag = false;
                        }else if(Blue.BluePiece1L == -2 && Blue.BluePiece2L == -2
                                && Blue.BluePiece3L == -2 && Blue.BluePiece4L == -2
                                && Blue.BlueNumber1 != 6 && Blue.BlueNumber2 != 6 && blueCount > 0){
                            description.setDescription("It's player4's turn! Please roll the dice!");
                            ep.setEp("It's player4's turn");
                            ep.setEp("Pity! It's player4's turn now");
                            oneIV1.setVisible(false);
                            twoIV1.setVisible(false);
                            threeIV1.setVisible(false);
                            fourIV1.setVisible(false);
                            fiveIV1.setVisible(false);
                            sixIV1.setVisible(false);
                            oneIV2.setVisible(false);
                            twoIV2.setVisible(false);
                            threeIV2.setVisible(false);
                            fourIV2.setVisible(false);
                            fiveIV2.setVisible(false);
                            sixIV2.setVisible(false);
                            Exception2 = 1;
                            BlueFlag = false;
                        }
                    }
                    ComboBox<Integer> cbo3 = new ComboBox<>();
                    ObservableList<Integer> items2 = FXCollections.observableArrayList(dice.getPace1(number2.get(0), number2.get(1)));
                    //cbo3为人工选择两次后弹出的复选框；
                    cbo3.getItems().addAll(items2);
                    basePane.getChildren().add(cbo3);
                    if (Exception2 == 0) {
                        cbo3.setVisible(true);
                        label2.setVisible(true);
                    }
                    if (Exception2 == 1 || yellowCount >= 3 || RedCount >= 3 || greenCount >= 3 || blueCount >= 3) {
                        cbo3.setVisible(false);
                        label2.setVisible(false);
                        Exception = 0;
                    }
                    Exception2 = 0;
                    cbo3.setPrefWidth(70);
                    cbo3.setPrefHeight(28);
                    cbo3.setLayoutX(600);
                    cbo3.setLayoutY(272);
                    cbo3.setOnAction(event1 -> {
                        cbo3.setVisible(false);
                        oneIV1.setVisible(false);
                        twoIV1.setVisible(false);
                        threeIV1.setVisible(false);
                        fourIV1.setVisible(false);
                        fiveIV1.setVisible(false);
                        sixIV1.setVisible(false);
                        oneIV2.setVisible(false);
                        twoIV2.setVisible(false);
                        threeIV2.setVisible(false);
                        fourIV2.setVisible(false);
                        fiveIV2.setVisible(false);
                        sixIV2.setVisible(false);
                        pace1 = cbo3.getValue();
                        cbo3.setVisible(false);
                        Exception = 0;

                        if (yellowCount > 0 || RedCount > 0 || greenCount > 0 || blueCount > 0) {
                            ep.setEp(String.format("Player %d moves %d pace%s", (dice.PlayerCount % 4 == 0) ? 1 : dice.PlayerCount % 4 + 1, cbo3.getValue(), (cbo3.getValue() == 1) ? "" : "s"));
                        } else {
                            ep.setEp(String.format("Player %d moves %d pace%s", (dice.PlayerCount % 4 == 0) ? 4 : dice.PlayerCount % 4, cbo3.getValue(), (cbo3.getValue() == 1) ? "" : "s"));
                        }
                        label2.setVisible(false);
                    });
                }
                if (number2.size() >= 2) {
                    number2.clear();
                }
            }
        });
        if(Yellow.winNumber == 4){
            winCount ++;
            if(winCount == 1){
                yellow.setVisible(true);
                yellow.setLayoutX(620);
                yellow.setLayoutY(14);
            }
            else if(winCount == 2){
                yellow.setVisible(true);
                yellow.setLayoutX(620);
                yellow.setLayoutY(48);
            }
            else if(winCount == 3){
                yellow.setVisible(true);
                yellow.setLayoutX(620);
                yellow.setLayoutY(82);
            }
            Yellow.winNumber = 0;
            new WinPane().display("Congratulations!",String.format("Yellow finished!And the ranking is %s",(winCount == 1)?"Winner":(winCount == 2)?"Second":(winCount == 3)?"Third":"Loser"));
        }
        if(Red.winNumber == 4){
            winCount ++;
            if(winCount == 1){
                Winner1.setVisible(true);
                red.setVisible(true);
                red.setLayoutX(620);
                red.setLayoutY(14);
            }
            else if(winCount == 2){
                Winner2.setVisible(true);
                red.setVisible(true);
                red.setLayoutX(620);
                red.setLayoutY(48);
            }
            else if(winCount == 3){
                Winner3.setVisible(true);
                red.setVisible(true);
                red.setLayoutX(620);
                red.setLayoutY(82);
            }
            Red.winNumber = 0;
            new WinPane().display("Congratulations!",String.format("Red finished!And the ranking is %s",(winCount == 1)?"Winner":(winCount == 2)?"Second":(winCount == 3)?"Third":"Loser"));
        }
        if(Green.winNumber == 4){
            winCount ++;
            if(winCount == 1){
                Winner1.setVisible(true);
                green.setVisible(true);
                green.setLayoutX(620);
                green.setLayoutY(14);
            }
            else if(winCount == 2){
                Winner2.setVisible(true);
                green.setVisible(true);
                green.setLayoutX(620);
                green.setLayoutY(48);
            }
            else if(winCount == 3){
                Winner3.setVisible(true);
                green.setVisible(true);
                green.setLayoutX(620);
                green.setLayoutY(82);
            }
            Green.winNumber = 0;
            new WinPane().display("Congratulations!",String.format("Green finished!And the ranking is %s",(winCount == 1)?"Winner":(winCount == 2)?"Second":(winCount == 3)?"Third":"Loser"));
        }
        if(Blue.winNumber == 4){
            winCount ++;
            if(winCount == 1){
                Winner1.setVisible(true);

            }
            else if(winCount == 2){
                Winner2.setVisible(true);

            }
            else if(winCount == 3){
                Winner3.setVisible(true);

            }
            Red.winNumber = 0;
            new WinPane().display("Congratulations!",String.format("Red finished!And the ranking is %s",(winCount == 1)?"Winner":(winCount == 2)?"Second":(winCount == 3)?"Third":"Loser"));
        }



        Line lineG = new Line(195, 144, 334, 144);
        lineG.setStroke(Color.GREEN);
        lineG.getStrokeDashArray().addAll(10d, 10d, 10d, 10d);
        lineG.setStrokeWidth(1.3);
        Line lineB = new Line(140, 192, 140, 335);
        lineB.getStrokeDashArray().addAll(10d, 10d, 10d, 10d);
        lineB.setStroke(Color.BLUE);
        lineB.setStrokeWidth(1.3);
        Line lineY = new Line(169, 388, 358, 388);
        lineY.getStrokeDashArray().addAll(10d, 10d, 10d, 10d);
        lineY.setStroke(Color.YELLOW);
        lineY.setStrokeWidth(1.3);
        Line lineR = new Line(384, 334, 384, 195);
        lineR.getStrokeDashArray().addAll(10d, 10d, 10d, 10d);
        lineR.setStroke(Color.RED);
        lineR.setStrokeWidth(1.3);
        basePane.getChildren().addAll(lineG, lineB, lineY, lineR);

        RadioButton btManual = new RadioButton("manual");
        btManual.setTextFill(Color.RED);
        RadioButton btAuto = new RadioButton(("auto"));
        basePane.getChildren().addAll(btManual, btAuto);
        btManual.setLayoutX(535);
        btManual.setLayoutY(180);
        btAuto.setLayoutX(655);
        btAuto.setTextFill(Color.RED);
        btManual.setFont(Font.font("Courier New", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 13));
        btAuto.setLayoutY(180);
        btAuto.setFont(Font.font("Courier New", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 13));

        ToggleGroup group = new ToggleGroup();
        btManual.setToggleGroup(group);
        btAuto.setToggleGroup(group);
        btAuto.setOnAction(event -> {
            ok.setVisible(false);
            tf.setVisible(false);
            i = 0;
        });

        btManual.setOnAction(event -> {
            ok.setVisible(true);
            tf.setVisible(true);
            i = 1;
        });
        Button restart = new Button("Restart");
        restart.setLayoutX(570);
        restart.setLayoutY(532);
        restart.setPrefSize(75, 15);
        restart.setTextFill(Color.PURPLE);
        restart.setOnAction(e -> {
            new restartBox().display("Restart", "Sure to restart? ");
        });
        basePane.getChildren().addAll(restart);
        Button btExit = new Button("Exit");
        btExit.setLayoutX(650);
        btExit.setLayoutY(532);
        btExit.setPrefSize(75, 15);
        basePane.getChildren().add(btExit);
        Label bl = new Label("Blue");
        bl.setFont(Font.font("Courier New", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 14));
        bl.setTextFill(Color.RED);
        if(cnt1 == 0) bl.setVisible(false);
        else bl.setVisible(true);
        bl.setLayoutX(620);
        bl.setLayoutY(14);
        basePane.getChildren().add(bl);
        Image Exitim = new Image("Exit.png");
        ImageView ExitIV = new ImageView(Exitim);
        ExitIV.setFitWidth(15);
        ExitIV.setFitHeight(15);
        btExit.setGraphic(ExitIV);
        btExit.setContentDisplay(ContentDisplay.RIGHT);
        btExit.setTextFill(Color.PURPLE);

        btExit.setOnAction(event -> {
            try {
                new SaveAlertBox().display("Exit ?", "Save or Not ?");
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        });
        Button save = new Button("Save");
        save.setPrefSize(75, 15);
        save.setTextFill(Color.PURPLE);
        save.setLayoutX(490);
        save.setLayoutY(532);
        save.setOnAction(event -> {
            try {
                new FilePane2().start(new Stage());
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        });
        ImageView musicIV = new ImageView(musicIM);
        musicIV.setLayoutX(14);
        musicIV.setLayoutY(525);
        musicIV.setFitWidth(30);
        musicIV.setFitHeight(30);
        musicIV.setOnMouseClicked(event -> {
            File file9 = new File("C:\\Codes\\practise\\src\\BGM.mp3");
            Media mediaPlayer1 = new Media(file9.toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(mediaPlayer1);
            MediaPlayer.Status status1 = mediaPlayer.getStatus();
            if (status.equals(MediaPlayer.Status.PLAYING)) {
                mediaPlayer.pause();
            } else {
                mediaPlayer.play();
            }
        });
        basePane.getChildren().addAll(Winner1, Winner2, Winner3);
        basePane.getChildren().addAll(yellow, red, green);
        basePane.getChildren().add(musicIV);
        basePane.getChildren().add(save);
        basePane.getChildren().addAll(Yellow.getYellowPiece1(), Yellow.getYellowPiece2(), Yellow.getYellowPiece3(), Yellow.getYellowPiece4());
        basePane.getChildren().addAll(Blue.getBluePiece1(), Blue.getBluePiece2(), Blue.getBluePiece3(), Blue.getBluePiece4());
        basePane.getChildren().addAll(Red.getRedPiece1(), Red.getRedPiece2(), Red.getRedPiece3(), Red.getRedPiece4());
        basePane.getChildren().addAll(Green.getGreenPiece1(), Green.getGreenPiece2(), Green.getGreenPiece3(), Green.getGreenPiece4());
        basePane.getChildren().addAll(Yellow.getYellowIV12(), Yellow.getYellowIV13(), Yellow.getYellowIV14(), Yellow.getYellowIV23(), Yellow.getYellowIV24(), Yellow.getYellowIV34(),
                Yellow.getYellowIV123(), Yellow.getYellowIV124(), Yellow.getYellowIV134(), Yellow.getYellowIV234(), Yellow.getYellowIV1234());
        basePane.getChildren().addAll(Yellow.getWinWDIV(), Yellow.getWinIV1(),Yellow.getWinIV2(), Yellow.getWinIV3(), Yellow.getWinIV4());
        basePane.getChildren().addAll(oneIV1, oneIV2, twoIV1, twoIV2, threeIV1,
                threeIV2, fourIV1, fourIV2, fiveIV1, fiveIV2, sixIV1, sixIV2);
        basePane.getChildren().addAll(Red.getRedIV12(), Red.getRedIV13(), Red.getRedIV14(), Red.getRedIV23(), Red.getRedIV24(), Red.getRedIV34(), Red.getRedIV123()
        , Red.getRedIV124(), Red.getRedIV134(), Red.getRedIV234(), Red.getRedIV1234());
        basePane.getChildren().addAll(Red.getWinIV1(), Red.getWinIV2(), Red.getWinIV3(), Red.getWinIV4(), Red.getWinWDIV());
        basePane.getChildren().addAll(Green.getGreenIV12(), Green.getGreenIV13(),Green.getGreenIV14(), Green.getGreenIV23(), Green.getGreenIV24(), Green.getGreenIV34(), Green.getGreenIV123(), Green.getGreenIV124(),
                Green.getGreenIV134(), Green.getGreenIV234(), Green.getGreenIV1234());
        basePane.getChildren().addAll(Green.getWinIV1(), Green.getWinIV2(), Green.getWinIV3(), Green.getWinIV4(), Green.getWinWDIV());
        basePane.getChildren().addAll(Blue.getBlueIV12(), Blue.getBlueIV13(), Blue.getBlueIV14(), Blue.getBlueIV23(), Blue.getBlueIV24(), Blue.getBlueIV34(), Blue.getBlueIV123(), Blue.getBlueIV124(), Blue.getBlueIV134(), Blue.getBlueIV234(),
                Blue.getBlueIV1234());
        basePane.getChildren().addAll(Blue.getWinIV1(), Blue.getWinIV2(),Blue.getWinIV3(),Blue.getWinIV4(),Blue.getWinWDIV());
        basePane.getChildren().addAll(BoomIV,championIV);

        Yellow.WinWDIV.setVisible(false);
        Yellow.WinIV1.setVisible(false);
        Yellow.WinIV2.setVisible(false);
        Yellow.WinIV3.setVisible(false);
        Yellow.WinIV4.setVisible(false);
        Red.WinWDIV.setVisible(false);
        Red.WinIV1.setVisible(false);
        Red.WinIV2.setVisible(false);
        Red.WinIV3.setVisible(false);
        Red.WinIV4.setVisible(false);
        Green.WinWDIV.setVisible(false);
        Green.WinIV1.setVisible(false);
        Green.WinIV2.setVisible(false);
        Green.WinIV3.setVisible(false);
        Green.WinIV4.setVisible(false);
        Blue.WinWDIV.setVisible(false);
        Blue.WinIV1.setVisible(false);
        Blue.WinIV2.setVisible(false);
        Blue.WinIV3.setVisible(false);
        Blue.WinIV4.setVisible(false);


        if(ioio.i == 1){
            getFile(input1);
        }
        if(ioio.i == 2){
           getFile(input2);
        }
        if(ioio.i == 3){
            getFile(input3);
        }
        if(ioio.i == 4){
            getFile(input4);
        }
        if(ioio.i == 5){
            getFile(input5);
        }
        if(ioio.i == 6){
            getFile(input6);
        }
        if(ioio.i == 7){
            getFile(input7);
        }
        if(ioio.i == 8){
            getFile(input8);
        }

        BoomIV.setVisible(false);


        Scene scene = new Scene(basePane, 720, 558);//stage > scene > pane(要一步步放进去）（此处为将pane放入scene）
        primaryStage.setTitle("Aeroplane");//给stage命
        primaryStage.setScene(scene);//将scene导入stage
        primaryStage.show();//展示

    }
    public static void getFile(Scanner sc){
        Yellow.YellowPiece1L = Integer.parseInt(sc.next());
        Yellow.YellowPiece2L = Integer.parseInt(sc.next());
        Yellow.YellowPiece3L = Integer.parseInt(sc.next());
        Yellow.YellowPiece4L = Integer.parseInt(sc.next());
        Yellow.YellowPiece12L = Integer.parseInt(sc.next());
        Yellow.YellowPiece13L = Integer.parseInt(sc.next());
        Yellow.YellowPiece14L = Integer.parseInt(sc.next());
        Yellow.YellowPiece23L = Integer.parseInt(sc.next());
        Yellow.YellowPiece24L = Integer.parseInt(sc.next());
        Yellow.YellowPiece34L = Integer.parseInt(sc.next());
        Yellow.YellowPiece123L = Integer.parseInt(sc.next());
        Yellow.YellowPiece124L = Integer.parseInt(sc.next());
        Yellow.YellowPiece134L = Integer.parseInt(sc.next());
        Yellow.YellowPiece234L = Integer.parseInt(sc.next());
        Yellow.YellowPiece1234L = Integer.parseInt(sc.next());
        Yellow.YellowPieceIV1.setLayoutX(Double.parseDouble(sc.next()));
        Yellow.YellowPieceIV1.setLayoutY(Double.parseDouble(sc.next()));
        Yellow.YellowPieceIV2.setLayoutX(Double.parseDouble(sc.next()));
        Yellow.YellowPieceIV2.setLayoutY(Double.parseDouble(sc.next()));
        Yellow.YellowPieceIV3.setLayoutX(Double.parseDouble(sc.next()));
        Yellow.YellowPieceIV3.setLayoutY(Double.parseDouble(sc.next()));
        Yellow.YellowPieceIV4.setLayoutX(Double.parseDouble(sc.next()));
        Yellow.YellowPieceIV4.setLayoutY(Double.parseDouble(sc.next()));
        Yellow.YellowPieceIV12.setLayoutX(Double.parseDouble(sc.next()));
        Yellow.YellowPieceIV12.setLayoutY(Double.parseDouble(sc.next()));
        Yellow.YellowPieceIV13.setLayoutX(Double.parseDouble(sc.next()));
        Yellow.YellowPieceIV13.setLayoutY(Double.parseDouble(sc.next()));
        Yellow.YellowPieceIV14.setLayoutX(Double.parseDouble(sc.next()));
        Yellow.YellowPieceIV14.setLayoutY(Double.parseDouble(sc.next()));
        Yellow.YellowPieceIV23.setLayoutX(Double.parseDouble(sc.next()));
        Yellow.YellowPieceIV23.setLayoutY(Double.parseDouble(sc.next()));
        Yellow.YellowPieceIV24.setLayoutX(Double.parseDouble(sc.next()));
        Yellow.YellowPieceIV24.setLayoutY(Double.parseDouble(sc.next()));
        Yellow.YellowPieceIV34.setLayoutX(Double.parseDouble(sc.next()));
        Yellow.YellowPieceIV34.setLayoutY(Double.parseDouble(sc.next()));
        Yellow.YellowPieceIV123.setLayoutX(Double.parseDouble(sc.next()));
        Yellow.YellowPieceIV123.setLayoutY(Double.parseDouble(sc.next()));
        Yellow.YellowPieceIV124.setLayoutX(Double.parseDouble(sc.next()));
        Yellow.YellowPieceIV124.setLayoutY(Double.parseDouble(sc.next()));
        Yellow.YellowPieceIV134.setLayoutX(Double.parseDouble(sc.next()));
        Yellow.YellowPieceIV134.setLayoutY(Double.parseDouble(sc.next()));
        Yellow.YellowPieceIV234.setLayoutX(Double.parseDouble(sc.next()));
        Yellow.YellowPieceIV234.setLayoutY(Double.parseDouble(sc.next()));
        Yellow.YellowPieceIV1234.setLayoutX(Double.parseDouble(sc.next()));
        Yellow.YellowPieceIV1234.setLayoutY(Double.parseDouble(sc.next()));
        Red.RedPiece1L = Integer.parseInt(sc.next());
        Red.RedPiece2L = Integer.parseInt(sc.next());
        Red.RedPiece3L = Integer.parseInt(sc.next());
        Red.RedPiece4L = Integer.parseInt(sc.next());
        Red.RedPiece12L = Integer.parseInt(sc.next());
        Red.RedPiece13L = Integer.parseInt(sc.next());
        Red.RedPiece14L = Integer.parseInt(sc.next());
        Red.RedPiece23L = Integer.parseInt(sc.next());
        Red.RedPiece24L = Integer.parseInt(sc.next());
        Red.RedPiece34L = Integer.parseInt(sc.next());
        Red.RedPiece123L = Integer.parseInt(sc.next());
        Red.RedPiece124L = Integer.parseInt(sc.next());
        Red.RedPiece134L = Integer.parseInt(sc.next());
        Red.RedPiece234L = Integer.parseInt(sc.next());
        Red.RedPiece1234L = Integer.parseInt(sc.next());
        Red.RedPieceIV1.setLayoutX(Double.parseDouble(sc.next()));
        Red.RedPieceIV1.setLayoutY(Double.parseDouble(sc.next()));
        Red.RedPieceIV2.setLayoutX(Double.parseDouble(sc.next()));
        Red.RedPieceIV2.setLayoutY(Double.parseDouble(sc.next()));
        Red.RedPieceIV3.setLayoutX(Double.parseDouble(sc.next()));
        Red.RedPieceIV3.setLayoutY(Double.parseDouble(sc.next()));
        Red.RedPieceIV4.setLayoutX(Double.parseDouble(sc.next()));
        Red.RedPieceIV4.setLayoutY(Double.parseDouble(sc.next()));
        Red.RedPieceIV12.setLayoutX(Double.parseDouble(sc.next()));
        Red.RedPieceIV12.setLayoutY(Double.parseDouble(sc.next()));
        Red.RedPieceIV13.setLayoutX(Double.parseDouble(sc.next()));
        Red.RedPieceIV13.setLayoutY(Double.parseDouble(sc.next()));
        Red.RedPieceIV14.setLayoutX(Double.parseDouble(sc.next()));
        Red.RedPieceIV14.setLayoutY(Double.parseDouble(sc.next()));
        Red.RedPieceIV23.setLayoutX(Double.parseDouble(sc.next()));
        Red.RedPieceIV23.setLayoutY(Double.parseDouble(sc.next()));
        Red.RedPieceIV24.setLayoutX(Double.parseDouble(sc.next()));
        Red.RedPieceIV24.setLayoutY(Double.parseDouble(sc.next()));
        Red.RedPieceIV34.setLayoutX(Double.parseDouble(sc.next()));
        Red.RedPieceIV34.setLayoutY(Double.parseDouble(sc.next()));
        Red.RedPieceIV123.setLayoutX(Double.parseDouble(sc.next()));
        Red.RedPieceIV123.setLayoutY(Double.parseDouble(sc.next()));
        Red.RedPieceIV124.setLayoutX(Double.parseDouble(sc.next()));
        Red.RedPieceIV124.setLayoutY(Double.parseDouble(sc.next()));
        Red.RedPieceIV134.setLayoutX(Double.parseDouble(sc.next()));
        Red.RedPieceIV134.setLayoutY(Double.parseDouble(sc.next()));
        Red.RedPieceIV234.setLayoutX(Double.parseDouble(sc.next()));
        Red.RedPieceIV234.setLayoutY(Double.parseDouble(sc.next()));
        Red.RedPieceIV1234.setLayoutX(Double.parseDouble(sc.next()));
        Red.RedPieceIV1234.setLayoutY(Double.parseDouble(sc.next()));
        Green.GreenPiece1L = Integer.parseInt(sc.next());
        Green.GreenPiece2L = Integer.parseInt(sc.next());
        Green.GreenPiece3L = Integer.parseInt(sc.next());
        Green.GreenPiece4L = Integer.parseInt(sc.next());
        Green.GreenPiece12L = Integer.parseInt(sc.next());
        Green.GreenPiece13L = Integer.parseInt(sc.next());
        Green.GreenPiece14L = Integer.parseInt(sc.next());
        Green.GreenPiece23L = Integer.parseInt(sc.next());
        Green.GreenPiece24L = Integer.parseInt(sc.next());
        Green.GreenPiece34L = Integer.parseInt(sc.next());
        Green.GreenPiece123L = Integer.parseInt(sc.next());
        Green.GreenPiece124L = Integer.parseInt(sc.next());
        Green.GreenPiece134L = Integer.parseInt(sc.next());
        Green.GreenPiece234L = Integer.parseInt(sc.next());
        Green.GreenPiece1234L = Integer.parseInt(sc.next());
        Green.GreenPieceIV1.setLayoutX(Double.parseDouble(sc.next()));
        Green.GreenPieceIV1.setLayoutY(Double.parseDouble(sc.next()));
        Green.GreenPieceIV2.setLayoutX(Double.parseDouble(sc.next()));
        Green.GreenPieceIV2.setLayoutY(Double.parseDouble(sc.next()));
        Green.GreenPieceIV3.setLayoutX(Double.parseDouble(sc.next()));
        Green.GreenPieceIV3.setLayoutY(Double.parseDouble(sc.next()));
        Green.GreenPieceIV4.setLayoutX(Double.parseDouble(sc.next()));
        Green.GreenPieceIV4.setLayoutY(Double.parseDouble(sc.next()));
        Green.GreenPieceIV12.setLayoutX(Double.parseDouble(sc.next()));
        Green.GreenPieceIV12.setLayoutY(Double.parseDouble(sc.next()));
        Green.GreenPieceIV13.setLayoutX(Double.parseDouble(sc.next()));
        Green.GreenPieceIV13.setLayoutY(Double.parseDouble(sc.next()));
        Green.GreenPieceIV14.setLayoutX(Double.parseDouble(sc.next()));
        Green.GreenPieceIV14.setLayoutY(Double.parseDouble(sc.next()));
        Green.GreenPieceIV23.setLayoutX(Double.parseDouble(sc.next()));
        Green.GreenPieceIV23.setLayoutY(Double.parseDouble(sc.next()));
        Green.GreenPieceIV24.setLayoutX(Double.parseDouble(sc.next()));
        Green.GreenPieceIV24.setLayoutY(Double.parseDouble(sc.next()));
        Green.GreenPieceIV34.setLayoutX(Double.parseDouble(sc.next()));
        Green.GreenPieceIV34.setLayoutY(Double.parseDouble(sc.next()));
        Green.GreenPieceIV123.setLayoutX(Double.parseDouble(sc.next()));
        Green.GreenPieceIV123.setLayoutY(Double.parseDouble(sc.next()));
        Green.GreenPieceIV124.setLayoutX(Double.parseDouble(sc.next()));
        Green.GreenPieceIV124.setLayoutY(Double.parseDouble(sc.next()));
        Green.GreenPieceIV134.setLayoutX(Double.parseDouble(sc.next()));
        Green.GreenPieceIV134.setLayoutY(Double.parseDouble(sc.next()));
        Green.GreenPieceIV234.setLayoutX(Double.parseDouble(sc.next()));
        Green.GreenPieceIV234.setLayoutY(Double.parseDouble(sc.next()));
        Green.GreenPieceIV1234.setLayoutX(Double.parseDouble(sc.next()));
        Green.GreenPieceIV1234.setLayoutY(Double.parseDouble(sc.next()));
        Blue.BluePiece1L = Integer.parseInt(sc.next());
        Blue.BluePiece2L = Integer.parseInt(sc.next());
        Blue.BluePiece3L = Integer.parseInt(sc.next());
        Blue.BluePiece4L = Integer.parseInt(sc.next());
        Blue.BluePiece12L = Integer.parseInt(sc.next());
        Blue.BluePiece13L = Integer.parseInt(sc.next());
        Blue.BluePiece14L = Integer.parseInt(sc.next());
        Blue.BluePiece23L = Integer.parseInt(sc.next());
        Blue.BluePiece24L = Integer.parseInt(sc.next());
        Blue.BluePiece34L = Integer.parseInt(sc.next());
        Blue.BluePiece123L = Integer.parseInt(sc.next());
        Blue.BluePiece124L = Integer.parseInt(sc.next());
        Blue.BluePiece134L = Integer.parseInt(sc.next());
        Blue.BluePiece234L = Integer.parseInt(sc.next());
        Blue.BluePiece1234L = Integer.parseInt(sc.next());
        Blue.BluePieceIV1.setLayoutX(Double.parseDouble(sc.next()));
        Blue.BluePieceIV1.setLayoutY(Double.parseDouble(sc.next()));
        Blue.BluePieceIV2.setLayoutX(Double.parseDouble(sc.next()));
        Blue.BluePieceIV2.setLayoutY(Double.parseDouble(sc.next()));
        Blue.BluePieceIV3.setLayoutX(Double.parseDouble(sc.next()));
        Blue.BluePieceIV3.setLayoutY(Double.parseDouble(sc.next()));
        Blue.BluePieceIV4.setLayoutX(Double.parseDouble(sc.next()));
        Blue.BluePieceIV4.setLayoutY(Double.parseDouble(sc.next()));
        Blue.BluePieceIV12.setLayoutX(Double.parseDouble(sc.next()));
        Blue.BluePieceIV12.setLayoutY(Double.parseDouble(sc.next()));
        Blue.BluePieceIV13.setLayoutX(Double.parseDouble(sc.next()));
        Blue.BluePieceIV13.setLayoutY(Double.parseDouble(sc.next()));
        Blue.BluePieceIV14.setLayoutX(Double.parseDouble(sc.next()));
        Blue.BluePieceIV14.setLayoutY(Double.parseDouble(sc.next()));
        Blue.BluePieceIV23.setLayoutX(Double.parseDouble(sc.next()));
        Blue.BluePieceIV23.setLayoutY(Double.parseDouble(sc.next()));
        Blue.BluePieceIV24.setLayoutX(Double.parseDouble(sc.next()));
        Blue.BluePieceIV24.setLayoutY(Double.parseDouble(sc.next()));
        Blue.BluePieceIV34.setLayoutX(Double.parseDouble(sc.next()));
        Blue.BluePieceIV34.setLayoutY(Double.parseDouble(sc.next()));
        Blue.BluePieceIV123.setLayoutX(Double.parseDouble(sc.next()));
        Blue.BluePieceIV123.setLayoutY(Double.parseDouble(sc.next()));
        Blue.BluePieceIV124.setLayoutX(Double.parseDouble(sc.next()));
        Blue.BluePieceIV124.setLayoutY(Double.parseDouble(sc.next()));
        Blue.BluePieceIV134.setLayoutX(Double.parseDouble(sc.next()));
        Blue.BluePieceIV134.setLayoutY(Double.parseDouble(sc.next()));
        Blue.BluePieceIV234.setLayoutX(Double.parseDouble(sc.next()));
        Blue.BluePieceIV234.setLayoutY(Double.parseDouble(sc.next()));
        Blue.BluePieceIV1234.setLayoutX(Double.parseDouble(sc.next()));
        Blue.BluePieceIV1234.setLayoutY(Double.parseDouble(sc.next()));
        Yellow.WinIV1.setLayoutX(Double.parseDouble(sc.next()));
        Yellow.WinIV1.setLayoutY(Double.parseDouble(sc.next()));
        Yellow.WinIV2.setLayoutX(Double.parseDouble(sc.next()));
        Yellow.WinIV2.setLayoutY(Double.parseDouble(sc.next()));
        Yellow.WinIV3.setLayoutX(Double.parseDouble(sc.next()));
        Yellow.WinIV3.setLayoutY(Double.parseDouble(sc.next()));
        Yellow.WinIV4.setLayoutX(Double.parseDouble(sc.next()));
        Yellow.WinIV4.setLayoutY(Double.parseDouble(sc.next()));
        Red.WinIV1.setLayoutX(Double.parseDouble(sc.next()));
        Red.WinIV1.setLayoutY(Double.parseDouble(sc.next()));
        Red.WinIV2.setLayoutX(Double.parseDouble(sc.next()));
        Red.WinIV2.setLayoutY(Double.parseDouble(sc.next()));
        Red.WinIV3.setLayoutX(Double.parseDouble(sc.next()));
        Red.WinIV3.setLayoutY(Double.parseDouble(sc.next()));
        Red.WinIV4.setLayoutX(Double.parseDouble(sc.next()));
        Red.WinIV4.setLayoutY(Double.parseDouble(sc.next()));
        Green.WinIV1.setLayoutX(Double.parseDouble(sc.next()));
        Green.WinIV1.setLayoutY(Double.parseDouble(sc.next()));
        Green.WinIV2.setLayoutX(Double.parseDouble(sc.next()));
        Green.WinIV2.setLayoutY(Double.parseDouble(sc.next()));
        Green.WinIV3.setLayoutX(Double.parseDouble(sc.next()));
        Green.WinIV3.setLayoutY(Double.parseDouble(sc.next()));
        Green.WinIV4.setLayoutX(Double.parseDouble(sc.next()));
        Green.WinIV4.setLayoutY(Double.parseDouble(sc.next()));
        Blue.WinIV1.setLayoutX(Double.parseDouble(sc.next()));
        Blue.WinIV1.setLayoutY(Double.parseDouble(sc.next()));
        Blue.WinIV2.setLayoutX(Double.parseDouble(sc.next()));
        Blue.WinIV2.setLayoutY(Double.parseDouble(sc.next()));
        Blue.WinIV3.setLayoutX(Double.parseDouble(sc.next()));
        Blue.WinIV3.setLayoutY(Double.parseDouble(sc.next()));
        Blue.WinIV4.setLayoutX(Double.parseDouble(sc.next()));
        Blue.WinIV4.setLayoutY(Double.parseDouble(sc.next()));
        Yellow.YellowPieceIV1.setVisible(Boolean.parseBoolean(sc.next()));
        Yellow.YellowPieceIV2.setVisible(Boolean.parseBoolean(sc.next()));
        Yellow.YellowPieceIV3.setVisible(Boolean.parseBoolean(sc.next()));
        Yellow.YellowPieceIV4.setVisible(Boolean.parseBoolean(sc.next()));
        Yellow.YellowPieceIV12.setVisible(Boolean.parseBoolean(sc.next()));
        Yellow.YellowPieceIV13.setVisible(Boolean.parseBoolean(sc.next()));
        Yellow.YellowPieceIV14.setVisible(Boolean.parseBoolean(sc.next()));
        Yellow.YellowPieceIV23.setVisible(Boolean.parseBoolean(sc.next()));
        Yellow.YellowPieceIV24.setVisible(Boolean.parseBoolean(sc.next()));
        Yellow.YellowPieceIV34.setVisible(Boolean.parseBoolean(sc.next()));
        Yellow.YellowPieceIV123.setVisible(Boolean.parseBoolean(sc.next()));
        Yellow.YellowPieceIV124.setVisible(Boolean.parseBoolean(sc.next()));
        Yellow.YellowPieceIV134.setVisible(Boolean.parseBoolean(sc.next()));
        Yellow.YellowPieceIV234.setVisible(Boolean.parseBoolean(sc.next()));
        Yellow.YellowPieceIV1234.setVisible(Boolean.parseBoolean(sc.next()));
        Red.RedPieceIV1.setVisible(Boolean.parseBoolean(sc.next()));
        Red.RedPieceIV2.setVisible(Boolean.parseBoolean(sc.next()));
        Red.RedPieceIV3.setVisible(Boolean.parseBoolean(sc.next()));
        Red.RedPieceIV4.setVisible(Boolean.parseBoolean(sc.next()));
        Red.RedPieceIV12.setVisible(Boolean.parseBoolean(sc.next()));
        Red.RedPieceIV13.setVisible(Boolean.parseBoolean(sc.next()));
        Red.RedPieceIV14.setVisible(Boolean.parseBoolean(sc.next()));
        Red.RedPieceIV23.setVisible(Boolean.parseBoolean(sc.next()));
        Red.RedPieceIV24.setVisible(Boolean.parseBoolean(sc.next()));
        Red.RedPieceIV34.setVisible(Boolean.parseBoolean(sc.next()));
        Red.RedPieceIV123.setVisible(Boolean.parseBoolean(sc.next()));
        Red.RedPieceIV124.setVisible(Boolean.parseBoolean(sc.next()));
        Red.RedPieceIV134.setVisible(Boolean.parseBoolean(sc.next()));
        Red.RedPieceIV234.setVisible(Boolean.parseBoolean(sc.next()));
        Red.RedPieceIV1234.setVisible(Boolean.parseBoolean(sc.next()));
        Green.GreenPieceIV1.setVisible(Boolean.parseBoolean(sc.next()));
        Green.GreenPieceIV2.setVisible(Boolean.parseBoolean(sc.next()));
        Green.GreenPieceIV3.setVisible(Boolean.parseBoolean(sc.next()));
        Green.GreenPieceIV4.setVisible(Boolean.parseBoolean(sc.next()));
        Green.GreenPieceIV12.setVisible(Boolean.parseBoolean(sc.next()));
        Green.GreenPieceIV13.setVisible(Boolean.parseBoolean(sc.next()));
        Green.GreenPieceIV14.setVisible(Boolean.parseBoolean(sc.next()));
        Green.GreenPieceIV23.setVisible(Boolean.parseBoolean(sc.next()));
        Green.GreenPieceIV24.setVisible(Boolean.parseBoolean(sc.next()));
        Green.GreenPieceIV34.setVisible(Boolean.parseBoolean(sc.next()));
        Green.GreenPieceIV123.setVisible(Boolean.parseBoolean(sc.next()));
        Green.GreenPieceIV124.setVisible(Boolean.parseBoolean(sc.next()));
        Green.GreenPieceIV134.setVisible(Boolean.parseBoolean(sc.next()));
        Green.GreenPieceIV234.setVisible(Boolean.parseBoolean(sc.next()));
        Green.GreenPieceIV1234.setVisible(Boolean.parseBoolean(sc.next()));
        Blue.BluePieceIV1.setVisible(Boolean.parseBoolean(sc.next()));
        Blue.BluePieceIV2.setVisible(Boolean.parseBoolean(sc.next()));
        Blue.BluePieceIV3.setVisible(Boolean.parseBoolean(sc.next()));
        Blue.BluePieceIV4.setVisible(Boolean.parseBoolean(sc.next()));
        Blue.BluePieceIV12.setVisible(Boolean.parseBoolean(sc.next()));
        Blue.BluePieceIV13.setVisible(Boolean.parseBoolean(sc.next()));
        Blue.BluePieceIV14.setVisible(Boolean.parseBoolean(sc.next()));
        Blue.BluePieceIV23.setVisible(Boolean.parseBoolean(sc.next()));
        Blue.BluePieceIV24.setVisible(Boolean.parseBoolean(sc.next()));
        Blue.BluePieceIV34.setVisible(Boolean.parseBoolean(sc.next()));
        Blue.BluePieceIV123.setVisible(Boolean.parseBoolean(sc.next()));
        Blue.BluePieceIV124.setVisible(Boolean.parseBoolean(sc.next()));
        Blue.BluePieceIV134.setVisible(Boolean.parseBoolean(sc.next()));
        Blue.BluePieceIV234.setVisible(Boolean.parseBoolean(sc.next()));
        Blue.BluePieceIV1234.setVisible(Boolean.parseBoolean(sc.next()));
        Yellow.WinIV1.setVisible(Boolean.parseBoolean(sc.next()));
        Yellow.WinIV2.setVisible(Boolean.parseBoolean(sc.next()));
        Yellow.WinIV3.setVisible(Boolean.parseBoolean(sc.next()));
        Yellow.WinIV4.setVisible(Boolean.parseBoolean(sc.next()));
        Red.WinIV1.setVisible(Boolean.parseBoolean(sc.next()));
        Red.WinIV2.setVisible(Boolean.parseBoolean(sc.next()));
        Red.WinIV3.setVisible(Boolean.parseBoolean(sc.next()));
        Red.WinIV4.setVisible(Boolean.parseBoolean(sc.next()));
        Green.WinIV1.setVisible(Boolean.parseBoolean(sc.next()));
        Green.WinIV2.setVisible(Boolean.parseBoolean(sc.next()));
        Green.WinIV3.setVisible(Boolean.parseBoolean(sc.next()));
        Green.WinIV4.setVisible(Boolean.parseBoolean(sc.next()));
        Blue.WinIV1.setVisible(Boolean.parseBoolean(sc.next()));
        Blue.WinIV2.setVisible(Boolean.parseBoolean(sc.next()));
        Blue.WinIV3.setVisible(Boolean.parseBoolean(sc.next()));
        Blue.WinIV4.setVisible(Boolean.parseBoolean(sc.next()));
        Yellow.YellowPieceIV12.setFitHeight(30);
        Yellow.YellowPieceIV12.setFitWidth(30);
        Yellow.YellowPieceIV13.setFitHeight(30);
        Yellow.YellowPieceIV13.setFitWidth(30);
        Yellow.YellowPieceIV14.setFitHeight(30);
        Yellow.YellowPieceIV14.setFitWidth(30);
        Yellow.YellowPieceIV23.setFitHeight(30);
        Yellow.YellowPieceIV23.setFitWidth(30);
        Yellow.YellowPieceIV24.setFitHeight(30);
        Yellow.YellowPieceIV24.setFitWidth(30);
        Yellow.YellowPieceIV34.setFitHeight(30);
        Yellow.YellowPieceIV34.setFitWidth(30);
        Yellow.YellowPieceIV123.setFitHeight(30);
        Yellow.YellowPieceIV123.setFitWidth(30);
        Yellow.YellowPieceIV124.setFitHeight(30);
        Yellow.YellowPieceIV124.setFitWidth(30);
        Yellow.YellowPieceIV134.setFitHeight(30);
        Yellow.YellowPieceIV134.setFitWidth(30);
        Yellow.YellowPieceIV234.setFitHeight(30);
        Yellow.YellowPieceIV234.setFitWidth(30);
        Yellow.YellowPieceIV1234.setFitHeight(30);
        Yellow.YellowPieceIV1234.setFitWidth(30);
        Red.RedPieceIV12.setFitHeight(30);
        Red.RedPieceIV12.setFitWidth(30);
        Red.RedPieceIV13.setFitHeight(30);
        Red.RedPieceIV13.setFitWidth(30);
        Red.RedPieceIV14.setFitHeight(30);
        Red.RedPieceIV14.setFitWidth(30);
        Red.RedPieceIV23.setFitHeight(30);
        Red.RedPieceIV23.setFitWidth(30);
        Red.RedPieceIV24.setFitHeight(30);
        Red.RedPieceIV24.setFitWidth(30);
        Red.RedPieceIV34.setFitHeight(30);
        Red.RedPieceIV34.setFitWidth(30);
        Red.RedPieceIV123.setFitHeight(30);
        Red.RedPieceIV123.setFitWidth(30);
        Red.RedPieceIV124.setFitHeight(30);
        Red.RedPieceIV124.setFitWidth(30);
        Red.RedPieceIV134.setFitHeight(30);
        Red.RedPieceIV134.setFitWidth(30);
        Red.RedPieceIV234.setFitHeight(30);
        Red.RedPieceIV234.setFitWidth(30);
        Red.RedPieceIV1234.setFitHeight(30);
        Red.RedPieceIV1234.setFitWidth(30);
        Green.GreenPieceIV12.setFitHeight(30);
        Green.GreenPieceIV12.setFitWidth(30);
        Green.GreenPieceIV13.setFitHeight(30);
        Green.GreenPieceIV13.setFitWidth(30);
        Green.GreenPieceIV14.setFitHeight(30);
        Green.GreenPieceIV14.setFitWidth(30);
        Green.GreenPieceIV23.setFitHeight(30);
        Green.GreenPieceIV23.setFitWidth(30);
        Green.GreenPieceIV24.setFitHeight(30);
        Green.GreenPieceIV24.setFitWidth(30);
        Green.GreenPieceIV34.setFitHeight(30);
        Green.GreenPieceIV34.setFitWidth(30);
        Green.GreenPieceIV123.setFitHeight(30);
        Green.GreenPieceIV123.setFitWidth(30);
        Green.GreenPieceIV124.setFitHeight(30);
        Green.GreenPieceIV124.setFitWidth(30);
        Green.GreenPieceIV134.setFitHeight(30);
        Green.GreenPieceIV134.setFitWidth(30);
        Green.GreenPieceIV234.setFitHeight(30);
        Green.GreenPieceIV234.setFitWidth(30);
        Green.GreenPieceIV1234.setFitHeight(30);
        Green.GreenPieceIV1234.setFitWidth(30);
        Blue.BluePieceIV12.setFitHeight(30);
        Blue.BluePieceIV12.setFitWidth(30);
        Blue.BluePieceIV13.setFitHeight(30);
        Blue.BluePieceIV13.setFitWidth(30);
        Blue.BluePieceIV14.setFitHeight(30);
        Blue.BluePieceIV14.setFitWidth(30);
        Blue.BluePieceIV23.setFitHeight(30);
        Blue.BluePieceIV23.setFitWidth(30);
        Blue.BluePieceIV24.setFitHeight(30);
        Blue.BluePieceIV24.setFitWidth(30);
        Blue.BluePieceIV34.setFitHeight(30);
        Blue.BluePieceIV34.setFitWidth(30);
        Blue.BluePieceIV123.setFitHeight(30);
        Blue.BluePieceIV123.setFitWidth(30);
        Blue.BluePieceIV124.setFitHeight(30);
        Blue.BluePieceIV124.setFitWidth(30);
        Blue.BluePieceIV134.setFitHeight(30);
        Blue.BluePieceIV134.setFitWidth(30);
        Blue.BluePieceIV234.setFitHeight(30);
        Blue.BluePieceIV234.setFitWidth(30);
        Blue.BluePieceIV1234.setFitHeight(30);
        Blue.BluePieceIV1234.setFitWidth(30);
        Yellow.WinIV1.setRotate(-15);
        Yellow.WinIV1.setFitWidth(51);
        Yellow.WinIV1.setFitHeight(41);
        Yellow.WinIV2.setRotate(-15);
        Yellow.WinIV2.setFitWidth(51);
        Yellow.WinIV2.setFitHeight(41);
        Yellow.WinIV3.setRotate(-15);
        Yellow.WinIV3.setFitWidth(51);
        Yellow.WinIV3.setFitHeight(41);
        Yellow.WinIV4.setRotate(-15);
        Yellow.WinIV4.setFitWidth(51);
        Yellow.WinIV4.setFitHeight(41);
        Red.WinIV1.setRotate(-15);
        Red.WinIV1.setFitWidth(51);
        Red.WinIV1.setFitHeight(41);
        Red.WinIV2.setRotate(-15);
        Red.WinIV2.setFitWidth(51);
        Red.WinIV2.setFitHeight(41);
        Red.WinIV3.setRotate(-15);
        Red.WinIV3.setFitWidth(51);
        Red.WinIV3.setFitHeight(41);
        Red.WinIV4.setRotate(-15);
        Red.WinIV4.setFitWidth(51);
        Red.WinIV4.setFitHeight(41);
        Green.WinIV1.setRotate(-15);
        Green.WinIV1.setFitWidth(51);
        Green.WinIV1.setFitHeight(41);
        Green.WinIV2.setRotate(-15);
        Green.WinIV2.setFitWidth(51);
        Green.WinIV2.setFitHeight(41);
        Green.WinIV3.setRotate(-15);
        Green.WinIV3.setFitWidth(51);
        Green.WinIV3.setFitHeight(41);
        Green.WinIV4.setRotate(-15);
        Green.WinIV4.setFitWidth(51);
        Green.WinIV4.setFitHeight(41);
        Blue.WinIV1.setRotate(-15);
        Blue.WinIV1.setFitWidth(51);
        Blue.WinIV1.setFitHeight(41);
        Blue.WinIV2.setRotate(-15);
        Blue.WinIV2.setFitWidth(51);
        Blue.WinIV2.setFitHeight(41);
        Blue.WinIV3.setRotate(-15);
        Blue.WinIV3.setFitWidth(51);
        Blue.WinIV3.setFitHeight(41);
        Blue.WinIV4.setRotate(-15);
        Blue.WinIV4.setFitWidth(51);
        Blue.WinIV4.setFitHeight(41);
        dice.PlayerCount = 0;
        ioio.i = 0;
    }

}
