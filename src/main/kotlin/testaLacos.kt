fun testaLacos(){
    println("Bem vindo ao ByteBank")

//    for(i in 1..10 step 2){
////        if( i > 5) continue
//        val titular = "Alex $i"
//        val numeroConta = 12345 + i
//        var saldo = i + 10.0
//
//        println("titular $titular")
//        println("numero da conta $numeroConta")
//        println("saldo da conta $saldo")
//
//        testaCondicoes.kt(saldo)
//    }
    var x = 0
    while(x < 5){
        val titular = "Alex "
        val numeroConta = 12345
        var saldo = + 10.0

        println("titular $titular")
        println("numero da conta $numeroConta")
        println("saldo da conta $saldo")

        testaCondicoes(saldo)
        x++
    }
}