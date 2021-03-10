fun main() {
    school()
    sentence("Iman Yahya",18)
    name("Iman Yahya")
    name("Angela")







}
fun school() {
    var school="akirachix"
    println(school[0])
    println(school[2])
    println(school[3])
    println(lengthofstring("September"))


}
fun sentence(name:String,age:Int) {


    val name = "Iman Yahya"
    val age = 18
    println("Hello my name is $name and i am $age years old")
}


fun lengthofstring(month:String):Int{
    val i=month.length
    return(i)


}
fun name(name:String) {

    if (name =="Iman Yahya"){
        println("that's me")




}else {
    println("i don't know who that is")

}
}