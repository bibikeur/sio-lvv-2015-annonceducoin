package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import pckmetier.Departement;
import pckmetier.Region;

public class DaoDepartement
{
	public static Vector<Departement> getLesDepartement(Region laRegion)
	{
		
		String nomPilote;
		nomPilote = "org.gjt.mm.mysql.Driver";
		Connection connect;
		Statement lienBd;
		Statement lienRegDep =
		null;
//		Statement lienRegion;
//		ResultSet regDep;
		ResultSet res;
		ResultSet resReg;
		final String url ="jdbc:mysql://localhost/anonceducoin";
		final String user = "root";
		final String mdp = "";
		Vector<Departement> lesDepartements;
		String listeDepartement;
		String listeRegion;
		listeDepartement = "SELECT * FROM DEPARTEMENT";
		listeRegion = "SELECT NOMREGION FROM REGION";
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
//			lienRegion = connect.createStatement();
			resReg = lienBd.executeQuery(listeRegion);
			while (res.next())
			{
				Departement leDepartement;
//				String reqRegDep;
//				Region laRegion1;
				
//				laRegion1 = new Region(res.getString("NOMREGION"));
//				
//				reqRegDep = "SELECT DISTINCT NOMREGION FROM REGION, DEPARTEMENT WHERE REGION.IDREGION = DEPARTEMENT.IDREGION AND DEPARTEMENT.IDREGION =" + res.getInt("IDREGION");
//				regDep = lienRegDep.executeQuery(reqRegDep);
				leDepartement = new Departement(res.getString("NOMDEPARTEMENT"), laRegion);
				lesDepartements.add(leDepartement);
			}
			
		} catch (SQLException e)
		{
			// TODO Bloc catch généré automatiquement
			e.printStackTrace();
		}
		
		return lesDepartements;
}
	}
