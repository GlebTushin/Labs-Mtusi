import java.util.Arrays;
import java.util.Scanner;
public class t9  {
   public static double summofcubes(int leng){Scanner vvod1=new Scanner(System.in);
   double summcub=0;
  int array[]= new int[leng];
  System.out.println("Введите элементы массива");
   for (int i=0;i<leng;i++){
       array[i]=vvod1.nextInt();
       summcub=summcub+Math.pow(array[i],3);
   }
   return summcub;
   }
}
