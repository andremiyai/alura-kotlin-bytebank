package br.com.alura.bytebank.teste

fun testaExpressoes() {
    val entrada: String = "1"
    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema na conversão")
        e.printStackTrace()
        null
    }

    val valorComTaxa: Double? = if (1 == 1) {
        10.0
    } else {
        null
    }
    println(valorComTaxa)
}