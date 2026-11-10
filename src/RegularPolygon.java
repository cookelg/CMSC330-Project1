import java.awt.*;
import java.util.ArrayList;
import java.util.List;

// Class that defines a hollow rectangle object

class RegularPolygon extends SolidPolygon {

    // Constructor that initializes the vertices of the rectangle

    public RegularPolygon(Color color, Point upperLeft, int sides, int radius) {
        super(color, sides);
        List<Long> xPointArr = new ArrayList<>();
        List<Long> yPointArr = new ArrayList<>();
        for (int i = 0; i < sides; i++) {
            double u = (2 * Math.PI * i) / sides;
            xPointArr.addAll(List.of(
                    Math.round((radius * Math.cos(u)) + upperLeft.x)));
            yPointArr.addAll(List.of(
                    Math.round((radius * Math.sin(u)) + upperLeft.y)));
        }
        int[] x_points = new int[xPointArr.size()];
        int[] y_points = new int[yPointArr.size()];
        for (int i = 0; i < x_points.length; i++) {
            x_points[i] = xPointArr.get(i).intValue();
            y_points[i] = yPointArr.get(i).intValue();
        }
        createPolygon(x_points, y_points);
    }
}
