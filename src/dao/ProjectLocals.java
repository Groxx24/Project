package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dto.Local;
//import dto.FeedObjects;


public class ProjectLocals {
	
	
	public ArrayList<Local> GetAllLocals(Connection connection) throws Exception
	{
		ArrayList<Local> AllLocals = new ArrayList<Local>();
		try
		{
			
			PreparedStatement ps = connection.prepareStatement("SELECT IDL,NAME,TYPE,LONGITUDE,LATITUDE FROM LOCALS");		
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				
				Local local = new Local();
				local.setId_local(rs.getString("IDL"));
				local.setName(rs.getString("NAME"));
				local.setType(rs.getString("TYPE"));
				local.setLon(rs.getString("LONGITUDE"));
				local.setLat(rs.getString("LATITUDE"));
				
				AllLocals.add(local);
			}
			return AllLocals;
		}
		catch(Exception e)
		{
			throw e;
		}
	}
	
}