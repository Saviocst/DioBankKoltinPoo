package one.digitalinovation.diobankkotlinpoo

class Analista(
    nome: String,
    cpf: String,
    salario: Double
): Funcionario(nome, cpf, salario) {

    override fun calculoAuxilio(): Double {
        return salario * 0.1
    }

}