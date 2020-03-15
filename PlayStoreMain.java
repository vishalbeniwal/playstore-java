import java.util.*;

public class PlayStoreMain {
	
	public static void main(String[] args) throws Exception  {
        
    	PlayStore store = new PlayStore();
            
  
    	String[] authors1 = {"L. Tolstoy"} ;
      
        Book b1 = new Book ("b1", "War and Peace", 12.55, "The Russian Messenger", 1225, authors1);
                
        String[] authors2 = {"F. Scott Fitzgerald"};
        
        Book b2 = new Book ("b2", "The great gatsby", 10, "Charles Scribner's Sons", 180, authors2);
       
              
        String[] authors3 = {"Thomas H. Cormen", "Charles E. Leiserson", "Ronald L. Rivest", "Clifford Stein"};
   
        
        Book b3 = new Book ("b3", "Introduction to algorithms", 100, "MIT Press", 1312, authors3);
              
        Magazine m1 = new Magazine("m1", "Forbes", 8.99, "Forbes Media", 50, 201904);
        
        //Adding content
        store.addContent(b1);
        store.addContent(b2);
        store.addContent(b3);
        store.addContent(m1);
        
        //Adding OSversion
        OS androidV4 = new OS("androidV4");
        OS iOSV10    = new OS("iOSV10");
        OS androidV3 = new OS("androidV3");
                
                
        Application g1 = new Application("g1", "Pokemon", 5.3, androidV4);    
        Application g2 = new Application("g2", "Pokemon", 5, iOSV10);
        Application app1 = new Application("app1", "Calendar", androidV3); 

        //Adding content        
        store.addContent(g1);
        store.addContent(g2);
        store.addContent(app1);
               
        
        User u1 = new User("u1", "John Doe", "0412000", 200);
        User u2 = new User("u2", "Mary Poppins", "0433191");  
        User u3 = new User("u3", "Dave Smith", "0413456", 1000);
        User u4 = new User("u4", "Jackie Chan", "0417654");
        User u5 = new User("u5", "Test User", "0468553351");
     
        
  
        
      //Adding new users
        store.addUser(u1);
        store.addUser(u2);
        store.addUser(u3);
        store.addUser(u4);
        store.addUser(u5);
        
        Comments comment1 = new Comments(u1, "This is a fantastic game!");
        g1.addReview(comment1);
                
        Comments comment2 = new Comments(u2, "I never liked this game!");
        g1.addReview(comment2);
                
        g1.addReview(new Comments(u3, "The game crashes frequently"));
 
        b1.addReview(new Comments(u2, "I love Tolstoy!"));

        //Purchasing content                       
        u1.buyContent(b1);
        u1.buyContent(b3);
        u1.buyContent(m1);
 

        u4.buyContent(g1);
        //Upgrading an user to premium
        u4.becomePremium();
        u4.buyContent(m1);


        u2.becomePremium();
        u2.buyContent(b1);
        u2.buyContent(g1);
    

        //Showing all the content of the store
        store.showContent();
        
        g1.showReviews();
        b1.showReviews();
        
        u4.showContentBought();
        u3.becomePremium();
        u3.buyContent(b2);
        
        //Creating new object of Scanner to take input from the user
		Scanner input = new Scanner(System.in);
  
        String selectionString = "" ;
        
        //Creating Do-while loop for the menu
        	 
        do {
        	
        	try {
        		
        		System.out.println(" \n+++++++++++ M E N U +++++++++++++ \n"); 
        		System.out.println("Please choose any of the following to get started\n" );	
        		System.out.println("(1) Upgrade an user to a premium member ");
        		System.out.println("(2) Purchase an item for a user ");
        		System.out.println("(3) Show all available content available in PlayStore ");
        		System.out.println("(4) Show all purchased items for a user");
        		System.out.println("(5) Show comments of a particular content");
        		System.out.println("(6) Display available fund for a user");
        		System.out.println("(0) Exit");
        	
        	 
        		selectionString = input.nextLine();
        	    //Converting user input from string to integer
        		int selection = Integer.parseInt(selectionString);
        		
        	 
        			if(selection == 1) { 
        		 
        				store.showUser();
        				
        				System.out.println("Please enter the user ID for which you need an upgrade");
        				String userId = input.nextLine();
        				
        				store.upgradeToPremium(userId); 
        				
        			}
        			else if(selection == 2) {
        		 
        				store.showUser();
        				
        				System.out.println("Please enter the user ID for which you need to buy a product");
        				String userID = input.nextLine();
        				
        				if(store.searchUsers(userID)) {
        					
        					store.showContentID();
            				
            				System.out.println("Please enter the item ID that you need to buy");
            				String contentID = input.nextLine();
            				
            				store.purchaseItem(contentID,userID);
        				}
        				
        				
        			} 
        			else if(selection == 3) {
        		 
        				store.showContent();
        				
        			}
        			else if(selection == 4) {
        		 
        				store.showUser();
        				
        				System.out.println("Please enter the user ID ");
        				String userId = input.nextLine();
        				
        				store.userProducts(userId);
        		
        			}
        			else if(selection == 5) {
        		 
        				store.showContentID();
        				
        				System.out.println("Please enter the content ID ");
        				String contentID = input.nextLine();
        				
        				store.contentReview(contentID);
        		 
        			}
        			else if(selection == 6) {
        				
        				store.showUser();
        		 
        				System.out.println("Please enter the user ID to get the fund ");
        				String userId = input.nextLine();
        				
        				store.userFund(userId);
        		 
        			}
        			else if(selection == 0) {
        				
        				System.out.println("Quiting the menu....");
        				break;
        		 
        			}
        			else if(selection < 0 || selection > 6) {
        		 
        				throw new NumberFormatException();
        	 
        			}
        	}
        	//To catch exceptions related to number format of the user input 
        	catch(NumberFormatException e) {
        	 
        		System.out.print("Invalid Input");
        		
        	}
        	//To catch other general exceptions
        	catch(Exception e) {
        	  
        	 System.out.println("Exception :- " + e.getMessage());
        	
        	}
        
        }while(true);
        
        //Closing input to avoid leakage
        input.close();
        
	}
	
}




