package Day_17_String_Regex.bai_tap.phone;

import Day_17_String_Regex.bai_tap.Class.ClassExample;

public class PhoneNumberTest {
    private static PhoneNumber phoneNumber;
    public static final String[] validAccount = new String[]{"(84)-(0978489648)","(84)-(0946197716)","(84)-(0919429908)"};
    public static final String[] invalidAccount = new String[]{ "(8)-(0978489648)", "(844)-(1978489648)","(84)-(29784896)","(84)-(09784896481)" };
    public static void main(String[] args) {
        phoneNumber = new PhoneNumber();
        for (String account: validAccount
        ) {
            boolean isvalid = phoneNumber.validate(account);
            System.out.println("Account is "+ account +" is valid: "+ isvalid);
        }
        for (String account: invalidAccount
        ) {
            boolean isvalid = phoneNumber.validate(account);
            System.out.println("Account is "+ account +" is valid: "+ isvalid);
        }
    }
}
