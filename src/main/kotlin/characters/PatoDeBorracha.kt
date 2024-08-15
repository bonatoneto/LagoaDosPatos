package characters

import interfaces.EmitirSom
import interfaces.Voar
import swim.Boiar
import swim.NadarNoWay

class PatoDeBorracha(voar: Voar, som: EmitirSom, nadar: NadarNoWay, boiar: Boiar): Pato(voar, som, nadar, boiar) {
    override var nome: String = "Pato de Borracha"

    override fun nadar(): String {
        return (this.nadar.performNadar())
    }

    override fun boiar(): String? {
        return (this.boiar?.performNadar())
    }
}