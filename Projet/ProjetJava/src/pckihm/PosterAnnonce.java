package pckihm;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import pckmetier.Categorie;
import pckmetier.Departement;
import pckmetier.Region;
import pckmetier.SousCategorie;
import dao.DaoCategorie;
import dao.DaoDepartement;
import dao.DaoRegion;
import dao.DaoSousCategorie;
import dao.DaoUtilisateur;

import javax.swing.JButton;

public class PosterAnnonce extends JDialog implements ActionListener, MouseListener, ItemListener {

	private JPanel contentPane;
	private JLabel lblPosterUneAnnonce;
	private JLabel lblTitre;
	private JLabel lblCategorie;
	private JComboBox cbCateg;
	private JLabel lblDescriptif;
	private JTextField txtDescriptif;
	private JLabel lblVille;
	private JLabel lblRegion;
	private JLabel lblDpartement;
	private JComboBox cbRegion;
	private JComboBox cbDepartement;
	private JTextField txtVille;
	private JTextField txtTitre;
	private JComboBox cbSousCateg;
	private JLabel lblSousCategorie;
	private JMenuBar menuBar;
	private JMenu mnAccueil;
	private JMenu mnAnnonce;
	private JMenuItem mnRechercher;
	private JMenuItem mnDeposer;
	private JMenu mnConnexion;
	private JMenu mnInscription;
	private JButton btnAnnuler;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PosterAnnonce frame = new PosterAnnonce();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PosterAnnonce() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 765, 529);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnAccueil = new JMenu("Accueil");
		mnAccueil.addMouseListener(this);
		menuBar.add(mnAccueil);
		
		mnAnnonce = new JMenu("Annonce");
		menuBar.add(mnAnnonce);
		
		mnRechercher = new JMenuItem("Rechercher");
		mnRechercher.addMouseListener(this);
		mnAnnonce.add(mnRechercher);
		
		mnDeposer = new JMenuItem("D\u00E9poser une annonce");
		mnDeposer.addMouseListener(this);
		mnAnnonce.add(mnDeposer);
		
		mnConnexion = new JMenu("Connexion");
		mnConnexion.addMouseListener(this);
		menuBar.add(mnConnexion);
		
		mnInscription = new JMenu("Inscription");
		mnInscription.addMouseListener(this);
		menuBar.add(mnInscription);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblPosterUneAnnonce = new JLabel("Poster une annonce");
		lblPosterUneAnnonce.setFont(new Font("Arial", Font.PLAIN, 23));
		lblPosterUneAnnonce.setBounds(270, 36, 280, 51);
		contentPane.add(lblPosterUneAnnonce);
		
		lblTitre = new JLabel("Titre:");
		lblTitre.setBounds(87, 208, 36, 14);
		contentPane.add(lblTitre);
		
		lblCategorie = new JLabel("Categorie:");
		lblCategorie.setBounds(65, 241, 77, 14);
		contentPane.add(lblCategorie);
		
		cbCateg = new JComboBox(DaoCategorie.getLesCateg());
		cbCateg.addItemListener(this);
		cbCateg.setBounds(190, 233, 184, 22);
		contentPane.add(cbCateg);
		
		lblDescriptif = new JLabel("Description :");
		lblDescriptif.setBounds(404, 114, 73, 14);
		contentPane.add(lblDescriptif);
		
		txtDescriptif = new JTextField();
		txtDescriptif.setBounds(487, 114, 252, 174);
		contentPane.add(txtDescriptif);
		txtDescriptif.setColumns(10);
		
		lblVille = new JLabel("Ville:");
		lblVille.setBounds(95, 173, 46, 14);
		contentPane.add(lblVille);
		
		lblRegion = new JLabel("R\u00E9gion:");
		lblRegion.setBounds(77, 114, 46, 14);
		contentPane.add(lblRegion);
		
		lblDpartement = new JLabel("D\u00E9partement:");
		lblDpartement.setBounds(51, 148, 91, 14);
		contentPane.add(lblDpartement);
		lblDpartement.setVisible(false);
		
		cbDepartement = new JComboBox();
		cbDepartement.setBounds(190, 139, 184, 22);
		contentPane.add(cbDepartement);
		cbDepartement.setVisible(false);
		lblDpartement.setVisible(false);
		
		cbRegion = new JComboBox(DaoRegion.getLesRegions());
		cbRegion.addItemListener(this);
		cbRegion.setBounds(190, 110, 184, 22);
		contentPane.add(cbRegion);
		
		txtVille = new JTextField();
		txtVille.setBounds(190, 169, 184, 23);
		contentPane.add(txtVille);
		txtVille.setColumns(10);
		
		txtTitre = new JTextField();
		txtTitre.setColumns(10);
		txtTitre.setBounds(190, 204, 184, 23);
		contentPane.add(txtTitre);
		
		cbSousCateg = new JComboBox();
		cbSousCateg.setBounds(190, 266, 184, 22);
		contentPane.add(cbSousCateg);
		cbSousCateg.setVisible(false);
		
		lblSousCategorie = new JLabel("Sous cat\u00E9gorie :");
		lblSousCategorie.setBounds(44, 266, 108, 14);
		contentPane.add(lblSousCategorie);
		
		JButton btnValider = new JButton("Valider");
		btnValider.setBounds(211, 388, 121, 37);
		contentPane.add(btnValider);
		
		btnAnnuler = new JButton("Annuler");
		btnAnnuler.setBounds(375, 388, 121, 37);
		btnAnnuler.addActionListener(this);
		contentPane.add(btnAnnuler);
		lblSousCategorie.setVisible(false);
	}
	
	public void itemStateChanged(ItemEvent event) 
	{
		if (event.getSource() == this.cbRegion) 
		{ 
			
			String regSelec = event.getItem().toString();
			
			Vector<Region> lesRegions;
			lesRegions = DaoRegion.getLesRegions();
			Region uneReg;
			uneReg = new Region();
			uneReg = DaoDepartement.rechercheRegion(lesRegions, regSelec);
			System.out.println(uneReg);
			cbDepartement.removeAllItems();
			for (Departement m : DaoDepartement.getLesDepartement(uneReg))
				cbDepartement.addItem(m);
			cbDepartement.setVisible(true);
			lblDpartement.setVisible(true);
		}
		
		if (event.getSource() == this.cbCateg)
		{
			String categSelec = event.getItem().toString();
			Vector<Categorie> lesCateg;
			lesCateg = DaoCategorie.getLesCateg();
			Categorie uneCateg;
			uneCateg = new Categorie();
			uneCateg = DaoSousCategorie.rechercheCateg(lesCateg,categSelec);
			cbSousCateg.removeAllItems();
			for (SousCategorie m : DaoSousCategorie.getLesSousCateg(uneCateg))
				cbSousCateg.addItem(m);
			cbSousCateg.setVisible(true);
			lblSousCategorie.setVisible(true);
			
		}
	}
	
	public void actionPerformed(ActionEvent evt)
	{
		if (evt.getSource() == this.btnAnnuler )
		{
			this.dispose();
			accueil fenAcc = new accueil();
			fenAcc.setBounds(100, 100, 400, 280);
			fenAcc.setLocation(100, 100);
			fenAcc.setModal(true);
			this.dispose();
			fenAcc.setVisible(true);
			fenAcc.setTitle("Accueil");
			
		}
	   
       
	}
	
	public void mouseClicked(MouseEvent arg0) {
	}
	public void mouseEntered(MouseEvent arg0) {
	}
	public void mouseExited(MouseEvent arg0) {
	}
	public void mousePressed(MouseEvent evt) {
		
		if ( evt.getSource() == this.mnConnexion)
		{
			Connexion fenCo = new Connexion();
			fenCo.setBounds(20,20,400,300);
			fenCo.setLocation(100, 100);
			fenCo.setModal(true);
			fenCo.setVisible(true);
			fenCo.setTitle("Connexion");
		}
		if ( evt.getSource() == this.mnInscription)
		{
			Inscription fenInscription = new Inscription();
			fenInscription.setBounds(100, 100, 537, 495);;
			fenInscription.setLocation(100, 100);
			fenInscription.setModal(true);
			fenInscription.setVisible(true);
			fenInscription.setTitle("Inscription");
		}
		
		if ( evt.getSource() == this.mnAccueil)
		{
			accueil fenAcc = new accueil();
			fenAcc.setBounds(100, 100, 400, 280);
			fenAcc.setLocation(100, 100);
			fenAcc.setModal(true);
			this.dispose();
			fenAcc.setVisible(true);
			fenAcc.setTitle("Accueil");
		} 
		if ( evt.getSource() == this.mnRechercher)
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
