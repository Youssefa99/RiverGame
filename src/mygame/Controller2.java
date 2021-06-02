/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

import javafx.scene.image.Image;

/**
 *
 * @author feras
 */
public class Controller2 {
    static SpriteBoat boat = new SpriteBoat(new Image("boat.png"));
 static Spritefarmer farmer = new Spritefarmer(new Image("farmer2.png"));
 static Spritefarmer1 farmer1 = new Spritefarmer1(new Image("fala7 rofya3.png"));
   static Spritefarmer2 farmer2 = new Spritefarmer2(new Image("fala7 nos nos.png"));
   static Spritefarmer3 farmer3 = new Spritefarmer3(new Image("fala7 tekhen.png"));
   static Spritechicken chicken=new Spritechicken(new Image("farkha.png"));
   static Spritechicken1 chicken1=new Spritechicken1(new Image("farkha.png"));
   static Spritechicken2 chicken2=new Spritechicken2(new Image("farkha.png"));
   static Spritechicken3 chicken3=new Spritechicken3(new Image("farkha.png"));
   boatMoves b = new boatMoves();
   farmerMoves f = new farmerMoves();
   farmer1Moves f1 = new farmer1Moves();
   farmer2Moves f2 = new farmer2Moves();
   farmer3Moves f3 = new farmer3Moves();
   chickenMoves c = new chickenMoves();
   chicken1Moves c1 = new chicken1Moves();
   chicken2Moves c2 = new chicken2Moves();
   chcken3Moves c3 = new chcken3Moves();
invoker invoke = new invoker();
Icommand com;
   public void test(String s){
       
        if(s == "DIGIT1"){
           invoke.action(f);
           invoke.execute();
        }
           else if(s == "DIGIT2")
               {
           invoke.action(f1);
           invoke.execute();
        }
           else if(s == "DIGIT3")
               {
           invoke.action(f2);
           invoke.execute();
        }
           else if(s == "DIGIT4")
               {
           invoke.action(f3);
           invoke.execute();
        }
           else if(s == "Q")
               {
           invoke.action(c);
           invoke.execute();
        }
       else if(s == "W")
               {
           invoke.action(c1);
           invoke.execute();
        }
else if(s == "E")
               {
           invoke.action(c2);
           invoke.execute();
        }
else if(s == "R")
               {
           invoke.action(c3);
           invoke.execute();
        }
else if(s == "Z")
               {
           invoke.action(b);
           invoke.execute();
        }    
           
   }
    
}
