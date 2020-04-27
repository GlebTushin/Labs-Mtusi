public class t2 {
    public static  String skobki(String Line) {
        String sk="";
        int countl = 0;
       int countr=0;
       int itter=0;
        for (int i = 0; i < Line.length(); i++) {
            if (Line.charAt(i)=='(') {
                countl = countl + 1;
            }
            if(Line.charAt(i)==')') {
                countr = countr + 1;
            }
        if (countr==countl){
            sk=sk+Line.substring(itter,i+1)+",";
            itter=i+1;
        }

        }
        return sk;
        }

    }


