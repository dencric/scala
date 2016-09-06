case class Profile ( name:String, age:Int)
object SqlFromScala extends App {
var columnname = Seq("Name","Age")
var mylist = List(("Raj",42), ("Priya", 39), ( "Junnu", 9), ("Ananya", 12))
// _* explodes the List/array when passed an argument to a function that takes variable number of args
val mapsqldata = mylist.toDF(columnname:_*)
mapsqldata.createOrReplaceTempView("profiles")

//Uncomment the below line in a separate paragraph in Zeppelin to see the visualization
//%sql select * from profiles 
}
