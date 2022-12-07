package Day_4_ClassAndObject.Baitap.Fan;

public class Fan {


    public  final int SLOW  = 1;
    public  final int MEDIUM  = 2;
    public  final int FAST  = 3;

    private int speed;
    private boolean on ;
    private double radius;
    private String color;

    public Fan(){
        this.color= "blue";
        this.on = false;
        this.radius= 5;
        this.speed= SLOW;
    }
    public Fan(int speed,double radius, String color, boolean on){
        this.speed = speed;
        this.radius = radius;
        this.color=color;
        this.on= on;
    }

    @Override
    public String toString() {

        String statusFan = this.on ? " Fan is on " : " Fan is off ";
        return "Fan{" +
                "speed=" + speed + " " +
                 statusFan +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

}
