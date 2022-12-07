package Day_4_ClassAndObject.Baitap.Fan;

import Day_4_ClassAndObject.Baitap.Fan.Fan;

public class MainFan {
    public static void main(String[] args) {
       Fan fan = new Fan();
       Fan fan1= new Fan(3,10,"yellow",true);
       Fan fan2 = new Fan(2,5,"blue",true);
        System.out.println(fan.toString());
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());

    }
}
