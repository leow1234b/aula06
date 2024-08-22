package exemploHeranca
open class Animal (var nome:  String){

    constructor() : this("desconhecido")

  open  fun comer() {
        println ("o animal $nome esta comendo")
    }

}