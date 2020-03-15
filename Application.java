import java.util.ArrayList;

//Creating Application class inheriting from the content class
public class Application extends Content {

	//Object of OS type to store required OS
	private OS oSystem;
	
	//Declaring constructor
	public Application(String ID, String cName, int dwnlds, double cPrice,ArrayList<Comments> reviews, OS oSystem) {
		
		super.setID(ID);
		super.setName(cName);
		super.setDownloads(dwnlds);
		super.setPrice(cPrice);
		super.setComments(reviews);
		this.oSystem = oSystem;	
	}
	
	public Application(String ID, String cName, int dwnlds, double cPrice, OS osystem) {
		
		super.setID(ID);
		super.setName(cName);
		super.setPrice(cPrice);
		this.oSystem = osystem;
	}
	
	//Constructor for Application class if the application is free
	public Application(String ID, String cName, OS osystem) {
		
		super.setID(ID);
		super.setName(cName);
		this.oSystem = osystem;
	}
	
	public Application(String ID, String cName, double cPrice, OS osystem) {
		
		super.setID(ID);
		super.setName(cName);
		super.setPrice(cPrice);
		this.oSystem = osystem;
	}
		

	//Getter and Setter methods
	public OS getOS() {
	
		return this.oSystem;
	}
	
	public void setOS(OS os) {
		
		this.oSystem = os;
	}
	
}


