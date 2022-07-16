package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exceptions.FalhaAutenticacaoException
import br.com.alura.bytebank.exceptions.SaldoInsuficienteException

class ContaPoupanca(titular: Cliente,
                    numero: Int):
Conta( titular = titular, numero = numero), Transferivel {

    override fun saca(valor: Double){
        if(this.saldo >= valor){
            this.saldo -= valor
        }else{

            throw SaldoInsuficienteException()
        }
    }

    override fun transfere(valor: Double, contaDestino: Conta): Boolean{
        if(this.saldo < valor){
            throw SaldoInsuficienteException()
        }

        if(!this.autentica(titular.senha)){
            throw FalhaAutenticacaoException()
        }

        this.saca(valor);
        contaDestino.deposita(valor);
        return true;
    }

}