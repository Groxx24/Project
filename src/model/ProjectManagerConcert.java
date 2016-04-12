package model;

import java.sql.Connection;
import java.util.ArrayList;

import dao.Database;

import dao.ProjectConcert;
import dto.Event;


public class ProjectManagerConcert {
	
	
	public ArrayList<Event> GetAllEventsConcert()throws Exception {
		ArrayList<Event> alleventsdisco = null;
		try {
			    Database database= new Database();
			    Connection connection = database.Get_Connection();
				ProjectConcert project= new ProjectConcert();
				alleventsdisco=project.GetAllEventsConcert(connection);
		
		} catch (Exception e) {
			throw e;
		}
		return alleventsdisco;
	}

}
