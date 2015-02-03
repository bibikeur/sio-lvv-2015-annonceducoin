package pckihm;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.DaoRegion;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class accueil extends JDialog implements ActionListener, MouseListener
{

	private JPanel contentPane;
	private JLabel lblTitre;
	private JLabel lblSelectionRegion;
	private JComboBox cbRegion;
	private JButton btnRechercher;
	private JMenuBar menuBar;
	private JMenu menuAccueil;
	private JMenu menu;
	private JMenu menuAnnonce;
	private JMenuItem mntmRechercher;
	private JMenuItem mntmDposerUneAnnonce;
	private JMenu menuConnexion;
	private JMenu menuInscription;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					accueil frame = new accueil();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public accueil()
	{
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 400, 280);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		menuAccueil = new JMenu("Accueil");
		menuBar.add(menuAccueil);
		
		menu = new JMenu("");
		menuBar.add(menu);
		
		menuAnnonce = new JMenu("Annonce");
		menuBar.add(menuAnnonce);
		
		mntmRechercher = new JMenuItem("Rechercher");
		mntmRechercher.addMouseListener(this);
		menuAnnonce.add(mntmRechercher);
		
		mntmDposerUneAnnonce = new JMenuItem("D\u00E9poser une annonce");
		mntmDposerUneAnnonce.addMouseListener(this);
		menuAnnonce.add(mntmDposerUneAnnonce);
		
		menuConnexion = new JMenu("Connexion");
		menuConnexion.addMouseListener(this);
		menuBar.add(menuConnexion);
		
		menuInscription = new JMenu("Inscription");
		menuInscription.addMouseListener(this);
		menuBar.add(menuInscription);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTitre = new JLabel("Annonce Du Coin");
		lblTitre.setFont(new Font("Arial", Font.PLAIN, 23));
		lblTitre.setBounds(104, 11, 270, 77);
		contentPane.add(lblTitre);
		
		lblSelectionRegion = new JLabel("Choisir une r\u00E9gion :");
		lblSelectionRegion.setFont(new Font("Arial", Font.PLAIN, 11));
		lblSelectionRegion.setBounds(143, 87, 104, 14);
		contentPane.add(lblSelectionRegion);
		
		cbRegion = new JComboBox(DaoRegion.getLesRegions());
		cbRegion.setBounds(96, 112, 197, 22);
		contentPane.add(cbRegion);
		
		btnRechercher = new JButton("Rechercher");
		btnRechercher.addActionListener(this);
		btnRechercher.setBounds(143, 146, 104, 23);
		contentPane.add(btnRechercher);
	}
	public void actionPerformed(ActionEvent arg0) 
	{
		
	}
	public void mouseClicked(MouseEvent arg0) {
	}
	public void mouseEntered(MouseEvent arg0) {
	}
	public void mouseExited(MouseEvent arg0) {
	}
	public void mousePressed(MouseEvent evt) {
		
		if ( evt.getSource() == this.menuConnexion)
		{
			Connexion fenCo = new Connexion();
			fenCo.setBounds(20,20,400,300);
			fenCo.setLocation(100, 100);
			fenCo.setModal(true);
			fenCo.setVisible(true);
			fenCo.setTitle("Connexion");
		}
		if ( evt.getSource() == this.menuInscription)
		{
			Inscription fenInscription = new Inscription();
			fenInscription.setBounds(100, 100, 769, 520);
			fenInscription.setLocation(100, 100);
			fenInscription.setModal(true);
			fenInscription.setVisible(true);
			fenInscription.setTitle("Connexion");
		}
		
		if ( evt.getSource() == this.mntmDposerUneAnnonce)
		{
			PosterAnnonce fenPoste = new PosterAnnonce();
			fenPoste.setBounds(100, 100, 765, 529);
			fenPoste.setLocation(100, 100);
			fenPoste.setModal(true);
			this.dispose();
			fenPoste.setVisible(true);
			fenPoste.setTitle("Déposer une annonce");
		}
		
		if ( evt.getSource() == this.mntmRechercher)
		{
			FenetreRecherche fenRecherche = new FenetreRecherche();
			fenRecherche.setBounds(100, 100, 765, 529);
			fenRecherche.setLocation(100, 100);
			fenRecherche.setModal(true);
			this.dispose();
			fenRecherche.setVisible(true);
			fenRecherche.setTitle("Déposer une annonce");
		}
	}
	public void mouseReleased(MouseEvent arg0) {
	}
}
