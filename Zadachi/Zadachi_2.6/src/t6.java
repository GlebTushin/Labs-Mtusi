public class t6 {public static int Fibonachi (int N){if (N==0){return 1;}
   else if (N<2){return N; }
    else {int summ=0;
        for (int i=2;i<N+1;i++) {
            summ=Fibonachi(i-1)+Fibonachi(i-2);
        }
        return summ;
    }
}
}

