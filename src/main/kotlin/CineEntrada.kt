fun main(){
    val child = 5
    val adult = 28
    val senior = 87

    val lunes = true

    println("The movie ticket for a person aged $child is \$${ticketPri(child, lunes)} USD")
    println("The movie ticket for a person aged $adult is \$${ticketPri(adult, lunes)} USD")
    println("The movie ticket for a person aged $senior is \$${ticketPri(senior, lunes)} USD")
}

fun ticketPri(age: Int, lun: Boolean): Int{
    if (age <= 12){
        return 15
    } else if (age >= 13 && age <= 60) {
        if (lun == true) {
            return 25
        } else {
            return 30
        }
    } else if (age >= 61 && age <= 100) {
        return 20
    }else {
        return -1
    }
}