fun main(){
    val obj=Validations()
    println("1--User 2--> Administrator")
    when(readln().toInt()){
        1->obj.userFeatures()
        2->obj.administratorFeatures()
        else-> println("Enter valid Choice")
    }


}