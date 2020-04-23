import java.util.Scanner;
public class t3 {
    public static boolean Whole(int osn) {
        Scanner vvod2 = new Scanner(System.in);
        int summ=0;
        int arr[] = new int[osn];

        for (int i = 0; i < osn; i++) {
            arr[i] = vvod2.nextInt();
            summ=summ+arr[i];
        }
        if (summ%osn==0){
            return true;
        }
        else {return false;}
    }

}