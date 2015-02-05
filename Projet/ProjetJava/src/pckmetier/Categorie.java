package pckmetier;

import java.util.ArrayList;

public class Categorie
{
	private String nomCateg;
	private ArrayList<SousCategorie> lesSousCateg;
	
	public Categorie()
	{
	
	}
	
	public Categorie(String nomCateg)
	{
		super();
		this.nomCateg = nomCateg;
		this.lesSousCateg = new ArrayList<SousCategorie>();
	}

	public String getNomCateg()
	{
		return nomCateg;
	}

	public void setNomCateg(String nomSousCateg)
	{
		this.nomCateg = nomSousCateg;
	}

	@Override
	public String toString()
	{
		return  nomCateg;
	}
	
	public void ajouterSousCateg(SousCategorie uneSousCateg)
	{
		this.lesSousCateg.add(uneSousCateg);
	}
	
	
}
