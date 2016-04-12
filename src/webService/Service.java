package webService;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import model.ProjectManagerCine;
import model.ProjectManagerConcert;
import model.ProjectManagerDiscoteca;
import model.ProjectManagerEducation;
import model.ProjectManagerLocals;
import model.ProjectManagerSpecial;

import com.google.gson.Gson;

import dto.Event;
import dto.Local;


@Path("/WebService")

public class Service {
	
	
	@GET
	@Path("/educacion")
	@Produces("application/json")
	public String eventseducation()
	{
		String alleventseducation  = null;
		
		try 
		{
			
			ArrayList<Event> AllEventsEducation = null;
			ProjectManagerEducation projectManager= new ProjectManagerEducation();
			
			AllEventsEducation = projectManager.GetAllEventsEducation();
			//StringBuffer sb = new StringBuffer();
			Gson gson = new Gson();
			System.out.println(gson.toJson(AllEventsEducation));
			alleventseducation = gson.toJson(AllEventsEducation);

		} catch (Exception e)
		{
			System.out.println("error");
		}
		return alleventseducation;
	}
	
	@GET
	@Path("/locales")
	@Produces("application/json")
	public String locals()
	{
		String alllocals  = null;
		try 
		{
			ArrayList<Local> AllLocals = null;
			ProjectManagerLocals projectManager= new ProjectManagerLocals();
			
			AllLocals = projectManager.GetAllLocals();
			//StringBuffer sb = new StringBuffer();
			Gson gson = new Gson();
			System.out.println(gson.toJson(AllLocals));
			alllocals = gson.toJson(AllLocals);

		} catch (Exception e)
		{
			System.out.println("error");
		}
		return alllocals;
	}
	
	@GET
	@Path("/cines")
	@Produces("application/json")
	public String eventscine()
	{
		String alleventscine  = null;
		try 
		{
			ArrayList<Event> AllEventsCine = null;
			ProjectManagerCine projectManager= new ProjectManagerCine();
			
			AllEventsCine = projectManager.GetAllEventsCine();
			//StringBuffer sb = new StringBuffer();
			Gson gson = new Gson();
			System.out.println(gson.toJson(AllEventsCine));
			alleventscine = gson.toJson(AllEventsCine);

		} catch (Exception e)
		{
			System.out.println("error");
		}
		return alleventscine;
	}
	
	

	@GET
	@Path("/conciertos")
	@Produces("application/json")
	public String eventsconcerts()
	{
		String alleventsconcert  = null;
		try 
		{
			ArrayList<Event> AllEventsConcert = null;
			ProjectManagerConcert projectManager= new ProjectManagerConcert();
			
			AllEventsConcert = projectManager.GetAllEventsConcert();
			//StringBuffer sb = new StringBuffer();
			Gson gson = new Gson();
			System.out.println(gson.toJson(AllEventsConcert));
			alleventsconcert = gson.toJson(AllEventsConcert);

		} catch (Exception e)
		{
			System.out.println("error");
		}
		return alleventsconcert;
	}
	@GET
	@Path("/discotecas")
	@Produces("application/json")
	public String eventsdiscoteca()
	{
		String alleventsdisco  = null;
		try 
		{
			ArrayList<Event> AllEventsDisco = null;
			ProjectManagerDiscoteca projectManager= new ProjectManagerDiscoteca();
			
			AllEventsDisco = projectManager.GetAllEventsDiscoteca();
			//StringBuffer sb = new StringBuffer();
			Gson gson = new Gson();
			System.out.println(gson.toJson(AllEventsDisco));
			alleventsdisco = gson.toJson(AllEventsDisco);

		} catch (Exception e)
		{
			System.out.println("error");
		}
		return alleventsdisco;
	}
	
	@GET
	@Path("/especiales")
	@Produces("application/json")
	public String eventsspecial()
	{
		String alleventsspecial  = null;
		try 
		{
			ArrayList<Event> AllEventsSpecial = null;
			ProjectManagerSpecial projectManager= new ProjectManagerSpecial();
			
			AllEventsSpecial = projectManager.GetAllEventsSpecial();
			//StringBuffer sb = new StringBuffer();
			Gson gson = new Gson();
			System.out.println(gson.toJson(AllEventsSpecial));
			alleventsspecial = gson.toJson(AllEventsSpecial);

		} catch (Exception e)
		{
			System.out.println("error");
		}
		return alleventsspecial;
	}

}
