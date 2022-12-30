package Day_100_CaseStudy.libs;

public class Regex {
    public static final String CODE_VILLA = "^(SVVL)[0-9]{4}$";
    public static final String CODE_ROOM = "^(SVRO)[0-9]{4}$";
    public static final String NAME_SERVICE = "^[A-Z][a-z]*$";
    public static final String AREA = "^[3-9]\\d|30\\.\\d+$";
    public static final String PRICE = "^([1-9][\\d]*(\\.[\\d]*)?)|(0\\.[\\d]+)$";
    public static final String MAX_PEOPLE = "^([1-9]|1[0-9])$";
    public static final String NUMBER_OF_FLOOR = "^[1-9][\\\\d]*$";

    public static boolean checkCodeVilla(String str) {
        return str.matches(CODE_VILLA);
    }

    public static boolean checkCodeRoom(String str) {
        return str.matches(CODE_ROOM);
    }

    public static boolean checkNameService(String str) {
        return str.matches(NAME_SERVICE);
    }

    public static boolean checkArea(String str) {
        return str.matches(AREA);
    }

    public static boolean checkPrice(String str) {
        return str.matches(PRICE);
    }

    public static boolean checkMaxOfPeople(String str) {
        return str.matches(MAX_PEOPLE);
    }

    public static boolean checkNumberOfFloor(String str) {
        return str.matches(NUMBER_OF_FLOOR);
    }

}
