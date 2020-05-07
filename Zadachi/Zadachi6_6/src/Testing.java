import java.util.Scanner;

public class Testing   {
    public static void main(String args[]){

      Scanner vvod=new Scanner(System.in);
        System.out.println("Введите номер задания");
        int num=vvod.nextInt();
        switch (num){
            case 1:{
                vvod.nextLine();
                System.out.println(t1.BellNum(vvod.nextInt()));
            break;}
            case 2:{vvod.nextLine();
                System.out.println(t2.translatin(vvod.nextLine()));
               break;}
            case 3:{vvod.nextLine();
                System.out.println(t3.validRgb(vvod.nextLine()));
            break;}
            case 4:{vvod.nextLine();

                System.out.println(t4.UrlParams(vvod.nextLine()));
            break ;}
            case 5:{vvod.nextLine();
                System.out.println(t5.getHashTags(vvod.nextLine()));
            break;}
            case 6:{
            System.out.println(t6.ulam(vvod.nextInt()));
            break;}
            case 7:{vvod.nextLine();
                System.out.println(t7.longest(vvod.nextLine()));
            break;}
            case 8:{
                System.out.println(t8.Roman(vvod.nextInt()));

            break;}
            case 9:{vvod.nextLine();
                System.out.println(t9.formula(vvod.nextLine()));
            break;}
            case 10:{
                System.out.println(t10.palindromdescedant(vvod.nextInt()));}
        break;}
    }
}
