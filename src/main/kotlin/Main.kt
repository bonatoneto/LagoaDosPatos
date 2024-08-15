import audio.SomNoWay
import audio.SomPato
import characters.Pato
import characters.PatoDeBorracha
import characters.PatoDeMadeira
import characters.PatoSelvagem
import fly.VoarComBalao
import fly.VoarNaturalmente
import fly.VoarNoWay
import swim.Boiar
import swim.Nadar
import swim.NadarNoWay

fun main(args: Array<String>) {
    val patoNormal = Pato(VoarNaturalmente(), SomPato(), Nadar(), Boiar())
    println("Nome: " + patoNormal.nome)
    println(patoNormal.emitirSom())
    println(patoNormal.nadar())
    println(patoNormal.voar())

    println("------------------------------------------------------")

    val patoSelvagem = PatoSelvagem(VoarNaturalmente(), SomPato(), Nadar(), Boiar())
    println("Nome: " + patoSelvagem.nome)
    println(patoSelvagem.emitirSom())
    println(patoSelvagem.voar())
    println(patoSelvagem.nadar())
    println(patoSelvagem.bicar())

    println("------------------------------------------------------")

    val patoDeBorracha = PatoDeBorracha(VoarNoWay(), SomPato(), NadarNoWay(), Boiar())
    println("Nome: " + patoDeBorracha.nome)
    println(patoDeBorracha.emitirSom())
    println(patoDeBorracha.nadar())
    println(patoDeBorracha.boiar())
    println(patoDeBorracha.voar())
    val voandoComBalao = PatoDeBorracha(VoarComBalao(), SomPato(), NadarNoWay(), Boiar())
    println(voandoComBalao.voar())

    println("------------------------------------------------------")

    val patoDeMadeira = PatoDeMadeira(VoarNoWay(), SomNoWay(), NadarNoWay(), BoiarNoWay())
    println("Nome: " + patoDeMadeira.nome)
    println(patoDeMadeira.nadar())
    println(patoDeMadeira.boiar())
    println(patoDeMadeira.voar())
    println(patoDeMadeira.emitirSom())
    val patoDeMadeiraComBalao = PatoDeMadeira(VoarComBalao(), SomNoWay(), NadarNoWay(), BoiarNoWay())
    println(patoDeMadeiraComBalao.voar())
}