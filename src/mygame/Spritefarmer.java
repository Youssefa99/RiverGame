/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

/**
 *
 * @author feras
 */
public class Spritefarmer extends Icrosser2 {
    Image image;
    static double positionX;
    static double positionY;
    private double width;
    private double height;
    private double deltaX;
    private double deltaY;
   

    public Spritefarmer(Image image){
        super();
        this.image = image;
        Spritefarmer.positionX=130;
        Spritefarmer.positionY=280;
        height=image.getHeight();
        width=image.getWidth();
        this.weight = 90;
    }

   
    public void setImage(Image image) {
        this.image = image;
    }

    public void setPositionX(double positionX) {
        Spritefarmer.positionX = positionX;
    }

    public void setPositionY(double positionY) {
        Spritefarmer.positionY = positionY;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public void Display(GraphicsContext gc){
        gc.drawImage(image, positionX, positionY);
        
    }
    public void addDeltaX(double x){
        this.deltaX=x;
    }
       public void addDeltaY(double y){
        this.deltaY=y;
    }

    void update() {
this.positionX+=deltaX;
this.positionY+=deltaY;
    }
            
}
