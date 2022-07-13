fun testaCondicoes(saldo: Double){
    when {
        saldo > 100.0 -> println("conta positiva")
        saldo == 0.0 -> println("modelo.Conta sem Saldo")
        else -> println("modelo.Conta negativa")
    }
}