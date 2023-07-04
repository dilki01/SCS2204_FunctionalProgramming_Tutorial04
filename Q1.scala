object q1{
    def main(args:Array[String]): Unit={
        print("Input amount  ");
        var n1=scala.io.StdIn.readInt();
        var res=interest(n1);
        println(f"$res%.5f");
    }

    def interest(a:Int):Double =a match{
        case x if x>2000000 => a*0.065
        case x if x>200000 => a*0.035
        case x if x>20000 => a*0.04        
        case _ => a*0.02
    }
}