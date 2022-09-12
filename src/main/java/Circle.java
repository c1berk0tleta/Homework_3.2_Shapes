import java.awt.*;

public class Circle extends Shape {

    void get(int a, int b, int l, int w){
        super.x = a;
        super.y = b;
        super.length = l;
        super.width = w;
    }

    @Override
    void draw(Graphics t, int x, int y, int length, int width) {
        t.drawOval(x, y, length, width);

    }

    @Override
    void equals() {
        super.equals();
    }

}