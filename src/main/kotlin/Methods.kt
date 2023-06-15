data class Details(val director:String,val title:String,val year:Int,val rating:Double,val language:String)
//Create a simplified version of IMDB. Store movies as a mutableList locally. Add attributes such as name, title, year, rating, language.
//
//Write a function to search in the mutableList. This function should search all attributes and return all possible results.
//
//Write another method which accept a rating as input and return all movies with rating above than the given input.
class Methods {
    private var movieList=  mutableListOf<Details>()
    fun addMovies(){
        movieList.add(Details("SSR","RRR",2022,4.6,"Telugu"))
        movieList.add(Details("Rusove","Avengers",2019,4.8,"English"))
        movieList.add(Details("Snyder","SuperMan",2013,4.2,"Telugu"))
        movieList.add(Details("James","Avatar",2010,4.9,"English"))
        movieList.add(Details("Chris","Interstellar",2014,4.6,"English"))

    }
    fun search(input:String){
        val filterList: List<Details> = movieList.filter {
            it.director == input || it.language == input || it.title == input || it.year.toString()==input
        }
        println(filterList)
    }
    fun filter(inputRating:Double){
        val ratingList:List<Details> =movieList.filter {
            it.rating > inputRating
        }
        println(ratingList)
    }

}
