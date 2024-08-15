package characters

import interfaces.EmitirSom
import interfaces.Voar

class PatoSelvagem(voar: Voar, som: EmitirSom): Pato(voar, som) {
    override var nome: String = "Pato Selvagem"

    fun bicar(): String {
        return "Voce foi bicado!"
    }
}
