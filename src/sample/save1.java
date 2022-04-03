package sample;
import com.sun.deploy.xml.XMLable;
import javafx.application.Application;
import javafx.scene.layout.*;
import javafx.stage.Modality;
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

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.File;
import java.util.Scanner;

public class save1 {
    public void display(String title , String message) throws Exception{
        Stage window = new Stage();
        window.setTitle(title);
        //modality要使用Modality.APPLICATION_MODEL
        window.initModality(Modality.APPLICATION_MODAL);
        window.setMinWidth(300);
        window.setMinHeight(150);
        HBox hBox = new HBox(16);
        hBox.setAlignment(Pos.CENTER);
        Button button = new Button("Yes");
        Button button1 = new Button("No");

        button1.setOnAction(e -> System.exit(1));
        Label label = new Label(message);
        hBox.getChildren().addAll(button,button1);
        VBox layout = new VBox(10);
        Image Save = new Image("SaveAlert.jpg");
        ImageView SaveIV = new ImageView(Save);
        SaveIV.setFitWidth(300);
        SaveIV.setFitHeight(150);
        layout.getChildren().add(SaveIV);
        layout.getChildren().addAll(label , hBox);
        layout.setAlignment(Pos.CENTER);

        button.setOnAction(event -> {
            File file = new File("C:\\Codes\\practise\\src\\sample\\File\\File1.txt");
            try (PrintWriter output = new PrintWriter(file)){
                output.print(Yellow.YellowPiece1L + " " + Yellow.YellowPiece2L + " " + Yellow.YellowPiece3L + " " + Yellow.YellowPiece4L+
                        " " + Yellow.YellowPiece12L + " "+ Yellow.YellowPiece13L + " " + Yellow.YellowPiece14L + " " + Yellow.YellowPiece23L + " "
                        + Yellow.YellowPiece24L + " " + Yellow.YellowPiece34L + " " + Yellow.YellowPiece123L + " " + Yellow.YellowPiece124L + " "
                        + Yellow.YellowPiece134L + " " + Yellow.YellowPiece234L + " " + Yellow.YellowPiece1234L + " ");
                output.print(Yellow.YellowPieceIV1.getLayoutX() + " " +Yellow.YellowPieceIV1.getLayoutY()+ " "+ Yellow.YellowPieceIV2.getLayoutX() + " " +  Yellow.YellowPieceIV2.getLayoutY() + " "
                        +  Yellow.YellowPieceIV3.getLayoutX() + " " +Yellow.YellowPieceIV3.getLayoutY() + " " +Yellow.YellowPieceIV4.getLayoutX() + " " + Yellow.YellowPieceIV4.getLayoutY() + " " +
                        Yellow.YellowPieceIV12.getLayoutX() + " " + Yellow.YellowPieceIV12.getLayoutY() + " " + Yellow.YellowPieceIV13.getLayoutX() + " " + Yellow.YellowPieceIV13.getLayoutY() + " " +
                        Yellow.YellowPieceIV14.getLayoutX() + " " + Yellow.YellowPieceIV14.getLayoutY() + " " + Yellow.YellowPieceIV23.getLayoutX() + " " +Yellow.YellowPieceIV23.getLayoutY() + " " +
                        Yellow.YellowPieceIV24.getLayoutX() + " " +Yellow.YellowPieceIV24.getLayoutY() + " " + Yellow.YellowPieceIV34.getLayoutX() + " " + Yellow.YellowPieceIV34.getLayoutY() + " " +
                        Yellow.YellowPieceIV123.getLayoutX() + " " +Yellow.YellowPieceIV123.getLayoutY() + " " +Yellow.YellowPieceIV124.getLayoutX() + " " + Yellow.YellowPieceIV124.getLayoutY() + " " +
                        Yellow.YellowPieceIV134.getLayoutX() + " " +Yellow.YellowPieceIV134.getLayoutY() + " " +Yellow.YellowPieceIV234.getLayoutX() + " " +Yellow.YellowPieceIV234.getLayoutY() + " " +
                        Yellow.YellowPieceIV1234.getLayoutX() + " " +Yellow.YellowPieceIV1234.getLayoutY()+ " " );
                output.print(Red.RedPiece1L + " " + Red.RedPiece2L + " " + Red.RedPiece3L + " " + Red.RedPiece4L+
                        " " + Red.RedPiece12L + " "+ Red.RedPiece13L + " " + Red.RedPiece14L + " " + Red.RedPiece23L + " "
                        + Red.RedPiece24L + " " + Red.RedPiece34L + " " + Red.RedPiece123L + " " + Red.RedPiece124L + " "
                        + Red.RedPiece134L + " " + Red.RedPiece234L + " " + Red.RedPiece1234L + " ");
                output.print(Red.RedPieceIV1.getLayoutX() + " " +Red.RedPieceIV1.getLayoutY()+ " "+ Red.RedPieceIV2.getLayoutX() + " " +  Red.RedPieceIV2.getLayoutY() + " "
                        +  Red.RedPieceIV3.getLayoutX() + " " +Red.RedPieceIV3.getLayoutY() + " " +Red.RedPieceIV4.getLayoutX() + " " + Red.RedPieceIV4.getLayoutY() + " " +
                        Red.RedPieceIV12.getLayoutX() + " " + Red.RedPieceIV12.getLayoutY() + " " + Red.RedPieceIV13.getLayoutX() + " " + Red.RedPieceIV13.getLayoutY() + " " +
                        Red.RedPieceIV14.getLayoutX() + " " + Red.RedPieceIV14.getLayoutY() + " " + Red.RedPieceIV23.getLayoutX() + " " +Red.RedPieceIV23.getLayoutY() + " " +
                        Red.RedPieceIV24.getLayoutX() + " " +Red.RedPieceIV24.getLayoutY() + " " + Red.RedPieceIV34.getLayoutX() + " " + Red.RedPieceIV34.getLayoutY() + " " +
                        Red.RedPieceIV123.getLayoutX() + " " +Red.RedPieceIV123.getLayoutY() + " " +Red.RedPieceIV124.getLayoutX() + " " + Red.RedPieceIV124.getLayoutY() + " " +
                        Red.RedPieceIV134.getLayoutX() + " " +Red.RedPieceIV134.getLayoutY() + " " +Red.RedPieceIV234.getLayoutX() + " " +Red.RedPieceIV234.getLayoutY() + " " +
                        Red.RedPieceIV1234.getLayoutX() + " " +Red.RedPieceIV1234.getLayoutY() + " " );
                output.print(Green.GreenPiece1L + " " + Green.GreenPiece2L + " " + Green.GreenPiece3L + " " + Green.GreenPiece4L+
                        " " + Green.GreenPiece12L + " "+ Green.GreenPiece13L + " " + Green.GreenPiece14L + " " + Green.GreenPiece23L + " "
                        + Green.GreenPiece24L + " " + Green.GreenPiece34L + " " + Green.GreenPiece123L + " " + Green.GreenPiece124L + " "
                        + Green.GreenPiece134L + " " + Green.GreenPiece234L + " " + Green.GreenPiece1234L + " ");
                output.print(Green.GreenPieceIV1.getLayoutX() + " " +Green.GreenPieceIV1.getLayoutY()+ " "+ Green.GreenPieceIV2.getLayoutX() + " " +  Green.GreenPieceIV2.getLayoutY() + " "
                        +  Green.GreenPieceIV3.getLayoutX() + " " +Green.GreenPieceIV3.getLayoutY() + " " +Green.GreenPieceIV4.getLayoutX() + " " + Green.GreenPieceIV4.getLayoutY() + " " +
                        Green.GreenPieceIV12.getLayoutX() + " " + Green.GreenPieceIV12.getLayoutY() + " " + Green.GreenPieceIV13.getLayoutX() + " " + Green.GreenPieceIV13.getLayoutY() + " " +
                        Green.GreenPieceIV14.getLayoutX() + " " + Green.GreenPieceIV14.getLayoutY() + " " + Green.GreenPieceIV23.getLayoutX() + " " +Green.GreenPieceIV23.getLayoutY() + " " +
                        Green.GreenPieceIV24.getLayoutX() + " " +Green.GreenPieceIV24.getLayoutY() + " " + Green.GreenPieceIV34.getLayoutX() + " " + Green.GreenPieceIV34.getLayoutY() + " " +
                        Green.GreenPieceIV123.getLayoutX() + " " +Green.GreenPieceIV123.getLayoutY() + " " +Green.GreenPieceIV124.getLayoutX() + " " + Green.GreenPieceIV124.getLayoutY() + " " +
                        Green.GreenPieceIV134.getLayoutX() + " " +Green.GreenPieceIV134.getLayoutY() + " " +Green.GreenPieceIV234.getLayoutX() + " " +Green.GreenPieceIV234.getLayoutY() + " " +
                        Green.GreenPieceIV1234.getLayoutX() + " " +Green.GreenPieceIV1234.getLayoutY() + " " );
                output.print(Blue.BluePiece1L + " " + Blue.BluePiece2L + " " + Blue.BluePiece3L + " " + Blue.BluePiece4L+
                        " " + Blue.BluePiece12L + " "+ Blue.BluePiece13L + " " + Blue.BluePiece14L + " " + Blue.BluePiece23L + " "
                        + Blue.BluePiece24L + " " + Blue.BluePiece34L + " " + Blue.BluePiece123L + " " + Blue.BluePiece124L + " "
                        + Blue.BluePiece134L + " " + Blue.BluePiece234L + " " + Blue.BluePiece1234L + " ");
                output.print(Blue.BluePieceIV1.getLayoutX() + " " +Blue.BluePieceIV1.getLayoutY()+ " "+ Blue.BluePieceIV2.getLayoutX() + " " +  Blue.BluePieceIV2.getLayoutY() + " "
                        +  Blue.BluePieceIV3.getLayoutX() + " " +Blue.BluePieceIV3.getLayoutY() + " " +Blue.BluePieceIV4.getLayoutX() + " " + Blue.BluePieceIV4.getLayoutY() + " " +
                        Blue.BluePieceIV12.getLayoutX() + " " + Blue.BluePieceIV12.getLayoutY() + " " + Blue.BluePieceIV13.getLayoutX() + " " + Blue.BluePieceIV13.getLayoutY() + " " +
                        Blue.BluePieceIV14.getLayoutX() + " " + Blue.BluePieceIV14.getLayoutY() + " " + Blue.BluePieceIV23.getLayoutX() + " " +Blue.BluePieceIV23.getLayoutY() + " " +
                        Blue.BluePieceIV24.getLayoutX() + " " +Blue.BluePieceIV24.getLayoutY() + " " + Blue.BluePieceIV34.getLayoutX() + " " + Blue.BluePieceIV34.getLayoutY() + " " +
                        Blue.BluePieceIV123.getLayoutX() + " " +Blue.BluePieceIV123.getLayoutY() + " " +Blue.BluePieceIV124.getLayoutX() + " " + Blue.BluePieceIV124.getLayoutY() + " " +
                        Blue.BluePieceIV134.getLayoutX() + " " +Blue.BluePieceIV134.getLayoutY() + " " +Blue.BluePieceIV234.getLayoutX() + " " +Blue.BluePieceIV234.getLayoutY() + " " +
                        Blue.BluePieceIV1234.getLayoutX() + " " +Blue.BluePieceIV1234.getLayoutY() +" " );
                output.print(Yellow.WinIV1.getLayoutX() + " " + Yellow.WinIV1.getLayoutY() +" " + Yellow.WinIV2.getLayoutX() + " " + Yellow.WinIV2.getLayoutY() +" "
                        + Yellow.WinIV3.getLayoutX() + " " + Yellow.WinIV3.getLayoutY() +" " + Yellow.WinIV4.getLayoutX() + " " + Yellow.WinIV4.getLayoutY() +" ");
                output.print(Red.WinIV1.getLayoutX() + " " + Red.WinIV1.getLayoutY() +" " + Red.WinIV2.getLayoutX() + " " + Red.WinIV2.getLayoutY() +" "
                        + Red.WinIV3.getLayoutX() + " " + Red.WinIV3.getLayoutY() +" " + Red.WinIV4.getLayoutX() + " " + Red.WinIV4.getLayoutY() +" ");
                output.print(Green.WinIV1.getLayoutX() + " " + Green.WinIV1.getLayoutY() +" " + Green.WinIV2.getLayoutX() + " " + Green.WinIV2.getLayoutY() +" "
                        + Green.WinIV3.getLayoutX() + " " + Green.WinIV3.getLayoutY() +" " + Green.WinIV4.getLayoutX() + " " + Green.WinIV4.getLayoutY() +" ");
                output.print(Blue.WinIV1.getLayoutX() + " " + Blue.WinIV1.getLayoutY() +" " + Blue.WinIV2.getLayoutX() + " " + Blue.WinIV2.getLayoutY() +" "
                        + Blue.WinIV3.getLayoutX() + " " + Blue.WinIV3.getLayoutY() +" " + Blue.WinIV4.getLayoutX() + " " + Blue.WinIV4.getLayoutY() +" ");
                output.print(Yellow.YellowPieceIV1.isVisible() + " " +Yellow.YellowPieceIV2.isVisible() + " "+Yellow.YellowPieceIV3.isVisible() + " "+Yellow.YellowPieceIV4.isVisible() + " "
                        +Yellow.YellowPieceIV12.isVisible() + " "+Yellow.YellowPieceIV13.isVisible() + " "+Yellow.YellowPieceIV14.isVisible() + " "+Yellow.YellowPieceIV23.isVisible() + " "
                        +Yellow.YellowPieceIV24.isVisible() + " "+Yellow.YellowPieceIV34.isVisible() + " "+Yellow.YellowPieceIV123.isVisible() + " "+Yellow.YellowPieceIV124.isVisible() + " "
                        +Yellow.YellowPieceIV134.isVisible() + " "+Yellow.YellowPieceIV234.isVisible() + " "+Yellow.YellowPieceIV1234.isVisible() + " ");
                output.print(Red.RedPieceIV1.isVisible() + " " +Red.RedPieceIV2.isVisible() + " "+Red.RedPieceIV3.isVisible() + " "+Red.RedPieceIV4.isVisible() + " "
                        +Red.RedPieceIV12.isVisible() + " "+Red.RedPieceIV13.isVisible() + " "+Red.RedPieceIV14.isVisible() + " "+Red.RedPieceIV23.isVisible() + " "
                        +Red.RedPieceIV24.isVisible() + " "+Red.RedPieceIV34.isVisible() + " "+Red.RedPieceIV123.isVisible() + " "+Red.RedPieceIV124.isVisible() + " "
                        +Red.RedPieceIV134.isVisible() + " "+Red.RedPieceIV234.isVisible() + " "+Red.RedPieceIV1234.isVisible() + " ");
                output.print(Green.GreenPieceIV1.isVisible() + " " +Green.GreenPieceIV2.isVisible() + " "+Green.GreenPieceIV3.isVisible() + " "+Green.GreenPieceIV4.isVisible() + " "
                        +Green.GreenPieceIV12.isVisible() + " "+Green.GreenPieceIV13.isVisible() + " "+Green.GreenPieceIV14.isVisible() + " "+Green.GreenPieceIV23.isVisible() + " "
                        +Green.GreenPieceIV24.isVisible() + " "+Green.GreenPieceIV34.isVisible() + " "+Green.GreenPieceIV123.isVisible() + " "+Green.GreenPieceIV124.isVisible() + " "
                        +Green.GreenPieceIV134.isVisible() + " "+Green.GreenPieceIV234.isVisible() + " "+Green.GreenPieceIV1234.isVisible() + " ");
                output.print(Blue.BluePieceIV1.isVisible() + " " +Blue.BluePieceIV2.isVisible() + " "+Blue.BluePieceIV3.isVisible() + " "+Blue.BluePieceIV4.isVisible() + " "
                        +Blue.BluePieceIV12.isVisible() + " "+Blue.BluePieceIV13.isVisible() + " "+Blue.BluePieceIV14.isVisible() + " "+Blue.BluePieceIV23.isVisible() + " "
                        +Blue.BluePieceIV24.isVisible() + " "+Blue.BluePieceIV34.isVisible() + " "+Blue.BluePieceIV123.isVisible() + " "+Blue.BluePieceIV124.isVisible() + " "
                        +Blue.BluePieceIV134.isVisible() + " "+Blue.BluePieceIV234.isVisible() + " "+Blue.BluePieceIV1234.isVisible() + " ");
                output.print(Yellow.WinIV1.isVisible() + " "+ Yellow.WinIV2.isVisible() + " " + Yellow.WinIV3.isVisible() + " " + Yellow.WinIV4.isVisible()+ " ");
                output.print(Red.WinIV1.isVisible() + " "+ Red.WinIV2.isVisible() + " " + Red.WinIV3.isVisible() + " " + Red.WinIV4.isVisible() + " ");
                output.print(Green.WinIV1.isVisible() + " "+ Green.WinIV2.isVisible() + " " + Green.WinIV3.isVisible() + " " + Green.WinIV4.isVisible() +" ");
                output.print(Blue.WinIV1.isVisible() + " "+ Blue.WinIV2.isVisible() + " " +Blue.WinIV3.isVisible() + " " + Blue.WinIV4.isVisible());
            } catch (Exception e) {
                e.printStackTrace();
            }
           window.close();
        });
        Scene scene = new Scene(layout);
        window.setScene(scene);
        //使用showAndWait()先处理这个窗口，而如果不处理，main中的那个窗口不能响应
        window.showAndWait();
    }
}

