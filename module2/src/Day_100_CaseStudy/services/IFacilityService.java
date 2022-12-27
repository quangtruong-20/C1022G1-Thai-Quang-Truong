package Day_100_CaseStudy.services;

import Day_100_CaseStudy.models.Room;
import Day_100_CaseStudy.models.Villa;

public interface IFacilityService extends IService {
            void displayFacility();

            void addNewVilla(Villa villa, Integer time);
            void addNewRoom(Room room, Integer time);

            void displayFacilityMaintain();
}
