// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

/*enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}*/

//*enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

//data class usuario e email
data class Usuario(val nome: String, val email: String )

//nome do conteudo e duracao
data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    var inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        //Add incrito
        //println(usuario)
        inscritos.add(usuario)
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    //var conteudos:List<ConteudoEducacional> = ConteudoEducacional("Primeiros passos",60)
    //val conteudos = mutableListOf("A",60)
    //var conteudoEducacional = ConteudoEducacional("A",60)
    val ad1 = ConteudoEducacional("A",60)
    val ad2 = ConteudoEducacional("B",30)
    val ads = listOf<ConteudoEducacional>(ad1, ad2)
    val formacao = Formacao(nome="Kotlin",ads)
    val usuario1 = Usuario("Jose","jose@dio.me")
    formacao.matricular(usuario1)
    println(formacao) // interests: ["A,B,C"]
    println(formacao.inscritos) // interests: ["A,B,C"]

    
    //ConteudoEducacional("Desafios",60)
    
    //var conteudoA = ConteudoEducacional
    //val formacaoA = Formacao("Kotlin", conteudoA)
    //formacaoA.matricular("Jose","jose@dio.me")
	//val formacaoA = Formacao("Kotlin",conteudos) 
    println("teste")
}