import java.util.Scanner;

public class Lab2 {
    //подсчет площади треугольника//
    public static double spase(Point3d Mask1,Point3d Mask2,Point3d Mask3){if ((Mask1.equals(Mask2))|(Mask1.equals(Mask3))|(Mask2.equals(Mask3)))
    {return 0;}
        double p=(Mask1.distanse(Mask2)+Mask2.distanse(Mask3)+Mask1.distanse(Mask3))/2;
double s=Math.pow((p*(p-Mask1.distanse(Mask2))*(p-Mask1.distanse(Mask3))*(p-Mask2.distanse(Mask3))),0.5);

    return s;}
    public static void main(String[] args){
        Scanner vvod =new Scanner(System.in);

        Point3d [] Points= new Point3d[3];

        for (int i=0;i<3;i++){double x=vvod.nextDouble();
            double y=vvod.nextDouble();
            double z=vvod.nextDouble();
            Points[i]=new Point3d(x,y,z); }
       System.out.println( spase(Points[0],Points[1],Points[2]));




    }

    }

