package pckmetier;

import java.util.ArrayList;

public class Annonce
{
	

	private String infoAnnonce;
	private String mail;
	private String Tel;
	private String titreAnnonce;
	private int prixAnnonce;
	private String dateAnnonce;
	private ArrayList<Photo>lesPhotos;
	private SousCategorie laSousCateg;
	private Departement leDepartement;
	
	
	
	public Annonce(String infoAnnonce, String mail, String tel,
			String titreAnnonce, int prixAnnonce, String dateAnnonce, 
			SousCategorie laSousCateg, Departement leDepartement)
	{
		super();
		this.infoAnnonce = infoAnnonce;
		this.mail = mail;
		this.Tel = tel;
		this.titreAnnonce = titreAnnonce;
		this.prixAnnonce = prixAnnonce;
		this.dateAnnonce = dateAnnonce;
		this.laSousCateg = laSousCateg;
		this.leDepartement = leDepartement;
		this.lesPhotos = new ArrayList<Photo>();
		this.leDepartement.ajouterAnnonce(this);
		
	}
	
	public Annonce(String infoAnnonce, String mail, String tel,
			String titreAnnonce, int prixAnnonce, String dateAnnonce)
	{
		super();
		this.infoAnnonce = infoAnnonce;
		this.mail = mail;
		this.Tel = tel;
		this.titreAnnonce = titreAnnonce;
		this.prixAnnonce = prixAnnonce;
		this.dateAnnonce = dateAnnonce;
		this.lesPhotos = new ArrayList<Photo>();
	}

	public String getInfoAnnonce()
	{
		return infoAnnonce;
	}
	
	public String getTitreAnnonce()
	{
		return titreAnnonce;
	}
	
	
	public int getPrixAnnonce()
	{
		return prixAnnonce;
	}
	
	
	public String getDateAnnonce()
	{
		return dateAnnonce;
	}
	
	
	public ArrayList<Photo> getLesPhotos()
	{
		return lesPhotos;
	}
	
	public ArrayList<Annonce> rechercheAnnonceRegion(Region uneRegion)
	{
		ArrayList<Annonce> annonceRegion;
		annonceRegion = new ArrayList<Annonce>();
		
		//for 
		
		return annonceRegion;
	}
	
	
}
