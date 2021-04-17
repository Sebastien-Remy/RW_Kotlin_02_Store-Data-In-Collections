fun main(args: Array<String>) {
    val fullName = Pair<String, String>("Seb", "REMY")
    val age = 50

    println ("My name is ${fullName.first}, ${fullName.second}")

    val (myName: String, myLastName: String) = fullName
    println ("My name is $myName, $myLastName")

    val birthday = Triple(19,4,1971)
    val person = Pair("Seb", birthday)
    val (name: String, bday) = person
    val (_, month, year) = bday

    println ("$name was on $year/$month")

}