public class t7 {
    public static String starhands(String Line) {
        char a=Line.charAt(0);
        int counter=1;
        String str1="";
       for (int i=1;i<Line.length();i++){
           if (Line.charAt(i)==a){
               counter =counter+1;
           }
           else{
               if (counter==1){
                   str1=str1+a;
               }
               else{
                   str1=str1+a+"*"+String.valueOf(counter);
               }
               a=Line.charAt(i);
               counter=1;
           }
       }
        if (counter==1){
            str1=str1+a;
        }
        else{
            str1=str1+a+"*"+String.valueOf(counter);
        }
       return str1;
    }
}