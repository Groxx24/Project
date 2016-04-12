package dto;

public class Event {

	private int minedad;
	private String idlocal;
	private String idevent;
	private String fechahora;
	private String type;
	private String description;
	private double price;
	
	
	public int getMinedad() {
		return minedad;
	}
	public void setMinedad(int minedad) {
		this.minedad = minedad;
	}
	public String getIdlocal() {
		return idlocal;
	}
	public void setIdlocal(String idlocal) {
		this.idlocal = idlocal;
	}
	public String getIdevent() {
		return idevent;
	}
	public void setIdevent(String idevent) {
		this.idevent = idevent;
	}
	public String getFechahora() {
		return fechahora;
	}
	public void setFechahora(String fechahora) {
		this.fechahora = fechahora;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
