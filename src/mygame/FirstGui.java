/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 *
 * @author feras
 */
public class FirstGui extends Application{
  Stage window;
 Scene scene1,scene2;
  
public static void main(String[] args) {
        
        launch(args);
    }   @Override  
public void start(Stage primaryStage) {
    window=primaryStage;
    Level l=new Level(primaryStage);
    l.seconddraw();
    primaryStage.setTitle("login");
   Mygame mg=new Mygame(primaryStage);
   Secondlevel sl=new  Secondlevel(primaryStage);
   mg.draw();
   sl.draw();
   l.setsecond(mg);
   l.setthird(sl);
   primaryStage.setScene(l.getScene());
    
    
    
    
    
    
    
  // window.setScene(mg.getScene());
    
       primaryStage.show();
}
}