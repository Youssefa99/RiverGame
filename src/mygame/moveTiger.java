/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

/**
 *
 * @author feras
 */


import javafx.scene.image.Image;

public class moveTiger implements ImoveStrategy {
//     int flag=0;
    int flag2=0;
    eatingRank l = new eatingRank();
    static SpriteBoat boat = new SpriteBoat(new Image("boat.png"));
static SpriteTiger tiger = new SpriteTiger(new Image("fox.png"));
    @Override
   public void move(){
       if (tiger.positionX == 95  && Mygame.flag==0 &&boat.positionX == 250 && boat.positionY == 350)
                    {
                        while (tiger.positionX!=220 && tiger.positionY != 348) {
                            tiger.addDeltaX(1);
                            tiger.addDeltaY(0);
                            tiger.update();
                            Mygame.flag=1;
                    
                        }
                                 // return 1;          
                                 Mygame.leftSide.remove(Mygame.tiger);
                      
                            
                    }
                    
                
                                 
            else if(tiger.positionX == 220 ) {
                         
                        while (tiger.positionX !=95 ) {
                            
                            tiger.addDeltaX(-1);
                           
                            tiger.update();
                         
                                   Mygame.flag=0;
                                   System.out.println(tiger.positionX);
                                                                     //return 2;
                        } 
   Mygame.leftSide.add(Mygame.tiger);
                     
            }else if(tiger.positionX == 350  && boat.positionX==380) {
                         
                        while (tiger.positionX !=500 ) {
                            tiger.addDeltaX(1.5);
                            tiger.addDeltaY(0);
                            tiger.update();
                           
                        if(tiger.positionX == 500){
     
   Mygame.rightSide.add(Mygame.tiger);
                            
                            System.out.println(l.check());
                            System.out.println(l.checkRight());
}                            
                                   Mygame.flag=0;
                                   
                                   //return 3;
                        }
            }else if(tiger.positionX == 500  && boat.positionX==380  && Mygame.flag==0) {
                        while (tiger.positionX !=350 ) {
                            tiger.addDeltaX(-1.5);
                            tiger.addDeltaY(0);
                            tiger.update();
                                   Mygame.flag=1;
                                   
                                   //return 4;
                        } Mygame.rightSide.remove(Mygame.tiger);
            }
}    

   
}
