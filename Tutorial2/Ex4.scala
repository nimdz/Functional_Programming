object Ex4 extends App{

  //calculate atendees by given ticket price
  def attendees(price:Int):Int=120+((15-price)/5)*20

  //calculate ticket earnings
  def ticket_earn(price:Int):Int=attendees(price)*price

  //calculate additional cost
  def cost(price:Int)=500+(attendees(price)*3)

  //calculate profit
  def profit(price:Int)=ticket_earn(price)-cost(price)

  //calculate profits for different ticket prices
  print(profit(10),profit(15),profit(20),profit(25))
  print(profit(30),profit(35),profit(40))

}
