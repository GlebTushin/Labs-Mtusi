import java.util.Scanner;

public class t4 {public static double[]  summa(int osn){
    Scanner vvod2=new Scanner(System.in);
    double arr[]= new double[osn];

    for(int i=0;i<osn;i++){
        arr[i]=vvod2.nextDouble();
    }
    for(int i=1;i<osn;i++){arr[i]=arr[i]+arr[i-1];
    }
    return  arr;
}
}
