# ProjetJava

L'application réalisée est un jeu du Morpion.

Principe et règles du jeu : 
Chaque joueur à donc son propre symbole, généralement une croix pour l’un et un rond pour l’autre. La partie se termine.
 Quand l’un des joueurs à aligner 3 symboles ou quand la grille est complétée sans vainqueur. Il y a alors égalité.


Programme codé en JAVA : 


# Initialisation du tableau

Dans mon programme, on initialise tout d'abord une grille vide à l'aide d'un tableau en char et chaque case correspondant à
un caractère en particulier ('1', '2, '3' ...... jusqu'à '9'). 


On demande tout d'abord aux deux joueurs de mettre leur noms. (Joueur1 et Joueur2) qui auront chacun un type de signe(O ou X)
Ensuite, on tire au sort qui de l'un des deux joueurs debutera la partie au tour numéro 1.
 Le joueur choisi devient donc le joueur en cours qui est donc aussi une variable avec la valeur du jo ou jx.

(On entre donc dans la boucle de jeu)

# Premier tour de jeu 
On affiche la grille, et le joueur en cours choisit (avec la variable choix) un nombre compris entre 1 et 9 qui sera donc stockée dans une variable jeton qui permettra de choisir un index du tableau [grille].

On effectue des vérifications:

*g Si la case choisit apparait bien dans notre plateau de jeu.
*g Si la case choisie n'a pas déjà été choisit par un autre joueur.

Lorsque ces vérifications ont été faites, on peut donc stockée notre choix à la case correspondante (X ou O)


Après l'ajout d'une case , on rentre dans une méthode gagnantPartie.

Vérification Victoire d'un joueur
Cette methode consiste à vérifier si l'un des deux joueurs (O ou X) 
à l'une des combinaisons gagnantes qui sont stockées dans un tableaux à deux dimensions.

On parcourt donc le tableau pour chaque joueur et 
on vérifie si l'un des deux joueurs possèdent l'une des combinaisons disponibles.

Si c'est le cas pour l'un d'eux , on retourne donc le gagnant de la partie dans une variable "gagnant" et on casse la boucle.


Si la variable gagnant reste toujours à nulle après vérification pour les joueurs O et X, on redémarre 
donc la boucle par la suite avec cette fois si 
une condition permettant de changer de joueur entre chaque tour de jeu.
( avec l'incrémantation d'un tour de jeu + l'ajout 
d'une case selectionné dans une variable (caseSelect) sur les 9 disponibles). 

Si la variable "caseSelect" (qui s'incrémente lorsqu'un joueur choisit une case) 
est égale à la taille de la grille de jeu qui est donc de 9, 
on peut donc considérer que c'est un match nul si aucune combinaison n'a été trouvé pour l'un des joueurs.

#Notice d'utilisation

1. Un message souhaitant la bienvenue.
2. Noms des deux joueurs (Joueur 1(O) et Joueur 2(X) )
3. Un tirage au sort designe lequel des deux joueurs debute la partie au tour 1.
4. Chaque joueur choisit une case(Entre 1 et 9) dans le tableau à tour de rôle.
5. Si aucun des joueurs n'a de combinaisons gangnantes et que la grille est pleine(9 cases), il y a match nul.
6. Si l'une des combinaisons est gagnante pour l'un des joueurs, il gagne.


#Exemple d'utilisation 


![alt text](https://github.com/zylfu/ProjetJava/blob/72bf69b72380b27233dc22a015582d063999b39f/images/image1.png "Saisie des noms")

![alt text](https://github.com/zylfu/ProjetJava/blob/72bf69b72380b27233dc22a015582d063999b39f/images/image2.bmp "Choix d'une case")

![alt text](https://github.com/zylfu/ProjetJava/blob/72bf69b72380b27233dc22a015582d063999b39f/images/image3.bmp "Ajout case dans le tableau")

![alt text](https://github.com/zylfu/ProjetJava/blob/72bf69b72380b27233dc22a015582d063999b39f/images/image4.bmp "Case déjà choisie par un autre joueur")

![alt text](https://github.com/zylfu/ProjetJava/blob/72bf69b72380b27233dc22a015582d063999b39f/images/image5.bmp "Victoire joueur")

![alt text](https://github.com/zylfu/ProjetJava/blob/72bf69b72380b27233dc22a015582d063999b39f/images/image6.bmp "Match Nul")
