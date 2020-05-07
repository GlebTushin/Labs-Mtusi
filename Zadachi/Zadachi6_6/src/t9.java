import com.sun.imageio.plugins.common.I18N;

public class t9 {
    public static boolean formula(String Line) {
       String[] elements=Line.split("=");
        for (int i=0;i<elements.length-1;i++)
             {if( podschet(elements[i])!=podschet(elements[i+1]))
                     return false;

        }
        return true;
}
public static int podschet (String s){
char sign;
        for (int i=0;i<s.length();i++)
        {if ((s.charAt(i)>57)|(s.charAt(i)<48)){sign=s.charAt(i);
            switch (sign){
                case '+':
                    {return Integer.parseInt(s.substring(0,i))+Integer.parseInt(s.substring(i+1));

                    }
                case'-':{return Integer.parseInt(s.substring(0,i))-Integer.parseInt(s.substring(i+1));}
                case'*':{return Integer.parseInt(s.substring(0,i))*Integer.parseInt(s.substring(i+1));}
                case'/':{return Integer.parseInt(s.substring(0,i))/Integer.parseInt(s.substring(i+1));}
            }

        }

        }
        return Integer.parseInt(s);
}

}