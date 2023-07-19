public class Circle {
    private double PI;

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;

    }

    @Override
    public String toString() {
        return "PI: " + PI;
    }

    public Circle(double PI) {
        this.PI = PI;


    }

    public static void circumFerence(double PI, int radius) {
        System.out.println(2*PI*radius + " :Circumference");

    }


    public static void Area(double PI) {
       int radius = 3 * 3;
        System.out.println(PI * radius + " :Area");
    }
}