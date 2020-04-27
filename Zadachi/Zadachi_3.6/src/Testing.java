import java.util.Scanner;

public class Testing   {
    public static void main(String args[]){

      Scanner vvod=new Scanner(System.in);
        System.out.println("Введите номер задания");
        int num=vvod.nextInt();
        switch (num){
            case 1:{

                 // Колличество корней уравнения
                System.out.println(t1.solutions(vvod.nextInt(),vvod.nextInt(),vvod.nextInt()));
            break;}
            case 2:{vvod.nextLine();
                System.out.println(t2.find(vvod.nextLine()));
               break;}
            case 3:{
                System.out.println(t3.perfect(vvod.nextInt()));
            break;}
            case 4:{vvod.nextLine();

                System.out.println(t4.endings(vvod.nextLine()));
            break ;}
            case 5:{vvod.nextLine();
                System.out.println(t5.hex(vvod.nextLine()));
            break;}
            case 6:{vvod.nextLine();
            System.out.println(t6.unique(vvod.nextLine(),vvod.nextLine()));
            break;}
            case 7:{
                System.out.println(t7.Valid(vvod.nextInt()));
            break;}
            case 8:{vvod.nextLine();
                System.out.println(t8.longestzero(vvod.nextLine()));
            break;}
            case 9:{
                System.out.println(t9.nextprime(vvod.nextInt()));
            break;}
            case 10:{
                System.out.println(t10.isangle(vvod.nextInt(),vvod.nextInt(),vvod.nextInt()));}
        break;}
    }
}
