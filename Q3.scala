object q3 {

  def main(args: Array[String]): Unit = {

    println(upper("Benny"))
    println(formatNames("Niroshan",1))
    println(lower("Saman"))
    println(formatNames("Kumara",5))

  }

  def upper(r:String) : String = {
     val result = r.toUpperCase()
    return result
  }

  def lower(r:String) : String = {
    val result = r.toLowerCase()
    return result
  }
  def formatNames(r:String,n:Int):String={
    val getChar=r.charAt(n)
    val setChar=getChar.toUpper
    return r.patch(n,setChar.toString,1)
  }

}