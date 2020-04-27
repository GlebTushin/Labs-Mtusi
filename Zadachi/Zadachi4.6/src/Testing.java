import java.text.DecimalFormat;
import java.util.Scanner;

public class Testing   {
    public static void main(String args[]){

      Scanner vvod=new Scanner(System.in);
        System.out.println("Введите номер задания");
        int num=vvod.nextInt();
        switch (num){
            case 1:{//графический редактор
                vvod.nextLine();
                t1.redact(vvod.nextInt(),vvod.nextInt(),vvod.nextLine());
            break;}
            case 2:{//кластер скобок
                vvod.nextLine();
                System.out.println(t2.skobki(vvod.nextLine()));
               break;}
            case 3:{//перевод стилей написания
                vvod.nextLine();
                System.out.println(t3.casing(vvod.nextLine()));
            break;}
            case 4:{//сверхурочная работа и оплата

                System.out.printf("%.2f %n",t4.work(vvod.nextDouble(),vvod.nextDouble(),vvod.nextDouble(),vvod.nextDouble()));
            break ;}
            case 5:{vvod.nextLine();
                System.out.println(t5.BMI(vvod.nextLine(),vvod.nextLine()));
            break;}
            case 6:{
            System.out.println(t6.mult(vvod.nextInt()));
            break;}
            case 7:{vvod.nextLine();
                System.out.println(t7.starhands(vvod.nextLine()));
            break;}
            case 8:{vvod.nextLine();
                System.out.println(t8.Rhyme(vvod.nextLine(),vvod.nextLine()));
            break;}
            case 9:{
                System.out.println(t9.trouble(vvod.nextInt(),vvod.nextInt()));
            break;}
            case 10:{vvod.nextLine();
                System.out.println(t10.books(vvod.nextLine(),vvod.nextLine()));}
        break;}
    }
}
