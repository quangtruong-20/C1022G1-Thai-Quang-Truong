package Day_6_KeThua.thuc_hanh;

public class CirclesTest {
    public static void main(String[] args) {
        Circles circles = new Circles();
        System.out.println(circles);

        circles = new Circles(3.5);
        System.out.println(circles);

        circles = new Circles(3.5,"indigo",false);
        System.out.println(circles);
    }
}
