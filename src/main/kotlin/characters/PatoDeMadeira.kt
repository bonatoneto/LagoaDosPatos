package characters

import BoiarNoWay
import audio.SomNoWay
import interfaces.Voar
import swim.NadarNoWay

class PatoDeMadeira(
    val voar: Voar,
    val somNoWay: SomNoWay,
    val nadarNoWay: NadarNoWay,
    val boiarNoWay: BoiarNoWay
): Pato(voar, somNoWay, nadarNoWay, boiarNoWay) {
    override var nome: String = "Pato de madeira"

    override fun voar(): String {
        return (this.voar.performVoo())
    }

    override fun nadar(): String {
       return (this.nadarNoWay.performNadar())
    }

     override fun emitirSom(): String {
        return (this.somNoWay.performSom())
    }

    override fun boiar(): String {
        return (this.boiarNoWay.performNadar())
    }
}