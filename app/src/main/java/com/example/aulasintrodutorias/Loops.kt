//fun main() {
    //var contador = 0
    //while(contador < 10){
        //contador++
        //println(contador)
    //}
//}

//fun main() {
    //var soma = 0
    //for (numeros in 1..100){
        //soma+= numeros
    //}
    //println(soma)
//}

fun main() {
    val senhaCorreta = "1234"
    var senhaDigitada: String

    do{
        println("Digite sua senha: ")
        senhaDigitada = readln()

        if (senhaDigitada !=senhaCorreta){
            println("Senha incorreta! Tente novamente")
        }
    }while (senhaDigitada !=senhaCorreta)
    println("Acesso permitido.")

}