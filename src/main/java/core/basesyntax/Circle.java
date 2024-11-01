package core.basesyntax;

public class Circle extends Figure implements AreaCalculator {

    private int radius;

    public Circle(String color, String name, int radius) {
        super(color, name);
        this.radius = radius;
    }


    @Override
    public int calculateArea() {
        return radius * radius * (int) Math.PI;

    }

    @Override
    public String toString() {
        return "Figure:"
                + "name: "
                + super.getName()
                + ", "
                + "area: "
                + calculateArea()
                + " sq. units, "
                + "radius: "
                + radius
                + ", "
                + "color: "
                + super.getColor();
    }
}