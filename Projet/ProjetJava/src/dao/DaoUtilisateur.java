package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoUtilisateur 
{
	
	public static int getConnexion(String login, String mdp) 
	{
		
		String reqUtil;
		Connection connexion = null;
		Statement stLienBd;
		ResultSet resultat;
		int res;
		res = 0;
		
		reqUtil = "SELECT loginutilisateur, mdputilisateur, roleutilisateur FROM UTILISATEUR";
	
		
		try 
		{
			connexion = MySqlConnection.getConnection();
			stLienBd = connexion.createStatement();
			resultat = stLienBd.executeQuery(reqUtil);
			
			while(resultat.next() && res == 0)
			{
				if(resultat.getString("loginutilisateur").equals(login) && resultat.getString("mdputilisateur").equals(mdp))
				{
					res = 1;
					
					if(resultat.getString("roleutilisateur").equals("Professionnel"))
					{
						res= 2;
					}
				}
				
			}
		} 
		catch (SQLException e) 
		{
			System.out.println("Problème lors de la connexion à la base de donnée " + e.getMessage());
		}
		
		return res;	
	}
	
	public static int  getInscription(String nom, String prenom, String rue, String ville, String cp, String tel, String login, String mdp, String role)
	{
		
		String reqInscription;
		Connection connexion = null;
		Statement stLienBdInsert;
		int resultat;
		int res;
		res = 0;
		int test = 0;
		reqInscription = "INSERT INTO UTILISATEUR VALUES ('" + test + "','" + nom + "','"
					+ prenom + "','" + login + "','" + mdp + "','" + rue + "','" + cp + "','" + ville + "','" + tel 
					+ "','" + role + "')";
				
					
					
		
		
		try 
		{
			connexion = MySqlConnection.getConnection();
			stLienBdInsert = connexion.createStatement();
			resultat = stLienBdInsert.executeUpdate(reqInscription);
			
			if( resultat == 1)
			{
				res = resultat;
			}
						
		} 
		catch (SQLException e) 
		{
			System.out.println("Problème lors de la connexion à la base de donnée " + e.getMessage());
		}
		return res;
	}
}
