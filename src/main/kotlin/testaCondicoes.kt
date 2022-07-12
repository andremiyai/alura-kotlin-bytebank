fun testaCondicoes(saldo: Double){
    when {
        saldo > 100.0 -> println("conta positiva")
        saldo == 0.0 -> println("Conta sem Saldo")
        else -> println("Conta negativa")
    }
}