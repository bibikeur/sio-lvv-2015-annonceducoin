package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

import metier.Catalogue;
import pckihm.accueil;
import pckmetier.Region;

public class DaoRegion
{
	
	public static void main(String[] args) 
	{
        accueil f= new accueil();
        f.setBounds(20,20,350,300);
        f.setVisible(true);
        f.setTitle("Ergosum");

	}
	
	public static ArrayList<Region> getLesRegions()
	{
		
		String nomPilote;
		nomPilote = "org.gjt.mm.mysql.Driver";
		Connection connect;
		Statement lienBd;
		Statement lienNbJouets;
		ResultSet res;
		ResultSet nb;
		final String url ="jdbc:oracle:thin:@172.20.64.252:1521:xe";
		final String user = "root";
		final String mdp = "";
		ArrayList<Region> lesRegions;
		
	}
}
