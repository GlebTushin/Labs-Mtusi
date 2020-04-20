import javax.jws.Oneway;


public class Point3d extends Point2d {private double xcord;
private double ycord;
private double zcord;
public  Point3d (double x,double y,double z){
    xcord=x;
    ycord=y;
    zcord=z;
}
public Point3d(){
    this(0,0,0);
}
public double getZ() {
        return zcord;
    }
    public void setZ(double val){
    zcord=val;
    }
    //сравнение двух точек//
    public void sravn(Point3d Mask){
    if ((xcord==Mask.getX())&(ycord==Mask.getY())&(zcord==Mask.getZ())){
        System.out.println("Точки равны");
    }
    else{
        System.out.println("Точки не равны");
    }

    }
    //измерение расстояния между точками//
    public double distanse(Point3d Mask){
        return   Math.pow((Math.pow((xcord-Mask.getX()),2)+Math.pow((ycord-Mask.getY()),2)+Math.pow((zcord-Mask.getZ()),2)),0.5);
    }
}
