class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario){
        println("Funcionario ${funcionario.nome}")
        this.total += funcionario.bonificacao
    }

}