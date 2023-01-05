package luyenthi;

import java.util.Scanner;
   import java.util.HashMap;

public class Kituchung {

    public static class Main {
        public static int commonCharacters(String string1, String string2) {
            // Tạo từ điển lưu trữ số lượng mỗi ký tự trong xâu thứ nhất
            HashMap<Character, Integer> charCount = new HashMap<>();
            for (char c : string1.toCharArray()) {
                if (charCount.containsKey(c)) {
                    charCount.put(c, charCount.get(c) + 1);
                } else {
                    charCount.put(c, 1);
                }
            }

            // Duyệt qua từng ký tự trong xâu thứ hai và tăng giá trị trong từ điển lên 1 nếu ký tự đó có trong từ điển
            for (char c : string2.toCharArray()) {
                if (charCount.containsKey(c)) {
                    charCount.put(c, charCount.get(c) + 1);
                }
            }

            // Tính tổng số lượng các ký tự có trong từ điển
            int result = 0;
            for (int count : charCount.values()) {
                result += count;
            }

            return result;
        }

        public static void main(String[] args) {
            System.out.println(commonCharacters("aabcc", "adcaa"));  // Kết quả: 3
        }
    }

}
