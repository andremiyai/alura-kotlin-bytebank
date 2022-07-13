import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.Endereco

fun testaCopiasEReferencias(){

    val alex = Cliente("Alex","123.123.123-12", Endereco(),1234)
    val conta = ContaCorrente(alex, 12);
    conta.deposita(1.0)

    println(conta.titular)
    println(conta.numero)
    println(conta.saldo)


    val jose = Cliente("Jose","123.123.123-12",Endereco(), 1234)
    val contaJose = ContaCorrente(jose, 1);
    contaJose.deposita(122.0)

    println(contaJose.titular)
    println(contaJose.numero)
    println(contaJose.saldo)

    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numerox $numeroX")
    println("numeroY $numeroY")

    val joao = Cliente("Alex","123.123.123-12",Endereco(),1234)
    val contaJoao = ContaCorrente(joao, 1)
    var contaMaria = contaJoao

    println("titular conta joão: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")
}