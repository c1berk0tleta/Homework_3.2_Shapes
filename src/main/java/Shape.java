import java.awt.*;
public abstract class Shape {
    public int x,y,length,width;
    String color;

    void equals(){};

    abstract void draw(Graphics t, int x, int y, int length, int width);
}

