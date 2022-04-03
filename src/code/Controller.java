package sample;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView daxingImage;

    @FXML
    private Label WelcomeLabel;

    @FXML
    private Button StartButton;

    @FXML
    private Button RecordButton;

    @FXML
    private Button ExitButton;


    @FXML
    private Button music;

    @FXML
    private ImageView BGMImage;

    @FXML
    void music(ActionEvent event) {
        System.out.println("PLay music");
    }
    File file = new File("C:\\Codes\\practise\\src\\BGM.mp3");
    Media mediaPlayer1 = new Media(file.toURI().toString());
    MediaPlayer mediaPlayer = new MediaPlayer(mediaPlayer1);
    @FXML
    void BGMClick(MouseEvent event) {
        MediaPlayer.Status status = mediaPlayer.getStatus();
        if (status.equals(MediaPlayer.Status.PLAYING)) {
            mediaPlayer.pause();
        } else {
            mediaPlayer.play();
        }
    }

    @FXML
    void ExitHandler(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void NewButtonHandler(ActionEvent event) {
        new FirstPane().start(new Stage());

    }

    @FXML
    void RecordHandler(ActionEvent event) throws Exception {
       new FilePane().start(new Stage());
    }

    @FXML
    void initialize() {
        assert daxingImage != null : "fx:id=\"daxingImage\" was not injected: check your FXML file 'sample.fxml'.";
        assert WelcomeLabel != null : "fx:id=\"WelcomeLabel\" was not injected: check your FXML file 'sample.fxml'.";
        assert StartButton != null : "fx:id=\"StartButton\" was not injected: check your FXML file 'sample.fxml'.";
        assert RecordButton != null : "fx:id=\"RecordButton\" was not injected: check your FXML file 'sample.fxml'.";
        assert ExitButton != null : "fx:id=\"ExitButton\" was not injected: check your FXML file 'sample.fxml'.";
        assert music != null : "fx:id=\"music\" was not injected: check your FXML file 'sample.fxml'.";
        assert BGMImage != null : "fx:id=\"BGMImage\" was not injected: check your FXML file 'sample.fxml'.";
        WelcomeLabel.setTextFill(Color.RED);
        FadeTransition ft = new FadeTransition();
        ft.setNode(WelcomeLabel);
        ft.setFromValue(0.1);
        ft.setToValue(1.0);
        ft.setDuration(Duration.millis(2000));
        ft.setAutoReverse(true);
        ft.setCycleCount(Timeline.INDEFINITE);
        ft.play();


    }
}
