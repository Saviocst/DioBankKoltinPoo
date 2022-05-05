package one.digitalinovation.diobankkotlinpoo

import one.digitalinovation.diobankkotlinpoo.Funcionario

class Gerente(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override fun calculoAuxilio(): Double {
        return salario * 0.2
    }
}