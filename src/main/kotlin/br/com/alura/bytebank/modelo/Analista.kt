package br.com.alura.bytebank.modelo

class Analista (nome: String
                , cpf: String
                , salario: Double
                , val senha: Int
) : Funcionario(nome = nome, cpf = cpf, salario=salario){

    override val bonificacao: Double
        get(){
            return salario * 0.1
        }

    fun authentica(senha: Int): Boolean{
        return this.senha == senha
    }
}