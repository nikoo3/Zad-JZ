package sda.zadopp.ex3;

public class Square extends Rectangle{
    public Square(String color, boolean isFilled, double size) {
        super(color, isFilled, size, size); }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width); }

    @Override
    public void setLength(double length) {
        super.setWidth(length);
        super.setLength(length); }

    @Override
    public String toString() {
        return String.format("Square with width=%d and length=%d which is subclass off %s",super.width,super.length,super.toString()); }
}
