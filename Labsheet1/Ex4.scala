object Ex4 extends App{

  //calculate normal books price
  def bookPrice(n:Int)=24.95*n

  //calculate discount
  def discount(a:Double):Double=0.4*a

  //calculate shipping amount
  def shipping_cost(n:Int):Double=if(n>50)3*50+(n-50)*0.75 else n*3

  //calculate wholesale amount
  var amount=bookPrice(60)-discount(bookPrice(60))+shipping_cost(60)
  printf("Wholesale Amount is:%f",amount)


}
