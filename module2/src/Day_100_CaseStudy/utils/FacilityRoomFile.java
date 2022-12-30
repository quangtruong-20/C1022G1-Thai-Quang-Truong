package Day_100_CaseStudy.utils;

import Day_100_CaseStudy.models.Room;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRoomFile {
    private static final String ROOM_PATH = "D:\\codegym\\module2\\src\\Day_100_CaseStudy\\data\\room.csv";

    public static Map<Room,Integer> readRoom() {
        Map<Room,Integer> roomList = new LinkedHashMap<>();
        FileReader fileReader = null;
        BufferedReader buff = null;

        try {
            fileReader = new FileReader(ROOM_PATH);
            buff = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Room room;

            while ((line = buff.readLine()) != null) {
                temp = line.split(",");
                String name = temp[0];
                String area = temp[1];
                String price = temp[2];
                String maxCapacity = temp[3];
                String rentType = temp[4];
                String freeServiceIncluded = temp[5];
                int numberOfUses = Integer.parseInt(temp[6]);
                room = new Room(name,area,price,maxCapacity,rentType,freeServiceIncluded);
                roomList.put(room,numberOfUses);
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
        return roomList;
    }

    public static void writeRoom(Map<Room,Integer> room ) {
        FileWriter fileWriter = null;
        BufferedWriter buff = null;

        try {
       fileWriter = new FileWriter(ROOM_PATH);
            buff = new BufferedWriter(fileWriter);
            for (Map.Entry<Room,Integer> entry : room.entrySet()) {
                buff.write(entry.getKey().toString() +", Number of Uses: " + entry.getValue());
                buff.newLine();
            }

            buff.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                buff.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}
