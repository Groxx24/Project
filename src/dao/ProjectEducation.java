package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dto.Event;
//import dto.FeedObjects;


public class ProjectEducation {
	
	
	public ArrayList<Event> GetAllEventsEducation(Connection connection) throws Exception
	{
		ArrayList<Event> AllEventsEducation = new ArrayList<Event>();
		try
		{
			
			PreparedStatement ps = connection.prepareStatement("SELECT IDE,DESCRIPTION,TYPE,PRICE,MIN_AGE FROM EVENTS");		
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				
				Event event = new Event();
				event.setMinedad(rs.getInt("MIN_AGE"));
				event.setIdevent(rs.getString("IDE"));
				event.setDescription(rs.getString("DESCRIPTION"));
				event.setPrice(rs.getDouble("PRICE"));
				event.setType(rs.getString("TYPE"));
				//event.setFechahora(rs.getString("DATE"));
				
				AllEventsEducation.add(event);
			}
			return AllEventsEducation;
		}
		catch(Exception e)
		{
			throw e;
		}
	}
	
}
