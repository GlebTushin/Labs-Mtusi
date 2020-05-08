import java.util.Scanner;

public class Testing   {
    public static void main(String args[]){

      Scanner vvod=new Scanner(System.in);
        System.out.println("Введите номер задания");
        int num=vvod.nextInt();
        switch (num){
            case 1:{
                vvod.nextLine();
                System.out.println(t1.coding(vvod.nextLine()));
            break;}
            case 2:{vvod.nextLine();
                System.out.println(t2.isfigure(vvod.nextLine(),vvod.nextLine(),vvod.nextLine()));
               break;}
            case 3:{vvod.nextLine();
                System.out.println(t3.canComplete(vvod.nextLine(),vvod.nextLine()));
            break;}
            case 4:{vvod.nextLine();

                System.out.println(t4.sumProd(vvod.nextLine()));
            break ;}
            case 5:{vvod.nextLine();
                System.out.println(t5.sameVowel(vvod.nextLine()));
            break;}
            case 6:{
            System.out.println(t6.card(vvod.nextLong()));
            break;}
            case 7:{
                System.out.println(t7.Value(vvod.nextInt()));
            break;}
            case 8:{vvod.nextLine();
                System.out.println(t8.longestzero(vvod.nextLine()));
            break;}
            case 9:{vvod.nextLine();
                System.out.println(t9.Title(vvod.nextLine()));
            break;}
            case 10:{
                System.out.println(t10.isangle(vvod.nextInt()));}
        break;}
    }
}
