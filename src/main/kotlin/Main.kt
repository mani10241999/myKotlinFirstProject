fun main(args: Array<String>) {
    println("Hello World!")

    val a : Int = 100
    val d : Double = 10.00
    val f : Float = 1000.00f
    val l : Long = 10000000001432561
    val s : Short = 24

    println("The value of integer is $a" )
    println("The value of integer is $d" )
    println("The value of integer is $f" )
    println("The value of integer is $l" )
    println("The value of integer is $s" )

    println("Program arguments: ${args.joinToString()}")

    var write : Boolean
    write = false
    println("$write")
}