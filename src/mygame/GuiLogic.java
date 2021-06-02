/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

import java.util.ArrayList;
import java.util.List;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;

/**
 *
 * @author feras
 */
public class GuiLogic {
    int flag=0;
    int flag2=0;

 SpriteBoat boat = new SpriteBoat(new Image("boat.png"));
 SpriteTiger tiger = new SpriteTiger(new Image("fox.png"));
 SpriteRabbit rabbit = new SpriteRabbit(new Image("Rabbit.png"));
   SpriteCarrot carrot = new SpriteCarrot(new Image("Webp.net-resizeimage (5).png"));
   SpriteHuman Human = new SpriteHuman(new Image("farmer2.png"));
   //Mygame mg=new Mygame();
   eatingRank l = new eatingRank();
   public void test (String s){
    List<String> inputs = new ArrayList<>();
        System.out.println(s);
        
                
                switch(s){
                    case "F":
                        
                        System.out.println(tiger.positionX);
                        if (tiger.positionX == 95  && flag==0 &&boat.positionX == 250 && boat.positionY == 350)
                    {
                        while (tiger.positionX!=220 && tiger.positionY != 348) {
                            tiger.addDeltaX(1);
                            tiger.addDeltaY(0);
                            tiger.update();
                            flag=1;
                    
                        }
                                 // return 1;          
                                 Mygame.leftSide.remove(Mygame.tiger);
                      
                            
                    }
                    
                
                                 
            else if(tiger.positionX == 220 ) {
                         
                        while (tiger.positionX !=95 ) {
                            
                            tiger.addDeltaX(-1);
                           
                            tiger.update();
                         
                                   flag=0;
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
                                   flag=0;
                                   
                                   //return 3;
                        }
            }else if(tiger.positionX == 500  && boat.positionX==380  && flag==0) {
                        while (tiger.positionX !=350 ) {
                            tiger.addDeltaX(-1.5);
                            tiger.addDeltaY(0);
                            tiger.update();
                                   flag=1;
                                   
                                   //return 4;
                        } Mygame.rightSide.remove(Mygame.tiger);
            }
                break;
                
          
        case "R":
            if (rabbit.positionX == 170&& flag==0 &&boat.positionX == 250)
                    {
                        while (rabbit.positionX!=250) {
                            rabbit.addDeltaX(1);
                            rabbit.addDeltaY(0);
                            rabbit.update();
                           
                            flag=2;
                             
                            
                           // return 5;
                          }Mygame.leftSide.remove(Mygame.rabbit);
                    }
                    
                
                                 
            else if(rabbit.positionX == 250 ) {
                        while (rabbit.positionX !=170 ) {
                            rabbit.addDeltaX(-1);
                            rabbit.addDeltaY(0);
                            rabbit.update();
                          
                        flag=0;
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
                                                     
                                   flag=0;
                          //         return 7;
                        }
            }else if(rabbit.positionX == 480 && boat.positionX==380 && flag==0) {
                        while (rabbit.positionX !=380 ) {
                            rabbit.addDeltaX(-1);
                            rabbit.addDeltaY(0);
                            rabbit.update();
                   
                                   flag=2;    
                            //       return 8;
                        } Mygame.rightSide.remove(Mygame.rabbit);
            }
             
                break;
                        case "C":
            if (carrot.positionX ==60 && flag==0&&boat.positionX == 250 )
                    {
                        while (carrot.positionX!=245 ) {
                            carrot.addDeltaX(1);
                            carrot.addDeltaY(0);
                            carrot.update();
                              
                            
                         flag=3; 
                         //return 9;
                        }
                   Mygame.leftSide.remove(Mygame.carrot); }
                    
                
                                 
            else if(carrot.positionX == 245 ) {
                        while (carrot.positionX !=60 ) {
                            carrot.addDeltaX(-1);
                            carrot.addDeltaY(0);
                            carrot.update();
                       
                        flag=0;
                        //return 10;
                        }
   Mygame.leftSide.add(Mygame.carrot);
                            System.out.println(l.check());
                            System.out.println(l.checkRight());
            }else if(carrot.positionX == 375 && boat.positionX==380 ) {
                        while (carrot.positionX !=555 ) {
                            carrot.addDeltaX(1);
                            carrot.addDeltaY(0);
                            carrot.update();
                           
}if(carrot.positionX == 555){
      
   Mygame.rightSide.add(Mygame.carrot);
                            //System.out.println(Mygame.rightSide.size());
                            System.out.println(l.check());
                            System.out.println(l.checkRight());}                            
                                   flag=0;      
                          //         return 11;
                        }
            else if(carrot.positionX == 555 && boat.positionX==380  && flag==0) {
                        while (carrot.positionX !=375 ) {
                            carrot.addDeltaX(-1);
                            carrot.addDeltaY(0);
                            carrot.update();
                            
                                   flag=3;  
                            //       return 12;
                        }Mygame.rightSide.remove(Mygame.carrot);
            }
                break;
                           case "Z":
            if (boat.positionX == 250 && boat.positionY == 350)
                    {
                        if(flag==0){
                            if(l.check()!=1){
                         while (boat.positionX!=380) {
                            boat.addDeltaX(1);
                            Human.addDeltaX(1);
                            boat.update();
                            Human.update();
                            //return 13;
                          
                        }   }
                        }else if(flag==1){
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
                        else if(flag==2){
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
                        else if(flag==3){
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
                        }}
                        
                    }
                    
                
                                 
            else if(boat.positionX == 380 ) {
                if(flag==0){
                    if(l.checkRight()!=1){
                        while(boat.positionX !=250) {
                            boat.addDeltaX(-1);
                            Human.addDeltaX(-1);
                            boat.update();
                            Human.update();
                           
                        }
                    }
                        }else if(flag==1){
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
                            
                        }else if(flag==2){
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
                else if(flag==3){
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
            break;

            
               }
    } 
  
}
