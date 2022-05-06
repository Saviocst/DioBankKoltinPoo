package one.digitalinovation.diobankkotlinpoo


class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
) : FuncionarioAdm(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
) {
    override fun autentica(senha: Int): String {
        if (this.senha != senha){

            return "Login Negado"
        }
        return "Login Liberado"
    }

    override fun calculoAuxilio(): Double {
        return salario * 0.2
    }

    // Minha Implementação Individual
//    override fun autenticacao(senha: Int) {
//        if (senhaAlt == senha){
//            println("Acesso autorizado!")
//        }else{
//            println("Acesso negado!")
//        }
//    }


//    override fun autenticacao2(): Boolean {
//        if (senhaAlt == 2906){
//            return true
//        }
//        return false
//    }


}