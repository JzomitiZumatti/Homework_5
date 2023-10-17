package figures;

public class Circle implements Areaable{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
