/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeboard;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author sa
 */
public class TicTacToeBoard extends Application {

    @Override
    public void start(Stage primaryStage) {

        GridPane p = new GridPane();
        p.setAlignment(Pos.CENTER);
        p.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        p.setHgap(5.5);
        p.setVgap(5.5);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int n = (int) (Math.random() * 3);

                if (n == 0) {
                    p.add(new ImageView(new Image("image/x.gif")), j, i);
                } else if (n == 1) {
                    p.add(new ImageView(new Image("image/o.gif")), j, i);
                }

            }

        }

        Scene scene = new Scene(p, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //Image image=new Image(new ImageView(("https://liveexample.pearsoncmg.com/book/image/card/"), 0, 0);
    //pane.add(new ImageView(image), 0, 0);
    //Image image1=new Image("cross.gif");
    //pane.add(new ImageView(image1),0,1);
    //Image image2=new Image("cross.gif");
    //pane.add(new ImageView(image2),0,2);
    //Image image3=new Image("cross.gif");
    //pane.add(new ImageView(image3),1,0);
    //Image image4=new Image("not.gif");
    //pane.add(new ImageView(image4),2,0);
    //Image image5=new Image("cross.gif");
    //pane.add(new ImageView(image5),2,1);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
