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
public class context {
private ImoveStrategy strategy;
public void setContext(ImoveStrategy strategy){
    this.strategy = strategy;
}
public void direct(){
    strategy.move();
}
}
