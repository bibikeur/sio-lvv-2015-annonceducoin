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
		
		String nomPilote;
		nomPilote = "org.gjt.mm.mysql.Driver";
		Connection connect;
		Statement lienBd;
		ResultSet res;
		final String url ="jdbc:mysql://localhost/anonceducoin";
		final String user = "root";
		final String mdp = "";
		Vector<Region> lesRegions;
		String listeRegion;
		listeRegion = "SELECT NOMREGION FROM REGION";
		lesRegions = new Vector<Region>();
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
