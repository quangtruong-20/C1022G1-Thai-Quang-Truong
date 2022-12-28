package Day_100_CaseStudy.services.impl;

import Day_100_CaseStudy.models.Room;
import Day_100_CaseStudy.models.Villa;
import Day_100_CaseStudy.services.IFacilityService;

import java.util.LinkedHashMap;
import java.util.Map;


public class FacilityService implements IFacilityService {
    public static Map<Room, Integer> roomService = new LinkedHashMap<Room, Integer>();
    public static Map<Villa, Integer> villaService = new LinkedHashMap<Villa, Integer>();

    static {

        roomService.put(new Room("vip", "30", "3000000", "4", "day", "free buffet"), 3);
        roomService.put(new Room("normal", "20", "2000000", "2", "month", "free swim"), 4);
        roomService.put(new Room("pro max", "60", "6000000", "8", "year", "free all"), 5);

        villaService.put(new Villa("vip", "100", "10000000", "15", "day", "vip", "50", "4"), 3);
        villaService.put(new Villa("normal", "80", "80000000", "9", "month", "normal", "20", "9"), 5);
        villaService.put(new Villa("pro max", "140", "20000000", "20", "year", "pro vip", "110", "1"), 4);


    }


    @Override
    public void displayFacility() {
        for (Map.Entry<Room, Integer> m : roomService.entrySet()
        )
            System.out.println(m.getKey() + " - Number of Uses " + m.getValue());
        for (Map.Entry<Villa, Integer> n : villaService.entrySet()
        )
            System.out.println(n.getKey() + " - Number of Uses " + n.getValue());


    }

    @Override
    public void addNewVilla(Villa villa, Integer time) {
        villaService.put(villa, time);
    }

    @Override
    public void addNewRoom(Room room, Integer time) {
        roomService.put(room, time);
    }

    @Override
    public void displayFacilityMaintain() {
        for (Map.Entry<Room, Integer> m : roomService.entrySet()
        )
            if (m.getValue() >= 5)
            System.out.println(m.getKey() + " - Number of Uses " + m.getValue());
        for (Map.Entry<Villa, Integer> n : villaService.entrySet()
        )
            if (n.getValue() >= 5)
            System.out.println(n.getKey() + " - Number of Uses " + n.getValue());

    }


}
