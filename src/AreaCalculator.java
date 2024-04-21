public class AreaCalculator {

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        return Math.PI * Math.pow(radius, 2);
    }

    public static double area(double length, double width) {
        if (length < 0 || width < 0) {
            return -1.0;
        }
        return length * width;
    }
}
