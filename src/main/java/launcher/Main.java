package launcher;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TreeView;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.File;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
//        setUserAgentStylesheet(STYLESHEET_CASPIAN);
        FXMLLoader loader = new FXMLLoader();
        Parent root = loader.load(getClass().getResource("/StartPage.fxml").openStream());
        Controller controller = loader.getController();
        primaryStage.setTitle("Iron-gate!");
        Scene scene = new Scene(root, 990, 700);
        primaryStage.setScene(scene);
        controller.initializeSceneEvents(); // called after primary stage has been set
        scene.getStylesheets().clear(); // clear any styles
//        scene.getStylesheets().add("/main/resources/mainStyle.css"); // absolute path
        primaryStage.show(); // show the initialized stage

    }
    public static void main(String[] args) {
        launch(args);
    }
}
