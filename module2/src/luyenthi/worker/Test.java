package luyenthi.worker;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        IWS service = new WS();

        Scanner sc = new Scanner(System.in);

        int select = 0;

        do {
            System.out.println("1.display\n" +
                    "2.add\n" +
                    "3.find\n" +
                    "0.exit");
            select = Integer.parseInt(sc.nextLine());
            switch (select) {
                case 1:
                    service.display();
                    break;
                case 2:
                    System.out.println("id");
                    String id = sc.nextLine();
                    System.out.println("name");
                    String name = sc.nextLine();
                    System.out.println("address");
                    String adress = sc.nextLine();
                    Worker worker = new Worker(id, name, adress);
                    service.add(worker);
                    break;
                case 3:
                    System.out.println("name");
                    String name3 = sc.nextLine();
                    service.find(name3);
                    break;
                case 0:
                    break;
            }
        } while (true);
    }
}
