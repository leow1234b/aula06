package exemploHeranca
import exemploHeranca.*
import exemploHeranca.exemploheranaca.Cachorro
import exemploHeranca.exemploheranaca.Gato
import exemploHeranca.exemplointerface.Carro
import exemploHeranca.exemplointerface.Cavalo
import exemploHeranca.exemplointerface.pessoa

fun main(args: Array<String>) {
  var animal = Animal()
  var animal2 = Animal("bolinho")
  var cachorro = Cachorro("caramelo")
  var cachorro2 = Cachorro("mimo", "lhasa")
  var gato = Gato("sr bigodes")
  var gato2 = Gato("edson", "preto")
  animal.comer()
  animal2.comer()
  cachorro.comer()
  cachorro2.comer()
  gato.comer()
  gato2.comer()
}
fun Exherenca() {


}

  fun Exinterface(){
    var pessoa = pessoa("fulano")
    var carro = Carro("gol")
    var cavalo = Cavalo("peter")


    pessoa.mover()
    carro.mover()
    cavalo.mover()
  }
