package exemploHeranca.exemploheranaca

import exemploHeranca.Animal

class Cachorro(nome: String, var raca: String) :Animal(nome ) {

    constructor(nome: String) : this(nome, "siri")
    override fun comer() {
        super.comer()
        println("o cachorro $nome ($raca) esta comendo racao :")
    }

}