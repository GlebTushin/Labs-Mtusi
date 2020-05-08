public class t1 {
    public static String coding(String Line){
        if ((Line.charAt(0)>47)&&(Line.charAt(0)<58)){
            return encrypt(Line);
        }
        else return decrypt(Line);

        }
        public static String encrypt(String Line){
        int a=0;
        String Linevih="";
            for (String part:Line.split(", ")
                 ) {a=a+Integer.parseInt(part);
                Linevih=Linevih+(char)a;

            }
            return Linevih;
        }
        public static String  decrypt(String Line) {
        int code[]=new int[Line.length()];
        code[0]=(int)Line.charAt(0);
        String LineVih=String.valueOf(code[0]);
        for(int i=1 ;i<Line.length();i++){
            code[i]=(int)Line.charAt(i)-(int)Line.charAt(i-1);

             LineVih=LineVih+" "+String.valueOf(code[i]);
        }
        return LineVih;
        }
        }



