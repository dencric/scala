import scala.io.Source._
object FileRead extends App {
    if ( args.length < 1 ) {
        println("No Filename argument")
        System.exit(-1)
    }

    var filename = args(0)
    val fileLines = fromFile(filename).getLines.toList
    fileLines.foreach(println)
}
