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
public class Spritefarmer3 extends Icrosser2 {
    Image image;
    static double positionX;
    static double positionY;
    private double width;
    private double height;
    private double deltaX;
    private double deltaY;
    

    public Spritefarmer3(Image image){
        super();
        this.image = image;
        this.positionX=20;
        this.positionY=280;
        height=image.getHeight();
        width=image.getWidth();
        this.weight = 40;
    }

   
    public void setImage(Image image) {
        this.image = image;
    }

    public void setPositionX(double positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(double positionY) {
        this.positionY = positionY;
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
