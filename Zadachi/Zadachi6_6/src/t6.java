public class t6 {
    public static int ulam(int number) {
        int count=2;
        int newul = 3;
        int cont=0;
        int[] ulams = new int[number];
        ulams[0] = 1;
        ulams[1] = 2;
        while (count<number){
        for (int i=0;i<count-1;i++){
            {for (int j=i+1;j<count;j++)
                if (newul==ulams[i]+ulams[j])
                    cont=cont+1;
                if (cont>1)
                    break;
            }
        if (cont>1) break;
        }
        if (cont==1){
            ulams[count]=newul;
            count=count+1;
        }
        newul=newul+1;
        cont=0;
        }
        return ulams[number-1];
    }
}


