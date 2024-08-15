package audio

import interfaces.EmitirSom

class SomNoWay : EmitirSom {
    override fun performSom(): String {
        return "Eu não emito som!"
    }
}