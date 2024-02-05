package Letter;

import Point.Point2d;
import Shape.*;

public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;


    /** TODO
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A()  {
        BaseShape shape = new BaseShape();

        Rectangle line1 = new Rectangle(halfStripeThickness,maxHeight);
        Rectangle line2 = new Rectangle(halfStripeThickness,maxHeight);
        Rectangle line3 = new Rectangle(stripeThickness,halfStripeThickness);

        Point2d point1 = new Point2d(-15.0,0.0);
        Point2d point2 = new Point2d(15.0,0.0);
        Point2d point3 = new Point2d(0.0,0.0);
        double angle1 = Math.toRadians(8);
        double angle2 = Math.toRadians(-8);

        line1.translate(line1.getCoords(), point1);
        line1.rotate(line1.getCoords(), angle1);
        line2.translate(line2.getCoords(), point2);
        line2.rotate(line2.getCoords(), angle2);
        line3.translate(line3.getCoords(), point3);
        shape = line1.add(line2).add(line3);

        return shape;
    }


    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        return null;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        Ellipse el1 = new Ellipse(maxWidth, maxHeight);
        Ellipse el2 = new Ellipse(maxWidth,halfMaxHeight);

        Point2d point1 = new Point2d(-15.0,0.0);
        Point2d point2 = new Point2d(4.0,0.0);

        el1.translate(el1.getCoords(), point1);
        el2.translate(el2.getCoords(), point2);
        return el1.remove(el2);
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        Rectangle left = new Rectangle(halfStripeThickness - 3,maxHeight);
        Rectangle up = new Rectangle(halfStripeThickness - 3, halfMaxHeight);
        Rectangle middle = up.clone();
        Rectangle down = up.clone();


        up.rotate(up.getCoords(), -Math.PI/2);
        middle.rotate(middle.getCoords(), -Math.PI/2);
        down.rotate(down.getCoords(), -Math.PI/2);

        left.translate(left.getCoords(), new Point2d(-halfMaxWidth-4, 0.0));
        up.translate(up.getCoords(), new Point2d(0.0, -halfMaxHeight));
        down.translate(down.getCoords(), new Point2d(0.0, halfMaxHeight));


        left.add(up);
        left.add(middle);
        left.add(down);




        return left;
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        BaseShape shape = new BaseShape();
        Rectangle rectangle1 = new Rectangle(stripeThickness,maxHeight);
        Rectangle rectangle2 = new Rectangle(stripeThickness,maxHeight);
        Rectangle rectangle3 = new Rectangle(stripeThickness,stripeThickness);

        Point2d point1 = new Point2d(-20.0,0.0);
        Point2d point2 = new Point2d(20.0,0.0);
        Point2d point3 = new Point2d(0.0,0.0);

        rectangle1.translate(rectangle1.getCoords(), point1);
        rectangle2.translate(rectangle2.getCoords(), point2);
        rectangle3.translate(rectangle3.getCoords(), point3);
        shape = rectangle1.add(rectangle2).add(rectangle3);
        return shape;
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        Rectangle r1 = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle r2 = r1.clone();
        Rectangle r3 = new Rectangle(halfStripeThickness, maxHeight+2);
        r2.translate(r2.getCoords(), new Point2d(maxWidth, 0.0));
        r3.rotate(r3.getCoords(), -0.40);
        r3.translate(r3.getCoords(), new Point2d(maxWidth*0.5, 0.0));
        r1.add(r2);
        return r1.add(r3);
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        Ellipse e1 = new Ellipse(maxWidth, maxHeight);
        Ellipse e2 = new Ellipse(maxWidth-stripeThickness, maxHeight-stripeThickness);
        e1.remove(e2);
        return e1;
    }
}
