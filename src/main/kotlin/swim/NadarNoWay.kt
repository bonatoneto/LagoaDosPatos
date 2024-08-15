package swim

import interfaces.Nadar

class NadarNoWay: Nadar {
    override fun performNadar(): String {
        return "Eu não sei nadar"
    }
}