import java.util.Scanner;

public class t4 {
    public static String endings(String Str){
        if (Str.length()<2) {return "несовместимо";}
        else if (Str.charAt(0)==Str.charAt(Str.length()-1)){
            return "два это пара";
        }
        else { return Str.charAt(Str.length()-1)+Str.substring(1,Str.length()-1)+Str.charAt(0);
        }

    }



}
