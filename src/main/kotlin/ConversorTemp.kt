fun main(){
    printTempFinal(27.0, "Celsius", "Fahrenheit")
    printTempFinal(350.0, "Kelvin", "Celsius")
    printTempFinal(10.0, "Fahrenheit", "Kelvin")
}


fun converter(temp: Double, tipo: String): Double{
    var res: Double = 0.0

    if (tipo.equals("Celsius")){
        res = (1.8 * temp.toDouble()) + 32
    }else if (tipo.equals("Kelvin")){
        res = temp - 273.15
    }else if (tipo.equals("Fahrenheit")){
        res = (0.55555555556 * (temp.toDouble() - 32)) +273.15
    }
    return res.toDouble()
}

fun printTempFinal(iniMeasure: Double, iniUnit: String, finUnit: String){
    val finMeasu = String.format("%.2f", converter(iniMeasure.toDouble(),iniUnit))

    println("$iniMeasure degrees $iniUnit is $finMeasu degrees $finUnit.")
}