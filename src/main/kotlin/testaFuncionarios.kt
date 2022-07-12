fun testaFuncionarios(){
    val alex = Analista(
        nome = "Alex"
        ,cpf = "123.123.123-22"
        ,salario = 1000.0
    , senha = 1234
    )

    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("bonificacoa ${alex.bonificacao}")

    val joseGerente = Gerente(
        nome = "Alex"
        ,cpf = "123.123.123-22"
        ,salario = 1000.0
        ,senha = 1234
    )

    println("nome ${joseGerente.nome}")
    println("cpf ${joseGerente.cpf}")
    println("salario ${joseGerente.salario}")
    println("bonificacoa ${joseGerente.bonificacao}")
    println("authenticacao ${joseGerente.autentica(1234)}")

    val joaoDiretor = Diretor(
        nome = "Alex"
        ,cpf = "123.123.123-22"
        ,salario = 1000.0
        ,senha = 1234
        , plr= 10000.0
    )

    println("nome ${joaoDiretor.nome}")
    println("cpf ${joaoDiretor.cpf}")
    println("salario ${joaoDiretor.salario}")
    println("bonificacoa ${joaoDiretor.bonificacao}")
    println("authenticacao ${joaoDiretor.autentica(1234)}")
    println("plr ${joaoDiretor.plr}")

    val maria = Analista("maria", "123.123.123-12", 4000.0, 1234)


    val calculadora = CalculadoraBonificacao()
    calculadora.registra(joaoDiretor)
    calculadora.registra(joseGerente)
    calculadora.registra(alex)
    calculadora.registra(maria)

    println("total de bonificação: ${calculadora.total}")
}