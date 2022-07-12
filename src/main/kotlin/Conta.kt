abstract class Conta(var titular: String,
                 val numero: Int){

    var saldo = 0.0
        protected set

    fun deposita(valor: Double){
        println("depositando na conta do ${this.titular} o valor de R$ $valor")
        println("Saldo atual: ${this.saldo}")
        this.saldo += valor
        println("Saldo atualizado: ${this.saldo}")
    }

    abstract fun saca(valor: Double)
}
