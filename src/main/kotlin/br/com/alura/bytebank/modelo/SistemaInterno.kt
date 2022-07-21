package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.Autenticavel

class SistemaInterno {

    fun entra(autenticavel: Autenticavel, senha: Int, autenticado: () -> Unit = {}){
        if(autenticavel.autentica(senha)){
            println("Bem Vindo ao sistema")
            autenticado()
        }else{
            println("Falha na autenticação")
        }
    }

    fun entraReceiver(autenticavel: Autenticavel, senha: Int, autenticado: SistemaInterno.() -> Unit = {}){
        if(autenticavel.autentica(senha)){
            println("Bem Vindo ao sistema")
            autenticado(this)
        }else{
            println("Falha na autenticação")
        }
    }

    fun pagamento(){
        println("Realizando Pagamento")
    }
}