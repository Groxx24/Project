package model;

import java.sql.Connection;
import java.util.ArrayList;

import dao.Database;

import dao.ProjectCine;
import dto.Event;


public class ProjectManagerCine {
	
	
	public ArrayList<Event> GetAllEventsCine()throws Exception {
		ArrayList<Event> alleventscine = null;
		try {
			    Database database= new Database();
			    Connection connection = database.Get_Connection();
				ProjectCine project= new ProjectCine();
				alleventscine=project.GetAllEventsCine(connection);
		
		} catch (Exception e) {
			throw e;
		}
		return alleventscine;
	}

}
