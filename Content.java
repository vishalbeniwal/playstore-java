import java.util.ArrayList;


//Creating a abstract class
public abstract class Content {
	
	private String id;
	private String name;
	private int downloads;
	private double price;
	private ArrayList<Comments> reviews= new ArrayList<Comments>();
	
	
	//Getter and Setter methods to access private variables
	public String getID() {
		
		return this.id;
	}
	
	
	public void setID(String id) {
		
		this.id = id;
	}
	
	
	public String getName() {
		
		return this.name;
	}
	
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	
	public int getDownloads() {
		
		return this.downloads;
	}
	
	
	public void setDownloads(int downloads) {
		
		this.downloads = downloads;
	}
	
	
	public double getPrice() {
		
		return this.price;
	}
	
	
	public void setPrice(double price) {
		
		this.price = price;
	}
	
	
	
	public void setComments(ArrayList<Comments> reviews) {
		
		this.reviews = reviews;
	}
	
	
	public ArrayList<Comments> getComments() {
		
		return this.reviews;
	}
	
	//Add reviews to this content
	public void addReview(Comments C) {
		
		reviews.add(C);
	}
	
	//Show all the reviews of this content
	public void showReviews() {
		
		if(this.reviews.isEmpty()) {
			
			System.out.println("There are no reviews yet for this content");
		}
		else if(!this.reviews.isEmpty()) {
		
			System.out.println("\nReviews : ");
			System.out.println("---------------------------------------------- ");
			
			for(int i = 0; i < reviews.size(); i++) {
				
				System.out.print(reviews.get(i).getComment());
				System.out.println("\tBy " + reviews.get(i).getUser().getName());
			}
			
		System.out.println("------------------------------------------------- \n");
	}
	
  }

}







		


	
	