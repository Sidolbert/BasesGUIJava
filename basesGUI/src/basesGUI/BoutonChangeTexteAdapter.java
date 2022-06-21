package basesGUI;

import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.MouseInputAdapter;
import javax.swing.event.MouseInputListener;

//classe qui définit comment mon bouton va réagir au clic de souris et autres évènements extérieurs
//on hérite d'un adapteur par défaut qui définit les méthodes dont on a besoin pour réagir aux évènements liés à la souris
//ça évite de tout recoder
public class BoutonChangeTexteAdapter extends MouseInputAdapter {

	//les informations dont aura besoin mon écouteur pour faire fonctionner ses codes
	JLabel labelAModifier;
	JTextField champTexteSource;
	
	public BoutonChangeTexteAdapter() {
		// TODO Auto-generated constructor stub
	}

	public BoutonChangeTexteAdapter(JLabel labelAModifier, JTextField champTexteSource) {
		this.labelAModifier = labelAModifier;
		this.champTexteSource = champTexteSource;
	}
	
	//on surcharge la méthode qui réagit au clic de souris
	@Override
	public void mouseClicked(MouseEvent e) {
		
		super.mouseClicked(e);
		//je vais changer le texte du JLabel voisin de mon bouton
		//pour qu'il dise autre chose
		
		//seulement, ma classe BoutonChangeTexteAdapter ne connait pas le label !
		//je dois le retrouver depuis ma seule info : l'évènement déclencheur !
		
		//syntaxe la plus polyvalente, mais un peu lourde
		
//		//je récupère le bouton qui a déclenché l'évènement
//		//attention au typage sur les variables
//		JButton boutonDeclencheur = (JButton)e.getSource();
//		//on navigue dans l'arbre des composants pour trouver notre label
//		//mon label est le premier composant du parent de bouton
//		//on peut faire ça plus simplement selon le contexte ^^
//		JLabel labelAModifier = (JLabel) boutonDeclencheur.getParent().getComponent(0);
//		//on fait la modification du texte du label depuis le contenu du JTextField
//		JTextField champTexteSource = (JTextField) boutonDeclencheur.getParent().getComponent(1);
//		String nouveauTexte = champTexteSource.getText();
//		labelAModifier.setText(nouveauTexte);
		
		//pour un écouteur comme celui-ci, sur un bouton spécifique
		//je peux le créer avec des informations supplémentaires
		//et travailler directement depuis ses attributs
		this.labelAModifier.setText(this.champTexteSource.getText());
		
	}
	
	

	

}
