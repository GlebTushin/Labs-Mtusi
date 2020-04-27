public class t8 {public static boolean Rhyme(String Line1,String Line2){
   String Str1=glasnlist(Line1.substring(Line1.lastIndexOf(" ")));
    String  Str2=glasnlist(Line2.substring(Line2.lastIndexOf(" ")));
    if (Str1.toUpperCase().equals(Str2.toUpperCase())){
        return true;
    }



    else {return false;}

    }


// проверка появления гласной
public static boolean isglasn(char a){
    switch (a){
        case 'a':{return true;}
        case 'e':{return true;}
        case 'y':{return true;}
        case 'i':{return true;}
        case 'u':{return true;}
        case 'o':{return true;}
        case 'A':{return true;}
        case 'E':{return true;}
        case 'Y':{return true;}
        case 'I':{return true;}
        case 'U':{return true;}
        case 'O':{return true;}
    }
    return  false;
}
//отделение гласных
public static  String glasnlist(String Line){
    String  str1="";
    for(int i=0;i<Line.length();i++){
        if (isglasn(Line.charAt(i))){
            str1=str1+Line.charAt(i);
        }
    }
    return str1;
}
}
