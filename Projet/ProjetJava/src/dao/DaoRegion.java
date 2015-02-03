package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import pckihm.accueil;
import pckmetier.Region;

public class DaoRegion
{
	
	public static Vector<Region> getLesRegions()
	{
		
	
		Connection connect;
		Statement lienBd;
		ResultSet res;
		Vector<Region> lesRegions;
		String listeRegion;
		listeRegion = "SELECT NOMREGION FROM REGION ORDER BY NOMREGION";
		lesRegions = new Vector<Region>();
	
		
		connect = MySqlConnection.getConnection();
		
		try
		{
			lienBd = connect.createStatement();
			res = lienBd.executeQuery(listeRegion);
			
			while (res.next())
			{
				Region laRegion;
				
				laRegion = new Region(res.getString("NOMREGION"));
				lesRegions.add(laRegion);
			}
			
		} catch (SQLException e)
		{
			// TODO Bloc catch généré automatiquement
			e.printStackTrace();
		}
		
		return lesRegions;
	}
}
