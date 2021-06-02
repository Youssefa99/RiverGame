/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;
import javafx.scene.image.Image;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author hppp
 */
public class SpriteHuman {
    Image image;
    static double positionX;
    static double positionY;
    private double width;
    private double height;
    static double deltaX;
    static double deltaY;

    public SpriteHuman(Image image){
        this.image = image;
        this.positionX=300;
        this.positionY=270;
        height=image.getHeight();
        width=image.getWidth();
    }

    SpriteHuman() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        
    }    public void addDeltaX(double x){
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
