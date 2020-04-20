

import java.util.Arrays;
import java.util.Scanner;

public class Polindr {
    public static void main(String[] args) {
        System.out.println("Введите слово");
        Scanner vvod1=new Scanner(System.in);
        String s=vvod1.nextLine();
        if (srav(s,(reverse(s)))){
            System.out.println("Строка палиндром");
        }
        else{
            System.out.println("Не явл палиндромом");


        }
    }
    public static String reverse(String word) {
        int i = 0;
        String s = "";
        while (s.length() < word.length()) {
            s = s + word.charAt(word.length() -1-i);
            i = i + 1;
        }
        return s;
    }
    public static boolean srav(String s ,String m){
        return s.equals(m);

    }

}
