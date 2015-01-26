package pckihm;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import dao.DaoUtilisateur;
import javax.swing.JPasswordField;

public class Connexion extends JFrame implements ActionListener
{

	private JPanel contentPane;
	private JLabel lblConnexion;
	private JTextField txtLogin;
	private JLabel lblIdentifiant;
	private JLabel lblMotDePasse;
	private JButton btnConnexion;
	private JMenuBar menuBar;
	private JMenu mnAccueil;
	private JMenu mnAnnonce;
	private JMenuItem menuRechercher;
	private JMenuItem menuPoster;
	private JMenu menuConnexion;
	private JMenu menuInscription;
	private JPasswordField txtMdp;

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
					Connexion frame = new Connexion();
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
	public Connexion()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnAccueil = new JMenu("Accueil");
		menuBar.add(mnAccueil);
		
		mnAnnonce = new JMenu("Annonce ");
		menuBar.add(mnAnnonce);
		
		menuRechercher = new JMenuItem("Rechercher ");
		mnAnnonce.add(menuRechercher);
		
		menuPoster = new JMenuItem("D\u00E9poser une annonce");
		mnAnnonce.add(menuPoster);
		
		menuConnexion = new JMenu("Connexion");
		menuBar.add(menuConnexion);
		
		menuInscription = new JMenu("Inscription");
		menuBar.add(menuInscription);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblConnexion = new JLabel("Connexion");
		lblConnexion.setFont(new Font("Arial", Font.PLAIN, 23));
		lblConnexion.setBounds(145, 11, 118, 40);
		contentPane.add(lblConnexion);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(133, 89, 130, 20);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);
		
		lblIdentifiant = new JLabel("Identifiant :");
		lblIdentifiant.setBounds(47, 92, 76, 14);
		contentPane.add(lblIdentifiant);
		
		lblMotDePasse = new JLabel(" Mot de passe :");
		lblMotDePasse.setBounds(35, 123, 96, 14);
		contentPane.add(lblMotDePasse);
		
		btnConnexion = new JButton("Connexion");
		btnConnexion.addActionListener(this);
		btnConnexion.setBounds(145, 151, 109, 23);
		contentPane.add(btnConnexion);
		
		txtMdp = new JPasswordField();
		txtMdp.setBounds(133, 120, 130, 20);
		contentPane.add(txtMdp);
	}
	public void actionPerformed(ActionEvent evt)
	{
		if (evt.getSource() == btnConnexion )
       	 {
			JOptionPane.showMessageDialog(this, "Utilisateur" + DaoUtilisateur.getConnexion(txtLogin.getText(), txtMdp.getText()));
       	 }
	   
       
	}
}
