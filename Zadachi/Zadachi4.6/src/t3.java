public class t3 {
    public static String casing(String Str) {
   int count=0;
        for (int i = 1; i < Str.length(); i++) {
        if (Str.charAt(i)=='_'){
            count=count+1;}
    }
        if (count>0){
        return camelCase(Str);
    }
        else {return snakeCase(Str);}


}
    public static String camelCase(String Str){
        String str1="";
        for (String part:Str.split("_")
             ) {
            str1=str1+(char)(part.charAt(0)-32)+part.substring(1);

        }
return str1;
            }
    public static String snakeCase(String Str){
        String str1="";
       int itter=0;
        for(int i=0;i<Str.length();i++){
        if (Str.charAt(i)<97){
            str1=Str.substring(itter,i)+"_"+(char)(Str.charAt(i)+32);
itter=i+1;        }
        }
        return str1+Str.substring(itter);
    }
        }

