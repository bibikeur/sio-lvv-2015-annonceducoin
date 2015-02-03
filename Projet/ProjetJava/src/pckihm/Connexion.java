package pckihm;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import dao.DaoUtilisateur;

public class Connexion extends JDialog implements ActionListener
{

	private JPanel contentPane;
	private JLabel lblConnexion;
	private JTextField txtLogin;
	private JLabel lblIdentifiant;
	private JLabel lblMotDePasse;
	private JButton btnConnexion;
	private JPasswordField txtMdp;
	private JButton btnAnnuler;

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
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 416, 239);
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
		btnConnexion.setBounds(211, 154, 109, 23);
		contentPane.add(btnConnexion);
		
		txtMdp = new JPasswordField();
		txtMdp.setBounds(133, 120, 130, 20);
		contentPane.add(txtMdp);
		
		btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(this);
		btnAnnuler.setBounds(78, 154, 91, 23);
		contentPane.add(btnAnnuler);
	}
	public void actionPerformed(ActionEvent evt)
	{
		if (evt.getSource() == btnConnexion )
       	 {
			JOptionPane.showMessageDialog(this, "Utilisateur" + DaoUtilisateur.getConnexion(txtLogin.getText(), txtMdp.getText()));
       	 }
		
		if (evt.getSource() == this.btnAnnuler )
		{
			this.dispose();
			
		}
	   
       
	}
}
