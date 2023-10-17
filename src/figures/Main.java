package figures;
public class Main {
    public static void main(String[] args) {
        Areaable[] areas = new Areaable[3];
        areas[0] = new Circle(12.4);
        areas[1] = new Triangle(1.3, 1.4, 2.1);
        areas[2] = new Square(5.3);

        double totalArea = 0.0;
        for (Areaable area : areas) {
            totalArea += area.findArea();
        }

        System.out.printf("The total area of all figures: %.2f cm^2.", totalArea);
    }
}
