public class t6 {public static int mult (int num){
   int count=0;
   int num1=1;
    while (num>9){
        for (int i=0;i<String.valueOf(num).length()+1;i++){
            num1=num1*(num%10);
            num=num/10;
        }
       num=num1;
        count=count+1;
        num1=1;

    }
 return count;
}
}

