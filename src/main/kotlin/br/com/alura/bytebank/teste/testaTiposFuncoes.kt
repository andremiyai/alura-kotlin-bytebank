package br.com.alura.bytebank.teste

fun testaFuncaoAnonima(){
    val minhaFuncaoAnonima  = fun(a: Int, b: Int): Int{
        println("Executa como Anonima")
        return a+b
    }
    println(minhaFuncaoAnonima(5,555))

    val calculaBonificacaoAnonima: (salario : Double) -> Double = fun(salario):Double{
        if(salario> 1000.0){
            return salario + 50.0
        }

        return salario + 100.0
    }
    println(calculaBonificacaoAnonima(1000.0))
}
fun testaFuncaoLambda(){
    val minhaFuncaoLambda: (Int, Int) -> Int = { a, b ->
        println("Executa como lambda")
        a+b
    }
    println(minhaFuncaoLambda(5,4))
    val calculaBonificacao: (salario: Double) -> Double = lambda@{ salario ->

        if(salario> 1000.0){
            return@lambda salario + 50.0
        }

        return@lambda salario + 100.0
    }
    println(calculaBonificacao(2000.0))
}

fun testaFuncaoReferencia(){
    val minhaFuncao: (Int, Int) -> Int = ::soma
    println(minhaFuncao(5,10))
}

fun testaFuncaoClasse(){
    val minhaFuncaoClasses: (Int, Int) -> Int = Teste()
    println(minhaFuncaoClasses(5,10))

}

fun soma(a: Int, b: Int): Int{

    println("executa Teste")
    return a+b
}

class Teste : (Int, Int) -> Int {
    override fun invoke(p1: Int, p2: Int): Int {
        return p1+p2
    }

}