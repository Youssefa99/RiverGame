/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author feras
 */
public class invoker {
    private List<Icommand> decision = new ArrayList<Icommand>();
    public void action(Icommand command){
        decision.add(command);
        
    }
    public void execute(){
        int i=0;
        for(Icommand command : decision){
            decision.get(i).move();
        }
        decision.clear();
    }
}
