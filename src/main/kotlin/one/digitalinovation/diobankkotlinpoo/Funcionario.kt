package one.digitalinovation.diobankkotlinpoo

abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double
) : Pessoa(nome, cpf) {

    // O protected serve para limitar o acesso de apenas a aclasse Funcionario
    // e as classes filhas usem esse membro

    protected abstract fun calculoAuxilio(): Double

    override fun toString(): String {

        return "Nome: $nome\nCPF: $cpf\nSalario: R$ $salario\nAuxilio Salarial: R$ ${calculoAuxilio()}"
    }
}