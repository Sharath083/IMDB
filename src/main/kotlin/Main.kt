
fun main() {
    val obj=Methods()
//    d.addMovies()
//    d.search("RRR")
//    d.filter(4.2)

//    var repeat:String

    do{
        println(" 1-->Add New Movie \n" +
                " 2--> Search \n" +
                " 3--> searchByRating \n" +
                " 4-->View Movie List \n" +
                " 5--> Remove Movie  \n" +
                " 6--> Sort By  \n"+
                " 7--> Add to Favourites  \n"+
                " 8--> view Playlist  \n"+
                " 9-->Remove From Favourite List ")
        when(readln().toInt()){
            1 -> obj.addMovies()

            2 ->{
                println("Enter Search")
//                val input= readln()
                obj.search(readln())
            }

            3 ->{
                println("Enter Rating")
                obj.filter(readln().toDouble())
            }
            4-> obj.viewMovies()
            5->{
                println("Enter movie Name")
                obj.removeMovie(readln())
            }
            6->{
                println("Enter Sort Element")
                obj.sortBy(readln())
                println("Movie List :")
                obj.viewMovies()
            }
            7->obj.favouriteMovies()
            8->{
                println("Enter Name of Playlist To See or Type All to See Whole List")
                obj.viewFavouriteList(readln())
            }
            9->{
                println("Enter Movie Name and Favourite List to remove")
                obj.removeFromFavouriteList(readln(), readln())
            }
            else->
                println("Enter valid Input")


        }
        println("y-->continue to do other operation  n--> Exit")
//        repeat=reader.nextLine()
    }while (readln().equals("y",true))


}