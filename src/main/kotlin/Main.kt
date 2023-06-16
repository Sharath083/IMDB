
fun main() {
    val obj=Methods()
//    d.addMovies()
//    d.search("RRR")
//    d.filter(4.2)

//    var repeat:String

    do{
        println("1-->Add New Movie  2--> Search 3--> searchByRating 4-->View Movie List 5--> Remove Movie ")
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
            else->
                println("Enter valid Input")


        }
        println("y-->continue to do other operation  n--> Exit")
//        repeat=reader.nextLine()
    }while (readln().equals("y",true))

}