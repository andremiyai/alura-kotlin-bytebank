package br.com.alura.bytebank.modelo

class ContaPoupanca(titular: Cliente,
                    numero: Int):
Conta( titular = titular, numero = numero), Transferivel {

    override fun saca(valor: Double){
        if(this.saldo >= valor){
            this.saldo -= valor
        }
    }

    override fun transfere(valor: Double, contaDestino: Conta): Boolean{
        if(this.saldo < valor){
            throw error("Saldo insuficiente")
        }
        this.saca(valor);
        contaDestino.deposita(valor);
        return true;
    }

}