package pckmetier;

import java.util.ArrayList;

public class Departement
{
	private String nomDep;
	private ArrayList<Annonce> lesAnnonces;
	private ArrayList<Region> lesRegions;

	public Departement(String nomDep)
	{
		//super();
		this.nomDep = nomDep;
	}

	public String getNomDep()
	{
		return nomDep;
	}

	public void setNomDep(String nomDep)
	{
		this.nomDep = nomDep;
	}
	
	
	
}
