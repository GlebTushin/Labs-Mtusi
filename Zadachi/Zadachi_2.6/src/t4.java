import java.util.Scanner;

public class t4 {public static String  summa(int osn){
    Scanner vvod2=new Scanner(System.in);
    double arr[]= new double[osn];
String S="";
    for(int i=0;i<osn;i++){
        arr[i]=vvod2.nextDouble();
    }
    S=String.valueOf(arr[0])+" ";
    for(int i=1;i<osn;i++){arr[i]=arr[i]+arr[i-1];
        S=S+String.valueOf(arr[i])+" ";
    }
    return  S;
}
}
