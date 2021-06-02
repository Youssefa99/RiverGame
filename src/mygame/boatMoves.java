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
public class boatMoves implements Icommand {
static SpriteBoat boat = new SpriteBoat(new Image("boat.png"));
 static Spritefarmer farmer = new Spritefarmer(new Image("farmer2.png"));
 static Spritefarmer1 farmer1 = new Spritefarmer1(new Image("fala7 rofya3.png"));
   static Spritefarmer2 farmer2 = new Spritefarmer2(new Image("fala7 nos nos.png"));
   static Spritefarmer3 farmer3 = new Spritefarmer3(new Image("fala7 tekhen.png"));
   static Spritechicken chicken=new Spritechicken(new Image("farkha.png"));
   static Spritechicken1 chicken1=new Spritechicken1(new Image("farkha.png"));
   static Spritechicken2 chicken2=new Spritechicken2(new Image("farkha.png"));
   static Spritechicken3 chicken3=new Spritechicken3(new Image("farkha.png"));
   int size;
   getWeight g = new getWeight();
@Override
   public void move(){
       
       int i;
       size = Secondlevel.boatRiders.size();
       if(boat.positionX == 250){
           
         
           if(g.isValid() && g.weight() <= 100){
          
             while(boat.positionX != 380){
                 boat.addDeltaX(1);
                 boat.update();
               for(i = 0 ; i < size ; i++){
                   System.out.println(size);
                 Secondlevel.boatRiders.get(i).addDeltaX(1);
                 Secondlevel.boatRiders.get(i).update();
                 //System.out.println(Secondlevel.boatRiders.get(i));
                 System.out.println(chicken3.positionX);      
             }
               
           }
           
       }
   }
       else if(boat.positionX == 380){
           if(g.isValid() && g.weight() <= 100){
             while(boat.positionX != 250){
                 boat.addDeltaX(-1);
                 boat.update();
               for(i = 0 ; i < size ; i++){
                 Secondlevel.boatRiders.get(i).addDeltaX(-1);
                 Secondlevel.boatRiders.get(i).update();
             }  
           }
           
       }
       }
}
}