object uhello extends App {
  var sp:Int=10;
  def summ(x:Int):Int={if (x>1) {println(x);
    summ(x-1)
  }
    x-1;}
summ(sp);
}