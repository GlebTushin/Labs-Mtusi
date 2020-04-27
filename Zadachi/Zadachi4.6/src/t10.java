public class t10 {
    public static int books(String Line, String spl) {
        String[] prev = Line.split(spl);
        int count=0;
        int doble=0;
        int uniq=0;
        for (int i = 0; i < prev.length; i++) {
            for (int j=0;j<prev[i].length();j++)
            {for (int k=0;k<j;k++){
                if (povtor(prev[k],prev[i].charAt(j))!=0){
                   count=count+1;
                }
            }
                for (int k=j+1;k<i;k++){
                    if (povtor(prev[k],prev[i].charAt(j))!=0){
                        count=count+1;
                    }
                }
                if (count==0){for (int reg=0;reg<j;reg++){
                    if (prev[i].charAt(j)==prev[i].charAt(reg)){
                        doble=doble+1;
                    }
                }}
                if (doble==0){
                    uniq=uniq+1;
                }

               count=0;
                doble=0;
            }
            }
return  uniq;
        }


    public static int povtor(String Line, char a) {
        int counter = 0;
        for (int i = 0; i < Line.length(); i++) {
            if (Line.charAt(i) == a) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}



