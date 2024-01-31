package Shape;

import Point.Point2d;

import java.util.Collection;

public class Ellipse extends BaseShape {
    /** TODO
     * Create a filled Ellipse that is centered on (0, 0)
     * @param widthDiameter Width of the Ellipse
     * @param heightDiameter Height of the Ellipse
     *                       The equation is : x/a pow 2 +
     */
    public Ellipse(Double widthDiameter, Double heightDiameter) {
        Double a = widthDiameter/2;
        Double b = heightDiameter/2;
        for (double i = -a; i <= a; i += 0.5) {
            for (double j = -b; j <= b; j += 0.5) {
                if (Math.pow(i/a, 2) + Math.pow(j/b, 2) <= 1) {
                    this.add(new Point2d(i,j));
                }
            }
        }
    }
    /** TODO
     * Create a filled Ellipse that is centered on (0,0)
     * @param dimensions 2D point containing the width and height of the Ellipse
     */
    public Ellipse(Point2d dimensions) {
        this(dimensions.X(), dimensions.Y());
    }

    /**
     * Create an Ellipse from a given collection of 2D points
     * @param coords Collection of 2D points
     */
    private Ellipse(Collection<Point2d> coords) {
        super(coords);
    }

    /** TODO
     * @return Deep Copy of the Ellipse
     */
    @Override
    public Ellipse clone() {
        return new Ellipse(getCoords());
    }
}
