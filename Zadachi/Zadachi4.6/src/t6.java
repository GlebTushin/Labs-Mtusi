public class t6 {public static int mult (int num){
   int count=0;
   int num1=1;
    while (num>9){
        for (int i=0;i<String.valueOf(num).length();i++){
            num1=num1*(int)(String.valueOf(num).charAt(i));
        }
       num=num1;
        count=count+1;
        num1=1;

    }
 return count;
}
}

