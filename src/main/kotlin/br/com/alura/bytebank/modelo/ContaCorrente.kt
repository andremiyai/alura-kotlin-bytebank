package br.com.alura.bytebank.modelo

class ContaCorrente(titular: Cliente,
                    numero: Int):
Conta( titular = titular, numero = numero), Transferivel {

    override fun saca(valor: Double){
        val valorComTaxa = valor + 0.1
        if(this.saldo >= valorComTaxa){
            this.saldo -= valorComTaxa
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