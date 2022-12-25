package Day_11_JavaCollectionFramework.bai_tap.controller;


import Day_11_JavaCollectionFramework.bai_tap.model.Product1;
import Day_11_JavaCollectionFramework.bai_tap.service.IProductService;
import Day_11_JavaCollectionFramework.bai_tap.service.ProductService;

import java.util.Scanner;

public class ProductController {

    private static final IProductService service = new ProductService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select = 0;
        do {
            System.out.println("-----Product Manager------");
            System.out.println("1. List");
            System.out.println("2. Add");
            System.out.println("3. Delete");
            System.out.println("4. EditInformation");
            System.out.println("5. Find");
            System.out.println("6. Sort");
            System.out.println("7. Exit");

            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1: //list
                    service.findAll();
                    break;
                case 2: //add
                    System.out.print("Input Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Input ID: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Input Price: ");
                    int price = Integer.parseInt(scanner.nextLine());
                    Product1 product = new Product1(name, id, price);
                    service.add(product);
                    break;
                case 3:  // delete
                    System.out.print("Input ID: ");
                    int id1 = Integer.parseInt(scanner.nextLine());
                    service.deleteProduct(id1);
                    break;
                case 4: // edit
                    System.out.println("Input Id: ");
                    int id4 = Integer.parseInt(scanner.nextLine());

                    Product1 c = service.findById(id4);

                    if (c != null) {

                        System.out.println("Input Name: ");
                        String name4 = scanner.nextLine();
                        System.out.println("Input Price: ");
                        int price4 = Integer.parseInt(scanner.nextLine());

                        c.setName(name4);
                        c.setPrice(price4);

                        service.update(c);
                    } else {
                        System.out.println("Not exited");
                    }


                    break;
                case 5: //find
                    System.out.println("Input Name: ");
                    String name5 = scanner.nextLine();
                    service.findProduct(name5);
                    break;
                case 6://sort
                    service.sortProduct();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Input again ");
            }
        } while (true);
    }

}
