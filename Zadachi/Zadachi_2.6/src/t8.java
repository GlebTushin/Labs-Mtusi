import java.util.Scanner;

public class t8 {public static boolean ispair(){
    System.out.println("Введите слово 1");
    Scanner vvod1=new Scanner(System.in);
    String wor1=vvod1.nextLine();
    System.out.println("Введите слово 2");
    String wor2=vvod1.nextLine();
    if ((wor1.charAt(0)==(wor2.charAt(wor2.length()-1)))||(wor2.charAt(0)==(wor1.charAt(wor1.length()-1)))){
        return true;
    }
    return false;
}
}
