class Cliente (val nome: String, val cpf: String, val senha: Int): Autenticavel{

    override fun autentica(senha: Int): Boolean {
        return senha == this.senha
    }

}