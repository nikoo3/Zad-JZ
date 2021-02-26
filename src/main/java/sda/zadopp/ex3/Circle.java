package sda.zadopp.ex3;

public class Circle extends Shape{
    private int radius;

    public Circle(){
        String color = "unknown";
        boolean isFilled = false;
        int radius = 1; }

    public Circle (String color, boolean isFilled, int radius){
        super(color, isFilled);
        this.radius = radius; }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String getArea(){
        return String.valueOf(Math.PI * Math.pow(radius,2));
    }

    @Override
    public String getPerimeter(){
        return String.valueOf((2*Math.PI) * radius); }

    @Override
    public String toString() {
        return String.format("Circle with amount of radius at %i which is a subclass off %s", radius,super.toString()); }
}
