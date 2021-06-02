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
public class moveboat implements ImoveStrategy {
    
    static SpriteBoat boat = new SpriteBoat(new Image("boat.png"));
 static SpriteTiger tiger = new SpriteTiger(new Image("fox.png"));
 static SpriteRabbit rabbit = new SpriteRabbit(new Image("Rabbit.png"));
   static SpriteCarrot carrot = new SpriteCarrot(new Image("Webp.net-resizeimage (5).png"));
   static SpriteHuman Human = new SpriteHuman(new Image("farmer2.png"));
   eatingRank l = new eatingRank();
   
   int flag = 0;
    @Override
    public void move(){
           if (boat.positionX == 250 && boat.positionY == 350)
                    {
                        if(Mygame.flag==0){
                            if(l.check()!=1){
                         while (boat.positionX!=380) {
                            boat.addDeltaX(1);
                            Human.addDeltaX(1);
                            boat.update();
                            Human.update();
                            //return 13;
                          
                        }   }
                        }else if(Mygame.flag==1){
                            if(l.check()!=1)
                            {
                                System.out.println(l.check());
                         while (boat.positionX!=380) {
                            boat.addDeltaX(1);
                            Human.addDeltaX(1);
                            tiger.addDeltaX(1);
                            tiger.addDeltaY(0);
                            boat.update();
                            tiger.update();
                            Human.update();
                         //  return 14;
                          
                        }   
                        }}
                        else if(Mygame.flag==2){
                            if(l.check()!=1){
                         while (boat.positionX!=380) {
                             
                            boat.addDeltaX(1);
                            Human.addDeltaX(1);
                            rabbit.addDeltaX(1);
                            rabbit.addDeltaY(0);
                            boat.update();
                            rabbit.update();
                            Human.update();
                            
                          
                        }   
                        }}
                        else if(Mygame.flag==3){
                            if(l.check()!=1){
                         while (boat.positionX!=380) {
                            boat.addDeltaX(1);
                            Human.addDeltaX(1);
                            carrot.addDeltaX(1);
                            carrot.addDeltaY(0);
                            boat.update();
                            carrot.update();
                            Human.update();
                            
                          
                        }   
                            }
                       }
                        
                    }
                    
                
                                 
            else if(boat.positionX == 380 ) {
                if(Mygame.flag==0){
                    if(l.checkRight()!=1){
                        while(boat.positionX !=250) {
                            boat.addDeltaX(-1);
                            Human.addDeltaX(-1);
                            boat.update();
                            Human.update();
                           
                        }
                    }
                        }else if(Mygame.flag==1){
                            if(l.checkRight()!=1)
                                
                            {
                        while(boat.positionX !=250) {
                            boat.addDeltaX(-1);
                            Human.addDeltaX(-1);
                            tiger.addDeltaX(-1);
                            tiger.addDeltaY(0);
                            boat.update();
                            Human.update();
                            tiger.update();
                            
                        }
                            }
                            
                        }else if(Mygame.flag==2){
                            if(l.checkRight()!=1){
                        while(boat.positionX !=250) {
                            boat.addDeltaX(-1);
                            Human.addDeltaX(-1);
                            rabbit.addDeltaX(-1);
                            rabbit.addDeltaY(0);
                            boat.update();
                            Human.update();
                            rabbit.update();
                            
                        }
                        }
  
                        }
                else if(Mygame.flag==3){
                    if(l.checkRight()!=1){
                        while(boat.positionX !=250) {
                            boat.addDeltaX(-1);
                            Human.addDeltaX(-1);
                            carrot.addDeltaX(-1);
                            carrot.addDeltaY(0);
                            boat.update();
                            Human.update();
                            carrot.update();
                            
                        }
                        }}
            
            
            }
               }
    } 
    
    

