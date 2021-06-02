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
public class Controller {
     GuiLogic gl=new GuiLogic();
     moveboat b = new moveboat();
     moveCarrot c = new moveCarrot();
     moveTiger t = new moveTiger();
     moveRabbit r = new moveRabbit();
     ImoveStrategy f;
     context ctx = new context();
    public void test(String s){
       
        if(s == "R"){
            ctx.setContext(new moveRabbit());
        ctx.direct();
        }
        else if(s == "C")
          c.move();

        else if(s == "F"){
            ctx.setContext(new moveTiger());
        ctx.direct();
        }
          
        else if(s == "Z"){
            ctx.setContext(new moveboat());
        ctx.direct();
        }
            
    }
    
    
    
}
