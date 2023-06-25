object Ex5 extends App {

  //calculate time for easy pace
  def easy(d:Int)=8*d

  //calculate time for tempo pace
  def tempo(x:Int)=7*x

  //calculate total time
  var t=easy(2)+tempo(3)+easy(2)

  print(t)



}
