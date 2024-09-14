import java.util.Scanner

data class Clients(val nomClient: String, val numCompteur: Int, var consommation: Double, var netPayer:Double = 0.0)
class consommationanormalexeption(message: String) : Exception(message)

fun List<Double>.moyenneConsommations(): Double {
    if (this.isEmpty()) return 0.0
    return this.sum() / this.size
}

fun main() {
    val listeClients = mutableListOf<Clients>()
    var choix1 :Int = 2
    var choix :Int

    println("###########################################")
    println("Bienvenue à ENEO !")
    println("###########################################")

    do{


        println("1- Ajouter un client\n" +
                "2- Calculer les factures avec précision \n" +
                "3- Détecter les anomalies de consommation\n" +
                "4- Fournir un résumé global de la consommation des clients")

        println("Entrez votre choix :")
        val console  = Scanner(System.`in`)
        choix = console.nextInt()
        when(choix){
            1 -> listeClients.add(CreeClient())
            2 -> Calcul_facturation(listeClients)
            3 -> afficher_anomali(listeClients)
            4 -> resume_global(listeClients)

            else -> println("Choix non disponible")
        }
        println("Voulez vous quitter le programme : \n" +
                "1. oui et 2. non")
        choix1 = console.nextInt()
    }while(choix1 == 2)

}

fun verifi_consommation(consommation : Double ) : Boolean{

    if(consommation == 0.0){
        println("Aucune consommation detecter")
        return false
    }

    if(consommation > 1000){
        println("Alerte consommation tres eleve")

    }
    if(consommation < 0){
        println("Alerte consommation tres eleve")
        return false
    }

    return true
}

fun CreeClient() : Clients {
    var nomClient : String?
    var numCompteur :Int?
    var consommation : Double

    println("###########################################")
    println("Creation client !")
    println("###########################################")

    val console  = Scanner(System.`in`)
    println("Entrez le nom client :")
    nomClient = console.nextLine()
    println("Entrez le numéro de compteur :")
    numCompteur = console.nextInt()
    println("Entrez la consommation :")
    consommation = console.nextDouble()

    return Clients(nomClient, numCompteur, consommation)
}



fun Calcul_facturation(listClients: List<Clients>) {
    val tauxConsommation : Int = 50
    println("###########################################")
    println("Calculer les factures avec précision")
    println("###########################################")
    for(i in 0..listClients.size-1){
        if(verifi_consommation(listClients[i].consommation) == true) {
            listClients[i].netPayer = tauxConsommation*listClients[i].consommation
            println("Client $i\n" +
                    "Nom : ${listClients[i].nomClient}\n" +
                    "Consommation : ${listClients[i].consommation} \n" +
                    "Facturation : ${listClients[i].netPayer} XAF")
            println("///////////////////////////////////////////")

        }
    }
}

fun afficher_anomali(listClients: List<Clients>){
    println("###########################################")
    println("Détecter les anomalies de consommation")
    println("###########################################")
    for(i in 0..listClients.size-1){
        println("Client $i\n" +
                "Nom : ${listClients[i].nomClient}\n" +
                "Consommation : ${listClients[i].consommation} XAF\n" +
                "Anormali : ${Detection_anomalie(listClients[i].consommation)}")
        println("///////////////////////////////////////////")

    }
}

fun Detection_anomalie(consommation : Double): Any {

    return try {
        if (consommation > 5000) {
            throw consommationanormalexeption("La consommation $consommation est anormale.")
        }
            return "La consommation $consommation n'est pas anormale."
    } catch (e: consommationanormalexeption) {
        return "Erreur : ${e.message}"
    } finally {

    }

}

fun resume_global(listClients: List<Clients>){
    println("###########################################")
    println("Fournir un résumé global de la consommation des clients")
    println("###########################################")
    val listeConsommationClient = mutableListOf<Double>()
    for (i in 0..listClients.size-1)
        listeConsommationClient.add(listClients[i].consommation)

    println("Consommation total des clients : ${listeConsommationClient.sum()} \n" +
            "Moyenne de consommation : ${listeConsommationClient.moyenneConsommations()}\n" )

}




