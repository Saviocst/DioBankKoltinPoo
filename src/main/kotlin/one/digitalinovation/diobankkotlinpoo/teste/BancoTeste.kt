package one.digitalinovation.diobankkotlinpoo.teste

import one.digitalinovation.diobankkotlinpoo.Banco

fun main(){
val dioBank = Banco(nome = "DigiBank", numero = 1)
    println( dioBank.info())
    //println("Nome: ${dioBank.nome}\nNumero: ${dioBank.numero} ")
}