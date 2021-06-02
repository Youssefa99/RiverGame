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
public class chicken2Moves implements Icommand {
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
                       System.out.println(chicken2.positionX);
  if (chicken2.positionX ==90 && boat.positionX == 250 )
                    {
                        Secondlevel.boatRiders.add(Secondlevel.chicken2);
                        while (chicken2.positionX!=280 ) {
                            chicken2.addDeltaX(1);
                            chicken2.addDeltaY(0);
                            chicken2.update();
                              
                            
                         
                         //return 9;
                        }
                   //Mygame.leftSide.remove(Mygame.carrot);
                    }
                    
                
                                 
            else if(chicken2.positionX == 280 ) {
                 Secondlevel.boatRiders.remove(Secondlevel.chicken2);
                        while (chicken2.positionX !=90 ) {
                            chicken2.addDeltaX(-1);
                            chicken2.addDeltaY(0);
                            chicken2.update();
                       
 
                            
                        //return 10;
                        }
   //Mygame.leftSide.add(Mygame.carrot);
                            //System.out.println(l.check());
                           // System.out.println(l.checkRight());
            }else if(chicken2.positionX == 410 && boat.positionX==380 ) {
                 Secondlevel.boatRiders.remove(Secondlevel.chicken2);
                            Secondlevel.rightSide.add(Secondlevel.chicken2);

                        while (chicken2.positionX !=500 ) {
                            chicken2.addDeltaX(1);
                            chicken2.addDeltaY(0);
                            chicken2.update();
                           
}if(chicken2.positionX == 500){
              //  System.out.println("a");
  // Mygame.rightSide.add(Mygame.carrot);
                            //System.out.println(Mygame.rightSide.size());
                            //System.out.println(l.check());
                            //System.out.println(l.checkRight());}                            
                                  
                          //         return 11;
                        }}
             
            else if(chicken2.positionX == 500 && boat.positionX==380  )
            {   
                 Secondlevel.boatRiders.add(Secondlevel.chicken2);
                                    Secondlevel.rightSide.remove(Secondlevel.chicken2);

                        while (chicken2.positionX !=410 ) {
                            chicken2.addDeltaX(-1);
                            chicken2.addDeltaY(0);
                            chicken2.update();
                            
                              
                            //       return 12;
                        }//Mygame.rightSide.remove(Mygame.carrot);
            }
                
}
}