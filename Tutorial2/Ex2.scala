object Ex2 extends App {
   var a:Int=2
   var b:Int=3
   var c:Int=4
   var d:Int=5
   var k:Double=4.3f
 // evaluate a) println( - -b * a + c *d - -);
   b-=1
   d-=1
   println((b*a)+(c*d))

   //evaluate b) println(a++);
   a+=1
   println(a)

   //evaluate c) println (–2 * ( g – k ) +c); This won't compile

   //evaluate d) println (c=c++);
   c+=1
   println(c)

   //evaluate e) println (c=++c*a++);
   c*=a
   println(c)
}


