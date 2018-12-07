package game.frontend;

import game.backend.CandyGame;
import game.backend.level.Level;
import game.backend.level.Level1;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Stack;

public class GameApp extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        CandyGame game = new CandyGame(Level1.class);
        CandyFrame frame = new CandyFrame(game);
        Scene scene1 = new Scene(frame);
        stage = primaryStage;
        primaryStage.setResizable(false);
        primaryStage.setScene(scene1);
        System.out.println("antes del show");
        primaryStage.show();
    }

    private static Stage stage;

    public static void modifyLevel(Level level){
        CandyGame game = new CandyGame(Level1.class);
        CandyFrame frame = new CandyFrame(game);
        Scene scene = new Scene(frame);
        stage.setScene(scene);
    }
}
