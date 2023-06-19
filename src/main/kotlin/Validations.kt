class Validations {
    fun userFeatures(){
        val obj=Methods()
        println("Enter UserName and Password")
        if(obj.loginUser(readln(), readln())){
            println("Login Successful")
            do{
                println(
                        " 1--> Search \n" +
                        " 2--> searchByRating \n" +
                        " 3--> View Movie List \n" +
                        " 4--> Sort By  \n"+
                        " 5--> Add to Favourites  \n"+
                        " 6--> view Favourites list  \n"+
                        " 7--> Remove From Favourite List \n"+
                        " 8--> Logout")
                when(readln().toInt()){

                    1->{
                        println("Enter Search")
                        obj.search(readln())
                    }

                    2 ->{
                        println("Enter Rating")
                        obj.filter(readln().toDouble())
                    }
                    3-> obj.viewMovies()
                    4->{
                        println("Enter Sort Element")
                        obj.sortBy(readln())
                        println("Movie List :")
                        obj.viewMovies()
                    }
                    5->obj.favouriteMovies()
                    6->{
                        println("Enter Name of Playlist To See or Type All to See Whole List")
                        obj.viewFavouriteList(readln())
                    }
                    7->{
                        println("Enter Movie Name and Favourite List to remove")
                        obj.removeFromFavouriteList(readln(), readln())
                    }
                    8->{
                        println("Logout Successful")
                        break
                    }

                    else-> println("Enter valid Choice")

                }
                println("y-->continue to do other operation  n--> Exit")
            }while (readln().equals("y",true))
        }
        else{
            println("Invalid Details")
        }
    }
    fun  administratorFeatures(){
        val obj=Methods()
        println("Enter Administrator User Name and Password")
        if(obj.loginAdministrator(readln(), readln())){
            println("Login Successful")
            do{
                println(" 1--> Add New Movie \n" +
                        " 2--> View Movie List \n" +
                        " 3--> Remove Movie  \n" +
                        " 4--> Logout")
                when(readln().toInt()){
                    1 -> obj.addMovies()

                    2-> obj.viewMovies()
                    3->{
                        println("Enter movie Name")
                        obj.removeMovie(readln())
                    }
                    4->{
                        println("Logout Successful")
                        break
                    }

                    else-> println("Enter valid Choice")

                }
                println("y-->continue to do other operation  n--> Exit")
            }while (readln().equals("y",true))

        }
    }

}