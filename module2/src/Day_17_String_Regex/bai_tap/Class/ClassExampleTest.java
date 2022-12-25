package Day_17_String_Regex.bai_tap.Class;


public class ClassExampleTest {
    private static ClassExample classExample;
    public static final String[] validAccount = new String[]{"C0318G","A5678H","P9101I"};
    public static final String[] invalidAccount = new String[]{ "M0318G", "P0323A","C123G","A12345G" };
    public static void main(String[] args) {
        classExample = new ClassExample();
        for (String account: validAccount
        ) {
            boolean isvalid = classExample.validate(account);
            System.out.println("Account is "+ account +" is valid: "+ isvalid);
        }
        for (String account: invalidAccount
        ) {
            boolean isvalid = classExample.validate(account);
            System.out.println("Account is "+ account +" is valid: "+ isvalid);
        }
    }
}
