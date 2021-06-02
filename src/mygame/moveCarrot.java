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
public class moveCarrot implements ImoveStrategy {
     SpriteCarrot carrot = new SpriteCarrot(new Image("Webp.net-resizeimage (5).png"));
      static SpriteBoat boat = new SpriteBoat(new Image("boat.png"));
      //int flag = 0;
      eatingRank l = new eatingRank();
     @Override
    public void move(){
            
                        
            if (carrot.positionX ==60 && Mygame.flag==0&&boat.positionX == 250 )
                    {
                        while (carrot.positionX!=245 ) {
                            carrot.addDeltaX(1);
                            carrot.addDeltaY(0);
                            carrot.update();
                              
                            
                         Mygame.flag=3; 
                         //return 9;
                        }
                   Mygame.leftSide.remove(Mygame.carrot); }
                    
                
                                 
            else if(carrot.positionX == 245 ) {
                
                        while (carrot.positionX !=60 ) {
                            carrot.addDeltaX(-1);
                            carrot.addDeltaY(0);
                            carrot.update();
                       
                        Mygame.flag=0;
                        //return 10;
                        }
   Mygame.leftSide.add(Mygame.carrot);
                            System.out.println(l.check());
                            System.out.println(l.checkRight());
            }
            else if(carrot.positionX == 375 && boat.positionX==380 ) {
             
                        while (carrot.positionX !=555 ) {
                            carrot.addDeltaX(1);
                            carrot.addDeltaY(0);
                            carrot.update();
                           
}if(carrot.positionX == 555){
      
   Mygame.rightSide.add(Mygame.carrot);
                            //System.out.println(Mygame.rightSide.size());
                            System.out.println(l.check());
                            System.out.println(l.checkRight());}                            
                                   Mygame.flag=0;      
                          //         return 11;
                        }
            else if(carrot.positionX == 555 && boat.positionX==380  && Mygame.flag==0) {
                        while (carrot.positionX !=375 ) {
                            carrot.addDeltaX(-1);
                            carrot.addDeltaY(0);
                            carrot.update();
                            
                                   Mygame.flag=3;  
                            //       return 12;
                        }Mygame.rightSide.remove(Mygame.carrot);
            }
            System.out.println(Mygame.flag);
    }
    }
    

