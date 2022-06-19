fun main(args:Array<String>){
 println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"))
}

fun highAndLow(numbers:String): String {
    val numbersToList =  numbers.split(" ")
    val numbersList = numbersToList.map { it.toInt() }
    val HighestNum = numbersList.maxByOrNull { it }
    val LowestNumber = numbersList.minByOrNull { it }
    return HighestNum.toString() +" "+ LowestNumber.toString()
}