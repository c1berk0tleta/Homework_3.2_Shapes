import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        BufferedImage Output = new BufferedImage(1000, 1000, BufferedImage.TYPE_INT_RGB);
        Graphics graph = Output.createGraphics();

        Circle l = new Circle();
        l.get(80, 100, 100, 100);

        Rectangle r = new Rectangle();
        r.get(200, 100, 200, 100);

        Shape[] m = {l,r};

        for(int i = 0; i < m.length; i++){
            m[i].draw(graph, m[i].x, m[i].y, m[i].length, m[i].width);
        }

        File OutSh = new File("Shapes.png");
        try {
            ImageIO.write(Output, "png", OutSh);
        } catch (IOException except) {
            except.printStackTrace();
        }

    }
}
