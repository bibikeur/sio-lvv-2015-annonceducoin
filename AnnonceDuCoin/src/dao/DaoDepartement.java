package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import pckmetier.Departement;

public class DaoDepartement
{
	public static Vector<Departement> getLesDepartement()
	{
		
		String nomPilote;
		nomPilote = "org.gjt.mm.mysql.Driver";
		Connection connect;
		Statement lienBd;
		Statement lienRegDep;
		ResultSet regDep;
		ResultSet res;
		final String url ="jdbc:mysql://localhost/anonceducoin";
		final String user = "root";
		final String mdp = "";
		Vector<Departement> lesDepartements;
		String listeDepartement;
		listeDepartement = "SELECT * FROM DEPARTEMENT";
		lesDepartements = new Vector<Departement>();
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
			res = lienBd.executeQuery(listeDepartement);
			
			while (res.next())
			{
				Departement leDepartement;
				String reqRegDep;
				reqRegDep = "SELECT DISTINCT NOMREGION FROM REGION, DEPARTEMENT WHERE REGION.IDREGION = DEPARTEMENT.IDREGION AND DEPARTEMENT.IDREGION =" + res.getInt("IDREGION");
				regDep = lienRegDep.executeQuery(reqRegDep);
				leDepartement = new Departement(res.getString("NOMDEPARTEMENT", ));
				lesDepartements.add(leDepartement);
			}
			
		} catch (SQLException e)
		{
			// TODO Bloc catch généré automatiquement
			e.printStackTrace();
		}
		
		return lesDepartements;
}
