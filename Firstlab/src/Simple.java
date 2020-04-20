
import java.util.Arrays;
import java.util.Scanner;

public class Simple {
    public static void main(String[] args) {Scanner vvod= new Scanner(System.in);

        System.out.println("Граничное число");
        int m= vvod.nextInt();
        for (int j = 2; j <= m; j++) {
           if (proverka(j)){
            System.out.println("число= " + j);
           }

        }

    }


    public static boolean proverka(int n) {
        for (int i = 2; i < n; i++) {
            if ((n % i) == 0) {
                return false; }}
            return true;



}}


