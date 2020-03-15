
public class Comments {
	
	private User user;
	private String comment;
	
	//Declaring constructor for comment class
	public Comments(User user,String comment) {
	
		this.user=user;
		this.comment = comment;
	}
	
	
	public Comments(String comment) {
		
		this.comment = comment;
	}
	
	//Getter & setter methods
	public String getComment() {
		
		return this.comment;
	}
	
	
	public void setComment(String comment) {
		
		this.comment=comment;
	}
	
	
	public User getUser() {
		
		return this.user;
	}
	
}
