fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(titular = "Alex", numero = 1000)
    val contaPoupanca = ContaPoupanca(titular = "Fran", numero = 1001)

    contaPoupanca.deposita(1000.00)
    contaCorrente.deposita(1000.00)

    println("saldo conta corrente: ${contaCorrente.saldo}")
    println("saldo conta poupanca: ${contaPoupanca.saldo}")

    contaPoupanca.saca(100.00)
    contaCorrente.saca(100.00)

    println("saldo conta corrente: ${contaCorrente.saldo}")
    println("saldo conta poupanca: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.00, contaPoupanca)

    println("saldo conta corrente Apos Transferencia: ${contaCorrente.saldo}")
    println("saldo conta poupanca  Apos Transferencia: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(100.00, contaCorrente)

    println("saldo conta corrente Apos Transferencia: ${contaCorrente.saldo}")
    println("saldo conta poupanca  Apos Transferencia: ${contaPoupanca.saldo}")
}