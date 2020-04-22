import java.util.Arrays;
import java.util.Scanner;
public class t9  {
   public static Boolean sufref(){Scanner vvod1=new Scanner(System.in);
       System.out.println("Введите слово 1");
       String wor1=vvod1.nextLine();
       System.out.println("Введите слово 2");
       String wor2=vvod1.nextLine();
       if(wor2.indexOf("-")>0){return Ispref(wor1,wor2);}
        else{return Issuf(wor1,wor2);
       }
   }
  public static boolean Issuf(String word1,String word2) {
       if (word1.substring(word1.length()-word2.length()+1).equals(word2.substring(1))){
           return true;
      }
       else return false;
  }
    public static boolean Ispref(String word1,String word2) {
        if (word1.substring(0,word2.length()-1).equals(word2.substring(0,word2.length()-1))){
            return true;
        }
        else{return  false;}
   }
}

