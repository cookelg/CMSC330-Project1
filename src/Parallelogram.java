import java.awt.*;

// Class that defines a hollow rectangle object

class Parallelogram extends SolidPolygon {

    // Constructor that initializes the vertices of the rectangle

    public Parallelogram(Color color, Point upperLeft, Point bottomRight, int offSet) {
        super(color, 4);
        int[] x_points = { upperLeft.x + offSet, bottomRight.x + offSet, bottomRight.x, upperLeft.x };
        int[] y_points = { upperLeft.y, upperLeft.y, bottomRight.y, bottomRight.y };
        createPolygon(x_points, y_points);
    }
}
