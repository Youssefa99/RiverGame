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


public class getWeight implements Crossing2  {

    @Override
    public int weight(){
    int size;
    size = Secondlevel.boatRiders.size();
    int i;
    int mass = 0;
    for(i=0 ; i<size ; i++){
     mass = mass + Secondlevel.boatRiders.get(i).weight;
     
    }
return mass;
    }
    
    
    public boolean isValid(){
    if(Secondlevel.boatRiders.contains(Secondlevel.farmer) || Secondlevel.boatRiders.contains(Secondlevel.farmer1) || Secondlevel.boatRiders.contains(Secondlevel.farmer2) || Secondlevel.boatRiders.contains(Secondlevel.farmer3) )
        return true;
                else
        return false;
}
    public boolean checkRightSide(){
        System.out.println(Secondlevel.rightSide.size());
        if(Secondlevel.rightSide.size() == 8)
            return true;
        else
            return false;
    }

}
