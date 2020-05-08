
public class t4 {
    public static int sumProd(String Str){
       int summ=0;
       int prod=1;
        for (String part:Str.split(", ")
             ) {
            summ=summ+Integer.parseInt(part);
        }
        return mult(summ);


    }
    public static int mult (int num){
        int num1=1;

        while (num>9){
            for (int i=0;i<String.valueOf(num).length()+1;i++){
                num1=num1*(num%10);
                num=num/10;
            }
            num=num1;
            num1=1;

        }
        return num;
    }
}




