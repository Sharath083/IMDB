
fun main() {
    val d=Methods()
//    d.addMovies()
//    d.search("RRR")
//    d.filter(4.2)

//    var repeat:String

    do{
        println("1-->Add New Movie  2--> Search 3--> searchByRating 4-->View Movie List 5--> Remove Movie ")
        when(readln().toInt()){
            1 -> d.addMovies()

            2 ->{
                println("Enter Search")
//                val input= readln()
                d.search(readln())
            }

            3 ->{
                println("Enter Rating")
                d.filter(readln().toDouble())
            }
            4-> d.viewMovies()
            5->{
                println("Enter movie Name")
                d.removeMovie(readln())
            }
            else->
                println("Enter valid Input")


        }
        println("y-->continue to do other operation  n--> Exit")
//        repeat=reader.nextLine()
    }while (readln().equals("y",true))

}