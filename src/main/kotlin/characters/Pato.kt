package characters

import interfaces.EmitirSom
import interfaces.Voar

open class Pato(val voar : Voar, val som : EmitirSom) {
    open var nome: String = "Pato Comum"

    open fun nadar(): String {
        return "Nadando"
    }

    open fun voarDeFato() {
        this.voar.performVoo()
    }

    open fun emitirSom() {
        this.som.performSom()
    }
}