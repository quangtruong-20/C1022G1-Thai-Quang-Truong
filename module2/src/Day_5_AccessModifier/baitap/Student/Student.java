package Day_5_AccessModifier.baitap.Student;

public class Student {
    private String name = "John";
    private String classes = "CO2";

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getClasses() {
        return classes;
    }

    protected void setClasses(String classes) {
        this.classes = classes;
    }
}
