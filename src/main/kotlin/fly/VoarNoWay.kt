package fly

import interfaces.Voar

class VoarNoWay : Voar {
    override fun performVoo(): String {
        return "Eu não consigo voar!"
    }
}