import java.lang.Math.random

fun main (){
    println("BIENVENUE A ENEO ! ")

    println(" bien vouloir vous presentez je vous prie  ")

    val Personne = newPersonne()

    println("Personne créée: ${Personne.nom}, Compte n*: ${Personne.numcompte}, Consommation: ${Personne.consomation} kWh")
}

//creer un enregitrement personne dans une fn personne compose de  de son nom , n compte , consomation qui sera appeler dans la fn main

class ConsomationAnormaleException(message: String) : Exception(message)

class Personne(
    val nom: String,
    val numcompte: String,
    val consomation: Double
)


fun newPersonne ():Personne {

    println(" veillez entrer votre nom   ")

    val nom = readln()

    println(" veillez entrer votre numero de compte   ")

    val numcompte = readln()

    val consomation = random()*1000

    println(" votre consomation atteint les  $consomation kwh")

    val prix = null

    try {
        if (consomation > 5000) {
            throw ConsomationAnormaleException("Consommation anormale détectée : $consomation kWh")
        }

        if (consomation > 1000) {
            println("Votre consommation est plus élevée que d'habitude!")
        } else if (consomation <= 0) {
            println("Vous êtes à découvert !")
        } else {
            println("Votre consommation est de $consomation kWh. Veuillez vous diriger vers la caisse.")
            val prix = consomation*50
            println("Bonjour M. $nom, votre numéro de compte est n* $numcompte, et la consommation du mois s'élève à $consomation kWh. Vous devez un montant de $prix FCFA.")
        }

    } catch (e: ConsomationAnormaleException) {
        // Gestion de l'exception en cas de consommation anormale
        println("Erreur : ${e.message}")
    }

    return Personne(nom, numcompte, consomation)
}