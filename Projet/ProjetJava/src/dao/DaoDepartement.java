package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import pckmetier.Departement;
import pckmetier.Region;

public class DaoDepartement
{
	public static Vector<Departement> getLesDepartement(Region laRegion)
	{
		
		String nomPilote;
		nomPilote = "org.gjt.mm.mysql.Driver";
		Connection connect;
		Statement lienBd;
		ResultSet res;
		final String url ="jdbc:mysql://localhost/anonceducoin";
		final String user = "root";
		final String mdp = "";
		Vector<Departement> lesDepartements;
		String reqRegDep = "SELECT nomdepartement FROM DEPARTEMENT, REGION WHERE DEPARTEMENT.idregion = REGION.idregion AND nomregion = '";
		String nomRegion = laRegion.getNomRegion();
		reqRegDep = reqRegDep + nomRegion + "'";
		lesDepartements = new Vector<Departement>();
		Departement unDep;
		
		try
		{
			Class.forName(nomPilote);
		} catch (ClassNotFoundException e)
		{
			// TODO Bloc catch généré automatiquement
			e.printStackTrace();
		}
		
		connect = MySqlConnection.getConnection(url, user, mdp);
		
		try
		{
			lienBd = connect.createStatement();
			res = lienBd.executeQuery(reqRegDep);
			while (res.next())
			{
				unDep = new Departement(res.getString("NOMDEPARTEMENT"), laRegion);
				lesDepartements.add(unDep);
			}
			
		} catch (SQLException e)
		{
			// TODO Bloc catch généré automatiquement
			e.printStackTrace();
		}
		
		return lesDepartements;
	}
	
	public static Region rechercheRegion(Vector<Region> lesRegions, String nomReg)
	{
		Region uneReg = null;
		for(Region uneRegion : lesRegions)
		{
			if(uneRegion.getNomRegion().equals(nomReg))
			{
				uneReg = uneRegion;	
			}
		}
		return uneReg;
		
	}
	

}


