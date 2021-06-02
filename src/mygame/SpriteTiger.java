package mygame;
import javafx.scene.image.Image;
import javafx.scene.canvas.GraphicsContext;


public class SpriteTiger extends Icrosser {
    Image image;
    static double positionX;
    static double positionY;
    private double width;
    private double height;
    private double deltaX;
    private double deltaY;
    int eatingRank;
    int idx;

    public SpriteTiger(Image image){
        super();
        this.image = image;
        this.positionX=95;
        this.positionY=280;
        height=image.getHeight();
        width=image.getWidth();
        this.eatingRank = 4;
        this.idx = 1;
        
    }

    SpriteTiger() {
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
