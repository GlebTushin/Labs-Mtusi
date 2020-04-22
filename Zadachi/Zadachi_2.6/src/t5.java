import java.util.Scanner;

public class t5 {public static int decimal(){
    Scanner vvod1=new Scanner(System.in);
    System.out.println("Введите число");
    String number=vvod1.nextLine();
int dot=number.indexOf(".")+1;
if (dot>0){
    return number.length()-dot;
}
else return 0;
}
}
