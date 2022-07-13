import br.com.alura.bytebank.modelo.*

fun testaAutenticacao() {
    val gerente = Gerente("jose", "123.123.123-22", 1234.00, 1234)
    val diretora = Diretor("joseane", "123.123.123-21", 11234.00, 1000, 100000.00)

    val cliente = Cliente("gui", "123.123.231-12", Endereco(),1234)

    val sis = SistemaInterno()
    sis.entra(gerente, 2000)
    sis.entra(diretora, 1000)
    sis.entra(cliente, 1234)
}