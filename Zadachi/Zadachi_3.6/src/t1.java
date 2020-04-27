import java.util.Scanner;

public class t1 {
    public static int solutions(int a,int b ,int c){
        if( (Math.pow(b,2)-4*a*c)>0){
            return 2;
        }
        if ( (Math.pow(b,2)-4*a*c)==0){
            return 1;
        }
        else{return 0;}
        }
}


