/**
 * 
 */
package fr.iutvalence.info.dut.m2107;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author aurélien
 */
public class IHM extends JFrame implements ActionListener{
	
	private JButton Jouer = new JButton("Jouer");
	private JButton Quitter = new JButton("Quitter");
	private JButton Vendre = new JButton("Vendre");
	private JButton Acheter = new JButton("Acheter");
	private JButton Echanger = new JButton("Echanger");
	private JButton FinDeTour = new JButton("Fin de tour");
	private JButton Hypothequer = new JButton("Hypothequer");
	private JButton Abandonner = new JButton("Abandonner");
	private JDialog accueil = new JDialog();
	
	public IHM()
	{
		JLabel pan  = new JLabel();
		accueil.setIconImage(Toolkit.getDefaultToolkit().getImage("image\\logo.jpg")); 
		accueil.add(new JLabel(new ImageIcon(/*G:\\git\\Monopoly\\ProjetS2\\*/"image\\monopoly.jpg")));
		accueil.setTitle("Monopoly");
	//	accueil.setResizable(false);
	//	accueil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//	Dimension dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
	//	int height = (int)dimension.getHeight();
	//	int width  = (int)dimension.getWidth();
		accueil.setSize( 600,500);
		accueil.setLocationRelativeTo(null);
		accueil.setVisible(true);
		pan.setLayout(null);
		Jouer.setBounds(244, 330, 100, 50);
		Jouer.setBackground(Color.orange);
		Quitter.setBounds(500, 420, 75, 35);
		Quitter.setBackground(Color.LIGHT_GRAY);
		pan.add(Jouer);
		pan.add(Quitter);
		accueil.add(pan);
		Jouer.addActionListener(this);
	    Quitter.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent arg0)
	{
		if(arg0.getSource() == Jouer)
		{
			JLabel pan1  = new JLabel();
			JFrame plateau = new JFrame();
			plateau.setIconImage(Toolkit.getDefaultToolkit().getImage("image\\logo.jpg"));
			plateau.add(new JLabel(new ImageIcon(/*G:\\git\\Monopoly\\ProjetS2\\*/"image\\plateau.jpeg")));
			plateau.setTitle("Monopoly");
			plateau.setResizable(false);
			plateau.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Dimension dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
			int height = (int)dimension.getHeight();
			int width  = (int)dimension.getWidth();
			plateau.setSize(width, height);
			plateau.setLocationRelativeTo(null);
			plateau.setVisible(true);
			pan1.setLayout(null);
			pan1.add(Vendre).setBounds(20, height - 240, 150, 50);;
			pan1.add(Acheter).setBounds(200, height - 240, 150, 50);
			pan1.add(Echanger).setBounds(20, height - 160, 150, 50);
			pan1.add(FinDeTour).setBounds(110, height - 90, 150, 50);
			pan1.add(Hypothequer).setBounds(200, height - 160, 150, 50);
			pan1.add(Abandonner).setBounds(width - 170, height - 90, 150, 50);
			plateau.add(pan1).setBounds(50, 400, 150, 50);
		
		}
		if(arg0.getSource() == Quitter) 
			accueil.dispose();
		
		if(arg0.getSource() == Acheter) 
			
			
		if(arg0.getSource() == Vendre) 

			
		if(arg0.getSource() == Echanger) 

			
		if(arg0.getSource() == Hypothequer) 

			
		if(arg0.getSource() == Abandonner)
		{
			Partie.getJoueurCourant().setEstDansLaPartie(true);
		}
		
		//if(arg0.getSource() == FinDeTour)
			//endOfRound = true;

			
			
	}
}
