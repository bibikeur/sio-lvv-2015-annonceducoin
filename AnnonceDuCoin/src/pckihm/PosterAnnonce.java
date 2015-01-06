package ihm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class PosterAnnonce extends JFrame {

	private JPanel contentPane;
	private JLabel lblPosterUneAnnonce;
	private JLabel lblTitre;
	private JLabel lblCategorie;
	private JComboBox comboBox;
	private JLabel lblDescriptif;
	private JTextField textField;
	private JLabel lblNewLabel;
	private JLabel lblVille;
	private JLabel lblRegion;
	private JLabel lblDpartement;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JTextField textField_1;
	private JTextField textField_2;

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
		lblTitre.setBounds(95, 283, 46, 14);
		contentPane.add(lblTitre);
		
		lblCategorie = new JLabel("Categorie:");
		lblCategorie.setBounds(77, 321, 77, 14);
		contentPane.add(lblCategorie);
		
		comboBox = new JComboBox();
		comboBox.setBounds(164, 317, 184, 22);
		contentPane.add(comboBox);
		
		lblDescriptif = new JLabel("Descriptif:");
		lblDescriptif.setBounds(77, 360, 64, 14);
		contentPane.add(lblDescriptif);
		
		textField = new JTextField();
		textField.setBounds(164, 360, 184, 120);
		contentPane.add(textField);
		textField.setColumns(10);
		
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
		lblDpartement.setBounds(50, 190, 68, 14);
		contentPane.add(lblDpartement);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(164, 161, 184, 22);
		contentPane.add(comboBox_1);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setBounds(164, 186, 184, 22);
		contentPane.add(comboBox_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(164, 215, 184, 23);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(164, 279, 184, 23);
		contentPane.add(textField_2);
	}
}
