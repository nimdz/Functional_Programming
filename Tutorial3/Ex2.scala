object Ex2 extends App{

  def filterStrings(list: List[String]):List[String]=list.filter( _.length>5);

  val inputList=List("apple","banana","kiwi","Pineapple","Orange");
  val outList=filterStrings(inputList);
  println(outList)
}
