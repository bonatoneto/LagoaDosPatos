package fly

import interfaces.Voar

class VoarNaturalmente: Voar {
    override fun performVoo(): String {
        return ("Voando naturalmente")
    }
}