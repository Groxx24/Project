package model;

import java.sql.Connection;
import java.util.ArrayList;

import dao.Database;

import dao.ProjectEducation;
import dto.Event;


public class ProjectManagerEducation {
	
	
	public ArrayList<Event> GetAllEventsEducation()throws Exception {
		ArrayList<Event> alleventseducation = null;
		try {
			    Database database= new Database();
			    Connection connection = database.Get_Connection();
				ProjectEducation project= new ProjectEducation();
				alleventseducation=project.GetAllEventsEducation(connection);
		
		} catch (Exception e) {
			throw e;
		}
		return alleventseducation;
	}

}
