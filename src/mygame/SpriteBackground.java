package mygame;
import javafx.scene.image.Image;
import javafx.scene.canvas.GraphicsContext;


public class SpriteBackground {
    Image image;
    private double positionX;
    private double positionY;
    private double width;
    private double height;
    private static SpriteBackground obj;

    private SpriteBackground(Image image){
        this.image = image;
        this.positionX=0;
        this.positionY=0;
        height=image.getHeight();
        width=image.getWidth();
    }
    public static SpriteBackground getinstance(Image image){
        if(obj == null)
            obj = new SpriteBackground(image);
        return obj;
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
}
