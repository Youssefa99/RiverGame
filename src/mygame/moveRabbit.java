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

public class moveRabbit implements ImoveStrategy{
    static SpriteRabbit rabbit = new SpriteRabbit(new Image("Rabbit.png"));
 static SpriteBoat boat = new SpriteBoat(new Image("boat.png"));
 eatingRank l = new eatingRank();
 //int flag = 0;
    @Override
    public void move(){
        if (rabbit.positionX == 170&& Mygame.flag==0 &&boat.positionX == 250)
                    {
                        while (rabbit.positionX!=250) {
                            rabbit.addDeltaX(1);
                            rabbit.addDeltaY(0);
                            rabbit.update();
                           
                            Mygame.flag=2;
                             
                            
                           // return 5;
                          }Mygame.leftSide.remove(Mygame.rabbit);
                    }
                    
                
                                 
            else if(rabbit.positionX == 250 ) {
                        while (rabbit.positionX !=170 ) {
                            rabbit.addDeltaX(-1);
                            rabbit.addDeltaY(0);
                            rabbit.update();
                          
                        Mygame.flag=0;
                        //return 6;
                        } 
   Mygame.leftSide.add(Mygame.rabbit);
                            
            }else if(rabbit.positionX == 380  && boat.positionX==380 ) {
                        while (rabbit.positionX !=480 ) {
                            rabbit.addDeltaX(1);
                            rabbit.addDeltaY(0);
                            rabbit.update();
                        } if(rabbit.positionX == 480){
      Mygame.rightSide.add(Mygame.rabbit);
  
                            //System.out.println(Mygame.rightSide.size());
                                                     
                                   Mygame.flag=0;
                          //         return 7;
                        }
            }else if(rabbit.positionX == 480 && boat.positionX==380 && Mygame.flag==0) {
                        while (rabbit.positionX !=380 ) {
                            rabbit.addDeltaX(-1);
                            rabbit.addDeltaY(0);
                            rabbit.update();
                   
                                   Mygame.flag=2;    
                            //       return 8;
                        } Mygame.rightSide.remove(Mygame.rabbit);
            }
             
           
}
}
