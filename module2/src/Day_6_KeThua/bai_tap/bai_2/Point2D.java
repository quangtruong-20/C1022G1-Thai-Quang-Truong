package Day_6_KeThua.bai_tap.bai_2;

import java.util.Arrays;

public class  Point2D {
    private float x = 0;
    private float y = 0;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] result = {this.x, this.y};
        return result;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + getX() +
                ", y=" + getY() +
                '}';
    }
}

class Point3D extends Point2D {
    private float z = 0;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.setZ(z);
        this.setX(x);
        this.setY(y);
    }

    public float[] getXYZ() {
        float[] result = {this.getX(), this.getY(), this.z};
        return result;
    }

    @Override
    public String toString() {
        return "Point3D" +
                Arrays.toString(getXYZ())
                ;
    }
}