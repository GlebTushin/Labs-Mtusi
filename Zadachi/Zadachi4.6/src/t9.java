

public class t9  {
   public static boolean trouble(int num,int num2) {
      String nums=String.valueOf(num);
       String nums2=String.valueOf(num2);
       for (int i=0;i<nums.length();i++){
           if ((povtor(nums,nums.charAt(i))==3)&&(povtor(nums2,nums.charAt(i))==2))
           {
               return true;
           }
       }
   return false;
   }
   public static int povtor(String Line,char a){
       int counter=0;
       for (int i=0;i<Line.length();i++){
           if (Line.charAt(i)==a){
               counter=counter+1;
           }
       }
      return counter;

   }
}

