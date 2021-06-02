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
public class chicken1Moves implements Icommand {
    static SpriteBoat boat = new SpriteBoat(new Image("boat.png"));
 static Spritefarmer farmer = new Spritefarmer(new Image("farmer2.png"));
 static Spritefarmer1 farmer1 = new Spritefarmer1(new Image("fala7 rofya3.png"));
   static Spritefarmer2 farmer2 = new Spritefarmer2(new Image("fala7 nos nos.png"));
   static Spritefarmer3 farmer3 = new Spritefarmer3(new Image("fala7 tekhen.png"));
   //static Spritechicken chicken=new Spritechicken(new Image("farkha.png"));
   static Spritechicken1 chicken1=new Spritechicken1(new Image("farkha.png"));
   //static Spritechicken2 chicken2=new Spritechicken2(new Image("farkha.png"));
   //static Spritechicken3 chicken3=new Spritechicken3(new Image("farkha.png"));
    @Override
    public void move(){
                        System.out.println(chicken1.positionX);
         if (chicken1.positionX == 130 && boat.positionX == 250){
             Secondlevel.boatRiders.add(Secondlevel.chicken1);
                            

                        while (chicken1.positionX!=300) {
                            chicken1.addDeltaX(1);
                            chicken1.addDeltaY(0);
                            chicken1.update();
                            System.out.println(chicken1.positionX);
                          }
                        System.out.println(chicken1.positionX);
         }

                    
                    
                
                                 
            else if(chicken1.positionX == 300 ) {
                 
                    Secondlevel.boatRiders.remove(Secondlevel.chicken1);
                        while (chicken1.positionX !=130 ) {
                            chicken1.addDeltaX(-1);
                            chicken1.addDeltaY(0);

                            chicken1.update();
                          
                        
                        //return 6;
                        } 
   //Mygame.leftSide.add(Mygame.rabbit);
                            
            }else if(chicken1.positionX == 430  && boat.positionX==380 ) {
                    Secondlevel.boatRiders.remove(Secondlevel.chicken1);
                     Secondlevel.rightSide.add(Secondlevel.chicken1);
                        while (chicken1.positionX !=470 ) {
                            chicken1.addDeltaX(1);
                            
                            chicken1.update();
                        } if(chicken1.positionX == 470){
     // Mygame.rightSide.add(Mygame.rabbit);
  
                            //System.out.println(Mygame.rightSide.size());
                                                     
                        
                          //         return 7;
                        }
            }else if(chicken1.positionX == 470 && boat.positionX==380) {
                                   Secondlevel.rightSide.remove(Secondlevel.chicken1);

                    Secondlevel.boatRiders.add(Secondlevel.chicken1);
                        while (chicken1.positionX !=430 ) {
                            chicken1.addDeltaX(-1);
                            
                            chicken1.update();
                   
                                  
                            //       return 8;
                        } //Mygame.rightSide.remove(Mygame.rabbit);
            }
    }
    
}
