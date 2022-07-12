class SistemaInterno {

    fun entra(autenticavel: Autenticavel, senha: Int){
        if(autenticavel.autentica(senha)){
            println("Bem Vindo ao sistema")
        }else{
            println("Falha na autenticação")
        }
    }
}