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
	
}
