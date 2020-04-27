import java.util.Scanner;

public class t8 {public static int longestzero(String Numeral){
    int count1=0;
    int countmax=0;
    for (int i=0;i<Numeral.length();i++){
        if (Numeral.charAt(i)=='0'){
            count1=count1+1;
            if (count1>countmax){
                countmax=count1;
            }
        }
        else {
            count1=0;
        }

    }

  return countmax;
}
}
