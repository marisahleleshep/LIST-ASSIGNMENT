fun main(){

    println(evenIndices(listOf("Marion","Milkah","Lenah","Pius","Ajif","a","b","c","d","t")))
    println(calculations(listOf(70.0,20.0)))
    println(mileageAttribute(listOf(56,98)))
  println(evenIndices(listOf("Jane","Mike","Lenah","Sammy")))
    println(peopleList())

}
//   Given a list of 10 strings, write a function that returns a list of the strings
//    at even indices i.e index 2,4,6 etc

fun evenIndices(str: List<String>): List<String> {
    val x = mutableListOf<String>()
    str.forEachIndexed{ index, m->
        if(index%2==0)
            x.add(m)
    }
    return x
}




//val names= listOf("Marion","Milkah","Lenah","Pius","Ajif","a","b","c","d","t")
//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height

fun calculations(heights: List<Double>): Pair<Double, Double> {
    val p = heights.sum()
    val avg = p
    return Pair(avg, p)
}
//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
data class Attributes(var name:String,var age:Int,var heights: Int,var weight:Double)
    fun peopleList() {
        val person = Attributes("Jane", 30, 120, 99.9)
        val person1 = Attributes("Mike", 12, 70, 40.9)
        val person2 = Attributes("Lenah", 25, 67, 50.5)
        val person3 = Attributes("Sammy", 33, 85, 25.85)
        val Attributes = listOf(person, person1, person2, person3)

        val sortedattributes = Attributes.sortedByDescending { Attributes -> Attributes.name }
        println(sortedattributes)
    }

//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.

    fun listPeople(person: MutableList<String>) {
        val person4 = Attributes("Jane", 30, 25,40.0)
        val person5 = Attributes("John", 35, 30,56.87)
    }

//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
fun mileageAttribute(cars: List<Int>): Double {
    var Mileage = 0.0
    for (car in cars) {
        Mileage += car
    }
    return Mileage
}









