package circle;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
public class main extends Application{
	public void start(Stage stage)throws Exception{
		Group root = new Group();
		Scene scene = new Scene(root, 500, 500);
		Circle cir = new Circle();
		cir.setRadius(100);
		cir.setFill(Color.BLACK);
		cir.setTranslateX(250);
		cir.setTranslateY(250);
		root.getChildren().addAll(cir);
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
