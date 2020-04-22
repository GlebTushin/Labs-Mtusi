import java.util.Scanner;
public class t1 {
    public static String repeating(String word,int sub){String S="";
        for(int i=0; i<word.length();i++){
            for(int j=0;j<sub;j++){
            S=S+word.charAt(i);
        }}
        return S;
    }
}
