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
public class farmerMoves implements Icommand {
    static SpriteBoat boat = new SpriteBoat(new Image("boat.png"));
 static Spritefarmer farmer = new Spritefarmer(new Image("farmer2.png"));
 static Spritefarmer1 farmer1 = new Spritefarmer1(new Image("fala7 rofya3.png"));
   static Spritefarmer2 farmer2 = new Spritefarmer2(new Image("fala7 nos nos.png"));
   static Spritefarmer3 farmer3 = new Spritefarmer3(new Image("fala7 tekhen.png"));
   static Spritechicken chicken=new Spritechicken(new Image("farkha.png"));
   static Spritechicken1 chicken1=new Spritechicken1(new Image("farkha.png"));
   static Spritechicken2 chicken2=new Spritechicken2(new Image("farkha.png"));
   static Spritechicken3 chicken3=new Spritechicken3(new Image("farkha.png"));
    @Override
   public void move(){
       if(farmer.positionX == 130 && boat.positionX == 250){
           Secondlevel.boatRiders.add(Secondlevel.farmer);
           while(farmer.positionX != 240){
               farmer.addDeltaX(1);
               farmer.update();
           }
       }
       else if(farmer.positionX == 240 && boat.positionX == 250){
           Secondlevel.boatRiders.remove(Secondlevel.farmer);
           while(farmer.positionX != 130){
               farmer.addDeltaX(-1);
               farmer.update();
           }
       }
       else if(farmer.positionX == 370 && boat.positionX == 380){
           Secondlevel.boatRiders.remove(Secondlevel.farmer);
           Secondlevel.rightSide.add(Secondlevel.farmer);
           while(farmer.positionX != 470){
               farmer.addDeltaX(1);
               farmer.update();
           }
           
       }
       else if(farmer.positionX == 470 && boat.positionX == 380){
           Secondlevel.boatRiders.add(Secondlevel.farmer);
                                         Secondlevel.rightSide.remove(Secondlevel.farmer);

           while(farmer.positionX != 370){
               farmer.addDeltaX(-1);
               farmer.update();
           }
       }
       
       
   }
    
}
