import java.util.Scanner;

public class t3 {
    public static boolean perfect(int osn) {
    int count=0;
        for (int i = 1; i < osn; i++) {
        if ((osn%i)==0){
            count=count+i;}
    }
        if (count==osn){
        return true;
    }
        else {return false;}
    }

}