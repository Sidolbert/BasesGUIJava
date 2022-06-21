package basesGUI;

import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FenetrePrincipale extends JFrame {
	
	//constructeur de ma fenêtre principale
	//on la configure et on la remplit
	public FenetrePrincipale() throws HeadlessException {
		//on règle sa position initiale et sa taille en pixels
		//fenetre.setBounds(1000, 500, 500, 500);
		//on peut régler la position par défaut selon l'OS
		//fenetre.setLocationByPlatform(true);
		this.setSize(500, 200);
		//on peut aussi la mettre au centre de l'écran
		//note : l'ordre d'appel des méthodes a son importance !
		this.setLocationRelativeTo(null);
		//on définit le comportement du bouton croix
		//on demande l'arrêt du programme quand on ferme la fenêtre
		//classique pour une fenêtre principale
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//on va remplir la fenêtre avec des éléments
		//par exemple, un texte et un bouton
		
		//je crée un élément qui affiche du texte
		JLabel label = new JLabel("Mon composant texte");
		//je l'ajoute au container qui doit l'afficher, ici ma fenêtre
		//par défaut, les composants ajoutés au contentPane (panneau de contenu) de ma fenêtre suivent une mise en place appelée BorderLayout
		//c'est éditable aussi
		//on va le changer pour quelque chose de plus lisible
		this.getContentPane().setLayout(new FlowLayout());
		this.add(label);
		//on crée un champ texte remplissable
		JTextField champTexte = new JTextField("entrez un texte");
		this.add(champTexte);
		
		
		//je crée un bouton
		JButton button = new JButton("changer le texte");
		//si on veut que le bouton fasse quelque chose, il faut lui dire
		//j'ajoute au bouton l'écouteur qui va déclencher l'action liée au clic
		button.addMouseListener(new BoutonChangeTexteAdapter(label, champTexte));
		this.add(button);
		
		
		
		
	}

	public FenetrePrincipale(GraphicsConfiguration gc) {
		super(gc);
		// TODO Auto-generated constructor stub
	}

	public FenetrePrincipale(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public FenetrePrincipale(String title, GraphicsConfiguration gc) {
		super(title, gc);
		// TODO Auto-generated constructor stub
	}

}
