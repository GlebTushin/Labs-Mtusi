import java.util.Scanner;

public class t2 {
    public static  int find(String Line) {
        int count = 0;
        String s2="zip";
        for (int i = 1; i < Line.length()-3; i++) {
            if (Line.substring(i-1, i + 2).equals(s2)) {
                count = count + 1;
            }
            if (count >1 ) {
                return i; }
        }
return 0;
    }
}

