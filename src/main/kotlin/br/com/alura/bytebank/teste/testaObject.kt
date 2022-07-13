package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Conta
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco
import testaContasDiferentes

fun testaObject() {
    println("Bem vindo ao ByteBank")

//    val fran = object : Autenticavel{
//        val nome: String = "fran"
//        val cpf: String = "111.111.111-11"
//        val senha: Int = 1000
//
//        override fun autentica(senha: Int) = this.senha == senha
//    }

    var totalContas = 0
    val alex = Cliente("alex", "123.123.123-12", Endereco(), 1234)
    ContaPoupanca(alex, 12344)
    totalContas++

    testaContasDiferentes()

    println("Contador ${Conta.total}")
}