package br.com.alura.bytebank.modelo

abstract class Conta(var titular: Cliente,
                     val numero: Int){

    var saldo = 0.0
        protected set

    companion object {
        var total = 0
        private set
    }

    init{
        println("Criando conta")
        total++
    }

    fun deposita(valor: Double){
        println("depositando na conta do ${this.titular} o valor de R$ $valor")
        println("Saldo atual: ${this.saldo}")
        this.saldo += valor
        println("Saldo atualizado: ${this.saldo}")
    }

    abstract fun saca(valor: Double)
}
