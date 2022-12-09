package Day_5_AccessModifier.bai_tap.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();

        student.setClasses("CO1");
        student.setName("Trường");

        System.out.println(student.getClasses());
        System.out.println(student.getName());

    }
}
