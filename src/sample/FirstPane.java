package sample;
import javafx.application.Application;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
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

import java.util.ArrayList;

public class FirstPane extends Application{
    public void start(Stage primaryStage){
        Pane FirstPane = new Pane();

        Image FirstImage = new Image("FirstPane.jpg");
        ImageView imageView = new ImageView(FirstImage);
        imageView.setFitWidth(611);
        imageView.setFitHeight(611*854/1280);//1280 x 854
        FirstPane.getChildren().add(imageView);

        Label label = new Label("AeroPlane Chess");
        label.setLayoutX(611/2 - 175);
        label.setLayoutY(50);
        label.setFont(Font.font("Courier New",FontWeight.BOLD,FontPosture.ITALIC,35));
        FirstPane.getChildren().add(label);

        Label User = new Label("User");
        User.setLayoutX(611/2 - 175 );
        User.setLayoutY(150);

        Label Pass = new Label("PassWord");
        Pass.setLayoutX(611/2 - 175 );
        Pass.setLayoutY(180);
        TextField user = new TextField();
        user.setLayoutX(611/2 - 175 + 90);
        user.setLayoutY(150);
        PasswordField pw = new PasswordField();
        pw.setLayoutX(611/2 - 175 + 90);
        pw.setLayoutY(180);
        Button AcButton = new Button("Access");
        AcButton.setLayoutX(611/2 - 175 + 90);
        AcButton.setLayoutY(210);
        FirstPane.getChildren().addAll(User,Pass,user,pw,AcButton);

        user.setOnKeyPressed(event -> {
            if(event.getCode()== KeyCode.ENTER) {
                if (pw.getText().equals("123456") && user.getText().equals("林源美")) {
                    try {
                        new pattern().start(new Stage());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    primaryStage.close();
                }
                else{
                    new AlertBox().display("Error","Please Enter CORRECT Information!");
                }
            }
        });
        pw.setOnKeyPressed(event -> {
            if(event.getCode()== KeyCode.ENTER) {
                if (pw.getText().equals("123456") && user.getText().equals("Sheny")) {
                    try {
                        new pattern().start(new Stage());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    primaryStage.close();
                }
                else{
                    new AlertBox().display("Error","Please Enter CORRECT Information!");
                }
            }
        });
        AcButton.setOnAction(event -> {
            if(pw.getText().equals("123456")&&user.getText().equals("陈韵懿")){
                try {
                    new pattern().start(new Stage());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                primaryStage.close();
            }
            else{
                new AlertBox().display("Error","Please Enter CORRECT Information!");
            }
        });

        Scene scene =  new Scene(FirstPane,611,611*854/1280);
        primaryStage.setTitle("Welcome to Aeroplane!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
