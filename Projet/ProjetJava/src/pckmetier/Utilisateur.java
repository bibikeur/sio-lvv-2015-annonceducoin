package pckmetier;

import java.util.ArrayList;

public class Utilisateur
{
	private String nom;
	private String prenom;
	private String login;
	private String mdp;
	private String rue;
	private String cp;
	private String ville;
	private String tel;
	private String mail;
	private String role;
	//private int log;
	private ArrayList<Annonce>lesAnnonces;
	
	public Utilisateur(String nom, String prenom, String login, String mdp,
			String rue, String cp, String ville, String tel, String mail,
			String role)
	{
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.mdp = mdp;
		this.rue = rue;
		this.cp = cp;
		this.ville = ville;
		this.tel = tel;
		this.mail = mail;
		this.role = role;
		//this.log = log;
		this.lesAnnonces = new ArrayList<Annonce>();
	}



	public Utilisateur()
	{
	}



	@Override
	public String toString()
	{
		return "Utilisateur [nom=" + nom + ", prenom=" + prenom + ", login="
				+ login + ", mdp=" + mdp + ", rue=" + rue + ", cp=" + cp
				+ ", ville=" + ville + ", tel=" + tel + ", mail=" + mail
				+ ", role=" + role + ", lesAnnonces=" + lesAnnonces + "]";
	}



	public String getNom()
	{
		return nom;
	}
	
	public String getPrenom()
	{
		return prenom;
	}
	
	
	public String getLogin()
	{
		return login;
	}
	
	
	public String getMdp()
	{
		return mdp;
	}
	
	public String getRue()
	{
		return rue;
	}
	
	public String getCp()
	{
		return cp;
	}
	
	
	public String getVille()
	{
		return ville;
	}
	
	public String getTel()
	{
		return tel;
	}
	
	public String getMail()
	{
		return mail;
	}
	
	
	public String getRole()
	{
		return role;
	}
	
	public ArrayList<Annonce> getLesAnnonces()
	{
		return lesAnnonces;
	}
	
	public void jouterAnnonce(Annonce uneAnnonce)
	{
	this.lesAnnonces.add(uneAnnonce);
	}
	
}
