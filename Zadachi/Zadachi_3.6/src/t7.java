import java.util.Scanner;

public class t7 {
    public static boolean Valid(int num) {
        int num1 = num *num;
        String str = String.valueOf(num1);
        if (str.length() % 2 == 0) {
            for (int i = str.length() / 2; i > 0; i = i - 1) {
                if ((Integer.parseInt(str.substring(0, i)) + (Integer.parseInt(str.substring(i)))) == num) {
                    return true;
                }
            }
        } else {
            for (int i = str.length() / 2 - 1; i > 0; i = i - 1) {
                if ((Integer.parseInt(str.substring(0, i)) + (Integer.parseInt(str.substring(i)))) == num) {
                    return true;
                }
            }
        }
        return false;
    }
}