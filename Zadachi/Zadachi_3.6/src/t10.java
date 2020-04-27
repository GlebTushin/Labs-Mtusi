public class t10 {public static boolean isangle(int x,int y,int z){
  if ((x*x==y*y+z*z)|(y*y==x*x+z*z)|(z*z==x*x+y*y)){
     return true;
  }
  return false;
}
}
