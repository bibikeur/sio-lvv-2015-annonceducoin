package pckmetier;

import java.util.ArrayList;

public class SousCategorie
{
	private String nomCateg;
	private ArrayList<Annonce> lesAnnonces;
	
	

	public SousCategorie(String nomCateg)
	{
		super();
		this.nomCateg = nomCateg;
		this.lesAnnonces = new ArrayList<Annonce>();
	}

	public String getNomCateg()
	{
		return nomCateg;
	}


	public ArrayList<Annonce> getLesAnnonces()
	{
		return lesAnnonces;
	}


	
	public void ajouterAnnonce (Annonce uneAnnonce)
	{
		this.lesAnnonces.add(uneAnnonce);
	}
	
}
