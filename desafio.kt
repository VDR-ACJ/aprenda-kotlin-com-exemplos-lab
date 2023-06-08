// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel (val printableName: String){ BASICO("BASICO"), INTERMEDIARIO("INTERMEDIARIO"), AVANCADO("AVANCADO") }

//data class usuario e email
data class Usuario(val nome: String, val email: String )

//nome do conteudo e duracao
data class ConteudoEducacional(val nome: String, val duracao: Int = 60, val nivel: String)

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
    
    val conteudo1 = ConteudoEducacional("Fase A", 60, Nivel.valueOf("BASICO").printableName)
    val conteudo2 = ConteudoEducacional("Fase B", 30, Nivel.valueOf("AVANCADO").printableName)
    val conteudos = listOf<ConteudoEducacional>(conteudo1, conteudo2)
    val formacao = Formacao(nome="Kotlin",conteudos)
    val formacao2 = Formacao(nome="Flutter",conteudos)
    
    val usuario1 = Usuario("Jose","jose@dio.me")
    val usuario2 = Usuario("Maria","maria@dio.me")
    
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
    
    formacao2.matricular(usuario1)
    
    println(formacao) // Formacao Kotlin
    println(formacao.inscritos) // Inscritos na formacao kotlin
    
    println(formacao2) // Formacao Flutter 
    println(formacao2.inscritos) // Inscritos na formacao kotlin

}