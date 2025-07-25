import android.graphics.drawable.AnimatedVectorDrawable

//fun main() {
    //val idade = 25

    //if (idade >= 18) {
        //print("Pode dirigir")
    //} else {
        //println("Não pode dirigir")
    //}
//}

//fun main() {
    //val numero = 0

    //if (numero > 0) {
        //println("$numero é positivo")
    //} else if (numero < 0){
        //println("$numero é negativo")
    //} else {
        //println("$numero é zero")
    //}
//}

//fun main() {
    //val diaSemana = 99 // 1Domingo 2Segunda 3Terça 4Quarta 5Quinta 6Sexta 7Sábado

    //when(diaSemana) {
        //1, 7 -> {
            //println("Dia de descansar")
        //}
        //2, 3, 4, 5, 6 -> {
            //println("Dia de trabalhar")
        //}
        //else ->
            //println("Dia invalido")
    //}
//}

//fun main() {
    //val nivelUsuario = "User"
    //val mensagem = when(nivelUsuario) {
        //"Admin" -> "Bem vindo $nivelUsuario"
        //"Manager" -> "Bem vindo $nivelUsuario"
        //"User" -> "Bem vindo $nivelUsuario"
        //else -> "Tipo de usuário não encontrado"
    //}
    //println(mensagem)
//}

//fun main() {
    //val idade = 20  //Pessoas acima de 60 anos pagam meia
    //val ingressoInteira = 30.00
    //val estudante = true //Estudante paga meia
    //val desconto = ingressoInteira / 2

    //if(estudante || idade >= 60){
        //println("Desconto aplicado. Ingresso por $desconto")
    //} else {
        //println("Nenhum beneficio aplicado. Ingresso por $ingressoInteira")
    //}
//}

fun main() {
    val ladoA = 10
    val ladoB = 10
    val ladoC = 12
    val trianguloValido = (ladoA + ladoB > ladoC) && (ladoA + ladoC > ladoB) && (ladoB + ladoC > ladoA)

    if (trianguloValido) {
        if (ladoA == ladoB && ladoB == ladoC) { //se todos os lados são iguais
            println("Triângulo Equilátero")
        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) { //se não é equilatero, mas tem dois lados iguais
            println("Triângulo Isósceles")
        } else {
            println("Triângulo Escaleno") //se não é equilatero nem isoceles
        }
    } else {
        println("Não é um triângulo válido.") 
    }
}