package exemploHeranca.exemplointerface

class Cavalo(var nome: String) : IAcoes{

    override fun mover() {
        TODO("Not yet implemented")
        println("o cavalo $nome esta galopando!")
    }

}