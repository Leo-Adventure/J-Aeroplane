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

import java.util.ArrayList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
public class WinPane {
    public void display(String title , String message){
        Stage window = new Stage();
        window.setTitle(title);
        //modality要使用Modality.APPLICATION_MODEL
        window.initModality(Modality.APPLICATION_MODAL);
        window.setMinWidth(300);
        window.setMinHeight(150);
        HBox hBox = new HBox(16);
        hBox.setAlignment(Pos.CENTER);
        Button button = new Button("OK");
        button.setOnAction(e -> System.exit(1));
        Label label = new Label(message);
        hBox.getChildren().addAll(button);
        VBox layout = new VBox(10);
        Image Save = new Image("Winpane.jpg");
        ImageView SaveIV = new ImageView(Save);
        SaveIV.setFitWidth(300);
        SaveIV.setFitHeight(150);
        layout.getChildren().add(SaveIV);
        layout.getChildren().addAll(label , hBox);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        //使用showAndWait()先处理这个窗口，而如果不处理，main中的那个窗口不能响应
        window.showAndWait();
    }
}

