package Day_100_CaseStudy.utils;


import Day_100_CaseStudy.services.impl.BookingService;

import java.io.*;
import java.util.List;

public class BookingFile {
    private static final String BOOKING_PATH = "D:\\codegym\\module2\\src\\Day_100_CaseStudy\\data\\booking.csv";
    public static void writeBookingList(List<BookingService> bookingServiceList) throws IOException {
        FileOutputStream fos = new FileOutputStream(BOOKING_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(bookingServiceList);
        oos.close();
    }
    public static List<BookingService> readBookingList() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(BOOKING_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<BookingService> bookingServiceList = (List<BookingService>) ois.readObject();
        return bookingServiceList;
    }
}
