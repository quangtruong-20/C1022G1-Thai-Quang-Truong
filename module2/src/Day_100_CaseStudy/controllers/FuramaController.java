package Day_100_CaseStudy.controllers;

import Day_100_CaseStudy.libs.Regex;
import Day_100_CaseStudy.models.*;
import Day_100_CaseStudy.models.enum_model.*;
import Day_100_CaseStudy.services.*;
import Day_100_CaseStudy.services.impl.*;

import java.io.IOException;
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
                                    String id = sc.nextLine();
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
                                    String salary = sc.nextLine();

                                    Employee employee = new Employee(id, name, date1, gender1, identificationNumber, phoneNumber, email, education1, position1, salary);

                                    employeeService.addEmployee(employee);
                                } catch (IllegalArgumentException | IOException e) {
                                    System.out.println("Input again: ");

                                }
                                break;
                            case 3:
                                System.out.println("Input id of employee want to delete: : ");
                                String id3 = sc.nextLine();
                                employeeService.deleteById(id3);
                                break;
                            case 4:
                                System.out.println("Input id of employee want to edit: ");
                                String id4 = sc.nextLine();

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
                                        String salary4 = sc.nextLine();

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
                                    String id = sc.nextLine();
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
                                String id4 = sc.nextLine();

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
                                facilityService.displayFacility();
                                break;
                            case 2:
                                int select9 = 0;
                                do {
                                    System.out.println("1.Add New Villa");
                                    System.out.println("2.Add New Room");
                                    System.out.println("3.Back to menu");
                                    select9 = Integer.parseInt(sc.nextLine());
                                    switch (select9) {
                                        case 1:

                                            System.out.println("Input name: ");
                                            String name = sc.nextLine();
                                            while (!Regex.checkNameService(name)) {
                                                System.out.println("Name is valid! Enter area again: (exam: Villa)");
                                                name = sc.nextLine();
                                            }

                                            System.out.println("Input area : ");
                                            String area = sc.nextLine();
                                            while (!Regex.checkArea(area)) {
                                                System.out.println("Area is valid! Enter area again: (exam: so thuc > 30)");
                                                area = sc.nextLine();
                                            }
                                            System.out.println("Input price : ");
                                            String price = sc.nextLine();
                                            while (!Regex.checkPrice(price)) {
                                                System.out.println("Price is valid! Enter area again: (exam: > 0)");
                                                price = sc.nextLine();
                                            }
                                            System.out.println("Input max capacity: ");
                                            String maxCapacity = sc.nextLine();

                                            while (!Regex.checkMaxOfPeople(maxCapacity)) {
                                                System.out.println("Input is valid! Enter again: (exam: >0 & < 20)");
                                                maxCapacity = sc.nextLine();
                                            }
                                            System.out.println("Input ren type: ");
                                            String type = sc.nextLine();
                                            RentType type1 = RentType.valueOf(type.toUpperCase());
                                            while (!Regex.checkNameService(type)) {
                                                System.out.println("type is valid! Enter type again: (exam: Villa)");
                                                type = sc.nextLine();
                                            }

                                            System.out.println("Input roomStandard: ");
                                            String roomStandard = sc.nextLine();
                                            while (!Regex.checkNameService(roomStandard)) {
                                                System.out.println("Iput is valid! Enter again: (exam: Room)");
                                                roomStandard = sc.nextLine();
                                            }

                                            System.out.println("Input swimmingPoolArea: ");
                                            String swimmingPoolArea = sc.nextLine();
                                            while (!Regex.checkArea(swimmingPoolArea)) {
                                                System.out.println("Area is valid! Enter area again: (exam: so thuc > 30)");
                                                swimmingPoolArea = sc.nextLine();
                                            }


                                            System.out.println("Input numberOfFloors: ");
                                            String numberOfFloors = sc.nextLine();
                                            while (!Regex.checkNumberOfFloor(numberOfFloors)) {
                                                System.out.println("Number is valid! Enter number again: (exam: > 0)");
                                                numberOfFloors = sc.nextLine();
                                            }

                                            System.out.println("Input number of uses: ");
                                            Integer numberOfUses = Integer.parseInt(sc.nextLine());


                                            Villa villa = new Villa(name, area, price, maxCapacity, type1, roomStandard, swimmingPoolArea, numberOfFloors);
                                            facilityService.addNewVilla(villa, numberOfUses);

                                            break;
                                        case 2:
                                            System.out.println("Input name: ");
                                            String name1 = sc.nextLine();

                                            while (!Regex.checkNameService(name1)) {
                                                System.out.println("Name is valid! Enter area again: (exam: Villa)");
                                                name1 = sc.nextLine();
                                            }

                                            System.out.println("Input area : ");
                                            String area1 = sc.nextLine();
                                            while (!Regex.checkArea(area1)) {
                                                System.out.println("Area is valid! Enter area again: (exam: so thuc > 30)");
                                                area1 = sc.nextLine();
                                            }
                                            System.out.println("Input price : ");
                                            String price1 = sc.nextLine();
                                            while (!Regex.checkPrice(price1)) {
                                                System.out.println("Price is valid! Enter area again: (exam: > 0)");
                                                price1 = sc.nextLine();
                                            }

                                            System.out.println("Input max capacity: ");
                                            String maxCapacity1 = sc.nextLine();
                                            while (!Regex.checkMaxOfPeople(maxCapacity1)) {
                                                System.out.println("Input is valid! Enter again: (exam: >0 & < 20)");
                                                maxCapacity1 = sc.nextLine();
                                            }

                                            System.out.println("Input ren type: ");
                                            String type3 = sc.nextLine();
                                            RentType type4 = RentType.valueOf(type3.toUpperCase());
                                            while (!Regex.checkNameService(type3)) {
                                                System.out.println("type is valid! Enter type again: (exam: Villa)");
                                                type3 = sc.nextLine();
                                            }

                                            System.out.println("Input freeServiceIncluded: ");
                                            String freeServiceIncluded = sc.nextLine();


                                            System.out.println("Input number of uses: ");
                                            Integer numberOfUses1 = Integer.parseInt(sc.nextLine());


                                            Room room = new Room(name1, area1, price1, maxCapacity1, type4, freeServiceIncluded);
                                            facilityService.addNewRoom(room, numberOfUses1);

                                            break;
                                        case 3:
                                            displayMainMenu();
                                            break;
                                        default:
                                            System.out.println("Input again");
                                    }

                                }
                                while (true);


                            case 3:

                                facilityService.displayFacilityMaintain();

                                break;
                            case 4:
                                displayMainMenu();
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
