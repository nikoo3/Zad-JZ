package sda.zadopp.ex3;

public class Rectangle extends Shape{
    protected double width;
    protected double length;


    public Rectangle(String color, boolean isFilled, double width, double length){
        super(color, isFilled);
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String getArea(){
        return String.valueOf(width*length);
    }

    @Override
    public String getPerimeter(){
        return String.valueOf(2*(width)+2*(length));
    }

    @Override
    public String toString(){
        return String.format("Rectangle with width at %d and length at %d which is a subclass off %s",width,length,super.toString());
    }
}
