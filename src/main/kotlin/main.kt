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

    // Array
    val visitedCountries = arrayOf<String>(
       "USA", "CostaRica", "Spain", "Netherlands"
    )

    println(visitedCountries[1])
    println(visitedCountries.get(2))

    println(visitedCountries.size)
    visitedCountries[1] = "United State of America"
    println(visitedCountries[1])

    println(visitedCountries.first())
    println(visitedCountries.last())

    val hasVisitedCountry = visitedCountries.contains("GB")
    println ("Visited country ? $hasVisitedCountry")

    // List
    val cities = listOf("Paris", "Los Angeles", "Amsterdam", "Barcelone", "Casablanca")
    println (cities)

    // Mutuable list
    val mutableCitiesList = cities.toMutableList()
    mutableCitiesList.add("London")
    mutableCitiesList.add(1, "Bordeaux")
    println (mutableCitiesList)

    mutableCitiesList.remove("Paris")
    mutableCitiesList.removeAt(0)
    mutableCitiesList.removeAll(listOf("London", "Amsterdam"))
    println (mutableCitiesList)

    val combinedList = cities + mutableCitiesList
    println (combinedList)

    mutableCitiesList.clear()
    println (mutableCitiesList)

    // Challenge
    val favouredFilms = arrayOf<String>(
        "Alien", "StarWars", "The 5th Element", "James Bond 007"
    )
    favouredFilms[1] = "Starwars III"

    val favouredFilmList = favouredFilms.toMutableList()
    favouredFilmList.add("Indiana Jones")
    favouredFilmList.add(3, "Big blue")
    favouredFilmList.remove("The 5th Element")
    println(favouredFilmList)
}