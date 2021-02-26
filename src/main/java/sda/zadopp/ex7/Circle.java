package sda.zadopp.ex7;

public class Circle implements GeometricObject {

    protected float r;

    public Circle(float r){
        this.r = r;
    }

    @Override
    public double getPetimeter() {
        return 2*Math.PI * r;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(r,2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }
}
