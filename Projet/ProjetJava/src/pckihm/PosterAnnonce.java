package pckihm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import pckmetier.Categorie;
import pckmetier.Region;
import dao.DaoCategorie;
import dao.DaoDepartement;
import dao.DaoRegion;
import dao.DaoSousCategorie;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Vector;

public class PosterAnnonce extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblPosterUneAnnonce;
	private JLabel lblTitre;
	private JLabel lblCategorie;
	private JComboBox cbCateg;
	private JLabel lblDescriptif;
	private JTextField txtDescriptif;
	private JLabel lblNewLabel;
	private JLabel lblVille;
	private JLabel lblRegion;
	private JLabel lblDpartement;
	private JComboBox cbRegion;
	private JComboBox cbDepartement;
	private JTextField txtVille;
	private JTextField txtTitre;
	private JComboBox cbSousCateg;
	private JLabel lblSousCatgorie;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 765, 529);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblPosterUneAnnonce = new JLabel("Poster une annonce");
		lblPosterUneAnnonce.setFont(new Font("Arial", Font.PLAIN, 23));
		lblPosterUneAnnonce.setBounds(270, 36, 280, 51);
		contentPane.add(lblPosterUneAnnonce);
		
		lblTitre = new JLabel("Titre:");
		lblTitre.setBounds(95, 253, 46, 14);
		contentPane.add(lblTitre);
		
		lblCategorie = new JLabel("Categorie:");
		lblCategorie.setBounds(77, 287, 77, 14);
		contentPane.add(lblCategorie);
		
		cbCateg = new JComboBox(DaoCategorie.getLesCateg());
		cbCateg.addActionListener(this);
		cbCateg.setBounds(190, 283, 184, 22);
		contentPane.add(cbCateg);
		
		lblDescriptif = new JLabel("Description :");
		lblDescriptif.setBounds(77, 360, 64, 14);
		contentPane.add(lblDescriptif);
		
		txtDescriptif = new JTextField();
		txtDescriptif.setBounds(190, 360, 184, 120);
		contentPane.add(txtDescriptif);
		txtDescriptif.setColumns(10);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(571, 173, 46, 14);
		contentPane.add(lblNewLabel);
		
		lblVille = new JLabel("Ville:");
		lblVille.setBounds(95, 219, 46, 14);
		contentPane.add(lblVille);
		
		lblRegion = new JLabel("R\u00E9gion:");
		lblRegion.setBounds(82, 165, 46, 14);
		contentPane.add(lblRegion);
		
		lblDpartement = new JLabel("D\u00E9partement:");
		lblDpartement.setBounds(50, 190, 91, 14);
		contentPane.add(lblDpartement);
		lblDpartement.setVisible(false);
		
		cbRegion = new JComboBox(DaoRegion.getLesRegions());
		cbRegion.addActionListener(this);
		cbRegion.setBounds(190, 161, 184, 22);
		contentPane.add(cbRegion);
		
//		cbDepartement = new JComboBox();
//		cbDepartement.setBounds(190, 186, 184, 22);
//		contentPane.add(cbDepartement);
		
		txtVille = new JTextField();
		txtVille.setBounds(190, 215, 184, 23);
		contentPane.add(txtVille);
		txtVille.setColumns(10);
		
		txtTitre = new JTextField();
		txtTitre.setColumns(10);
		txtTitre.setBounds(190, 249, 184, 23);
		contentPane.add(txtTitre);
		
//		cbSousCateg = new JComboBox();
//		cbSousCateg.addActionListener(this);
//		cbSousCateg.setBounds(190, 316, 184, 22);
//		contentPane.add(cbSousCateg);
//		
//		lblSousCatgorie = new JLabel("Sous cat\u00E9gorie :");
//		lblSousCatgorie.setBounds(50, 320, 91, 14);
//		contentPane.add(lblSousCatgorie);
	}
	public void actionPerformed(ActionEvent evt) 
	{
		if(evt.getSource() == this.cbRegion)
		{
			Vector<Region> lesRegions;
			lesRegions = DaoRegion.getLesRegions();
			Region uneReg;
			uneReg = new Region();
			uneReg = DaoDepartement.rechercheRegion(lesRegions, this.cbRegion.getSelectedItem().toString());
			
			cbDepartement = new JComboBox(DaoDepartement.getLesDepartement(uneReg));
			cbDepartement.setBounds(190, 186, 184, 22);
			contentPane.add(cbDepartement);
			this.lblDpartement.setVisible(true);
		}
		
		if(evt.getSource() == this.cbCateg)
		{
		Vector<Categorie> lesCateg;
		lesCateg = DaoCategorie.getLesCateg();
		Categorie uneCateg;
		uneCateg = new Categorie();
		uneCateg = DaoSousCategorie.rechercheCateg(lesCateg, this.cbCateg.getSelectedItem().toString());
		
		cbSousCateg = new JComboBox(DaoSousCategorie.getLesSousCateg(uneCateg));
		cbSousCateg.setBounds(190, 316, 184, 22);
		contentPane.add(cbSousCateg);
		this.lblSousCatgorie.setVisible(true);
		}
	}
}
