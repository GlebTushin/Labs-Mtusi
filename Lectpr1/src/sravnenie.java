import java.util.Scanner;
import java.util.Arrays;

public class sravnenie {
    public static void main(String[] args) {
        Scanner Vvod = new Scanner(System.in);
        System.out.println("Введите размер массива" );
        int n=Vvod.nextInt();
        double[] arrayt1=new double[n];
        double[] arrayt2=new double[n];
        for (int i=0;i<n;i++){
            arrayt1[i]=Math.random()*10;
            arrayt2[i]=arrayt1[i];
        }
        long start1=System.nanoTime();
        qsort.quickSort(arrayt1,0,n-1);
        long finish1=System.nanoTime();
        simplsort.Bublle(arrayt2);
        long finish2=System.nanoTime();
        long time1=finish1-start1;
        long time2=finish2-finish1;
        System.out.println("Сортировка Хоара "+time1);
        for (int i = 0; i < arrayt1.length; i++) {
            System.out.print(arrayt1[i] + " ");
        }
        System.out.println("");
        System.out.println("Сортировка пузырьком "+time2);
        for (int i = 0; i < arrayt2.length; i++) {
            System.out.print(arrayt2[i] + " ");
        }
    }
}
