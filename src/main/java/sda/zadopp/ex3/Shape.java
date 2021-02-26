package sda.zadopp.ex3;

import javax.sql.rowset.serial.SerialStruct;

public abstract class Shape {

    protected String color;
    protected boolean isFilled;

    public Shape(){
        String color = "unknown";
        boolean isFilled = false;
    }

    public Shape(String color, boolean isFilled){
        this.color = color;
        this.isFilled = isFilled;
    }

    public abstract String getArea();

    public abstract String getPerimeter();

    @Override
    public String toString() {
        return String.format("Shape with color of %s and it's %s",color,isFilled ? "filled":"notFilled");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }
}
