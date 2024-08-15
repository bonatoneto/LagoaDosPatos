import audio.SomNoWay
import audio.SomPato
import characters.Pato
import characters.PatoDeBorracha
import characters.PatoDeMadeira
import characters.PatoSelvagem
import fly.VoarNaturalmente
import fly.VoarNoWay
import org.junit.jupiter.api.Test
import swim.Boiar
import swim.Nadar
import swim.NadarNoWay
import kotlin.test.assertEquals

class PatoTest {
    val patoBase = Pato(VoarNaturalmente(), SomPato(), Nadar())
    val patoDeBorracha = PatoDeBorracha(VoarNoWay(), SomPato(), NadarNoWay(), Boiar())
    val patoSelvagem = PatoSelvagem(VoarNaturalmente(), SomPato(), Nadar())
    val patoDeMadeira = PatoDeMadeira(VoarNoWay(), SomNoWay(), NadarNoWay(), BoiarNoWay())

    @Test
    fun initialFlyMode() {
        assertEquals(
            expected = "Voando naturalmente",
            patoBase.voar()
        )
        assertEquals(
            expected = "Voando naturalmente",
            patoSelvagem.voar()
        )
        assertEquals(
            expected = "Eu não consigo voar!",
            patoDeBorracha.voar()
        )
        assertEquals(
            expected = "Eu não consigo voar!",
            patoDeMadeira.voar()
        )
    }

    @Test
    fun initialSwimMode() {
        assertEquals(
            expected = "Nadando naturalmente",
            patoBase.nadar()
        )
        assertEquals(
            expected = "Nadando naturalmente",
            patoSelvagem.nadar()
        )
        assertEquals(
            expected = "Eu não sei nadar",
            patoDeBorracha.nadar()
        )
        assertEquals(
            expected = "Eu não sei nadar",
            patoDeMadeira.nadar()
        )
    }

    @Test
    fun audioMode() {
        assertEquals(
            expected = "Quack!",
            patoBase.emitirSom()
        )
        assertEquals(
            expected = "Quack!",
            patoSelvagem.emitirSom()
        )
        assertEquals(
            expected = "Quack!",
            patoDeBorracha.emitirSom()
        )
        assertEquals(
            expected = "Eu não emito som!",
            patoDeMadeira.emitirSom()
        )
    }
}