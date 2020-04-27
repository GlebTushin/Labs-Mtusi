import java.util.Scanner;

public class t1 {
    public static void redact(int N,int K ,String  tex){Scanner ret=new Scanner(System.in);
        int count=0;
      String  subtex="";
        for (String prev:tex.substring(1).split(" ")
                 ) {if (count==N){
                     break;
        }
        if ((subtex.length()+prev.length())<=K){if (subtex!=""){
            subtex=subtex+" "+prev;}
            else{ subtex=subtex+prev;

        };

        }
        else {System.out.println(subtex);
            subtex=""+prev;
        }

            }
System.out.println( subtex);

        }
}


