import java.util.Scanner;
public class t7 {
    public static boolean Valid () {System.out.println("Введите индекс");
    Scanner vvod1=new Scanner(System.in);
        String index=vvod1.nextLine();
        if (index.length() != 5) {
           return false;
        } else {
            for (int i = 0; i < index.length(); i++) {
              if (!(((int)(index.charAt(i)) > 47) && (int)(index.charAt(i)) < 58)) {
                    return false;
               }
            }
        }
        return true;
    }
}
