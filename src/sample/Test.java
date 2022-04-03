package sample;

import javafx.stage.Stage;

public class Test {
    public static void main(String[] args){
        try {
            new basepane().start(new Stage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
