public class t10 {public static boolean palindromdescedant(int x){
    String a=String.valueOf(x);
    while (a.length()>1){
    if (a.equals(reverse(a)))
    return true;
    String[] chisla=a.split("");
    a="";
    for (int i=0;i<chisla.length-1;i=i+2) {
        a=a+String.valueOf(Integer.parseInt(chisla[i])+Integer.parseInt(chisla[i+1]));
    }
    }

        return false;
    }

    public static String reverse (String s){
        String a="";
        for (int i=0;i<s.length();i++){
            a=a+s.charAt(s.length()-i-1);

        }
        return a; }
}
