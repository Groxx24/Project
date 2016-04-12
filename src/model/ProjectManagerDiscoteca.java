package model;

import java.sql.Connection;
import java.util.ArrayList;

import dao.Database;

import dao.ProjectDiscoteca;
import dto.Event;


public class ProjectManagerDiscoteca {
	
	
	public ArrayList<Event> GetAllEventsDiscoteca()throws Exception {
		ArrayList<Event> alleventsdisco = null;
		try {
			    Database database= new Database();
			    Connection connection = database.Get_Connection();
				ProjectDiscoteca project= new ProjectDiscoteca();
				alleventsdisco=project.GetAllEventsDiscoteca(connection);
		
		} catch (Exception e) {
			throw e;
		}
		return alleventsdisco;
	}

}
