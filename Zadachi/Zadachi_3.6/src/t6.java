public class t6 {public static boolean unique (String Str1,String Str2){
 int arr1[]=Stringparser(Str1);
    int arr2[]=Stringparser(Str1);
    if (uniq(arr1)==uniq(arr2)){return true;}
    return false;
}
public static int[] Stringparser (String Str){int i=0;
    Str.split(" ");
    int arr[]=new int[Str.length()];
    for (String retval:Str.split(" ")
         ) {
        arr[i]=Integer.parseInt(retval);
        i=i+1;
    }
    return arr;
}
public static int uniq(int[] arr) {
    int zc = 0;
    int contr = 0;
    for (int i = 0; i < arr.length; i++) {
        zc=0;
        for (int j = 0; i < arr.length; i++) {
            if (arr[j] == arr[i]) {
                zc = zc + 1;
            }
        }
        if (zc==0){contr=contr+1;}
    }
    return contr;
}
}

