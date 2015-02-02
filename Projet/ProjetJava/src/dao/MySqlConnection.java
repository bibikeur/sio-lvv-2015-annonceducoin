package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MySqlConnection
{
	
	
	public static Connection  getConnection()
	{
		String nomPilote;
		nomPilote = "org.gjt.mm.mysql.Driver";
		final String url ="jdbc:mysql://localhost/anonceducoin";
		final String user = "root";
		final String mdp = "";
		Connection connect = null;
		try
		{
			Class.forName(nomPilote);
		} catch (ClassNotFoundException e)
		{
			// TODO Bloc catch généré automatiquement
			e.printStackTrace();
		}
		try
		{
			connect = DriverManager.getConnection(url, user, mdp);
			
		} catch (SQLException e)
		{
			
			e.printStackTrace();
		}
		return connect;
	}

}
