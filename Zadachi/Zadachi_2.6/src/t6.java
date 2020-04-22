public class t6 {public static int Fibonachi (int N){
    int summ=0;
    int at=1;
    for (int i=1;i<N+1;i++){
        summ=summ+at;
        at=summ;
    }
    return summ;
}
}
