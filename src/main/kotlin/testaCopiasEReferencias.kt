fun testaCopiasEReferencias(){
    val conta = ContaCorrente("Alex", 12);
    conta.deposita(1.0)

    println(conta.titular)
    println(conta.numero)
    println(conta.saldo)

    val contaJose = ContaCorrente("Jose", 1);
    contaJose.deposita(122.0)

    println(contaJose.titular)
    println(contaJose.numero)
    println(contaJose.saldo)

    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numerox $numeroX")
    println("numeroY $numeroY")

    val contaJoao = ContaCorrente("Joao", 1)
    var contaMaria = contaJoao

    println("titular conta joão: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")
}