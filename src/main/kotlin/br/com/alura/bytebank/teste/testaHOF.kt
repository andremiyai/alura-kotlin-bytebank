package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaHOF(){
    soma(1,5){
        println(it)
    }
    somaReceiver(1,6, resultado = {
        println(this)
    })

    val autentica = object: Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int): Boolean = this.senha == senha
    }

    SistemaInterno().entra(autentica, 1234){
        println("realizar Pagamento")
    }

    val sistema = SistemaInterno()
    sistema.entraReceiver(autentica, 1234, autenticado = {
        pagamento()
    })
}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit){
    println("antes da soma")
    resultado(a + b)
    println("depois da soma")
}

fun somaReceiver(a: Int, b: Int, resultado: Int.() -> Unit){
    println("antes da soma")
    val total = a + b
    total.resultado()
    println("depois da soma")
}

fun testeREcebeString( valor: String){

}

fun teste(teste: Int, bloco: () -> Unit){

}