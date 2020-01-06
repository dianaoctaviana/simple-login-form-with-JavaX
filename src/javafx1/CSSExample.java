/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author ITD
 */
public class CSSExample extends Application{
    String nameFont = "Comic Sans MS", greeting;

    @Override
    public void start(Stage primaryStage) throws Exception {
    FormFXExample formfx = new FormFXExample();
    formfx.stop();
    
    final Text txtTarget = new Text();
    txtTarget.setId("teks");
    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    Button cetak = new Button("Print");
    cetak.setFont(Font.font(nameFont));
    cetak.setOnAction((ActionEvent) -> {
        txtTarget.setText("Hello " + greeting.toUpperCase()+" !");
        txtTarget.setFont(Font.font(nameFont,FontWeight.NORMAL,32));
        
        txtTarget.setFill(Color.FIREBRICK);
    });
    Button balik = new Button("BACK");
    balik.setFont(Font.font(nameFont));
    balik.setOnAction((ActionEvent event) -> {
        primaryStage.close();
        formfx.start(primaryStage);
    });
    Button cls = new Button("Close");
    cls.setFont(Font.font(nameFont));
    cls.setOnAction((ActionEvent event) -> {
        primaryStage.close();
    });
    HBox hbox = new HBox(10);
    hbox.setAlignment(Pos.BOTTOM_CENTER);

    hbox.getChildren().add(cetak);
    hbox.getChildren().add(balik);
    hbox.getChildren().add(cls);
    
    StackPane pane = new StackPane();
    pane.setId("layout");
    pane.getChildren().addAll(txtTarget);
    pane.getChildren().add(hbox);
    
    Scene scene = new Scene(pane, 300,250);
    scene.getStylesheets().add(CSSExample.class.getResource("asset/Login.css").toExternalForm());
    primaryStage.setTitle("CSS Example");
    primaryStage.setScene(scene);
    primaryStage.setX(484);
    primaryStage.setY(256);
    primaryStage.show();
    }
    
    
}
