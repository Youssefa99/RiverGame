package mygame;

import javafx.scene.image.Image;
import javafx.scene.canvas.GraphicsContext;


public class SpriteBoat {
    Image image;
    static double positionX;
    static double positionY;
    private double width;
    private double height;
    static double deltaX;
    static double deltaY;

    public SpriteBoat(Image image){
        this.image = image;
        this.positionX=250;
        this.positionY=350;
        height=image.getHeight();
        width=image.getWidth();
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
