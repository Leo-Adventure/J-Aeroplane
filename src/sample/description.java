
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

public class description {
    static TextArea Description = new TextArea();

    public static TextArea getInitialTextArea() {
        Font font = new Font("Courier New",15);
        Description.setEditable(false);
        Description.setText("Welcome to AeroPlane!");
        Description.setFont(font);
        Description.setWrapText(true);
        Description.setPrefHeight(100);
        Description.setPrefWidth(140);
        Description.setLayoutX(570);
        Description.setLayoutY(340);
        return Description;
    }
    public static void setDescription(String s){
        Description.setText(s);
    }
}

//public
