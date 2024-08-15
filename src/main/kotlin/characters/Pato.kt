package characters

import interfaces.EmitirSom
import interfaces.Nadar
import interfaces.Voar
import swim.Boiar

open class Pato(
    var voo : Voar,
    var som : EmitirSom,
    var nadar : Nadar,
    var boiar : Nadar? = null
) {
    open var nome: String = "Pato Comum"

    open fun nadar(): String {
        return (this.nadar.performNadar())
    }

    open fun boiar(): String? {
        return (this.boiar?.performNadar())
    }

    open fun voar(): String {
        return (this.voo.performVoo())
    }

    open fun emitirSom(): String {
       return (this.som.performSom())
    }
}