public class t5 {public static String prof(int N,int a,int b){

       if (N==(a+b)){
            return("Сложенны");
        }
        else if(N==(a-b)){
            return("Вычтены");
        }
       else if(N==(a*b)){
            return("Умноженны");
        }
       else if(N==(a/b)){
            return("Разделенны");
        }
        else{
            return ("None");
        }


}
}
