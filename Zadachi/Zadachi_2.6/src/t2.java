import java.util.Scanner;
import java.util.Arrays;
public class t2 {public static double  razn(int osn){
    Scanner vvod2=new Scanner(System.in);
    double arr[]= new double[osn];

for(int i=0;i<osn;i++){
    arr[i]=vvod2.nextDouble();
}
double max=arr[0];
double min=arr[0];
    for(int i=0;i<osn;i++){
        if (arr[i]>max){max=arr[i];}
        if (arr[i]<min){min=arr[i];}


    }
    return max-min;
}
}

