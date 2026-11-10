import java.awt.*;

// Class that defines a hollow rectangle object

class Isosceles extends SolidPolygon {

    // Constructor that initializes the vertices of the rectangle

    public Isosceles(Color color, Point upperLeft, int height, int width) {
        super(color, 3);
        int[] x_points = { upperLeft.x - width / 2, upperLeft.x, upperLeft.x + width / 2 };
        int[] y_points = { upperLeft.y + height, upperLeft.y, upperLeft.y + height };
        createPolygon(x_points, y_points);
    }
}
