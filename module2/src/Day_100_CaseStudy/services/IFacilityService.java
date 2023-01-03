package Day_100_CaseStudy.services;

import Day_100_CaseStudy.models.Room;
import Day_100_CaseStudy.models.Villa;

import java.io.IOException;

public interface IFacilityService {
            void displayFacility() throws IOException, ClassNotFoundException;
            void addNewVilla(Villa villa, Integer time);
            void addNewRoom(Room room, Integer time);
            void displayFacilityMaintain();
}
