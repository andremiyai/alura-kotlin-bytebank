package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.Autenticavel

class SistemaInterno {

    fun entra(autenticavel: Autenticavel, senha: Int){
        if(autenticavel.autentica(senha)){
            println("Bem Vindo ao sistema")
        }else{
            println("Falha na autenticação")
        }
    }
}