package one.digitalinovation.diobankkotlinpoo.teste

import one.digitalinovation.diobankkotlinpoo.Funcionario

class RelatorioFuncionarios {

    companion object{
        fun impressaoRelatorio(funcionario: Funcionario){
            println(funcionario.toString())
        }
    }
}