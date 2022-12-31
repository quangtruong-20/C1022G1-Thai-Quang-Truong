package Day_100_CaseStudy.utils;



import Day_100_CaseStudy.models.Villa;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityVillaFile {
    private static final String VILLA_PATH = "D:\\codegym\\module2\\src\\Day_100_CaseStudy\\data\\villa.csv";

    public static Map<Villa, Integer> readVilla() {
        Map<Villa, Integer> villaList = new LinkedHashMap<>();
        FileReader fileReader = null;
        BufferedReader buff = null;

        try {
            fileReader = new FileReader(VILLA_PATH);
            buff = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Villa villa;

            while ((line = buff.readLine()) != null) {
                temp = line.split(",");
                String serviceName = temp[0];
                String area = temp[1];
                String price = temp[2];
                String maxCapacity = temp[3];
                String rentType = temp[4];
                String roomStandard = temp[5];
                String swimmingPoolArea = temp[6];
                String numberOfFloors = temp[7];
                int numberOfUses = Integer.parseInt(temp[8]);
                villa = new Villa(serviceName, area, price, maxCapacity, rentType, roomStandard, swimmingPoolArea, numberOfFloors);
                villaList.put(villa, numberOfUses);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                buff.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return villaList;
    }

    public static void writeVilla(Map<Villa, Integer> villa) {
        FileWriter fileWriter = null;
        BufferedWriter buff = null;
        try {
          fileWriter = new FileWriter(VILLA_PATH);
           buff = new BufferedWriter(fileWriter);
            for (Map.Entry<Villa, Integer> entry : villa.entrySet()) {
                buff.write(entry.getKey() + ", Number of Uses: " + entry.getValue());
                buff.newLine();
            }

            buff.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                buff.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}