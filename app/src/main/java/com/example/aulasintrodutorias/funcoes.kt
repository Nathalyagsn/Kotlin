//fun exibirMensagem(msg: String) {
    //print(msg)
//}

//fun exibirNome(nome:String) {
    //print(nome)
//}

//fun main() {
    //exibirMensagem("Oi! Tudo bem?" )
    //exibirNome(nome = " Nathalya")

//}

//fun saudacaoPersonalizada(nome: String) {
    //println("Olá $nome, tudo bem?")
//}

//fun main() {
    //saudacaoPersonalizada("Nathalya")
//}

//fun calcularDobro(numero: Int): Int {
    //return  6 * numero //aqui eu escolho o numero que quero fazer o dobro
//}

//fun main() {
   //val resultado = calcularDobro(2)
    //println("O Dobro de $resultado  ")

//}

fun calcularMedia(nota1: Float = 3.5F, nota2: Float = 7.5F, nota3:Float = 9.0F, nota4:Float = 10.0F ): Float {
    return (nota1 + nota2 + nota3 + nota4) / 4
}

fun main() {
    val resultado = calcularMedia()
    println("A média do aluno foi $resultado")
}

