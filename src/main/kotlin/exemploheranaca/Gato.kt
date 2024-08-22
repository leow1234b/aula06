package exemploHeranca.exemploheranaca

import exemploHeranca.Animal

class Gato(nome: String, var cor: String) : Animal(nome) {
    constructor(nome: String) : this(nome, "cinza")

    override fun comer() {
       println("o gato $cor $nome esta comendo sache!")
    }

}