package audio

import interfaces.EmitirSom

class SomPato : EmitirSom {
    override fun performSom(): String {
        return "Quack!"
    }
}