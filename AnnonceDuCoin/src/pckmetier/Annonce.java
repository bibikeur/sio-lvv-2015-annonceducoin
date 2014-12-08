package pckmetier;

import java.util.ArrayList;

public class Annonce
{
	

	private String infoAnnonce;
	private String contactAnnonce;
	private String titreAnnonce;
	private int prixAnnonce;
	private String dateAnnonce;
	private ArrayList<Photo>lesPhotos;
	
	public String getInfoAnnonce()
	{
		return infoAnnonce;
	}
	
	public void setInfoAnnonce(String infoAnnonce)
	{
		this.infoAnnonce = infoAnnonce;
	}
	
	public String getContactAnnonce()
	{
		return contactAnnonce;
	}
	
	public void setContactAnnonce(String contactAnnonce)
	{
		this.contactAnnonce = contactAnnonce;
	}
	
	public String getTitreAnnonce()
	{
		return titreAnnonce;
	}
	
	public void setTitreAnnonce(String titreAnnonce)
	{
		this.titreAnnonce = titreAnnonce;
	}
	
	public int getPrixAnnonce()
	{
		return prixAnnonce;
	}
	
	public void setPrixAnnonce(int prixAnnonce)
	{
		this.prixAnnonce = prixAnnonce;
	}
	
	public String getDateAnnonce()
	{
		return dateAnnonce;
	}
	
	public void setDateAnnonce(String dateAnnonce)
	{
		this.dateAnnonce = dateAnnonce;
	}
	
	public ArrayList<Photo> getLesPhotos()
	{
		return lesPhotos;
	}
	
	public void setLesPhotos(ArrayList<Photo> lesPhotos)
	{
		this.lesPhotos = lesPhotos;
	}
	
	
	public String toString()
	{
		return "Annonce [infoAnnonce=" + infoAnnonce + ", contactAnnonce="
				+ contactAnnonce + ", titreAnnonce=" + titreAnnonce
				+ ", prixAnnonce=" + prixAnnonce + ", dateAnnonce="
				+ dateAnnonce + ", lesPhotos=" + lesPhotos + "]";
	}
	
}
