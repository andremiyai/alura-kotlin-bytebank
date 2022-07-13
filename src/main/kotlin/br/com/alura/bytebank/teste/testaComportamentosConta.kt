import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaSalario
import br.com.alura.bytebank.modelo.Endereco

fun testaComportamentosConta() {

    val alex = Cliente("Alex","123.123.123-12", Endereco(),1234)
    val conta = ContaCorrente(alex, 12);
    conta.deposita(11111.0)

    println(conta.titular)
    println(conta.numero)
    println(conta.saldo)

    val jose = Cliente("Jose","123.123.123-12", Endereco(),1234)
    val contaJose = ContaCorrente(jose, 1);
    contaJose.deposita(122.0)

    println(contaJose.titular)
    println(contaJose.numero)
    println(contaJose.saldo)

    contaJose.deposita(10.00)
    //contaJose.saca(300.00)

    if (conta.transfere(10.00, contaJose)) {
        println("sucesso ")
    }

    val sal = Cliente("Sal","123.123.123-12",Endereco(), 1234)
    val contaSalario = ContaSalario(sal,1234)
//    contaSalario.transfere
}