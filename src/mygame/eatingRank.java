/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.image.Image;

/**
 *
 * @author feras
 */
public class eatingRank implements Crossing{
   /*SpriteTiger tiger = new SpriteTiger(new Image("fox.png"));
 SpriteRabbit rabbit = new SpriteRabbit(new Image("Rabbit.png"));
   SpriteCarrot carrot = new SpriteCarrot(new Image("Webp.net-resizeimage (5).png"));
 */
     int diff = 0;
        public int check(){

       int diff=0;
       int i;
            
       if(Mygame.leftSide.size() == 2){
            for(i=0;i<=2;i++){
              if(Mygame.leftSide.contains(Mygame.carrot) && Mygame.leftSide.contains(Mygame.rabbit))
                  diff = 1;
              else if(Mygame.leftSide.contains(Mygame.rabbit) && Mygame.leftSide.contains(Mygame.tiger))
                              diff = 1;
              else
                              diff = 2;
            }
            }
            else
                diff = 3;
  

 return diff;
    }
        public int checkRight(){

       int diff2=0;
       int i;
           
       if(Mygame.rightSide.size() == 2){
            for(i=0;i<=2;i++){
              if(Mygame.rightSide.contains(Mygame.carrot) && Mygame.rightSide.contains(Mygame.rabbit))
                  diff2 = 1;
              else if(Mygame.rightSide.contains(Mygame.rabbit) && Mygame.rightSide.contains(Mygame.tiger))
                              diff2 = 1;
              else
                              diff2= 2;
            }
            }
            else
                diff2 = 3;
       if(Mygame.rightSide.size()>=3){
           if(Mygame.rightSide.contains(Mygame.carrot) && Mygame.rightSide.contains(Mygame.rabbit)&& Mygame.rightSide.contains(Mygame.tiger))
       diff2=4;
               }
  

 return diff2;
    }
public boolean isValid(){
    if(Secondlevel.boatRiders.contains(Secondlevel.farmer) || Secondlevel.boatRiders.contains(Secondlevel.farmer1) || Secondlevel.boatRiders.contains(Secondlevel.farmer2) || Secondlevel.boatRiders.contains(Secondlevel.farmer3) )
        return true;
                else
        return false;
}    
}
       