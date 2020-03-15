import java.util.ArrayList;

//Creating Book class inheriting from the publication
class Book extends Publication {
	
	//Declaring array to store author names
	private String[] authrName;
	
	//Declaring constructor
	public Book(String ID, String cName, int dwnlds, double cPrice,ArrayList<Comments> reviews, String publisher, int pages, String[] authrName) {
		
		super(ID, cName, dwnlds, cPrice,reviews,publisher,pages);
		this.authrName = authrName;
	}
	
	public Book(String ID, String cName, double cPrice, String publisher, int pages, String[] authrName) {
		
		super(ID, cName, cPrice,publisher, pages);
		this.authrName = authrName;
	}

	//Getter and setter method
	public void setAuthrname(String[] authrName) {
		
		this.authrName = authrName;
	}
	
	public String[] getAuthrname(){
		
		return this.authrName;
	}

}