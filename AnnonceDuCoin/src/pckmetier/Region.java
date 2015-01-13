package pckmetier;

import java.util.ArrayList;

public class Region
{
	private String nomRegion;
	private ArrayList<Departement> lesDepartements;
	
	
	public Region(String nomRegion)
	{
		//super();
		this.nomRegion = nomRegion;
		this.lesDepartements = new ArrayList<Departement>();
	}

	public String getNomRegion()
	{
		return nomRegion;
	}

	public void setNomRegion(String nomRegion)
	{
		this.nomRegion = nomRegion;
	}
	
	public void ajouterDepartement (Departement unDepartement)
	{
		this.lesDepartements.add(unDepartement);
	}

	@Override
	public String toString()
	{
		return  nomRegion;
	}
	
	
	
}
