package Day_100_CaseStudy.Controller;

import Day_100_CaseStudy.Service.IEmployeeService;
import Day_100_CaseStudy.Service.impl.EmployeeService;
import Day_11_JavaCollectionFramework.bai_tap.service.IProductService;
import Day_11_JavaCollectionFramework.bai_tap.service.ProductService;

import java.util.Scanner;

public class FuramaController {

    private static final IEmployeeService service = new EmployeeService();

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


            int select = 0;
            do {
                System.out.println("-----Main menu------");
                System.out.println("1.Employee Management");
                System.out.println("2.Customer Management");
                System.out.println("3.Facility Management ");
                System.out.println("4.Booking Management");
                System.out.println("5.Promotion Management");
                System.out.println("6. Exit");

                select = Integer.parseInt(sc.nextLine());


                switch (select) {
                    case 1:
                        int select1 = 0;
                        do {

                            System.out.println("1.Display list employees");
                            System.out.println("2.Add new employee");
                            System.out.println("3.Delete employee ");
                            System.out.println("4.Edit employee");
                            System.out.println("5.Return main menu");


                            select1 = Integer.parseInt(sc.nextLine());


                            switch (select1) {
                                case 1:
                                    service.displayEmployee();
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    break;
                                case 5:
                                    break;
                                default:
                                    System.out.println("Input again ");
                            }
                            break;
                        } while (true);
                    case 2:
                        int select2 = 0;
                        do {

                            System.out.println("1.Display list customers");
                            System.out.println("2.Add new customer");
                            System.out.println("3.Edit customer");
                            System.out.println("4.Return main menu");


                            select2 = Integer.parseInt(sc.nextLine());


                            switch (select2) {
                                case 1:
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    break;
                                case 5:
                                    break;
                                default:
                                    System.out.println("Input again ");
                            }
                            break;
                        } while (true);

                    case 3:

                        int select3 = 0;
                        do {

                            System.out.println("1\tDisplay list facility");
                            System.out.println("2\tAdd new facility");
                            System.out.println("3\tDisplay list facility maintenance");
                            System.out.println("4\tReturn main menu");


                            select3 = Integer.parseInt(sc.nextLine());


                            switch (select3) {
                                case 1:
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    break;
                                case 5:
                                    break;
                                default:
                                    System.out.println("Input again ");
                            }
                            break;
                        } while (true);

                    case 4:
                        int select4 = 0;
                        do {

                            System.out.println("1.Add new booking");
                            System.out.println("2.Display list booking");
                            System.out.println("3.Return main menu");


                            select4 = Integer.parseInt(sc.nextLine());


                            switch (select4) {
                                case 1:
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    break;
                                case 5:
                                    break;
                                default:
                                    System.out.println("Input again ");
                            }
                            break;
                        } while (true);

                    case 5:
                        int select5 = 0;
                        do {

                            System.out.println("1.Display list customers use service");
                            System.out.println("2.Display list customers get voucher");
                            System.out.println("3.Return main menu");

                            select5 = Integer.parseInt(sc.nextLine());
                            switch (select5) {
                                case 1:
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    break;
                                case 5:
                                    break;
                                default:
                                    System.out.println("Input again ");
                            }
                            break;
                        } while (true);


                    case 6:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Input again ");
                }
            } while (true);

        }
    }

