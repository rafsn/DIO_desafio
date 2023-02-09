enum class Nivel {BASICO, INTERMEDIARIO, DIFICIL}

class Usuario

data class ConteudoEducacional (var nome: String, val ducacao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {
    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario){
        inscritos.add(usuario)
    }
}

fun main (){
    val usuario1 = Usuario()
    val usuario2 = Usuario()

    val conteudo1 = ConteudoEducacional("Introdução à programação", 90)
    val conteudo2 = ConteudoEducacional("Estruturas de dados", 120)

    val formacao = Formacao("Desenvolvimento de Software", listOf(conteudo1, conteudo2))

    println("Inscritos na formação: ${formacao.inscritos.size}")
}
