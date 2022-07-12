fun testaComportamentosConta() {
    val conta = ContaCorrente("Alex", 12);
    conta.deposita(11111.0)

    println(conta.titular)
    println(conta.numero)
    println(conta.saldo)

    val contaJose = ContaCorrente("Jose", 1);
    contaJose.deposita(122.0)

    println(contaJose.titular)
    println(contaJose.numero)
    println(contaJose.saldo)

    contaJose.deposita(10.00)
    //contaJose.saca(300.00)

    if (conta.transfere(10.00, contaJose)) {
        println("sucesso ")
    }

    val contaSalario = ContaSalario("sal",1234)
//    contaSalario.transfere
}