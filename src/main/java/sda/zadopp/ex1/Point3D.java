package sda.zadopp.ex1;

public class Point3D extends Point2D{
    private float z;

    public Point3D(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Point3D(float x,float y,float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setXYZ(float x,float y,float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float[] getXYZ(){
        return new float[] {x,y,z};
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
}


