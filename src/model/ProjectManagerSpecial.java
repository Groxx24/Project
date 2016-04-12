package model;

import java.sql.Connection;
import java.util.ArrayList;

import dao.Database;

import dao.ProjectSpecial;
import dto.Event;


public class ProjectManagerSpecial {
	
	
	public ArrayList<Event> GetAllEventsSpecial()throws Exception {
		ArrayList<Event> alleventsspecial = null;
		try {
			    Database database= new Database();
			    Connection connection = database.Get_Connection();
				ProjectSpecial project= new ProjectSpecial();
				alleventsspecial=project.GetAllEventsSpecial(connection);
		
		} catch (Exception e) {
			throw e;
		}
		return alleventsspecial;
	}

}
