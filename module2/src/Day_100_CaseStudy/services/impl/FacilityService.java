package Day_100_CaseStudy.services.impl;

import Day_100_CaseStudy.models.Room;
import Day_100_CaseStudy.models.Villa;
import Day_100_CaseStudy.services.IFacilityService;
import Day_100_CaseStudy.utils.FacilityRoomFile;
import Day_100_CaseStudy.utils.FacilityVillaFile;

import java.util.LinkedHashMap;
import java.util.Map;


public class FacilityService implements IFacilityService {
    public static Map<Room, Integer> roomService = new LinkedHashMap<Room, Integer>();
    public static Map<Villa, Integer> villaService = new LinkedHashMap<Villa, Integer>();




    @Override
    public void displayFacility() {
        Map<Room, Integer> roomService = FacilityRoomFile.readRoom();
        Map<Villa, Integer> villaService = FacilityVillaFile.readVilla();
        for (Map.Entry<Room, Integer> m : roomService.entrySet()) {

            System.out.println(m.getKey() + " - Number of Uses " + m.getValue());

        }
        for (Map.Entry<Villa, Integer> n : villaService.entrySet()
        ) {
            System.out.println(n.getKey() + " - Number of Uses " + n.getValue());
        }
    }

    @Override
    public void addNewVilla(Villa villa, Integer time) {
        Map<Villa, Integer> villaService1 = FacilityVillaFile.readVilla();
        villaService1.put(villa, time);
        FacilityVillaFile.writeVilla(villaService1);
        villaService1.clear();
    }

    @Override
    public void addNewRoom(Room room, Integer time) {
        Map<Room, Integer> roomService1 = FacilityRoomFile.readRoom();

        roomService1.put(room, time);
        FacilityRoomFile.writeRoom(roomService1);
        roomService1.clear();
    }

    @Override
    public void displayFacilityMaintain() {
//        Map<Room, Integer> roomService1 = FacilityRoomFile.readRoom();
//        Map<Villa, Integer> villaService1 = FacilityVillaFile.readVilla();

        for (Map.Entry<Room, Integer> m : roomService.entrySet()
        )
            if (m.getValue() >= 5) {
                System.out.println(m.getKey() + " - Number of Uses " + m.getValue());
            }

        for (Map.Entry<Villa, Integer> n : villaService.entrySet())
            if (n.getValue() >= 5)
                System.out.println(n.getKey() + " - Number of Uses " + n.getValue());

    }


}
