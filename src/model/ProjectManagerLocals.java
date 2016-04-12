package model;

import java.sql.Connection;
import java.util.ArrayList;

import dao.Database;

import dao.ProjectLocals;
import dto.Local;


public class ProjectManagerLocals {
	
	
	public ArrayList<Local> GetAllLocals()throws Exception {
		ArrayList<Local> alllocals = null;
		try {
			    Database database= new Database();
			    Connection connection = database.Get_Connection();
				ProjectLocals project= new ProjectLocals();
				alllocals=project.GetAllLocals(connection);
		
		} catch (Exception e) {
			throw e;
		}
		return alllocals;
	}

}
