//importing ArrayList
import java.util.ArrayList;
import java.util.Arrays;


public class PlayStore {
	
	private ArrayList<Content> contents;
	private ArrayList<User> users;
	private ArrayList<Comments> comments;
	
	public PlayStore() {
		
		//Initialize ArrayList to store content
		contents = new ArrayList<Content>();
		//Initialize ArrayList to user information
		users = new ArrayList<User>();
		
	}
	
	// Add the content to master content list
	public void addContent(Content content) {
		
		contents.add(content);
	}
	
	//Method to get the stored content in the main content list
	public ArrayList<Content> getContent() {
		
		return contents;
	}
	
	//Add the user to the master user list
	public void addUser(User user) {
		
		users.add(user);
	}
	
	//Method to get the stored users in the main content list
	public ArrayList<User> getUsers() {
		
		return users;
	}
	
	//Add the comments to the master Review list
	public void addReview(Comments userComment) {
	
		comments.add(userComment);
	}
	
	//Method to show the stored content of type Application
	public void showApplications() {
		
		for( int i = 0; i < contents.size(); i++ ) {
			
			if( contents.get(i) instanceof Application) {
				
				Application application = (Application) contents.get(i);
				
				System.out.println("\nContent #"+ i + "\nApplication details");
				System.out.println("------------------------- ");
				System.out.println("ID\t | " + contents.get(i).getID() );
				System.out.println("Name\t | " + contents.get(i).getName() );
				System.out.println("Price\t | " + contents.get(i).getPrice() );
				System.out.println("Downloads| " + contents.get(i).getDownloads() );
				System.out.println("OS\t | " + application.getOS().getOS() );
				System.out.println("------------------------- ");
	
			}
		}
	}
	
	
	//Method to show the stored content of type Books
	public void showBooks() {
		
		for( int i = 0; i < contents.size(); i++ ) {
			
			if( contents.get(i) instanceof Book ) {
				
				Book book = (Book) contents.get(i);
				Publication publisher = (Publication) contents.get(i);
				
				System.out.println("\nContent #"+ i + "\nBook details");
				System.out.println("------------------------- ");
				System.out.println("ID\t | " + contents.get(i).getID() );
				System.out.println("Name\t | " + contents.get(i).getName() );
				System.out.println("Price\t | " + contents.get(i).getPrice() );
				System.out.println("Publisher| " + publisher.getPublisher() );
				System.out.println("Pages\t | " + publisher.getPages() );
				System.out.println("Authors\t | " + Arrays.toString(book.getAuthrname()) );
				System.out.println("Downloads| " + contents.get(i).getDownloads() );
				System.out.println("------------------------- ");
				
			}	
		}
	}
	
	//Method to show the stored content of type Magazine
	public void showMagazines() {
		
		for( int i = 0; i < contents.size(); i++ ) {
			
			if( contents.get(i) instanceof Magazine ) {
				
				Magazine magazine = (Magazine) contents.get(i);
				
				System.out.println("\nContent #"+ i + "\nMagazine details");
				System.out.println("------------------------- ");
				System.out.println("ID\t | " + contents.get(i).getID() );
				System.out.println("Name\t | " + contents.get(i).getName() );
				System.out.println("Price\t | " + contents.get(i).getPrice() );
				System.out.println("Publisher| " + magazine.getPublisher() );
				System.out.println("Pages\t | " + magazine.getPages() );
				System.out.println("Downloads| " + contents.get(i).getDownloads() );
				System.out.println("------------------------- ");
	
			} 
		}
	}
	
	//Method to show all content by calling show method of every type of content.
	public void showContent() {
		
		showApplications();
		showBooks();
		showMagazines();
	
	}
	
	//Method to get and display the content id and name of every available content in PlayStore
	//Used for the menu
	public void showContentID() {
		
		System.out.println("\nThe list of available Content : ");
		System.out.println("------------------------- ");
		
		for( int i = 0; i < contents.size(); i++ ) {
			
			Content c = contents.get(i);
			System.out.println(c.getID() + "\t| " + c.getName() );
			System.out.println("-------------------------- ");
			
		}
	}
	
	//Method to get and display the user id and name of every available user in PlayStore
	//Used for the menu
	public void showUser() {
		
		System.out.println("\nThe list of available user : ");
		System.out.println("------------------------- ");
		
		for( int i = 0; i < users.size(); i++ ) {
			
			User u = users.get(i);
			System.out.println(u.getID() + "\t| " + u.getName() );
			System.out.println("-------------------------- ");
			
		}
	}
	
	//Method to search the content ArrayList to validate the whether the provided contentID is available in PlayStore or not
	public boolean searchContents(String contentID) {
		
		boolean search = false;
		
		for( int i = 0; i < contents.size(); i++ ) {
			
			if( contents.get(i).getID().equals(contentID) ) {
				
				search = true;
				break;
			}
		} 
		if(!search) { 
			
			System.out.println("Oops! Content ID not found. Try Again");
		}
		
		return search;
	}
	
	//Method to return the index of the content ArrayList if the provided contentID is available in PlayStore
	public int searchContentsIndex(String contentID) {
		//Flag
		int search = -1;
		
		for( int i = 0; i < contents.size(); i++ ) {
			
			if( contents.get(i).getID().equals(contentID) ) {
				
				search = i;
				break;
			}			
		} 
		if(search == -1) {
			
			System.out.println("Oops! Content ID not found. Try Again");
		}
		
		return search;
	}

	//Method to search the user ArrayList to validate the whether the provided userID is available in PlayStore or not
	public boolean searchUsers(String userId) {
		
		boolean search = false;
		
		for( int i = 0 ; i < users.size(); i++ ) {
			
			if( users.get(i).getID().equals(userId) ) {
				
				search = true;
				break;
			}
		}
		if(!search) {
			
			System.out.println("Oops! User ID not found. Try Again");
		}
		
		return search;
	}
	
	//Method to return the index of the user ArrayList if the provided userID is available in PlayStore
	public int searchUsersIndex(String userId) {
		//Flag
		int search = -1;
		
		for( int i = 0; i < users.size(); i++ ) {
			
			if( users.get(i).getID().equals(userId) ) {
				
				search = i;
				break;
			}
		
		}
		if(search == -1) {
			
			System.out.println("Oops! User ID not found. Try Again");
		}

		return search;
	}
	
	//Method to upgrade an user to premium using userID and becomePremium method of User Class
	//Used in menu
	public void upgradeToPremium(String userId) throws Exception {
    	
		//Checking whether the userID exists in PlayStore using seachUsers method
    	if(searchUsers(userId)) {
    
    		//If user exists
    		//Storing the index/key from the users ArrayList for that particular userID using searchUsersIndex method
    		int key = searchUsersIndex(userId);
    		User user= getUsers().get(key);
    		
    		user.becomePremium();
    		   	
    	} 
    }
	
	//Method to purchase an available item using buyContent method of User Class
	//Used in menu
    public void purchaseItem(String contentID, String userID) {
    	
    	if(searchContents(contentID)) {
    		
    		int key = searchContentsIndex(contentID);
    		Content content = getContent().get(key);
    		
    		if(searchUsers(userID)) {
       
        		int user_key = searchUsersIndex(userID);
        		User user= getUsers().get(user_key);
        		
                user.buyContent(content);
                
    		}
    	}                
    }
    
    //Method to show all the purchased product for a particular user using showContentBought method of User Class
    //Used in menu
    public void userProducts(String userId) {
    	
  
    	if(searchUsers(userId)) {
    
    		int key = searchUsersIndex(userId);
    		User user= getUsers().get(key);
    		
    		user.showContentBought();
    		
    	}
    }
    
    //Method to show all the Reviews made on the content items using showReviews method of Content Class
    //Used in menu
    public void contentReview(String contentID) {
    	
		 if(searchContents(contentID)) {
			 
	 		int key = searchContentsIndex(contentID);
	 		Content content = getContent().get(key);
	 		
	 		content.showReviews();	 		
	    	
		 }
 	}

    //Method to display the available fund for a particular user
    //Used in menu
    public void userFund(String userId) {
    	
    	if(searchUsers(userId)) {
    		
    		int key = searchUsersIndex(userId);
    		User user= getUsers().get(key);
    		
    		System.out.println("The Available fund " + "for user is " + user.getID() + " " + user.getFunds());
  
    	}
    }	
}
	
		
	

	