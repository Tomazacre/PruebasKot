fun main(){
    val morningNotification = 51
    val eveningNotification = 135

    printNotificator(morningNotification)
    printNotificator(eveningNotification)
}

fun printNotificator(numberOfMessages: Int){
    if (numberOfMessages >= 100) println("Your Phone is blowing up! You have 99+ notifications")
    else println("You have $numberOfMessages notifications")
}