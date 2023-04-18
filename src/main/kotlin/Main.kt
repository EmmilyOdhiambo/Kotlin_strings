fun main() {
    institution()

    var emmie = myself("Stephanie","Akirachix")
    println(emmie)

        identity()

    println(students("I have started my journey in Akirachix"))


    println(details("Stephanie","Kilimanjaro"))
}


//Create a function of string and print out a string hence get the first ,third
//and forth characters of the string

fun institution (){
    var institution =  "CentralBank"
    println(institution[0])
    println(institution[2])
    println(institution[3])
}

//Write a function that takes in 2 parameters name and school and return a string with the structure
//"Hello, I am (name) student at (school)"
fun myself (name:String,school:String):String{
    var sentence = ("Hello,I am $name student at $school")
    return sentence
}
//Write a function that takes in a name and prints out "I know it's me!"when your name is passed
//to it otherwise it prints out "I don't know her"

fun identity () {
    var name = "Stephanie"
    if (name.equals(name)) {
        println("I know its me")

    } else {
        println("I know its me")
    }
}

//Write a function that takes in a string and returns its length
fun students (text:String):Int{
//    var student =("I have started to navigate my journey")
    return text.length
}

//Write and invoke a function that takes in any 2 strings and returns the first
//character of the longer string or the first character of the first string if they are
//equal in length.
fun details (name: String,mount:String):Char{
    return if (name.length>=mount.length){
        name [0]
    }
    else{
        mount[0]
    }

}
