public class t5 {public static String sameVowel(String line) {
   String line2="";
  String linevh= line.substring(0,line.indexOf(','));
    for (String word:line.split(", ")
         ) {if (check(glasnlist(linevh),glasnlist(word))){
             line2=line2+word+" ";

    }

    }
    return line2;
}
public static boolean check(String Line1,String Line2) {
    int count = 0;
    for (int i = 0; i < (Line1).length(); i++) {
        for (int j = 0; j < (Line2).length(); j++) {
            if ((Line2).charAt(j) == (Line1).charAt(i)) {
                count = count + 1;
            }

        }


    if (count == 0) {
        return false;
    }
count=0;}
    return true;
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
    public static  String glasnlist(String line){
        String  str1="";
        for(int i=0;i<line.length();i++){
            if (isglasn(line.charAt(i))){
                str1=str1+line.charAt(i);
            }
        }
        return str1;
    }


}
