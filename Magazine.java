import java.util.ArrayList;

//Creating Magazine class inheriting from the publication
class Magazine extends Publication {
	
	private int volume ;
	
	//Declaring constructor
	public Magazine(String ID, String cName, int dwnlds, double cPrice,ArrayList<Comments> reviews, String publisher, int pages, int volume) {
		
		super(ID, cName, dwnlds, cPrice, reviews, publisher, pages);
		this.volume = volume ;
	}
	
	
	public Magazine(String ID, String cName, double cPrice, String publisher, int pages, int volume) {
		
		super(ID, cName, cPrice, publisher, pages);
		this.volume = volume;
	}

	//getter and setter methods
	public void setVol(int volume) {
		
		this.volume = volume;
	}
	
	
	public int getVolume() {
		
		return this.volume;
	}

}