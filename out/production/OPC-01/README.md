# OPC-01 
## ⚙️ Installation & Utilisation
Pour commencer à travailler sur ce projet, vous devez d'abord cloner le répertoire sur votre machine locale. 
Exécutez les commandes suivantes :
```bash
git clone https://github.com/Orion-237/OPC-01.git #Pour cloner le repertoire en ligne en local
```
```bash
cd OPC-01   #Pour naviguer vers le dossier en local
```
```bash
git checkout -b opc-01-[nom-complet] #Pour créer une nouvelle branche avec votre nom complet
```
```bash
git add . #Pour ajouter les modifications dans la staging area
```
```bash
git commit -m "Description de vos modifications" #Pour commiter les modifications avec un message descriptif
```
```bash
git pull
```
```bash
git push origin nom-de-votre-branche  #Pour pousser la branche locale sur le dépôt distant
```




---
# 🛠️ ENEO - Gestion de la Consommation d'Électricité

## 📋 Objectif

Vous êtes un jeune développeur 👨‍💻 et vous avez une mission importante : développer un programme de gestion de la consommation d’électricité pour le DG de ENEO  ⚡️. Votre programme permettra :
- 🚀 Suivre la consommation des clients
- 💡 Calculer les factures en fonction de la consommation
- 🔍 Détecter les anomalies de consommation
- 📊 Afficher un récapitulatif pour plusieurs clients

## 🧩 Concepts Utilisés

Ce projet vous permet de travailler avec plusieurs notions de programmation en Kotlin, dont :
- 👋 `Hello World`
- 🔑 Variables
- 📊 Types de base
- 🔄 Contrôle de flux
- 🛠️ Fonctions & Méthodes d'extension
- ❌ Sécurité des nulls (Null Safety)
- 📦 Tableaux et listes
- 📚 Collections
- ⚠️ Gestion des exceptions
- 🔍 Revue de code (Code Review)

## 📜 Corpus

Votre programme devra :
1. 📝 Saisir les informations de base d'un client (nom, numéro de compteur, consommation).
2. 💰 Calculer la facture selon le taux de consommation.
3. ❗ Gérer et afficher les erreurs pour les consommations anormales.
4. 🧮 Afficher un récapitulatif global pour plusieurs clients.

## 🎯 Étapes de l'Exercice

### Partie 1 : Démarrage du Projet

1. **Hello World & Variables**  
   📝 Écrivez un programme qui affiche `Bienvenue à ENEO !` lors du lancement.
   - Créez des variables pour le nom du client, le numéro de compteur et la consommation.
   - 🤔 **Astuce** : Utilisez `var` pour des variables modifiables et `val` pour celles qui ne changent pas.
   
2. **Types de Base & Null Safety**  
   📌 Déclarez des variables pour le nom du client (`String`), le numéro de compteur (`Int`), et la consommation (`Double`).
   - Assurez-vous que la variable consommation ne soit jamais `null` en utilisant la sécurité des nulls de Kotlin.

---

### Partie 2 : Gestion des Données et Logique de Contrôle

3. **Contrôle de Flux & Fonctions**  
   🔍 Écrivez une fonction qui vérifie la consommation. Si la consommation est supérieure à 1000 kWh, un message d'alerte doit s'afficher.
   - Si elle est inférieure, calculez la facture (par exemple, 50 FCFA par kWh). 💸
   - Gérer les cas où la consommation est nulle ou négative avec un message approprié.

4. **Extensions & Collections**  
   🔢 Créez une liste des consommations de plusieurs clients et utilisez les **collections** pour calculer la consommation totale.
   - Ajoutez une méthode d’extension à la liste pour calculer la moyenne des consommations. 📊

---

### Partie 3 : Gestion des Erreurs & Revue de Code

5. **Exceptions & Code Review**  
   ⚠️ Ajoutez une gestion des exceptions pour détecter les consommations anormales (par exemple, > 5000 kWh) et déclenchez une exception personnalisée si nécessaire.
   - Utilisez des blocs `try-catch` pour prévenir les erreurs qui pourraient faire planter le programme.
   - 🔍 Relisez votre code pour optimiser sa lisibilité et respectez les bonnes pratiques de développement.

---

## 💡 Astuces

- 🔄 N’oubliez pas d’utiliser les structures de contrôle comme `if`, `when`, et les boucles `for` ou `while`.
- 🚀 Les méthodes d'extension permettent d'ajouter des fonctionnalités aux types existants sans les modifier.
- ❓ Pour la gestion des exceptions, créez votre propre classe d’exception personnalisée pour des cas spécifiques.

## 🏁 Résultat Final

À la fin de cet exercice, vous aurez un programme fonctionnel qui peut :
- Gérer les consommations de plusieurs clients
- Calculer les factures avec précision
- Détecter les anomalies de consommation
- Fournir un résumé global de la consommation des clients

---

## 🤝 Contribuer
Si vous avez des idées ou des suggestions pour améliorer ce projet, n'hésitez pas à ouvrir une issue ou à soumettre une pull request. Nous serions ravis d'avoir votre contribution !

---

✨ Bon développement ! 🚀
