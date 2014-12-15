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
	
	
	
	public String getContactAnnonce()
	{
		return contactAnnonce;
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
	
	
	public String toString()
	{
		return "Annonce [infoAnnonce=" + infoAnnonce + ", contactAnnonce="
				+ contactAnnonce + ", titreAnnonce=" + titreAnnonce
				+ ", prixAnnonce=" + prixAnnonce + ", dateAnnonce="
				+ dateAnnonce + ", lesPhotos=" + lesPhotos + "]";
	}
	
}
