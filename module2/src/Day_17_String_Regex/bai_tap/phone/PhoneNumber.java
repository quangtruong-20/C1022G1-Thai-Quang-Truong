package Day_17_String_Regex.bai_tap.phone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static final String PHONE_REGEX = "^\\([0-9]{2}\\)[-]\\(0[0-9]{9}\\)$";
    public PhoneNumber(){}

    public boolean validate(String regex){
        Pattern pattern =Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();

    }
}
