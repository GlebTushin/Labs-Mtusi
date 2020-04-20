import java.util.Arrays;
public class simplsort {
    public static void Bublle(double[] array){
        for (int i=0;i<(array.length);i++){
            for(int j=0;j<array.length-1;j++ ){
                if (array[j]>array[j+1]){
                    double temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
}
