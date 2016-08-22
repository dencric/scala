class MethodTest() {
  private var _name  =  ""
  var age = 0

  //Getter
  def name = _name

  //Setter
  def name_= ( name: String):Unit = _name = name

  def setName( name: String):Unit = _name = name

  def main(args: Array[String]) {
     var mt = new MethodTest()
     mt.name = "Raj"
     println(mt)
  }
  
  
}
