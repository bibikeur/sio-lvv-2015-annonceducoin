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

import pckmetier.Categorie;
import pckmetier.Departement;
import pckmetier.Region;
import pckmetier.SousCategorie;
import dao.DaoCategorie;
import dao.DaoDepartement;
import dao.DaoRegion;
import dao.DaoSousCategorie;

public class FenetreRecherche extends JDialog implements ActionListener, ItemListener, MouseListener
{

	private JPanel contentPane;
	private JLabel lblRechercherUneAnnonce;
	private JMenuBar menuBar;
	private JMenu menuAccueil;
	private JMenu menuAnnonce;
	private JMenu menuConnexion;
	private JMenu menuInscription;
	private JMenuItem mntmRechercherAnnonce;
	private JMenuItem mntmDeposerAnnonce;
	private JComboBox cbCateg;
	private JLabel lblNewLabel;
	private JComboBox cbDepartement;
	private JComboBox cbRegion;
	private JComboBox cbSousCateg;
	private JLabel lblCatgorie;
	private JLabel lblSousCatgorie;
	private JLabel lblDep;
	private JButton btnRechercher;

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
					FenetreRecherche frame = new FenetreRecherche();
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
	public FenetreRecherche()
	{
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 767, 422);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		menuAccueil = new JMenu("Accueil");
		menuAccueil.addMouseListener(this);
		menuBar.add(menuAccueil);
		
		menuAnnonce = new JMenu("Annonce");
		menuBar.add(menuAnnonce);
		
		mntmRechercherAnnonce = new JMenuItem("Rechercher une annonce");
		menuAnnonce.add(mntmRechercherAnnonce);
		
		mntmDeposerAnnonce = new JMenuItem("D\u00E9poser une annonce");
		mntmDeposerAnnonce.addMouseListener(this);
		menuAnnonce.add(mntmDeposerAnnonce);
		
		menuConnexion = new JMenu("Connexion");
		menuConnexion.addMouseListener(this);
		menuConnexion.addActionListener(this);
		menuBar.add(menuConnexion);
		
		menuInscription = new JMenu("Inscription");
		menuInscription.addMouseListener(this);
		menuBar.add(menuInscription);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblRechercherUneAnnonce = new JLabel("Rechercher une annonce");
		lblRechercherUneAnnonce.setFont(new Font("Arial", Font.PLAIN, 23));
		lblRechercherUneAnnonce.setBounds(226, 0, 290, 43);
		contentPane.add(lblRechercherUneAnnonce);
		
		cbCateg = new JComboBox(DaoCategorie.getLesCateg());
		cbCateg.addItemListener(this);
		cbCateg.setBounds(486, 88, 160, 22);
		contentPane.add(cbCateg);
		
		lblNewLabel = new JLabel("R\u00E9gion :");
		lblNewLabel.setBounds(121, 92, 46, 14);
		contentPane.add(lblNewLabel);
		
		lblDep = new JLabel("D\u00E9partement :");
		lblDep.setBounds(92, 125, 89, 14);
		contentPane.add(lblDep);
		this.lblDep.setVisible(false);
		

		cbDepartement = new JComboBox();
		cbDepartement.setBounds(177, 121, 160, 22);
		contentPane.add(cbDepartement);
		cbDepartement.setVisible(false);
		
		cbRegion = new JComboBox(DaoRegion.getLesRegions());
		cbRegion.addItemListener(this);
		cbRegion.setBounds(177, 88, 160, 22);
		contentPane.add(cbRegion);
		
		cbSousCateg = new JComboBox();
		cbSousCateg.setBounds(486, 121, 160, 22);
		contentPane.add(cbSousCateg);
		cbSousCateg.setVisible(false);
		
		lblCatgorie = new JLabel("Cat\u00E9gorie :");
		lblCatgorie.setBounds(410, 92, 75, 14);
		contentPane.add(lblCatgorie);
		
		lblSousCatgorie = new JLabel("Sous cat\u00E9gorie :");
		lblSousCatgorie.setBounds(368, 125, 108, 14);
		contentPane.add(lblSousCatgorie);
		this.lblSousCatgorie.setVisible(false);
		
		
		
		btnRechercher = new JButton("Rechercher");
		btnRechercher.addActionListener(this);
		btnRechercher.setBounds(343, 197, 108, 43);
		contentPane.add(btnRechercher);
	}
	

	public void actionPerformed(ActionEvent evt) 
	{
		
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
			this.lblDep.setVisible(true);
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
			this.lblSousCatgorie.setVisible(true);
			
		}
	}

	public void mouseClicked(MouseEvent evt) {
	}
	public void mouseEntered(MouseEvent arg0) {
	}
	public void mouseExited(MouseEvent arg0) {
	}
	public void mousePressed(MouseEvent evt) 
	{
		
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
			fenInscription.setBounds(100, 100, 537, 495);;
			fenInscription.setLocation(100, 100);
			fenInscription.setModal(true);
			fenInscription.setVisible(true);
			fenInscription.setTitle("Connexion");
		}
		
		if ( evt.getSource() == this.menuAccueil)
		{
			accueil fenAcc = new accueil();
			fenAcc.setBounds(100, 100, 400, 280);
			fenAcc.setLocation(100, 100);
			fenAcc.setModal(true);
			this.dispose();
			fenAcc.setVisible(true);
			fenAcc.setTitle("Connexion");
		} 
		if ( evt.getSource() == this.mntmDeposerAnnonce)
		{
			PosterAnnonce fenPoste = new PosterAnnonce();
			fenPoste.setBounds(100, 100, 765, 529);
			fenPoste.setLocation(100, 100);
			fenPoste.setModal(true);
			this.dispose();
			fenPoste.setVisible(true);
			fenPoste.setTitle("D�poser une annonce");
		}
	}
	public void mouseReleased(MouseEvent arg0) {
	}

	
}
