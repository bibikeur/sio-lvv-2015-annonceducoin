package pckihm;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import dao.DaoUtilisateur;
import javax.swing.JPasswordField;

public class Inscription extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblInscription;
	private JLabel lblNom;
	private JLabel lblPrnom;
	private JLabel lblLogin;
	private JLabel lblMotDePasse;
	private JLabel lblRue;
	private JLabel lblVille;
	private JLabel lblTel;
	private JTextField txtNom;
	private JTextField txtPrenom;
	private JTextField txtRue;
	private JTextField txtVille;
	private JTextField txtTel;
	private JTextField txtLogin;
	private JButton btnValider;
	private JButton btnQuitter;
	private JLabel lblCodePostal;
	private JTextField txtCp;
	private JRadioButton rbtnParticulier;
	private JRadioButton rbtnProfessionnel;
	private ButtonGroup groupeRadioBtn;
	private String role;
	private JPasswordField txtMdp;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inscription frame = new Inscription();
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
	public Inscription() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 769, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblInscription = new JLabel("Inscription");
		lblInscription.setFont(new Font("Arial", Font.PLAIN, 23));
		lblInscription.setBounds(317, 26, 123, 48);
		contentPane.add(lblInscription);
		
		lblNom = new JLabel("Nom:");
		lblNom.setBounds(91, 168, 46, 14);
		contentPane.add(lblNom);
		
		lblPrnom = new JLabel("Pr\u00E9nom:");
		lblPrnom.setBounds(82, 196, 66, 14);
		contentPane.add(lblPrnom);
		
		lblLogin = new JLabel("Login:");
		lblLogin.setBounds(91, 321, 86, 14);
		contentPane.add(lblLogin);
		
		lblMotDePasse = new JLabel("Mot de passe:");
		lblMotDePasse.setBounds(52, 346, 96, 14);
		contentPane.add(lblMotDePasse);
		
		lblRue = new JLabel("Rue:");
		lblRue.setBounds(97, 221, 36, 14);
		contentPane.add(lblRue);
		
		lblVille = new JLabel("Ville:");
		lblVille.setBounds(94, 246, 54, 14);
		contentPane.add(lblVille);
		
		lblTel = new JLabel("Tel:");
		lblTel.setBounds(102, 296, 26, 14);
		contentPane.add(lblTel);
		
		txtNom = new JTextField();
		txtNom.setBounds(155, 165, 143, 20);
		contentPane.add(txtNom);
		txtNom.setColumns(10);
		
		txtPrenom = new JTextField();
		txtPrenom.setColumns(10);
		txtPrenom.setBounds(155, 190, 143, 20);
		contentPane.add(txtPrenom);
		
		txtRue = new JTextField();
		txtRue.setColumns(10);
		txtRue.setBounds(155, 218, 143, 20);
		contentPane.add(txtRue);
		
		txtVille = new JTextField();
		txtVille.setColumns(10);
		txtVille.setBounds(155, 243, 143, 20);
		contentPane.add(txtVille);
		
		txtTel = new JTextField();
		txtTel.setColumns(10);
		txtTel.setBounds(155, 293, 143, 20);
		contentPane.add(txtTel);
		
		txtLogin = new JTextField();
		txtLogin.setColumns(10);
		txtLogin.setBounds(155, 318, 143, 20);
		contentPane.add(txtLogin);
		
		btnValider = new JButton("Valider");
		btnValider.addActionListener(this);
		btnValider.setBounds(483, 403, 113, 37);
		contentPane.add(btnValider);
		
		btnQuitter = new JButton("Quitter");
		btnQuitter.setBounds(606, 403, 113, 37);
		contentPane.add(btnQuitter);
		
		lblCodePostal = new JLabel("Code postal:");
		lblCodePostal.setBounds(62, 271, 96, 14);
		contentPane.add(lblCodePostal);
		
		txtCp = new JTextField();
		txtCp.setBounds(155, 268, 143, 20);
		contentPane.add(txtCp);
		txtCp.setColumns(10);
		
		rbtnParticulier = new JRadioButton("Particulier");
		rbtnParticulier.setBounds(437, 189, 109, 23);
		contentPane.add(rbtnParticulier);
		
		rbtnProfessionnel = new JRadioButton("Professionnel");
		rbtnProfessionnel.setBounds(437, 221, 109, 23);
		contentPane.add(rbtnProfessionnel);
		
		this.groupeRadioBtn = new ButtonGroup();
		this.groupeRadioBtn.add(this.rbtnParticulier);
		this.groupeRadioBtn.add(this.rbtnProfessionnel);
		
		txtMdp = new JPasswordField();
		txtMdp.setBounds(155, 343, 143, 20);
		contentPane.add(txtMdp);
	}
	
	public void actionPerformed(ActionEvent evt) 
	{
		if (evt.getSource() == btnQuitter )
		{
			this.dispose();
		}
		 if (evt.getSource() == btnValider )
	    {
			 if(this.rbtnParticulier.isSelected())
			 {
				 this.role = "Particulier";
			 }
			 if(this.rbtnProfessionnel.isSelected())
			 {
				 this.role = "Professionnel";
			 }
			 if(DaoUtilisateur.getInscription(txtNom.getText(), txtPrenom.getText(), txtRue.getText(), txtVille.getText(),
					 txtCp.getText(), txtTel.getText(), txtLogin.getText(), txtMdp.getText(), this.role ) == 1 )
			{
				 JOptionPane.showMessageDialog(this, "Utilisateur ajouté"); 
			}
		 
	    }
	}
}
