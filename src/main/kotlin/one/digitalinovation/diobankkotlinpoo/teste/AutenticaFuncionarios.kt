package one.digitalinovation.diobankkotlinpoo.teste

import one.digitalinovation.diobankkotlinpoo.FuncionarioAdm

class AutenticaFuncionarios {
    fun autenticaFun(logar: FuncionarioAdm, senha: Int) {
        println(logar.autentica(senha))
    }
}