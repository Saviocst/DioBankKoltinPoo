package one.digitalinovation.diobankkotlinpoo

data class Banco(
    val nome: String,
    val numero: Int
){
    fun info() = "Nome: $nome\nNumero: $numero"
}