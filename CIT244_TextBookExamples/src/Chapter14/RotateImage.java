package Chapter14;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.animation.RotateTransition;
import javafx.util.Duration;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

/**
 *  An Animation Demo
 */

public class RotateImage extends Application
{
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Constants for the scene size
      final double SCENE_WIDTH = 250.0;
      final double SCENE_HEIGHT = 350.0;
      
      // Constants for the animation
      final double HALF_SEC = 500.0;
      final double FROM_ANGLE = 0.0;
      final double TO_ANGLE = 360.0;
      
      // Constant for the layout padding space
      final double PADDING_SPACE = 20.0;

      // Create a BorderPane.
      BorderPane borderPane = new BorderPane();

      // Create an Image and ImageView components.
      Image image = new Image("Images/Ace_Diamonds.png");
      ImageView imageView = new ImageView(image);

      // Create a RotateTransition object for the ImageView.
      RotateTransition rtrans =
         new RotateTransition(new Duration(HALF_SEC), imageView);
      rtrans.setFromAngle(FROM_ANGLE);
      rtrans.setToAngle(TO_ANGLE);
      
      // Put the ImageView in the center of the BorderPane.
      borderPane.setCenter(imageView);
      
      // Create a Button to start the animation.
      Button spinButton = new Button("Spin");
      
      // Create an event handler for the Button.
      spinButton.setOnAction(event ->
      {
         rtrans.play();
      });
      
      // Put the Button in an HBox.
      HBox hbox = new HBox(spinButton);
      hbox.setAlignment(Pos.CENTER);
      hbox.setPadding(new Insets(PADDING_SPACE));
      
      // Put the HBox in the bottom region of the BorderPane.
      borderPane.setBottom(hbox);
      
      // Create a Scene and display it.
      Scene scene = new Scene(borderPane, SCENE_WIDTH, SCENE_HEIGHT);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}