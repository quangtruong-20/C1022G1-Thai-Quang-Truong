package Day_15_IO_TextFile.bai_tap.readfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Readfile {

    private static final String FILE_FATH = "D:\\codegym\\module2\\src\\Day_15_IO_TextFile\\bai_tap\\docfile.csv";

    public static List<Country> readCSV() {

        List<Country> countryList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader buff = null;
        try {
            fileReader = new FileReader(FILE_FATH);
            buff = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Country country;

            while ((line = buff.readLine()) != null) {
                temp = line.split(",");
                int id = Integer.parseInt(temp[0]);
                String shortName = temp[1];
                String fullName = temp[2];

                country = new Country(id, shortName, fullName);
                countryList.add(country);
            }


        } catch (Exception e) {
            System.out.println("Không tìm thấy file");
        } finally {
            try {
                fileReader.close();
            } catch (Exception ex) {
                System.out.println("Err");
            }
        }


        return countryList;
    }

    public static void main(String[] args) {
        List<Country> countryList = readCSV();
        for (Country c : countryList
        ) {
            System.out.println(c);
        }
    }

}
