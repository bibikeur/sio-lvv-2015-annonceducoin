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
	private ArrayList<Annonce>lesAnnonces;
	private Departement leDepartement;
	
	public String getNom()
	{
		return nom;
	}
	
	public void setNom(String nom)
	{
		this.nom = nom;
	}
	
	public String getPrenom()
	{
		return prenom;
	}
	
	public void setPrenom(String prenom)
	{
		this.prenom = prenom;
	}
	
	public String getLogin()
	{
		return login;
	}
	
	public void setLogin(String login)
	{
		this.login = login;
	}
	
	public String getMdp()
	{
		return mdp;
	}
	
	public void setMdp(String mdp)
	{
		this.mdp = mdp;
	}
	
	public String getRue()
	{
		return rue;
	}
	
	public void setRue(String rue)
	{
		this.rue = rue;
	}
	
	public String getCp()
	{
		return cp;
	}
	
	public void setCp(String cp)
	{
		this.cp = cp;
	}
	
	public String getVille()
	{
		return ville;
	}
	
	public void setVille(String ville)
	{
		this.ville = ville;
	}
	
	public String getTel()
	{
		return tel;
	}
	
	public void setTel(String tel)
	{
		this.tel = tel;
	}
	
	public String getMail()
	{
		return mail;
	}
	
	public void setMail(String mail)
	{
		this.mail = mail;
	}
	
	public String getRole()
	{
		return role;
	}
	
	public void setRole(String role)
	{
		this.role = role;
	}
	
	public ArrayList<Annonce> getLesAnnonces()
	{
		return lesAnnonces;
	}
	
	public void setLesAnnonces(ArrayList<Annonce> lesAnnonces)
	{
		this.lesAnnonces = lesAnnonces;
	}
	
	
}
