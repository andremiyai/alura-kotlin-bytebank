fun main(){
    println("Bem vindo ao ByteBank")
    val conta = Conta("Alex", 12);
    conta.deposita(11111.0)

    println(conta.titular)
    println(conta.numero)
    println(conta.saldo)

    val contaJose = Conta("Jose", 1);
    contaJose.deposita(122.0)

    println(contaJose.titular)
    println(contaJose.numero)
    println(contaJose.saldo)

    contaJose.deposita( 10.00)
    //contaJose.saca(300.00)

    if(conta.transfere(10.00 , contaJose)){
        println("sucesso ")
    }

}

class Conta(var titular: String,
            val numero: Int){

    var saldo = 0.0
        private set

    fun deposita(valor: Double){
        println("depositando na conta do ${this.titular} o valor de R$ $valor")
        println("Saldo atual: ${this.saldo}")
        this.saldo += valor
        println("Saldo atualizado: ${this.saldo}")
    }

    fun saca(valor: Double){
        if(this.saldo < valor){
            throw  error("Saldo insuficiente")
        }
        this.saldo -= valor;
    }

    fun transfere(valor: Double, contaDestino:Conta): Boolean{
        if(this.saldo < valor){
            throw error("Saldo insuficiente")
        }
        this.saca(valor);
        contaDestino.deposita(valor);
        return true;
    }
}

fun testaCopiasEReferencias(){
    val conta = Conta("Alex", 12);
    conta.deposita(1.0)

    println(conta.titular)
    println(conta.numero)
    println(conta.saldo)

    val contaJose = Conta("Jose", 1);
    contaJose.deposita(122.0)

    println(contaJose.titular)
    println(contaJose.numero)
    println(contaJose.saldo)

    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numerox $numeroX")
    println("numeroY $numeroY")

    val contaJoao = Conta("Joao",1)
    var contaMaria = contaJoao

    println("titular conta joão: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")
}

fun testaCondicoes(saldo: Double){
    when {
        saldo > 100.0 -> println("conta positiva")
        saldo == 0.0 -> println("Conta sem Saldo")
        else -> println("Conta negativa")
    }
}

fun testaLacos(){
    println("Bem vindo ao ByteBank")

//    for(i in 1..10 step 2){
////        if( i > 5) continue
//        val titular = "Alex $i"
//        val numeroConta = 12345 + i
//        var saldo = i + 10.0
//
//        println("titular $titular")
//        println("numero da conta $numeroConta")
//        println("saldo da conta $saldo")
//
//        testaCondicoes(saldo)
//    }
    var x = 0
    while(x < 5){
        val titular = "Alex "
        val numeroConta = 12345
        var saldo = + 10.0

        println("titular $titular")
        println("numero da conta $numeroConta")
        println("saldo da conta $saldo")

        testaCondicoes(saldo)
        x++
    }
}