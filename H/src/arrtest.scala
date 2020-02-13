object arrtest extends App {
  var arrt1 :Array[Int]= new Array[Int](10)
var elmt0:Int=2;
def zapoln(a0:Int,arg:Array[Int]):Unit={for( st <- 1 to 10){arg(st)=a0*st;
}
}
  def sort(arg:Array[Int]):Unit={
  var res:Int=0
    for (st <- 1 to 10){
  for (st1 <-1 to 10){if (arg(st1)<arg(st1+1)){
  res=arg(st1+1);
  arg(st1+1)=arg(st1);
  arg(st1)=res;
  }
  }

  }}
  zapoln(elmt0,arrt1);
  sort(arrt1);
  for(st<- 1 to 10){println(arrt1(st))};



}
