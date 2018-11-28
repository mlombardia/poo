import javafx.application.Application;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.web.WebView;
import javafx.application.Platform;
import java.util.Optional;
import javafx.scene.control.ProgressBar;

public class MyBrowser extends Application {

    private EventHandler<ActionEvent> eventHandler = new AddressHandler();
    private WebView webView = new WebView();
    private static final String HOME = "www.google.com.ar";
    private TextField textField = new TextField("http://"+HOME);
    public static void main(String args[]){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){
        VBox vBox = new VBox();
        ProgressBar progressBar = new ProgressBar();
        progressBar.progressProperty().bind(webView.getEngine().getLoadWorker().progressProperty());
        MenuBar mainMenu = new MenuBar();
        Menu file = new Menu("File");
        MenuItem refreshMenuItem = new MenuItem("Refresh");
        refreshMenuItem.setOnAction(eventHandler);
        MenuItem exitMenuItem = new MenuItem("Exit");
        exitMenuItem.setOnAction(event -> {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("ALERTA!");
            alert.setHeaderText("Estas seguro que queres cerrar?");
            alert.setContentText("Mira que no hay vuelta atras...");
            Optional<ButtonType> result = alert.showAndWait();
            if(result.isPresent()){
                if(result.get() == ButtonType.OK){
                    Platform.exit();
                }
            }
        });
        file.getItems().addAll(refreshMenuItem, exitMenuItem);
        Menu help = new Menu("Help");
        MenuItem aboutMenuItem = new MenuItem("About...");
        aboutMenuItem.setOnAction(event ->{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Informacion del browser");
            alert.setHeaderText("Que onda, perro?");
            alert.setContentText("Esto es el browser de intro a JavaFX");
            alert.showAndWait();
        });
        help.getItems().add(aboutMenuItem);
        mainMenu.getMenus().addAll(file, help);
        textField.setOnAction(eventHandler);
        vBox.getChildren().addAll(mainMenu, textField, webView, progressBar);
        Scene scene = new Scene(vBox, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private class AddressHandler implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent event){
            webView.getEngine().load(textField.getText());
        }
    }
}
