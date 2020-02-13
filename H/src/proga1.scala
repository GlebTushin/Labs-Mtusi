object proga1 extends App {
  var fib:Int=1;
  def summafibonachi(a:Int):Unit={
    var t:Int=0;
    var y:Int=a;
    var b:Int=1;
    while (y<20){
      println(y);
      t=y;
      y=b+t;
      b=t;
    }
t=a+1;
}

summafibonachi(fib);
}
