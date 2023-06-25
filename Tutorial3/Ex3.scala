object Ex3 extends App{

  println("Enter Two Numbers: ")
  val a:Int=scala.io.StdIn.readInt()
  val b:Int=scala.io.StdIn.readInt()

  def mean(a:Int,b:Int): Double={
     val avg=(a+b)/2.0
    BigDecimal(avg).setScale(2,BigDecimal.RoundingMode.HALF_UP).toDouble
  }

  val avg=mean(a,b)
println(avg)


}
