object Ex3 extends App {

  //calculate normalpay salary
  def normalPay(n:Int)=250*n

  //calculate OT pay
  def otPay(x:Int)=85*x

  //calculate tax
  def tax(a:Double)=a*0.12

  //get user input for normal and ot hours
  println("Enter Normal Hours : ")
  val normal:Int=scala.io.StdIn.readInt()

  println("Enter OT Hours : ")
  val ot: Int = scala.io.StdIn.readInt()

  val gross_salary: Int = normalPay(normal) + otPay(ot)

  val take_home_sal:Double=gross_salary -tax(gross_salary)

  printf("Your Take Home Salary:%f",take_home_sal)

}
