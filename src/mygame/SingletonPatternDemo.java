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
public class SingletonPatternDemo {
public static void create(Image image){
    SpriteBackground object = SpriteBackground.getinstance(image);
}    
}
