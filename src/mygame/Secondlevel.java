/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

import java.awt.Canvas;
import java.awt.Label;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import javafx.animation.AnimationTimer;
import javafx.scene.image.Image;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author hppp
 */

public class Secondlevel extends Application {
    Stage stage;

Scene game;
   public Secondlevel(Stage stage){
     this.stage=stage;  
   }
int flag=0;

// static SpriteBackground Background = new SpriteBackground(new Image("game.jpg"));
 static SpriteBoat boat = new SpriteBoat(new Image("boat.png"));
 static Spritefarmer farmer = new Spritefarmer(new Image("farmer2.png"));
 static Spritefarmer1 farmer1 = new Spritefarmer1(new Image("fala7 rofya3.png"));
   static Spritefarmer2 farmer2 = new Spritefarmer2(new Image("fala7 nos nos.png"));
   static Spritefarmer3 farmer3 = new Spritefarmer3(new Image("fala7 tekhen.png"));
   static Spritechicken chicken=new Spritechicken(new Image("farkha.png"));
   static Spritechicken1 chicken1=new Spritechicken1(new Image("farkha.png"));
   static Spritechicken2 chicken2=new Spritechicken2(new Image("farkha.png"));
   static Spritechicken3 chicken3=new Spritechicken3(new Image("farkha.png"));
   Stack stack=new Stack();
   Stack stack2=new Stack();
Controller C=new Controller();
GuiLogic2 gl=new GuiLogic2();
GuiLogic2 l = new GuiLogic2();
getWeight gw =new getWeight();
//eatingRank s = new eatingRank();
static List<Icrosser2> leftSide = new ArrayList<>();
     static List<Icrosser2> rightSide = new ArrayList<>();
       //eatingRank l = new eatingRank();
       static List<Icrosser2> boatRiders = new ArrayList<>();
      farmerMoves f = new farmerMoves();
       Controller2 c = new Controller2();
       static List<Icrosser2> initial2 = new ArrayList<>();
      
       
int i;

//int diff = 0;
 
 getWeight g = new getWeight();

    //@Override
    public void draw() {
        leftSide.add(farmer);
        leftSide.add(farmer1);
        leftSide.add(farmer2);
        leftSide.add(farmer3);
        leftSide.add(chicken);
        leftSide.add(chicken1);
        leftSide.add(chicken2);
        leftSide.add(chicken3);
      //System.out.println(g.isValid());
      boatRiders.size();
      initial2.add(farmer);
        initial2.add(farmer1);
        initial2.add(farmer2);
        initial2.add(farmer3);
        initial2.add(chicken);
        initial2.add(chicken1);
        initial2.add(chicken2);
        initial2.add(chicken3);
      
  
      
    
       
       
    
        
        Group root = new Group();
         game = new Scene(root, 600, 600);
       GridPane grid=new GridPane();
        
        Label vali=new Label();
         
         Button submit1=new Button("3ashhhh khalastt");
         Button undo=new Button("undo");
         Button redo=new Button("redo");
         Button reset=new Button("reset");
        
   grid.add(submit1,2,3);
 
        javafx.scene.canvas.Canvas gameMap = new javafx.scene.canvas.Canvas(600, 600);
        root.getChildren().add(gameMap);
        GraphicsContext gc = gameMap.getGraphicsContext2D();
        Mygame.d.Display(gc);
     root.getChildren().add(undo);
     root.getChildren().add(reset);
     undo.setLayoutX(0);
     undo.setLayoutY(0);
     undo.setLineSpacing(10);
     root.getChildren().add(redo);
     redo.setLayoutX(80);
     redo.setLayoutY(0);
     redo.setLineSpacing(10);
      
     root.getChildren().add(submit1);
     submit1.setLayoutY(80);
     submit1.setLayoutX(0);
     submit1.setLineSpacing(10);
     submit1.setVisible(false);
     reset.setLayoutY(0);
     reset.setLayoutX(170);
     reset.setLineSpacing(10);
        boat.Display(gc);
         
        farmer.Display(gc);
        
        farmer1.Display(gc);
      
        farmer2.Display(gc);
        
        farmer3.Display(gc);
     chicken.Display(gc);
        chicken1.Display(gc);
        chicken2.Display(gc);
        chicken3.Display(gc);
        

             
            
        
        List<String> inputs = new ArrayList<>();
        
        game.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
stack.push(event.getCode().toString());
//l.test(event.getCode().toString());
c.test(event.getCode().toString());

                                           undo.setOnAction(new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent t) {
        String k=(stack.pop().toString());
        stack2.push(k);
  c.test(k);
  gc.clearRect(0, 0, 600, 600);
                            Mygame.d.Display(gc);
                            boat.Display(gc);
                            farmer.Display(gc);
                            farmer1.Display(gc);
                            farmer2.Display(gc);
                            farmer3.Display(gc);
                            chicken.Display(gc);
                            chicken1.Display(gc);
                            chicken2.Display(gc);
                            chicken3.Display(gc);
    }
});
                                           redo.setOnAction(new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent t) {
        String k=(stack2.pop().toString());
        stack.push(k);
  c.test(k);
  gc.clearRect(0, 0, 600, 600);
                            Mygame.d.Display(gc);
                            boat.Display(gc);
                            farmer.Display(gc);
                            farmer1.Display(gc);
                            farmer2.Display(gc);
                            farmer3.Display(gc);
                            chicken.Display(gc);
                            chicken1.Display(gc);
                            chicken2.Display(gc);
                            chicken3.Display(gc);
    }
});


        reset.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
              
            }
        });
                    //tiger.update();
                    gc.clearRect(0, 0, 600, 600);
                            Mygame.d.Display(gc);
                            boat.Display(gc);
                            farmer.Display(gc);
                            farmer1.Display(gc);
                            farmer2.Display(gc);
                            farmer3.Display(gc);
                            chicken.Display(gc);
                            chicken1.Display(gc);
                            chicken2.Display(gc);
                            chicken3.Display(gc);
                        
                            
                                            if(gw.checkRightSide()){
                                                
                    submit1.setVisible(true);}

       /*         switch(event.getCode().toString()){
                    case "F":
                        if (tiger.positionX == 95 && tiger.positionY == 280 && flag==0 &&boat.positionX == 250 && boat.positionY == 350)
                    {
                        while (tiger.positionX!=220 && tiger.positionY != 348) {
                            tiger.addDeltaX(1);
                            tiger.addDeltaY(0);
                            tiger.update();
                            gc.clearRect(0, 0, 600, 600);
                            Background.Display(gc);
                            boat.Display(gc);
                            rabbit.Display(gc);
                            carrot.Display(gc);
                            Human.Display(gc);
                            tiger.Display(gc);
                            System.out.println(tiger.positionY);
                            System.out.println(tiger.positionX);
                            flag=1;
                          }
                    }
                    
                
                                 
            else if(tiger.positionX == 220 && tiger.positionY == 280) {
                         
                        while (tiger.positionX !=95 ) {
                            tiger.addDeltaX(-1);
                            tiger.addDeltaY(0);
                            tiger.update();
                            gc.clearRect(0, 0, 600, 600);
                            Background.Display(gc);
                            boat.Display(gc);
                            rabbit.Display(gc);
                            carrot.Display(gc);
                            Human.Display(gc);
                            tiger.Display(gc);
                            System.out.println(tiger.positionX);
                                   flag=0;      
                        }
            }else if(tiger.positionX == 350  && boat.positionX==380) {
                         
                        while (tiger.positionX !=500 ) {
                            tiger.addDeltaX(1.5);
                            tiger.addDeltaY(0);
                            tiger.update();
                            gc.clearRect(0, 0, 600, 600);
                            Background.Display(gc);
                            boat.Display(gc);
                            rabbit.Display(gc);
                            carrot.Display(gc);
                            Human.Display(gc);
                            tiger.Display(gc);
                            System.out.println(tiger.positionX);
                            System.out.println(tiger.positionY);
                                   flag=0;      
                        }
            }else if(tiger.positionX == 500  && boat.positionX==380  && flag==0) {
                        while (tiger.positionX !=350 ) {
                            tiger.addDeltaX(-1.5);
                            tiger.addDeltaY(0);
                            tiger.update();
                            gc.clearRect(0, 0, 600, 600);
                            Background.Display(gc);
                            boat.Display(gc);
                            rabbit.Display(gc);
                            carrot.Display(gc);
                            Human.Display(gc);
                            tiger.Display(gc);
                            System.out.println(tiger.positionX);
                                   flag=1;      
                        }
            }
                break;
                
          
        case "R":
            if (rabbit.positionX == 170&& flag==0 &&boat.positionX == 250)
                    {
                        while (rabbit.positionX!=250) {
                            rabbit.addDeltaX(1);
                            rabbit.addDeltaY(0);
                            rabbit.update();
                            gc.clearRect(0, 0, 600, 600);
                            Background.Display(gc);
                            boat.Display(gc);
                            carrot.Display(gc);
                            Human.Display(gc);
                            tiger.Display(gc);
                            rabbit.Display(gc);
                            System.out.println(rabbit.positionX);
                            System.out.println(rabbit.positionY);
                            flag=2;
                          }
                    }
                    
                
                                 
            else if(rabbit.positionX == 250 ) {
                        while (rabbit.positionX !=170 ) {
                            rabbit.addDeltaX(-1);
                            rabbit.addDeltaY(0);
                            rabbit.update();
                            gc.clearRect(0, 0, 600, 600);
                            Background.Display(gc);
                            boat.Display(gc);
                            carrot.Display(gc);
                            Human.Display(gc);
                            tiger.Display(gc);
                            rabbit.Display(gc);
                        flag=0;
                        }
            }else if(rabbit.positionX == 380  && boat.positionX==380 ) {
                        while (rabbit.positionX !=480 ) {
                            rabbit.addDeltaX(1);
                            rabbit.addDeltaY(0);
                            rabbit.update();
                            gc.clearRect(0, 0, 600, 600);
                            Background.Display(gc);
                            boat.Display(gc);
                            rabbit.Display(gc);
                            carrot.Display(gc);
                            Human.Display(gc);
                            tiger.Display(gc);
                            System.out.println(rabbit.positionX);
                            System.out.println(rabbit.positionY);
                                   flag=0;      
                        }
            }else if(rabbit.positionX == 480 && boat.positionX==380 && flag==0) {
                        while (rabbit.positionX !=380 ) {
                            rabbit.addDeltaX(-1);
                            rabbit.addDeltaY(0);
                            rabbit.update();
                            gc.clearRect(0, 0, 600, 600);
                            Background.Display(gc);
                            boat.Display(gc);
                            rabbit.Display(gc);
                            carrot.Display(gc);
                            Human.Display(gc);
                            tiger.Display(gc);
                            System.out.println(tiger.positionX);
                                   flag=2;      
                        }
            }
             
                break;
                        case "C":
            if (carrot.positionX ==60 && flag==0&&boat.positionX == 250 )
                    {System.out.println("a8a");
                        while (carrot.positionX!=245 ) {
                            carrot.addDeltaX(1);
                            carrot.addDeltaY(0);
                            carrot.update();
                            gc.clearRect(0, 0, 600, 600);
                            Background.Display(gc);
                            boat.Display(gc);
                            Human.Display(gc);
                            tiger.Display(gc);
                            rabbit.Display(gc);
                            carrot.Display(gc);
                            System.out.println(carrot.positionX);
                            System.out.println(carrot.positionY);
                         flag=3; 
                        }
                    }
                    
                
                                 
            else if(carrot.positionX == 245 ) {
                        while (carrot.positionX !=60 ) {
                            carrot.addDeltaX(-1);
                            carrot.addDeltaY(0);
                            carrot.update();
                            gc.clearRect(0, 0, 600, 600);
                            Background.Display(gc);
                            boat.Display(gc);
                            carrot.Display(gc);
                            Human.Display(gc);
                            tiger.Display(gc);
                            rabbit.Display(gc);
                        flag=0;
                        }
            }else if(carrot.positionX == 375 && boat.positionX==380 ) {
                        while (carrot.positionX !=555 ) {
                            carrot.addDeltaX(1);
                            carrot.addDeltaY(0);
                            carrot.update();
                            gc.clearRect(0, 0, 600, 600);
                            Background.Display(gc);
                            boat.Display(gc);
                            rabbit.Display(gc);
                            carrot.Display(gc);
                            Human.Display(gc);
                            tiger.Display(gc);
                            System.out.println(carrot.positionX);
                            System.out.println(carrot.positionY);
                                   flag=0;      
                        }
            }else if(carrot.positionX == 555 && boat.positionX==380  && flag==0) {
                        while (carrot.positionX !=375 ) {
                            carrot.addDeltaX(-1);
                            carrot.addDeltaY(0);
                            carrot.update();
                            gc.clearRect(0, 0, 600, 600);
                            Background.Display(gc);
                            boat.Display(gc);
                            rabbit.Display(gc);
                            carrot.Display(gc);
                            Human.Display(gc);
                            tiger.Display(gc);
                            System.out.println(tiger.positionX);
                                   flag=3;      
                        }
            }
                break;
                           case "SPACE":
            if (boat.positionX == 250 && boat.positionY == 350)
                    {
                        if(flag==0){
                         while (boat.positionX!=380) {
                            boat.addDeltaX(1);
                            Human.addDeltaX(1);
                            boat.update();
                            Human.update();
                            gc.clearRect(0, 0, 600, 600);
                            Background.Display(gc);
                            boat.Display(gc);
                            Human.Display(gc);
                            tiger.Display(gc);
                            rabbit.Display(gc);
                            carrot.Display(gc);
                            System.out.println(carrot.positionX);
                            System.out.println(carrot.positionY);
                          
                        }   
                        }else if(flag==1){
                         while (boat.positionX!=380) {
                            boat.addDeltaX(1);
                            Human.addDeltaX(1);
                            tiger.addDeltaX(1);
                            tiger.addDeltaY(0);
                            boat.update();
                            tiger.update();
                            Human.update();
                            gc.clearRect(0, 0, 600, 600);
                            Background.Display(gc);
                            boat.Display(gc);
                            Human.Display(gc);
                            tiger.Display(gc);
                            rabbit.Display(gc);
                            carrot.Display(gc);
                           // System.out.println(tiger.positionX);
                            System.out.println(boat.positionX);
                          
                        }   
                        }
                        else if(flag==2){
                         while (boat.positionX!=380) {
                            boat.addDeltaX(1);
                            Human.addDeltaX(1);
                            rabbit.addDeltaX(1);
                            rabbit.addDeltaY(0);
                            boat.update();
                            rabbit.update();
                            Human.update();
                            gc.clearRect(0, 0, 600, 600);
                            Background.Display(gc);
                            boat.Display(gc);
                            Human.Display(gc);
                            tiger.Display(gc);
                            rabbit.Display(gc);
                            carrot.Display(gc);
                            System.out.println(rabbit.positionX);
                            System.out.println(rabbit.positionY);
                          
                        }   
                        }
                        else if(flag==3){
                         while (boat.positionX!=380) {
                            boat.addDeltaX(1);
                            Human.addDeltaX(1);
                            carrot.addDeltaX(1);
                            carrot.addDeltaY(0);
                            boat.update();
                            carrot.update();
                            Human.update();
                            gc.clearRect(0, 0, 600, 600);
                            Background.Display(gc);
                            boat.Display(gc);
                            Human.Display(gc);
                            tiger.Display(gc);
                            rabbit.Display(gc);
                            carrot.Display(gc);
                            System.out.println(carrot.positionX);
                            System.out.println(carrot.positionY);
                          
                        }   
                        }
                        
                    }
                    
                
                                 
            else if(boat.positionX == 380 ) {
                if(flag==0){
                        while(boat.positionX !=250) {
                            boat.addDeltaX(-1);
                            Human.addDeltaX(-1);
                            boat.update();
                            Human.update();
                            gc.clearRect(0, 0, 600, 600);
                            Background.Display(gc);
                            boat.Display(gc);
                            Human.Display(gc);
                            tiger.Display(gc);
                            rabbit.Display(gc);
                            carrot.Display(gc);
                        }
                            
                        }else if(flag==1){
                        while(boat.positionX !=250) {
                            boat.addDeltaX(-1);
                            Human.addDeltaX(-1);
                            tiger.addDeltaX(-1);
                            tiger.addDeltaY(0);
                            boat.update();
                            Human.update();
                            tiger.update();
                            gc.clearRect(0, 0, 600, 600);
                            Background.Display(gc);
                            boat.Display(gc);
                            Human.Display(gc);
                            tiger.Display(gc);
                            rabbit.Display(gc);
                            carrot.Display(gc);
                        }
                            
                        }else if(flag==2){
                        while(boat.positionX !=250) {
                            boat.addDeltaX(-1);
                            Human.addDeltaX(-1);
                            rabbit.addDeltaX(-1);
                            rabbit.addDeltaY(0);
                            boat.update();
                            Human.update();
                            rabbit.update();
                            gc.clearRect(0, 0, 600, 600);
                            Background.Display(gc);
                            boat.Display(gc);
                            Human.Display(gc);
                            tiger.Display(gc);
                            rabbit.Display(gc);
                            carrot.Display(gc);
                            
                        }
                            
                        }
                else if(flag==3){
                        while(boat.positionX !=250) {
                            boat.addDeltaX(-1);
                            Human.addDeltaX(-1);
                            carrot.addDeltaX(-1);
                            carrot.addDeltaY(0);
                            boat.update();
                            Human.update();
                            carrot.update();
                            gc.clearRect(0, 0, 600, 600);
                            Background.Display(gc);
                            boat.Display(gc);
                            Human.Display(gc);
                            tiger.Display(gc);
                            rabbit.Display(gc);
                            carrot.Display(gc);
                            System.out.println(carrot.positionX);
                            System.out.println(carrot.positionY);
                        }
                            
                        }
            
            
            }
            break;

            
    */            }});
        //primaryStage.setScene(game);
        //primaryStage.show();
    }
 public Scene getScene(){
        return this.game;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
