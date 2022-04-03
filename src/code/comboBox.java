package sample;
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
public class comboBox extends Application{
    public static Integer[] diceNumber = {1,2,3,4,5,6};
    public static ComboBox<Integer> cbo = new ComboBox<>();
    public void start(Stage pri){

    ObservableList<Integer> items = FXCollections.observableArrayList(diceNumber);

    cbo.getItems().addAll(items);

    }
}
