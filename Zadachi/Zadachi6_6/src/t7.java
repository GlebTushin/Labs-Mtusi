public class t7 {
    public static String longest(String s)
    {String max="";
        String prin="";
        while (s.length()>1) {
            prin = prin + s.charAt(0);
            s = s.substring(1);
            char a = s.charAt(0);
            if (prin.indexOf(a) >= 0){
                if (prin.length()>max.length())
                    max=prin;
                prin="";
            }

        }
if (prin.indexOf(s.charAt(0))<0){
    prin=prin+s.charAt(0);
    }

if (max.length()>prin.length())
    return max;
    return prin;}
}