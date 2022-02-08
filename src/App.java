import javafx.application.*;
import javafx.fxml.FXMLLoader;
import javafx.stage.*;
import javafx.scene.*;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root;

        root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));

        Scene scene = new Scene(root);

        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}