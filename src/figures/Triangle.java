package figures;

public class Triangle implements Areaable{
    private double aSideLength;
    private double bSideLength;
    private double cSideLength;

    private final double halfPerimeter = (aSideLength + bSideLength + cSideLength) / 2;

    public Triangle(double aSideLength, double bSideLength, double cSideLength) {
        this.aSideLength = aSideLength;
        this.bSideLength = bSideLength;
        this.cSideLength = cSideLength;
    }

    public void setaSideLength(double aSideLength) {
        this.aSideLength = aSideLength;
    }

    public void setbSideLength(double bSideLength) {
        this.bSideLength = bSideLength;
    }

    public void setcSideLength(double cSideLength) {
        this.cSideLength = cSideLength;
    }

    @Override
    public double findArea() {
        return Math.sqrt(halfPerimeter * (halfPerimeter - aSideLength) *
                (halfPerimeter - bSideLength) * (halfPerimeter - cSideLength));
    }
}
