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
import java.io.PrintWriter;
import java.nio.file.attribute.PosixFileAttributes;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
public class FilePane3 extends Application{
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
            try {
                File file1 = new File("C:\\Codes\\practise\\src\\sample\\File\\File1.txt");
                try (PrintWriter output = new PrintWriter(file1)) {
                    save(output);
                    System.exit(1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
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
            try {
                File file2 = new File("C:\\Codes\\practise\\src\\sample\\File\\File2.txt");
                try (PrintWriter output = new PrintWriter(file2)) {
                    save(output);
                    System.exit(1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
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
            try {
                File file3 = new File("C:\\Codes\\practise\\src\\sample\\File\\File3.txt");
                try (PrintWriter output = new PrintWriter(file3)) {
                    save(output);
                    System.exit(1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
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
            try {
                File file4 = new File("C:\\Codes\\practise\\src\\sample\\File\\File4.txt");
                try (PrintWriter output = new PrintWriter(file4)) {
                    save(output);
                    System.exit(1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
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
            try {
                File file5 = new File("C:\\Codes\\practise\\src\\sample\\File\\File5.txt");
                try (PrintWriter output = new PrintWriter(file5)) {
                    save(output);
                    System.exit(1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
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
            try {
                File file6 = new File("C:\\Codes\\practise\\src\\sample\\File\\File6.txt");
                try (PrintWriter output = new PrintWriter(file6)) {
                    save(output);
                    System.exit(1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
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
            try {
                File file7 = new File("C:\\Codes\\practise\\src\\sample\\File\\File7.txt");
                try (PrintWriter output = new PrintWriter(file7)) {
                    save(output);
                    System.exit(1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
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
    public static void save(PrintWriter output){
        output.print(Yellow.YellowPiece1L + " " + Yellow.YellowPiece2L + " " + Yellow.YellowPiece3L + " " + Yellow.YellowPiece4L +
                " " + Yellow.YellowPiece12L + " " + Yellow.YellowPiece13L + " " + Yellow.YellowPiece14L + " " + Yellow.YellowPiece23L + " "
                + Yellow.YellowPiece24L + " " + Yellow.YellowPiece34L + " " + Yellow.YellowPiece123L + " " + Yellow.YellowPiece124L + " "
                + Yellow.YellowPiece134L + " " + Yellow.YellowPiece234L + " " + Yellow.YellowPiece1234L + " ");
        output.print(Yellow.YellowPieceIV1.getLayoutX() + " " + Yellow.YellowPieceIV1.getLayoutY() + " " + Yellow.YellowPieceIV2.getLayoutX() + " " + Yellow.YellowPieceIV2.getLayoutY() + " "
                + Yellow.YellowPieceIV3.getLayoutX() + " " + Yellow.YellowPieceIV3.getLayoutY() + " " + Yellow.YellowPieceIV4.getLayoutX() + " " + Yellow.YellowPieceIV4.getLayoutY() + " " +
                Yellow.YellowPieceIV12.getLayoutX() + " " + Yellow.YellowPieceIV12.getLayoutY() + " " + Yellow.YellowPieceIV13.getLayoutX() + " " + Yellow.YellowPieceIV13.getLayoutY() + " " +
                Yellow.YellowPieceIV14.getLayoutX() + " " + Yellow.YellowPieceIV14.getLayoutY() + " " + Yellow.YellowPieceIV23.getLayoutX() + " " + Yellow.YellowPieceIV23.getLayoutY() + " " +
                Yellow.YellowPieceIV24.getLayoutX() + " " + Yellow.YellowPieceIV24.getLayoutY() + " " + Yellow.YellowPieceIV34.getLayoutX() + " " + Yellow.YellowPieceIV34.getLayoutY() + " " +
                Yellow.YellowPieceIV123.getLayoutX() + " " + Yellow.YellowPieceIV123.getLayoutY() + " " + Yellow.YellowPieceIV124.getLayoutX() + " " + Yellow.YellowPieceIV124.getLayoutY() + " " +
                Yellow.YellowPieceIV134.getLayoutX() + " " + Yellow.YellowPieceIV134.getLayoutY() + " " + Yellow.YellowPieceIV234.getLayoutX() + " " + Yellow.YellowPieceIV234.getLayoutY() + " " +
                Yellow.YellowPieceIV1234.getLayoutX() + " " + Yellow.YellowPieceIV1234.getLayoutY() + " ");
        output.print(Red.RedPiece1L + " " + Red.RedPiece2L + " " + Red.RedPiece3L + " " + Red.RedPiece4L +
                " " + Red.RedPiece12L + " " + Red.RedPiece13L + " " + Red.RedPiece14L + " " + Red.RedPiece23L + " "
                + Red.RedPiece24L + " " + Red.RedPiece34L + " " + Red.RedPiece123L + " " + Red.RedPiece124L + " "
                + Red.RedPiece134L + " " + Red.RedPiece234L + " " + Red.RedPiece1234L + " ");
        output.print(Red.RedPieceIV1.getLayoutX() + " " + Red.RedPieceIV1.getLayoutY() + " " + Red.RedPieceIV2.getLayoutX() + " " + Red.RedPieceIV2.getLayoutY() + " "
                + Red.RedPieceIV3.getLayoutX() + " " + Red.RedPieceIV3.getLayoutY() + " " + Red.RedPieceIV4.getLayoutX() + " " + Red.RedPieceIV4.getLayoutY() + " " +
                Red.RedPieceIV12.getLayoutX() + " " + Red.RedPieceIV12.getLayoutY() + " " + Red.RedPieceIV13.getLayoutX() + " " + Red.RedPieceIV13.getLayoutY() + " " +
                Red.RedPieceIV14.getLayoutX() + " " + Red.RedPieceIV14.getLayoutY() + " " + Red.RedPieceIV23.getLayoutX() + " " + Red.RedPieceIV23.getLayoutY() + " " +
                Red.RedPieceIV24.getLayoutX() + " " + Red.RedPieceIV24.getLayoutY() + " " + Red.RedPieceIV34.getLayoutX() + " " + Red.RedPieceIV34.getLayoutY() + " " +
                Red.RedPieceIV123.getLayoutX() + " " + Red.RedPieceIV123.getLayoutY() + " " + Red.RedPieceIV124.getLayoutX() + " " + Red.RedPieceIV124.getLayoutY() + " " +
                Red.RedPieceIV134.getLayoutX() + " " + Red.RedPieceIV134.getLayoutY() + " " + Red.RedPieceIV234.getLayoutX() + " " + Red.RedPieceIV234.getLayoutY() + " " +
                Red.RedPieceIV1234.getLayoutX() + " " + Red.RedPieceIV1234.getLayoutY() + " ");
        output.print(Green.GreenPiece1L + " " + Green.GreenPiece2L + " " + Green.GreenPiece3L + " " + Green.GreenPiece4L +
                " " + Green.GreenPiece12L + " " + Green.GreenPiece13L + " " + Green.GreenPiece14L + " " + Green.GreenPiece23L + " "
                + Green.GreenPiece24L + " " + Green.GreenPiece34L + " " + Green.GreenPiece123L + " " + Green.GreenPiece124L + " "
                + Green.GreenPiece134L + " " + Green.GreenPiece234L + " " + Green.GreenPiece1234L + " ");
        output.print(Green.GreenPieceIV1.getLayoutX() + " " + Green.GreenPieceIV1.getLayoutY() + " " + Green.GreenPieceIV2.getLayoutX() + " " + Green.GreenPieceIV2.getLayoutY() + " "
                + Green.GreenPieceIV3.getLayoutX() + " " + Green.GreenPieceIV3.getLayoutY() + " " + Green.GreenPieceIV4.getLayoutX() + " " + Green.GreenPieceIV4.getLayoutY() + " " +
                Green.GreenPieceIV12.getLayoutX() + " " + Green.GreenPieceIV12.getLayoutY() + " " + Green.GreenPieceIV13.getLayoutX() + " " + Green.GreenPieceIV13.getLayoutY() + " " +
                Green.GreenPieceIV14.getLayoutX() + " " + Green.GreenPieceIV14.getLayoutY() + " " + Green.GreenPieceIV23.getLayoutX() + " " + Green.GreenPieceIV23.getLayoutY() + " " +
                Green.GreenPieceIV24.getLayoutX() + " " + Green.GreenPieceIV24.getLayoutY() + " " + Green.GreenPieceIV34.getLayoutX() + " " + Green.GreenPieceIV34.getLayoutY() + " " +
                Green.GreenPieceIV123.getLayoutX() + " " + Green.GreenPieceIV123.getLayoutY() + " " + Green.GreenPieceIV124.getLayoutX() + " " + Green.GreenPieceIV124.getLayoutY() + " " +
                Green.GreenPieceIV134.getLayoutX() + " " + Green.GreenPieceIV134.getLayoutY() + " " + Green.GreenPieceIV234.getLayoutX() + " " + Green.GreenPieceIV234.getLayoutY() + " " +
                Green.GreenPieceIV1234.getLayoutX() + " " + Green.GreenPieceIV1234.getLayoutY() + " ");
        output.print(Blue.BluePiece1L + " " + Blue.BluePiece2L + " " + Blue.BluePiece3L + " " + Blue.BluePiece4L +
                " " + Blue.BluePiece12L + " " + Blue.BluePiece13L + " " + Blue.BluePiece14L + " " + Blue.BluePiece23L + " "
                + Blue.BluePiece24L + " " + Blue.BluePiece34L + " " + Blue.BluePiece123L + " " + Blue.BluePiece124L + " "
                + Blue.BluePiece134L + " " + Blue.BluePiece234L + " " + Blue.BluePiece1234L + " ");
        output.print(Blue.BluePieceIV1.getLayoutX() + " " + Blue.BluePieceIV1.getLayoutY() + " " + Blue.BluePieceIV2.getLayoutX() + " " + Blue.BluePieceIV2.getLayoutY() + " "
                + Blue.BluePieceIV3.getLayoutX() + " " + Blue.BluePieceIV3.getLayoutY() + " " + Blue.BluePieceIV4.getLayoutX() + " " + Blue.BluePieceIV4.getLayoutY() + " " +
                Blue.BluePieceIV12.getLayoutX() + " " + Blue.BluePieceIV12.getLayoutY() + " " + Blue.BluePieceIV13.getLayoutX() + " " + Blue.BluePieceIV13.getLayoutY() + " " +
                Blue.BluePieceIV14.getLayoutX() + " " + Blue.BluePieceIV14.getLayoutY() + " " + Blue.BluePieceIV23.getLayoutX() + " " + Blue.BluePieceIV23.getLayoutY() + " " +
                Blue.BluePieceIV24.getLayoutX() + " " + Blue.BluePieceIV24.getLayoutY() + " " + Blue.BluePieceIV34.getLayoutX() + " " + Blue.BluePieceIV34.getLayoutY() + " " +
                Blue.BluePieceIV123.getLayoutX() + " " + Blue.BluePieceIV123.getLayoutY() + " " + Blue.BluePieceIV124.getLayoutX() + " " + Blue.BluePieceIV124.getLayoutY() + " " +
                Blue.BluePieceIV134.getLayoutX() + " " + Blue.BluePieceIV134.getLayoutY() + " " + Blue.BluePieceIV234.getLayoutX() + " " + Blue.BluePieceIV234.getLayoutY() + " " +
                Blue.BluePieceIV1234.getLayoutX() + " " + Blue.BluePieceIV1234.getLayoutY() + " ");
        output.print(Yellow.WinIV1.getLayoutX() + " " + Yellow.WinIV1.getLayoutY() + " " + Yellow.WinIV2.getLayoutX() + " " + Yellow.WinIV2.getLayoutY() + " "
                + Yellow.WinIV3.getLayoutX() + " " + Yellow.WinIV3.getLayoutY() + " " + Yellow.WinIV4.getLayoutX() + " " + Yellow.WinIV4.getLayoutY() + " ");
        output.print(Red.WinIV1.getLayoutX() + " " + Red.WinIV1.getLayoutY() + " " + Red.WinIV2.getLayoutX() + " " + Red.WinIV2.getLayoutY() + " "
                + Red.WinIV3.getLayoutX() + " " + Red.WinIV3.getLayoutY() + " " + Red.WinIV4.getLayoutX() + " " + Red.WinIV4.getLayoutY() + " ");
        output.print(Green.WinIV1.getLayoutX() + " " + Green.WinIV1.getLayoutY() + " " + Green.WinIV2.getLayoutX() + " " + Green.WinIV2.getLayoutY() + " "
                + Green.WinIV3.getLayoutX() + " " + Green.WinIV3.getLayoutY() + " " + Green.WinIV4.getLayoutX() + " " + Green.WinIV4.getLayoutY() + " ");
        output.print(Blue.WinIV1.getLayoutX() + " " + Blue.WinIV1.getLayoutY() + " " + Blue.WinIV2.getLayoutX() + " " + Blue.WinIV2.getLayoutY() + " "
                + Blue.WinIV3.getLayoutX() + " " + Blue.WinIV3.getLayoutY() + " " + Blue.WinIV4.getLayoutX() + " " + Blue.WinIV4.getLayoutY() + " ");
        output.print(Yellow.YellowPieceIV1.isVisible() + " " + Yellow.YellowPieceIV2.isVisible() + " " + Yellow.YellowPieceIV3.isVisible() + " " + Yellow.YellowPieceIV4.isVisible() + " "
                + Yellow.YellowPieceIV12.isVisible() + " " + Yellow.YellowPieceIV13.isVisible() + " " + Yellow.YellowPieceIV14.isVisible() + " " + Yellow.YellowPieceIV23.isVisible() + " "
                + Yellow.YellowPieceIV24.isVisible() + " " + Yellow.YellowPieceIV34.isVisible() + " " + Yellow.YellowPieceIV123.isVisible() + " " + Yellow.YellowPieceIV124.isVisible() + " "
                + Yellow.YellowPieceIV134.isVisible() + " " + Yellow.YellowPieceIV234.isVisible() + " " + Yellow.YellowPieceIV1234.isVisible() + " ");
        output.print(Red.RedPieceIV1.isVisible() + " " + Red.RedPieceIV2.isVisible() + " " + Red.RedPieceIV3.isVisible() + " " + Red.RedPieceIV4.isVisible() + " "
                + Red.RedPieceIV12.isVisible() + " " + Red.RedPieceIV13.isVisible() + " " + Red.RedPieceIV14.isVisible() + " " + Red.RedPieceIV23.isVisible() + " "
                + Red.RedPieceIV24.isVisible() + " " + Red.RedPieceIV34.isVisible() + " " + Red.RedPieceIV123.isVisible() + " " + Red.RedPieceIV124.isVisible() + " "
                + Red.RedPieceIV134.isVisible() + " " + Red.RedPieceIV234.isVisible() + " " + Red.RedPieceIV1234.isVisible() + " ");
        output.print(Green.GreenPieceIV1.isVisible() + " " + Green.GreenPieceIV2.isVisible() + " " + Green.GreenPieceIV3.isVisible() + " " + Green.GreenPieceIV4.isVisible() + " "
                + Green.GreenPieceIV12.isVisible() + " " + Green.GreenPieceIV13.isVisible() + " " + Green.GreenPieceIV14.isVisible() + " " + Green.GreenPieceIV23.isVisible() + " "
                + Green.GreenPieceIV24.isVisible() + " " + Green.GreenPieceIV34.isVisible() + " " + Green.GreenPieceIV123.isVisible() + " " + Green.GreenPieceIV124.isVisible() + " "
                + Green.GreenPieceIV134.isVisible() + " " + Green.GreenPieceIV234.isVisible() + " " + Green.GreenPieceIV1234.isVisible() + " ");
        output.print(Blue.BluePieceIV1.isVisible() + " " + Blue.BluePieceIV2.isVisible() + " " + Blue.BluePieceIV3.isVisible() + " " + Blue.BluePieceIV4.isVisible() + " "
                + Blue.BluePieceIV12.isVisible() + " " + Blue.BluePieceIV13.isVisible() + " " + Blue.BluePieceIV14.isVisible() + " " + Blue.BluePieceIV23.isVisible() + " "
                + Blue.BluePieceIV24.isVisible() + " " + Blue.BluePieceIV34.isVisible() + " " + Blue.BluePieceIV123.isVisible() + " " + Blue.BluePieceIV124.isVisible() + " "
                + Blue.BluePieceIV134.isVisible() + " " + Blue.BluePieceIV234.isVisible() + " " + Blue.BluePieceIV1234.isVisible() + " ");
        output.print(Yellow.WinIV1.isVisible() + " " + Yellow.WinIV2.isVisible() + " " + Yellow.WinIV3.isVisible() + " " + Yellow.WinIV4.isVisible() + " ");
        output.print(Red.WinIV1.isVisible() + " " + Red.WinIV2.isVisible() + " " + Red.WinIV3.isVisible() + " " + Red.WinIV4.isVisible() + " ");
        output.print(Green.WinIV1.isVisible() + " " + Green.WinIV2.isVisible() + " " + Green.WinIV3.isVisible() + " " + Green.WinIV4.isVisible() + " ");
        output.print(Blue.WinIV1.isVisible() + " " + Blue.WinIV2.isVisible() + " " + Blue.WinIV3.isVisible() + " " + Blue.WinIV4.isVisible());
    }
}
