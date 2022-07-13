import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun testaContasDiferentes() {

    val alex = Cliente("Alex",
                        "123.123.123-12",
                        Endereco("Rua abc",
                                12,
                                "Jardim paulista",
                                "Sao Jose dos Campos",
                                "SP",
                                "012345-130",
                                "bloco a"
                        ),
                        1234)
    val fran = Cliente("Alex","123.123.123-12", Endereco(),1234)
    val contaCorrente = ContaCorrente(titular = alex, numero = 1000)
    val contaPoupanca = ContaPoupanca(titular = fran, numero = 1001)

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