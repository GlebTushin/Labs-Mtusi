public class t1 {
    public static int BellNum(int n) {
        int summ=0;
        for (int i=0;i<=n;i++)
            summ=summ+Stirling(n,i);
        return summ;
    }
public static int  Stirling(int n,int k)
{if((n==0)||(k==0)||(k>n)){
    return 0;}
if (k==1||k==n){
    return 1;}
return k*Stirling(n-1,k)+Stirling(n-1,k-1);
}

}