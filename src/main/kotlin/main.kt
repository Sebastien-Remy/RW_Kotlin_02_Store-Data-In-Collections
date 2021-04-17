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

    // Challenge
    val card = Triple("Visa", "1221212", "21/02")
    val account = Pair(16000.0, card)
    val (balance, cb) = account
    val (cardName, cardNumber, _) = card

    println ("Account $balance,$cardName,$cardNumber")



}