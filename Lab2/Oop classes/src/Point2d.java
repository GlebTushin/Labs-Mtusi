public class Point2d {
  private  double xcord;
private double ycord;
 public   Point2d(double x,double y){
        xcord=x;
        ycord=y;
    }
    public Point2d(){this(0,0);
    }
//наследуемые свойства//
    protected double getX() {
        return xcord;
    }
    protected double getY(){
     return ycord;
}

    protected void setX(double x) {
        xcord=x;
    }

    protected void setY(double y){
     ycord=y;
 }
}
