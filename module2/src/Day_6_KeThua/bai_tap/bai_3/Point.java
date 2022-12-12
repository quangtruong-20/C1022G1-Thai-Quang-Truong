package Day_6_KeThua.bai_tap.bai_3;

public class Point {
    private float x = 0;
    private float y = 0;

    public Point() {
    }

    public Point(float x, float y) {
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
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
///class con
class MovablePoint extends Point {
    private float xSpeed = 0;
    private float ySpeed = 0;

    public MovablePoint() {
    }

    public MovablePoint(float x, float y , float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed= xSpeed;
        this.ySpeed = ySpeed;

    }
    public  MovablePoint(float xSpeed,float ySpeed){
        this.xSpeed= xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
public void setSpeed(float xSpeed,float ySpeed){
        this.ySpeed=ySpeed;
        this.xSpeed=xSpeed;
}
    public float[] getSpeed() {
        float arr [] = {this.xSpeed,this.ySpeed};
        return arr;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + getX() +
                ", ySpeed=" + getY() +"xSpeed= "+getxSpeed()+" ySpeed="+getySpeed()+
                '}';
    }
    public MovablePoint move(){
            setX(getX()+this.xSpeed);
            setY(getY()+this.ySpeed);
            return this;
    }
}