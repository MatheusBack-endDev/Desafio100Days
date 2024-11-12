package dia05.entities;

import dia05.entities_enums.Color;

public abstract class Shape {

    private Color color;

    public Shape(){

    }

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();
}
