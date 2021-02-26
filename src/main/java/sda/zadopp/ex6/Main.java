package sda.zadopp.ex6;

public class Main {

    public static void main(String[] args) {
        Movable movablePoint = new MovablePoint(43,32,4,3);
        System.out.println(movablePoint);
        movablePoint.moveUp();
        movablePoint.moveRight();
        movablePoint.moveDown();
        movablePoint.moveDown();
        movablePoint.moveDown();
        System.out.println(movablePoint);
        movablePoint.moveLeft();
        movablePoint.moveLeft();
        movablePoint.moveLeft();
        System.out.println(movablePoint);
    }
}
