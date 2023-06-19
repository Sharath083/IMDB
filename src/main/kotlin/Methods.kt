import java.util.*
class MyCustomException(message: String) : Exception(message)
data class Details(val director:String, val title:String, val year:Int, val rating:Double, val language:String)
data class MovieList(val director:String, val title:String, val year:Int, val rating:Double, val language:String?,val playListName:String)
//Create a simplified version of IMDB. Store movies as a mutableList locally. Add attributes such as name, title, year, rating, language.
//
//Write a function to search in the mutableList. This function should search all attributes and return all possible results.
//
//Write another method which accept a rating as input and return all movies with rating above than the given input.
class Methods {
    private var movieList=  mutableListOf<Details>()
    private var favouriteList=  mutableListOf<MovieList>()
    private val reader = Scanner(System.`in`)
    init {
        movieList.add(Details("SSR","RRR",2022,4.6,"Telugu"))
        movieList.add(Details("Rusove","Avengers",2019,4.8,"English"))
        movieList.add(Details("Snyder","SuperMan",2013,4.2,"Telugu"))
        movieList.add(Details("James","Avatar",2010,4.9,"English"))
        movieList.add(Details("Chris","Interstellar",2014,4.6,"English"))
    }

    fun addMovies(){

//        var again:Int
        do{
            println("Enter Director name")
            val director= readln()
            println("Enter Movie name")
            val movie= readln()
            println("Enter Year")
            val year=reader.nextInt()
            println("Enter Rating")
            val rating=reader.nextDouble()
            reader.nextLine()
            println("Enter Language")
            val language=readln()
            movieList.add(Details(director,movie,year,rating, language))
            println("y-->Add again  n--> Exit")
//        repeat=reader.nextLine()
        }while (readln().equals("y",true))

    }
    fun search(input:String){
        val filterList: List<Details> = movieList.filter {
            it.director.contains(input,true) || it.language.contains(input,true) || it.title.contains(input,true)  || it.year.toString().contains(input,true)
        }
        println(filterList)
    }
    fun filter(inputRating:Double){
        val ratingList:List<Details> =movieList.filter {
            it.rating > inputRating
        }
        println(ratingList)
    }
    fun  viewMovies(){
        movieList.forEach { println(it) }
    }
    fun removeMovie(input: String){

        println( "Status : ${movieList.removeIf { it.title.equals(input,true) }}")

    }
    fun sortBy(input: String){

        when(input.lowercase()){
            "title"->movieList.sortBy{ it.title }
            "year"->movieList.sortBy { it.year }
            "director"->movieList.sortBy { it.director }
            "language"->movieList.sortBy { it.language }
            "rating"->movieList.sortBy { it.rating }
            else->println("Enter valid sort Element")
        }
    }
    private fun movieDetails(input: String): List<Details> {
        val movie=movieList.filter {
            it.title.equals(input, true)
        }
        return movie
    }

    fun favouriteMovies() {

        do {
            println("Enter Movie Name")
            val input= readln()
            val movieDetails=movieDetails(input)


            try {


                if ( movieDetails.isNotEmpty()) {
                    println("Enter Movie List name")
                    val favouriteListName= readln()
                    val bool=favouriteList.any { it.title.equals(input,true) && it.playListName.equals(favouriteListName,true)}
                    if(!bool ){
                        favouriteList.add( MovieList(movieDetails[0].director, movieDetails[0].title,
                            movieDetails[0].year, movieDetails[0].rating, movieDetails[0].language,favouriteListName))
                        println("added $movieDetails to favourite list $favouriteListName")
                    }
                    else {
                        throw MyCustomException("DuplicateMovieException")

                    }
                }
                else{
                    throw MyCustomException("MovieDoesNotExistsException")
                }

            } catch (e: MyCustomException) {
                println(e)

            }
            println("y--> to add new movie n--> to exit")
        }while (readln().equals("y",true))
    }
    fun viewFavouriteList(input: String){
        val bool=favouriteList.any { it.playListName.equals(input,true) }
        if(input.equals("all",true)){
            favouriteList.forEach { println(it) }
        }
        else if(bool){
            println(favouriteList.filter { it.playListName.equals(input,true) })
        }
        else{
            println("Playlist With Name $input Does Not Exists")
        }

    }
    fun removeFromFavouriteList(input: String,listName:String){
        favouriteList.removeIf { it.title.equals(input,true) && it.playListName == listName }

    }
}


