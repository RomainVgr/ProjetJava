package com.morpion;

import java.util.Random;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		
		char[] grille = { 	'1', '2', '3',													// Affichage de l'interface de la grille de jeu
							'4', '5', '6',
							'7', '8', '9'
						};
		
		Scanner scan = new Scanner (System.in);
		
		
		// Joueurs
		char jo = 'O';																		// Joueurs de la partie
		char jx = 'X';
		
		
		System.out.println("****************************BIENVENE SUR LE TIC TAC TOE********************************* \n");
			
		// Insertion des noms des deux joueurs 
		System.out.println("Joueur 1 , Veuillez saisir votre nom : ");
		String joueur1 = scan.nextLine();
		System.out.println("Joueur 2, Veuillez saisir votre nom : ");
		String joueur2 = scan.nextLine();													// Saisie des noms de chaque joueur
		System.out.println("Le joueur 1 est  : " +joueur1+ "(" +jo+ ") ! ");
		System.out.println("Le joueur 2 est  : " +joueur2+ "(" +jx+ ") ! \n");
		
		// Tirage au sort pour savoir qui commence (Joueur 1 ou Joueur 2)
		char noms [] = {jo, jx};
		Random Tirage = new Random();
		int n = Tirage.nextInt(2);															// Joueur qui joue  tiré au hasard entre j1(O) et j2(X)
		char joueurEnCours = noms[n];																							
		System.out.println("Le premier joueur à jouer est le joueur "+ noms[n]+ " ! \n");
				
			

	
		
		Methodes.afficherGrille(grille);	
		
		
		boolean jeuFini = false;
		int tourDeJeu = 0;																	// boucle de jeu avec initialisation des variables du tour de jeu et des cases selectionnées
		int caseSelect = 0;
		
		while (!jeuFini) {
			
			// Choix de la case du joueur						
			tourDeJeu++;																		// Tours de jeu durant la partie
			System.out.println("Tour de jeu numéro : " +tourDeJeu); 		
			
			System.out.print(" Joueur " + joueurEnCours+ " Saisissez un nombre entre 1 et 9 :");  // Saisie et choix d'une case dans la grille
			String choix =  scan.nextLine();
			int jeton = Integer.parseInt(choix);
								
			if (jeton < 1 || jeton > grille.length ) {										// Si la case sélectionnée est bien présente dans la grille (Entre 1 et 9)
				System.out.println("Chiffre Incorrect !" );
								
			} else { 
				if (grille[jeton-1] == jo || grille[jeton-1] == jx) {						// Si la case sélectionnée n'a pas deja été prise par l'autre joueur
					System.out.println("Case deja choisie !");
					
					
				} else {							
					
					grille[jeton-1] = joueurEnCours;  										// Placer jeton dans la grille par le joueur qui joue.
					caseSelect++;
					
					Methodes.afficherGrille(grille);
					
					String gagnant = Methodes.gagnantPartie(grille, jo, jx);
					
					if (gagnant != null) {													// Si on a un gagnant, on arrête la boucle et on donne le gagnant 
						jeuFini = true;
						System.out.println("Félicitations vous avez gagné ! BRAVO JOUEUR "+gagnant+" !");
						
					} else if (caseSelect == grille.length) {   							// Condition si match 
																							// nul entre les deux joueurs, si le nombre de cases selectionnées est égal 
																							// à la taille du tableau (9) on arrête la boucle.
						jeuFini = true;
						System.out.println("MATCH NUL !");
						
						
					} else {					
						
						if (joueurEnCours == jo) {											// changement joueur durant chaque tour de jeu
							joueurEnCours = jx;
							
						} else {
							joueurEnCours = jo;
						}
					}
				}
			}
		} // fin Boucle
	} // fin Main
}//Fin Classe




		

	
	

