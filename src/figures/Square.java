package figures;

public class Square implements Areaable {

    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double findArea() {
        return Math.pow(sideLength, 2);
    }
}
