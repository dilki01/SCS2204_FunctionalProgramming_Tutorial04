object q2{
    def main(args:Array[String]): Unit={
        print("Input anumber  ");
        var n1=scala.io.StdIn.readInt();
        var res=PetternMaching(n1);
        println(res);
    }

    def PetternMaching(a:Int):String =a match{
        case x if x<=0 => "Negative/Zero"
        case x if x%2==0 => "Even"
        case _ => "Odd"
    }
}