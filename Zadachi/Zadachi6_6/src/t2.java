public class t2 {public static String translatin(String line) {
    String line1="";
    for (String part:line.split(" ")
    ) {
        line1=line1+translat(part);
    }
    return line1;
}
    public static String translat(String word)   {String line2 ="";
        int a=(int)word.charAt(0);
        if (((a>64)&&(a<91))|((a>96)&&(a<123))){
            if (isglasn((char)a)){
                if (word.charAt(word.length()-1)<64)
                    line2=line2+word.substring(0,word.length()-1)+"yay"+word.charAt(word.length()-1);
                else line2=line2+word+"yay";
            }
            else{
                if (a<96)
                    line2=line2+((int)word.charAt(1)+1);
                else
                { line2=line2+word.charAt(1);}
                if (word.charAt(word.length()-1)<64)
                    line2=line2+word.substring(2,word.length()-1)+word.charAt(0)+"ay"+word.charAt(word.length()-1);
                else
                    line2=line2+word.substring(2)+word.charAt(0)+"ay";
            }
        }

        line2=line2+" " ;
        return line2;
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


}
