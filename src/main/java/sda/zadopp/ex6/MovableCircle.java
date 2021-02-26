package sda.zadopp.ex6;

public class MovableCircle implements Movable{

    private float r;

    private MovablePoint movablePoint;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, float r){
        this.r = r;
        this.movablePoint = new MovablePoint(x,y,xSpeed,ySpeed);
    }

    @Override
    public void moveUp() {
        movablePoint.moveUp();
    }

    @Override
    public void moveDown() {
        movablePoint.moveDown();
    }

    @Override
    public void moveLeft() {
        movablePoint.moveLeft();
    }

    @Override
    public void moveRight() {
        movablePoint.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "r=" + r +
                ", movablePoint=" + movablePoint +
                '}';
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }
}
