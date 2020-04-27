import java.util.Scanner;

public class t5 {public static boolean hex(String line){
    if ((line.length()==6)&&(line.charAt(0)=='#')){
        for(int i=1;i<line.length();i++){
            if(!((((int)line.charAt(i)>64)&&((int)line.charAt(i)<71))|(((int)line.charAt(i)>96)&&((int)line.charAt(i)<108))|(((int)line.charAt(i)>47)&&((int)line.charAt(i)<58)))){return false;

            }
        }
        return true; }
    else { return false; }

}
}
