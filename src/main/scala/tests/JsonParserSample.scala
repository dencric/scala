package tests

import org.json4s._
import org.json4s.native.JsonMethods._

object JsonParserSample {

case class Mailserver(url: String, username: String, password: String)

implicit val formats = DefaultFormats

val json = parse(
"""
{ 
  "url": "imap.yahoo.com",
  "username": "myusername",
  "password": "mypassword"
}
"""
)

  def main(args: Array[String]) {
    val m = json.extract[Mailserver]
    println(m.url)
    println(m.username)
    println(m.password)
  }

}
