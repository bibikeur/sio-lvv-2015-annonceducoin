package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import oracle.sql.DATE;
import pckmetier.Annonce;
import pckmetier.Categorie;
import pckmetier.Departement;
import pckmetier.Region;
import pckmetier.SousCategorie;

public class DaoAnnonce
{
	public static Vector<Annonce> getLesAnnonces()
	{
		Vector<Annonce> lesAnnonces;
		String requete;
		Connection connexion = null;
		Statement stLienBd;
		ResultSet resultat;
		
		lesAnnonces = new Vector<Annonce>();
		
		requete = "SELECT * FROM ANNONCE, DEPARTEMENT, REGION, SOUSCATEGORIE, CATEGORIE,"
				+ " WHERE ANNONCE.IDDEPARTEMENT = DEPARTEMENT.IDDEPARTEMENT "
				+ "AND ANNONCE.IDSOUSCATEGORIE = SOUSCATEGORIE.IDSOUSCATEGORIE "
				+ "AND DEPARTEMENT.IDREGION = REGION.IDREGION"
				+ "AND SOUSCATEGORIE.IDCATEGORIE = CATEGORIE.IDCATEGORIE";
		
		
		try 
		{
			connexion = MySqlConnection.getConnection();
			stLienBd = connexion.createStatement();
			resultat = stLienBd.executeQuery(requete);
		
			while(resultat.next())
			{
				Annonce uneAnnonce;
				Departement unDepartement;
				Region uneRegion;
				SousCategorie uneSousCateg;
				Categorie uneCategorie;
				String date;
				
				date = ""+ resultat.getDate("DATEANNONCE");
				
				uneRegion = new Region(resultat.getString("NOMREGION"));
				unDepartement = new Departement(resultat.getString("NOMDEPARTEMENT"), uneRegion);
				uneSousCateg = new SousCategorie(resultat.getString("NOMSOUSCATEGORIE"));
				uneCategorie = new Categorie(resultat.getString("NOMCATEGORIE"));
				uneRegion.ajouterDepartement(unDepartement);
				uneCategorie.ajouterSousCateg(uneSousCateg);
				uneAnnonce = new Annonce(resultat.getString("DESCRIPTION"), resultat.getString("MAILANNONCE"), 
							resultat.getString("TELANNONCE"), resultat.getString("TITREANNONCE"), resultat.getInt("PRIXANNONCE"),
							date, uneSousCateg, unDepartement);
				uneSousCateg.ajouterAnnonce(uneAnnonce);
				unDepartement.ajouterAnnonce(uneAnnonce);
			}
		
		}
		catch(SQLException e)
		{
			System.out.println("Erreur");
		}
		
		return lesAnnonces;
	}
}
