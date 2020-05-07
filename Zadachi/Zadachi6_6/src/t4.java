
public class t4 {
    public static String UrlParams(String Str) {
        String Url;
        int count;
        int a=Str.indexOf('?');
        if (a>0)
        Url=Str.substring(0,a+1);
        else
            return Str;
        String[] params=Str.substring(a+1).split("&");
        for (int i=0;i<params.length-1;i++){count=0;
        {for (int j=i+1;j<params.length;j++){
            if ((params[i].substring(0,2)).equals(params[j].substring(0,2)))
            count=count+1;
        }

        }if (count==0)
            Url=Url+params[i];
            count=0;
        }
        return Url+params[params.length-1];
    }

 public static String UrlParams(String Str,char sign) {
        String Url;
        int count;
        int a=Str.indexOf('?');
        if (a>0)
            Url=Str.substring(0,a+1);
        else
            return Str;
        String[] params=Str.substring(a+1).split("&");
        for (int i=0;i<params.length-1;i++){count=0;
            {for (int j=i+1;j<params.length;j++){
                if ((params[i].substring(0,2)).equals(params[j].substring(0,2)))
                    if (params[i].charAt(0)!=sign)
                    count=count+1;
            }

            }if (count==0)
                Url=Url+params[i];
            count=0;
        }
        if (params[params.length-1].charAt(1)!=sign)
            return Url;
        return Url+params[params.length-1];
    }
}




