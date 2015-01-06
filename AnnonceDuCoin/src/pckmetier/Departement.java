package pckmetier;

import java.util.ArrayList;

public class Departement
{
	private String nomDep;
	private ArrayList<Annonce> lesAnnonces;
	private Region laRegion;
	
	public Departement(String nomDep, Region laRegion)
	{
		//super();
		this.nomDep = nomDep;
		this.laRegion = laRegion;
		this.lesAnnonces = new ArrayList<Annonce>();
	}

	public String getNomDep()
	{
		return nomDep;
	}

	public void setNomDep(String nomDep)
	{
		this.nomDep = nomDep;
	}
	
	public void ajouterAnnonce (Annonce uneAnnonce)
	{
		this.lesAnnonces.add(uneAnnonce);
	}
	
}
