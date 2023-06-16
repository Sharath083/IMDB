import java.util.*

data class Details(val director:String, val title:String, val year:Int, val rating:Double, val language:String)
//Create a simplified version of IMDB. Store movies as a mutableList locally. Add attributes such as name, title, year, rating, language.
//
//Write a function to search in the mutableList. This function should search all attributes and return all possible results.
//
//Write another method which accept a rating as input and return all movies with rating above than the given input.
class Methods {
    private var movieList=  mutableListOf<Details>()
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
        println(movieList)
    }
    fun removeMovie(input: String){

        println( "Status : ${movieList.removeIf { it.title.equals(input,true) }}")

    }

}
