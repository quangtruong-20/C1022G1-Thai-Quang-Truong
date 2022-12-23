package Day_16.bai_tap.controller;


import Day_16.bai_tap.model.Product;
import Day_16.bai_tap.service.IProductService;
import Day_16.bai_tap.service.ProductService;

import java.io.*;
import java.util.List;
import java.util.Scanner;

import static Day_16.bai_tap.repository.ProductRepository.productList;

public class ProductController {
    private static final String FILE_PATH = "D:\\codegym\\module2\\src\\Day_16\\bai_tap\\data\\product.dat";
    private static final IProductService service = new ProductService();
    public static void writeObjectList(List<Product> productList) throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(productList);
        oos.close();
    }
    public static List<Product> readObjectList() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(FILE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Product> productList = (List<Product>) ois.readObject();
        ois.close();
        return productList;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        mainMenu();
        writeObjectList(productList);
    }

    public static void mainMenu() throws IOException, ClassNotFoundException {

        Scanner scanner = new Scanner(System.in);
        int select = 0;
        do {
            System.out.println("1. Add New Student.\n" +
                    "2. Display menu.\n" +
                    "3. Find product.\n" +
                    "4. Exit");

            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    System.out.println("Enter code: ");
                    String code = scanner.nextLine();
                    System.out.println("Enter name: ");
                    String name = scanner.nextLine();

                    System.out.println("Enter manufacturer: ");
                    String manufacturer = scanner.nextLine();

                    System.out.println("Enter price: ");
                    int price = Integer.parseInt(scanner.nextLine());

                    System.out.println("Enter otherDescriptions: ");
                    String otherDescriptions = scanner.nextLine();

                    System.out.println("Add new student complete! Enter to continue...");
                    Product product = new Product(code, name, manufacturer, price, otherDescriptions);
                    service.addProduct(product);


                    break;
                case 2:
                    service.display();
                    break;
                case 3:
                    System.out.println("Enter code to find: ");
                    String code1 = scanner.nextLine();

                    service.findByCode(code1);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Fail! Moi ban chon lai! Enter de tiep tuc");
                    scanner.nextLine();
                    mainMenu();


            }
        } while (true);


    }


}
