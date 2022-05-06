package one.digitalinovation.diobankkotlinpoo

abstract class FuncionarioAdm(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(nome, cpf, salario ) {

    abstract fun autentica(senha: Int): String

}