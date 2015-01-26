package pckihm;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.DaoRegion;

public class accueil extends JFrame
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 816, 510);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		menuAccueil = new JMenu("Accueil");
		menuBar.add(menuAccueil);
		
		menu = new JMenu("");
		menuBar.add(menu);
		
		menuAnnonce = new JMenu("Annonce");
		menuBar.add(menuAnnonce);
		
		mntmRechercher = new JMenuItem("Rechercher");
		menuAnnonce.add(mntmRechercher);
		
		mntmDposerUneAnnonce = new JMenuItem("D\u00E9poser une annonce");
		menuAnnonce.add(mntmDposerUneAnnonce);
		
		menuConnexion = new JMenu("Connexion");
		menuBar.add(menuConnexion);
		
		menuInscription = new JMenu("Inscription");
		menuBar.add(menuInscription);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTitre = new JLabel("Annonce Du Coin");
		lblTitre.setFont(new Font("Arial", Font.PLAIN, 23));
		lblTitre.setBounds(295, 11, 270, 77);
		contentPane.add(lblTitre);
		
		lblSelectionRegion = new JLabel("Choisir une r\u00E9gion :");
		lblSelectionRegion.setFont(new Font("Arial", Font.PLAIN, 11));
		lblSelectionRegion.setBounds(336, 110, 104, 14);
		contentPane.add(lblSelectionRegion);
		
		cbRegion = new JComboBox(DaoRegion.getLesRegions());
		cbRegion.setBounds(284, 135, 197, 22);
		contentPane.add(cbRegion);
		
		btnRechercher = new JButton("Rechercher");
		btnRechercher.setBounds(336, 183, 104, 23);
		contentPane.add(btnRechercher);
	}
}
