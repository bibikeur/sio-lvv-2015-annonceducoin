package pckmetier;

import java.util.ArrayList;

public class SousCategorie
{
	private String nomSousCateg;
	private ArrayList<Annonce> lesAnnonces;
	
	

	public SousCategorie(String nomSousCateg)
	{
		super();
		this.nomSousCateg = nomSousCateg;
		this.lesAnnonces = new ArrayList<Annonce>();
	}

	public String getNomCateg()
	{
		return nomSousCateg;
	}


	public ArrayList<Annonce> getLesAnnonces()
	{
		return lesAnnonces;
	}


	
	public void ajouterAnnonce (Annonce uneAnnonce)
	{
		this.lesAnnonces.add(uneAnnonce);
	}

	@Override
	public String toString()
	{
		return  nomSousCateg;
	}
	
	
	
}
