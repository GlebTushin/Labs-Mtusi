import java.util.Scanner;
public class Testing {
    public static void main(String args[]){
        Scanner vvod=new Scanner(System.in);
        System.out.println("Введите номер задания");
        int num=vvod.nextInt();
        switch (num){
            case 1:{
                System.out.println("Строка");
               String word=vvod.nextLine();
                System.out.println("Количество повторений");
                int div=vvod.nextInt();
                System.out.println(t1.repeating(word,div));
            break;}
            case 2:{System.out.println("Введите размер массива");
                int osn=vvod.nextInt();
                System.out.println( t2.razn(osn));
               break;}
            case 3:{
                System.out.println("Введите размер массива");
                int osn=vvod.nextInt();
            System.out.println(t3.Whole(osn));
            break;}
            case 4:{System.out.println("Введите размер массива");
                int osn=vvod.nextInt();
                System.out.println(t4.summa(osn));
            break ;}
            case 5:{
                System.out.println(t5.decimal());
            break;}
            case 6:{System.out.println("Введите число");
            int N=vvod.nextInt();
            System.out.println(t6.Fibonachi(N));
            break;}
            case 7:{
                System.out.println(t7.Valid());
            break;}
            case 8:{
                System.out.println(t8.ispair());
            break;}
            case 9:{
                System.out.println(t9.sufref());
            break;}
            case 10:{ System.out.println("количество шагов");
                int a=vvod.nextInt();
                System.out.println(t10.box(a));}
        break;}
    }
}
