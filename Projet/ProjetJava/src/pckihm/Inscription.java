package pckihm;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import dao.DaoUtilisateur;

public class Inscription extends JDialog implements ActionListener {

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
	private JTextField txtMail;
	private JLabel lblMail;
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
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 537, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblInscription = new JLabel("Inscription");
		lblInscription.setFont(new Font("Arial", Font.PLAIN, 23));
		lblInscription.setBounds(186, 11, 123, 48);
		contentPane.add(lblInscription);
		
		lblNom = new JLabel("Nom:");
		lblNom.setBounds(102, 97, 46, 14);
		contentPane.add(lblNom);
		
		lblPrnom = new JLabel("Pr\u00E9nom:");
		lblPrnom.setBounds(91, 121, 46, 14);
		contentPane.add(lblPrnom);
		
		lblLogin = new JLabel("Login:");
		lblLogin.setBounds(91, 267, 86, 14);
		contentPane.add(lblLogin);
		
		lblMotDePasse = new JLabel("Mot de passe:");
		lblMotDePasse.setBounds(52, 292, 96, 14);
		contentPane.add(lblMotDePasse);
		
		lblRue = new JLabel("Rue:");
		lblRue.setBounds(102, 146, 26, 14);
		contentPane.add(lblRue);
		
		lblVille = new JLabel("Ville:");
		lblVille.setBounds(104, 171, 54, 14);
		contentPane.add(lblVille);
		
		lblTel = new JLabel("Tel:");
		lblTel.setBounds(102, 217, 26, 14);
		contentPane.add(lblTel);
		
		txtNom = new JTextField();
		txtNom.setBounds(155, 94, 143, 20);
		contentPane.add(txtNom);
		txtNom.setColumns(10);
		
		txtPrenom = new JTextField();
		txtPrenom.setColumns(10);
		txtPrenom.setBounds(155, 119, 143, 20);
		contentPane.add(txtPrenom);
		
		txtRue = new JTextField();
		txtRue.setColumns(10);
		txtRue.setBounds(155, 140, 143, 20);
		contentPane.add(txtRue);
		
		txtVille = new JTextField();
		txtVille.setColumns(10);
		txtVille.setBounds(155, 165, 143, 20);
		contentPane.add(txtVille);
		
		txtTel = new JTextField();
		txtTel.setColumns(10);
		txtTel.setBounds(155, 214, 143, 20);
		contentPane.add(txtTel);
		
		txtLogin = new JTextField();
		txtLogin.setColumns(10);
		txtLogin.setBounds(155, 264, 143, 20);
		contentPane.add(txtLogin);
		
		btnValider = new JButton("Valider");
		btnValider.addActionListener(this);
		btnValider.setBounds(227, 403, 113, 37);
		contentPane.add(btnValider);
		
		btnQuitter = new JButton("Quitter");
		btnQuitter.addActionListener(this);
		btnQuitter.setBounds(350, 403, 113, 37);
		contentPane.add(btnQuitter);
		
		lblCodePostal = new JLabel("Code postal:");
		lblCodePostal.setBounds(64, 196, 96, 14);
		contentPane.add(lblCodePostal);
		
		txtCp = new JTextField();
		txtCp.setBounds(155, 193, 143, 20);
		contentPane.add(txtCp);
		txtCp.setColumns(10);
		
		rbtnParticulier = new JRadioButton("Particulier");
		rbtnParticulier.setBounds(350, 164, 109, 23);
		contentPane.add(rbtnParticulier);
		
		rbtnProfessionnel = new JRadioButton("Professionnel");
		rbtnProfessionnel.setBounds(350, 192, 109, 23);
		contentPane.add(rbtnProfessionnel);
		
		this.groupeRadioBtn = new ButtonGroup();
		this.groupeRadioBtn.add(this.rbtnParticulier);
		this.groupeRadioBtn.add(this.rbtnProfessionnel);
		
		txtMdp = new JPasswordField();
		txtMdp.setBounds(155, 289, 143, 20);
		contentPane.add(txtMdp);
		
		txtMail = new JTextField();
		txtMail.setBounds(155, 236, 143, 20);
		contentPane.add(txtMail);
		txtMail.setColumns(10);
		
		lblMail = new JLabel("Mail :");
		lblMail.setBounds(91, 242, 46, 14);
		contentPane.add(lblMail);
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
					 txtCp.getText(), txtTel.getText(), txtLogin.getText(), txtMdp.getText(), this.role, this.txtMail.getText() ) == 1 )
			{
				 JOptionPane.showMessageDialog(this, "Utilisateur ajout�"); 
			}
		 
	    }
	}
}
