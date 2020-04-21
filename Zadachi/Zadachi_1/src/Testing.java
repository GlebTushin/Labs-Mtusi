import java.util.Scanner;
public class Testing {
    public static void main(String args[]){
        Scanner vvod=new Scanner(System.in);
        System.out.println("Введите номер задания");
        int num=vvod.nextInt();
        switch (num){
            case 1:{
                System.out.println("Введите делимое");
                int Del=vvod.nextInt();
                System.out.println("Введите делитель");
                int div=vvod.nextInt();
                System.out.println(t1.remain(Del,div));
            break;}
            case 2:{System.out.println("Введите основание");
                double osn=vvod.nextDouble();
                System.out.println("Введите высоту");
                double height=vvod.nextDouble();
                System.out.println( t2.Area(height,osn));
               break;}
            case 3:{ System.out.println("Куры");
                int chik=vvod.nextInt();
                System.out.println("коровы");
                int cows=vvod.nextInt();
                System.out.println("Свиньи");
                int pigs=vvod.nextInt();
            System.out.println(t3.animals(chik,cows,pigs));
            break;}
            case 4:{System.out.println("prob");
                double prob=vvod.nextDouble();
                System.out.println("prize");
                double prize=vvod.nextDouble();
                System.out.println("pay");
                double pay=vvod.nextDouble();
                System.out.println(t4.profit(prob,prize,pay));
            break ;}
            case 5:{System.out.println("N");
            int N=vvod.nextInt();
            System.out.println("a");
            int a=vvod.nextInt();
            System.out.println("b");
            int b=vvod.nextInt();
            System.out.println(t5.prof(N,a,b));
            break;}
            case 6:{System.out.println("Введите символ");
            char N=vvod.next().charAt(0);
            System.out.println(t6.code(N));
            break;}
            case 7:{System.out.println("Введите число");
                int a=vvod.nextInt();
                System.out.println(t7.summ(a));
            break;}
            case 8:{System.out.println("Введите ребра");
                int edge1=vvod.nextInt();
                int edge2=vvod.nextInt();
                System.out.println(t8.NextEdge(edge1,edge2));
            break;}
            case 9:{ System.out.println("введите размер массива");
                int leng=vvod.nextInt();
                System.out.println(t9.summofcubes(leng));
            break;}
            case 10:{ System.out.println(" A");
                int a=vvod.nextInt();
                System.out.println("B");
                int b=vvod.nextInt();
                System.out.println("C");
                int c=vvod.nextInt();
                System.out.println(t10.delsum(a,b,c));}
        break;}
    }
}
