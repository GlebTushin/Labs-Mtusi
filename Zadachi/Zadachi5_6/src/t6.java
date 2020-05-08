public class t6 {public static boolean card (long number) {
    String lcard=String.valueOf(number);
    int summa=0;
    int i=1;
    int doubling=0;
    String card=lcard.substring(0,lcard.length()-1);
   if ((lcard.length()>19)|(lcard.length()<14)){
        return false;
    }
    int control=(int)(number%10);
    number=number/10;
    for (String pasrt:card.split("")
         )

        {
        if ((i%2)!=0){
            doubling=Integer.parseInt(pasrt)*2;
            summa=summa+doubling%10+doubling/10;
        }
        if (i%2==0){
        summa=summa+Integer.parseInt(pasrt);
        }
        i++;
    }
    if (control==10-summa%10){
        return  true;
   }
    return false ;
    }
}


