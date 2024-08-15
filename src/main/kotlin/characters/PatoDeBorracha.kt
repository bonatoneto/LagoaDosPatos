package characters

import interfaces.EmitirSom
import interfaces.Voar

class PatoDeBorracha(voar: Voar, som: EmitirSom): Pato(voar, som) {
    override var nome: String = "Pato de Borracha"
    override fun nadar() {
        return println("Eu não nado")
    }
    fun boiar(): String  {
       return "Estou boiando"
    }
}