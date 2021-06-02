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
public class GuiLogic2 {
    int flag=0;
    int flag2=0;

 static SpriteBoat boat = new SpriteBoat(new Image("boat.png"));
 static Spritefarmer farmer = new Spritefarmer(new Image("farmer2.png"));
 static Spritefarmer1 farmer1 = new Spritefarmer1(new Image("fala7 rofya3.png"));
   static Spritefarmer2 farmer2 = new Spritefarmer2(new Image("fala7 nos nos.png"));
   static Spritefarmer3 farmer3 = new Spritefarmer3(new Image("fala7 tekhen.png"));
   static Spritechicken chicken=new Spritechicken(new Image("farkha.png"));
   static Spritechicken1 chicken1=new Spritechicken1(new Image("farkha.png"));
   static Spritechicken2 chicken2=new Spritechicken2(new Image("farkha.png"));
   static Spritechicken3 chicken3=new Spritechicken3(new Image("farkha.png"));
   //Mygame mg=new Mygame();
   eatingRank l = new eatingRank();
   
   public void test (String s){
   getWeight x = new getWeight();
       Secondlevel.boatRiders.remove(Secondlevel.farmer);
       Secondlevel.boatRiders.remove(Secondlevel.chicken);
        int size;
        size = Secondlevel.boatRiders.size();
        
                
                switch(s){
                    case "DIGIT2":
                      
                      
                        if (farmer.positionX == 130  && size<=2 &&boat.positionX == 250)
                    
                        {
                    
                            Secondlevel.boatRiders.add(farmer);
                                    size = Secondlevel.boatRiders.size();

                            System.out.println(size);
                        while (farmer.positionX!=250) {
                     
                            farmer.addDeltaX(1);
                            farmer.addDeltaY(0);
                            farmer.update();
                            flag=1;

       
                        }
                    //    System.out.println("kosom 7ayaty");
                        
                                 // return 1;          
                                 
                      
                            
                    }
                    
                
                                 
            else if(farmer.positionX == 250 ) {
                            Secondlevel.boatRiders.remove(farmer);
        size = Secondlevel.boatRiders.size();
                        while (farmer.positionX !=130 ) {
                            
                            farmer.addDeltaX(-1);
                           
                            farmer.update();
   
                                   flag=0;
                                 //  System.out.println(tiger.positionX);
                                                                     //return 2;
                        } 
  // Mygame.leftSide.add(Mygame.tiger);
                     
            }else if(farmer.positionX == 380  && boat.positionX==380) {
                         
                        while (farmer.positionX !=470 ) {
                            farmer.addDeltaX(1);
                            farmer.addDeltaY(0);
                            farmer.update();
                            
                           
                        if(farmer.positionX == 470){
     Secondlevel.boatRiders.remove(farmer);
     size = Secondlevel.boatRiders.size();
   //Mygame.rightSide.add(Mygame.tiger);
                            
     //                       System.out.println(l.check());
       //                     System.out.println(l.checkRight());
}                            
                                   flag=0;
                                   
                                   //return 3;
                        }
            }else if(farmer.positionX == 470  && boat.positionX==380  && size<=2) {
                                                  Secondlevel.boatRiders.add(farmer);
     size = Secondlevel.boatRiders.size();                                                  
                        while (farmer.positionX !=380 ) {
                            farmer.addDeltaX(-1);
                            farmer.addDeltaY(0);
                            farmer.update();
                                   flag=1;
                                
                                   
                                   //return 4;
                        } //Mygame.rightSide.remove(Mygame.tiger);
            }
                break;
                
          
        case "DIGIT1":
            if (farmer1.positionX == 150&& size<=2 &&boat.positionX == 250)
                    {
                        Secondlevel.boatRiders.add(farmer1);
                            size = Secondlevel.boatRiders.size();
                        while (farmer1.positionX!=250) {
                            farmer1.addDeltaX(1);
                            
                            farmer1.update();
                           
                            flag=2;
                             
                            
                           // return 5;
                          }//Mygame.leftSide.remove(Mygame.rabbit);
                    }
                    
                
                                 
            else if(farmer1.positionX == 250 ) {
                        while (farmer1.positionX !=150 ) {
                            farmer1.addDeltaX(-1);
                            
                            farmer1.update();
                          Secondlevel.boatRiders.remove(farmer1);
                          size = Secondlevel.boatRiders.size();
                        flag=0;
                        //return 6;
                        } 
   //Mygame.leftSide.add(Mygame.rabbit);
                            
            }else if(farmer1.positionX == 380  && boat.positionX==380 ) {
                Secondlevel.boatRiders.remove(farmer1);
                            size = Secondlevel.boatRiders.size();        
                while (farmer1.positionX !=430 ) {
                            farmer1.addDeltaX(1);
                
                            farmer1.update();
                        } if(farmer1.positionX == 430){
     // Mygame.rightSide.add(Mygame.rabbit);
  
                            //System.out.println(Mygame.rightSide.size());
                                                     
                                   flag=0;
                          //         return 7;
                        }
            }else if(farmer1.positionX == 430 && boat.positionX==380 &&size<=2) {
                Secondlevel.boatRiders.add(farmer1);
                            size = Secondlevel.boatRiders.size();       
                while (farmer1.positionX !=380 ) {
                            farmer1.addDeltaX(-1);
                            
                            
                            farmer1.update();
                   
                                   flag=2;    
                            //       return 8;
                        } //Mygame.rightSide.remove(Mygame.rabbit);
            }
             
                break;
                        case "DIGIT3":
                           System.out.println(farmer2.positionX);
            if (farmer2.positionX ==80 &&  size<=2&&boat.positionX == 250 )
                   
            {
                Secondlevel.boatRiders.add(farmer2);
                            size = Secondlevel.boatRiders.size(); 
                        while (farmer2.positionX!=245 ) {
                            farmer2.addDeltaX(1);
                            farmer2.addDeltaY(0);
                            farmer2.update();
                               
                            
                         flag=3; 
                         //return 9;
                        }
                   //Mygame.leftSide.remove(Mygame.carrot);
                    }
                    
                
                                 
            else if(farmer2.positionX == 245 ) {
Secondlevel.boatRiders.remove(farmer1);
 size = Secondlevel.boatRiders.size();                        
                    while (farmer2.positionX !=80 ) {
                            farmer2.addDeltaX(-1);
                            farmer2.addDeltaY(0);
                            farmer2.update();

flag=0;
                        //return 10;
                        }
   //Mygame.leftSide.add(Mygame.carrot);
                            //System.out.println(l.check());
                           // System.out.println(l.checkRight());
            }else if(farmer2.positionX == 375 && boat.positionX==380 ) {
Secondlevel.boatRiders.remove(farmer2);
 size = Secondlevel.boatRiders.size();
                    while (farmer2.positionX !=510 ) {
                            farmer2.addDeltaX(1);
                            farmer2.addDeltaY(0);
                            farmer2.update();

}if(farmer2.positionX == 510){
              //  System.out.println("a");
  // Mygame.rightSide.add(Mygame.carrot);
                            //System.out.println(Mygame.rightSide.size());
                            //System.out.println(l.check());
                            //System.out.println(l.checkRight());}                            
                                   flag=0;      
                          //         return 11;
                        }}
             
            else if(farmer2.positionX == 510 && boat.positionX==380  &&  size<=2)
            {   System.out.println("a7a");
                    Secondlevel.boatRiders.add(farmer2);
                             size = Secondlevel.boatRiders.size();    
                    while (farmer2.positionX !=375 ) {
                            farmer2.addDeltaX(-1);
                            farmer2.addDeltaY(0);
                            farmer2.update();
                            
                                   flag=3;  
                            //       return 12;
                        }//Mygame.rightSide.remove(Mygame.carrot);
            }
            
                break;
                      case "DIGIT4":
                           System.out.println(farmer3.positionX);
            if (farmer3.positionX ==20 &&  size<=2&&boat.positionX == 250 )
                    {
                        Secondlevel.boatRiders.add(farmer3);
                             size = Secondlevel.boatRiders.size();
                        while (farmer3.positionX!=245 ) {
                            farmer3.addDeltaX(1);
                            farmer3.addDeltaY(0);
                            farmer3.update();
                              
                         flag=4; 
                         //return 9;
                        }
                   //Mygame.leftSide.remove(Mygame.carrot);
                    }
                    
                
                                 
            else if(farmer3.positionX == 245 ) {
                Secondlevel.boatRiders.remove(farmer2);
                        size = Secondlevel.boatRiders.size();       
                while (farmer3.positionX !=20 ) {
                            farmer3.addDeltaX(-1);
                            farmer3.addDeltaY(0);
                            farmer3.update();
                       
                        flag=0;
                        //return 10;
                        }
   //Mygame.leftSide.add(Mygame.carrot);
                            //System.out.println(l.check());
                           // System.out.println(l.checkRight());
            }else if(farmer3.positionX == 375 && boat.positionX==380 ) {
                Secondlevel.boatRiders.remove(farmer3);
                             size = Secondlevel.boatRiders.size();        
                while (farmer3.positionX !=560 ) {
                            farmer3.addDeltaX(1);
                            farmer3.addDeltaY(0);
                            farmer3.update();
                            
                           
}if(farmer3.positionX == 560){
              //  System.out.println("a");
  // Mygame.rightSide.add(Mygame.carrot);
                            //System.out.println(Mygame.rightSide.size());
                            //System.out.println(l.check());
                            //System.out.println(l.checkRight());}                            
                                   flag=0;      
                          //         return 11;
                        }}
             
            else if(farmer3.positionX == 560 && boat.positionX==380  &&  size<=2)
            {   System.out.println("a7a");
            Secondlevel.boatRiders.add(farmer2);
                             size = Secondlevel.boatRiders.size();            
            while (farmer3.positionX !=375 ) {
                            farmer3.addDeltaX(-1);
                            farmer3.addDeltaY(0);
                            farmer3.update();
                            
                            
                                   flag=4;  
                            //       return 12;
                        }//Mygame.rightSide.remove(Mygame.carrot);
            }
            
                break;
                                   case "Q":
                        System.out.println(chicken.positionX);
                      
                        if (chicken.positionX == 160 && flag2==0 &&boat.positionX == 250)
                    {
                        while (chicken.positionX!=300) {
                            chicken.addDeltaX(1);
                            chicken.addDeltaY(0);
                            chicken.update();
                            flag2=1;
                    
                        }System.out.println(chicken.positionY);
                                 // return 1;          
                                 
                      
                            
                    }
                    
                
                                 
            else if(chicken.positionX == 300 ) {
                         
                        while (chicken.positionX !=160 ) {
                            
                            chicken.addDeltaX(-1);
                           chicken.addDeltaY(0);
                            chicken.update();
                         
                                   flag2=0;
                                 //  System.out.println(tiger.positionX);
                                                                     //return 2;
                        } 
  // Mygame.leftSide.add(Mygame.tiger);
                     
            }else if(chicken.positionX == 430  && boat.positionX==380) {
                         
                        while (chicken.positionX !=440 ) {
                            chicken.addDeltaX(1);
                            chicken.addDeltaY(0);
                            chicken.update();
                           
                        if(chicken.positionX == 440){
     
   //Mygame.rightSide.add(Mygame.tiger);
                            
     //                       System.out.println(l.check());
       //                     System.out.println(l.checkRight());
}                            
                                   flag2=0;
                                   
                                   //return 3;
                        }
            }else if(chicken.positionX == 440  && boat.positionX==380  && flag2==0) {
                        while (chicken.positionX !=430 ) {
                            chicken.addDeltaX(-1);
                            chicken.addDeltaY(0);
                            chicken.update();
                                   flag2=1;
                                   
                                   //return 4;
                        } //Mygame.rightSide.remove(Mygame.tiger);
            }
                break;
                
          
        case "W":
            if (chicken1.positionX == 130&& flag2==0 &&boat.positionX == 250)
                    {
                        while (chicken1.positionX!=300) {
                            chicken1.addDeltaX(1);
                            chicken1.addDeltaY(0);
                            chicken1.update();
                           
                            flag2=2;
                             
                            
                           // return 5;
                          }
//Mygame.leftSide.remove(Mygame.rabbit);
                    }
                    
                
                                 
            else if(chicken1.positionX == 300 ) {
                        while (chicken1.positionX !=130 ) {
                            chicken1.addDeltaX(-1);
                            chicken1.addDeltaY(0);

                            chicken1.update();
                          
                        flag2=0;
                        //return 6;
                        } 
   //Mygame.leftSide.add(Mygame.rabbit);
                            
            }else if(chicken1.positionX == 430  && boat.positionX==380 ) {
                        while (chicken1.positionX !=470 ) {
                            chicken1.addDeltaX(1);
                            
                            chicken1.update();
                        } if(chicken1.positionX == 470){
     // Mygame.rightSide.add(Mygame.rabbit);
  
                            //System.out.println(Mygame.rightSide.size());
                                                     
                                   flag2=0;
                          //         return 7;
                        }
            }else if(chicken1.positionX == 470 && boat.positionX==380 && flag2==0) {
                        while (chicken1.positionX !=430 ) {
                            chicken1.addDeltaX(-1);
                            
                            chicken1.update();
                   
                                   flag2=2;    
                            //       return 8;
                        } //Mygame.rightSide.remove(Mygame.rabbit);
            }
             
                break;
                        case "E":
                          
            if (chicken2.positionX ==90 && flag2==0&&boat.positionX == 250 )
                    {
                        while (chicken2.positionX!=300 ) {
                            chicken2.addDeltaX(1);
                            chicken2.addDeltaY(0);
                            chicken2.update();
                              
                            
                         flag2=3; 
                         //return 9;
                        }
                   //Mygame.leftSide.remove(Mygame.carrot);
                    }
                    
                
                                 
            else if(chicken2.positionX == 300 ) {
                        while (chicken2.positionX !=90 ) {
                            chicken2.addDeltaX(-1);
                            chicken2.addDeltaY(0);
                            chicken2.update();
                       
                        flag2=0;
                        //return 10;
                        }
   //Mygame.leftSide.add(Mygame.carrot);
                            //System.out.println(l.check());
                           // System.out.println(l.checkRight());
            }else if(chicken2.positionX == 430 && boat.positionX==380 ) {
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
                                   flag2=0;      
                          //         return 11;
                        }}
             
            else if(chicken2.positionX == 500 && boat.positionX==380  && flag2==0)
            {   
                        while (chicken2.positionX !=430 ) {
                            chicken2.addDeltaX(-1);
                            chicken2.addDeltaY(0);
                            chicken2.update();
                            
                                   flag2=3;  
                            //       return 12;
                        }//Mygame.rightSide.remove(Mygame.carrot);
            }
            
                break;
                      case "R":
                           
            if (chicken3.positionX ==50 && flag2==0&&boat.positionX == 250 )
                    {
                        while (chicken3.positionX!=300 ) {
                            chicken3.addDeltaX(1);
                            chicken3.addDeltaY(0);
                            chicken3.update();
                              
                            
                         flag2=4; 
                         //return 9;
                        }
                   //Mygame.leftSide.remove(Mygame.carrot);
                    }
                    
                
                                 
            else if(chicken3.positionX == 300 ) {
                        while (chicken3.positionX !=50 ) {
                            chicken3.addDeltaX(-1);
                            chicken3.addDeltaY(0);
                            chicken3.update();
                       
                        flag2=0;
                        //return 10;
                        }
   //Mygame.leftSide.add(Mygame.carrot);
                            //System.out.println(l.check());
                           // System.out.println(l.checkRight());
            }else if(chicken3.positionX == 430 && boat.positionX==380 ) {
                        while (chicken3.positionX !=540 ) {
                            chicken3.addDeltaX(1);
                            chicken3.addDeltaY(0);
                            chicken3.update();
                           
}if(chicken3.positionX == 540){
              //  System.out.println("a");
  // Mygame.rightSide.add(Mygame.carrot);
                            //System.out.println(Mygame.rightSide.size());
                            //System.out.println(l.check());
                            //System.out.println(l.checkRight());}                            
                                   flag2=0;      
                          //         return 11;
                        }}
             
            else if(chicken3.positionX == 540 && boat.positionX==380  && flag2==0)
            {   
                        while (chicken3.positionX !=430 ) {
                            chicken3.addDeltaX(-1);
                            chicken3.addDeltaY(0);
                            chicken3.update();
                            
                                   flag2=4;  
                            //       return 12;
                        }//Mygame.rightSide.remove(Mygame.carrot);
            }
            
                break;
              
                      
                case "Z":
             
                
              if(boat.positionX == 250 && boat.positionY == 350){
                  if(Secondlevel.boatRiders.contains(farmer)){
                      while(boat.positionX != 380){
                      boat.addDeltaX(1);
                      farmer.addDeltaX(1);
                      boat.update();
                      farmer.update();
                      }
                  }
                  else if(Secondlevel.boatRiders.contains(farmer1)){
                      while(boat.positionX != 380){
                      boat.addDeltaX(1);
                      farmer1.addDeltaX(1);
                      boat.update();
                      farmer1.update();
                      }
                  }
                  else if(Secondlevel.boatRiders.contains(farmer2)){
                      while(boat.positionX != 380){
                      boat.addDeltaX(1);
                      farmer2.addDeltaX(1);
                      boat.update();
                      farmer2.update();
                      }
                  }
                  else if(Secondlevel.boatRiders.contains(farmer3)){
                      while(boat.positionX != 380){
                      boat.addDeltaX(1);
                      farmer3.addDeltaX(1);
                      boat.update();
                      farmer3.update();
                      }
                  }
                  else if(Secondlevel.boatRiders.contains(farmer2) && Secondlevel.boatRiders.contains(farmer3)){
                      while(boat.positionX != 380){
                      boat.addDeltaX(1);
                      farmer2.addDeltaX(1);
                       farmer3.addDeltaX(1);
                      boat.update();
                      farmer2.update();
                      farmer3.update();
                      }
                  }
                  else if(Secondlevel.boatRiders.contains(farmer) && Secondlevel.boatRiders.contains(chicken)){
                      while(boat.positionX != 380){
                      boat.addDeltaX(1);
                      farmer.addDeltaX(1);
                       chicken.addDeltaX(1);
                      boat.update();
                      farmer.update();
                      chicken.update();
                      }
                  }
                  else if(Secondlevel.boatRiders.contains(farmer1) && Secondlevel.boatRiders.contains(chicken)){
                      while(boat.positionX != 380){
                      boat.addDeltaX(1);
                      farmer1.addDeltaX(1);
                       chicken.addDeltaX(1);
                      boat.update();
                      farmer1.update();
                      chicken.update();
                      }
                  }
                  else if(Secondlevel.boatRiders.contains(farmer2) && Secondlevel.boatRiders.contains(chicken)){
                      while(boat.positionX != 380){
                      boat.addDeltaX(1);
                      farmer2.addDeltaX(1);
                       chicken.addDeltaX(1);
                      boat.update();
                      farmer2.update();
                      chicken.update();
                      }
                  }
                  else if(Secondlevel.boatRiders.contains(chicken) && Secondlevel.boatRiders.contains(farmer3)){
                      while(boat.positionX != 380){
                      boat.addDeltaX(1);
                      chicken.addDeltaX(1);
                       farmer3.addDeltaX(1);
                      boat.update();
                      chicken.update();
                      farmer3.update();
                      }
                  }
              }
              else if(boat.positionX == 380 && boat.positionY == 350){
                  if(Secondlevel.boatRiders.contains(farmer)){
                    
                        while(boat.positionX !=250) {
                            boat.addDeltaX(-1);
                           farmer.addDeltaX(-1);
                           farmer.update();
                            boat.update();
                           // Human.update();
                           
                        }
                    
              }
                 else if(Secondlevel.boatRiders.contains(farmer1)){
                    
                        while(boat.positionX !=250) {
                            boat.addDeltaX(-1);
                           farmer1.addDeltaX(-1);
                           farmer1.update();
                            boat.update();
                           // Human.update();
                           
                        }
                    
              }
                 else if(Secondlevel.boatRiders.contains(farmer2)){
                    
                        while(boat.positionX !=250) {
                            boat.addDeltaX(-1);
                           farmer2.addDeltaX(-1);
                           farmer2.update();
                            boat.update();
                           // Human.update();
                           
                        }
                    
              }
                    else if(Secondlevel.boatRiders.contains(farmer3)){
                    
                        while(boat.positionX !=250) {
                            boat.addDeltaX(-1);
                           farmer3.addDeltaX(-1);
                           farmer3.update();
                            boat.update();
                           // Human.update();
                           
                        }
                    
              }
                    else if(Secondlevel.boatRiders.contains(farmer3) && Secondlevel.boatRiders.contains(farmer2)){
                    
                        while(boat.positionX !=250) {
                            boat.addDeltaX(-1);
                           farmer2.addDeltaX(-1);
                           farmer3.addDeltaX(-1);
                           farmer2.update();
                           farmer3.update();
                            boat.update();
                           // Human.update();
                           
                        }
                    
              }
                  else if(Secondlevel.boatRiders.contains(farmer) && Secondlevel.boatRiders.contains(chicken)){
                    
                        while(boat.positionX !=250) {
                            boat.addDeltaX(-1);
                           farmer.addDeltaX(-1);
                           chicken.addDeltaX(-1);
                           farmer.update();
                           chicken.update();
                            boat.update();
                           // Human.update();
                           
                        }
                    
              }
                  else if(Secondlevel.boatRiders.contains(farmer1) && Secondlevel.boatRiders.contains(chicken)){
                    
                        while(boat.positionX !=250) {
                            boat.addDeltaX(-1);
                           farmer1.addDeltaX(-1);
                           chicken.addDeltaX(-1);
                           farmer1.update();
                           chicken.update();
                            boat.update();
                           // Human.update();
                           
                        }
                    
              }
                  else if(Secondlevel.boatRiders.contains(chicken) && Secondlevel.boatRiders.contains(farmer2)){
                    
                        while(boat.positionX !=250) {
                            boat.addDeltaX(-1);
                           farmer2.addDeltaX(-1);
                           chicken.addDeltaX(-1);
                           farmer2.update();
                           chicken.update();
                            boat.update();
                           // Human.update();
                           
                        }
                    
              }
                  else if(Secondlevel.boatRiders.contains(farmer3) && Secondlevel.boatRiders.contains(chicken)){
                    
                        while(boat.positionX !=250) {
                            boat.addDeltaX(-1);
                           chicken.addDeltaX(-1);
                           farmer3.addDeltaX(-1);
                           chicken.update();
                           farmer3.update();
                            boat.update();
                           // Human.update();
                           
                        }
                    
              }
              }
            if (boat.positionX == 250 && boat.positionY == 350)
                    {
                         if(flag==1&&flag2==0){
                           
                            {
                                System.out.println(l.check());
                         while (boat.positionX!=380) {
                            boat.addDeltaX(1);
                            //Human.addDeltaX(1);
                            farmer.addDeltaX(1);
                            farmer.addDeltaY(0);
                            boat.update();
                            farmer.update();
                            //Human.update();
                         //  return 14;
                          
                        }
                            }
                        }
                        else if(flag==2&&flag2==0){
                           {
                         while (boat.positionX!=380) {
                             
                            boat.addDeltaX(1);
                            //Human.addDeltaX(1);
                            farmer1.addDeltaX(1);
                            farmer1.addDeltaY(0);
                            boat.update();
                            farmer1.update();
                          //  Human.update();
                            
                          
                        }
                           }
                        }
                        else if(flag==3&&flag2==0){
                            {
                         while (boat.positionX!=380) {
                            boat.addDeltaX(1);
                            //Human.addDeltaX(1);
                            farmer2.addDeltaX(1);
                            farmer2.addDeltaY(0);
                            boat.update();
                            farmer2.update();
                            //Human.update();
                            
                          
                        }   
                        }}    else if(flag==4&&flag2==0){
                              {
                        while(boat.positionX !=380) {
                            boat.addDeltaX(1);
                            //Human.addDeltaX(-1);
                            farmer3.addDeltaX(1);
                            farmer3.addDeltaY(0);
                            boat.update();
                           // Human.update();
                            farmer3.update();
                            
                        }}}   ///////////
                        else if(flag==1&&flag2==1){
                           
                            {
                               // System.out.println(l.check());
                         while (boat.positionX!=380) {
                            boat.addDeltaX(1);
                            //Human.addDeltaX(1);
                            farmer.addDeltaX(1);
                            chicken.addDeltaX(1);
                            chicken.update();
                            farmer.addDeltaY(0);
                            boat.update();
                            farmer.update();
                            //Human.update();
                         //  return 14;
                          
                        }   
                        }}
                        else if(flag==2&&flag2==1){
                           {
                         while (boat.positionX!=380) {
                             
                            boat.addDeltaX(1);
                            chicken.addDeltaX(1);
                            chicken.update();
                            //Human.addDeltaX(1);
                            farmer1.addDeltaX(1);
                            farmer1.addDeltaY(0);
                            boat.update();
                            farmer1.update();
                          //  Human.update();
                            
                          
                        }   
                        }}
                        else if(flag==3&&flag2==1){
                            {
                         while (boat.positionX!=380) {
                            boat.addDeltaX(1);
                            //Human.addDeltaX(1);
                            farmer2.addDeltaX(1);
                            farmer2.addDeltaY(0);
                            chicken.addDeltaX(1);
                            chicken.update();
                            boat.update();
                            farmer2.update();
                            //Human.update();
                            
                          
                        }   
                        }}    else if(flag==4&&flag2==1){
                              {
                        while(boat.positionX !=380) {
                            boat.addDeltaX(1);
                            //Human.addDeltaX(-1);
                            farmer3.addDeltaX(1);
                            farmer3.addDeltaY(0);
                            chicken.addDeltaX(1);
                            chicken.update();
                            boat.update();
                           // Human.update();
                            farmer3.update();
                            
                        }}}  
                        //////////
                        else if(flag==1&&flag2==2){
                           
                            {
                                System.out.println(l.check());
                         while (boat.positionX!=380) {
                            boat.addDeltaX(1);
                            chicken1.addDeltaX(1);
                            chicken1.update();
                            //Human.addDeltaX(1);
                            farmer.addDeltaX(1);
                            farmer.addDeltaY(0);
                            boat.update();
                            farmer.update();
                            //Human.update();
                         //  return 14;
                          
                        }   
                        }}
                        else if(flag==2&&flag2==2){
                           {
                         while (boat.positionX!=380) {
                             
                            boat.addDeltaX(1);
                            chicken1.addDeltaX(1);
                            chicken1.update();
                            //Human.addDeltaX(1);
                            farmer1.addDeltaX(1);
                            farmer1.addDeltaY(0);
                            boat.update();
                            farmer1.update();
                          //  Human.update();
                            
                          
                        }   
                        }}
                        else if(flag==3&&flag2==2){
                            {
                         while (boat.positionX!=380) {
                             
                            boat.addDeltaX(1);
                            chicken1.addDeltaX(1);
                            chicken1.update();
                            //Human.addDeltaX(1);
                            farmer2.addDeltaX(1);
                            farmer2.addDeltaY(0);
                            boat.update();
                            farmer2.update();
                            //Human.update();
                            
                          
                        }   
                        }}    else if(flag==4&&flag2==2){
                              {
                        while(boat.positionX !=380) {
                            boat.addDeltaX(1);
                            chicken1.addDeltaX(1);
                            chicken1.update();
                            //Human.addDeltaX(-1);
                            farmer3.addDeltaX(1);
                            farmer3.addDeltaY(0);
                            boat.update();
                           // Human.update();
                            farmer3.update();
                            
                        }}}////////////
                        else if(flag==1&&flag2==3){
                           
                            {
                               // System.out.println(l.check());
                         while (boat.positionX!=380) {
                            boat.addDeltaX(1);
                            chicken2.addDeltaX(1);
                            chicken2.update();
                            //Human.addDeltaX(1);
                            farmer.addDeltaX(1);
                            farmer.addDeltaY(0);
                            boat.update();
                            farmer.update();
                            //Human.update();
                         //  return 14;
                          
                        }   
                        }}
                        else if(flag==2&&flag2==3){
                           {
                         while (boat.positionX!=380) {
                             
                            boat.addDeltaX(1);
                            chicken2.addDeltaX(1);
                            chicken2.update();
                            //Human.addDeltaX(1);
                            farmer1.addDeltaX(1);
                            farmer1.addDeltaY(0);
                            boat.update();
                            farmer1.update();
                          //  Human.update();
                            
                          
                        }   
                        }}
                        else if(flag==3&&flag2==3){
                            {
                         while (boat.positionX!=380) {
                            boat.addDeltaX(1);
                            chicken2.addDeltaX(1);
                            chicken2.update();
                            //Human.addDeltaX(1);
                            farmer2.addDeltaX(1);
                            farmer2.addDeltaY(0);
                            boat.update();
                            farmer2.update();
                            //Human.update();
                            
                          
                        }   
                        }}    else if(flag==4&&flag2==3){
                              {
                        while(boat.positionX !=380) {
                            boat.addDeltaX(1);
                            chicken2.addDeltaX(1);
                            chicken2.update();
                            //Human.addDeltaX(-1);
                            farmer3.addDeltaX(1);
                            farmer3.addDeltaY(0);
                            boat.update();
                           // Human.update();
                            farmer3.update();
                            
                        }}}
                        ////////////
                        else if(flag==1&&flag2==4){
                           
                            {
                                //System.out.println(l.check());
                         while (boat.positionX!=380) {
                            boat.addDeltaX(1);
                            chicken3.addDeltaX(1);
                            chicken3.update();
                            //Human.addDeltaX(1);
                            farmer.addDeltaX(1);
                            farmer.addDeltaY(0);
                            boat.update();
                            farmer.update();
                            //Human.update();
                         //  return 14;
                          
                        }   
                        }}
                        else if(flag==2&&flag2==4){
                           {
                         while (boat.positionX!=380) {
                             
                            boat.addDeltaX(1);
                            chicken3.addDeltaX(1);
                            chicken3.update();
                            //Human.addDeltaX(1);
                            farmer1.addDeltaX(1);
                            farmer1.addDeltaY(0);
                            boat.update();
                            farmer1.update();
                          //  Human.update();
                            
                          
                        }   
                        }}
                        else if(flag==3&&flag2==4){
                            {
                         while (boat.positionX!=380) {
                            boat.addDeltaX(1);
                            chicken3.addDeltaX(1);
                            chicken3.update();
                            //Human.addDeltaX(1);
                            farmer2.addDeltaX(1);
                            farmer2.addDeltaY(0);
                            boat.update();
                            farmer2.update();
                            //Human.update();
                            
                          
                        }   
                        }}    else if(flag==4&&flag2==4){
                              {
                        while(boat.positionX !=380) {
                            boat.addDeltaX(1);
                            chicken3.addDeltaX(1);
                            chicken3.update();
                            //Human.addDeltaX(-1);
                            farmer3.addDeltaX(1);
                            farmer3.addDeltaY(0);
                            boat.update();
                           // Human.update();
                            farmer3.update();
                            
                        }}}//////////////
                        
                    }
                    
                
                                 
            else if(boat.positionX == 380 ) {
                if(flag==0&&flag2==0){
                    {
                        while(boat.positionX !=250) {
                            boat.addDeltaX(-1);
                            //Human.addDeltaX(-1);
                            boat.update();
                           // Human.update();
                           
                        }
                    }
                        }else if(flag==1&&flag2==0){
                            
                                
                            {
                        while(boat.positionX !=250) {
                            boat.addDeltaX(-1);
                            //Human.addDeltaX(-1);
                            farmer.addDeltaX(-1);
                            farmer.addDeltaY(0);
                            boat.update();
                            //Human.update();
                            farmer.update();
                            
                        }
                            }
                            
                        }else if(flag==2&&flag2==0){
                            {
                        while(boat.positionX !=250) {
                            boat.addDeltaX(-1);
                            //Human.addDeltaX(-1);
                            farmer1.addDeltaX(-1);
                            farmer1.addDeltaY(0);
                            boat.update();
                            //Human.update();
                            farmer1.update();
                            
                        }
                        }
  
                        }
                else if(flag==3&&flag2==0){
                   {
                        while(boat.positionX !=250) {
                            boat.addDeltaX(-1);
                            //Human.addDeltaX(-1);
                            farmer2.addDeltaX(-1);
                            farmer2.addDeltaY(0);
                            boat.update();
                           // Human.update();
                            farmer2.update();
                            
                        }}}
                        else if(flag==4&&flag2==0){
                              {
                        while(boat.positionX !=250) {
                            boat.addDeltaX(-1);
                            //Human.addDeltaX(-1);
                            farmer3.addDeltaX(-1);
                            farmer3.addDeltaY(0);
                            boat.update();
                           // Human.update();
                            farmer3.update();
                            
                        }}}     
                else if(flag==1&&flag2==1){
                           
                            {
                               // System.out.println(l.check());
                         while (boat.positionX!=250) {
                            boat.addDeltaX(-1);
                            //Human.addDeltaX(1);
                            farmer.addDeltaX(-1);
                            chicken.addDeltaX(-1);
                            chicken.update();
                            farmer.addDeltaY(0);
                            boat.update();
                            farmer.update();
                            //Human.update();
                         //  return 14;
                          
                        }   
                        }}
                        else if(flag==2&&flag2==1){
                           {
                         while (boat.positionX!=250) {
                             
                            boat.addDeltaX(-1);
                            chicken.addDeltaX(-1);
                            chicken.update();
                            //Human.addDeltaX(1);
                            farmer1.addDeltaX(-1);
                            farmer1.addDeltaY(0);
                            boat.update();
                            farmer1.update();
                          //  Human.update();
                            
                          
                        }   
                        }}
                        else if(flag==3&&flag2==1){
                            {
                         while (boat.positionX!=250) {
                            boat.addDeltaX(-1);
                            //Human.addDeltaX(1);
                            farmer2.addDeltaX(-1);
                            farmer2.addDeltaY(0);
                            chicken.addDeltaX(-1);
                            chicken.update();
                            boat.update();
                            farmer2.update();
                            //Human.update();
                            
                          
                        }   
                        }}    else if(flag==4&&flag2==1){
                              {
                        while(boat.positionX !=250) {
                            boat.addDeltaX(-1);
                            //Human.addDeltaX(-1);
                            farmer3.addDeltaX(-1);
                            farmer3.addDeltaY(0);
                            chicken.addDeltaX(-1);
                            chicken.update();
                            boat.update();
                           // Human.update();
                            farmer3.update();
                            
                        }}}  
                        //////////
                        else if(flag==1&&flag2==2){
                           
                            {
                               
                         while (boat.positionX!=250) {
                            boat.addDeltaX(-1);
                            chicken1.addDeltaX(-1);
                            chicken1.update();
                            //Human.addDeltaX(1);
                            farmer.addDeltaX(-1);
                            farmer.addDeltaY(0);
                            boat.update();
                            farmer.update();
                            //Human.update();
                         //  return 14;
                          
                        }   
                        }}
                        else if(flag==2&&flag2==2){
                           {
                         while (boat.positionX!=250) {
                             
                            boat.addDeltaX(-1);
                            chicken1.addDeltaX(-1);
                            chicken1.update();
                            //Human.addDeltaX(1);
                            farmer1.addDeltaX(-1);
                            farmer1.addDeltaY(0);
                            boat.update();
                            farmer1.update();
                          //  Human.update();
                            
                          
                        }   
                        }}
                        else if(flag==3&&flag2==2){
                            {
                         while (boat.positionX!=250) {
                             
                            boat.addDeltaX(-1);
                            chicken1.addDeltaX(-1);
                            chicken1.update();
                            //Human.addDeltaX(1);
                            farmer2.addDeltaX(-1);
                            farmer2.addDeltaY(0);
                            boat.update();
                            farmer2.update();
                            //Human.update();
                            
                          
                        }   
                        }}    else if(flag==4&&flag2==2){
                              {
                        while(boat.positionX !=250) {
                            boat.addDeltaX(-1);
                            chicken1.addDeltaX(-1);
                            chicken1.update();
                            //Human.addDeltaX(-1);
                            farmer3.addDeltaX(-1);
                            farmer3.addDeltaY(0);
                            boat.update();
                           // Human.update();
                            farmer3.update();
                            
                        }}}////////////
                        else if(flag==1&&flag2==3){
                           
                            {
                               // System.out.println(l.check());
                         while (boat.positionX!=250) {
                            boat.addDeltaX(-1);
                            chicken2.addDeltaX(-1);
                            chicken2.update();
                            //Human.addDeltaX(1);
                            farmer.addDeltaX(-1);
                            farmer.addDeltaY(0);
                            boat.update();
                            farmer.update();
                            //Human.update();
                         //  return 14;
                          
                        }   
                        }}
                        else if(flag==2&&flag2==3){
                           {
                         while (boat.positionX!=250) {
                             
                            boat.addDeltaX(-1);
                            chicken2.addDeltaX(-1);
                            chicken2.update();
                            //Human.addDeltaX(1);
                            farmer1.addDeltaX(-1);
                            farmer1.addDeltaY(0);
                            boat.update();
                            farmer1.update();
                          //  Human.update();
                            
                          
                        }   
                        }}
                        else if(flag==3&&flag2==3){
                            {
                         while (boat.positionX!=250) {
                            boat.addDeltaX(-1);
                            chicken2.addDeltaX(-1);
                            chicken2.update();
                            //Human.addDeltaX(1);
                            farmer2.addDeltaX(-1);
                            farmer2.addDeltaY(0);
                            boat.update();
                            farmer2.update();
                            //Human.update();
                            
                          
                        }   
                        }}    else if(flag==4&&flag2==3){
                              {
                        while(boat.positionX !=250) {
                            boat.addDeltaX(-1);
                            chicken2.addDeltaX(-1);
                            chicken2.update();
                            //Human.addDeltaX(-1);
                            farmer3.addDeltaX(-1);
                            farmer3.addDeltaY(0);
                            boat.update();
                           // Human.update();
                            farmer3.update();
                            
                        }}}
                        ////////////
                        else if(flag==1&&flag2==4){
                           
                            {
                                //System.out.println(l.check());
                         while (boat.positionX!=250) {
                            boat.addDeltaX(-1);
                            chicken3.addDeltaX(-1);
                            chicken3.update();
                            //Human.addDeltaX(1);
                            farmer.addDeltaX(-1);
                            farmer.addDeltaY(0);
                            boat.update();
                            farmer.update();
                            //Human.update();
                         //  return 14;
                          
                        }   
                        }}
                        else if(flag==2&&flag2==4){
                           {
                         while (boat.positionX!=250) {
                             
                            boat.addDeltaX(-1);
                            chicken3.addDeltaX(-1);
                            chicken3.update();
                            //Human.addDeltaX(1);
                            farmer1.addDeltaX(-1);
                            farmer1.addDeltaY(0);
                            boat.update();
                            farmer1.update();
                          //  Human.update();
                            
                          
                        }   
                        }}
                        else if(flag==3&&flag2==4){
                            {
                         while (boat.positionX!=250) {
                            boat.addDeltaX(-1);
                            chicken3.addDeltaX(-1);
                            chicken3.update();
                            //Human.addDeltaX(1);
                            farmer2.addDeltaX(-1);
                            farmer2.addDeltaY(0);
                            boat.update();
                            farmer2.update();
                            //Human.update();
                            
                          
                        }   
                        }}    else if(flag==4&&flag2==4){
                              {
                        while(boat.positionX !=250) {
                            boat.addDeltaX(-1);
                            chicken3.addDeltaX(-1);
                            chicken3.update();
                            //Human.addDeltaX(-1);
                            farmer3.addDeltaX(-1);
                            farmer3.addDeltaY(0);
                            boat.update();
                           // Human.update();
                            farmer3.update();
                            
                        }}}
                                }
                
            
            
            
            break;

            
               }
    } 
  
}
   

