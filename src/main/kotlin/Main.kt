fun main() {
    val words = listOf("zero","one","two","three","four","five","six","seven","eight","nine")
    val evenNums = evenIndexes(words)
    println(evenNums)

    //quiz 2
    val height = listOf(1.72, 1.85, 1.68, 1.91, 1.76)
    val (averageHeight, totalHeight) = peopleUnits(height)
    println("$averageHeight metres")
    println("$totalHeight metres")

    //Quiz 3
    val people = listOf(
        Person("Alice", 25, 1.72, 65.0),
        Person("Sparks", 31, 1.85, 80.0),
        Person("Fiddel", 18, 1.68, 55.0),
        Person("Simon", 45, 1.91, 90.0),
        Person("Maryanne", 29, 1.76, 70.0)
    )

    val sortedByAgeDescending = people.sortedByDescending { it.age }
    println(sortedByAgeDescending)

    //quiz 4
    val peopleList = mutableListOf<Person>()
//    addPeopleToList(peopleList)

    //quiz 5
    val carList = listOf(
        Car("ABC123", 5000),
        Car("DEF456", 10000),
        Car("GHI789", 7500)
    )
    val averageMileage = calculateAverageMileage(carList)










}
//1. Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
fun evenIndexes(words:List<String>):List<String>{
    val result = mutableListOf<String>()
    for (x in words.indices step 2){
        result.add(words[x])
    }
    return result
}
//2. Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun peopleUnits(height:List<Double>):Pair<Double,Double>{
    val totalHeight = height.sum()
    val averageHeight = totalHeight
    return Pair(averageHeight, totalHeight)
    

}
//3.Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
data class Person(var name: String, var age: Int, var height: Double, var weight: Double)



//4. Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
data class Persons(val name: String, val age: Int)



//quiz 5Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class Car(val registration: String, val mileage: Int)

fun calculateAverageMileage(carList: List<Car>): Double {
    val totalMileage = carList.sumBy { it.mileage }
    return totalMileage.toDouble()
}

