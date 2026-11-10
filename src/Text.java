import java.awt.*;

public class Text extends Image {
    // TODO: come up with member variables for Text
    private String string;
    private Point point;

    // TODO: create constructor for Text
    public Text(Point point, Color color, String string) {
        super(color);
        this.string = string;
        this.point = point;

    }

    // TODO: implement draw method for Text
    @Override
    public void draw(Graphics graphics) {
        colorDrawing(graphics);
        graphics.drawString(string, point.x, point.y);
    }
}
