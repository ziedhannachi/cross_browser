@connexion
Feature: Je souhaite tester la page de la connexion
  
En tant que utilisatuer je souhaite vérifier la page de la connexion

  @connexion
  Scenario: Je souhaite tester la page de la connexion
    Given Je me connecte sur l'application 
    When Je saisis le username "standard_user"
    And Je saisi le mot de passe "secret_sauce"
    And Je clique sur le bouton login
