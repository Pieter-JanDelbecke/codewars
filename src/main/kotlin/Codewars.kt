fun main(args:Array<String>){
    println(getMiddle("test"))
    println(getMiddle("middle"))
    println(getMiddle("A"))
    println(getMiddle("dre"))
}

fun getMiddle(word:String):String{
    val length: Int = word.length
    val half: Int = length/2
    return if(length%2 == 0)word.substring(half-1, half+1) else word[half].toString()
}