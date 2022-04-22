package one.digitalinovation.diobankkotlinpoo.teste

import one.digitalinovation.diobankkotlinpoo.ClienteTipo

fun main(){

    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}")
    }

    val savio = ClienteTipo.PF
    println("${savio.name} - ${savio.descricao}")

    val marilia = ClienteTipo.PJ
    println("${marilia.name} - ${marilia.descricao}")

}