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
		
		
		
		Connection connect;
		Statement lienBd;
		ResultSet res;
		Vector<Categorie> lesCategories;
		String listeCateg;
		listeCateg = "SELECT NOMCATEGORIE FROM CATEGORIE";
		lesCategories = new Vector<Categorie>();
	
		
		connect = MySqlConnection.getConnection();
		
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
