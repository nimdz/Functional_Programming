object Ex1 extends App {

  val text=scala.io.StdIn.readLine("Enter a string: ");

  def rev(s:String):String=if(s.length ==1)s else rev(s.tail)+s.charAt(0)

  val rev_text=rev(text);

  printf("Reversed String: %s",rev_text);
}
