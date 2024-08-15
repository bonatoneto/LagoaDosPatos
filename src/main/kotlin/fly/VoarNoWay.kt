package fly

import interfaces.Voar

class VoarNoWay : Voar {
    override fun performVoo() {
        return print("Eu não consigo voar!")
    }
}