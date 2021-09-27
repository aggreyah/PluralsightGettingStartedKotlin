fun main(args: Array<String>){
    var a = 8
    var b = 64
    var additionResult = myfunction(a, b) { a, b -> a + b }
    var multiplicationResult = myfunction(a, b) { a, b -> a * b }
    var divisionResult = myfunction(a, b) { a, b -> b / a }
    println("Addition: $additionResult")
    println("Multiplication: $multiplicationResult")
    println("Division: $divisionResult")
}

fun myfunction(firstInt: Int, secondInt: Int, functionParameter: (Int, Int) -> Int) : Int {
    return functionParameter(firstInt, secondInt)
}
