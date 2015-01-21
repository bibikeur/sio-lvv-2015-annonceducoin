package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import pckmetier.Categorie;
import pckmetier.SousCategorie;

public class DaoSousCategorie 
{
	public static Vector<SousCategorie> getLesDepartement(Categorie laCateg)
	{
		
		String nomPilote;
		nomPilote = "org.gjt.mm.mysql.Driver";
		Connection connect;
		Statement lienBd;
		ResultSet res;
		final String url ="jdbc:mysql://localhost/anonceducoin";
		final String user = "root";
		final String mdp = "";
		Vector<SousCategorie> lesSousCateg;
		String reqCategSousCat = "SELECT nomsouscategorie FROM SOUSCATEGORIE, CATEGORIE WHERE SOUSCATEGORIE.idcategorie = CATEGORIE.idcategorie AND nomcategorie = '";
		String nomCateg = laCateg.getNomCateg();
		reqCategSousCat = reqCategSousCat + nomCateg + "'";
		lesSousCateg = new Vector<SousCategorie>();
		SousCategorie uneSousCat;
		
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
			res = lienBd.executeQuery(reqCategSousCat);
			while (res.next())
			{
				uneSousCat = new SousCategorie(res.getString("NOMDEPARTEMENT"));
				lesSousCateg.add(uneSousCat);
			}
			
		} catch (SQLException e)
		{
			// TODO Bloc catch généré automatiquement
			e.printStackTrace();
		}
		
		return lesSousCateg;
	}
	
	public static Categorie rechercheCateg(Vector<Categorie> lesCateg, String nomCateg)
	{
		Categorie uneCat = null;
		for(Categorie uneCateg : lesCateg)
		{
			if(uneCateg.getNomCateg().equals(nomCateg))
			{
				uneCat = uneCateg;	
			}
		}
		return uneCat;
		
	}
}
