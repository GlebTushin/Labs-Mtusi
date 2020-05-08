public class t2 { public static boolean isfigure(String figure,String pos1,String pos2) {
    int p1x=(int)pos1.charAt(0);
    int p1y=(int)pos1.charAt(1);
    int p2x=(int)pos2.charAt(0);
    int p2y=(int)pos2.charAt(1);
       switch (figure){
           case "pawn":{
               if ((p1x==p1y)&&((p2y==p1y+1)|(((p1y-8)==2)&&(p2y==p1y+2)))){
                   return true;
               }
           }
           case "rook": {if ((p2x!=p1x)^(p2y!=p1y)){
               return true;
           }
           return false;
           }
           case "bishop":{if (Math.abs(p1x-p2x)==Math.abs(p1y-p2y)){
           return true;}
           return false;
           }
           case "queen":{if (((p2x!=p1x)^(p2y!=p1y))|(Math.abs(p1x-p2x)==Math.abs(p1y-p2y))){
               return  true;
           }
           return false;
           }
           case "king":{if (((Math.abs(p1x-p2x)>0)&&(Math.abs(p1x-p2x)<1))|((Math.abs(p1y-p2y)>0)&&(Math.abs(p1y-p2y)<1))){
             return true;
           }
           return false;

           }
               case "knight":{if(((Math.abs(p2x-p1x)==2)&&(Math.abs(p1y-p2y)==1))|((Math.abs(p2x-p1x)==1)&&(Math.abs(p1y-p2y)==2))){
                   return true;
               }
               return false;

           }
       }
       return false;
    }
}