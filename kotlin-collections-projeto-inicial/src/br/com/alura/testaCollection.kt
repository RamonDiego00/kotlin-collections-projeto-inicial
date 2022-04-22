package br.com.alura

fun testaCopia() {
    val banco = BancoDeNomes()
    val nomesSalvos: Collection<String> = banco.nomes
    banco.salva("Ramon")
    println(nomesSalvos) //ele é a cópia de banco
    println(BancoDeNomes().nomes)
}

class BancoDeNomes{

    companion object {
        private val dados = mutableListOf<String>()
    }

    val nomes:Collection<String> get() = dados.toList()

    fun salva(nome:String){
        dados.add(nome)
    }
}



fun testaColecao() {
    val nomes: Collection<String> = mutableListOf(
        "Ramon",
        "Diego",
        "Santos",
        "Ferreira",
        "Maria"
    )
    for (nome in nomes) {
        println(nome)
    }
    println(nomes)
    println("tem o nome Ramon? ${nomes.contains("Ramon")}")
    println("tamanho coleção ${nomes.size}")
}