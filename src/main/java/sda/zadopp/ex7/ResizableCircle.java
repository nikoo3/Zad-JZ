package sda.zadopp.ex7;

public class ResizableCircle extends Circle implements Resizable{
    int percent;

    public ResizableCircle(float r) {
        super(r);
    }

    @Override
    public void resize(int percent){
        r = r * percent / 100;
    }

    @Override
    public String toString() {
        return "ResizableCircle{" +
                "r=" + r +
                '}';
    }
}
