package Day_2_Arrays_And_Loop.bai_tap;

public class CountString {
    public static void main(String[] args) {
        String txt = "ABCDEFGHIJKLMMOPQRSMUVWXYZ";
        char[] arr = txt.toCharArray(); //chuyển string thành array

        char characters = 'M';
        int count = 0 ;

        for(int i = 0;i<txt.length();i++){
            if(characters == arr[i]){
                count++;
            }
        }
        System.out.println("Số lần xuất hiện kí tự trong chuỗi là: "+count);

    }
}
