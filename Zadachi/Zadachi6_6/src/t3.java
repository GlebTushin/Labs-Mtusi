public class t3 {
    public static boolean validRgb(String line) {
        String params=(line.substring(line.indexOf("(")+1,line.length()-1));
        String[] hparm=params.split("," );
        int a=3;
        if (line.substring(0,4).equals("rgba"))
            a=a+1;
        if (hparm.length!=a)
            return false;
        for(int i=0;i<=hparm.length-1;i++){
            if (hparm[i].equals("")){
                return false;
            }
            if  (!((Integer.parseInt(hparm[i])>=0)&&(Integer.parseInt(hparm[i])<256)))
                return false;
        }
        if (a>3){
            if ((Integer.parseInt(hparm[hparm.length-1])>=0)&&((Integer.parseInt(hparm[hparm.length-1])<=1)))
                return true;
            else  return  false;}
        return true;
    }
    }

