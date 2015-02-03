package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import pckmetier.Categorie;
import pckmetier.Region;

public class DaoCategorie
{
	public static Vector<Categorie> getLesCateg()
	{
		
		String nomPilote;
		nomPilote = "org.gjt.mm.mysql.Driver";
		Connection connect;
		Statement lienBd;
		ResultSet res;
		final String url ="jdbc:mysql://localhost/anonceducoin";
		final String user = "root";
		final String mdp = "";
		Vector<Categorie> lesCategories;
		String listeCateg;
		listeCateg = "SELECT NOMCATEGORIE FROM CATEGORIE";
		lesCategories = new Vector<Categorie>();
		try
		{
			Class.forName(nomPilote);
		} catch (ClassNotFoundException e)
		{
			// TODO Bloc catch généré automatiquement
			//e.printStackTrace();
		}
		
		connect = MySqlConnection.getConnection(url, user, mdp);
		
		try
		{
			lienBd = connect.createStatement();
			res = lienBd.executeQuery(listeCateg);
			
			while (res.next())
			{
				Categorie laCateg;
				
				laCateg = new Categorie(res.getString("NOMCATEGORIE"));
				lesCategories.add(laCateg);
			}
			
		} catch (SQLException e)
		{
			// TODO Bloc catch généré automatiquement
			e.printStackTrace();
		}
		
		return lesCategories;
	}
}
