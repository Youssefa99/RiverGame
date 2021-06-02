/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author feras
 */
public class Level 
        {
    Scene scene;
    Secondlevel sl;
    FirstGui fg=new FirstGui();
    Stage stage;
    Mygame mg;
    
    public Level(Stage stage){
      this.stage=stage; 
  }
  
    public void seconddraw(){
Button First=new Button("level 1");
Button Second=new Button("level 2");

GridPane grid=new GridPane();
grid.add(First,0,0);
grid.add(Second,1,1);
First.setOnAction(new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent t) {
stage.setScene(mg.getScene());

    }
});
Second.setOnAction(new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent t) {
stage.setScene(sl.getScene());

    }
});
scene=new Scene(grid,400,200);
}
    public Scene getScene(){
        return this.scene;
    }public void setsecond (Mygame mg){
    this.mg=mg;
    
    }public void setthird (Secondlevel sl){
    this.sl=sl;
    
    }
    
}
