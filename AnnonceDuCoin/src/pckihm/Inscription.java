package pckihm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class Inscription extends JFrame {

	private JPanel contentPane;
	private JLabel lblInscription;
	private JLabel lblNom;
	private JLabel lblPrnom;
	private JLabel lblEmail;
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
	private JTextField txtMdp;
	private JTextField txtEmail;
	private JButton btnValider;
	private JButton btnQuitter;

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
		lblNom.setBounds(251, 134, 46, 14);
		contentPane.add(lblNom);
		
		lblPrnom = new JLabel("Pr\u00E9nom:");
		lblPrnom.setBounds(238, 162, 46, 14);
		contentPane.add(lblPrnom);
		
		lblEmail = new JLabel("Email:");
		lblEmail.setBounds(251, 309, 36, 14);
		contentPane.add(lblEmail);
		
		lblLogin = new JLabel("Login:");
		lblLogin.setBounds(251, 259, 46, 14);
		contentPane.add(lblLogin);
		
		lblMotDePasse = new JLabel("Mot de passe:");
		lblMotDePasse.setBounds(212, 284, 78, 14);
		contentPane.add(lblMotDePasse);
		
		lblRue = new JLabel("Rue:");
		lblRue.setBounds(251, 187, 36, 14);
		contentPane.add(lblRue);
		
		lblVille = new JLabel("Ville:");
		lblVille.setBounds(258, 209, 26, 14);
		contentPane.add(lblVille);
		
		lblTel = new JLabel("Tel:");
		lblTel.setBounds(258, 234, 26, 14);
		contentPane.add(lblTel);
		
		txtNom = new JTextField();
		txtNom.setBounds(310, 131, 143, 20);
		contentPane.add(txtNom);
		txtNom.setColumns(10);
		
		txtPrenom = new JTextField();
		txtPrenom.setColumns(10);
		txtPrenom.setBounds(310, 159, 143, 20);
		contentPane.add(txtPrenom);
		
		txtRue = new JTextField();
		txtRue.setColumns(10);
		txtRue.setBounds(310, 184, 143, 20);
		contentPane.add(txtRue);
		
		txtVille = new JTextField();
		txtVille.setColumns(10);
		txtVille.setBounds(310, 206, 143, 20);
		contentPane.add(txtVille);
		
		txtTel = new JTextField();
		txtTel.setColumns(10);
		txtTel.setBounds(310, 231, 143, 20);
		contentPane.add(txtTel);
		
		txtLogin = new JTextField();
		txtLogin.setColumns(10);
		txtLogin.setBounds(310, 256, 143, 20);
		contentPane.add(txtLogin);
		
		txtMdp = new JTextField();
		txtMdp.setColumns(10);
		txtMdp.setBounds(310, 281, 143, 20);
		contentPane.add(txtMdp);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(310, 306, 143, 20);
		contentPane.add(txtEmail);
		
		btnValider = new JButton("Valider");
		btnValider.setBounds(483, 403, 113, 37);
		contentPane.add(btnValider);
		
		btnQuitter = new JButton("Quitter");
		btnQuitter.setBounds(606, 403, 113, 37);
		contentPane.add(btnQuitter);
	}
}
