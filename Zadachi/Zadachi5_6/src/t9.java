

public class t9 {
    public static String Title(String Line) {
        String Longtitle = "";

        for (String word : Line.split(" ")
        ) {
            String a = word.toLowerCase();
            if (a.equals("and") | a.equals("the") | a.equals("in") | a.equals("of")) {
                Longtitle = Longtitle +" "+ word.toLowerCase();
            } else {int v=a.indexOf('-');
                if (v>0){
                Longtitle = Longtitle +" "+ word.toUpperCase().charAt(0) + a.substring(1,v+1)+word.toUpperCase().charAt(v+1)+a.substring(v+2) ;

            }
                else{
                Longtitle = Longtitle +" "+ word.toUpperCase().charAt(0) + a.substring(1);}

            }

        }
        return Longtitle;
    }
}