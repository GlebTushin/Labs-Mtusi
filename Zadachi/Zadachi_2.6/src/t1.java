import java.util.Scanner;
public class t1 {
    public static String repeating(){Scanner vvod1 =new Scanner(System.in);
        System.out.println("Строка");
        String word=vvod1.nextLine();  System.out.println("Количество повторений");
        int sub=vvod1.nextInt();
        String S="";
        for(int i=0; i<word.length();i++){
            for(int j=0;j<sub;j++){
            S=S+word.charAt(i);
        }}
        return S;
    }
}
