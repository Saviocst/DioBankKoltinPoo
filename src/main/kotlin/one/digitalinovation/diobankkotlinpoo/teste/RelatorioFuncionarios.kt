package one.digitalinovation.diobankkotlinpoo.teste

import one.digitalinovation.diobankkotlinpoo.Funcionario
import one.digitalinovation.diobankkotlinpoo.FuncionarioAdm

class RelatorioFuncionarios {

    companion object{
        fun impressaoRelatorio(funcionario: Funcionario){
            println(funcionario.toString())
        }
    }
}