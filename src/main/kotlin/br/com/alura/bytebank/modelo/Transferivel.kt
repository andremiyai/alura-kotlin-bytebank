package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.Conta

interface Transferivel {

    fun transfere(valor: Double, contaDestino: Conta): Boolean
}