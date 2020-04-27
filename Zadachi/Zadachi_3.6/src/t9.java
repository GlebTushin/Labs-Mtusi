

public class t9  {
   public static int nextprime(int num) {
     while (isprime(num)==false){
        num=num+1;
     }
     return  num;

   }
   public static boolean isprime(int num2){
      for (int i = 2; i < num2; i++) {
         if ((num2 % i) == 0) {
            return false; }}
      return true;
   }
}

