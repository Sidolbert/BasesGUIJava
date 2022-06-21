package basesGUI;

import java.util.Scanner;

import javax.swing.JButton;

public class Main {

	public static void main(String[] args) {
		//exemple d'interface utilisateur graphique (très) simple en Java
		
//		//interface en console, un peu primitive
//		System.out.println("entrez votre nom");
//		Scanner scan = new Scanner(System.in);
//		String s = scan.nextLine();
//		System.out.println("Bienvenue, " + s + " !");
		
		//si on utilise une "vraie" interface graphique :
		//on crée un objet représentant une fenêtre graphique
		FenetrePrincipale fenetre = new FenetrePrincipale();
		
		
		//et on la rend visible pour l'utilisateur dans son état actuel
		//une fois que le travail de construction est vraiment terminé
		fenetre.setVisible(true);

	}

}
