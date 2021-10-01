package com.morpion.romain;

public class Methodes {
	
	public static void afficherGrille(char[] grille) {		
		System.out.println("[" + grille[0] + '|' + grille[1] + '|' + grille[2]+ "]");
		System.out.println("[" + grille[3] + '|' + grille[4] + '|' + grille[5]+ "]");				// Création et affichage du tableau
		System.out.println("[" + grille[6] + '|' + grille[7] + '|' + grille[8]+ "] \n");
	} ;
		
	//-----------------------------------------------------------------------------------------------//
	public static String gagnantPartie(char[] grille, char jo, char jx) {
		
		String gagnant = null;
		
		int tableauGagnant[][] = { 	{0, 1, 2},  {3, 4, 5}, {6, 7, 8}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, {0, 4, 8}, {2, 4, 6} };  // Création tableau a 2 dimensions avec combinaisons gagnantes
		
		for(int i = 0; i < tableauGagnant.length; i++ ) {
			
			int c[] = tableauGagnant[i];
			
			if(grille[c[0]] == jo && grille[c[1]] == jo && grille[c[2]] == jo) {												// Condition si le joueur X a une des combinaisons gagnantes			
				
				gagnant = String.valueOf(jo);
				break;
				}	
		}
		
		if (gagnant == null) {
				
				for(int i = 0; i < tableauGagnant.length; i++ ) {
							
							int c[] = tableauGagnant[i];
							
							if(grille[c[0]] == jx && grille[c[1]] == jx && grille[c[2]] == jx) {								// Condition si le joueur X a une des combinaisons gagnantes
								
								gagnant = String.valueOf(jx);
								break;
							}	
				}
		}
		
		return gagnant;
	}
	
	//-----------------------------------------------------------------------------------------------//
	
	public static void nouvellePartie(char[] grille) {
		
		System.out.println("[" + grille[0] + '|' + grille[1] + '|' + grille[2]+ ']');
		System.out.println("[" + grille[3] + '|' + grille[4] + '|' + grille[5]+ ']');
		System.out.println("[" + grille[6] + '|' + grille[7] + '|' + grille[8]+ ']');
		
	}
	
	
	
}// Fin classe
	


