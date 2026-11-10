import java.awt.*;

public class SolidPolygon extends Polygon_ {

    public SolidPolygon(Color color, int vertexCount) {
        super(color, vertexCount);
    }

    // Same as Hollow Polygon, except fillPolygon is used
    @Override
    public void drawPolygon(Graphics graphics, Polygon polygon) {
        graphics.drawPolygon(polygon);
        graphics.fillPolygon(polygon);
    }
}
