package one.digitalinovation.diobankkotlinpoo.teste

import one.digitalinovation.diobankkotlinpoo.Analista

fun main() {

//    val savio = Pessoa(nome = "Sávio", cpf = "021-587-693-06")
//    println("Nome: ${savio.nome}\nCPF: ${savio.cpf}")

    println()

//    val marilia = Funcionario(nome = "Marília", cpf = " 021-523-458-08", salario = BigDecimal.valueOf(2000.0))
//    println("Nome: ${marilia.nome}\nCPF: ${marilia.cpf}\nSalario: ${marilia.salario}")

    val lucas = Analista(nome = "Lucas Neris", cpf = "023-235-236-04", salario = 1850.0)

    val elizeu = Analista(nome = "Elizeu", cpf = "063-234-296-02", salario = 2000.0)


//    println("Nome: ${lucas.nome}\nCPF: ${lucas.cpf}\nSalario: ${lucas.salario}")

    // Como não tenho acesso a função abstrata de auxilio eu crio uma função que chama a classe funcionario
    // para assim ter acesso a função abstrata, pois ela esta como protected

    RelatorioFuncionarios.impressaoRelatorio(lucas)
    println()
    RelatorioFuncionarios.impressaoRelatorio(elizeu)

}