import br.com.alura.bytebank.modelo.Endereco

fun main() {
    println("início main")


    //funcao1()

    val enderecoNulo: Endereco? = null

    println(enderecoNulo?.logradouro?.length)

    enderecoNulo?.let {
        println(it.logradouro.length)
    }


    enderecoNulo?.let{
        if(it?.complemento?.length == null){
            "abc"
            throw Exception("valor nulo")
        }
    }

    teste("")
    teste(1)

    println("fim main")
}

fun teste(valor: Any){
    val numerio: Int? = valor as? Int
}


fun funcao1(){
    println("início funcao1")
    try {
        funcao2()
    }catch (e: ClassCastException){
        println("Deu ERRO: $e")
    }

    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5){
        println(i)
        val endereco = Any()
        endereco as Endereco
    }
    println("fim funcao2")
}

