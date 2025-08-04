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

//fun main() {
    //val senhaCorreta = "1234"
    //var senhaDigitada: String

    //do{
        //println("Digite sua senha: ")
        //senhaDigitada = readln()

        //if (senhaDigitada !=senhaCorreta){
            //println("Senha incorreta! Tente novamente")
        //}
    //}while (senhaDigitada !=senhaCorreta)
    //println("Acesso permitido.")
//

//fun main() {
    //print("Digite um número para receber a tabuada: ")
    //val numero = readln().toInt()

    //println("Tabuada do número $numero")

    //for (n in 1..10){
        //val multi = n * numero
        //println("$numero x $n = $multi")
    //}
//}

//fun main() {
    //var contador = 10
    //while(contador >= 1) {
        //println(contador)
        //contador--
        //Thread.sleep(1000)
    //}
    //println("Já!")
//}

fun main() {
    var saldo = 1000.0

    while (true) {
        println("-- Menu --")
        println("1. Ver saldo")
        println("2. Depositar")
        println("3. Sacar")
        println("4. Sair")

        println("-----------------------------------------")
        println("Digite uma opção: ")
        println("-----------------------------------------")

        val opcao = readln().toIntOrNull() ?:0

        when(opcao) {
            1 -> {
                println("-----------------------------------------")
                println("Seu saldo é de R$ $saldo")
                println("-----------------------------------------")
            }

            2 -> {
                println("Quanto deseja depositar?")
                val depositar = readln().toDoubleOrNull() ?: 0.0
                if (depositar <= 0){
                    println("Não é possível depositar $depositar")
                } else {
                    saldo += depositar
                    println("-----------------------------------------")
                    println("Seu novo saldo é: $saldo")
                    println("-----------------------------------------")
                }
            }

            3 -> {
                println("Quanto deseja sacar?")
                val sacar = readln().toDoubleOrNull() ?: 0.0
                if (sacar > saldo){
                    println("Saldo insuficiente")

                } else if (sacar <= 0) {
                    println("-----------------------------------------")
                    println("Valor de saque inválido.")
                    println("-----------------------------------------")

                } else {
                    saldo -= sacar
                    println("-----------------------------------------")
                    println("Seu novo saldo é $saldo")
                    println("-----------------------------------------")
                }

            }
            4 -> {
                println("Obrigado por utilizar nosso serviço.")
                break
            }
        }
    }
}