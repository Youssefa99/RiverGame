/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

import java.util.List;

/**
 *
 * @author feras
 */
public class Crossers implements GameController {
    public List<Icrosser> getInitials(){
      return Mygame.initial1;  
    
}
    public List<Icrosser2> getInitials1(){
        return Secondlevel.initial2;
    }
    public List<Icrosser> rightSide1(){
        return Mygame.rightSide;
    }
    public List<Icrosser> leftSide(){
        return Mygame.leftSide;
    }
    public List<Icrosser2> leftSide1(){
        return Secondlevel.leftSide;
    }
    public List<Icrosser2> rightSide2(){
        return Secondlevel.rightSide;
    }
    
    
}
