public class t4 {
    public static double work(double begin,double end,double pay,double ind){
       double sallary=0;
       begin=(int)(begin)*60+(begin-(int)begin)*60;
        end=(int)(end)*60+(end-(int)end)*60;
        while (begin<end){
            if ((begin>=9*60)&&(begin<=17*60)){
             sallary=sallary+pay/60;
            }
            else{sallary=sallary+pay/60*ind; }
            begin=begin+1;
        }
        return sallary;
            }
        }






