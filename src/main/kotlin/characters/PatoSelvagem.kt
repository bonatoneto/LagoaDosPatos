package characters

import interfaces.EmitirSom
import interfaces.Nadar
import interfaces.Voar
import swim.Boiar

class PatoSelvagem(voar : Voar, som : EmitirSom, nadar : Nadar, boiar : Boiar? = null): Pato(voar, som, nadar, boiar) {
    override var nome: String = "Pato Selvagem"

    fun bicar(): String {
        return "Voce foi bicado!"
    }
}
