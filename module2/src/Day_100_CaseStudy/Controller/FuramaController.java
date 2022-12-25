package Day_100_CaseStudy.Controller;

import Day_100_CaseStudy.Model.Customer;
import Day_100_CaseStudy.Model.Date;
import Day_100_CaseStudy.Model.Employee;
import Day_100_CaseStudy.Model.enum_model.Education;
import Day_100_CaseStudy.Model.enum_model.Gender;
import Day_100_CaseStudy.Model.enum_model.Position;
import Day_100_CaseStudy.Model.enum_model.TypeOfCustomer;
import Day_100_CaseStudy.Service.*;
import Day_100_CaseStudy.Service.impl.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class FuramaController {

    private static final IEmployeeService employeeService = new EmployeeService();
    private static final ICustomerService customerService = new CustomerService();
    private static final IBookingService bookingService = new BookingService();
    private static final IFacilityService facilityService = new FacilityService();
    private static final IService service = new Service();

    public static void main(String[] args) throws ParseException {
        displayMainMenu();
    }

    public static void displayMainMenu() throws ParseException {


        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

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
                                employeeService.displayEmployee();
                                break;
                            case 2:
                                try {


                                    System.out.println("Input id: ");
                                    int id = Integer.parseInt(sc.nextLine());
                                    System.out.println("Input name: ");
                                    String name = sc.nextLine();

                                    System.out.println("Enter a date (dd/MM/yyyy):  ");
                                    int date = Integer.parseInt(sc.nextLine());
                                    int month = Integer.parseInt(sc.nextLine());
                                    int year = Integer.parseInt(sc.nextLine());

                                    Date date1 = new Date(date, month, year);

                                    System.out.println("Input gender (male/ female) : ");
                                    String gender = sc.nextLine();
                                    Gender gender1 = Gender.valueOf(gender.toUpperCase());

                                    System.out.println("Input identificationNumber: ");
                                    String identificationNumber = sc.nextLine();

                                    System.out.println("Input phoneNumber: ");
                                    String phoneNumber = sc.nextLine();

                                    System.out.println("Input email: ");
                                    String email = sc.nextLine();

                                    System.out.println("Input education (INTERMEDIATE/COLLEGE/UNIVERSITY/POSTGRADUATE): ");
                                    String education = sc.nextLine();
                                    Education education1 = Education.valueOf(education.toUpperCase());

                                    System.out.println("Input position (RECEPTIONIST/SERVER/SPECIALIST/SUPERVISOR/MANAGER/DIRECTOR): ");
                                    String position = sc.nextLine();
                                    Position position1 = Position.valueOf(position.toUpperCase());

                                    System.out.println("Input salary: ");
                                    int salary = Integer.parseInt(sc.nextLine());

                                    Employee employee = new Employee(id, name, date1, gender1, identificationNumber, phoneNumber, email, education1, position1, salary);

                                    employeeService.addEmployee(employee);
                                } catch (IllegalArgumentException e) {
                                    System.out.println("Input again: ");

                                }
                                break;
                            case 3:
                                System.out.println("Input id of employee want to delete: : ");
                                int id3 = Integer.parseInt(sc.nextLine());
                                employeeService.deleteById(id3);
                                break;
                            case 4:
                                System.out.println("Input id of employee want to edit: ");
                                int id4 = Integer.parseInt(sc.nextLine());

                                Employee c = employeeService.findById(id4);

                                if (c != null) {
                                    try {


                                        System.out.println("Input name: ");
                                        String name4 = sc.nextLine();

                                        System.out.println("Enter a date (dd/MM/yyyy):  ");
                                        int date4 = Integer.parseInt(sc.nextLine());
                                        int month4 = Integer.parseInt(sc.nextLine());
                                        int year4 = Integer.parseInt(sc.nextLine());

                                        Date date = new Date(date4, month4, year4);

                                        System.out.println("Input gender (male/ female) : ");
                                        String gender = sc.nextLine();
                                        Gender gender4 = Gender.valueOf(gender.toUpperCase());

                                        System.out.println("Input identificationNumber: ");
                                        String identificationNumber4 = sc.nextLine();

                                        System.out.println("Input phoneNumber: ");
                                        String phoneNumber4 = sc.nextLine();

                                        System.out.println("Input email: ");
                                        String email4 = sc.nextLine();

                                        System.out.println("Input education (INTERMEDIATE/COLLEGE/UNIVERSITY/POSTGRADUATE): ");
                                        String education4 = sc.nextLine();
                                        Education education = Education.valueOf(education4.toUpperCase());

                                        System.out.println("Input position (RECEPTIONIST/SERVER/SPECIALIST/SUPERVISOR/MANAGER/DIRECTOR): ");
                                        String position = sc.nextLine();
                                        Position position4 = Position.valueOf(position.toUpperCase());

                                        System.out.println("Input salary: ");
                                        int salary4 = Integer.parseInt(sc.nextLine());

                                        c.setName(name4);
                                        c.setEducation(education);
                                        c.setEmployeeId(id4);
                                        c.setPosition(position4);
                                        c.setSalary(salary4);
                                        c.setBirthDate(date);
                                        c.setEmail(email4);
                                        c.setGender(gender4);
                                        c.setIdentificationNumber(identificationNumber4);
                                        c.setPhoneNumber(phoneNumber4);

                                        employeeService.updateEmployee(c);
                                    } catch (Exception e) {
                                        System.out.println("Input again: ");
                                    }
                                } else {
                                    System.out.println("Not exited");
                                }
                                break;
                            case 5:
                                displayMainMenu();
                                break;
                            default:
                                System.out.println("Input again ");
                        }

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
                                customerService.displayCustomer();
                                break;
                            case 2:
                                try {


                                    System.out.println("Input CustomerId: ");
                                    int id = Integer.parseInt(sc.nextLine());
                                    System.out.println("Input name: ");
                                    String name = sc.nextLine();

                                    System.out.println("Enter a date (dd/MM/yyyy):  ");
                                    int date = Integer.parseInt(sc.nextLine());
                                    int month = Integer.parseInt(sc.nextLine());
                                    int year = Integer.parseInt(sc.nextLine());

                                    Date date1 = new Date(date, month, year);

                                    System.out.println("Input gender (male/ female) : ");
                                    String gender = sc.nextLine();
                                    Gender gender1 = Gender.valueOf(gender.toUpperCase());

                                    System.out.println("Input identificationNumber: ");
                                    String identificationNumber = sc.nextLine();

                                    System.out.println("Input phoneNumber: ");
                                    String phoneNumber = sc.nextLine();

                                    System.out.println("Input email: ");
                                    String email = sc.nextLine();

                                    System.out.println("Input type of customer (DIAMOND/PLATINIUM/GOLD/SILVER/MEMBER): ");
                                    String type = sc.nextLine();
                                    TypeOfCustomer type1 = TypeOfCustomer.valueOf(type.toUpperCase());

                                    System.out.println("Input address: ");
                                    String address = sc.nextLine();

                                    Customer customer = new Customer(id, name, date1, gender1, identificationNumber, address, phoneNumber, email, type1);

                                    customerService.addNewCustomer(customer);
                                } catch (IllegalArgumentException e) {
                                    System.out.println("Input again: ");

                                }
                                break;
                            case 3:
                                System.out.println("Input id of customer want to edit: ");
                                int id4 = Integer.parseInt(sc.nextLine());

                                Customer c = customerService.findCustomerById(id4);

                                if (c != null) {
                                    try {


                                        System.out.println("Input name: ");
                                        String name4 = sc.nextLine();

                                        System.out.println("Enter a date (dd/MM/yyyy):  ");
                                        int date4 = Integer.parseInt(sc.nextLine());
                                        int month4 = Integer.parseInt(sc.nextLine());
                                        int year4 = Integer.parseInt(sc.nextLine());

                                        Date date = new Date(date4, month4, year4);

                                        System.out.println("Input gender (male/ female) : ");
                                        String gender = sc.nextLine();
                                        Gender gender4 = Gender.valueOf(gender.toUpperCase());

                                        System.out.println("Input identificationNumber: ");
                                        String identificationNumber4 = sc.nextLine();

                                        System.out.println("Input phoneNumber: ");
                                        String phoneNumber4 = sc.nextLine();

                                        System.out.println("Input email: ");
                                        String email4 = sc.nextLine();


                                        System.out.println("Input type of customer (DIAMOND/PLATINIUM/GOLD/SILVER/MEMBER): ");
                                        String type = sc.nextLine();
                                        TypeOfCustomer type1 = TypeOfCustomer.valueOf(type.toUpperCase());

                                        System.out.println("Input address: ");
                                        String address = sc.nextLine();

                                        c.setName(name4);
                                        c.setTypeOfCustomer(type1);
                                        c.setCustomerId(id4);
                                        c.setBirthDate(date);
                                        c.setEmail(email4);
                                        c.setGender(gender4);
                                        c.setIdentificationNumber(identificationNumber4);
                                        c.setPhoneNumber(phoneNumber4);
                                        c.setAddress(address);
                                        customerService.updateCustomer(c);
                                    } catch (Exception e) {
                                        System.out.println("Input again: ");
                                    }
                                } else {
                                    System.out.println("Not exited");
                                }
                                break;
                            case 4:
                                displayMainMenu();
                                break;

                            default:
                                System.out.println("Input again ");
                        }
                    } while (true);

                case 3:

                    int select3 = 0;
                    do {

                        System.out.println("1.Display list facility");
                        System.out.println("2.Add new facility");
                        System.out.println("3.Display list facility maintenance");
                        System.out.println("4.Return main menu");


                        select3 = Integer.parseInt(sc.nextLine());


                        switch (select3) {
                            case 1:
//                                facilityService.displayFacility();
                                break;
                            case 2:
//                                facilityService.addNewFacility();
                                break;
                            case 3:
//                                facilityService.displayFacilityMaintenance();
                                break;
                            case 4:
                                break;

                            default:
                                System.out.println("Input again ");
                        }
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
                    } while (true);


                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Fail! Please choose again! Enter to continue... ");
                    sc.nextLine();
            }
        } while (true);

    }

}
