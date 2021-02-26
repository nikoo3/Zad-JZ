package sda.zadopp.ex1;

//       ROZWIĄZANIE ZAD. 5

public class Line {

    private Point2D fstPoint;
    private Point2D secPoint;

    public Line(Point2D fstPoint, Point2D secPoint) {
        this.fstPoint = fstPoint;
        this.secPoint = secPoint;
    }

    public Line(float sx,float sy,float ex, float ey) {
        this.fstPoint = new Point2D(sx,sy);
        this.secPoint = new Point2D(ex,ey);
    }

    public String getFstPoint() {
        return fstPoint.toString();
    }

    public void setFstPoint(Point2D fstPoint) {
        this.fstPoint = fstPoint;
    }

    public String getSecPoint() {
        return secPoint.toString();
    }

    public void setSecPoint(Point2D secPoint) {
        this.secPoint = secPoint;
    }

    public float distanceBetweenPoints(){
        return (float) Math.sqrt(Math.pow(secPoint.x - fstPoint.x,2)+Math.pow(secPoint.y - fstPoint.y,2));
    }

    public String getMiddlePoint() {
        float xMiddle = (fstPoint.x + secPoint.x) / 2;
        float yMiddle = (fstPoint.y + secPoint.y) / 2;
        return new Point2D(xMiddle, yMiddle).toString();
    }
}

