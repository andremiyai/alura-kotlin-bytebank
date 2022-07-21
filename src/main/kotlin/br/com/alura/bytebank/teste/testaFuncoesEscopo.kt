package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaFuncoesEscopo(){
    val endereco = Endereco(logradouro = "Rua Vergueiro", numero = 1234)
    val enderecoEmMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()

    with(endereco){
        "$logradouro, $numero".toUpperCase()
    }.let(::println)


    val enderecoapply = Endereco()
        .also{ println("Criando Endereço")}
        .apply{ logradouro = "Rua Vergueiro apply"
            numero = 1234}
        .also{ println("Endereço Criado com Apply")}

    Endereco(logradouro = "Rua Vergueiro apply", numero = 1234)
        .apply { "$logradouro, $numero".toUpperCase()
        }.let(::println)

    Endereco(logradouro = "Rua Vergueiro let", numero = 1234)
        .let { end ->
            "${end.logradouro}, ${end.numero}".toUpperCase()
        }.let(::println)

    listOf(Endereco(complemento="casa"), Endereco(), Endereco(complemento = "Apto"))
        .filter(predicate = { endereco -> endereco.complemento.isNotEmpty()})
        .let(block = (::println))

    Endereco().let { teste(1,{}) }
}