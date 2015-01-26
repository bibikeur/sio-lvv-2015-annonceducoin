package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MySqlConnection
{
	public static Connection  getConnection(String base, String util, String mdp)
	{
		Connection connect = null;
		try
		{
			connect = DriverManager.getConnection(base, util, mdp);
			
		} catch (SQLException e)
		{
			
			e.printStackTrace();
		}
		return connect;
	}

}
