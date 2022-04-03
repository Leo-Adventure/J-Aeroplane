package sample;

import javafx.scene.control.TextArea;
import javafx.application.Application;
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
import javafx.scene.text.Font;
import javafx.scene.layout.Pane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.*;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import org.omg.CORBA.DATA_CONVERSION;

public class ep {
    static TextArea ep = new TextArea();

    public static TextArea getInitialTextArea() {
        Font font = new Font("Courier New",15);
        ep.setEditable(false);
        ep.setText("Please roll the dice!");
        ep.setFont(font);
       ep.setWrapText(true);
        ep.setPrefHeight(65);
       ep.setPrefWidth(135);
        ep.setLayoutX(570);
        ep.setLayoutY(465);
        return ep;
    }
    public static void setEp(String s){
        ep.setText(s);
    }
}

//public
