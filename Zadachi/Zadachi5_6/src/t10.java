public class t10 {public static String isangle(int x){
    int sum=1;
    int i=1;
    int cout=1;
    String pech=" ";
    if (x==1){
        return "*";
    }
  while(!(sum>x)){
      sum=sum+i*6;
      cout=cout+2;
      if (sum==x){for (int j=i+1;j<cout+1;j++){


          for (int k=0;k<j;k++){
              pech=pech+"*";

          }
          System.out.println(pech);
          pech="";
      }
          for (int j=cout-1;j>i;j=j-1){
              int prob=1;
              while (prob>0){
                  pech=pech+" ";
                  prob=prob-1;
              }
              for (int k=0;k<j;k++){
                  pech=pech+"*";

              }
              System.out.println(pech);
              pech="";
          }
     return "";
      }

i=i+1;
    }

     return "invalid";
}
}
